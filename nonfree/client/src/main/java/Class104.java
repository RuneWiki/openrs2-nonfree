import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public abstract class Class104 {

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "[F")
	public static final float[] aFloatArray8 = new float[16384];

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[16384];

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!us;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_2;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Z")
	private boolean aBoolean161;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "Lclient!pp;")
	private Class5_Sub1_Sub3 aClass5_Sub1_Sub3_2;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "Lclient!nj;")
	private Class5_Sub1_Sub2 aClass5_Sub1_Sub2_2;

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "Lclient!tga;")
	private final Class335 aClass335_17;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray8[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray7[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V")
	protected Class104(@OriginalArg(0) int arg0) {
		if (!Static374.method6479("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray13 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass335_17 = new Class335(8);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lclient!ui;")
	private Class5_Sub1 method2083() throws IOException {
		if (this.aBoolean163) {
			throw new IllegalStateException();
		} else if (this.aBoolean161) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method2088(this.aByteArray13);
				if (local23 == -1) {
					this.aBoolean161 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray13, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(197) Class5_Sub1 local197 = (Class5_Sub1) this.aClass335_17.method7766((long) local23);
				if (!local197.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local197;
			}
			@Pc(74) OggStreamState local74 = new OggStreamState(local23);
			if (!local74.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local74.packetPeek(this.anOggPacket2) == 1) {
				@Pc(118) Class5_Sub1 local118;
				if (this.aClass5_Sub1_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass5_Sub1_Sub3_2 = new Class5_Sub1_Sub3(local74);
					local118 = this.aClass5_Sub1_Sub3_2;
				} else if (this.aClass5_Sub1_Sub2_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass5_Sub1_Sub2_2 = new Class5_Sub1_Sub2(local74);
					local118 = this.aClass5_Sub1_Sub2_2;
				} else {
					@Pc(124) byte[] local124 = this.anOggPacket2.getData();
					@Pc(128) StringBuffer local128 = new StringBuffer();
					for (@Pc(130) int local130 = 1; local130 < local124.length && Character.isLetterOrDigit((char) local124[local130]); local130++) {
						local128.append((char) local124[local130]);
					}
					@Pc(153) String local153 = local128.toString();
					if (local153.equals("kate")) {
						local118 = new Class5_Sub1_Sub4(local74);
					} else {
						local118 = new Class5_Sub1_Sub1(local74);
					}
				}
				this.aClass335_17.method7770((long) local23, local118);
				return local118;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	private void method2084() {
		for (@Pc(7) Class5_Sub1 local7 = (Class5_Sub1) this.aClass335_17.method7768(); local7 != null; local7 = (Class5_Sub1) this.aClass335_17.method7777()) {
			if (this.aClass5_Sub1_Sub3_2 != local7) {
				while (local7.anOggStreamState5.packetOut() == 1) {
					local7.method8221(this.anOggPacket2);
				}
			}
		}
		if (this.aClass5_Sub1_Sub3_2 == null) {
			return;
		}
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			if (!this.method2097()) {
				return;
			}
			if (this.aClass5_Sub1_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method2092();
				return;
			}
			this.aClass5_Sub1_Sub3_2.method8221(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	private void method2085() throws IOException {
		while (this.aClass5_Sub1_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class5_Sub1 local11 = this.method2083();
			if (local11 == null) {
				if (this.aBoolean161) {
					this.method2084();
				}
				return;
			}
			if (this.aClass5_Sub1_Sub4_2 == local11) {
				this.method2094();
			}
		}
		this.aClass5_Sub1_Sub3_2.method8221(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)D")
	public final double method2086() {
		if (this.aClass5_Sub1_Sub2_2 == null) {
			return this.aClass5_Sub1_Sub3_2 == null ? 0.0D : this.aClass5_Sub1_Sub3_2.method6767();
		} else {
			return this.aClass5_Sub1_Sub2_2.method5854();
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
	public final void method2087() throws IOException {
		if (this.aBoolean160) {
			return;
		}
		while (!this.aBoolean163) {
			@Pc(31) Class5_Sub1 local31;
			if (this.aBoolean162) {
				local31 = (Class5_Sub1) this.aClass335_17.method7766((long) this.anOggPage2.getSerialNumber());
			} else {
				local31 = this.method2083();
				if (local31 == null) {
					if (this.aBoolean161) {
						this.method2084();
					}
					return;
				}
				if (local31 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean162 = true;
			}
			if (local31 == this.aClass5_Sub1_Sub2_2) {
				if (this.aClass5_Sub1_Sub2_2.method5856() >= 50) {
					return;
				}
				while (this.aClass5_Sub1_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass5_Sub1_Sub2_2.method8221(this.anOggPacket2);
					this.method2094();
					if (this.aClass5_Sub1_Sub3_2 != null) {
						@Pc(153) double local153 = this.aClass5_Sub1_Sub3_2.method6767();
						for (@Pc(155) int local155 = 0; local155 < 10 && this.method2097(); local155++) {
							this.method2085();
							if (this.aBoolean163) {
								return;
							}
						}
						if (local153 < this.aClass5_Sub1_Sub3_2.method6767()) {
							return;
						}
					}
					if (this.aClass5_Sub1_Sub2_2.method5856() >= 50) {
						return;
					}
				}
			} else if (local31 instanceof Class5_Sub1_Sub4) {
				this.method2094();
			} else if (local31 != this.aClass5_Sub1_Sub3_2) {
				while (local31.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local31.anInt9874 == 1 && local31 instanceof Class5_Sub1_Sub4) {
						this.method2098(this.aString21);
					}
					local31.method8221(this.anOggPacket2);
				}
			} else if (this.aClass5_Sub1_Sub2_2 == null && !this.aBoolean160) {
				for (@Pc(76) int local76 = 0; local76 < 10 && this.method2097(); local76++) {
					this.method2085();
					if (this.aBoolean163) {
						return;
					}
				}
				return;
			}
			this.aBoolean162 = false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B[B)I")
	protected abstract int method2088(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)Lclient!nj;")
	public final Class5_Sub1_Sub2 method2090() {
		return this.aClass5_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)Z")
	public final boolean method2091() {
		if (this.aBoolean163 || this.aBoolean161) {
			return this.aClass5_Sub1_Sub2_2 == null || this.aClass5_Sub1_Sub2_2.method5856() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V")
	public final void method2092() {
		if (this.aBoolean163) {
			return;
		}
		for (@Pc(18) Class5_Sub1 local18 = (Class5_Sub1) this.aClass335_17.method7768(); local18 != null; local18 = (Class5_Sub1) this.aClass335_17.method7777()) {
			local18.method8219();
			local18.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "(I)Lclient!us;")
	public final Class5_Sub1_Sub4 method2093() {
		return this.aClass5_Sub1_Sub4_2;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
	private void method2094() {
		for (@Pc(5) Class5_Sub1 local5 = (Class5_Sub1) this.aClass335_17.method7768(); local5 != null; local5 = (Class5_Sub1) this.aClass335_17.method7777()) {
			if (local5 instanceof Class5_Sub1_Sub4) {
				@Pc(12) Class5_Sub1_Sub4 local12 = (Class5_Sub1_Sub4) local5;
				while ((local12.anInt9874 <= 8 || this.method2086() > (double) local12.method8228()) && local12.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local12.method8221(this.anOggPacket2);
				}
			}
		}
		this.method2098(this.aString21);
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)Lclient!pp;")
	public final Class5_Sub1_Sub3 method2096() {
		return this.aClass5_Sub1_Sub3_2;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)Z")
	private boolean method2097() {
		if (this.aClass5_Sub1_Sub2_2 == null) {
			@Pc(36) double local36 = (double) this.aClass5_Sub1_Sub3_2.method6770();
			return local36 == 0.0D || (double) Static124.method1947() >= 1000.0D / local36 + (double) this.aClass5_Sub1_Sub3_2.method6773();
		} else {
			return !this.aClass5_Sub1_Sub3_2.method6765() || this.method2086() > this.aClass5_Sub1_Sub3_2.method6767();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2098(@OriginalArg(0) String arg0) {
		this.aString21 = arg0;
		if (this.aString21 == null) {
			this.aClass5_Sub1_Sub4_2 = null;
			return;
		}
		if (this.aClass5_Sub1_Sub4_2 != null && !this.aString21.equals(this.aClass5_Sub1_Sub4_2.method8226())) {
			this.aClass5_Sub1_Sub4_2 = null;
		}
		if (this.aClass5_Sub1_Sub4_2 != null) {
			return;
		}
		for (@Pc(44) Class5_Sub1 local44 = (Class5_Sub1) this.aClass335_17.method7768(); local44 != null; local44 = (Class5_Sub1) this.aClass335_17.method7777()) {
			if (local44 instanceof Class5_Sub1_Sub4) {
				@Pc(51) Class5_Sub1_Sub4 local51 = (Class5_Sub1_Sub4) local44;
				if (this.aString21.equals(local51.method8226())) {
					this.aClass5_Sub1_Sub4_2 = local51;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZZ)V")
	public final void method2099(@OriginalArg(1) boolean arg0) {
		if (this.aClass5_Sub1_Sub2_2 != null) {
			@Pc(11) Class5_Sub14_Sub2 local11 = this.aClass5_Sub1_Sub2_2.method5853();
			if (local11 != null) {
				local11.method1690(arg0);
			}
		}
		this.aBoolean160 = !this.aBoolean160;
	}
}

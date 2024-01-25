import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public abstract class Class121 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Z")
	private boolean aBoolean302;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!tda;")
	private Class3_Sub19_Sub4 aClass3_Sub19_Sub4_2;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "Ljava/lang/String;")
	private String aString35;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "Lclient!dv;")
	private Class3_Sub19_Sub1 aClass3_Sub19_Sub1_2;

	@OriginalMember(owner = "client!gr", name = "A", descriptor = "Z")
	private boolean aBoolean305;

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "Lclient!iv;")
	private Class3_Sub19_Sub3 aClass3_Sub19_Sub3_2;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "Lclient!ee;")
	private final Class83 aClass83_10;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
	protected Class121(@OriginalArg(0) int arg0) {
		if (!Static379.method5472("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray37 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass83_10 = new Class83(8);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public final void method3601() throws IOException {
		if (this.aBoolean305) {
			return;
		}
		while (!this.aBoolean302) {
			@Pc(28) Class3_Sub19 local28;
			if (this.aBoolean304) {
				local28 = (Class3_Sub19) this.aClass83_10.method2368((long) this.anOggPage2.getSerialNumber());
			} else {
				local28 = this.method3616();
				if (local28 == null) {
					if (this.aBoolean303) {
						this.method3608();
					}
					return;
				}
				if (local28 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean304 = true;
			}
			if (local28 == this.aClass3_Sub19_Sub4_2) {
				if (this.aClass3_Sub19_Sub4_2.method8050() >= 50) {
					return;
				}
				while (this.aClass3_Sub19_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub19_Sub4_2.method8044(this.anOggPacket2);
					this.method3617();
					if (this.aClass3_Sub19_Sub1_2 != null) {
						@Pc(148) double local148 = this.aClass3_Sub19_Sub1_2.method2254();
						for (@Pc(150) int local150 = 0; local150 < 10 && this.method3610(); local150++) {
							this.method3612();
							if (this.aBoolean302) {
								return;
							}
						}
						if (local148 < this.aClass3_Sub19_Sub1_2.method2254()) {
							return;
						}
					}
					if (this.aClass3_Sub19_Sub4_2.method8050() >= 50) {
						return;
					}
				}
			} else if (local28 instanceof Class3_Sub19_Sub3) {
				this.method3617();
			} else if (this.aClass3_Sub19_Sub1_2 != local28) {
				while (local28.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local28.anInt9195 == 1 && local28 instanceof Class3_Sub19_Sub3) {
						this.method3614(this.aString35);
					}
					local28.method8044(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub19_Sub4_2 == null && !this.aBoolean305) {
				for (@Pc(73) int local73 = 0; local73 < 10 && this.method3610(); local73++) {
					this.method3612();
					if (this.aBoolean302) {
						return;
					}
				}
				return;
			}
			this.aBoolean304 = false;
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
	public final void method3602() {
		if (this.aBoolean302) {
			return;
		}
		for (@Pc(15) Class3_Sub19 local15 = (Class3_Sub19) this.aClass83_10.method2375(); local15 != null; local15 = (Class3_Sub19) this.aClass83_10.method2370()) {
			local15.method8042();
			local15.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean302 = true;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)Z")
	public final boolean method3603() {
		if (this.aBoolean302 || this.aBoolean303) {
			return this.aClass3_Sub19_Sub4_2 == null || this.aClass3_Sub19_Sub4_2.method8050() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)Lclient!dv;")
	public final Class3_Sub19_Sub1 method3604() {
		return this.aClass3_Sub19_Sub1_2;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
	public final void method3605(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_Sub19_Sub4_2 != null) {
			@Pc(7) Class3_Sub1_Sub5 local7 = this.aClass3_Sub19_Sub4_2.method8045();
			if (local7 != null) {
				local7.method5796(arg0);
			}
		}
		this.aBoolean305 = !this.aBoolean305;
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)Lclient!iv;")
	public final Class3_Sub19_Sub3 method3606() {
		return this.aClass3_Sub19_Sub3_2;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([BB)I")
	protected abstract int method3607(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)V")
	private void method3608() {
		for (@Pc(16) Class3_Sub19 local16 = (Class3_Sub19) this.aClass83_10.method2375(); local16 != null; local16 = (Class3_Sub19) this.aClass83_10.method2370()) {
			if (this.aClass3_Sub19_Sub1_2 != local16) {
				while (local16.anOggStreamState5.packetOut() == 1) {
					local16.method8044(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub19_Sub1_2 == null) {
			return;
		}
		for (@Pc(48) int local48 = 0; local48 < 10; local48++) {
			if (!this.method3610()) {
				return;
			}
			if (this.aClass3_Sub19_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method3602();
				return;
			}
			this.aClass3_Sub19_Sub1_2.method8044(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)Lclient!tda;")
	public final Class3_Sub19_Sub4 method3609() {
		return this.aClass3_Sub19_Sub4_2;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Z")
	private boolean method3610() {
		if (this.aClass3_Sub19_Sub4_2 == null) {
			@Pc(18) double local18 = (double) this.aClass3_Sub19_Sub1_2.method2253();
			return local18 == 0.0D || (double) Static524.method7320() >= 1000.0D / local18 + (double) this.aClass3_Sub19_Sub1_2.method2258();
		} else {
			return !this.aClass3_Sub19_Sub1_2.method2256() || this.method3615() > this.aClass3_Sub19_Sub1_2.method2254();
		}
	}

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)V")
	private void method3612() throws IOException {
		while (this.aClass3_Sub19_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class3_Sub19 local11 = this.method3616();
			if (local11 == null) {
				if (this.aBoolean303) {
					this.method3608();
				}
				return;
			}
			if (local11 == this.aClass3_Sub19_Sub3_2) {
				this.method3617();
			}
		}
		this.aClass3_Sub19_Sub1_2.method8044(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method3614(@OriginalArg(0) String arg0) {
		this.aString35 = arg0;
		if (this.aString35 == null) {
			this.aClass3_Sub19_Sub3_2 = null;
			return;
		}
		if (this.aClass3_Sub19_Sub3_2 != null && !this.aString35.equals(this.aClass3_Sub19_Sub3_2.method4289())) {
			this.aClass3_Sub19_Sub3_2 = null;
		}
		if (this.aClass3_Sub19_Sub3_2 != null) {
			return;
		}
		for (@Pc(40) Class3_Sub19 local40 = (Class3_Sub19) this.aClass83_10.method2375(); local40 != null; local40 = (Class3_Sub19) this.aClass83_10.method2370()) {
			if (local40 instanceof Class3_Sub19_Sub3) {
				@Pc(48) Class3_Sub19_Sub3 local48 = (Class3_Sub19_Sub3) local40;
				if (this.aString35.equals(local48.method4289())) {
					this.aClass3_Sub19_Sub3_2 = local48;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "(I)D")
	public final double method3615() {
		if (this.aClass3_Sub19_Sub4_2 == null) {
			return this.aClass3_Sub19_Sub1_2 == null ? 0.0D : this.aClass3_Sub19_Sub1_2.method2254();
		} else {
			return this.aClass3_Sub19_Sub4_2.method8049();
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)Lclient!ld;")
	private Class3_Sub19 method3616() throws IOException {
		if (this.aBoolean302) {
			throw new IllegalStateException();
		} else if (this.aBoolean303) {
			return null;
		} else {
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				@Pc(23) int local23 = this.method3607(this.aByteArray37);
				if (local23 == -1) {
					this.aBoolean303 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray37, local23)) {
					throw new RuntimeException("");
				}
			}
			@Pc(71) int local71 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(83) Class3_Sub19 local83 = (Class3_Sub19) this.aClass83_10.method2368((long) local71);
				if (!local83.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local83;
			}
			@Pc(100) OggStreamState local100 = new OggStreamState(local71);
			if (!local100.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local100.packetPeek(this.anOggPacket2) == 1) {
				@Pc(144) Class3_Sub19 local144;
				if (this.aClass3_Sub19_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub19_Sub1_2 = new Class3_Sub19_Sub1(local100);
					local144 = this.aClass3_Sub19_Sub1_2;
				} else if (this.aClass3_Sub19_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub19_Sub4_2 = new Class3_Sub19_Sub4(local100);
					local144 = this.aClass3_Sub19_Sub4_2;
				} else {
					@Pc(150) byte[] local150 = this.anOggPacket2.getData();
					@Pc(154) StringBuffer local154 = new StringBuffer();
					for (@Pc(156) int local156 = 1; local156 < local150.length && Character.isLetterOrDigit((char) local150[local156]); local156++) {
						local154.append((char) local150[local156]);
					}
					@Pc(183) String local183 = local154.toString();
					if (local183.equals("kate")) {
						local144 = new Class3_Sub19_Sub3(local100);
					} else {
						local144 = new Class3_Sub19_Sub2(local100);
					}
				}
				this.aClass83_10.method2377((long) local71, local144);
				return local144;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "(I)V")
	private void method3617() {
		for (@Pc(7) Class3_Sub19 local7 = (Class3_Sub19) this.aClass83_10.method2375(); local7 != null; local7 = (Class3_Sub19) this.aClass83_10.method2370()) {
			if (local7 instanceof Class3_Sub19_Sub3) {
				@Pc(15) Class3_Sub19_Sub3 local15 = (Class3_Sub19_Sub3) local7;
				while ((local15.anInt9195 <= 8 || this.method3615() > (double) local15.method4287()) && local15.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local15.method8044(this.anOggPacket2);
				}
			}
		}
		this.method3614(this.aString35);
	}
}

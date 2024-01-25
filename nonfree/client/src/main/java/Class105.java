import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public abstract class Class105 {

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Lclient!as;")
	private Class4_Sub6_Sub1 aClass4_Sub6_Sub1_2;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "Lclient!fv;")
	private Class4_Sub6_Sub3 aClass4_Sub6_Sub3_2;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "Z")
	private boolean aBoolean194;

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "Lclient!qf;")
	private Class4_Sub6_Sub4 aClass4_Sub6_Sub4_2;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "[B")
	private final byte[] aByteArray35;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "Lclient!dj;")
	private final Class66 aClass66_13;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V")
	protected Class105(@OriginalArg(0) int arg0) {
		if (!Static678.method8984("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray35 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass66_13 = new Class66(8);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lclient!qf;")
	public final Class4_Sub6_Sub4 method2520() {
		return this.aClass4_Sub6_Sub4_2;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Z")
	private boolean method2521() {
		if (this.aClass4_Sub6_Sub4_2 == null) {
			@Pc(20) double local20 = (double) this.aClass4_Sub6_Sub3_2.method2857();
			return local20 == 0.0D || (double) Static429.method5935() >= (double) this.aClass4_Sub6_Sub3_2.method2860() + 1000.0D / local20;
		} else {
			return !this.aClass4_Sub6_Sub3_2.method2853() || this.method2524() > this.aClass4_Sub6_Sub3_2.method2859();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lclient!fv;")
	public final Class4_Sub6_Sub3 method2523() {
		return this.aClass4_Sub6_Sub3_2;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)D")
	public final double method2524() {
		if (this.aClass4_Sub6_Sub4_2 == null) {
			return this.aClass4_Sub6_Sub3_2 == null ? 0.0D : this.aClass4_Sub6_Sub3_2.method2859();
		} else {
			return this.aClass4_Sub6_Sub4_2.method6636();
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
	public final void method2525() {
		if (this.aBoolean193) {
			return;
		}
		for (@Pc(23) Class4_Sub6 local23 = (Class4_Sub6) this.aClass66_13.method1992(); local23 != null; local23 = (Class4_Sub6) this.aClass66_13.method1984()) {
			local23.method6631();
			local23.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
	private void method2526() {
		for (@Pc(11) Class4_Sub6 local11 = (Class4_Sub6) this.aClass66_13.method1992(); local11 != null; local11 = (Class4_Sub6) this.aClass66_13.method1984()) {
			if (this.aClass4_Sub6_Sub3_2 != local11) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method6632(this.anOggPacket2);
				}
			}
		}
		if (this.aClass4_Sub6_Sub3_2 == null) {
			return;
		}
		for (@Pc(47) int local47 = 0; local47 < 10; local47++) {
			if (!this.method2521()) {
				return;
			}
			if (this.aClass4_Sub6_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method2525();
				return;
			}
			this.aClass4_Sub6_Sub3_2.method6632(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
	public final void method2527(@OriginalArg(1) boolean arg0) {
		if (this.aClass4_Sub6_Sub4_2 != null) {
			@Pc(11) Class4_Sub3_Sub2 local11 = this.aClass4_Sub6_Sub4_2.method6640();
			if (local11 != null) {
				local11.method4225(arg0);
			}
		}
		this.aBoolean195 = !this.aBoolean195;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
	private void method2528() {
		for (@Pc(17) Class4_Sub6 local17 = (Class4_Sub6) this.aClass66_13.method1992(); local17 != null; local17 = (Class4_Sub6) this.aClass66_13.method1984()) {
			if (local17 instanceof Class4_Sub6_Sub1) {
				@Pc(25) Class4_Sub6_Sub1 local25 = (Class4_Sub6_Sub1) local17;
				while ((local25.anInt7625 <= 8 || this.method2524() > (double) local25.method560()) && local25.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local25.method6632(this.anOggPacket2);
				}
			}
		}
		this.method2532(this.aString23);
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
	public final void method2529() throws IOException {
		if (this.aBoolean195) {
			return;
		}
		while (!this.aBoolean193) {
			@Pc(31) Class4_Sub6 local31;
			if (this.aBoolean192) {
				local31 = (Class4_Sub6) this.aClass66_13.method1994((long) this.anOggPage2.getSerialNumber());
			} else {
				local31 = this.method2537();
				if (local31 == null) {
					if (this.aBoolean194) {
						this.method2526();
					}
					return;
				}
				if (local31 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean192 = true;
			}
			if (local31 == this.aClass4_Sub6_Sub4_2) {
				if (this.aClass4_Sub6_Sub4_2.method6638() >= 50) {
					return;
				}
				while (this.aClass4_Sub6_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass4_Sub6_Sub4_2.method6632(this.anOggPacket2);
					this.method2528();
					if (this.aClass4_Sub6_Sub3_2 != null) {
						@Pc(93) double local93 = this.aClass4_Sub6_Sub3_2.method2859();
						for (@Pc(95) int local95 = 0; local95 < 10 && this.method2521(); local95++) {
							this.method2535();
							if (this.aBoolean193) {
								return;
							}
						}
						if (this.aClass4_Sub6_Sub3_2.method2859() > local93) {
							return;
						}
					}
					if (this.aClass4_Sub6_Sub4_2.method6638() >= 50) {
						return;
					}
				}
			} else if (local31 instanceof Class4_Sub6_Sub1) {
				this.method2528();
			} else if (this.aClass4_Sub6_Sub3_2 != local31) {
				while (local31.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local31.anInt7625 == 1 && local31 instanceof Class4_Sub6_Sub1) {
						this.method2532(this.aString23);
					}
					local31.method6632(this.anOggPacket2);
				}
			} else if (this.aClass4_Sub6_Sub4_2 == null && !this.aBoolean195) {
				for (@Pc(154) int local154 = 0; local154 < 10 && this.method2521(); local154++) {
					this.method2535();
					if (this.aBoolean193) {
						return;
					}
				}
				return;
			}
			this.aBoolean192 = false;
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)Lclient!as;")
	public final Class4_Sub6_Sub1 method2531() {
		return this.aClass4_Sub6_Sub1_2;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2532(@OriginalArg(0) String arg0) {
		this.aString23 = arg0;
		if (this.aString23 == null) {
			this.aClass4_Sub6_Sub1_2 = null;
			return;
		}
		if (this.aClass4_Sub6_Sub1_2 != null && !this.aString23.equals(this.aClass4_Sub6_Sub1_2.method559())) {
			this.aClass4_Sub6_Sub1_2 = null;
		}
		if (this.aClass4_Sub6_Sub1_2 != null) {
			return;
		}
		for (@Pc(44) Class4_Sub6 local44 = (Class4_Sub6) this.aClass66_13.method1992(); local44 != null; local44 = (Class4_Sub6) this.aClass66_13.method1984()) {
			if (local44 instanceof Class4_Sub6_Sub1) {
				@Pc(52) Class4_Sub6_Sub1 local52 = (Class4_Sub6_Sub1) local44;
				if (this.aString23.equals(local52.method559())) {
					this.aClass4_Sub6_Sub1_2 = local52;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B[B)I")
	protected abstract int method2533(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)Z")
	public final boolean method2534() {
		if (this.aBoolean193 || this.aBoolean194) {
			return this.aClass4_Sub6_Sub4_2 == null || this.aClass4_Sub6_Sub4_2.method6638() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V")
	private void method2535() throws IOException {
		while (this.aClass4_Sub6_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(18) Class4_Sub6 local18 = this.method2537();
			if (local18 == null) {
				if (this.aBoolean194) {
					this.method2526();
				}
				return;
			}
			if (this.aClass4_Sub6_Sub1_2 == local18) {
				this.method2528();
			}
		}
		this.aClass4_Sub6_Sub3_2.method6632(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)Lclient!hi;")
	private Class4_Sub6 method2537() throws IOException {
		if (this.aBoolean193) {
			throw new IllegalStateException();
		} else if (this.aBoolean194) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method2533(this.aByteArray35);
				if (local23 == -1) {
					this.aBoolean194 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray35, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(201) Class4_Sub6 local201 = (Class4_Sub6) this.aClass66_13.method1994((long) local23);
				if (!local201.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local201;
			}
			@Pc(74) OggStreamState local74 = new OggStreamState(local23);
			if (!local74.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local74.packetPeek(this.anOggPacket2) == 1) {
				@Pc(109) Class4_Sub6 local109;
				if (this.aClass4_Sub6_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass4_Sub6_Sub3_2 = new Class4_Sub6_Sub3(local74);
					local109 = this.aClass4_Sub6_Sub3_2;
				} else if (this.aClass4_Sub6_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass4_Sub6_Sub4_2 = new Class4_Sub6_Sub4(local74);
					local109 = this.aClass4_Sub6_Sub4_2;
				} else {
					@Pc(122) byte[] local122 = this.anOggPacket2.getData();
					@Pc(126) StringBuffer local126 = new StringBuffer();
					for (@Pc(128) int local128 = 1; local122.length > local128 && Character.isLetterOrDigit((char) local122[local128]); local128++) {
						local126.append((char) local122[local128]);
					}
					@Pc(155) String local155 = local126.toString();
					if (local155.equals("kate")) {
						local109 = new Class4_Sub6_Sub1(local74);
					} else {
						local109 = new Class4_Sub6_Sub2(local74);
					}
				}
				this.aClass66_13.method1985(local109, (long) local23);
				return local109;
			} else {
				throw new IllegalStateException();
			}
		}
	}
}

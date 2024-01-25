import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public abstract class Class119 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "Lclient!gq;")
	private Class3_Sub6_Sub1 aClass3_Sub6_Sub1_2;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Z")
	private boolean aBoolean269;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "Lclient!wm;")
	private Class3_Sub6_Sub4 aClass3_Sub6_Sub4_2;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "Lclient!qb;")
	private Class3_Sub6_Sub2 aClass3_Sub6_Sub2_2;

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "Z")
	private boolean aBoolean270;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Z")
	private boolean aBoolean271;

	@OriginalMember(owner = "client!fv", name = "B", descriptor = "Z")
	private boolean aBoolean273;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "[B")
	private final byte[] aByteArray51;

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "Lclient!qp;")
	private final Class280 aClass280_20;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I)V")
	protected Class119(@OriginalArg(0) int arg0) {
		if (!Static522.method7730("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray51 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass280_20 = new Class280(8);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)Lclient!wm;")
	public final Class3_Sub6_Sub4 method3519() {
		return this.aClass3_Sub6_Sub4_2;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	private void method3520() {
		for (@Pc(11) Class3_Sub6 local11 = (Class3_Sub6) this.aClass280_20.method7110(); local11 != null; local11 = (Class3_Sub6) this.aClass280_20.method7108()) {
			if (local11 != this.aClass3_Sub6_Sub1_2) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method8688(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub6_Sub1_2 == null) {
			return;
		}
		for (@Pc(45) int local45 = 0; local45 < 10; local45++) {
			if (!this.method3534()) {
				return;
			}
			if (this.aClass3_Sub6_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method3526();
				return;
			}
			this.aClass3_Sub6_Sub1_2.method8688(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V")
	public final void method3521() throws IOException {
		if (this.aBoolean269) {
			return;
		}
		while (!this.aBoolean271) {
			@Pc(23) Class3_Sub6 local23;
			if (this.aBoolean273) {
				local23 = (Class3_Sub6) this.aClass280_20.method7107((long) this.anOggPage2.getSerialNumber());
			} else {
				local23 = this.method3530();
				if (local23 == null) {
					if (this.aBoolean270) {
						this.method3520();
					}
					return;
				}
				if (local23 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean273 = true;
			}
			if (local23 == this.aClass3_Sub6_Sub4_2) {
				if (this.aClass3_Sub6_Sub4_2.method8693() >= 50) {
					return;
				}
				while (this.aClass3_Sub6_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub6_Sub4_2.method8688(this.anOggPacket2);
					this.method3528();
					if (this.aClass3_Sub6_Sub1_2 != null) {
						@Pc(83) double local83 = this.aClass3_Sub6_Sub1_2.method3255();
						for (@Pc(85) int local85 = 0; local85 < 10 && this.method3534(); local85++) {
							this.method3525();
							if (this.aBoolean271) {
								return;
							}
						}
						if (this.aClass3_Sub6_Sub1_2.method3255() > local83) {
							return;
						}
					}
					if (this.aClass3_Sub6_Sub4_2.method8693() >= 50) {
						return;
					}
				}
			} else if (local23 instanceof Class3_Sub6_Sub2) {
				this.method3528();
			} else if (local23 != this.aClass3_Sub6_Sub1_2) {
				while (local23.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local23.anInt10134 == 1 && local23 instanceof Class3_Sub6_Sub2) {
						this.method3524(this.aString41);
					}
					local23.method8688(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub6_Sub4_2 == null && !this.aBoolean269) {
				for (@Pc(153) int local153 = 0; local153 < 10 && this.method3534(); local153++) {
					this.method3525();
					if (this.aBoolean271) {
						return;
					}
				}
				return;
			}
			this.aBoolean273 = false;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)D")
	public final double method3522() {
		if (this.aClass3_Sub6_Sub4_2 == null) {
			return this.aClass3_Sub6_Sub1_2 == null ? 0.0D : this.aClass3_Sub6_Sub1_2.method3255();
		} else {
			return this.aClass3_Sub6_Sub4_2.method8694();
		}
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)Lclient!qb;")
	public final Class3_Sub6_Sub2 method3523() {
		return this.aClass3_Sub6_Sub2_2;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3524(@OriginalArg(1) String arg0) {
		this.aString41 = arg0;
		if (this.aString41 == null) {
			this.aClass3_Sub6_Sub2_2 = null;
			return;
		}
		if (this.aClass3_Sub6_Sub2_2 != null && !this.aString41.equals(this.aClass3_Sub6_Sub2_2.method6945())) {
			this.aClass3_Sub6_Sub2_2 = null;
		}
		if (this.aClass3_Sub6_Sub2_2 != null) {
			return;
		}
		for (@Pc(40) Class3_Sub6 local40 = (Class3_Sub6) this.aClass280_20.method7110(); local40 != null; local40 = (Class3_Sub6) this.aClass280_20.method7108()) {
			if (local40 instanceof Class3_Sub6_Sub2) {
				@Pc(48) Class3_Sub6_Sub2 local48 = (Class3_Sub6_Sub2) local40;
				if (this.aString41.equals(local48.method6945())) {
					this.aClass3_Sub6_Sub2_2 = local48;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	private void method3525() throws IOException {
		while (this.aClass3_Sub6_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class3_Sub6 local11 = this.method3530();
			if (local11 == null) {
				if (this.aBoolean270) {
					this.method3520();
				}
				return;
			}
			if (local11 == this.aClass3_Sub6_Sub2_2) {
				this.method3528();
			}
		}
		this.aClass3_Sub6_Sub1_2.method8688(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)V")
	public final void method3526() {
		if (this.aBoolean271) {
			return;
		}
		for (@Pc(15) Class3_Sub6 local15 = (Class3_Sub6) this.aClass280_20.method7110(); local15 != null; local15 = (Class3_Sub6) this.aClass280_20.method7108()) {
			local15.method8689();
			local15.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean271 = true;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[B)I")
	protected abstract int method3527(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)V")
	private void method3528() {
		for (@Pc(7) Class3_Sub6 local7 = (Class3_Sub6) this.aClass280_20.method7110(); local7 != null; local7 = (Class3_Sub6) this.aClass280_20.method7108()) {
			if (local7 instanceof Class3_Sub6_Sub2) {
				@Pc(15) Class3_Sub6_Sub2 local15 = (Class3_Sub6_Sub2) local7;
				while ((local15.anInt10134 <= 8 || this.method3522() > (double) local15.method6947()) && local15.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local15.method8688(this.anOggPacket2);
				}
			}
		}
		this.method3524(this.aString41);
	}

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "(I)Lclient!bs;")
	private Class3_Sub6 method3530() throws IOException {
		if (this.aBoolean271) {
			throw new IllegalStateException();
		} else if (this.aBoolean270) {
			return null;
		} else {
			@Pc(29) int local29;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local29 = this.method3527(this.aByteArray51);
				if (local29 == -1) {
					this.aBoolean270 = true;
					return null;
				}
				if (local29 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray51, local29)) {
					throw new RuntimeException("");
				}
			}
			local29 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(200) Class3_Sub6 local200 = (Class3_Sub6) this.aClass280_20.method7107((long) local29);
				if (!local200.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local200;
			}
			@Pc(79) OggStreamState local79 = new OggStreamState(local29);
			if (!local79.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local79.packetPeek(this.anOggPacket2) == 1) {
				@Pc(114) Class3_Sub6 local114;
				if (this.aClass3_Sub6_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub6_Sub1_2 = new Class3_Sub6_Sub1(local79);
					local114 = this.aClass3_Sub6_Sub1_2;
				} else if (this.aClass3_Sub6_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub6_Sub4_2 = new Class3_Sub6_Sub4(local79);
					local114 = this.aClass3_Sub6_Sub4_2;
				} else {
					@Pc(138) byte[] local138 = this.anOggPacket2.getData();
					@Pc(142) StringBuffer local142 = new StringBuffer();
					for (@Pc(144) int local144 = 1; local144 < local138.length && Character.isLetterOrDigit((char) local138[local144]); local144++) {
						local142.append((char) local138[local144]);
					}
					@Pc(167) String local167 = local142.toString();
					if (local167.equals("kate")) {
						local114 = new Class3_Sub6_Sub2(local79);
					} else {
						local114 = new Class3_Sub6_Sub3(local79);
					}
				}
				this.aClass280_20.method7109(local114, (long) local29);
				return local114;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZ)V")
	public final void method3531(@OriginalArg(1) boolean arg0) {
		if (this.aClass3_Sub6_Sub4_2 != null) {
			@Pc(7) Class3_Sub7_Sub4 local7 = this.aClass3_Sub6_Sub4_2.method8695();
			if (local7 != null) {
				local7.method6832(arg0);
			}
		}
		this.aBoolean269 = !this.aBoolean269;
	}

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)Lclient!gq;")
	public final Class3_Sub6_Sub1 method3532() {
		return this.aClass3_Sub6_Sub1_2;
	}

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "(I)Z")
	public final boolean method3533() {
		if (this.aBoolean271 || this.aBoolean270) {
			return this.aClass3_Sub6_Sub4_2 == null || this.aClass3_Sub6_Sub4_2.method8693() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "(I)Z")
	private boolean method3534() {
		if (this.aClass3_Sub6_Sub4_2 == null) {
			@Pc(17) double local17 = (double) this.aClass3_Sub6_Sub1_2.method3254();
			return local17 == 0.0D || (double) Static374.method6036() >= (double) this.aClass3_Sub6_Sub1_2.method3260() + 1000.0D / local17;
		} else {
			return !this.aClass3_Sub6_Sub1_2.method3259() || this.method3522() > this.aClass3_Sub6_Sub1_2.method3255();
		}
	}
}

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public abstract class Class165 {

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "Z")
	private boolean aBoolean594;

	@OriginalMember(owner = "client!jfa", name = "n", descriptor = "Z")
	private boolean aBoolean595;

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "Lclient!ts;")
	private Class2_Sub5_Sub4 aClass2_Sub5_Sub4_2;

	@OriginalMember(owner = "client!jfa", name = "x", descriptor = "Lclient!naa;")
	private Class2_Sub5_Sub2 aClass2_Sub5_Sub2_2;

	@OriginalMember(owner = "client!jfa", name = "C", descriptor = "Z")
	private boolean aBoolean596;

	@OriginalMember(owner = "client!jfa", name = "D", descriptor = "Z")
	private boolean aBoolean597;

	@OriginalMember(owner = "client!jfa", name = "E", descriptor = "Lclient!jm;")
	private Class2_Sub5_Sub1 aClass2_Sub5_Sub1_2;

	@OriginalMember(owner = "client!jfa", name = "F", descriptor = "Ljava/lang/String;")
	private String aString92;

	@OriginalMember(owner = "client!jfa", name = "r", descriptor = "[B")
	private final byte[] aByteArray109;

	@OriginalMember(owner = "client!jfa", name = "j", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!jfa", name = "p", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!jfa", name = "H", descriptor = "Lclient!eq;")
	private final Class99 aClass99_61;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(I)V")
	protected Class165(@OriginalArg(0) int arg0) {
		if (!Static472.method7443("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray109 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass99_61 = new Class99(8);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
	private void method7047() {
		for (@Pc(17) Class2_Sub5 local17 = (Class2_Sub5) this.aClass99_61.method3060(); local17 != null; local17 = (Class2_Sub5) this.aClass99_61.method3058()) {
			if (local17 instanceof Class2_Sub5_Sub4) {
				@Pc(25) Class2_Sub5_Sub4 local25 = (Class2_Sub5_Sub4) local17;
				while ((local25.anInt9926 <= 8 || this.method7062() > (double) local25.method8264()) && local25.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local25.method8259(this.anOggPacket2);
				}
			}
		}
		this.method7052(this.aString92);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
	private void method7048() throws IOException {
		while (this.aClass2_Sub5_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class2_Sub5 local11 = this.method7064();
			if (local11 == null) {
				if (this.aBoolean595) {
					this.method7054();
				}
				return;
			}
			if (local11 == this.aClass2_Sub5_Sub4_2) {
				this.method7047();
			}
		}
		this.aClass2_Sub5_Sub2_2.method8259(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)Lclient!naa;")
	public final Class2_Sub5_Sub2 method7049() {
		return this.aClass2_Sub5_Sub2_2;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Z)Z")
	private boolean method7050() {
		if (this.aClass2_Sub5_Sub1_2 == null) {
			@Pc(36) double local36 = (double) this.aClass2_Sub5_Sub2_2.method6129();
			return local36 == 0.0D || (double) Static277.method5091() >= 1000.0D / local36 + (double) this.aClass2_Sub5_Sub2_2.method6131();
		} else {
			return !this.aClass2_Sub5_Sub2_2.method6128() || this.method7062() > this.aClass2_Sub5_Sub2_2.method6132();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
	public final void method7051() {
		if (this.aBoolean597) {
			return;
		}
		for (@Pc(15) Class2_Sub5 local15 = (Class2_Sub5) this.aClass99_61.method3060(); local15 != null; local15 = (Class2_Sub5) this.aClass99_61.method3058()) {
			local15.method8257();
			local15.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean597 = true;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method7052(@OriginalArg(1) String arg0) {
		this.aString92 = arg0;
		if (this.aString92 == null) {
			this.aClass2_Sub5_Sub4_2 = null;
			return;
		}
		if (this.aClass2_Sub5_Sub4_2 != null && !this.aString92.equals(this.aClass2_Sub5_Sub4_2.method8266())) {
			this.aClass2_Sub5_Sub4_2 = null;
		}
		if (this.aClass2_Sub5_Sub4_2 != null) {
			return;
		}
		for (@Pc(43) Class2_Sub5 local43 = (Class2_Sub5) this.aClass99_61.method3060(); local43 != null; local43 = (Class2_Sub5) this.aClass99_61.method3058()) {
			if (local43 instanceof Class2_Sub5_Sub4) {
				@Pc(51) Class2_Sub5_Sub4 local51 = (Class2_Sub5_Sub4) local43;
				if (this.aString92.equals(local51.method8266())) {
					this.aClass2_Sub5_Sub4_2 = local51;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)Z")
	public final boolean method7053() {
		if (this.aBoolean597 || this.aBoolean595) {
			return this.aClass2_Sub5_Sub1_2 == null || this.aClass2_Sub5_Sub1_2.method4932() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)V")
	private void method7054() {
		for (@Pc(11) Class2_Sub5 local11 = (Class2_Sub5) this.aClass99_61.method3060(); local11 != null; local11 = (Class2_Sub5) this.aClass99_61.method3058()) {
			if (local11 != this.aClass2_Sub5_Sub2_2) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method8259(this.anOggPacket2);
				}
			}
		}
		if (this.aClass2_Sub5_Sub2_2 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < 10; local53++) {
			if (!this.method7050()) {
				return;
			}
			if (this.aClass2_Sub5_Sub2_2.anOggStreamState5.packetOut() != 1) {
				this.method7051();
				return;
			}
			this.aClass2_Sub5_Sub2_2.method8259(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "(I)Lclient!jm;")
	public final Class2_Sub5_Sub1 method7055() {
		return this.aClass2_Sub5_Sub1_2;
	}

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)Lclient!ts;")
	public final Class2_Sub5_Sub4 method7056() {
		return this.aClass2_Sub5_Sub4_2;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BZ)V")
	public final void method7057(@OriginalArg(1) boolean arg0) {
		if (this.aClass2_Sub5_Sub1_2 != null) {
			@Pc(11) Class2_Sub8_Sub2 local11 = this.aClass2_Sub5_Sub1_2.method4934();
			if (local11 != null) {
				local11.method4486(arg0);
			}
		}
		this.aBoolean596 = !this.aBoolean596;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B[B)I")
	protected abstract int method7059(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "(I)V")
	public final void method7060() throws IOException {
		if (this.aBoolean596) {
			return;
		}
		while (!this.aBoolean597) {
			@Pc(20) Class2_Sub5 local20;
			if (this.aBoolean594) {
				local20 = (Class2_Sub5) this.aClass99_61.method3056((long) this.anOggPage2.getSerialNumber());
			} else {
				local20 = this.method7064();
				if (local20 == null) {
					if (this.aBoolean595) {
						this.method7054();
					}
					return;
				}
				if (local20 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean594 = true;
			}
			if (this.aClass2_Sub5_Sub1_2 == local20) {
				if (this.aClass2_Sub5_Sub1_2.method4932() >= 50) {
					return;
				}
				while (this.aClass2_Sub5_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass2_Sub5_Sub1_2.method8259(this.anOggPacket2);
					this.method7047();
					if (this.aClass2_Sub5_Sub2_2 != null) {
						@Pc(80) double local80 = this.aClass2_Sub5_Sub2_2.method6132();
						for (@Pc(82) int local82 = 0; local82 < 10 && this.method7050(); local82++) {
							this.method7048();
							if (this.aBoolean597) {
								return;
							}
						}
						if (this.aClass2_Sub5_Sub2_2.method6132() > local80) {
							return;
						}
					}
					if (this.aClass2_Sub5_Sub1_2.method4932() >= 50) {
						return;
					}
				}
			} else if (local20 instanceof Class2_Sub5_Sub4) {
				this.method7047();
			} else if (local20 != this.aClass2_Sub5_Sub2_2) {
				while (local20.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local20.anInt9926 == 1 && local20 instanceof Class2_Sub5_Sub4) {
						this.method7052(this.aString92);
					}
					local20.method8259(this.anOggPacket2);
				}
			} else if (this.aClass2_Sub5_Sub1_2 == null && !this.aBoolean596) {
				for (@Pc(143) int local143 = 0; local143 < 10 && this.method7050(); local143++) {
					this.method7048();
					if (this.aBoolean597) {
						return;
					}
				}
				return;
			}
			this.aBoolean594 = false;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "(I)D")
	public final double method7062() {
		if (this.aClass2_Sub5_Sub1_2 == null) {
			return this.aClass2_Sub5_Sub2_2 == null ? 0.0D : this.aClass2_Sub5_Sub2_2.method6132();
		} else {
			return this.aClass2_Sub5_Sub1_2.method4936();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "(I)Lclient!au;")
	private Class2_Sub5 method7064() throws IOException {
		if (this.aBoolean597) {
			throw new IllegalStateException();
		} else if (this.aBoolean595) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method7059(this.aByteArray109);
				if (local23 == -1) {
					this.aBoolean595 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray109, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(79) Class2_Sub5 local79 = (Class2_Sub5) this.aClass99_61.method3056((long) local23);
				if (!local79.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local79;
			}
			@Pc(96) OggStreamState local96 = new OggStreamState(local23);
			if (!local96.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local96.packetPeek(this.anOggPacket2) == 1) {
				@Pc(131) Class2_Sub5 local131;
				if (this.aClass2_Sub5_Sub2_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass2_Sub5_Sub2_2 = new Class2_Sub5_Sub2(local96);
					local131 = this.aClass2_Sub5_Sub2_2;
				} else if (this.aClass2_Sub5_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass2_Sub5_Sub1_2 = new Class2_Sub5_Sub1(local96);
					local131 = this.aClass2_Sub5_Sub1_2;
				} else {
					@Pc(155) byte[] local155 = this.anOggPacket2.getData();
					@Pc(159) StringBuffer local159 = new StringBuffer();
					for (@Pc(161) int local161 = 1; local155.length > local161 && Character.isLetterOrDigit((char) local155[local161]); local161++) {
						local159.append((char) local155[local161]);
					}
					@Pc(184) String local184 = local159.toString();
					if (local184.equals("kate")) {
						local131 = new Class2_Sub5_Sub4(local96);
					} else {
						local131 = new Class2_Sub5_Sub3(local96);
					}
				}
				this.aClass99_61.method3059((long) local23, local131);
				return local131;
			} else {
				throw new IllegalStateException();
			}
		}
	}
}

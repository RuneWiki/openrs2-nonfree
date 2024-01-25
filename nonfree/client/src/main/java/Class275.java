import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public abstract class Class275 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!rl;")
	private Class5_Sub14_Sub3 aClass5_Sub14_Sub3_2;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Z")
	private boolean aBoolean489;

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Lclient!ue;")
	private Class5_Sub14_Sub4 aClass5_Sub14_Sub4_2;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "Z")
	private boolean aBoolean490;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
	private boolean aBoolean491;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Z")
	private boolean aBoolean492;

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "Lclient!en;")
	private Class5_Sub14_Sub1 aClass5_Sub14_Sub1_2;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Ljava/lang/String;")
	private String aString84;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!qr;")
	private final Class306 aClass306_33;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
	protected Class275(@OriginalArg(0) int arg0) {
		if (!Static472.method6674("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray82 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass306_33 = new Class306(8);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method6310(@OriginalArg(0) String arg0) {
		this.aString84 = arg0;
		if (this.aString84 == null) {
			this.aClass5_Sub14_Sub1_2 = null;
			return;
		}
		if (this.aClass5_Sub14_Sub1_2 != null && !this.aString84.equals(this.aClass5_Sub14_Sub1_2.method1955())) {
			this.aClass5_Sub14_Sub1_2 = null;
		}
		if (this.aClass5_Sub14_Sub1_2 != null) {
			return;
		}
		for (@Pc(51) Class5_Sub14 local51 = (Class5_Sub14) this.aClass306_33.method6941(); local51 != null; local51 = (Class5_Sub14) this.aClass306_33.method6940()) {
			if (local51 instanceof Class5_Sub14_Sub1) {
				@Pc(61) Class5_Sub14_Sub1 local61 = (Class5_Sub14_Sub1) local51;
				if (this.aString84.equals(local61.method1955())) {
					this.aClass5_Sub14_Sub1_2 = local61;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	private void method6311() {
		for (@Pc(7) Class5_Sub14 local7 = (Class5_Sub14) this.aClass306_33.method6941(); local7 != null; local7 = (Class5_Sub14) this.aClass306_33.method6940()) {
			if (this.aClass5_Sub14_Sub4_2 != local7) {
				while (local7.anOggStreamState5.packetOut() == 1) {
					local7.method8228(this.anOggPacket2);
				}
			}
		}
		if (this.aClass5_Sub14_Sub4_2 == null) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < 10; local65++) {
			if (!this.method6320()) {
				return;
			}
			if (this.aClass5_Sub14_Sub4_2.anOggStreamState5.packetOut() != 1) {
				this.method6319();
				return;
			}
			this.aClass5_Sub14_Sub4_2.method8228(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Z")
	public final boolean method6312() {
		if (this.aBoolean489 || this.aBoolean490) {
			return this.aClass5_Sub14_Sub3_2 == null || this.aClass5_Sub14_Sub3_2.method7159() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B)I")
	protected abstract int method6313(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)Lclient!en;")
	public final Class5_Sub14_Sub1 method6315() {
		return this.aClass5_Sub14_Sub1_2;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZ)V")
	public final void method6316(@OriginalArg(0) boolean arg0) {
		if (this.aClass5_Sub14_Sub3_2 != null) {
			@Pc(19) Class5_Sub4_Sub5 local19 = this.aClass5_Sub14_Sub3_2.method7157();
			if (local19 != null) {
				local19.method4719(arg0);
			}
		}
		this.aBoolean491 = !this.aBoolean491;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	private void method6318() {
		for (@Pc(20) Class5_Sub14 local20 = (Class5_Sub14) this.aClass306_33.method6941(); local20 != null; local20 = (Class5_Sub14) this.aClass306_33.method6940()) {
			if (local20 instanceof Class5_Sub14_Sub1) {
				@Pc(30) Class5_Sub14_Sub1 local30 = (Class5_Sub14_Sub1) local20;
				while ((local30.anInt9655 <= 8 || this.method6326() > (double) local30.method1956()) && local30.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local30.method8228(this.anOggPacket2);
				}
			}
		}
		this.method6310(this.aString84);
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public final void method6319() {
		if (this.aBoolean489) {
			return;
		}
		for (@Pc(16) Class5_Sub14 local16 = (Class5_Sub14) this.aClass306_33.method6941(); local16 != null; local16 = (Class5_Sub14) this.aClass306_33.method6940()) {
			local16.method8231();
			local16.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean489 = true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
	private boolean method6320() {
		if (this.aClass5_Sub14_Sub3_2 == null) {
			@Pc(20) double local20 = (double) this.aClass5_Sub14_Sub4_2.method8240();
			return local20 == 0.0D || (double) Static480.method6763() >= 1000.0D / local20 + (double) this.aClass5_Sub14_Sub4_2.method8243();
		} else {
			return !this.aClass5_Sub14_Sub4_2.method8235() || this.method6326() > this.aClass5_Sub14_Sub4_2.method8239();
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Lclient!ue;")
	public final Class5_Sub14_Sub4 method6321() {
		return this.aClass5_Sub14_Sub4_2;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)Lclient!rl;")
	public final Class5_Sub14_Sub3 method6322() {
		return this.aClass5_Sub14_Sub3_2;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	private void method6323() throws IOException {
		while (this.aClass5_Sub14_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(18) Class5_Sub14 local18 = this.method6325();
			if (local18 == null) {
				if (this.aBoolean490) {
					this.method6311();
				}
				return;
			}
			if (this.aClass5_Sub14_Sub1_2 == local18) {
				this.method6318();
			}
		}
		this.aClass5_Sub14_Sub4_2.method8228(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
	public final void method6324() throws IOException {
		if (this.aBoolean491) {
			return;
		}
		while (!this.aBoolean489) {
			@Pc(32) Class5_Sub14 local32;
			if (this.aBoolean492) {
				local32 = (Class5_Sub14) this.aClass306_33.method6943((long) this.anOggPage2.getSerialNumber());
			} else {
				local32 = this.method6325();
				if (local32 == null) {
					if (this.aBoolean490) {
						this.method6311();
					}
					return;
				}
				if (local32 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean492 = true;
			}
			if (this.aClass5_Sub14_Sub3_2 == local32) {
				if (this.aClass5_Sub14_Sub3_2.method7159() >= 50) {
					return;
				}
				while (this.aClass5_Sub14_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass5_Sub14_Sub3_2.method8228(this.anOggPacket2);
					this.method6318();
					if (this.aClass5_Sub14_Sub4_2 != null) {
						@Pc(183) double local183 = this.aClass5_Sub14_Sub4_2.method8239();
						for (@Pc(185) int local185 = 0; local185 < 10 && this.method6320(); local185++) {
							this.method6323();
							if (this.aBoolean489) {
								return;
							}
						}
						if (local183 < this.aClass5_Sub14_Sub4_2.method8239()) {
							return;
						}
					}
					if (this.aClass5_Sub14_Sub3_2.method7159() >= 50) {
						return;
					}
				}
			} else if (local32 instanceof Class5_Sub14_Sub1) {
				this.method6318();
			} else if (this.aClass5_Sub14_Sub4_2 != local32) {
				while (local32.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local32.anInt9655 == 1 && local32 instanceof Class5_Sub14_Sub1) {
						this.method6310(this.aString84);
					}
					local32.method8228(this.anOggPacket2);
				}
			} else if (this.aClass5_Sub14_Sub3_2 == null && !this.aBoolean491) {
				for (@Pc(88) int local88 = 0; local88 < 10 && this.method6320(); local88++) {
					this.method6323();
					if (this.aBoolean489) {
						return;
					}
				}
				return;
			}
			this.aBoolean492 = false;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lclient!df;")
	private Class5_Sub14 method6325() throws IOException {
		if (this.aBoolean489) {
			throw new IllegalStateException();
		} else if (this.aBoolean490) {
			return null;
		} else {
			@Pc(31) int local31;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local31 = this.method6313(this.aByteArray82);
				if (local31 == -1) {
					this.aBoolean490 = true;
					return null;
				}
				if (local31 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray82, local31)) {
					throw new RuntimeException("");
				}
			}
			local31 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(215) Class5_Sub14 local215 = (Class5_Sub14) this.aClass306_33.method6943((long) local31);
				if (!local215.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local215;
			}
			@Pc(80) OggStreamState local80 = new OggStreamState(local31);
			if (!local80.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local80.packetPeek(this.anOggPacket2) == 1) {
				@Pc(169) Class5_Sub14 local169;
				if (this.aClass5_Sub14_Sub4_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass5_Sub14_Sub4_2 = new Class5_Sub14_Sub4(local80);
					local169 = this.aClass5_Sub14_Sub4_2;
				} else if (this.aClass5_Sub14_Sub3_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass5_Sub14_Sub3_2 = new Class5_Sub14_Sub3(local80);
					local169 = this.aClass5_Sub14_Sub3_2;
				} else {
					@Pc(125) byte[] local125 = this.anOggPacket2.getData();
					@Pc(129) StringBuffer local129 = new StringBuffer();
					for (@Pc(131) int local131 = 1; local131 < local125.length && Character.isLetterOrDigit((char) local125[local131]); local131++) {
						local129.append((char) local125[local131]);
					}
					@Pc(156) String local156 = local129.toString();
					if (local156.equals("kate")) {
						local169 = new Class5_Sub14_Sub1(local80);
					} else {
						local169 = new Class5_Sub14_Sub2(local80);
					}
				}
				this.aClass306_33.method6944(local169, (long) local31, -12002);
				return local169;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)D")
	public final double method6326() {
		if (this.aClass5_Sub14_Sub3_2 == null) {
			return this.aClass5_Sub14_Sub4_2 == null ? 0.0D : this.aClass5_Sub14_Sub4_2.method8239();
		} else {
			return this.aClass5_Sub14_Sub3_2.method7158();
		}
	}
}

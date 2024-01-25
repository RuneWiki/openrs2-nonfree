import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public abstract class Class204 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "Lclient!wk;")
	private Class6_Sub14_Sub4 aClass6_Sub14_Sub4_2;

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "Z")
	private boolean aBoolean509;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "Ljava/lang/String;")
	private String aString101;

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!lda", name = "t", descriptor = "Lclient!di;")
	private Class6_Sub14_Sub1 aClass6_Sub14_Sub1_2;

	@OriginalMember(owner = "client!lda", name = "u", descriptor = "Z")
	private boolean aBoolean511;

	@OriginalMember(owner = "client!lda", name = "D", descriptor = "Z")
	private boolean aBoolean512;

	@OriginalMember(owner = "client!lda", name = "G", descriptor = "Lclient!k;")
	private Class6_Sub14_Sub2 aClass6_Sub14_Sub2_2;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "[B")
	private final byte[] aByteArray84;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!lda", name = "F", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!lda", name = "s", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!lda", name = "C", descriptor = "Lclient!lk;")
	private final Class209 aClass209_44;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(I)V")
	protected Class204(@OriginalArg(0) int arg0) {
		if (!Static272.method4009("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray84 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass209_44 = new Class209(8);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	private void method6592() {
		for (@Pc(13) Class6_Sub14 local13 = (Class6_Sub14) this.aClass209_44.method5037(); local13 != null; local13 = (Class6_Sub14) this.aClass209_44.method5036()) {
			if (local13 instanceof Class6_Sub14_Sub4) {
				@Pc(21) Class6_Sub14_Sub4 local21 = (Class6_Sub14_Sub4) local13;
				while ((local21.anInt10676 <= 8 || this.method6594() > (double) local21.method9063()) && local21.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local21.method9062(this.anOggPacket2);
				}
			}
		}
		this.method6599(this.aString101);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Lclient!fr;")
	private Class6_Sub14 method6593() throws IOException {
		if (this.aBoolean512) {
			throw new IllegalStateException();
		} else if (this.aBoolean509) {
			return null;
		} else {
			@Pc(28) int local28;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local28 = this.method6603(this.aByteArray84);
				if (local28 == -1) {
					this.aBoolean509 = true;
					return null;
				}
				if (local28 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray84, local28)) {
					throw new RuntimeException("");
				}
			}
			local28 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(199) Class6_Sub14 local199 = (Class6_Sub14) this.aClass209_44.method5038((long) local28);
				if (!local199.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local199;
			}
			@Pc(74) OggStreamState local74 = new OggStreamState(local28);
			if (!local74.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local74.packetPeek(this.anOggPacket2) == 1) {
				@Pc(116) Class6_Sub14 local116;
				if (this.aClass6_Sub14_Sub2_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass6_Sub14_Sub2_2 = new Class6_Sub14_Sub2(local74);
					local116 = this.aClass6_Sub14_Sub2_2;
				} else if (this.aClass6_Sub14_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass6_Sub14_Sub1_2 = new Class6_Sub14_Sub1(local74);
					local116 = this.aClass6_Sub14_Sub1_2;
				} else {
					@Pc(122) byte[] local122 = this.anOggPacket2.getData();
					@Pc(126) StringBuffer local126 = new StringBuffer();
					for (@Pc(128) int local128 = 1; local122.length > local128 && Character.isLetterOrDigit((char) local122[local128]); local128++) {
						local126.append((char) local122[local128]);
					}
					@Pc(155) String local155 = local126.toString();
					if (local155.equals("kate")) {
						local116 = new Class6_Sub14_Sub4(local74);
					} else {
						local116 = new Class6_Sub14_Sub3(local74);
					}
				}
				this.aClass209_44.method5035((long) local28, local116);
				return local116;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)D")
	public final double method6594() {
		if (this.aClass6_Sub14_Sub1_2 == null) {
			return this.aClass6_Sub14_Sub2_2 == null ? 0.0D : this.aClass6_Sub14_Sub2_2.method4210();
		} else {
			return this.aClass6_Sub14_Sub1_2.method1704();
		}
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(B)Z")
	private boolean method6596() {
		if (this.aClass6_Sub14_Sub1_2 == null) {
			@Pc(20) double local20 = (double) this.aClass6_Sub14_Sub2_2.method4207();
			return local20 == 0.0D || (double) Static566.method7936() >= 1000.0D / local20 + (double) this.aClass6_Sub14_Sub2_2.method4211();
		} else {
			return !this.aClass6_Sub14_Sub2_2.method4209() || this.method6594() > this.aClass6_Sub14_Sub2_2.method4210();
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZB)V")
	public final void method6597(@OriginalArg(0) boolean arg0) {
		if (this.aClass6_Sub14_Sub1_2 != null) {
			@Pc(15) Class6_Sub8_Sub2 local15 = this.aClass6_Sub14_Sub1_2.method1703();
			if (local15 != null) {
				local15.method2078(arg0);
			}
		}
		this.aBoolean511 = !this.aBoolean511;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
	private void method6598() throws IOException {
		while (this.aClass6_Sub14_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(18) Class6_Sub14 local18 = this.method6593();
			if (local18 == null) {
				if (this.aBoolean509) {
					this.method6600();
				}
				return;
			}
			if (local18 == this.aClass6_Sub14_Sub4_2) {
				this.method6592();
			}
		}
		this.aClass6_Sub14_Sub2_2.method9062(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method6599(@OriginalArg(1) String arg0) {
		this.aString101 = arg0;
		if (this.aString101 == null) {
			this.aClass6_Sub14_Sub4_2 = null;
			return;
		}
		if (this.aClass6_Sub14_Sub4_2 != null && !this.aString101.equals(this.aClass6_Sub14_Sub4_2.method9065())) {
			this.aClass6_Sub14_Sub4_2 = null;
		}
		if (this.aClass6_Sub14_Sub4_2 != null) {
			return;
		}
		for (@Pc(38) Class6_Sub14 local38 = (Class6_Sub14) this.aClass209_44.method5037(); local38 != null; local38 = (Class6_Sub14) this.aClass209_44.method5036()) {
			if (local38 instanceof Class6_Sub14_Sub4) {
				@Pc(46) Class6_Sub14_Sub4 local46 = (Class6_Sub14_Sub4) local38;
				if (this.aString101.equals(local46.method9065())) {
					this.aClass6_Sub14_Sub4_2 = local46;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(Z)V")
	private void method6600() {
		for (@Pc(7) Class6_Sub14 local7 = (Class6_Sub14) this.aClass209_44.method5037(); local7 != null; local7 = (Class6_Sub14) this.aClass209_44.method5036()) {
			if (this.aClass6_Sub14_Sub2_2 != local7) {
				while (local7.anOggStreamState5.packetOut() == 1) {
					local7.method9062(this.anOggPacket2);
				}
			}
		}
		if (this.aClass6_Sub14_Sub2_2 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
			if (!this.method6596()) {
				return;
			}
			if (this.aClass6_Sub14_Sub2_2.anOggStreamState5.packetOut() != 1) {
				this.method6604();
				return;
			}
			this.aClass6_Sub14_Sub2_2.method9062(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "(B)V")
	public final void method6602() throws IOException {
		if (this.aBoolean511) {
			return;
		}
		while (!this.aBoolean512) {
			@Pc(28) Class6_Sub14 local28;
			if (this.aBoolean510) {
				local28 = (Class6_Sub14) this.aClass209_44.method5038((long) this.anOggPage2.getSerialNumber());
			} else {
				local28 = this.method6593();
				if (local28 == null) {
					if (this.aBoolean509) {
						this.method6600();
					}
					return;
				}
				if (local28 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean510 = true;
			}
			if (this.aClass6_Sub14_Sub1_2 == local28) {
				if (this.aClass6_Sub14_Sub1_2.method1702() >= 50) {
					return;
				}
				while (this.aClass6_Sub14_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass6_Sub14_Sub1_2.method9062(this.anOggPacket2);
					this.method6592();
					if (this.aClass6_Sub14_Sub2_2 != null) {
						@Pc(148) double local148 = this.aClass6_Sub14_Sub2_2.method4210();
						for (@Pc(150) int local150 = 0; local150 < 10 && this.method6596(); local150++) {
							this.method6598();
							if (this.aBoolean512) {
								return;
							}
						}
						if (this.aClass6_Sub14_Sub2_2.method4210() > local148) {
							return;
						}
					}
					if (this.aClass6_Sub14_Sub1_2.method1702() >= 50) {
						return;
					}
				}
			} else if (local28 instanceof Class6_Sub14_Sub4) {
				this.method6592();
			} else if (local28 != this.aClass6_Sub14_Sub2_2) {
				while (local28.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local28.anInt10676 == 1 && local28 instanceof Class6_Sub14_Sub4) {
						this.method6599(this.aString101);
					}
					local28.method9062(this.anOggPacket2);
				}
			} else if (this.aClass6_Sub14_Sub1_2 == null && !this.aBoolean511) {
				for (@Pc(76) int local76 = 0; local76 < 10 && this.method6596(); local76++) {
					this.method6598();
					if (this.aBoolean512) {
						return;
					}
				}
				return;
			}
			this.aBoolean510 = false;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "([BI)I")
	protected abstract int method6603(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "(B)V")
	public final void method6604() {
		if (this.aBoolean512) {
			return;
		}
		for (@Pc(24) Class6_Sub14 local24 = (Class6_Sub14) this.aClass209_44.method5037(); local24 != null; local24 = (Class6_Sub14) this.aClass209_44.method5036()) {
			local24.method9058();
			local24.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean512 = true;
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)Lclient!k;")
	public final Class6_Sub14_Sub2 method6606() {
		return this.aClass6_Sub14_Sub2_2;
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)Lclient!di;")
	public final Class6_Sub14_Sub1 method6607() {
		return this.aClass6_Sub14_Sub1_2;
	}

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "(I)Z")
	public final boolean method6608() {
		if (this.aBoolean512 || this.aBoolean509) {
			return this.aClass6_Sub14_Sub1_2 == null || this.aClass6_Sub14_Sub1_2.method1702() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "(I)Lclient!wk;")
	public final Class6_Sub14_Sub4 method6609() {
		return this.aClass6_Sub14_Sub4_2;
	}
}

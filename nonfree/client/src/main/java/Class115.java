import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public abstract class Class115 {

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "Lclient!via;")
	private Class6_Sub37_Sub3 aClass6_Sub37_Sub3_2;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!rda;")
	private Class6_Sub37_Sub1 aClass6_Sub37_Sub1_2;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
	private boolean aBoolean272;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!sga;")
	private Class6_Sub37_Sub2 aClass6_Sub37_Sub2_2;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Z")
	private boolean aBoolean276;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "Lclient!dfa;")
	private final Class74 aClass74_19;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
	protected Class115(@OriginalArg(0) int arg0) {
		if (!Static34.method446("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray23 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass74_19 = new Class74(8);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BZ)V")
	public final void method3241(@OriginalArg(1) boolean arg0) {
		if (this.aClass6_Sub37_Sub3_2 != null) {
			@Pc(7) Class6_Sub17_Sub5 local7 = this.aClass6_Sub37_Sub3_2.method8692();
			if (local7 != null) {
				local7.method8148(arg0);
			}
		}
		this.aBoolean275 = !this.aBoolean275;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Z")
	public final boolean method3242() {
		if (this.aBoolean274 || this.aBoolean276) {
			return this.aClass6_Sub37_Sub3_2 == null || this.aClass6_Sub37_Sub3_2.method8691() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Lclient!via;")
	public final Class6_Sub37_Sub3 method3243() {
		return this.aClass6_Sub37_Sub3_2;
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
	private void method3244() {
		for (@Pc(13) Class6_Sub37 local13 = (Class6_Sub37) this.aClass74_19.method1404(); local13 != null; local13 = (Class6_Sub37) this.aClass74_19.method1405()) {
			if (local13 instanceof Class6_Sub37_Sub2) {
				@Pc(23) Class6_Sub37_Sub2 local23 = (Class6_Sub37_Sub2) local13;
				while ((local23.anInt10248 <= 8 || this.method3248() > (double) local23.method7882()) && local23.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local23.method8840(this.anOggPacket2);
				}
			}
		}
		this.method3255(this.aString27);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Lclient!sga;")
	public final Class6_Sub37_Sub2 method3245() {
		return this.aClass6_Sub37_Sub2_2;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Z")
	private boolean method3246() {
		if (this.aClass6_Sub37_Sub3_2 == null) {
			@Pc(43) double local43 = (double) this.aClass6_Sub37_Sub1_2.method7490();
			return local43 == 0.0D || (double) Static549.method7758() >= (double) this.aClass6_Sub37_Sub1_2.method7486() + 1000.0D / local43;
		} else {
			return !this.aClass6_Sub37_Sub1_2.method7484() || this.method3248() > this.aClass6_Sub37_Sub1_2.method7483();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	private void method3247() throws IOException {
		while (this.aClass6_Sub37_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(16) Class6_Sub37 local16 = this.method3252();
			if (local16 == null) {
				if (this.aBoolean276) {
					this.method3251();
				}
				return;
			}
			if (local16 == this.aClass6_Sub37_Sub2_2) {
				this.method3244();
			}
		}
		this.aClass6_Sub37_Sub1_2.method8840(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(B)D")
	public final double method3248() {
		if (this.aClass6_Sub37_Sub3_2 == null) {
			return this.aClass6_Sub37_Sub1_2 == null ? 0.0D : this.aClass6_Sub37_Sub1_2.method7483();
		} else {
			return this.aClass6_Sub37_Sub3_2.method8693();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)I")
	protected abstract int method3249(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(B)V")
	public final void method3250() throws IOException {
		if (this.aBoolean275) {
			return;
		}
		while (!this.aBoolean274) {
			@Pc(32) Class6_Sub37 local32;
			if (this.aBoolean272) {
				local32 = (Class6_Sub37) this.aClass74_19.method1401((long) this.anOggPage2.getSerialNumber());
			} else {
				local32 = this.method3252();
				if (local32 == null) {
					if (this.aBoolean276) {
						this.method3251();
					}
					return;
				}
				if (local32 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean272 = true;
			}
			if (this.aClass6_Sub37_Sub3_2 == local32) {
				if (this.aClass6_Sub37_Sub3_2.method8691() >= 50) {
					return;
				}
				while (this.aClass6_Sub37_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass6_Sub37_Sub3_2.method8840(this.anOggPacket2);
					this.method3244();
					if (this.aClass6_Sub37_Sub1_2 != null) {
						@Pc(94) double local94 = this.aClass6_Sub37_Sub1_2.method7483();
						for (@Pc(96) int local96 = 0; local96 < 10 && this.method3246(); local96++) {
							this.method3247();
							if (this.aBoolean274) {
								return;
							}
						}
						if (this.aClass6_Sub37_Sub1_2.method7483() > local94) {
							return;
						}
					}
					if (this.aClass6_Sub37_Sub3_2.method8691() >= 50) {
						return;
					}
				}
			} else if (local32 instanceof Class6_Sub37_Sub2) {
				this.method3244();
			} else if (local32 != this.aClass6_Sub37_Sub1_2) {
				while (local32.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local32.anInt10248 == 1 && local32 instanceof Class6_Sub37_Sub2) {
						this.method3255(this.aString27);
					}
					local32.method8840(this.anOggPacket2);
				}
			} else if (this.aClass6_Sub37_Sub3_2 == null && !this.aBoolean275) {
				for (@Pc(216) int local216 = 0; local216 < 10 && this.method3246(); local216++) {
					this.method3247();
					if (this.aBoolean274) {
						return;
					}
				}
				return;
			}
			this.aBoolean272 = false;
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	private void method3251() {
		for (@Pc(12) Class6_Sub37 local12 = (Class6_Sub37) this.aClass74_19.method1404(); local12 != null; local12 = (Class6_Sub37) this.aClass74_19.method1405()) {
			if (local12 != this.aClass6_Sub37_Sub1_2) {
				while (local12.anOggStreamState5.packetOut() == 1) {
					local12.method8840(this.anOggPacket2);
				}
			}
		}
		if (this.aClass6_Sub37_Sub1_2 == null) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
			if (!this.method3246()) {
				return;
			}
			if (this.aClass6_Sub37_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method3254();
				return;
			}
			this.aClass6_Sub37_Sub1_2.method8840(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)Lclient!nc;")
	private Class6_Sub37 method3252() throws IOException {
		if (this.aBoolean274) {
			throw new IllegalStateException();
		} else if (this.aBoolean276) {
			return null;
		} else {
			@Pc(35) int local35;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local35 = this.method3249(this.aByteArray23);
				if (local35 == -1) {
					this.aBoolean276 = true;
					return null;
				}
				if (local35 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray23, local35)) {
					throw new RuntimeException("");
				}
			}
			local35 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(87) Class6_Sub37 local87 = (Class6_Sub37) this.aClass74_19.method1401((long) local35);
				if (!local87.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local87;
			}
			@Pc(105) OggStreamState local105 = new OggStreamState(local35);
			if (!local105.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local105.packetPeek(this.anOggPacket2) == 1) {
				@Pc(155) Class6_Sub37 local155;
				if (this.aClass6_Sub37_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass6_Sub37_Sub1_2 = new Class6_Sub37_Sub1(local105);
					local155 = this.aClass6_Sub37_Sub1_2;
				} else if (this.aClass6_Sub37_Sub3_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass6_Sub37_Sub3_2 = new Class6_Sub37_Sub3(local105);
					local155 = this.aClass6_Sub37_Sub3_2;
				} else {
					@Pc(161) byte[] local161 = this.anOggPacket2.getData();
					@Pc(165) StringBuffer local165 = new StringBuffer();
					for (@Pc(167) int local167 = 1; local167 < local161.length && Character.isLetterOrDigit((char) local161[local167]); local167++) {
						local165.append((char) local161[local167]);
					}
					@Pc(196) String local196 = local165.toString();
					if (local196.equals("kate")) {
						local155 = new Class6_Sub37_Sub2(local105);
					} else {
						local155 = new Class6_Sub37_Sub4(local105);
					}
				}
				this.aClass74_19.method1399(local155, (long) local35);
				return local155;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Lclient!rda;")
	public final Class6_Sub37_Sub1 method3253() {
		return this.aClass6_Sub37_Sub1_2;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	public final void method3254() {
		if (this.aBoolean274) {
			return;
		}
		for (@Pc(21) Class6_Sub37 local21 = (Class6_Sub37) this.aClass74_19.method1404(); local21 != null; local21 = (Class6_Sub37) this.aClass74_19.method1405()) {
			local21.method8837();
			local21.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean274 = true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method3255(@OriginalArg(1) String arg0) {
		this.aString27 = arg0;
		if (this.aString27 == null) {
			this.aClass6_Sub37_Sub2_2 = null;
			return;
		}
		if (this.aClass6_Sub37_Sub2_2 != null && !this.aString27.equals(this.aClass6_Sub37_Sub2_2.method7879())) {
			this.aClass6_Sub37_Sub2_2 = null;
		}
		if (this.aClass6_Sub37_Sub2_2 != null) {
			return;
		}
		for (@Pc(43) Class6_Sub37 local43 = (Class6_Sub37) this.aClass74_19.method1404(); local43 != null; local43 = (Class6_Sub37) this.aClass74_19.method1405()) {
			if (local43 instanceof Class6_Sub37_Sub2) {
				@Pc(53) Class6_Sub37_Sub2 local53 = (Class6_Sub37_Sub2) local43;
				if (this.aString27.equals(local53.method7879())) {
					this.aClass6_Sub37_Sub2_2 = local53;
					return;
				}
			}
		}
	}
}

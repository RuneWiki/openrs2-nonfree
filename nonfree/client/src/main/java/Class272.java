import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public abstract class Class272 {

	@OriginalMember(owner = "client!pia", name = "D", descriptor = "[I")
	public static final int[] anIntArray456 = new int[120];

	@OriginalMember(owner = "client!pia", name = "w", descriptor = "[I")
	public static final int[] anIntArray457;

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!pia", name = "x", descriptor = "Z")
	private boolean aBoolean581;

	@OriginalMember(owner = "client!pia", name = "y", descriptor = "Z")
	private boolean aBoolean582;

	@OriginalMember(owner = "client!pia", name = "z", descriptor = "Lclient!sv;")
	private Class5_Sub12_Sub3 aClass5_Sub12_Sub3_2;

	@OriginalMember(owner = "client!pia", name = "s", descriptor = "Z")
	private boolean aBoolean583;

	@OriginalMember(owner = "client!pia", name = "p", descriptor = "Lclient!ed;")
	private Class5_Sub12_Sub1 aClass5_Sub12_Sub1_2;

	@OriginalMember(owner = "client!pia", name = "F", descriptor = "Lclient!l;")
	private Class5_Sub12_Sub2 aClass5_Sub12_Sub2_2;

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "Ljava/lang/String;")
	private String aString99;

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "[B")
	private final byte[] aByteArray72;

	@OriginalMember(owner = "client!pia", name = "r", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!pia", name = "v", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!pia", name = "I", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "Lclient!qha;")
	private final Class291 aClass291_31;

	static {
		@Pc(159) int local159 = 0;
		@Pc(161) int local161;
		for (local161 = 0; local161 < 120; local161++) {
			@Pc(166) int local166 = local161 + 1;
			@Pc(179) int local179 = (int) ((double) local166 + Math.pow(2.0D, (double) local166 / 7.0D) * 300.0D);
			local159 += local179;
			anIntArray456[local161] = local159 / 4;
		}
		anIntArray457 = new int[32];
		local159 = 2;
		for (local161 = 0; local161 < 32; local161++) {
			anIntArray457[local161] = local159 - 1;
			local159 += local159;
		}
	}

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(I)V")
	protected Class272(@OriginalArg(0) int arg0) {
		if (!Static513.method7491("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray72 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass291_31 = new Class291(8);
	}

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "(B)D")
	public final double method6456() {
		if (this.aClass5_Sub12_Sub2_2 == null) {
			return this.aClass5_Sub12_Sub3_2 == null ? 0.0D : this.aClass5_Sub12_Sub3_2.method8027();
		} else {
			return this.aClass5_Sub12_Sub2_2.method4968();
		}
	}

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)V")
	private void method6457() {
		for (@Pc(7) Class5_Sub12 local7 = (Class5_Sub12) this.aClass291_31.method6987(); local7 != null; local7 = (Class5_Sub12) this.aClass291_31.method6989()) {
			if (local7 instanceof Class5_Sub12_Sub1) {
				@Pc(17) Class5_Sub12_Sub1 local17 = (Class5_Sub12_Sub1) local7;
				while ((local17.anInt9782 <= 8 || this.method6456() > (double) local17.method1866()) && local17.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local17.method8411(this.anOggPacket2);
				}
			}
		}
		if (true) {
			this.method6466(this.aString99);
		}
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V")
	public final void method6458() throws IOException {
		if (this.aBoolean582) {
			return;
		}
		while (!this.aBoolean583) {
			@Pc(30) Class5_Sub12 local30;
			if (this.aBoolean581) {
				local30 = (Class5_Sub12) this.aClass291_31.method6993((long) this.anOggPage2.getSerialNumber(), 1);
			} else {
				local30 = this.method6460();
				if (local30 == null) {
					if (this.aBoolean580) {
						this.method6462((byte) 114);
					}
					return;
				}
				if (local30 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean581 = true;
			}
			if (this.aClass5_Sub12_Sub2_2 == local30) {
				if (this.aClass5_Sub12_Sub2_2.method4966() >= 50) {
					return;
				}
				while (this.aClass5_Sub12_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass5_Sub12_Sub2_2.method8411(this.anOggPacket2);
					this.method6457();
					if (this.aClass5_Sub12_Sub3_2 != null) {
						@Pc(191) double local191 = this.aClass5_Sub12_Sub3_2.method8027();
						for (@Pc(193) int local193 = 0; local193 < 10 && this.method6470(); local193++) {
							this.method6468();
							if (this.aBoolean583) {
								return;
							}
						}
						if (local191 < this.aClass5_Sub12_Sub3_2.method8027()) {
							return;
						}
					}
					if (this.aClass5_Sub12_Sub2_2.method4966() >= 50) {
						return;
					}
				}
			} else if (local30 instanceof Class5_Sub12_Sub1) {
				this.method6457();
			} else if (local30 != this.aClass5_Sub12_Sub3_2) {
				while (local30.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local30.anInt9782 == 1 && local30 instanceof Class5_Sub12_Sub1) {
						this.method6466(this.aString99);
					}
					local30.method8411(this.anOggPacket2);
				}
			} else if (this.aClass5_Sub12_Sub2_2 == null && !this.aBoolean582) {
				for (@Pc(143) int local143 = 0; local143 < 10 && this.method6470(); local143++) {
					this.method6468();
					if (this.aBoolean583) {
						return;
					}
				}
				return;
			}
			this.aBoolean581 = false;
		}
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(B)Lclient!l;")
	public final Class5_Sub12_Sub2 method6459() {
		return this.aClass5_Sub12_Sub2_2;
	}

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "(B)Lclient!sm;")
	private Class5_Sub12 method6460() throws IOException {
		if (this.aBoolean583) {
			throw new IllegalStateException();
		} else if (this.aBoolean580) {
			return null;
		} else {
			@Pc(31) int local31;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local31 = this.method6473(this.aByteArray72);
				if (local31 == -1) {
					this.aBoolean580 = true;
					return null;
				}
				if (local31 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray72, local31)) {
					throw new RuntimeException("");
				}
			}
			local31 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(219) Class5_Sub12 local219 = (Class5_Sub12) this.aClass291_31.method6993((long) local31, 1);
				if (!local219.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local219;
			}
			@Pc(80) OggStreamState local80 = new OggStreamState(local31);
			if (!local80.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local80.packetPeek(this.anOggPacket2) == 1) {
				@Pc(121) Class5_Sub12 local121;
				if (this.aClass5_Sub12_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass5_Sub12_Sub3_2 = new Class5_Sub12_Sub3(local80);
					local121 = this.aClass5_Sub12_Sub3_2;
				} else if (this.aClass5_Sub12_Sub2_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass5_Sub12_Sub2_2 = new Class5_Sub12_Sub2(local80);
					local121 = this.aClass5_Sub12_Sub2_2;
				} else {
					@Pc(138) byte[] local138 = this.anOggPacket2.getData();
					@Pc(142) StringBuffer local142 = new StringBuffer();
					for (@Pc(144) int local144 = 1; local144 < local138.length && Character.isLetterOrDigit((char) local138[local144]); local144++) {
						local142.append((char) local138[local144]);
					}
					@Pc(169) String local169 = local142.toString();
					if (local169.equals("kate")) {
						local121 = new Class5_Sub12_Sub1(local80);
					} else {
						local121 = new Class5_Sub12_Sub4(local80);
					}
				}
				this.aClass291_31.method6984((long) local31, local121);
				return local121;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "(B)Z")
	public final boolean method6461() {
		if (this.aBoolean583 || this.aBoolean580) {
			return this.aClass5_Sub12_Sub2_2 == null || this.aClass5_Sub12_Sub2_2.method4966() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V")
	private void method6462(@OriginalArg(0) byte arg0) {
		for (@Pc(7) Class5_Sub12 local7 = (Class5_Sub12) this.aClass291_31.method6987(); local7 != null; local7 = (Class5_Sub12) this.aClass291_31.method6989()) {
			if (this.aClass5_Sub12_Sub3_2 != local7) {
				while (local7.anOggStreamState5.packetOut() == 1) {
					local7.method8411(this.anOggPacket2);
				}
			}
		}
		if (arg0 < 87) {
			Static452.aClass109_160 = null;
		}
		if (this.aClass5_Sub12_Sub3_2 == null) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < 10; local65++) {
			if (!this.method6470()) {
				return;
			}
			if (this.aClass5_Sub12_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method6474();
				return;
			}
			this.aClass5_Sub12_Sub3_2.method8411(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method6466(@OriginalArg(1) String arg0) {
		this.aString99 = arg0;
		if (this.aString99 == null) {
			this.aClass5_Sub12_Sub1_2 = null;
			return;
		}
		if (this.aClass5_Sub12_Sub1_2 != null && !this.aString99.equals(this.aClass5_Sub12_Sub1_2.method1867())) {
			this.aClass5_Sub12_Sub1_2 = null;
		}
		if (this.aClass5_Sub12_Sub1_2 != null) {
			return;
		}
		for (@Pc(51) Class5_Sub12 local51 = (Class5_Sub12) this.aClass291_31.method6987(); local51 != null; local51 = (Class5_Sub12) this.aClass291_31.method6989()) {
			if (local51 instanceof Class5_Sub12_Sub1) {
				@Pc(61) Class5_Sub12_Sub1 local61 = (Class5_Sub12_Sub1) local51;
				if (this.aString99.equals(local61.method1867())) {
					this.aClass5_Sub12_Sub1_2 = local61;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "(I)V")
	private void method6468() throws IOException {
		while (this.aClass5_Sub12_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(21) Class5_Sub12 local21 = this.method6460();
			if (local21 == null) {
				if (this.aBoolean580) {
					this.method6462((byte) 121);
				}
				return;
			}
			if (local21 == this.aClass5_Sub12_Sub1_2) {
				this.method6457();
			}
		}
		this.aClass5_Sub12_Sub3_2.method8411(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZ)V")
	public final void method6469(@OriginalArg(1) boolean arg0) {
		if (this.aClass5_Sub12_Sub2_2 != null) {
			@Pc(14) Class5_Sub16_Sub2 local14 = this.aClass5_Sub12_Sub2_2.method4969();
			if (local14 != null) {
				local14.method3105(arg0);
			}
		}
		this.aBoolean582 = !this.aBoolean582;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)Z")
	private boolean method6470() {
		if (this.aClass5_Sub12_Sub2_2 == null) {
			@Pc(19) double local19 = (double) this.aClass5_Sub12_Sub3_2.method8028();
			return local19 == 0.0D || (double) Static515.method7499(119) >= (double) this.aClass5_Sub12_Sub3_2.method8022() + 1000.0D / local19;
		} else {
			return !this.aClass5_Sub12_Sub3_2.method8025() || this.method6456() > this.aClass5_Sub12_Sub3_2.method8027();
		}
	}

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "(B)Lclient!ed;")
	public final Class5_Sub12_Sub1 method6471() {
		return this.aClass5_Sub12_Sub1_2;
	}

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "(I)Lclient!sv;")
	public final Class5_Sub12_Sub3 method6472() {
		return this.aClass5_Sub12_Sub3_2;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "([BI)I")
	protected abstract int method6473(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public final void method6474() {
		if (this.aBoolean583) {
			return;
		}
		for (@Pc(16) Class5_Sub12 local16 = (Class5_Sub12) this.aClass291_31.method6987(); local16 != null; local16 = (Class5_Sub12) this.aClass291_31.method6989()) {
			local16.method8413();
			local16.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean583 = true;
	}
}

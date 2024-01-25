import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class251 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	private int anInt7194 = -1;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "Z")
	public boolean aBoolean518 = true;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
	private final int anInt7203;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_31;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Lclient!sq;")
	private final Class273 aClass273_2;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
	private final int anInt7204;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
	private final int anInt7199;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "Lclient!ku;")
	private Class73_Sub1 aClass73_Sub1_4;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Lclient!nu;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!rc;")
	private Class33_Sub2 aClass33_Sub2_2;

	static {
		new Class306("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!uq;Lclient!sq;Lclient!nk;IIIII)V")
	public Class251(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class205_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7203 = arg6;
		this.aClass122_Sub3_31 = arg0;
		this.aClass273_2 = arg1;
		this.anInt7204 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = arg2.anInt8174 * (local37 + local35) + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray5[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt7199 = local27;
		if (local27 <= 0) {
			this.aClass73_Sub1_4 = null;
		} else {
			@Pc(93) Class1_Sub6 local93 = new Class1_Sub6(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass122_Sub3_31.aBoolean594) {
				for (local51 = 0; local51 < local25; local51++) {
					local110 = local31 + arg2.anInt8174 * (local35 + local51);
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray5[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method3919(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local110 = local31 + (local35 + local51) * arg2.anInt8174;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray5[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method3971(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface10_4 = this.aClass122_Sub3_31.method6901(local93.aByteArray66, local93.anInt4555, false);
			this.aClass33_Sub2_2 = new Class33_Sub2(this.aClass122_Sub3_31, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!nu;IB)V")
	private void method6034(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method6042();
			this.aClass122_Sub3_31.method6850(this.aClass73_Sub1_4);
			this.aClass122_Sub3_31.method6889(arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "([BIII)V")
	public void method6037(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass33_Sub2_2.method6550(arg0, this.aClass122_Sub3_31.method6894(5123) * arg1);
		this.method6034(this.aClass33_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method6039() {
		this.method6034(this.anInterface10_4, this.anInt7199);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	private void method6042() {
		if (!this.aBoolean518) {
			return;
		}
		this.aBoolean518 = false;
		@Pc(16) byte[] local16 = this.aClass273_2.aByteArray108;
		@Pc(20) byte[] local20 = this.aClass122_Sub3_31.aByteArray117;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass273_2.anInt7711;
		@Pc(36) int local36 = this.aClass273_2.anInt7711 * this.anInt7204 + this.anInt7203;
		@Pc(49) int local49;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local49 = -128; local49 < 0; local49++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass73_Sub1_4 != null && this.anInt7194 == local22) {
			this.aBoolean518 = false;
			return;
		}
		this.anInt7194 = local22;
		local36 = this.anInt7204 * local26 + this.anInt7203;
		local49 = 0;
		for (@Pc(98) int local98 = -128; local98 < 0; local98++) {
			for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
				if (local16[local36] == 0) {
					@Pc(110) int local110 = 0;
					if (local16[local36 - 1] != 0) {
						local110++;
					}
					if (local16[local36 + 1] != 0) {
						local110++;
					}
					if (local16[local36 - local26] != 0) {
						local110++;
					}
					if (local16[local36 + local26] != 0) {
						local110++;
					}
					local20[local49++] = (byte) (local110 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass273_2.anInt7711 - 128;
		}
		if (this.aClass73_Sub1_4 == null) {
			this.aClass73_Sub1_4 = new Class73_Sub1(this.aClass122_Sub3_31, 3553, 6406, 128, 128, false, this.aClass122_Sub3_31.aByteArray117, 6406, false);
			this.aClass73_Sub1_4.method1954(false, false);
			this.aClass73_Sub1_4.method6348(true);
		} else {
			this.aClass73_Sub1_4.method1960(false, 128, this.aClass122_Sub3_31.aByteArray117, 6406, 128);
		}
	}
}

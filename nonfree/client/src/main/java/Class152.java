import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class152 {

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	private int anInt4396 = -1;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "Z")
	public boolean aBoolean367 = true;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "Lclient!ts;")
	private final Class236 aClass236_1;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	private final int anInt4400;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_21;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	private final int anInt4395;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	private final int anInt4399;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "Lclient!wr;")
	private Class65_Sub3 aClass65_Sub3_4;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "Lclient!gb;")
	private Interface4 anInterface4_4;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "Lclient!hl;")
	private Class53_Sub1 aClass53_Sub1_1;

	static {
		new Class256("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!bo;Lclient!ts;Lclient!ui;IIIII)V")
	public Class152(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class106_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass236_1 = arg1;
		this.anInt4400 = arg7;
		this.aClass26_Sub1_21 = arg0;
		this.anInt4395 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = arg2.anInt6999 * (local37 + local35) + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray6[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt4399 = local27;
		if (local27 <= 0) {
			this.aClass65_Sub3_4 = null;
		} else {
			@Pc(97) Class2_Sub20 local97 = new Class2_Sub20(local27 * 2);
			@Pc(116) int local116;
			@Pc(124) short[] local124;
			@Pc(128) int local128;
			@Pc(114) int local114;
			if (this.aClass26_Sub1_21.aBoolean76) {
				for (local50 = 0; local50 < local25; local50++) {
					local114 = local31 + (local50 + local35) * arg2.anInt6999;
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray6[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method3745(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local114 = local31 + (local35 + local50) * arg2.anInt6999;
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray6[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method3714(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface4_4 = this.aClass26_Sub1_21.method650(local97.aByteArray136, local97.anInt4608, false);
			this.aClass53_Sub1_1 = new Class53_Sub1(this.aClass26_Sub1_21, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([BIII)V")
	public void method3532(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass53_Sub1_1.method3583(arg0, arg1 * this.aClass26_Sub1_21.method657(5123));
		this.method3535(arg1, this.aClass53_Sub1_1);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
	public void method3533() {
		this.method3535(this.anInt4399, this.anInterface4_4);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!gb;Z)V")
	private void method3535(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		if (arg0 != 0) {
			this.method3536();
			this.aClass26_Sub1_21.method673(this.aClass65_Sub3_4);
			this.aClass26_Sub1_21.method664(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
	private void method3536() {
		if (!this.aBoolean367) {
			return;
		}
		this.aBoolean367 = false;
		@Pc(16) byte[] local16 = this.aClass236_1.aByteArray189;
		@Pc(18) byte[] local18 = Static87.aByteArray51;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = this.aClass236_1.anInt6859;
		@Pc(34) int local34 = this.aClass236_1.anInt6859 * this.anInt4400 + this.anInt4395;
		@Pc(46) int local46;
		for (@Pc(36) int local36 = -128; local36 < 0; local36++) {
			local20 = (local20 << 8) - local20;
			for (local46 = -128; local46 < 0; local46++) {
				if (local16[local34++] != 0) {
					local20++;
				}
			}
			local34 += local24 - 128;
		}
		if (this.aClass65_Sub3_4 != null && local20 == this.anInt4396) {
			this.aBoolean367 = false;
			return;
		}
		this.anInt4396 = local20;
		local34 = this.anInt4395 + local24 * this.anInt4400;
		local46 = 0;
		for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
			for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
				if (local16[local34] == 0) {
					@Pc(117) int local117 = 0;
					if (local16[local34 - 1] != 0) {
						local117++;
					}
					if (local16[local34 + 1] != 0) {
						local117++;
					}
					if (local16[local34 - local24] != 0) {
						local117++;
					}
					if (local16[local34 + local24] != 0) {
						local117++;
					}
					local18[local46++] = (byte) (local117 * 17);
				} else {
					local18[local46++] = 68;
				}
				local34++;
			}
			local34 += this.aClass236_1.anInt6859 - 128;
		}
		if (this.aClass65_Sub3_4 == null) {
			this.aClass65_Sub3_4 = new Class65_Sub3(this.aClass26_Sub1_21, 3553, 6406, 128, 128, false, Static87.aByteArray51, 6406, false);
			this.aClass65_Sub3_4.method1962(false, false);
			this.aClass65_Sub3_4.method4263(true);
		} else {
			this.aClass65_Sub3_4.method1963(false, Static87.aByteArray51, 128, 128, 6406);
		}
	}
}

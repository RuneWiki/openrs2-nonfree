import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class55 {

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
	private int anInt1892 = -1;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_4;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!lv;")
	private final Class146 aClass146_1;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	private final int anInt1890;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
	private final int anInt1895;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	private final int anInt1886;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!mf;")
	private Class112_Sub2 aClass112_Sub2_1;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "Lclient!u;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Lclient!tp;")
	private Class121_Sub2 aClass121_Sub2_1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!vj;Lclient!lv;Lclient!si;IIIII)V")
	public Class55(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class159_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass172_Sub2_4 = arg0;
		this.aClass146_1 = arg1;
		this.anInt1890 = arg6;
		this.anInt1895 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = (local37 + local35) * arg2.anInt6189 + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray5[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt1886 = local27;
		if (local27 <= 0) {
			this.aClass112_Sub2_1 = null;
		} else {
			@Pc(93) Class3_Sub7 local93 = new Class3_Sub7(local27 * 2);
			@Pc(113) int local113;
			@Pc(121) short[] local121;
			@Pc(125) int local125;
			@Pc(111) int local111;
			if (this.aClass172_Sub2_4.aBoolean621) {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = local31 + arg2.anInt6189 * (local50 + local35);
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray5[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method2613(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = local31 + (local35 + local50) * arg2.anInt6189;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray5[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method2585(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface10_1 = this.aClass172_Sub2_4.method5560(local93.anInt3235, local93.aByteArray46, false);
			this.aClass121_Sub2_1 = new Class121_Sub2(this.aClass172_Sub2_4, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public void method1471() {
		this.method1477(this.anInt1886, this.anInterface10_1);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[BI)V")
	public void method1475(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass121_Sub2_1.method5070(arg0, arg1 * this.aClass172_Sub2_4.method5618(5123));
		this.method1477(arg1, this.aClass121_Sub2_1);
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
	private void method1476() {
		if (!this.aBoolean157) {
			return;
		}
		this.aBoolean157 = false;
		@Pc(16) byte[] local16 = this.aClass146_1.aByteArray56;
		@Pc(18) byte[] local18 = Static56.aByteArray21;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = this.aClass146_1.anInt4572;
		@Pc(34) int local34 = this.aClass146_1.anInt4572 * this.anInt1895 + this.anInt1890;
		@Pc(47) int local47;
		for (@Pc(36) int local36 = -128; local36 < 0; local36++) {
			local20 = (local20 << 8) - local20;
			for (local47 = -128; local47 < 0; local47++) {
				if (local16[local34++] != 0) {
					local20++;
				}
			}
			local34 += local24 - 128;
		}
		if (this.aClass112_Sub2_1 != null && this.anInt1892 == local20) {
			this.aBoolean157 = false;
			return;
		}
		this.anInt1892 = local20;
		local47 = 0;
		local34 = this.anInt1890 + local24 * this.anInt1895;
		for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
			for (@Pc(115) int local115 = -128; local115 < 0; local115++) {
				if (local16[local34] == 0) {
					@Pc(123) int local123 = 0;
					if (local16[local34 - 1] != 0) {
						local123++;
					}
					if (local16[local34 + 1] != 0) {
						local123++;
					}
					if (local16[local34 - local24] != 0) {
						local123++;
					}
					if (local16[local24 + local34] != 0) {
						local123++;
					}
					local18[local47++] = (byte) (local123 * 17);
				} else {
					local18[local47++] = 68;
				}
				local34++;
			}
			local34 += this.aClass146_1.anInt4572 - 128;
		}
		if (this.aClass112_Sub2_1 == null) {
			this.aClass112_Sub2_1 = new Class112_Sub2(this.aClass172_Sub2_4, 3553, 6406, 128, 128, false, Static56.aByteArray21, 6406, false);
			this.aClass112_Sub2_1.method3727(false, false);
			this.aClass112_Sub2_1.method4551(true);
		} else {
			this.aClass112_Sub2_1.method3730(false, 128, 128, Static56.aByteArray21, 6406);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!u;B)V")
	private void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		if (arg0 != 0) {
			this.method1476();
			this.aClass172_Sub2_4.method5630(this.aClass112_Sub2_1);
			this.aClass172_Sub2_4.method5628(arg0, arg1, 0);
		}
	}
}

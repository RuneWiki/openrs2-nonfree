import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class48 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	private int anInt1090;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public int anInt1094;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	private int anInt1095;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!xa;")
	private Class71 aClass71_7;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	private int anInt1100;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	private final int anInt1096;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	private final int anInt1099;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	private final int anInt1092;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Z")
	private final boolean aBoolean75;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	private final int anInt1093;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	private final int anInt1097;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	private final int anInt1089;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	private final int anInt1098;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1096 = arg2;
		this.anInt1099 = arg3;
		this.anInt1092 = arg4;
		this.aBoolean75 = arg7;
		this.anInt1093 = arg1;
		this.anInt1097 = arg6;
		this.anInt1089 = arg5;
		this.anInt1098 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!oa;Lclient!ce;)V")
	private void method896(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class48 arg1) {
		Static64.method899(arg0);
		Static64.method897(arg0);
		arg0.A(Static64.anIntArray103);
		arg0.ca(0, 0, this.anInt1090, this.anInt1090);
		arg0.method7521();
		arg0.C(0, 0, this.anInt1090, this.anInt1090, this.anInt1097 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean75) {
				local31 = -arg1.anInt1096;
				local33 = -arg1.anInt1099;
				local35 = -arg1.anInt1092;
			} else {
				local31 = arg1.anInt1096 - this.anInt1096;
				local33 = arg1.anInt1099 - this.anInt1099;
				local35 = arg1.anInt1092 - this.anInt1092;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt1100 != 0) {
			local79 = Class22.anIntArray20[this.anInt1100];
			local84 = Class22.anIntArray19[this.anInt1100];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt1095 != 0) {
			local79 = Class22.anIntArray20[this.anInt1095];
			local84 = Class22.anIntArray19[this.anInt1095];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class24 local147 = Static64.aClass24_2.method7398((byte) 0, 51200, true);
		if (arg0.method7474()) {
			local147.ka((short) 0, (short) this.anInt1093);
		} else {
			local147.UA((short) 127, Static386.anInterface2_12.method3085(this.anInt1093).aShort55);
			local147.ka((short) 0, (short) -1);
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt1090 * 1024 / (local147.M() - local147.ha());
		if (this.anInt1097 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.m(this.anInt1090 / 2, this.anInt1090 / 2, local84, local84);
		arg0.method7492(arg0.method7518());
		@Pc(223) Class93 local223 = arg0.method7518();
		local223.GA(0, 0, arg0.U() - local147.LA());
		local147.method7392(local223, null, 1024);
		@Pc(245) int local245 = this.anInt1090 * 13 / 16;
		@Pc(252) int local252 = (this.anInt1090 - local245) / 2;
		Static64.aClass71_8.KA(local252, local252, local245, local245, 0, this.anInt1097 | 0xFF000000, 1);
		this.aClass71_7 = arg0.method7453(0, 0, this.anInt1090, this.anInt1090, true);
		arg0.method7521();
		arg0.C(0, 0, this.anInt1090, this.anInt1090, 0, 0);
		Static64.aClass71_9.KA(0, 0, this.anInt1090, this.anInt1090, 1, 0, 0);
		this.aClass71_7.t(0, 0, 0);
		arg0.ca(Static64.anIntArray103[0], Static64.anIntArray103[1], Static64.anIntArray103[2], Static64.anIntArray103[3]);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lclient!oa;Lclient!ce;)V")
	private void method898(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class48 arg1) {
		@Pc(6) Class134 local6 = Static311.method4670(Static353.aClass248_59, this.anInt1093);
		if (local6 == null) {
			return;
		}
		arg0.A(Static64.anIntArray103);
		arg0.ca(0, 0, this.anInt1090, this.anInt1090);
		arg0.C(0, 0, this.anInt1090, this.anInt1090, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean75) {
				local32 = -arg1.anInt1096;
				local34 = -arg1.anInt1099;
				local36 = -arg1.anInt1092;
			} else {
				local32 = this.anInt1096 - arg1.anInt1096;
				local34 = this.anInt1099 - arg1.anInt1099;
				local36 = this.anInt1092 - arg1.anInt1092;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt1100 != 0) {
			local81 = -this.anInt1100 & 0x3FFF;
			local85 = Class22.anIntArray20[local81];
			local89 = Class22.anIntArray19[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt1095 != 0) {
			local81 = -this.anInt1095 & 0x3FFF;
			local85 = Class22.anIntArray20[local81];
			local89 = Class22.anIntArray19[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class24 local172 = arg0.method7464(local6, 2048, 0, 64, 768);
		local85 = local172.M() - local172.ha();
		local89 = local172.EA() - local172.DA();
		local99 = local172.ha() + local85 / 2;
		@Pc(198) int local198 = local172.DA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.m(local99, local198, local205, local205);
		arg0.method7492(arg0.method7518());
		@Pc(218) Class93 local218 = arg0.method7455();
		local218.GA(0, 0, arg0.U() - local172.LA());
		local172.method7392(local218, null, arg0.U());
		this.aClass71_7 = arg0.method7453(0, 0, this.anInt1090, this.anInt1090, true);
		this.aClass71_7.t(0, 0, 3);
		arg0.ca(Static64.anIntArray103[0], Static64.anIntArray103[1], Static64.anIntArray103[2], Static64.anIntArray103[3]);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)Z")
	public boolean method902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean75) {
			this.anInt1094 = 1073741823;
			local7 = this.anInt1096;
			local12 = this.anInt1099;
			local17 = this.anInt1092;
		} else {
			local7 = this.anInt1096 - arg0;
			local12 = this.anInt1099 - arg1;
			local17 = this.anInt1092 - arg2;
			this.anInt1094 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt1094 == 0) {
				this.anInt1094 = 1;
			}
			local7 = (local7 << 8) / this.anInt1094;
			local12 = (local12 << 8) / this.anInt1094;
			local17 = (local17 << 8) / this.anInt1094;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt1091 = this.anInt1089 * arg3 / (this.aBoolean75 ? 1024 : this.anInt1094);
		} else {
			this.anInt1091 = 0;
		}
		if (this.anInt1091 < 8) {
			this.aClass71_7 = null;
			return false;
		}
		@Pc(143) int local143 = Static14.method5936(this.anInt1091);
		if (local143 > arg3) {
			local143 = Static118.method7958(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt1090) {
			this.anInt1090 = local143;
		}
		this.anInt1100 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt1095 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass71_7 = null;
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Lclient!oa;Lclient!ce;)Z")
	private boolean method903(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class48 arg1) {
		if (this.aClass71_7 == null) {
			if (this.anInt1098 == 0) {
				if (Static386.anInterface2_12.method3089(this.anInt1093)) {
					@Pc(23) int[] local23 = Static386.anInterface2_12.method3087(this.anInt1090, this.anInt1090, this.anInt1093, 0.7F);
					this.aClass71_7 = arg0.method7471(local23, this.anInt1090, this.anInt1090, this.anInt1090);
				}
			} else if (this.anInt1098 == 2) {
				this.method898(arg0, arg1);
			} else if (this.anInt1098 == 1) {
				this.method896(arg0, arg1);
			}
		}
		return this.aClass71_7 != null;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(Lclient!oa;Lclient!ce;)Z")
	public boolean method904(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class48 arg1) {
		return this.aClass71_7 != null || this.method903(arg0, arg1);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
	public void method905() {
		this.aClass71_7 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!oa;IIIIII)V")
	public void method906(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass71_7 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt1100 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt1095 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt1091) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt1091) / 2;
		if (local38 < arg4 && local38 + this.anInt1091 > 0 && local51 < arg3 && local51 + this.anInt1091 > 0) {
			this.aClass71_7.method7774(local51 + arg1, local38 + arg2, this.anInt1091, this.anInt1091);
		}
	}
}

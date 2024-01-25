import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "[Lclient!fp;")
	public Class5_Sub15_Sub1[] aClass5_Sub15_Sub1Array1;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "[Lclient!qm;")
	public Class167[] aClass167Array1;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
	public int anInt1179;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	private Class5_Sub7() {
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "([B)V")
	public Class5_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray15 = new byte[128];
		this.aClass167Array1 = new Class167[128];
		this.aByteArray14 = new byte[128];
		this.aByteArray13 = new byte[128];
		this.aClass5_Sub15_Sub1Array1 = new Class5_Sub15_Sub1[128];
		this.anIntArray56 = new int[128];
		this.aShortArray11 = new short[128];
		@Pc(36) Class5_Sub1 local36 = new Class5_Sub1(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray18[local38 + local36.anInt2029] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method1863();
		}
		local36.anInt2029++;
		local38++;
		@Pc(83) int local83 = local36.anInt2029;
		local36.anInt2029 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray18[local91 + local36.anInt2029] != 0; local91++) {
		}
		@Pc(105) byte[] local105 = new byte[local91];
		for (@Pc(107) int local107 = 0; local107 < local91; local107++) {
			local105[local107] = local36.method1863();
		}
		local36.anInt2029++;
		local91++;
		@Pc(129) int local129 = local36.anInt2029;
		local36.anInt2029 += local91;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray18[local137 + local36.anInt2029] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method1863();
		}
		local36.anInt2029++;
		local137++;
		@Pc(178) byte[] local178 = new byte[local137];
		@Pc(185) int local185;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local137 <= 1) {
			local185 = local137;
		} else {
			local178[1] = 1;
			@Pc(193) int local193 = 1;
			local185 = 2;
			for (local197 = 2; local197 < local137; local197++) {
				local203 = local36.method1832();
				if (local203 == 0) {
					local193 = local185++;
				} else {
					if (local203 <= local193) {
						local203--;
					}
					local193 = local203;
				}
				local178[local197] = (byte) local193;
			}
		}
		@Pc(235) Class167[] local235 = new Class167[local185];
		for (local197 = 0; local197 < local235.length; local197++) {
			@Pc(247) Class167 local247 = local235[local197] = new Class167();
			@Pc(251) int local251 = local36.method1832();
			if (local251 > 0) {
				local247.aByteArray73 = new byte[local251 * 2];
			}
			local251 = local36.method1832();
			if (local251 > 0) {
				local247.aByteArray72 = new byte[local251 * 2 + 2];
				local247.aByteArray72[1] = 64;
			}
		}
		local203 = local36.method1832();
		@Pc(306) byte[] local306 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local36.method1832();
		@Pc(322) byte[] local322 = local203 > 0 ? new byte[local203 * 2] : null;
		@Pc(324) int local324;
		for (local324 = 0; local36.aByteArray18[local36.anInt2029 + local324] != 0; local324++) {
		}
		@Pc(338) byte[] local338 = new byte[local324];
		for (@Pc(340) int local340 = 0; local340 < local324; local340++) {
			local338[local340] = local36.method1863();
		}
		local36.anInt2029++;
		local324++;
		@Pc(365) int local365 = 0;
		for (@Pc(367) int local367 = 0; local367 < 128; local367++) {
			local365 += local36.method1832();
			this.aShortArray11[local367] = (short) local365;
		}
		local365 = 0;
		for (@Pc(389) int local389 = 0; local389 < 128; local389++) {
			local365 += local36.method1832();
			this.aShortArray11[local389] = (short) (this.aShortArray11[local389] + (local365 << 8));
		}
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		for (@Pc(422) int local422 = 0; local422 < 128; local422++) {
			if (local416 == 0) {
				if (local418 < local338.length) {
					local416 = local338[local418++];
				} else {
					local416 = -1;
				}
				local420 = local36.method1881();
			}
			this.aShortArray11[local422] = (short) (this.aShortArray11[local422] + ((local420 - 1 & 0x2) << 14));
			this.anIntArray56[local422] = local420;
			local416--;
		}
		local416 = 0;
		local418 = 0;
		@Pc(477) int local477 = 0;
		for (@Pc(479) int local479 = 0; local479 < 128; local479++) {
			if (this.anIntArray56[local479] != 0) {
				if (local416 == 0) {
					local477 = local36.aByteArray18[local83++] - 1;
					if (local55.length <= local418) {
						local416 = -1;
					} else {
						local416 = local55[local418++];
					}
				}
				local416--;
				this.aByteArray14[local479] = (byte) local477;
			}
		}
		local416 = 0;
		local418 = 0;
		@Pc(536) int local536 = 0;
		for (@Pc(538) int local538 = 0; local538 < 128; local538++) {
			if (this.anIntArray56[local538] != 0) {
				if (local416 == 0) {
					local536 = local36.aByteArray18[local129++] + 16 << 2;
					if (local418 < local105.length) {
						local416 = local105[local418++];
					} else {
						local416 = -1;
					}
				}
				local416--;
				this.aByteArray15[local538] = (byte) local536;
			}
		}
		local418 = 0;
		local416 = 0;
		@Pc(587) Class167 local587 = null;
		for (@Pc(589) int local589 = 0; local589 < 128; local589++) {
			if (this.anIntArray56[local589] != 0) {
				if (local416 == 0) {
					local587 = local235[local178[local418]];
					if (local154.length <= local418) {
						local416 = -1;
					} else {
						local416 = local154[local418++];
					}
				}
				local416--;
				this.aClass167Array1[local589] = local587;
			}
		}
		local418 = 0;
		local416 = 0;
		@Pc(635) int local635 = 0;
		for (@Pc(637) int local637 = 0; local637 < 128; local637++) {
			if (local416 == 0) {
				if (local338.length <= local418) {
					local416 = -1;
				} else {
					local416 = local338[local418++];
				}
				if (this.anIntArray56[local637] > 0) {
					local635 = local36.method1832() + 1;
				}
			}
			local416--;
			this.aByteArray13[local637] = (byte) local635;
		}
		this.anInt1179 = local36.method1832() + 1;
		@Pc(701) int local701;
		for (@Pc(690) int local690 = 0; local690 < local185; local690++) {
			@Pc(696) Class167 local696 = local235[local690];
			if (local696.aByteArray73 != null) {
				for (local701 = 1; local701 < local696.aByteArray73.length; local701 += 2) {
					local696.aByteArray73[local701] = local36.method1863();
				}
			}
			if (local696.aByteArray72 != null) {
				for (local701 = 3; local701 < local696.aByteArray72.length - 2; local701 += 2) {
					local696.aByteArray72[local701] = local36.method1863();
				}
			}
		}
		@Pc(754) int local754;
		if (local306 != null) {
			for (local754 = 1; local754 < local306.length; local754 += 2) {
				local306[local754] = local36.method1863();
			}
		}
		if (local322 != null) {
			for (local754 = 1; local754 < local322.length; local754 += 2) {
				local322[local754] = local36.method1863();
			}
		}
		@Pc(807) int local807;
		for (local754 = 0; local754 < local185; local754++) {
			@Pc(800) Class167 local800 = local235[local754];
			if (local800.aByteArray72 != null) {
				local365 = 0;
				for (local807 = 2; local807 < local800.aByteArray72.length; local807 += 2) {
					local365 += local36.method1832() + 1;
					local800.aByteArray72[local807] = (byte) local365;
				}
			}
		}
		@Pc(852) int local852;
		for (local701 = 0; local701 < local185; local701++) {
			@Pc(845) Class167 local845 = local235[local701];
			if (local845.aByteArray73 != null) {
				local365 = 0;
				for (local852 = 2; local852 < local845.aByteArray73.length; local852 += 2) {
					local365 += local36.method1832() + 1;
					local845.aByteArray73[local852] = (byte) local365;
				}
			}
		}
		@Pc(929) int local929;
		@Pc(952) int local952;
		@Pc(958) byte local958;
		@Pc(977) int local977;
		@Pc(979) int local979;
		@Pc(989) int local989;
		@Pc(923) byte local923;
		@Pc(1030) int local1030;
		if (local306 != null) {
			local365 = local36.method1832();
			local306[0] = (byte) local365;
			for (local807 = 2; local807 < local306.length; local807 += 2) {
				local365 = local365 + local36.method1832() + 1;
				local306[local807] = (byte) local365;
			}
			local923 = local306[0];
			@Pc(927) byte local927 = local306[1];
			for (local929 = 0; local929 < local923; local929++) {
				this.aByteArray13[local929] = (byte) (local927 * this.aByteArray13[local929] + 32 >> 6);
			}
			local952 = 2;
			while (local952 < local306.length) {
				local958 = local306[local952];
				@Pc(964) byte local964 = local306[local952 + 1];
				local977 = (local958 - local923) / 2 + (local958 - local923) * local927;
				for (local979 = local923; local979 < local958; local979++) {
					local989 = Static102.method2053(local977, local958 - local923);
					this.aByteArray13[local979] = (byte) (local989 * this.aByteArray13[local979] + 32 >> 6);
					local977 += local964 - local927;
				}
				local952 += 2;
				local923 = local958;
				local927 = local964;
			}
			for (local1030 = local923; local1030 < 128; local1030++) {
				this.aByteArray13[local1030] = (byte) (local927 * this.aByteArray13[local1030] + 32 >> 6);
			}
		}
		@Pc(1099) int local1099;
		if (local322 != null) {
			local365 = local36.method1832();
			local322[0] = (byte) local365;
			for (local807 = 2; local807 < local322.length; local807 += 2) {
				local365 -= -local36.method1832() - 1;
				local322[local807] = (byte) local365;
			}
			local923 = local322[0];
			local1099 = local322[1] << 1;
			for (local929 = 0; local929 < local923; local929++) {
				local952 = (this.aByteArray15[local929] & 0xFF) + local1099;
				if (local952 < 0) {
					local952 = 0;
				}
				if (local952 > 128) {
					local952 = 128;
				}
				this.aByteArray15[local929] = (byte) local952;
			}
			local952 = 2;
			@Pc(1157) int local1157;
			while (local322.length > local952) {
				local958 = local322[local952];
				local1157 = local322[local952 + 1] << 1;
				local977 = (local958 - local923) * local1099 + (local958 - local923) / 2;
				for (local979 = local923; local979 < local958; local979++) {
					local989 = Static102.method2053(local977, local958 - local923);
					@Pc(1189) int local1189 = local989 + (this.aByteArray15[local979] & 0xFF);
					if (local1189 < 0) {
						local1189 = 0;
					}
					if (local1189 > 128) {
						local1189 = 128;
					}
					local977 += local1157 - local1099;
					this.aByteArray15[local979] = (byte) local1189;
				}
				local923 = local958;
				local952 += 2;
				local1099 = local1157;
			}
			for (local1030 = local923; local1030 < 128; local1030++) {
				local1157 = local1099 + (this.aByteArray15[local1030] & 0xFF);
				if (local1157 < 0) {
					local1157 = 0;
				}
				if (local1157 > 128) {
					local1157 = 128;
				}
				this.aByteArray15[local1030] = (byte) local1157;
			}
		}
		for (local807 = 0; local807 < local185; local807++) {
			local235[local807].anInt5045 = local36.method1832();
		}
		for (local852 = 0; local852 < local185; local852++) {
			@Pc(1294) Class167 local1294 = local235[local852];
			if (local1294.aByteArray73 != null) {
				local1294.anInt5046 = local36.method1832();
			}
			if (local1294.aByteArray72 != null) {
				local1294.anInt5047 = local36.method1832();
			}
			if (local1294.anInt5045 > 0) {
				local1294.anInt5042 = local36.method1832();
			}
		}
		for (local1099 = 0; local1099 < local185; local1099++) {
			local235[local1099].anInt5041 = local36.method1832();
		}
		for (local929 = 0; local929 < local185; local929++) {
			@Pc(1345) Class167 local1345 = local235[local929];
			if (local1345.anInt5041 > 0) {
				local1345.anInt5043 = local36.method1832();
			}
		}
		for (local952 = 0; local952 < local185; local952++) {
			@Pc(1369) Class167 local1369 = local235[local952];
			if (local1369.anInt5043 > 0) {
				local1369.anInt5035 = local36.method1832();
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
	public void method1031() {
		this.anIntArray56 = null;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B[BLclient!dm;[I)Z")
	public boolean method1033(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class5_Sub15_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(35) int local35 = this.anIntArray56[local13];
				if (local35 != 0) {
					if (local9 != local35) {
						local9 = local35--;
						if ((local35 & 0x1) == 0) {
							local11 = arg1.method1247(arg2, local35 >> 2);
						} else {
							local11 = arg1.method1253(local35 >> 2, arg2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass5_Sub15_Sub1Array1[local13] = local11;
						this.anIntArray56[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}

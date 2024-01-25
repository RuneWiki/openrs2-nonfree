import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class1_Sub2_Sub3_Sub2 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!wn", name = "rc", descriptor = "Lclient!nk;")
	public Class139 aClass139_1;

	@OriginalMember(owner = "client!wn", name = "Hc", descriptor = "I")
	public int anInt6982 = -1;

	@OriginalMember(owner = "client!wn", name = "Dc", descriptor = "I")
	public int anInt6978 = -1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		if (this.aClass139_1 == null || !this.method5793(65536, arg2)) {
			return false;
		}
		@Pc(21) Class38 local21 = arg2.method3672();
		@Pc(26) int local26 = super.aClass219_7.method5719();
		local21.method4480(local26);
		local21.method4470(super.anInt6893, super.anInt6886, super.anInt6888);
		for (@Pc(44) int local44 = 0; local44 < super.aClass49Array3.length; local44++) {
			if (super.aClass49Array3[local44] != null && super.aClass49Array3[local44].method5816(arg0, arg1, local21, this.aClass139_1.anInt4778 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!nk;I)V")
	public void method5790(@OriginalArg(0) Class139 arg0) {
		this.aClass139_1 = arg0;
		if (super.aClass57_Sub6_7 != null) {
			super.aClass57_Sub6_7.method3852();
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(Z)I")
	@Override
	public int method5766() {
		return super.anInt6909;
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		if (this.aClass139_1 == null || !this.method5793(1024, arg0)) {
			return null;
		}
		@Pc(17) Class38 local17 = arg0.method3672();
		@Pc(24) int local24 = super.aClass219_7.method5719();
		local17.method4480(local24);
		local17.method4470(super.anInt6893, super.anInt6886, super.anInt6888);
		@Pc(39) Class142 local39 = this.method5778();
		@Pc(51) Class139 local51 = this.aClass139_1.anIntArray350 == null ? this.aClass139_1 : this.aClass139_1.method4120();
		if (Static39.aBoolean48 && local51.aBoolean416 && local39.aBoolean428) {
			@Pc(76) Class84 local76 = super.anInt6915 != -1 && super.anInt6900 == 0 ? Static91.method1822(super.anInt6915) : null;
			@Pc(93) Class84 local93 = super.anInt6901 == -1 || super.aBoolean613 && local76 != null ? null : Static91.method1822(super.anInt6901);
			@Pc(145) Class49 local145 = Static295.method4925(local24, super.anInt6897, local93 == null ? local76 : local93, this.aClass139_1.anInt4778, super.anInt6931, this.aClass139_1.aByte54 & 0xFF, this.aClass139_1.aShort71 & 0xFFFF, local93 == null ? super.anInt6895 : super.anInt6942, arg0, this.aClass139_1.aByte53 & 0xFF, super.anInt6925, super.aClass49Array3[0], super.aBoolean614, this.aClass139_1.aShort70 & 0xFFFF);
			if (local145 != null) {
				@Pc(150) float local150 = arg0.method3705();
				@Pc(153) float local153 = arg0.method3744();
				arg0.method3675(false);
				arg0.method3662(local150, local153 - 150.0F);
				local145.method5825(local17, null, 0);
				arg0.method3662(local150, local153);
				arg0.method3675(true);
			}
		}
		@Pc(176) Class57_Sub5 local176 = null;
		if (this.method5795()) {
			local176 = Static116.method2281(super.aClass49Array3.length);
		}
		if (super.aClass57_Sub6_7 == null) {
			arg0.method3714(super.aClass49Array3, local17, local176 == null ? null : local176.aClass57_Sub4Array1, 0);
		} else {
			@Pc(216) Class214 local216 = super.aClass57_Sub6_7.method3844();
			arg0.method3666(super.aClass49Array3, local216, local17, local176 == null ? null : local176.aClass57_Sub4Array1, 0);
		}
		this.method5781(super.aClass49Array3, arg0, false);
		if (super.aClass49Array3[2] != null) {
			if (local24 != 0) {
				super.aClass49Array3[2].method5857(local24);
			}
			super.aClass49Array3[2].method5849(-super.aClass2_Sub25_3.anInt4097 + super.anInt6893, -super.aClass2_Sub25_3.anInt4094 + super.anInt6886, super.anInt6888 - super.aClass2_Sub25_3.anInt4105);
		}
		return local176;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BZIIII)V")
	public void method5791(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte77 = (byte) arg4;
		if (super.anInt6915 != -1 && Static91.method1822(super.anInt6915).anInt2463 == 1) {
			super.anInt6915 = -1;
		}
		if (super.anInt6902 != -1) {
			@Pc(33) Class177 local33 = Static41.method4707(super.anInt6902);
			if (local33.aBoolean516 && local33.anInt5808 != -1 && Static91.method1822(local33.anInt5808).anInt2463 == 1) {
				super.anInt6902 = -1;
			}
		}
		if (!arg0) {
			@Pc(62) int local62 = arg1 - super.anIntArray535[0];
			@Pc(70) int local70 = arg2 - super.anIntArray534[0];
			if (local62 >= -8 && local62 <= 8 && local70 >= -8 && local70 <= 8) {
				if (super.anInt6962 < 9) {
					super.anInt6962++;
				}
				for (@Pc(99) int local99 = super.anInt6962; local99 > 0; local99--) {
					super.anIntArray535[local99] = super.anIntArray535[local99 - 1];
					super.anIntArray534[local99] = super.anIntArray534[local99 - 1];
					super.aByteArray93[local99] = super.aByteArray93[local99 - 1];
				}
				super.anIntArray535[0] = arg1;
				super.anIntArray534[0] = arg2;
				super.aByteArray93[0] = 1;
				return;
			}
		}
		super.anInt6963 = 0;
		super.anIntArray535[0] = arg1;
		super.anInt6964 = 0;
		super.anInt6962 = 0;
		super.anIntArray534[0] = arg2;
		super.anInt6893 = arg3 * 64 + super.anIntArray535[0] * 128;
		super.anInt6888 = super.anIntArray534[0] * 128 + arg3 * 64;
		if (super.aClass57_Sub6_7 != null) {
			super.aClass57_Sub6_7.method3852();
		}
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(B)I")
	@Override
	public int method5784() {
		if (this.aClass139_1.anIntArray350 != null) {
			@Pc(17) Class139 local17 = this.aClass139_1.method4120();
			if (local17 != null && local17.anInt4775 != -1) {
				return local17.anInt4775;
			}
		}
		return this.aClass139_1.anInt4775 == -1 ? super.method5784() : this.aClass139_1.anInt4775;
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(B)I")
	@Override
	protected int method5780() {
		if (this.aClass139_1.anIntArray350 != null) {
			@Pc(17) Class139 local17 = this.aClass139_1.method4120();
			if (local17 != null && local17.anInt4800 != -1) {
				return local17.anInt4800;
			}
		}
		return this.aClass139_1.anInt4800;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)I")
	@Override
	public int method5776() {
		if (this.aClass139_1.anIntArray350 != null) {
			@Pc(17) Class139 local17 = this.aClass139_1.method4120();
			if (local17 != null && local17.anInt4780 != -1) {
				return local17.anInt4780;
			}
		}
		return this.aClass139_1.anInt4780;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!dr;I)Z")
	private boolean method5793(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class142 local11 = this.method5778();
		@Pc(34) Class84 local34 = super.anInt6915 != -1 && super.anInt6900 == 0 ? Static91.method1822(super.anInt6915) : null;
		@Pc(51) Class84 local51 = super.anInt6901 == -1 || super.aBoolean613 && local34 != null ? null : Static91.method1822(super.anInt6901);
		@Pc(54) int local54 = local11.anInt4900;
		@Pc(57) int local57 = local11.anInt4896;
		if (local54 != 0 || local57 != 0 || local11.anInt4901 != 0 || local11.anInt4885 != 0) {
			arg0 |= 0x7;
		}
		@Pc(105) Class49 local105 = super.aClass49Array3[0] = this.aClass139_1.method4123(super.anInt6943, super.anInt6899, local34, super.anInt6921, arg1, super.anInt6942, arg0, local51, super.aClass212Array3, super.anInt6904, super.anInt6895);
		if (local105 == null) {
			return false;
		}
		super.anInt6909 = local105.method5842();
		this.method5777(local105);
		@Pc(122) int local122 = super.aClass219_7.method5719();
		super.anInt6925 = 0;
		super.anInt6931 = 0;
		super.anInt6897 = 0;
		if (local54 == 0 && local57 == 0) {
			this.method5770(this.method5787() << 7, this.method5787() << 7, local122);
		} else {
			this.method5770(local54, local57, local122);
			if (super.anInt6931 != 0) {
				super.aClass49Array3[0].method5856(super.anInt6931);
			}
			if (super.anInt6925 != 0) {
				super.aClass49Array3[0].method5829(super.anInt6925);
			}
			if (super.anInt6897 != 0) {
				super.aClass49Array3[0].method5849(0, super.anInt6897, 0);
			}
		}
		super.aClass49Array3[1] = null;
		if (super.anInt6902 != -1 && super.anInt6898 != -1) {
			@Pc(221) Class177 local221 = Static41.method4707(super.anInt6902);
			@Pc(240) Class49 local240 = local221.method4854(super.anInt6898, local7 | (local221.aBoolean515 ? 7 : 2), super.anInt6945, arg1, super.anInt6957);
			if (local240 != null) {
				local240.method5849(0, -super.anInt6946, 0);
				if (local221.aBoolean515 && (local54 != 0 || local57 != 0)) {
					if (super.anInt6931 != 0) {
						local240.method5856(super.anInt6931);
					}
					if (super.anInt6925 != 0) {
						local240.method5829(super.anInt6925);
					}
					if (super.anInt6897 != 0) {
						local240.method5849(0, super.anInt6897, 0);
					}
				}
				super.aClass49Array3[1] = local240;
			}
		}
		super.aClass49Array3[2] = null;
		if (super.aClass2_Sub25_3 != null) {
			if (super.aClass2_Sub25_3.anInt4103 <= Static6.anInt91) {
				super.aClass2_Sub25_3 = null;
			} else if (super.aClass2_Sub25_3.anInt4099 <= Static6.anInt91) {
				@Pc(322) Class49 local322 = super.aClass2_Sub25_3.method3504(arg1, local7 | 0x7);
				if (local322 != null) {
					local322.method5849(super.aClass2_Sub25_3.anInt4097 - super.anInt6893, super.aClass2_Sub25_3.anInt4094 - super.anInt6886, super.aClass2_Sub25_3.anInt4105 - super.anInt6888);
					if (local122 != 0) {
						local322.method5857(local122);
					}
					super.aClass49Array3[2] = local322;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBI)V")
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray535[0];
		@Pc(15) int local15 = super.anIntArray534[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.anInt6915 != -1 && Static91.method1822(super.anInt6915).anInt2463 == 1) {
			super.anInt6915 = -1;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt6902 != -1) {
			@Pc(85) Class177 local85 = Static41.method4707(super.anInt6902);
			if (local85.aBoolean516 && local85.anInt5808 != -1 && Static91.method1822(local85.anInt5808).anInt2463 == 1) {
				super.anInt6902 = -1;
			}
		}
		if (super.anInt6962 < 9) {
			super.anInt6962++;
		}
		for (@Pc(122) int local122 = super.anInt6962; local122 > 0; local122--) {
			super.anIntArray535[local122] = super.anIntArray535[local122 - 1];
			super.anIntArray534[local122] = super.anIntArray534[local122 - 1];
			super.aByteArray93[local122] = super.aByteArray93[local122 - 1];
		}
		super.anIntArray535[0] = local10;
		super.anIntArray534[0] = local15;
		super.aByteArray93[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
		if (this.aClass139_1 != null && (super.aBoolean617 || this.method5793(0, arg0))) {
			this.method5781(super.aClass49Array3, arg0, super.aBoolean617);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "(B)Z")
	private boolean method5795() {
		return this.aClass139_1.aBoolean415;
	}

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "(B)Z")
	public boolean method5797() {
		return this.aClass139_1 != null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class2_Sub3_Sub5_Sub1_Sub1 extends Class2_Sub3_Sub5_Sub1 {

	@OriginalMember(owner = "client!dh", name = "cc", descriptor = "I")
	public int anInt940;

	@OriginalMember(owner = "client!dh", name = "ic", descriptor = "I")
	public int anInt945;

	@OriginalMember(owner = "client!dh", name = "lc", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!dh", name = "mc", descriptor = "Lclient!ai;")
	public Class6 aClass6_244;

	@OriginalMember(owner = "client!dh", name = "pc", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!dh", name = "sc", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!dh", name = "tc", descriptor = "Lclient!mg;")
	public Class55 aClass55_1;

	@OriginalMember(owner = "client!dh", name = "uc", descriptor = "Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 aClass2_Sub3_Sub5_Sub7_1;

	@OriginalMember(owner = "client!dh", name = "vc", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!dh", name = "zc", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!dh", name = "hc", descriptor = "I")
	public int anInt944 = -1;

	@OriginalMember(owner = "client!dh", name = "kc", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!dh", name = "jc", descriptor = "I")
	public int anInt946 = 0;

	@OriginalMember(owner = "client!dh", name = "ec", descriptor = "I")
	public int anInt941 = 0;

	@OriginalMember(owner = "client!dh", name = "qc", descriptor = "I")
	public int anInt950 = 0;

	@OriginalMember(owner = "client!dh", name = "Ac", descriptor = "I")
	public int anInt957 = 0;

	@OriginalMember(owner = "client!dh", name = "Bc", descriptor = "I")
	public int anInt958 = 0;

	@OriginalMember(owner = "client!dh", name = "Cc", descriptor = "I")
	public int anInt959 = -1;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method1806() {
		return this.aClass55_1 != null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!me;)V")
	public void method592(@OriginalArg(1) Class2_Sub13 arg0) {
		arg0.anInt2154 = 0;
		@Pc(12) int local12 = arg0.method1402();
		this.anInt944 = arg0.method1394();
		this.anInt959 = arg0.method1394();
		this.anInt946 = 0;
		@Pc(28) int[] local28 = new int[12];
		@Pc(30) int local30 = -1;
		@Pc(53) int local53;
		@Pc(94) int local94;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1402();
			if (local38 == 0) {
				local28[local32] = 0;
			} else {
				local53 = arg0.method1402();
				local28[local32] = (local38 << 8) + local53;
				if (local32 == 0 && local28[0] == 65535) {
					local30 = arg0.method1397();
					break;
				}
				if (local28[local32] >= 512) {
					local94 = Static92.method1502(local28[local32] - 512).anInt2027;
					if (local94 != 0) {
						this.anInt946 = local94;
					}
				}
			}
		}
		@Pc(108) int[] local108 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local94 = arg0.method1402();
			if (local94 < 0 || local94 >= Static18.aShortArrayArray1[local53].length) {
				local94 = 0;
			}
			local108[local53] = local94;
		}
		super.anInt2668 = arg0.method1397();
		if (super.anInt2668 == 65535) {
			super.anInt2668 = -1;
		}
		super.anInt2683 = arg0.method1397();
		if (super.anInt2683 == 65535) {
			super.anInt2683 = -1;
		}
		super.anInt2659 = super.anInt2683;
		super.anInt2667 = arg0.method1397();
		if (super.anInt2667 == 65535) {
			super.anInt2667 = -1;
		}
		super.anInt2700 = arg0.method1397();
		if (super.anInt2700 == 65535) {
			super.anInt2700 = -1;
		}
		super.anInt2706 = arg0.method1397();
		if (super.anInt2706 == 65535) {
			super.anInt2706 = -1;
		}
		super.anInt2656 = arg0.method1397();
		if (super.anInt2656 == 65535) {
			super.anInt2656 = -1;
		}
		super.anInt2703 = arg0.method1397();
		if (super.anInt2703 == 65535) {
			super.anInt2703 = -1;
		}
		this.aClass6_244 = Static49.method884(arg0.method1446()).method106();
		this.anInt941 = arg0.method1402();
		this.anInt958 = arg0.method1397();
		if (this.aClass55_1 == null) {
			this.aClass55_1 = new Class55();
		}
		this.aClass55_1.method1703(local30, local28, local108, local12 == 1);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass55_1 == null) {
			return;
		}
		@Pc(23) Class2_Sub3_Sub8 local23 = super.anInt2658 != -1 && super.anInt2682 == 0 ? Static129.method2790(super.anInt2658) : null;
		@Pc(44) Class2_Sub3_Sub8 local44 = super.anInt2657 == -1 || this.aBoolean35 || super.anInt2668 == super.anInt2657 && local23 != null ? null : Static129.method2790(super.anInt2657);
		@Pc(55) Class2_Sub3_Sub5_Sub7 local55 = this.aClass55_1.method1704(local44, local23, super.anInt2688, super.anInt2665);
		if (local55 == null) {
			return;
		}
		local55.method2312();
		super.aShort25 = local55.aShort25;
		@Pc(66) Class2_Sub3_Sub5_Sub7 local66 = null;
		if (!this.aBoolean35 && super.anInt2708 != -1 && super.anInt2663 != -1) {
			local66 = Static122.method1901(super.anInt2708).method2157(super.anInt2663);
			if (local66 != null) {
				local66.method2305(0, -super.anInt2673, 0);
			}
		}
		@Pc(99) Class2_Sub3_Sub5_Sub7 local99 = null;
		if (!this.aBoolean35 && this.aClass2_Sub3_Sub5_Sub7_1 != null) {
			if (this.anInt950 <= Static107.anInt2559) {
				this.aClass2_Sub3_Sub5_Sub7_1 = null;
			}
			if (this.anInt957 <= Static107.anInt2559 && Static107.anInt2559 < this.anInt950) {
				local99 = this.aClass2_Sub3_Sub5_Sub7_1;
				local99.method2305(this.anInt949 - super.anInt2674, -super.anInt2697 + this.anInt953, this.anInt956 - super.anInt2672);
				if (super.anInt2680 == 512) {
					local99.method2304();
					local99.method2304();
					local99.method2304();
				} else if (super.anInt2680 == 1024) {
					local99.method2304();
					local99.method2304();
				} else if (super.anInt2680 == 1536) {
					local99.method2304();
				}
			}
		}
		if (local66 != null) {
			local55 = ((Class2_Sub3_Sub5_Sub7_Sub1) local55).method2316(local66);
		}
		if (local99 != null) {
			local55 = ((Class2_Sub3_Sub5_Sub7_Sub1) local55).method2316(local99);
		}
		local55.aBoolean142 = true;
		local55.method2297(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local99 == null) {
			return;
		}
		if (super.anInt2680 == 512) {
			local99.method2304();
		} else if (super.anInt2680 == 1024) {
			local99.method2304();
			local99.method2304();
		} else if (super.anInt2680 == 1536) {
			local99.method2304();
			local99.method2304();
			local99.method2304();
		}
		local99.method2305(super.anInt2674 - this.anInt949, -this.anInt953 + super.anInt2697, super.anInt2672 - this.anInt956);
	}
}

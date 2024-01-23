import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class163 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "[Z")
	public boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[I")
	public int[] anIntArray587;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public int anInt5921;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "[I")
	public int[] anIntArray589;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public int anInt5902 = -1;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "I")
	public int anInt5904 = -1;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	public int anInt5903 = 99;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	public int anInt5909 = -1;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	public int anInt5905 = 5;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "I")
	public int anInt5911 = 2;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Z")
	public boolean aBoolean315 = false;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Z")
	public boolean aBoolean314 = false;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Z")
	public boolean aBoolean313 = false;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	public int anInt5908 = -1;

	@OriginalMember(owner = "client!v", name = "B", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "I")
	public int anInt5924 = -1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILclient!lf;B)Lclient!lf;")
	public Class25_Sub2 method4579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub2 arg3) {
		@Pc(14) int local14 = this.anIntArray589[arg1];
		@Pc(19) int local19 = this.anIntArray587[arg1];
		@Pc(25) Class1_Sub2_Sub12 local25 = Static283.method4670(local19 >> 16);
		@Pc(29) int local29 = local19 & 0xFFFF;
		if (local25 == null) {
			return arg3.method3463(true, true, true);
		}
		@Pc(40) Class1_Sub2_Sub12 local40 = null;
		if ((this.aBoolean313 || Static18.aBoolean23) && arg0 != -1 && arg0 < this.anIntArray587.length) {
			@Pc(63) int local63 = this.anIntArray587[arg0];
			local40 = Static283.method4670(local63 >> 16);
			arg0 = local63 & 0xFFFF;
		}
		@Pc(100) Class25_Sub2 local100;
		if (local40 == null) {
			local100 = arg3.method3463(!local25.method1921(local29), !local25.method1922(local29), !this.aBoolean316);
		} else {
			local100 = arg3.method3463(!local25.method1921(local29) & !local40.method1921(arg0), !local25.method1922(local29) & !local40.method1922(arg0), !this.aBoolean316);
		}
		local100.method3479(local25, local29, local40, arg0, arg2 - 1, local14, this.aBoolean316);
		return local100;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIBLclient!lf;)Lclient!lf;")
	public Class25_Sub2 method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class25_Sub2 arg4) {
		@Pc(10) int local10 = this.anIntArray589[arg3];
		@Pc(15) int local15 = this.anIntArray587[arg3];
		@Pc(21) Class1_Sub2_Sub12 local21 = Static283.method4670(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg4.method3482(true, true, true);
		}
		@Pc(38) int local38 = arg1 & 0x3;
		@Pc(40) Class1_Sub2_Sub12 local40 = null;
		if ((this.aBoolean313 || Static18.aBoolean23) && arg0 != -1 && arg0 < this.anIntArray587.length) {
			@Pc(59) int local59 = this.anIntArray587[arg0];
			local40 = Static283.method4670(local59 >> 16);
			arg0 = local59 & 0xFFFF;
		}
		@Pc(101) Class25_Sub2 local101;
		if (local40 == null) {
			local101 = arg4.method3482(!local21.method1921(local25), !local21.method1922(local25), !this.aBoolean316);
		} else {
			local101 = arg4.method3482(!local21.method1921(local25) & !local40.method1921(arg0), !local21.method1922(local25) & !local40.method1922(arg0), !this.aBoolean316);
		}
		if (Static296.aBoolean335 && this.aBoolean316) {
			if (local38 == 1) {
				((Class25_Sub2_Sub1) local101).method643();
			} else if (local38 == 2) {
				((Class25_Sub2_Sub1) local101).method630();
			} else if (local38 == 3) {
				((Class25_Sub2_Sub1) local101).method640();
			}
		} else if (local38 == 1) {
			local101.method3483();
		} else if (local38 == 2) {
			local101.method3490();
		} else if (local38 == 3) {
			local101.method3467();
		}
		local101.method3479(local21, local25, local40, arg0, arg2 - 1, local10, this.aBoolean316);
		if (Static296.aBoolean335 && this.aBoolean316) {
			if (local38 == 1) {
				((Class25_Sub2_Sub1) local101).method640();
			} else if (local38 == 2) {
				((Class25_Sub2_Sub1) local101).method630();
			} else if (local38 == 3) {
				((Class25_Sub2_Sub1) local101).method643();
			}
		} else if (local38 == 1) {
			local101.method3467();
		} else if (local38 == 2) {
			local101.method3490();
		} else if (local38 == 3) {
			local101.method3483();
		}
		return local101;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public void method4581() {
		if (this.anInt5909 == -1) {
			if (this.aBooleanArray23 == null) {
				this.anInt5909 = 0;
			} else {
				this.anInt5909 = 2;
			}
		}
		if (this.anInt5908 != -1) {
			return;
		}
		if (this.aBooleanArray23 == null) {
			this.anInt5908 = 0;
		} else {
			this.anInt5908 = 2;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!im;)V")
	private void method4586(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		@Pc(17) int local17;
		@Pc(23) int local23;
		if (arg0 == 1) {
			local17 = arg1.method2652();
			this.anIntArray589 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray589[local23] = arg1.method2652();
			}
			this.anIntArray587 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray587[local23] = arg1.method2652();
			}
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray587[local23] += arg1.method2652() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt5904 = arg1.method2652();
		} else if (arg0 == 3) {
			this.aBooleanArray23 = new boolean[256];
			local17 = arg1.method2655();
			for (local23 = 0; local23 < local17; local23++) {
				this.aBooleanArray23[arg1.method2655()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean315 = true;
		} else if (arg0 == 5) {
			this.anInt5905 = arg1.method2655();
		} else if (arg0 == 6) {
			this.anInt5924 = arg1.method2652();
		} else if (arg0 == 7) {
			this.anInt5902 = arg1.method2652();
		} else if (arg0 == 8) {
			this.anInt5903 = arg1.method2655();
		} else if (arg0 == 9) {
			this.anInt5908 = arg1.method2655();
		} else if (arg0 == 10) {
			this.anInt5909 = arg1.method2655();
		} else if (arg0 == 11) {
			this.anInt5911 = arg1.method2655();
		} else if (arg0 == 12) {
			local17 = arg1.method2655();
			this.anIntArray588 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray588[local23] = arg1.method2652();
			}
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray588[local23] = (arg1.method2652() << 16) + this.anIntArray588[local23];
			}
		} else if (arg0 == 13) {
			local17 = arg1.method2652();
			this.anIntArrayArray44 = new int[local17][];
			for (local23 = 0; local23 < local17; local23++) {
				@Pc(217) int local217 = arg1.method2655();
				if (local217 > 0) {
					this.anIntArrayArray44[local23] = new int[local217];
					this.anIntArrayArray44[local23][0] = arg1.method2634();
					for (@Pc(236) int local236 = 1; local236 < local217; local236++) {
						this.anIntArrayArray44[local23][local236] = arg1.method2652();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean316 = true;
		} else if (arg0 == 15) {
			this.aBoolean313 = true;
		} else if (arg0 == 16) {
			this.aBoolean314 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZILclient!lf;I)Lclient!lf;")
	public Class25_Sub2 method4587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class25_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = this.anIntArray589[arg0];
		@Pc(25) int local25 = this.anIntArray587[arg0];
		@Pc(31) Class1_Sub2_Sub12 local31 = Static283.method4670(local25 >> 16);
		@Pc(35) int local35 = local25 & 0xFFFF;
		if (local31 == null) {
			return arg2.method3468(true, true, true);
		}
		@Pc(47) Class1_Sub2_Sub12 local47 = null;
		@Pc(49) Class1_Sub2_Sub12 local49 = null;
		if ((this.aBoolean313 || Static18.aBoolean23) && arg1 != -1 && arg1 < this.anIntArray587.length) {
			@Pc(72) int local72 = this.anIntArray587[arg1];
			local49 = Static283.method4670(local72 >> 16);
			arg1 = local72 & 0xFFFF;
		}
		@Pc(84) Class1_Sub2_Sub12 local84 = null;
		@Pc(86) int local86 = 0;
		@Pc(88) int local88 = 0;
		if (this.anIntArray588 != null) {
			if (arg0 < this.anIntArray588.length) {
				local88 = this.anIntArray588[arg0];
				if (local88 != 65535) {
					local47 = Static283.method4670(local88 >> 16);
					local88 &= 0xFFFF;
				}
			}
			if ((this.aBoolean313 || Static18.aBoolean23) && arg1 != -1 && this.anIntArray588.length > arg1) {
				local86 = this.anIntArray588[arg1];
				if (local86 != 65535) {
					local84 = Static283.method4670(local86 >> 16);
					local86 &= 0xFFFF;
				}
			}
		}
		@Pc(161) boolean local161 = !local31.method1921(local35);
		@Pc(170) boolean local170 = !local31.method1922(local35);
		if (local47 != null) {
			local161 &= !local47.method1921(local88);
			local170 &= !local47.method1922(local88);
		}
		if (local49 != null) {
			local161 &= !local49.method1921(arg1);
			local170 &= !local49.method1922(arg1);
		}
		if (local84 != null) {
			local161 &= !local84.method1921(local86);
			local170 &= !local84.method1922(local86);
		}
		@Pc(255) Class25_Sub2 local255 = arg2.method3468(local161, local170, !this.aBoolean316);
		local255.method3479(local31, local35, local49, arg1, arg3 - 1, local20, this.aBoolean316);
		if (local47 != null) {
			local255.method3479(local47, local88, local84, local86, arg3 - 1, local20, this.aBoolean316);
		}
		return local255;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!im;I)V")
	public void method4589(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2655();
			if (local5 == 0) {
				return;
			}
			this.method4586(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIILclient!lf;)Lclient!lf;")
	public Class25_Sub2 method4590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25_Sub2 arg4) {
		@Pc(12) int local12 = this.anIntArray589[arg0];
		@Pc(17) int local17 = this.anIntArray587[arg0];
		@Pc(27) Class1_Sub2_Sub12 local27 = Static283.method4670(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return arg4.method3468(true, true, true);
		}
		@Pc(44) int local44 = arg3 & 0x3;
		@Pc(46) Class1_Sub2_Sub12 local46 = null;
		if ((this.aBoolean313 || Static18.aBoolean23) && arg2 != -1 && arg2 < this.anIntArray587.length) {
			@Pc(70) int local70 = this.anIntArray587[arg2];
			local46 = Static283.method4670(local70 >> 16);
			arg2 = local70 & 0xFFFF;
		}
		@Pc(130) Class25_Sub2 local130;
		if (local46 == null) {
			local130 = arg4.method3468(!local27.method1921(local31), !local27.method1922(local31), !this.aBoolean316);
		} else {
			local130 = arg4.method3468(!local27.method1921(local31) & !local46.method1921(arg2), !local27.method1922(local31) & !local46.method1922(arg2), !this.aBoolean316);
		}
		if (this.aBoolean316 && Static296.aBoolean335) {
			if (local44 == 1) {
				((Class25_Sub2_Sub1) local130).method643();
			} else if (local44 == 2) {
				((Class25_Sub2_Sub1) local130).method630();
			} else if (local44 == 3) {
				((Class25_Sub2_Sub1) local130).method640();
			}
		} else if (local44 == 1) {
			local130.method3483();
		} else if (local44 == 2) {
			local130.method3490();
		} else if (local44 == 3) {
			local130.method3467();
		}
		local130.method3479(local27, local31, local46, arg2, arg1 - 1, local12, this.aBoolean316);
		if (this.aBoolean316 && Static296.aBoolean335) {
			if (local44 == 1) {
				((Class25_Sub2_Sub1) local130).method640();
			} else if (local44 == 2) {
				((Class25_Sub2_Sub1) local130).method630();
			} else if (local44 == 3) {
				((Class25_Sub2_Sub1) local130).method643();
			}
		} else if (local44 == 1) {
			local130.method3467();
		} else if (local44 == 2) {
			local130.method3490();
		} else if (local44 == 3) {
			local130.method3483();
		}
		return local130;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class167 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	public int anInt5119;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "[Z")
	public boolean[] aBooleanArray54;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public int anInt5115 = -1;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public int anInt5121 = -1;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public int anInt5114 = 5;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
	public int anInt5122 = -1;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
	public int anInt5131 = 2;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Z")
	public boolean aBoolean368 = false;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
	public int anInt5132 = -1;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
	public int anInt5133 = -1;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	public int anInt5124 = 99;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Z")
	public boolean aBoolean367 = false;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!hc;IIIZ)Lclient!hc;")
	public Class22_Sub4 method3968(@OriginalArg(0) Class22_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.anIntArray463[arg2];
		@Pc(19) int local19 = this.anIntArray461[arg2];
		@Pc(25) Class1_Sub1_Sub24 local25 = Static270.method3983(local19 >> 16);
		@Pc(29) int local29 = local19 & 0xFFFF;
		if (local25 == null) {
			return arg0.method3569(true, true, true);
		}
		@Pc(41) Class1_Sub1_Sub24 local41 = null;
		if ((this.aBoolean367 || Static110.aBoolean163) && arg1 != -1 && arg1 < this.anIntArray461.length) {
			@Pc(60) int local60 = this.anIntArray461[arg1];
			local41 = Static270.method3983(local60 >> 16);
			arg1 = local60 & 0xFFFF;
		}
		@Pc(72) Class1_Sub1_Sub24 local72 = null;
		@Pc(74) Class1_Sub1_Sub24 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray462 != null) {
			if (arg2 < this.anIntArray462.length) {
				local76 = this.anIntArray462[arg2];
				if (local76 != 65535) {
					local72 = Static270.method3983(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean367 || Static110.aBoolean163) && arg1 != -1 && arg1 < this.anIntArray462.length) {
				local78 = this.anIntArray462[arg1];
				if (local78 != 65535) {
					local74 = Static270.method3983(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		@Pc(150) boolean local150 = !local25.method4482(local29);
		@Pc(159) boolean local159 = !local25.method4484(local29);
		if (local72 != null) {
			local150 &= !local72.method4482(local76);
			local159 &= !local72.method4484(local76);
		}
		if (local41 != null) {
			local150 &= !local41.method4482(arg1);
			local159 &= !local41.method4484(arg1);
		}
		if (local74 != null) {
			local150 &= !local74.method4482(local78);
			local159 &= !local74.method4484(local78);
		}
		@Pc(246) Class22_Sub4 local246 = arg0.method3569(local150, local159, !this.aBoolean366);
		local246.method3552(local25, local29, local41, arg1, arg3 - 1, local8, this.aBoolean366);
		if (local72 != null) {
			local246.method3552(local72, local76, local74, local78, arg3 - 1, local8, this.aBoolean366);
		}
		return local246;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!sb;B)V")
	private void method3969(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		if (arg0 == 1) {
			local10 = arg1.method2593();
			this.anIntArray463 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray463[local16] = arg1.method2593();
			}
			this.anIntArray461 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray461[local16] = arg1.method2593();
			}
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray461[local16] = (arg1.method2593() << 16) + this.anIntArray461[local16];
			}
		} else if (arg0 == 2) {
			this.anInt5122 = arg1.method2593();
		} else if (arg0 == 3) {
			this.aBooleanArray54 = new boolean[256];
			local10 = arg1.method2595();
			for (local16 = 0; local16 < local10; local16++) {
				this.aBooleanArray54[arg1.method2595()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean365 = true;
		} else if (arg0 == 5) {
			this.anInt5114 = arg1.method2595();
		} else if (arg0 == 6) {
			this.anInt5133 = arg1.method2593();
		} else if (arg0 == 7) {
			this.anInt5132 = arg1.method2593();
		} else if (arg0 == 8) {
			this.anInt5124 = arg1.method2595();
		} else if (arg0 == 9) {
			this.anInt5121 = arg1.method2595();
		} else if (arg0 == 10) {
			this.anInt5115 = arg1.method2595();
		} else if (arg0 == 11) {
			this.anInt5131 = arg1.method2595();
		} else if (arg0 == 12) {
			local10 = arg1.method2595();
			this.anIntArray462 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray462[local16] = arg1.method2593();
			}
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray462[local16] += arg1.method2593() << 16;
			}
		} else if (arg0 == 13) {
			local10 = arg1.method2593();
			this.anIntArrayArray40 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(207) int local207 = arg1.method2595();
				if (local207 > 0) {
					this.anIntArrayArray40[local16] = new int[local207];
					this.anIntArrayArray40[local16][0] = arg1.method2588();
					for (@Pc(229) int local229 = 1; local229 < local207; local229++) {
						this.anIntArrayArray40[local16][local229] = arg1.method2593();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean366 = true;
		} else if (arg0 == 15) {
			this.aBoolean367 = true;
		} else if (arg0 == 16) {
			this.aBoolean368 = true;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!hc;IIIBI)Lclient!hc;")
	public Class22_Sub4 method3970(@OriginalArg(0) Class22_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray463[arg1];
		@Pc(15) int local15 = this.anIntArray461[arg1];
		@Pc(21) Class1_Sub1_Sub24 local21 = Static270.method3983(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg0.method3569(true, true, true);
		}
		@Pc(44) int local44 = arg4 & 0x3;
		@Pc(46) Class1_Sub1_Sub24 local46 = null;
		if ((this.aBoolean367 || Static110.aBoolean163) && arg3 != -1 && this.anIntArray461.length > arg3) {
			@Pc(64) int local64 = this.anIntArray461[arg3];
			local46 = Static270.method3983(local64 >> 16);
			arg3 = local64 & 0xFFFF;
		}
		@Pc(101) Class22_Sub4 local101;
		if (local46 == null) {
			local101 = arg0.method3569(!local21.method4482(local25), !local21.method4484(local25), !this.aBoolean366);
		} else {
			local101 = arg0.method3569(!local21.method4482(local25) & !local46.method4482(arg3), !local21.method4484(local25) & !local46.method4484(arg3), !this.aBoolean366);
		}
		if (this.aBoolean366 && Static291.aBoolean404) {
			if (local44 == 1) {
				((Class22_Sub4_Sub1) local101).method1581();
			} else if (local44 == 2) {
				((Class22_Sub4_Sub1) local101).method1571();
			} else if (local44 == 3) {
				((Class22_Sub4_Sub1) local101).method1582();
			}
		} else if (local44 == 1) {
			local101.method3556();
		} else if (local44 == 2) {
			local101.method3555();
		} else if (local44 == 3) {
			local101.method3578();
		}
		local101.method3552(local21, local25, local46, arg3, arg2 - 1, local10, this.aBoolean366);
		if (this.aBoolean366 && Static291.aBoolean404) {
			if (local44 == 1) {
				((Class22_Sub4_Sub1) local101).method1582();
			} else if (local44 == 2) {
				((Class22_Sub4_Sub1) local101).method1571();
			} else if (local44 == 3) {
				((Class22_Sub4_Sub1) local101).method1581();
			}
		} else if (local44 == 1) {
			local101.method3578();
		} else if (local44 == 2) {
			local101.method3555();
		} else if (local44 == 3) {
			local101.method3556();
		}
		return local101;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public void method3972() {
		if (this.anInt5121 == -1) {
			if (this.aBooleanArray54 == null) {
				this.anInt5121 = 0;
			} else {
				this.anInt5121 = 2;
			}
		}
		if (this.anInt5115 != -1) {
			return;
		}
		if (this.aBooleanArray54 == null) {
			this.anInt5115 = 0;
		} else {
			this.anInt5115 = 2;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLclient!sb;)V")
	public void method3973(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method2595();
			if (local16 == 0) {
				return;
			}
			this.method3969(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!hc;II)Lclient!hc;")
	public Class22_Sub4 method3974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray463[arg1];
		@Pc(13) int local13 = this.anIntArray461[arg1];
		@Pc(19) Class1_Sub1_Sub24 local19 = Static270.method3983(local13 >> 16);
		@Pc(36) int local36 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg2.method3568(true, true, true);
		}
		@Pc(47) Class1_Sub1_Sub24 local47 = null;
		if ((this.aBoolean367 || Static110.aBoolean163) && arg3 != -1 && this.anIntArray461.length > arg3) {
			@Pc(68) int local68 = this.anIntArray461[arg3];
			local47 = Static270.method3983(local68 >> 16);
			arg3 = local68 & 0xFFFF;
		}
		@Pc(106) Class22_Sub4 local106;
		if (local47 == null) {
			local106 = arg2.method3568(!local19.method4482(local36), !local19.method4484(local36), !this.aBoolean366);
		} else {
			local106 = arg2.method3568(!local19.method4482(local36) & !local47.method4482(arg3), !local19.method4484(local36) & !local47.method4484(arg3), !this.aBoolean366);
		}
		local106.method3552(local19, local36, local47, arg3, arg0 - 1, local8, this.aBoolean366);
		return local106;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIILclient!hc;)Lclient!hc;")
	public Class22_Sub4 method3979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class22_Sub4 arg4) {
		@Pc(10) int local10 = this.anIntArray463[arg0];
		@Pc(15) int local15 = this.anIntArray461[arg0];
		@Pc(21) Class1_Sub1_Sub24 local21 = Static270.method3983(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg4.method3563(true, true, true);
		}
		@Pc(38) int local38 = arg3 & 0x3;
		@Pc(46) Class1_Sub1_Sub24 local46 = null;
		if ((this.aBoolean367 || Static110.aBoolean163) && arg1 != -1 && arg1 < this.anIntArray461.length) {
			@Pc(64) int local64 = this.anIntArray461[arg1];
			local46 = Static270.method3983(local64 >> 16);
			arg1 = local64 & 0xFFFF;
		}
		@Pc(121) Class22_Sub4 local121;
		if (local46 == null) {
			local121 = arg4.method3563(!local21.method4482(local25), !local21.method4484(local25), !this.aBoolean366);
		} else {
			local121 = arg4.method3563(!local21.method4482(local25) & !local46.method4482(arg1), !local21.method4484(local25) & !local46.method4484(arg1), !this.aBoolean366);
		}
		if (Static291.aBoolean404 && this.aBoolean366) {
			if (local38 == 1) {
				((Class22_Sub4_Sub1) local121).method1581();
			} else if (local38 == 2) {
				((Class22_Sub4_Sub1) local121).method1571();
			} else if (local38 == 3) {
				((Class22_Sub4_Sub1) local121).method1582();
			}
		} else if (local38 == 1) {
			local121.method3556();
		} else if (local38 == 2) {
			local121.method3555();
		} else if (local38 == 3) {
			local121.method3578();
		}
		local121.method3552(local21, local25, local46, arg1, arg2 - 1, local10, this.aBoolean366);
		if (Static291.aBoolean404 && this.aBoolean366) {
			if (local38 == 1) {
				((Class22_Sub4_Sub1) local121).method1582();
			} else if (local38 == 2) {
				((Class22_Sub4_Sub1) local121).method1571();
			} else if (local38 == 3) {
				((Class22_Sub4_Sub1) local121).method1581();
			}
		} else if (local38 == 1) {
			local121.method3578();
		} else if (local38 == 2) {
			local121.method3555();
		} else if (local38 == 3) {
			local121.method3556();
		}
		return local121;
	}
}

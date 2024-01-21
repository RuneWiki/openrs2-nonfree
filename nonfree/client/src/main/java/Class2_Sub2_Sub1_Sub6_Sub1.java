import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub2_Sub1_Sub6_Sub1 extends Class2_Sub2_Sub1_Sub6 {

	@OriginalMember(owner = "client!vg", name = "Mc", descriptor = "Lclient!a;")
	public Class1 aClass1_2;

	@OriginalMember(owner = "client!vg", name = "Pc", descriptor = "I")
	public int anInt4333;

	@OriginalMember(owner = "client!vg", name = "Qc", descriptor = "I")
	public int anInt4334;

	@OriginalMember(owner = "client!vg", name = "Tc", descriptor = "Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!vg", name = "Wc", descriptor = "Lclient!sg;")
	public Class77 aClass77_1482;

	@OriginalMember(owner = "client!vg", name = "Xc", descriptor = "I")
	public int anInt4337;

	@OriginalMember(owner = "client!vg", name = "Yc", descriptor = "I")
	public int anInt4338;

	@OriginalMember(owner = "client!vg", name = "bd", descriptor = "I")
	public int anInt4340;

	@OriginalMember(owner = "client!vg", name = "fd", descriptor = "I")
	public int anInt4341;

	@OriginalMember(owner = "client!vg", name = "hd", descriptor = "I")
	public int anInt4343;

	@OriginalMember(owner = "client!vg", name = "kd", descriptor = "I")
	public int anInt4346;

	@OriginalMember(owner = "client!vg", name = "Ic", descriptor = "I")
	public int anInt4328 = -1;

	@OriginalMember(owner = "client!vg", name = "Hc", descriptor = "I")
	public int anInt4327 = 0;

	@OriginalMember(owner = "client!vg", name = "Lc", descriptor = "I")
	public int anInt4330 = 0;

	@OriginalMember(owner = "client!vg", name = "Oc", descriptor = "I")
	public int anInt4332 = 0;

	@OriginalMember(owner = "client!vg", name = "ad", descriptor = "I")
	public int anInt4339 = -1;

	@OriginalMember(owner = "client!vg", name = "Uc", descriptor = "I")
	public int anInt4336 = 0;

	@OriginalMember(owner = "client!vg", name = "gd", descriptor = "I")
	public int anInt4342 = 0;

	@OriginalMember(owner = "client!vg", name = "Jc", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass1_2 == null) {
			return;
		}
		@Pc(24) Class2_Sub2_Sub15 local24 = super.anInt4399 != -1 && super.anInt4376 == 0 ? Static140.method2333(super.anInt4399) : null;
		@Pc(45) Class2_Sub2_Sub15 local45 = super.anInt4389 == -1 || this.aBoolean177 || super.anInt4413 == super.anInt4389 && local24 != null ? null : Static140.method2333(super.anInt4389);
		@Pc(56) Class2_Sub2_Sub1_Sub2 local56 = this.aClass1_2.method9(super.anInt4406, local45, local24, super.anInt4373);
		if (local56 == null) {
			return;
		}
		@Pc(61) Class2_Sub2_Sub1_Sub2 local61 = null;
		@Pc(63) Class2_Sub2_Sub1_Sub2 local63 = null;
		if (!this.aBoolean177 && super.anInt4404 != -1 && super.anInt4390 != -1) {
			local61 = Static41.method808(super.anInt4404).method1342(super.anInt4390);
			if (local61 != null) {
				local61.method585(0, -super.anInt4379, 0);
			}
		}
		if (!this.aBoolean177 && this.aClass2_Sub2_Sub1_Sub2_1 != null) {
			if (Static143.anInt3513 >= this.anInt4332) {
				this.aClass2_Sub2_Sub1_Sub2_1 = null;
			}
			if (Static143.anInt3513 >= this.anInt4336 && this.anInt4332 > Static143.anInt3513) {
				local63 = this.aClass2_Sub2_Sub1_Sub2_1;
				local63.method585(this.anInt4341 - super.anInt4400, this.anInt4343 + -this.anInt4346, this.anInt4337 - super.anInt4385);
				if (super.anInt4387 == 512) {
					local63.method586();
					local63.method586();
					local63.method586();
				} else if (super.anInt4387 == 1024) {
					local63.method586();
					local63.method586();
				} else if (super.anInt4387 == 1536) {
					local63.method586();
				}
			}
		}
		if (local61 != null) {
			local56 = ((Class2_Sub2_Sub1_Sub2_Sub1) local56).method598(local61);
		}
		if (local63 != null) {
			local56 = ((Class2_Sub2_Sub1_Sub2_Sub1) local56).method598(local63);
		}
		local56.aBoolean47 = true;
		local56.method2907(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		super.aShort32 = local56.aShort32;
		if (local63 == null) {
			return;
		}
		if (super.anInt4387 == 512) {
			local63.method586();
		} else if (super.anInt4387 == 1024) {
			local63.method586();
			local63.method586();
		} else if (super.anInt4387 == 1536) {
			local63.method586();
			local63.method586();
			local63.method586();
		}
		local63.method585(super.anInt4400 - this.anInt4341, this.anInt4346 - this.anInt4343, super.anInt4385 - this.anInt4337);
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method2916() {
		return this.aClass1_2 != null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method2894(@OriginalArg(0) Class2_Sub18 arg0) {
		arg0.anInt3423 = 0;
		@Pc(6) int local6 = arg0.method2387();
		this.anInt4339 = arg0.method2392();
		@Pc(14) int[] local14 = new int[12];
		this.anInt4328 = arg0.method2392();
		@Pc(21) int local21 = -1;
		this.anInt4327 = 0;
		@Pc(49) int local49;
		@Pc(84) int local84;
		for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
			@Pc(35) int local35 = arg0.method2387();
			if (local35 == 0) {
				local14[local30] = 0;
			} else {
				local49 = arg0.method2387();
				local14[local30] = (local35 << 8) + local49;
				if (local30 == 0 && local14[0] == 65535) {
					local21 = arg0.method2353();
					break;
				}
				if (local14[local30] >= 512) {
					local84 = Static158.method2689(local14[local30] - 512).anInt1806;
					if (local84 != 0) {
						this.anInt4327 = local84;
					}
				}
			}
		}
		@Pc(96) int[] local96 = new int[5];
		for (local49 = 0; local49 < 5; local49++) {
			local84 = arg0.method2387();
			if (local84 < 0 || local84 >= Static63.aShortArrayArray6[local49].length) {
				local84 = 0;
			}
			local96[local49] = local84;
		}
		super.anInt4413 = arg0.method2353();
		if (super.anInt4413 == 65535) {
			super.anInt4413 = -1;
		}
		super.anInt4418 = arg0.method2353();
		if (super.anInt4418 == 65535) {
			super.anInt4418 = -1;
		}
		super.anInt4412 = super.anInt4418;
		super.anInt4380 = arg0.method2353();
		if (super.anInt4380 == 65535) {
			super.anInt4380 = -1;
		}
		super.anInt4388 = arg0.method2353();
		if (super.anInt4388 == 65535) {
			super.anInt4388 = -1;
		}
		super.anInt4407 = arg0.method2353();
		if (super.anInt4407 == 65535) {
			super.anInt4407 = -1;
		}
		super.anInt4425 = arg0.method2353();
		if (super.anInt4425 == 65535) {
			super.anInt4425 = -1;
		}
		super.anInt4395 = arg0.method2353();
		if (super.anInt4395 == 65535) {
			super.anInt4395 = -1;
		}
		this.aClass77_1482 = Static107.method1884(arg0.method2346()).method2525();
		this.anInt4342 = arg0.method2387();
		this.anInt4330 = arg0.method2353();
		if (this.aClass1_2 == null) {
			this.aClass1_2 = new Class1();
		}
		this.aClass1_2.method1(local96, local21, local14, local6 == 1);
	}
}

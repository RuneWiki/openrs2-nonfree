import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class3_Sub7_Sub4 extends Class3_Sub7 {

	@OriginalMember(owner = "client!iha", name = "u", descriptor = "Lclient!qia;")
	public final Class276 aClass276_34 = new Class276();

	@OriginalMember(owner = "client!iha", name = "C", descriptor = "Lclient!db;")
	public final Class3_Sub7_Sub3 aClass3_Sub7_Sub3_1 = new Class3_Sub7_Sub3();

	@OriginalMember(owner = "client!iha", name = "v", descriptor = "Lclient!nl;")
	private final Class3_Sub7_Sub5 aClass3_Sub7_Sub5_2;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!nl;)V")
	public Class3_Sub7_Sub4(@OriginalArg(0) Class3_Sub7_Sub5 arg0) {
		this.aClass3_Sub7_Sub5_2 = arg0;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!dg;II[IIZ)V")
	private void method4497(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass3_Sub7_Sub5_2.anIntArray423[arg0.anInt2491] & 0x4) != 0 && arg0.anInt2483 < 0) {
			@Pc(32) int local32 = this.aClass3_Sub7_Sub5_2.anIntArray429[arg0.anInt2491] / Static590.anInt9843;
			while (true) {
				@Pc(42) int local42 = (local32 + 1048575 - arg0.anInt2499) / local32;
				if (local42 > arg2) {
					arg0.anInt2499 += local32 * arg2;
					break;
				}
				arg0.aClass3_Sub7_Sub1_1.method6004(arg3, arg4, local42);
				arg0.anInt2499 += local32 * local42 - 1048576;
				arg4 += local42;
				arg2 -= local42;
				@Pc(73) int local73 = Static590.anInt9843 / 100;
				@Pc(77) int local77 = 262144 / local32;
				if (local73 > local77) {
					local73 = local77;
				}
				@Pc(85) Class3_Sub7_Sub1 local85 = arg0.aClass3_Sub7_Sub1_1;
				if (this.aClass3_Sub7_Sub5_2.anIntArray425[arg0.anInt2491] == 0) {
					arg0.aClass3_Sub7_Sub1_1 = Static650.method680(arg0.aClass3_Sub12_Sub1_1, local85.method664(), local85.method684(), local85.method662());
				} else {
					arg0.aClass3_Sub7_Sub1_1 = Static650.method680(arg0.aClass3_Sub12_Sub1_1, local85.method664(), 0, local85.method662());
					this.aClass3_Sub7_Sub5_2.method6034(arg0, arg0.aClass3_Sub6_1.aShortArray7[arg0.anInt2496] < 0);
					arg0.aClass3_Sub7_Sub1_1.method646(local73, local85.method684());
				}
				if (arg0.aClass3_Sub6_1.aShortArray7[arg0.anInt2496] < 0) {
					arg0.aClass3_Sub7_Sub1_1.method650(-1);
				}
				local85.method677(local73);
				local85.method6004(arg3, arg4, arg1 - arg4);
				if (local85.method673()) {
					this.aClass3_Sub7_Sub3_1.method2209(local85);
				}
			}
		}
		arg0.aClass3_Sub7_Sub1_1.method6004(arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "()Lclient!rn;")
	@Override
	public Class3_Sub7 method6006() {
		@Pc(9) Class3_Sub16 local9;
		do {
			local9 = (Class3_Sub16) this.aClass276_34.method6912();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub7_Sub1_1 == null);
		return local9.aClass3_Sub7_Sub1_1;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "()Lclient!rn;")
	@Override
	public Class3_Sub7 method6005() {
		@Pc(9) Class3_Sub16 local9 = (Class3_Sub16) this.aClass276_34.method6907();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub7_Sub1_1 == null) {
			return this.method6006();
		} else {
			return local9.aClass3_Sub7_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0) {
		this.aClass3_Sub7_Sub3_1.method6002(arg0);
		for (@Pc(15) Class3_Sub16 local15 = (Class3_Sub16) this.aClass276_34.method6907(); local15 != null; local15 = (Class3_Sub16) this.aClass276_34.method6912()) {
			if (!this.aClass3_Sub7_Sub5_2.method6010(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2482) {
						this.method4502(local25, local15);
						local15.anInt2482 -= local25;
						break;
					}
					this.method4502(local15.anInt2482, local15);
					local25 -= local15.anInt2482;
				} while (!this.aClass3_Sub7_Sub5_2.method6039(null, local25, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "()I")
	@Override
	public int method6000() {
		return 0;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IILclient!dg;)V")
	private void method4502(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub16 arg1) {
		if ((this.aClass3_Sub7_Sub5_2.anIntArray423[arg1.anInt2491] & 0x4) != 0 && arg1.anInt2483 < 0) {
			@Pc(23) int local23 = this.aClass3_Sub7_Sub5_2.anIntArray429[arg1.anInt2491] / Static590.anInt9843;
			@Pc(34) int local34 = (local23 + 1048575 - arg1.anInt2499) / local23;
			arg1.anInt2499 = arg1.anInt2499 + local23 * arg0 & 0xFFFFF;
			if (local34 <= arg0) {
				if (this.aClass3_Sub7_Sub5_2.anIntArray425[arg1.anInt2491] == 0) {
					arg1.aClass3_Sub7_Sub1_1 = Static650.method680(arg1.aClass3_Sub12_Sub1_1, arg1.aClass3_Sub7_Sub1_1.method664(), arg1.aClass3_Sub7_Sub1_1.method684(), arg1.aClass3_Sub7_Sub1_1.method662());
				} else {
					arg1.aClass3_Sub7_Sub1_1 = Static650.method680(arg1.aClass3_Sub12_Sub1_1, arg1.aClass3_Sub7_Sub1_1.method664(), 0, arg1.aClass3_Sub7_Sub1_1.method662());
					this.aClass3_Sub7_Sub5_2.method6034(arg1, arg1.aClass3_Sub6_1.aShortArray7[arg1.anInt2496] < 0);
				}
				if (arg1.aClass3_Sub6_1.aShortArray7[arg1.anInt2496] < 0) {
					arg1.aClass3_Sub7_Sub1_1.method650(-1);
				}
				arg0 = arg1.anInt2499 / local23;
			}
		}
		arg1.aClass3_Sub7_Sub1_1.method6002(arg0);
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "([III)V")
	@Override
	public void method6004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub7_Sub3_1.method6004(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub16 local17 = (Class3_Sub16) this.aClass276_34.method6907(); local17 != null; local17 = (Class3_Sub16) this.aClass276_34.method6912()) {
			if (!this.aClass3_Sub7_Sub5_2.method6010(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt2482) {
						this.method4497(local17, local29 + local27, local29, arg0, local27);
						local17.anInt2482 -= local29;
						break;
					}
					this.method4497(local17, local29 + local27, local17.anInt2482, arg0, local27);
					local29 -= local17.anInt2482;
					local27 += local17.anInt2482;
				} while (!this.aClass3_Sub7_Sub5_2.method6039(arg0, local29, local27, local17));
			}
		}
	}
}

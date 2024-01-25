import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "Lclient!ui;")
	public final Class295 aClass295_32 = new Class295();

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "Lclient!gw;")
	public final Class1_Sub4_Sub2 aClass1_Sub4_Sub2_1 = new Class1_Sub4_Sub2();

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "Lclient!wb;")
	private final Class1_Sub4_Sub4 aClass1_Sub4_Sub4_2;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!wb;)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) Class1_Sub4_Sub4 arg0) {
		this.aClass1_Sub4_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBLclient!nl;)V")
	private void method5346(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub40 arg1) {
		if ((this.aClass1_Sub4_Sub4_2.anIntArray809[arg1.anInt6136] & 0x4) != 0 && arg1.anInt6127 < 0) {
			@Pc(31) int local31 = this.aClass1_Sub4_Sub4_2.anIntArray800[arg1.anInt6136] / Static411.anInt9206;
			@Pc(41) int local41 = (local31 + 1048575 - arg1.anInt6130) / local31;
			arg1.anInt6130 = arg0 * local31 + arg1.anInt6130 & 0xFFFFF;
			if (arg0 >= local41) {
				if (this.aClass1_Sub4_Sub4_2.anIntArray799[arg1.anInt6136] == 0) {
					arg1.aClass1_Sub4_Sub1_4 = Static546.method1196(arg1.aClass1_Sub30_Sub1_2, arg1.aClass1_Sub4_Sub1_4.method1205(), arg1.aClass1_Sub4_Sub1_4.method1213(), arg1.aClass1_Sub4_Sub1_4.method1181());
				} else {
					arg1.aClass1_Sub4_Sub1_4 = Static546.method1196(arg1.aClass1_Sub30_Sub1_2, arg1.aClass1_Sub4_Sub1_4.method1205(), 0, arg1.aClass1_Sub4_Sub1_4.method1181());
					this.aClass1_Sub4_Sub4_2.method8012(arg1, arg1.aClass1_Sub47_1.aShortArray140[arg1.anInt6143] < 0);
				}
				if (arg1.aClass1_Sub47_1.aShortArray140[arg1.anInt6143] < 0) {
					arg1.aClass1_Sub4_Sub1_4.method1201(-1);
				}
				arg0 = arg1.anInt6130 / local31;
			}
		}
		arg1.aClass1_Sub4_Sub1_4.method7981(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()Lclient!vv;")
	@Override
	public Class1_Sub4 method7983() {
		@Pc(9) Class1_Sub40 local9 = (Class1_Sub40) this.aClass295_32.method7543();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub4_Sub1_4 == null) {
			return this.method7984();
		} else {
			return local9.aClass1_Sub4_Sub1_4;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	@Override
	public void method7981(@OriginalArg(0) int arg0) {
		this.aClass1_Sub4_Sub2_1.method7981(arg0);
		for (@Pc(15) Class1_Sub40 local15 = (Class1_Sub40) this.aClass295_32.method7543(); local15 != null; local15 = (Class1_Sub40) this.aClass295_32.method7540()) {
			if (!this.aClass1_Sub4_Sub4_2.method8022(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6144) {
						this.method5346(local25, local15);
						local15.anInt6144 -= local25;
						break;
					}
					this.method5346(local15.anInt6144, local15);
					local25 -= local15.anInt6144;
				} while (!this.aClass1_Sub4_Sub4_2.method7991(0, null, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!nl;[IIBII)V")
	private void method5349(@OriginalArg(0) Class1_Sub40 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub4_Sub4_2.anIntArray809[arg0.anInt6136] & 0x4) != 0 && arg0.anInt6127 < 0) {
			@Pc(40) int local40 = this.aClass1_Sub4_Sub4_2.anIntArray800[arg0.anInt6136] / Static411.anInt9206;
			while (true) {
				@Pc(49) int local49 = (local40 + 1048575 - arg0.anInt6130) / local40;
				if (local49 > arg3) {
					arg0.anInt6130 += arg3 * local40;
					break;
				}
				arg0.aClass1_Sub4_Sub1_4.method7986(arg1, arg2, local49);
				arg3 -= local49;
				arg0.anInt6130 += local49 * local40 - 1048576;
				arg2 += local49;
				@Pc(84) int local84 = Static411.anInt9206 / 100;
				@Pc(88) int local88 = 262144 / local40;
				if (local84 > local88) {
					local84 = local88;
				}
				@Pc(96) Class1_Sub4_Sub1 local96 = arg0.aClass1_Sub4_Sub1_4;
				if (this.aClass1_Sub4_Sub4_2.anIntArray799[arg0.anInt6136] == 0) {
					arg0.aClass1_Sub4_Sub1_4 = Static546.method1196(arg0.aClass1_Sub30_Sub1_2, local96.method1205(), local96.method1213(), local96.method1181());
				} else {
					arg0.aClass1_Sub4_Sub1_4 = Static546.method1196(arg0.aClass1_Sub30_Sub1_2, local96.method1205(), 0, local96.method1181());
					this.aClass1_Sub4_Sub4_2.method8012(arg0, arg0.aClass1_Sub47_1.aShortArray140[arg0.anInt6143] < 0);
					arg0.aClass1_Sub4_Sub1_4.method1185(local84, local96.method1213());
				}
				if (arg0.aClass1_Sub47_1.aShortArray140[arg0.anInt6143] < 0) {
					arg0.aClass1_Sub4_Sub1_4.method1201(-1);
				}
				local96.method1191(local84);
				local96.method7986(arg1, arg2, arg4 - arg2);
				if (local96.method1195()) {
					this.aClass1_Sub4_Sub2_1.method3189(local96);
				}
			}
		}
		arg0.aClass1_Sub4_Sub1_4.method7986(arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()Lclient!vv;")
	@Override
	public Class1_Sub4 method7984() {
		@Pc(9) Class1_Sub40 local9;
		do {
			local9 = (Class1_Sub40) this.aClass295_32.method7540();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub4_Sub1_4 == null);
		return local9.aClass1_Sub4_Sub1_4;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "([III)V")
	@Override
	public void method7986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub4_Sub2_1.method7986(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub40 local17 = (Class1_Sub40) this.aClass295_32.method7543(); local17 != null; local17 = (Class1_Sub40) this.aClass295_32.method7540()) {
			if (!this.aClass1_Sub4_Sub4_2.method8022(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt6144) {
						this.method5349(local17, arg0, local27, local29, local27 + local29);
						local17.anInt6144 -= local29;
						break;
					}
					this.method5349(local17, arg0, local27, local17.anInt6144, local29 + local27);
					local29 -= local17.anInt6144;
					local27 += local17.anInt6144;
				} while (!this.aClass1_Sub4_Sub4_2.method7991(local27, arg0, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "()I")
	@Override
	public int method7987() {
		return 0;
	}
}

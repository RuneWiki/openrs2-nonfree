import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class4_Sub7_Sub2 extends Class4_Sub7 {

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16384];

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16384];

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "Lclient!oe;")
	public final Class244 aClass244_26 = new Class244();

	@OriginalMember(owner = "client!hm", name = "C", descriptor = "Lclient!bb;")
	public final Class4_Sub7_Sub1 aClass4_Sub7_Sub1_1 = new Class4_Sub7_Sub1();

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "Lclient!mt;")
	private final Class4_Sub7_Sub3 aClass4_Sub7_Sub3_1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray23[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray24[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!mt;)V")
	public Class4_Sub7_Sub2(@OriginalArg(0) Class4_Sub7_Sub3 arg0) {
		this.aClass4_Sub7_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class4_Sub7 method6404() {
		@Pc(9) Class4_Sub43 local9;
		do {
			local9 = (Class4_Sub43) this.aClass244_26.method5965();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub7_Sub4_4 == null);
		return local9.aClass4_Sub7_Sub4_4;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!sw;II)V")
	private void method3360(@OriginalArg(0) Class4_Sub43 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass4_Sub7_Sub3_1.anIntArray318[arg0.anInt8956] & 0x4) != 0 && arg0.anInt8966 < 0) {
			@Pc(28) int local28 = this.aClass4_Sub7_Sub3_1.anIntArray313[arg0.anInt8956] / Static262.anInt5047;
			@Pc(37) int local37 = (local28 + 1048575 - arg0.anInt8970) / local28;
			arg0.anInt8970 = arg0.anInt8970 + local28 * arg1 & 0xFFFFF;
			if (local37 <= arg1) {
				if (this.aClass4_Sub7_Sub3_1.anIntArray317[arg0.anInt8956] == 0) {
					arg0.aClass4_Sub7_Sub4_4 = Static600.method6430(arg0.aClass4_Sub16_Sub1_4, arg0.aClass4_Sub7_Sub4_4.method6407(), arg0.aClass4_Sub7_Sub4_4.method6426(), arg0.aClass4_Sub7_Sub4_4.method6431());
				} else {
					arg0.aClass4_Sub7_Sub4_4 = Static600.method6430(arg0.aClass4_Sub16_Sub1_4, arg0.aClass4_Sub7_Sub4_4.method6407(), 0, arg0.aClass4_Sub7_Sub4_4.method6431());
					this.aClass4_Sub7_Sub3_1.method5447(arg0.aClass4_Sub44_1.aShortArray123[arg0.anInt8967] < 0, arg0);
				}
				if (arg0.aClass4_Sub44_1.aShortArray123[arg0.anInt8967] < 0) {
					arg0.aClass4_Sub7_Sub4_4.method6422(-1);
				}
				arg1 = arg0.anInt8970 / local28;
			}
		}
		arg0.aClass4_Sub7_Sub4_4.method6402(arg1);
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "()I")
	@Override
	public int method6405() {
		return 0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([IIBIILclient!sw;)V")
	private void method3361(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub43 arg4) {
		if ((this.aClass4_Sub7_Sub3_1.anIntArray318[arg4.anInt8956] & 0x4) != 0 && arg4.anInt8966 < 0) {
			@Pc(28) int local28 = this.aClass4_Sub7_Sub3_1.anIntArray313[arg4.anInt8956] / Static262.anInt5047;
			while (true) {
				@Pc(38) int local38 = (local28 + 1048575 - arg4.anInt8970) / local28;
				if (arg2 < local38) {
					arg4.anInt8970 += arg2 * local28;
					break;
				}
				arg4.aClass4_Sub7_Sub4_4.method6400(arg0, arg1, local38);
				arg2 -= local38;
				arg4.anInt8970 += local28 * local38 - 1048576;
				arg1 += local38;
				@Pc(69) int local69 = Static262.anInt5047 / 100;
				@Pc(73) int local73 = 262144 / local28;
				if (local69 > local73) {
					local69 = local73;
				}
				@Pc(85) Class4_Sub7_Sub4 local85 = arg4.aClass4_Sub7_Sub4_4;
				if (this.aClass4_Sub7_Sub3_1.anIntArray317[arg4.anInt8956] == 0) {
					arg4.aClass4_Sub7_Sub4_4 = Static600.method6430(arg4.aClass4_Sub16_Sub1_4, local85.method6407(), local85.method6426(), local85.method6431());
				} else {
					arg4.aClass4_Sub7_Sub4_4 = Static600.method6430(arg4.aClass4_Sub16_Sub1_4, local85.method6407(), 0, local85.method6431());
					this.aClass4_Sub7_Sub3_1.method5447(arg4.aClass4_Sub44_1.aShortArray123[arg4.anInt8967] < 0, arg4);
					arg4.aClass4_Sub7_Sub4_4.method6434(local69, local85.method6426());
				}
				if (arg4.aClass4_Sub44_1.aShortArray123[arg4.anInt8967] < 0) {
					arg4.aClass4_Sub7_Sub4_4.method6422(-1);
				}
				local85.method6408(local69);
				local85.method6400(arg0, arg1, arg3 - arg1);
				if (local85.method6413()) {
					this.aClass4_Sub7_Sub1_1.method397(local85);
				}
			}
		}
		arg4.aClass4_Sub7_Sub4_4.method6400(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	@Override
	public void method6402(@OriginalArg(0) int arg0) {
		this.aClass4_Sub7_Sub1_1.method6402(arg0);
		for (@Pc(15) Class4_Sub43 local15 = (Class4_Sub43) this.aClass244_26.method5963(); local15 != null; local15 = (Class4_Sub43) this.aClass244_26.method5965()) {
			if (!this.aClass4_Sub7_Sub3_1.method5459(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt8965 >= local25) {
						this.method3360(local15, local25);
						local15.anInt8965 -= local25;
						break;
					}
					this.method3360(local15, local15.anInt8965);
					local25 -= local15.anInt8965;
				} while (!this.aClass4_Sub7_Sub3_1.method5438(0, local15, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([III)V")
	@Override
	public void method6400(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub7_Sub1_1.method6400(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub43 local17 = (Class4_Sub43) this.aClass244_26.method5963(); local17 != null; local17 = (Class4_Sub43) this.aClass244_26.method5965()) {
			if (!this.aClass4_Sub7_Sub3_1.method5459(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt8965 >= local29) {
						this.method3361(arg0, local27, local29, local29 + local27, local17);
						local17.anInt8965 -= local29;
						break;
					}
					this.method3361(arg0, local27, local17.anInt8965, local29 + local27, local17);
					local27 += local17.anInt8965;
					local29 -= local17.anInt8965;
				} while (!this.aClass4_Sub7_Sub3_1.method5438(local27, local17, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "()Lclient!mi;")
	@Override
	public Class4_Sub7 method6401() {
		@Pc(9) Class4_Sub43 local9 = (Class4_Sub43) this.aClass244_26.method5963();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub7_Sub4_4 == null) {
			return this.method6404();
		} else {
			return local9.aClass4_Sub7_Sub4_4;
		}
	}
}

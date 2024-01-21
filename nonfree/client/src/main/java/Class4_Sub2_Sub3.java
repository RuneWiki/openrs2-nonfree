import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!me", name = "H", descriptor = "Lclient!bg;")
	public final Class11 aClass11_11 = new Class11();

	@OriginalMember(owner = "client!me", name = "L", descriptor = "Lclient!ga;")
	public final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_2 = new Class4_Sub2_Sub1();

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!ub;")
	private final Class4_Sub2_Sub4 aClass4_Sub2_Sub4_1;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ub;)V")
	public Class4_Sub2_Sub3(@OriginalArg(0) Class4_Sub2_Sub4 arg0) {
		this.aClass4_Sub2_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()Lclient!ag;")
	@Override
	public Class4_Sub2 method2774() {
		@Pc(5) Class4_Sub25 local5 = (Class4_Sub25) this.aClass11_11.method274();
		if (local5 == null) {
			return null;
		} else if (local5.aClass4_Sub2_Sub2_3 == null) {
			return this.method2768();
		} else {
			return local5.aClass4_Sub2_Sub2_3;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()Lclient!ag;")
	@Override
	public Class4_Sub2 method2768() {
		@Pc(9) Class4_Sub25 local9;
		do {
			local9 = (Class4_Sub25) this.aClass11_11.method271();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub2_Sub2_3 == null);
		return local9.aClass4_Sub2_Sub2_3;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!u;II[II)V")
	private void method2029(@OriginalArg(1) Class4_Sub25 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub2_Sub4_1.anIntArray358[arg0.anInt3633] & 0x4) != 0 && arg0.anInt3635 < 0) {
			@Pc(30) int local30 = this.aClass4_Sub2_Sub4_1.anIntArray367[arg0.anInt3633] / Static154.anInt4087;
			while (true) {
				@Pc(40) int local40 = (local30 + 1048575 - arg0.anInt3641) / local30;
				if (local40 > arg1) {
					arg0.anInt3641 += local30 * arg1;
					break;
				}
				arg1 -= local40;
				arg0.aClass4_Sub2_Sub2_3.method2769(arg3, arg2, local40);
				arg0.anInt3641 += local40 * local30 - 1048576;
				@Pc(67) int local67 = 262144 / local30;
				@Pc(70) Class4_Sub2_Sub2 local70 = arg0.aClass4_Sub2_Sub2_3;
				@Pc(74) int local74 = Static154.anInt4087 / 100;
				arg2 += local40;
				if (local74 > local67) {
					local74 = local67;
				}
				if (this.aClass4_Sub2_Sub4_1.anIntArray355[arg0.anInt3633] == 0) {
					arg0.aClass4_Sub2_Sub2_3 = Static192.method1329(arg0.aClass4_Sub12_Sub1_1, local70.method1304(), local70.method1314(), local70.method1308());
				} else {
					arg0.aClass4_Sub2_Sub2_3 = Static192.method1329(arg0.aClass4_Sub12_Sub1_1, local70.method1304(), 0, local70.method1308());
					this.aClass4_Sub2_Sub4_1.method2784(arg0.aClass4_Sub17_1.aShortArray33[arg0.anInt3642] < 0, arg0);
					arg0.aClass4_Sub2_Sub2_3.method1326(local74, local70.method1314());
				}
				if (arg0.aClass4_Sub17_1.aShortArray33[arg0.anInt3642] < 0) {
					arg0.aClass4_Sub2_Sub2_3.method1335(-1);
				}
				local70.method1313(local74);
				local70.method2769(arg3, arg2, arg4 - arg2);
				if (local70.method1307()) {
					this.aClass4_Sub2_Sub1_2.method1076(local70);
				}
			}
		}
		arg0.aClass4_Sub2_Sub2_3.method2769(arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "()I")
	@Override
	public int method2771() {
		return 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BILclient!u;)V")
	private void method2031(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub25 arg1) {
		if ((this.aClass4_Sub2_Sub4_1.anIntArray358[arg1.anInt3633] & 0x4) != 0 && arg1.anInt3635 < 0) {
			@Pc(27) int local27 = this.aClass4_Sub2_Sub4_1.anIntArray367[arg1.anInt3633] / Static154.anInt4087;
			@Pc(37) int local37 = (local27 + 1048575 - arg1.anInt3641) / local27;
			arg1.anInt3641 = arg1.anInt3641 + arg0 * local27 & 0xFFFFF;
			if (arg0 >= local37) {
				if (this.aClass4_Sub2_Sub4_1.anIntArray355[arg1.anInt3633] == 0) {
					arg1.aClass4_Sub2_Sub2_3 = Static192.method1329(arg1.aClass4_Sub12_Sub1_1, arg1.aClass4_Sub2_Sub2_3.method1304(), arg1.aClass4_Sub2_Sub2_3.method1314(), arg1.aClass4_Sub2_Sub2_3.method1308());
				} else {
					arg1.aClass4_Sub2_Sub2_3 = Static192.method1329(arg1.aClass4_Sub12_Sub1_1, arg1.aClass4_Sub2_Sub2_3.method1304(), 0, arg1.aClass4_Sub2_Sub2_3.method1308());
					this.aClass4_Sub2_Sub4_1.method2784(arg1.aClass4_Sub17_1.aShortArray33[arg1.anInt3642] < 0, arg1);
				}
				if (arg1.aClass4_Sub17_1.aShortArray33[arg1.anInt3642] < 0) {
					arg1.aClass4_Sub2_Sub2_3.method1335(-1);
				}
				arg0 = arg1.anInt3641 / local27;
			}
		}
		arg1.aClass4_Sub2_Sub2_3.method2773(arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([III)V")
	@Override
	public void method2769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub2_Sub1_2.method2769(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub25 local17 = (Class4_Sub25) this.aClass11_11.method274(); local17 != null; local17 = (Class4_Sub25) this.aClass11_11.method271()) {
			if (!this.aClass4_Sub2_Sub4_1.method2808(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt3630 >= local27) {
						this.method2029(local17, local27, local29, arg0, local27 + local29);
						local17.anInt3630 -= local27;
						break;
					}
					this.method2029(local17, local17.anInt3630, local29, arg0, local27 + local29);
					local29 += local17.anInt3630;
					local27 -= local17.anInt3630;
				} while (!this.aClass4_Sub2_Sub4_1.method2796(local29, local27, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	@Override
	public void method2773(@OriginalArg(0) int arg0) {
		this.aClass4_Sub2_Sub1_2.method2773(arg0);
		for (@Pc(11) Class4_Sub25 local11 = (Class4_Sub25) this.aClass11_11.method274(); local11 != null; local11 = (Class4_Sub25) this.aClass11_11.method271()) {
			if (!this.aClass4_Sub2_Sub4_1.method2808(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local11.anInt3630 >= local21) {
						this.method2031(local21, local11);
						local11.anInt3630 -= local21;
						break;
					}
					this.method2031(local11.anInt3630, local11);
					local21 -= local11.anInt3630;
				} while (!this.aClass4_Sub2_Sub4_1.method2796(0, local21, null, local11));
			}
		}
	}
}

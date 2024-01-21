import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Lclient!cf;")
	public final Class12 aClass12_3 = new Class12();

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!vd;")
	public final Class2_Sub5_Sub3 aClass2_Sub5_Sub3_2 = new Class2_Sub5_Sub3();

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "Lclient!wb;")
	private final Class2_Sub5_Sub4 aClass2_Sub5_Sub4_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!wb;)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) Class2_Sub5_Sub4 arg0) {
		this.aClass2_Sub5_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()Lclient!nb;")
	@Override
	public Class2_Sub5 method2655() {
		@Pc(9) Class2_Sub7 local9;
		do {
			local9 = (Class2_Sub7) this.aClass12_3.method381();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub5_Sub2_1 == null);
		return local9.aClass2_Sub5_Sub2_1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()Lclient!nb;")
	@Override
	public Class2_Sub5 method2652() {
		@Pc(9) Class2_Sub7 local9 = (Class2_Sub7) this.aClass12_3.method384();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub5_Sub2_1 == null) {
			return this.method2655();
		} else {
			return local9.aClass2_Sub5_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZLclient!ed;)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if ((this.aClass2_Sub5_Sub4_1.anIntArray410[arg1.anInt949] & 0x4) != 0 && arg1.anInt960 < 0) {
			@Pc(32) int local32 = this.aClass2_Sub5_Sub4_1.anIntArray415[arg1.anInt949] / Static45.anInt1131;
			@Pc(42) int local42 = (local32 + 1048575 - arg1.anInt954) / local32;
			arg1.anInt954 = arg1.anInt954 + arg0 * local32 & 0xFFFFF;
			if (local42 <= arg0) {
				if (this.aClass2_Sub5_Sub4_1.anIntArray413[arg1.anInt949] == 0) {
					arg1.aClass2_Sub5_Sub2_1 = Static186.method2347(arg1.aClass2_Sub10_Sub1_1, arg1.aClass2_Sub5_Sub2_1.method2341(), arg1.aClass2_Sub5_Sub2_1.method2333(), arg1.aClass2_Sub5_Sub2_1.method2330());
				} else {
					arg1.aClass2_Sub5_Sub2_1 = Static186.method2347(arg1.aClass2_Sub10_Sub1_1, arg1.aClass2_Sub5_Sub2_1.method2341(), 0, arg1.aClass2_Sub5_Sub2_1.method2330());
					this.aClass2_Sub5_Sub4_1.method2679(arg1, arg1.aClass2_Sub3_1.aShortArray6[arg1.anInt955] < 0);
				}
				if (arg1.aClass2_Sub3_1.aShortArray6[arg1.anInt955] < 0) {
					arg1.aClass2_Sub5_Sub2_1.method2318(-1);
				}
				arg0 = arg1.anInt954 / local32;
			}
		}
		arg1.aClass2_Sub5_Sub2_1.method2653(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([III)V")
	@Override
	public void method2651(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub5_Sub3_2.method2651(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub7 local17 = (Class2_Sub7) this.aClass12_3.method384(); local17 != null; local17 = (Class2_Sub7) this.aClass12_3.method381()) {
			if (!this.aClass2_Sub5_Sub4_1.method2674(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt947) {
						this.method645(arg0, local27, local17, local27 + local29, local29);
						local17.anInt947 -= local29;
						break;
					}
					this.method645(arg0, local27, local17, local29 + local27, local17.anInt947);
					local27 += local17.anInt947;
					local29 -= local17.anInt947;
				} while (!this.aClass2_Sub5_Sub4_1.method2690(local29, local27, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "()I")
	@Override
	public int method2657() {
		return 0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	@Override
	public void method2653(@OriginalArg(0) int arg0) {
		this.aClass2_Sub5_Sub3_2.method2653(arg0);
		for (@Pc(15) Class2_Sub7 local15 = (Class2_Sub7) this.aClass12_3.method384(); local15 != null; local15 = (Class2_Sub7) this.aClass12_3.method381()) {
			if (!this.aClass2_Sub5_Sub4_1.method2674(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt947) {
						this.method644(local25, local15);
						local15.anInt947 -= local25;
						break;
					}
					this.method644(local15.anInt947, local15);
					local25 -= local15.anInt947;
				} while (!this.aClass2_Sub5_Sub4_1.method2690(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[IILclient!ed;II)V")
	private void method645(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub5_Sub4_1.anIntArray410[arg2.anInt949] & 0x4) != 0 && arg2.anInt960 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub5_Sub4_1.anIntArray415[arg2.anInt949] / Static45.anInt1131;
			while (true) {
				@Pc(39) int local39 = (local30 + 1048575 - arg2.anInt954) / local30;
				if (arg4 < local39) {
					arg2.anInt954 += arg4 * local30;
					break;
				}
				arg2.aClass2_Sub5_Sub2_1.method2651(arg0, arg1, local39);
				arg4 -= local39;
				arg1 += local39;
				arg2.anInt954 += local39 * local30 - 1048576;
				@Pc(70) int local70 = Static45.anInt1131 / 100;
				@Pc(73) Class2_Sub5_Sub2 local73 = arg2.aClass2_Sub5_Sub2_1;
				@Pc(77) int local77 = 262144 / local30;
				if (local77 < local70) {
					local70 = local77;
				}
				if (this.aClass2_Sub5_Sub4_1.anIntArray413[arg2.anInt949] == 0) {
					arg2.aClass2_Sub5_Sub2_1 = Static186.method2347(arg2.aClass2_Sub10_Sub1_1, local73.method2341(), local73.method2333(), local73.method2330());
				} else {
					arg2.aClass2_Sub5_Sub2_1 = Static186.method2347(arg2.aClass2_Sub10_Sub1_1, local73.method2341(), 0, local73.method2330());
					this.aClass2_Sub5_Sub4_1.method2679(arg2, arg2.aClass2_Sub3_1.aShortArray6[arg2.anInt955] < 0);
					arg2.aClass2_Sub5_Sub2_1.method2332(local70, local73.method2333());
				}
				if (arg2.aClass2_Sub3_1.aShortArray6[arg2.anInt955] < 0) {
					arg2.aClass2_Sub5_Sub2_1.method2318(-1);
				}
				local73.method2345(local70);
				local73.method2651(arg0, arg1, arg3 - arg1);
				if (local73.method2329()) {
					this.aClass2_Sub5_Sub3_2.method2612(local73);
				}
			}
		}
		arg2.aClass2_Sub5_Sub2_1.method2651(arg0, arg1, arg4);
	}
}

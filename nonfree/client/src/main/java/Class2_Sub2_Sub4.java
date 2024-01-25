import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "Lclient!sm;")
	public final Class210 aClass210_44 = new Class210();

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "Lclient!ad;")
	public final Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1 = new Class2_Sub2_Sub1();

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "Lclient!ln;")
	private final Class2_Sub2_Sub3 aClass2_Sub2_Sub3_3;

	static {
		new Class221("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ln;)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) Class2_Sub2_Sub3 arg0) {
		this.aClass2_Sub2_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	@Override
	public void method4833(@OriginalArg(0) int arg0) {
		this.aClass2_Sub2_Sub1_1.method4833(arg0);
		for (@Pc(15) Class2_Sub37 local15 = (Class2_Sub37) this.aClass210_44.method5035(); local15 != null; local15 = (Class2_Sub37) this.aClass210_44.method5037()) {
			if (!this.aClass2_Sub2_Sub3_3.method3397(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt6069 >= local25) {
						this.method4835(local15, local25);
						local15.anInt6069 -= local25;
						break;
					}
					this.method4835(local15, local15.anInt6069);
					local25 -= local15.anInt6069;
				} while (!this.aClass2_Sub2_Sub3_3.method3434(local15, 0, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "()Lclient!gh;")
	@Override
	public Class2_Sub2 method4832() {
		@Pc(9) Class2_Sub37 local9 = (Class2_Sub37) this.aClass210_44.method5035();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub2_Sub2_1 == null) {
			return this.method4830();
		} else {
			return local9.aClass2_Sub2_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!tr;I)V")
	private void method4835(@OriginalArg(1) Class2_Sub37 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub2_Sub3_3.anIntArray456[arg0.anInt6073] & 0x4) != 0 && arg0.anInt6082 < 0) {
			@Pc(29) int local29 = this.aClass2_Sub2_Sub3_3.anIntArray448[arg0.anInt6073] / Static221.anInt4100;
			@Pc(39) int local39 = (local29 + 1048575 - arg0.anInt6079) / local29;
			arg0.anInt6079 = local29 * arg1 + arg0.anInt6079 & 0xFFFFF;
			if (arg1 >= local39) {
				if (this.aClass2_Sub2_Sub3_3.anIntArray459[arg0.anInt6073] == 0) {
					arg0.aClass2_Sub2_Sub2_1 = Static398.method3215(arg0.aClass2_Sub4_Sub1_1, arg0.aClass2_Sub2_Sub2_1.method3198(), arg0.aClass2_Sub2_Sub2_1.method3185(), arg0.aClass2_Sub2_Sub2_1.method3188());
				} else {
					arg0.aClass2_Sub2_Sub2_1 = Static398.method3215(arg0.aClass2_Sub4_Sub1_1, arg0.aClass2_Sub2_Sub2_1.method3198(), 0, arg0.aClass2_Sub2_Sub2_1.method3188());
					this.aClass2_Sub2_Sub3_3.method3411(arg0, arg0.aClass2_Sub33_1.aShortArray101[arg0.anInt6074] < 0);
				}
				if (arg0.aClass2_Sub33_1.aShortArray101[arg0.anInt6074] < 0) {
					arg0.aClass2_Sub2_Sub2_1.method3196(-1);
				}
				arg1 = arg0.anInt6079 / local29;
			}
		}
		arg0.aClass2_Sub2_Sub2_1.method4833(arg1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[ILclient!tr;IBI)V")
	private void method4836(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class2_Sub37 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub2_Sub3_3.anIntArray456[arg2.anInt6073] & 0x4) != 0 && arg2.anInt6082 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub2_Sub3_3.anIntArray448[arg2.anInt6073] / Static221.anInt4100;
			while (true) {
				@Pc(39) int local39 = (local30 + 1048575 - arg2.anInt6079) / local30;
				if (local39 > arg0) {
					arg2.anInt6079 += arg0 * local30;
					break;
				}
				arg2.aClass2_Sub2_Sub2_1.method4828(arg1, arg4, local39);
				arg0 -= local39;
				arg4 += local39;
				arg2.anInt6079 += local30 * local39 - 1048576;
				@Pc(74) int local74 = Static221.anInt4100 / 100;
				@Pc(78) int local78 = 262144 / local30;
				if (local74 > local78) {
					local74 = local78;
				}
				@Pc(90) Class2_Sub2_Sub2 local90 = arg2.aClass2_Sub2_Sub2_1;
				if (this.aClass2_Sub2_Sub3_3.anIntArray459[arg2.anInt6073] == 0) {
					arg2.aClass2_Sub2_Sub2_1 = Static398.method3215(arg2.aClass2_Sub4_Sub1_1, local90.method3198(), local90.method3185(), local90.method3188());
				} else {
					arg2.aClass2_Sub2_Sub2_1 = Static398.method3215(arg2.aClass2_Sub4_Sub1_1, local90.method3198(), 0, local90.method3188());
					this.aClass2_Sub2_Sub3_3.method3411(arg2, arg2.aClass2_Sub33_1.aShortArray101[arg2.anInt6074] < 0);
					arg2.aClass2_Sub2_Sub2_1.method3213(local74, local90.method3185());
				}
				if (arg2.aClass2_Sub33_1.aShortArray101[arg2.anInt6074] < 0) {
					arg2.aClass2_Sub2_Sub2_1.method3196(-1);
				}
				local90.method3183(local74);
				local90.method4828(arg1, arg4, arg3 - arg4);
				if (local90.method3190()) {
					this.aClass2_Sub2_Sub1_1.method112(local90);
				}
			}
		}
		arg2.aClass2_Sub2_Sub2_1.method4828(arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "()I")
	@Override
	public int method4834() {
		return 0;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "()Lclient!gh;")
	@Override
	public Class2_Sub2 method4830() {
		@Pc(9) Class2_Sub37 local9;
		do {
			local9 = (Class2_Sub37) this.aClass210_44.method5037();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub2_Sub2_1 == null);
		return local9.aClass2_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([III)V")
	@Override
	public void method4828(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub2_Sub1_1.method4828(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub37 local17 = (Class2_Sub37) this.aClass210_44.method5035(); local17 != null; local17 = (Class2_Sub37) this.aClass210_44.method5037()) {
			if (!this.aClass2_Sub2_Sub3_3.method3397(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt6069) {
						this.method4836(local29, arg0, local17, local27 + local29, local27);
						local17.anInt6069 -= local29;
						break;
					}
					this.method4836(local17.anInt6069, arg0, local17, local27 + local29, local27);
					local29 -= local17.anInt6069;
					local27 += local17.anInt6069;
				} while (!this.aClass2_Sub2_Sub3_3.method3434(local17, local27, local29, arg0));
			}
		}
	}
}

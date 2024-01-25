import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class3_Sub16_Sub1 extends Class3_Sub16 {

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "Lclient!or;")
	public final Class244 aClass244_47 = new Class244();

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "Lclient!vt;")
	public final Class3_Sub16_Sub4 aClass3_Sub16_Sub4_1 = new Class3_Sub16_Sub4();

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "Lclient!qk;")
	private final Class3_Sub16_Sub3 aClass3_Sub16_Sub3_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!qk;)V")
	public Class3_Sub16_Sub1(@OriginalArg(0) Class3_Sub16_Sub3 arg0) {
		this.aClass3_Sub16_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "()Lclient!eq;")
	@Override
	public Class3_Sub16 method7752() {
		@Pc(9) Class3_Sub14 local9 = (Class3_Sub14) this.aClass244_47.method5572();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub16_Sub2_1 == null) {
			return this.method7748();
		} else {
			return local9.aClass3_Sub16_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()Lclient!eq;")
	@Override
	public Class3_Sub16 method7748() {
		@Pc(9) Class3_Sub14 local9;
		do {
			local9 = (Class3_Sub14) this.aClass244_47.method5576();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub16_Sub2_1 == null);
		return local9.aClass3_Sub16_Sub2_1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII[ILclient!efa;)V")
	private void method4664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class3_Sub14 arg4) {
		if ((this.aClass3_Sub16_Sub3_1.anIntArray451[arg4.anInt2787] & 0x4) != 0 && arg4.anInt2797 < 0) {
			@Pc(26) int local26 = this.aClass3_Sub16_Sub3_1.anIntArray457[arg4.anInt2787] / Static180.anInt3952;
			while (true) {
				@Pc(35) int local35 = (local26 + 1048575 - arg4.anInt2789) / local26;
				if (arg0 < local35) {
					arg4.anInt2789 += arg0 * local26;
					break;
				}
				arg4.aClass3_Sub16_Sub2_1.method7754(arg3, arg2, local35);
				arg4.anInt2789 += local35 * local26 - 1048576;
				arg0 -= local35;
				arg2 += local35;
				@Pc(70) int local70 = Static180.anInt3952 / 100;
				@Pc(74) int local74 = 262144 / local26;
				if (local70 > local74) {
					local70 = local74;
				}
				@Pc(82) Class3_Sub16_Sub2 local82 = arg4.aClass3_Sub16_Sub2_1;
				if (this.aClass3_Sub16_Sub3_1.anIntArray454[arg4.anInt2787] == 0) {
					arg4.aClass3_Sub16_Sub2_1 = Static603.method6055(arg4.aClass3_Sub17_Sub1_1, local82.method6031(), local82.method6042(), local82.method6044());
				} else {
					arg4.aClass3_Sub16_Sub2_1 = Static603.method6055(arg4.aClass3_Sub17_Sub1_1, local82.method6031(), 0, local82.method6044());
					this.aClass3_Sub16_Sub3_1.method6123(arg4.aClass3_Sub19_1.aShortArray53[arg4.anInt2802] < 0, arg4);
					arg4.aClass3_Sub16_Sub2_1.method6052(local70, local82.method6042());
				}
				if (arg4.aClass3_Sub19_1.aShortArray53[arg4.anInt2802] < 0) {
					arg4.aClass3_Sub16_Sub2_1.method6045(-1);
				}
				local82.method6049(local70);
				local82.method7754(arg3, arg2, arg1 - arg2);
				if (local82.method6064()) {
					this.aClass3_Sub16_Sub4_1.method7762(local82);
				}
			}
		}
		arg4.aClass3_Sub16_Sub2_1.method7754(arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	@Override
	public void method7751(@OriginalArg(0) int arg0) {
		this.aClass3_Sub16_Sub4_1.method7751(arg0);
		for (@Pc(15) Class3_Sub14 local15 = (Class3_Sub14) this.aClass244_47.method5572(); local15 != null; local15 = (Class3_Sub14) this.aClass244_47.method5576()) {
			if (!this.aClass3_Sub16_Sub3_1.method6116(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2783 >= local25) {
						this.method4666(local15, local25);
						local15.anInt2783 -= local25;
						break;
					}
					this.method4666(local15, local15.anInt2783);
					local25 -= local15.anInt2783;
				} while (!this.aClass3_Sub16_Sub3_1.method6109(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "([III)V")
	@Override
	public void method7754(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub16_Sub4_1.method7754(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub14 local17 = (Class3_Sub14) this.aClass244_47.method5572(); local17 != null; local17 = (Class3_Sub14) this.aClass244_47.method5576()) {
			if (!this.aClass3_Sub16_Sub3_1.method6116(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt2783 >= local27) {
						this.method4664(local27, local27 + local29, local29, arg0, local17);
						local17.anInt2783 -= local27;
						break;
					}
					this.method4664(local17.anInt2783, local29 + local27, local29, arg0, local17);
					local27 -= local17.anInt2783;
					local29 += local17.anInt2783;
				} while (!this.aClass3_Sub16_Sub3_1.method6109(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()I")
	@Override
	public int method7749() {
		return 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!efa;IZ)V")
	private void method4666(@OriginalArg(0) Class3_Sub14 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass3_Sub16_Sub3_1.anIntArray451[arg0.anInt2787] & 0x4) != 0 && arg0.anInt2797 < 0) {
			@Pc(33) int local33 = this.aClass3_Sub16_Sub3_1.anIntArray457[arg0.anInt2787] / Static180.anInt3952;
			@Pc(42) int local42 = (local33 + 1048575 - arg0.anInt2789) / local33;
			arg0.anInt2789 = local33 * arg1 + arg0.anInt2789 & 0xFFFFF;
			if (arg1 >= local42) {
				if (this.aClass3_Sub16_Sub3_1.anIntArray454[arg0.anInt2787] == 0) {
					arg0.aClass3_Sub16_Sub2_1 = Static603.method6055(arg0.aClass3_Sub17_Sub1_1, arg0.aClass3_Sub16_Sub2_1.method6031(), arg0.aClass3_Sub16_Sub2_1.method6042(), arg0.aClass3_Sub16_Sub2_1.method6044());
				} else {
					arg0.aClass3_Sub16_Sub2_1 = Static603.method6055(arg0.aClass3_Sub17_Sub1_1, arg0.aClass3_Sub16_Sub2_1.method6031(), 0, arg0.aClass3_Sub16_Sub2_1.method6044());
					this.aClass3_Sub16_Sub3_1.method6123(arg0.aClass3_Sub19_1.aShortArray53[arg0.anInt2802] < 0, arg0);
				}
				if (arg0.aClass3_Sub19_1.aShortArray53[arg0.anInt2802] < 0) {
					arg0.aClass3_Sub16_Sub2_1.method6045(-1);
				}
				arg1 = arg0.anInt2789 / local33;
			}
		}
		arg0.aClass3_Sub16_Sub2_1.method7751(arg1);
	}
}

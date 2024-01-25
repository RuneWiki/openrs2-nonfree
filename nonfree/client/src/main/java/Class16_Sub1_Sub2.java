import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class16_Sub1_Sub2 extends Class16_Sub1 {

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "Lclient!ao;")
	private Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	private final int anInt1348 = -1;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
	private int anInt1347 = 0;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	private int anInt1358 = 0;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt1350 = 0;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
	private int anInt1357 = -32768;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public final int anInt1346;

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
	private final int anInt1365;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private final int anInt1349;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!lp;")
	private Class138 aClass138_2;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class16_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1346 = arg2 + arg1;
		this.anInt1365 = arg0;
		this.anInt1347 = arg12;
		this.anInt1349 = arg4;
		@Pc(49) Class161 local49 = Static352.aClass194_2.method4421(this.anInt1365);
		@Pc(52) int local52 = local49.anInt5002;
		if (local52 == -1) {
			this.aBoolean113 = true;
		} else {
			this.aClass138_2 = Static182.aClass55_1.method1397(local52);
			this.aBoolean113 = false;
		}
		if (this.anInt1346 == arg2) {
			Static15.method156(super.anInt6893, this.anInt1358, super.aByte82, super.anInt6892, this.aClass138_2, false);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!ya;B)Lclient!t;")
	private Class110 method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2) {
		@Pc(13) Class161 local13 = Static352.aClass194_2.method4421(arg0);
		@Pc(18) Class65 local18 = Static67.aClass65Array1[super.aByte82];
		@Pc(31) Class65 local31 = this.anInt1349 >= 3 ? null : Static67.aClass65Array1[this.anInt1349 + 1];
		return this.aBoolean113 ? local13.method3833(local31, super.anInt6889, super.anInt6893, arg2, super.anInt6892, -1, local18, -1, Static182.aClass55_1, arg1, 0) : local13.method3833(local31, super.anInt6889, super.anInt6893, arg2, super.anInt6892, this.anInt1358, local18, this.anInt1348, Static182.aClass55_1, arg1, this.anInt1350);
	}

	@OriginalMember(owner = "client!dd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub2_2 != null) {
			this.aClass3_Sub2_2.method166();
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class110 local16 = this.method1240(this.anInt1365, 0, arg0);
		if (local16 != null) {
			this.method1245(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5338() {
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		@Pc(26) Class110 local26 = this.method1240(this.anInt1365, (this.anInt1347 == 0 ? 0 : 5) | 0x800, arg0);
		if (local26 == null) {
			return null;
		}
		if (this.anInt1347 != 0) {
			local26.Q(this.anInt1347 * 2048);
		}
		@Pc(42) Class31 local42 = arg0.method4289();
		local42.j(super.anInt6893, super.anInt6889, super.anInt6892);
		if (this.aClass3_Sub2_2 == null) {
			local26.method4889(local42, null, 0);
		} else {
			@Pc(57) Class146 local57 = this.aClass3_Sub2_2.method171();
			arg0.method4262(local26, local57, local42, null);
		}
		this.anInt1357 = local26.MA();
		this.method1245(local26, arg0);
		return null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V")
	public void method1243(@OriginalArg(0) int arg0) {
		if (this.aBoolean113) {
			return;
		}
		this.anInt1350 += arg0;
		while (this.anInt1350 > this.aClass138_2.anIntArray296[this.anInt1358]) {
			this.anInt1350 -= this.aClass138_2.anIntArray296[this.anInt1358];
			this.anInt1358++;
			if (this.anInt1358 >= this.aClass138_2.anIntArray295.length) {
				this.aBoolean113 = true;
				break;
			}
		}
		if (!this.aBoolean113) {
			Static15.method156(super.anInt6893, this.anInt1358, super.aByte82, super.anInt6892, this.aClass138_2, false);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public void method1244() {
		if (this.aClass3_Sub2_2 != null) {
			this.aClass3_Sub2_2.method166();
		}
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	@Override
	public void method5333() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)I")
	@Override
	public int method5342() {
		return this.anInt1357;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!t;Lclient!ya;I)V")
	private void method1245(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(6) Class29[] local6 = arg0.method4881();
		@Pc(14) Class179[] local14 = arg0.method4885();
		if ((this.aClass3_Sub2_2 == null || this.aClass3_Sub2_2.aBoolean24) && (local6 != null || local14 != null)) {
			this.aClass3_Sub2_2 = new Class3_Sub2(Static24.anInt5323);
		}
		if (this.aClass3_Sub2_2 != null) {
			this.aClass3_Sub2_2.method169(arg1, (long) Static24.anInt5323, local6, local14);
			this.aClass3_Sub2_2.method174(super.aByte82, super.aShort94, super.aShort97, super.aShort96, super.aShort95);
		}
	}
}

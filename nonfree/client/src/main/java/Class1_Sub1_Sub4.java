import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "[I")
	public static int[] anIntArray42 = new int[32];

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
	public int anInt388;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "Lclient!qc;")
	private Class90 aClass90_3;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
	public int anInt393;

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "Lclient!qc;")
	private Class90 aClass90_4;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "Lclient!hh;")
	private Class50 aClass50_156 = Static207.aClass50_1324;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray42[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)I")
	public int method281(@OriginalArg(1) int arg0) {
		if (this.aClass90_4 == null) {
			return this.anInt387;
		} else {
			@Pc(17) Class1_Sub5 local17 = (Class1_Sub5) this.aClass90_4.method2819((long) arg0);
			return local17 == null ? this.anInt387 : local17.anInt409;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(BI)Lclient!hh;")
	public Class50 method282(@OriginalArg(1) int arg0) {
		if (this.aClass90_4 == null) {
			return this.aClass50_156;
		} else {
			@Pc(22) Class1_Sub6 local22 = (Class1_Sub6) this.aClass90_4.method2819((long) arg0);
			return local22 == null ? this.aClass50_156 : local22.aClass50_187;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!pg;I)V")
	public void method283(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2142();
			if (local15 == 0) {
				return;
			}
			this.method291(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Z")
	public boolean method285(@OriginalArg(0) int arg0) {
		if (this.aClass90_4 == null) {
			return false;
		}
		if (this.aClass90_3 == null) {
			this.method287();
		}
		@Pc(28) Class1_Sub5 local28 = (Class1_Sub5) this.aClass90_3.method2819((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
	private void method286() {
		this.aClass90_3 = new Class90(this.aClass90_4.method2822());
		for (@Pc(20) Class1_Sub6 local20 = (Class1_Sub6) this.aClass90_4.method2823(); local20 != null; local20 = (Class1_Sub6) this.aClass90_4.method2821()) {
			@Pc(31) Class1_Sub19 local31 = new Class1_Sub19(local20.aClass50_187, (int) local20.aLong173);
			this.aClass90_3.method2817(local31, local20.aClass50_187.method1245());
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	private void method287() {
		this.aClass90_3 = new Class90(this.aClass90_4.method2822());
		for (@Pc(20) Class1_Sub5 local20 = (Class1_Sub5) this.aClass90_4.method2823(); local20 != null; local20 = (Class1_Sub5) this.aClass90_4.method2821()) {
			@Pc(29) Class1_Sub5 local29 = new Class1_Sub5((int) local20.aLong173);
			this.aClass90_3.method2817(local29, (long) local20.anInt409);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!hh;I)Z")
	public boolean method289(@OriginalArg(0) Class50 arg0) {
		if (this.aClass90_4 == null) {
			return false;
		}
		if (this.aClass90_3 == null) {
			this.method286();
		}
		for (@Pc(29) Class1_Sub19 local29 = (Class1_Sub19) this.aClass90_3.method2819(arg0.method1245()); local29 != null; local29 = (Class1_Sub19) this.aClass90_3.method2816()) {
			if (local29.aClass50_951.method1236(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!pg;IB)V")
	private void method291(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt393 = arg0.method2142();
		} else if (arg1 == 2) {
			this.anInt388 = arg0.method2142();
		} else if (arg1 == 3) {
			this.aClass50_156 = arg0.method2125();
		} else if (arg1 == 4) {
			this.anInt387 = arg0.method2140();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(31) int local31 = arg0.method2178();
			this.aClass90_4 = new Class90(Static194.method3146(local31));
			for (@Pc(41) int local41 = 0; local41 < local31; local41++) {
				@Pc(47) int local47 = arg0.method2140();
				@Pc(57) Class1 local57;
				if (arg1 == 5) {
					local57 = new Class1_Sub6(arg0.method2125());
				} else {
					local57 = new Class1_Sub5(arg0.method2140());
				}
				this.aClass90_4.method2817(local57, (long) local47);
			}
		}
	}
}

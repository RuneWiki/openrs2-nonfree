import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!la", name = "M", descriptor = "I")
	private int anInt2338;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "Lclient!wd;")
	private Class97 aClass97_13;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "I")
	public int anInt2345;

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
	public int anInt2348;

	@OriginalMember(owner = "client!la", name = "Z", descriptor = "Lclient!vd;")
	private Class92 aClass92_1048 = Static121.aClass92_2059;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)I")
	public int method1629(@OriginalArg(1) int arg0) {
		if (this.aClass97_13 == null) {
			return this.anInt2338;
		} else {
			@Pc(17) Class1_Sub20 local17 = (Class1_Sub20) this.aClass97_13.method3375((long) arg0);
			return local17 == null ? this.anInt2338 : local17.anInt2663;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ka;B)V")
	public void method1632(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3010();
			if (local17 == 0) {
				return;
			}
			this.method1633(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ka;IB)V")
	private void method1633(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2345 = arg0.method3010();
		} else if (arg1 == 2) {
			this.anInt2348 = arg0.method3010();
		} else if (arg1 == 3) {
			this.aClass92_1048 = arg0.method3022();
		} else if (arg1 == 4) {
			this.anInt2338 = arg0.method3058();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(29) int local29 = arg0.method3023();
			this.aClass97_13 = new Class97(Static155.method2190(local29));
			for (@Pc(39) int local39 = 0; local39 < local29; local39++) {
				@Pc(45) int local45 = arg0.method3058();
				@Pc(55) Class1 local55;
				if (arg1 == 5) {
					local55 = new Class1_Sub6(arg0.method3022());
				} else {
					local55 = new Class1_Sub20(arg0.method3058());
				}
				this.aClass97_13.method3374(local55, (long) local45);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)Lclient!vd;")
	public Class92 method1634(@OriginalArg(1) int arg0) {
		if (this.aClass97_13 == null) {
			return this.aClass92_1048;
		} else {
			@Pc(17) Class1_Sub6 local17 = (Class1_Sub6) this.aClass97_13.method3375((long) arg0);
			return local17 == null ? this.aClass92_1048 : local17.aClass92_343;
		}
	}
}

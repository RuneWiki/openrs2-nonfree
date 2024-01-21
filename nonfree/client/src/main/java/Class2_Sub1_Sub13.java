import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public int anInt2318;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	private int anInt2323;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	public int anInt2324;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!md;")
	private Class51 aClass51_6;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!ob;")
	private Class60 aClass60_621 = Static8.aClass60_80;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Lclient!ob;")
	public Class60 method1850(@OriginalArg(0) int arg0) {
		if (this.aClass51_6 == null) {
			return this.aClass60_621;
		} else {
			@Pc(22) Class2_Sub13 local22 = (Class2_Sub13) this.aClass51_6.method2458((long) arg0);
			return local22 == null ? this.aClass60_621 : local22.aClass60_826;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILclient!og;)V")
	private void method1851(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt2324 = arg1.method218();
		} else if (arg0 == 2) {
			this.anInt2318 = arg1.method218();
		} else if (arg0 == 3) {
			this.aClass60_621 = arg1.method240();
		} else if (arg0 == 4) {
			this.anInt2323 = arg1.method206();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(56) int local56 = arg1.method234();
			this.aClass51_6 = new Class51(Static150.method2965(local56));
			for (@Pc(66) int local66 = 0; local66 < local56; local66++) {
				@Pc(72) int local72 = arg1.method206();
				@Pc(84) Class2 local84;
				if (arg0 == 5) {
					local84 = new Class2_Sub13(arg1.method240());
				} else {
					local84 = new Class2_Sub12(arg1.method206());
				}
				this.aClass51_6.method2463(local84, (long) local72);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!og;)V")
	public void method1852(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method218();
			if (local11 == 0) {
				return;
			}
			this.method1851(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)I")
	public int method1855(@OriginalArg(1) int arg0) {
		if (this.aClass51_6 == null) {
			return this.anInt2323;
		} else {
			@Pc(22) Class2_Sub12 local22 = (Class2_Sub12) this.aClass51_6.method2458((long) arg0);
			return local22 == null ? this.anInt2323 : local22.anInt2882;
		}
	}
}

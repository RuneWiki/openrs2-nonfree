import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub5_Sub16 extends Class1_Sub5 {

	@OriginalMember(owner = "client!of", name = "C", descriptor = "Lclient!il;")
	private Class86 aClass86_25;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)I")
	public int method3383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass86_25 == null) {
			return arg1;
		} else {
			@Pc(28) Class1_Sub22 local28 = (Class1_Sub22) this.aClass86_25.method2136((long) arg0);
			return local28 == null ? arg1 : local28.anInt3973;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method3384(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass86_25 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub30 local16 = (Class1_Sub30) this.aClass86_25.method2136((long) arg0);
			return local16 == null ? arg1 : local16.aString166;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!fh;)V")
	public void method3386(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1853();
			if (local10 == 0) {
				return;
			}
			this.method3387(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!fh;I)V")
	private void method3387(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(9) int local9 = arg0.method1853();
		@Pc(17) int local17;
		if (this.aClass86_25 == null) {
			local17 = Static138.method3842(local9);
			this.aClass86_25 = new Class86(local17);
		}
		for (local17 = 0; local17 < local9; local17++) {
			@Pc(41) boolean local41 = arg0.method1853() == 1;
			@Pc(45) int local45 = arg0.method1878();
			@Pc(54) Class1 local54;
			if (local41) {
				local54 = new Class1_Sub30(arg0.method1827());
			} else {
				local54 = new Class1_Sub22(arg0.method1860());
			}
			this.aClass86_25.method2144(local54, (long) local45);
		}
	}
}

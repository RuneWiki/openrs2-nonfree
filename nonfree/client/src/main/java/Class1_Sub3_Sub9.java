import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "Lclient!qi;")
	private Class208 aClass208_12;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!wm;B)V")
	private void method1796(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(22) int local22 = arg1.method2915();
		@Pc(29) int local29;
		if (this.aClass208_12 == null) {
			local29 = Static191.method2764(local22);
			this.aClass208_12 = new Class208(local29);
		}
		for (local29 = 0; local29 < local22; local29++) {
			@Pc(48) boolean local48 = arg1.method2915() == 1;
			@Pc(52) int local52 = arg1.method2881();
			@Pc(61) Class1 local61;
			if (local48) {
				local61 = new Class1_Sub25(arg1.method2914());
			} else {
				local61 = new Class1_Sub18(arg1.method2877());
			}
			this.aClass208_12.method4413((long) local52, local61);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method1797(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass208_12 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub25 local16 = (Class1_Sub25) this.aClass208_12.method4405((long) arg0);
			return local16 == null ? arg1 : local16.aString39;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIZ)I")
	public int method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass208_12 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub18 local16 = (Class1_Sub18) this.aClass208_12.method4405((long) arg1);
			return local16 == null ? arg0 : local16.anInt2354;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method1799(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2915();
			if (local5 == 0) {
				return;
			}
			this.method1796(local5, arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "Lclient!ik;")
	private Class70 aClass70_21;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4265(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass70_21 == null) {
			return arg1;
		} else {
			@Pc(24) Class1_Sub27 local24 = (Class1_Sub27) this.aClass70_21.method2075((long) arg0);
			return local24 == null ? arg1 : local24.aString255;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!cg;)V")
	private void method4267(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(13) int local13 = arg1.method2690();
		@Pc(21) int local21;
		if (this.aClass70_21 == null) {
			local21 = Static161.method2789(local13);
			this.aClass70_21 = new Class70(local21);
		}
		for (local21 = 0; local21 < local13; local21++) {
			@Pc(45) boolean local45 = arg1.method2690() == 1;
			@Pc(49) int local49 = arg1.method2681();
			@Pc(58) Class1 local58;
			if (local45) {
				local58 = new Class1_Sub27(arg1.method2629());
			} else {
				local58 = new Class1_Sub29(arg1.method2643());
			}
			this.aClass70_21.method2084((long) local49, local58);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!cg;Z)V")
	public void method4270(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2690();
			if (local5 == 0) {
				return;
			}
			this.method4267(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BII)I")
	public int method4271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass70_21 == null) {
			return arg0;
		} else {
			@Pc(17) Class1_Sub29 local17 = (Class1_Sub29) this.aClass70_21.method2075((long) arg1);
			return local17 == null ? arg0 : local17.anInt4792;
		}
	}
}

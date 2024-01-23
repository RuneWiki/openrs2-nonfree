import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "Lclient!ol;")
	private Class117 aClass117_14;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;")
	public String method3090(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass117_14 == null) {
			return arg0;
		} else {
			@Pc(24) Class1_Sub26 local24 = (Class1_Sub26) this.aClass117_14.method3438((long) arg1);
			return local24 == null ? arg0 : local24.aString139;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(IBI)I")
	public int method3091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass117_14 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub10 local16 = (Class1_Sub10) this.aClass117_14.method3438((long) arg1);
			return local16 == null ? arg0 : local16.anInt1508;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLclient!im;)V")
	public void method3096(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2655();
			if (local15 == 0) {
				return;
			}
			this.method3098(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!im;B)V")
	private void method3098(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(15) int local15 = arg1.method2655();
		@Pc(23) int local23;
		if (this.aClass117_14 == null) {
			local23 = Static227.method3943(local15);
			this.aClass117_14 = new Class117(local23);
		}
		for (local23 = 0; local23 < local15; local23++) {
			@Pc(49) boolean local49 = arg1.method2655() == 1;
			@Pc(53) int local53 = arg1.method2634();
			@Pc(62) Class1 local62;
			if (local49) {
				local62 = new Class1_Sub26(arg1.method2611());
			} else {
				local62 = new Class1_Sub10(arg1.method2610());
			}
			this.aClass117_14.method3445(local62, (long) local53);
		}
	}
}

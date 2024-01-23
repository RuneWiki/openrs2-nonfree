import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class38 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public int anInt886;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "I")
	public int anInt888;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BILclient!sb;)V")
	public void method818(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(7) int local7 = arg1.method2595();
			if (local7 == 0) {
				return;
			}
			this.method819(arg0, arg1, local7);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!sb;II)V")
	private void method819(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt897 = arg1.method2593();
		} else if (arg2 == 2) {
			this.anInt888 = arg1.method2595();
			this.anInt886 = arg1.method2595();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Lclient!ln;")
	public Class1_Sub1_Sub3_Sub2 method821() {
		@Pc(7) Class1_Sub1_Sub3_Sub2 local7 = (Class1_Sub1_Sub3_Sub2) Static270.aClass169_141.method4017((long) this.anInt897);
		if (local7 != null) {
			return local7;
		}
		local7 = Static223.method3506(this.anInt897, Static202.aClass138_53);
		if (local7 != null) {
			Static270.aClass169_141.method4016(local7, (long) this.anInt897);
		}
		return local7;
	}
}

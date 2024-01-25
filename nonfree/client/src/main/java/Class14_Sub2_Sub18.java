import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class14_Sub2_Sub18 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "Lclient!bn;")
	private Class25 aClass25_26;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method4410(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass25_26 == null) {
			return arg0;
		} else {
			@Pc(23) Class14_Sub29 local23 = (Class14_Sub29) this.aClass25_26.method691((long) arg1);
			return local23 == null ? arg0 : local23.aString201;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBI)I")
	public int method4411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass25_26 == null) {
			return arg1;
		} else {
			@Pc(23) Class14_Sub34 local23 = (Class14_Sub34) this.aClass25_26.method691((long) arg0);
			return local23 == null ? arg1 : local23.anInt6039;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!jg;IB)V")
	private void method4412(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(20) int local20 = arg0.method2548();
		@Pc(27) int local27;
		if (this.aClass25_26 == null) {
			local27 = Static224.method4011(local20);
			this.aClass25_26 = new Class25(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(46) boolean local46 = arg0.method2548() == 1;
			@Pc(50) int local50 = arg0.method2501();
			@Pc(59) Class14 local59;
			if (local46) {
				local59 = new Class14_Sub29(arg0.method2496());
			} else {
				local59 = new Class14_Sub34(arg0.method2510());
			}
			this.aClass25_26.method687((long) local50, local59);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLclient!jg;)V")
	public void method4413(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2548();
			if (local9 == 0) {
				return;
			}
			this.method4412(arg0, local9);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class2_Sub5_Sub13 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ki", name = "I", descriptor = "Lclient!mp;")
	private Class222 aClass222_19;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!ud;)V")
	private void method4626(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(15) int local15 = arg1.method6904();
		@Pc(22) int local22;
		if (this.aClass222_19 == null) {
			local22 = Static347.method5404(local15);
			this.aClass222_19 = new Class222(local22);
		}
		for (local22 = 0; local22 < local15; local22++) {
			@Pc(42) boolean local42 = arg1.method6904() == 1;
			@Pc(46) int local46 = arg1.method6870();
			@Pc(55) Class2 local55;
			if (local42) {
				local55 = new Class2_Sub38(arg1.method6903());
			} else {
				local55 = new Class2_Sub15(arg1.method6865());
			}
			this.aClass222_19.method5476(local55, (long) local46);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4628(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass222_19 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub38 local21 = (Class2_Sub38) this.aClass222_19.method5468((long) arg1);
			return local21 == null ? arg0 : local21.aString68;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)I")
	public int method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass222_19 == null) {
			return arg0;
		} else {
			@Pc(24) Class2_Sub15 local24 = (Class2_Sub15) this.aClass222_19.method5468((long) arg1);
			return local24 == null ? arg0 : local24.anInt1789;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ud;B)V")
	public void method4632(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6904();
			if (local7 == 0) {
				return;
			}
			this.method4626(local7, arg0);
		}
	}
}

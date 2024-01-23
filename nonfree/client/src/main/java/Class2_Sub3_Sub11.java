import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!gh", name = "V", descriptor = "Lclient!ui;")
	private Class103 aClass103_8;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLclient!nh;I)V")
	private void method1228(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(10) int local10 = arg0.method2122();
		@Pc(17) int local17;
		if (this.aClass103_8 == null) {
			local17 = Static185.method3424(local10);
			this.aClass103_8 = new Class103(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(37) boolean local37 = arg0.method2122() == 1;
			@Pc(41) int local41 = arg0.method2091();
			@Pc(50) Class2 local50;
			if (local37) {
				local50 = new Class2_Sub15(arg0.method2115());
			} else {
				local50 = new Class2_Sub7(arg0.method2133());
			}
			this.aClass103_8.method3665((long) local41, local50);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!nh;I)V")
	public void method1229(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2122();
			if (local7 == 0) {
				return;
			}
			this.method1228(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!qe;II)Lclient!qe;")
	public Class78 method1231(@OriginalArg(0) Class78 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass103_8 == null) {
			return arg0;
		} else {
			@Pc(16) Class2_Sub15 local16 = (Class2_Sub15) this.aClass103_8.method3659((long) arg1);
			return local16 == null ? arg0 : local16.aClass78_305;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
	public int method1235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass103_8 == null) {
			return arg0;
		} else {
			@Pc(24) Class2_Sub7 local24 = (Class2_Sub7) this.aClass103_8.method3659((long) arg1);
			return local24 == null ? arg0 : local24.anInt534;
		}
	}
}

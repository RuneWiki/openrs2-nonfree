import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub9_Sub5 extends Class2_Sub9 {

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "Lclient!cm;")
	private Class41 aClass41_11;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!ef;)V")
	public void method1888(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3124();
			if (local7 == 0) {
				return;
			}
			this.method1891(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method1889(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass41_11 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub14 local16 = (Class2_Sub14) this.aClass41_11.method902((long) arg0);
			return local16 == null ? arg1 : local16.aString15;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)I")
	public int method1890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass41_11 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub23 local16 = (Class2_Sub23) this.aClass41_11.method902((long) arg0);
			return local16 == null ? arg1 : local16.anInt3818;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!ef;)V")
	private void method1891(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(15) int local15 = arg1.method3124();
		@Pc(22) int local22;
		if (this.aClass41_11 == null) {
			local22 = Static51.method1026(local15);
			this.aClass41_11 = new Class41(local22);
		}
		for (local22 = 0; local22 < local15; local22++) {
			@Pc(41) boolean local41 = arg1.method3124() == 1;
			@Pc(45) int local45 = arg1.method3163();
			@Pc(54) Class2 local54;
			if (local41) {
				local54 = new Class2_Sub14(arg1.method3113());
			} else {
				local54 = new Class2_Sub23(arg1.method3135());
			}
			this.aClass41_11.method901(local54, (long) local45);
		}
	}
}

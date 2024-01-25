import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class1_Sub4_Sub7 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "Lclient!dq;")
	private Class38 aClass38_6;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZ)I")
	public int method1588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass38_6 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub9 local16 = (Class1_Sub9) this.aClass38_6.method1475((long) arg0);
			return local16 == null ? arg1 : local16.anInt571;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLclient!at;)V")
	private void method1589(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(14) int local14 = arg1.method2132();
		@Pc(21) int local21;
		if (this.aClass38_6 == null) {
			local21 = Static73.method1617(local14);
			this.aClass38_6 = new Class38(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(42) boolean local42 = arg1.method2132() == 1;
			@Pc(46) int local46 = arg1.method2119();
			@Pc(55) Class1 local55;
			if (local42) {
				local55 = new Class1_Sub38(arg1.method2109());
			} else {
				local55 = new Class1_Sub9(arg1.method2140());
			}
			this.aClass38_6.method1472(local55, (long) local46);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!at;)V")
	public void method1591(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2132();
			if (local9 == 0) {
				return;
			}
			this.method1589(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method1592(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass38_6 == null) {
			return arg0;
		} else {
			@Pc(23) Class1_Sub38 local23 = (Class1_Sub38) this.aClass38_6.method1475((long) arg1);
			return local23 == null ? arg0 : local23.aString56;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class3_Sub7_Sub21 extends Class3_Sub7 {

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "Lclient!baa;")
	private Class25 aClass25_43;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!dc;I)V")
	public void method7913(@OriginalArg(0) Class3_Sub9 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5633();
			if (local12 == 0) {
				return;
			}
			this.method7915(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBLclient!dc;)V")
	private void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(8) int local8 = arg1.method5633();
		@Pc(15) int local15;
		if (this.aClass25_43 == null) {
			local15 = Static533.method1203(local8);
			this.aClass25_43 = new Class25(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(34) boolean local34 = arg1.method5633() == 1;
			@Pc(38) int local38 = arg1.method5604();
			@Pc(47) Class3 local47;
			if (local34) {
				local47 = new Class3_Sub14(arg1.method5607());
			} else {
				local47 = new Class3_Sub51(arg1.method5585());
			}
			this.aClass25_43.method434((long) local38, local47);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
	public String method7917(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass25_43 == null) {
			return arg1;
		} else {
			@Pc(21) Class3_Sub14 local21 = (Class3_Sub14) this.aClass25_43.method426((long) arg0);
			return local21 == null ? arg1 : local21.aString16;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)I")
	public int method7918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass25_43 == null) {
			return arg0;
		} else {
			@Pc(20) Class3_Sub51 local20 = (Class3_Sub51) this.aClass25_43.method426((long) arg1);
			return local20 == null ? arg0 : local20.anInt9787;
		}
	}
}

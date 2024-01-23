import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wi", name = "D", descriptor = "Lclient!vd;")
	private Class140 aClass140_21;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ql;I)V")
	private void method4201(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(10) int local10 = arg0.method1772();
		@Pc(17) int local17;
		if (this.aClass140_21 == null) {
			local17 = Static110.method2245(local10);
			this.aClass140_21 = new Class140(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(38) boolean local38 = arg0.method1772() == 1;
			@Pc(42) int local42 = arg0.method1773();
			@Pc(51) Class1 local51;
			if (local38) {
				local51 = new Class1_Sub11(arg0.method1774());
			} else {
				local51 = new Class1_Sub24(arg0.method1802());
			}
			this.aClass140_21.method4011(local51, (long) local42);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I")
	public int method4202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass140_21 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub24 local21 = (Class1_Sub24) this.aClass140_21.method4014((long) arg0);
			return local21 == null ? arg1 : local21.anInt4545;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ql;)V")
	public void method4203(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1772();
			if (local9 == 0) {
				return;
			}
			this.method4201(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method4204(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass140_21 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub11 local16 = (Class1_Sub11) this.aClass140_21.method4014((long) arg1);
			return local16 == null ? arg0 : local16.aString128;
		}
	}
}

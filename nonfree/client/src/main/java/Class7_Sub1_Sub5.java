import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class7_Sub1_Sub5 extends Class7_Sub1 {

	@OriginalMember(owner = "client!bn", name = "K", descriptor = "Lclient!aj;")
	private Class10 aClass10_6;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method499(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass10_6 == null) {
			return arg0;
		} else {
			@Pc(18) Class7_Sub30 local18 = (Class7_Sub30) this.aClass10_6.method163((long) arg1);
			return local18 == null ? arg0 : local18.aString300;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ap;II)V")
	private void method501(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method2772();
		@Pc(19) int local19;
		if (this.aClass10_6 == null) {
			local19 = Static271.method4522(local12);
			this.aClass10_6 = new Class10(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(37) boolean local37 = arg0.method2772() == 1;
			@Pc(41) int local41 = arg0.method2791();
			@Pc(50) Class7 local50;
			if (local37) {
				local50 = new Class7_Sub30(arg0.method2782());
			} else {
				local50 = new Class7_Sub10(arg0.method2767());
			}
			this.aClass10_6.method161((long) local41, local50);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ap;B)V")
	public void method502(@OriginalArg(0) Class7_Sub3 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method2772();
			if (local8 == 0) {
				return;
			}
			this.method501(arg0, local8);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I")
	public int method504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass10_6 == null) {
			return arg0;
		} else {
			@Pc(24) Class7_Sub10 local24 = (Class7_Sub10) this.aClass10_6.method163((long) arg1);
			return local24 == null ? arg0 : local24.anInt2111;
		}
	}
}

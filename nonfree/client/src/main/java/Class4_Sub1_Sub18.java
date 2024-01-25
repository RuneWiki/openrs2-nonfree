import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class4_Sub1_Sub18 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "Lclient!ib;")
	private Class102 aClass102_35;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!iv;II)V")
	private void method4667(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(14) int local14 = arg0.method2490();
		@Pc(23) int local23;
		if (this.aClass102_35 == null) {
			local23 = Static370.method4949(local14);
			this.aClass102_35 = new Class102(local23);
		}
		for (local23 = 0; local23 < local14; local23++) {
			@Pc(42) boolean local42 = arg0.method2490() == 1;
			@Pc(46) int local46 = arg0.method2493();
			@Pc(55) Class4 local55;
			if (local42) {
				local55 = new Class4_Sub7(arg0.method2537());
			} else {
				local55 = new Class4_Sub37(arg0.method2529());
			}
			this.aClass102_35.method2703((long) local46, local55);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!iv;)V")
	public void method4668(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2490();
			if (local12 == 0) {
				return;
			}
			this.method4667(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I")
	public int method4670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass102_35 == null) {
			return arg0;
		} else {
			@Pc(23) Class4_Sub37 local23 = (Class4_Sub37) this.aClass102_35.method2700((long) arg1);
			return local23 == null ? arg0 : local23.anInt5426;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4671(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass102_35 == null) {
			return arg0;
		} else {
			@Pc(21) Class4_Sub7 local21 = (Class4_Sub7) this.aClass102_35.method2700((long) arg1);
			return local21 == null ? arg0 : local21.aString12;
		}
	}
}

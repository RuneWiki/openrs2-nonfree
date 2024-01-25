import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class1_Sub5_Sub7 extends Class1_Sub5 {

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "Lclient!qh;")
	private Class199 aClass199_75;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ug;IZ)V")
	private void method2089(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(10) int local10 = arg0.method5337();
		@Pc(17) int local17;
		if (this.aClass199_75 == null) {
			local17 = Static191.method2740(local10);
			this.aClass199_75 = new Class199(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(36) boolean local36 = arg0.method5337() == 1;
			@Pc(40) int local40 = arg0.method5345();
			@Pc(49) Class1 local49;
			if (local36) {
				local49 = new Class1_Sub33(arg0.method5381());
			} else {
				local49 = new Class1_Sub26(arg0.method5355());
			}
			this.aClass199_75.method4383((long) local40, local49);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ug;B)V")
	public void method2091(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method2089(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method2093(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass199_75 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub33 local21 = (Class1_Sub33) this.aClass199_75.method4387((long) arg0);
			return local21 == null ? arg1 : local21.aString60;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)I")
	public int method2094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass199_75 == null) {
			return arg0;
		} else {
			@Pc(18) Class1_Sub26 local18 = (Class1_Sub26) this.aClass199_75.method4387((long) arg1);
			return local18 == null ? arg0 : local18.anInt3459;
		}
	}
}

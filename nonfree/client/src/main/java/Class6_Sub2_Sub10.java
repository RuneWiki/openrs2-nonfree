import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class6_Sub2_Sub10 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "Lclient!dfa;")
	private Class74 aClass74_28;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method4497(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3030();
			if (local14 == 0) {
				return;
			}
			this.method4499(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method4498(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass74_28 == null) {
			return arg0;
		} else {
			@Pc(25) Class6_Sub43 local25 = (Class6_Sub43) this.aClass74_28.method1401((long) arg1);
			return local25 == null ? arg0 : local25.aString89;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method4499(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(14) int local14 = arg0.method3030();
		@Pc(21) int local21;
		if (this.aClass74_28 == null) {
			local21 = Static314.method4970(local14);
			this.aClass74_28 = new Class74(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(45) boolean local45 = arg0.method3030() == 1;
			@Pc(49) int local49 = arg0.method2987();
			@Pc(58) Class6 local58;
			if (local45) {
				local58 = new Class6_Sub43(arg0.method3046());
			} else {
				local58 = new Class6_Sub6(arg0.method3015());
			}
			this.aClass74_28.method1399(local58, (long) local49);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public int method4502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass74_28 == null) {
			return arg0;
		} else {
			@Pc(17) Class6_Sub6 local17 = (Class6_Sub6) this.aClass74_28.method1401((long) arg1);
			return local17 == null ? arg0 : local17.anInt482;
		}
	}
}

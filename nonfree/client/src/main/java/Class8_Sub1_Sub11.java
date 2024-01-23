import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class8_Sub1_Sub11 extends Class8_Sub1 {

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "Lclient!pd;")
	private Class129 aClass129_19;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method2941(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass129_19 == null) {
			return arg0;
		} else {
			@Pc(22) Class8_Sub7 local22 = (Class8_Sub7) this.aClass129_19.method3043((long) arg1);
			return local22 == null ? arg0 : local22.aString35;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!aj;BI)V")
	private void method2945(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method2334();
		@Pc(19) int local19;
		if (this.aClass129_19 == null) {
			local19 = Static95.method1518(local12);
			this.aClass129_19 = new Class129(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(43) boolean local43 = arg0.method2334() == 1;
			@Pc(47) int local47 = arg0.method2323();
			@Pc(56) Class8 local56;
			if (local43) {
				local56 = new Class8_Sub7(arg0.method2372());
			} else {
				local56 = new Class8_Sub28(arg0.method2352());
			}
			this.aClass129_19.method3039(local56, (long) local47);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!aj;)V")
	public void method2946(@OriginalArg(1) Class8_Sub2 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method2334();
			if (local18 == 0) {
				return;
			}
			this.method2945(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I")
	public int method2948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass129_19 == null) {
			return arg0;
		} else {
			@Pc(22) Class8_Sub28 local22 = (Class8_Sub28) this.aClass129_19.method3043((long) arg1);
			return local22 == null ? arg0 : local22.anInt4870;
		}
	}
}

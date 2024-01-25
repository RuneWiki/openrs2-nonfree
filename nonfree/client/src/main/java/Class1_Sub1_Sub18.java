import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Lclient!lb;")
	private Class174 aClass174_31;

	static {
		new Class114("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLclient!gw;)V")
	public void method6566(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method6567(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZILclient!gw;)V")
	private void method6567(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(12) int local12 = arg1.method3043();
		@Pc(19) int local19;
		if (this.aClass174_31 == null) {
			local19 = Static117.method2662(local12);
			this.aClass174_31 = new Class174(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(39) boolean local39 = arg1.method3043() == 1;
			@Pc(43) int local43 = arg1.method3039();
			@Pc(52) Class1 local52;
			if (local39) {
				local52 = new Class1_Sub24(arg1.method3034());
			} else {
				local52 = new Class1_Sub33(arg1.method3037());
			}
			this.aClass174_31.method4420(local52, (long) local43);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
	public int method6569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass174_31 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub33 local21 = (Class1_Sub33) this.aClass174_31.method4422((long) arg1);
			return local21 == null ? arg0 : local21.anInt6397;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method6570(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass174_31 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub24 local21 = (Class1_Sub24) this.aClass174_31.method4422((long) arg0);
			return local21 == null ? arg1 : local21.aString29;
		}
	}
}

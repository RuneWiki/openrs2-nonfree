import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class8 {

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "Lclient!rh;")
	private Class1_Sub2 aClass1_Sub2_11 = new Class1_Sub2();

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "Lclient!nk;")
	private Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "Lclient!hd;")
	private Class50 aClass50_4;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class8(@OriginalArg(0) int arg0) {
		this.anInt292 = arg0;
		this.anInt289 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass50_4 = new Class50(local19);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!rh;BJ)V")
	public void method304(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt289 == 0) {
			@Pc(19) Class1_Sub2 local19 = this.aClass85_1.method2429();
			local19.method3735();
			local19.method3682();
			if (this.aClass1_Sub2_11 == local19) {
				local19 = this.aClass85_1.method2429();
				local19.method3735();
				local19.method3682();
			}
		} else {
			this.anInt289--;
		}
		this.aClass50_4.method1362(arg1, arg0);
		this.aClass85_1.method2432(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Lclient!rb;")
	public Class1 method305() {
		return this.aClass50_4.method1358();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Lclient!rb;")
	public Class1 method306() {
		return this.aClass50_4.method1361();
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public void method308() {
		this.aClass85_1.method2427();
		this.aClass50_4.method1360();
		this.aClass1_Sub2_11 = new Class1_Sub2();
		this.anInt289 = this.anInt292;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Lclient!rh;")
	public Class1_Sub2 method312(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass50_4.method1364(arg0);
		if (local10 != null) {
			this.aClass85_1.method2432(local10);
		}
		return local10;
	}
}

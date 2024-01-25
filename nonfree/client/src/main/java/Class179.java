import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class179 {

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "Lclient!tia;")
	private Class3_Sub11 aClass3_Sub11_42 = new Class3_Sub11();

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "Lclient!dha;")
	private final Class74 aClass74_7 = new Class74();

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
	private final int anInt4950;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
	private int anInt4948;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "Lclient!ee;")
	private final Class83 aClass83_14;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V")
	public Class179(@OriginalArg(0) int arg0) {
		this.anInt4950 = arg0;
		this.anInt4948 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass83_14 = new Class83(local19);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(JI)Lclient!tia;")
	public Class3_Sub11 method4558(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub11 local10 = (Class3_Sub11) this.aClass83_14.method2368(arg0);
		if (local10 != null) {
			this.aClass74_7.method1840(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(JI)V")
	public void method4561(@OriginalArg(0) long arg0) {
		@Pc(13) Class3_Sub11 local13 = (Class3_Sub11) this.aClass83_14.method2368(arg0);
		if (local13 != null) {
			local13.method9380();
			local13.method9345();
			this.anInt4948++;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!tia;IJ)V")
	public void method4562(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4948 == 0) {
			@Pc(14) Class3_Sub11 local14 = this.aClass74_7.method1843();
			local14.method9380();
			local14.method9345();
			if (local14 == this.aClass3_Sub11_42) {
				local14 = this.aClass74_7.method1843();
				local14.method9380();
				local14.method9345();
			}
		} else {
			this.anInt4948--;
		}
		this.aClass83_14.method2377(arg1, arg0);
		this.aClass74_7.method1840(arg0);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	public void method4563() {
		this.aClass74_7.method1845();
		this.aClass83_14.method2374();
		this.aClass3_Sub11_42 = new Class3_Sub11();
		this.anInt4948 = this.anInt4950;
	}
}

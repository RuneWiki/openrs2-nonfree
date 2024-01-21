import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class47 {

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!uc;")
	private final Class1_Sub2 aClass1_Sub2_47 = new Class1_Sub2();

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!se;")
	private final Class79 aClass79_2 = new Class79();

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	private final int anInt2782;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!l;")
	private final Class45 aClass45_9;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
	public Class47(@OriginalArg(0) int arg0) {
		this.anInt2783 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt2782 = arg0;
		while (local16 + local16 < arg0) {
			local16 += local16;
		}
		this.aClass45_9 = new Class45(local16);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Lclient!lb;")
	public Class1 method1991() {
		return this.aClass45_9.method1986();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)V")
	public void method1993(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass45_9.method1988(arg0);
		if (local10 != null) {
			local10.method3056();
			local10.method2789();
			this.anInt2783++;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public void method1995() {
		while (true) {
			@Pc(15) Class1_Sub2 local15 = this.aClass79_2.method2675();
			if (local15 == null) {
				this.anInt2783 = this.anInt2782;
				return;
			}
			local15.method3056();
			local15.method2789();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Lclient!lb;")
	public Class1 method1997() {
		return this.aClass45_9.method1982();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!uc;JI)V")
	public void method1998(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt2783 == 0) {
			@Pc(18) Class1_Sub2 local18 = this.aClass79_2.method2675();
			local18.method3056();
			local18.method2789();
			if (local18 == this.aClass1_Sub2_47) {
				local18 = this.aClass79_2.method2675();
				local18.method3056();
				local18.method2789();
			}
		} else {
			this.anInt2783--;
		}
		this.aClass45_9.method1981(arg0, arg1);
		this.aClass79_2.method2672(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZJ)Lclient!uc;")
	public Class1_Sub2 method1999(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass45_9.method1988(arg0);
		if (local10 != null) {
			this.aClass79_2.method2672(local10);
		}
		return local10;
	}
}

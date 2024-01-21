import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class59 {

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!ke;")
	private final Class1_Sub2 aClass1_Sub2_49 = new Class1_Sub2();

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Lclient!q;")
	private final Class71 aClass71_2 = new Class71();

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
	private int anInt2537;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
	private final int anInt2538;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!ah;")
	private final Class5 aClass5_7;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
	public Class59(@OriginalArg(0) int arg0) {
		this.anInt2537 = arg0;
		this.anInt2538 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass5_7 = new Class5(local19);
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Lclient!o;")
	public Class1 method1966() {
		return this.aClass5_7.method140();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public void method1967() {
		while (true) {
			@Pc(6) Class1_Sub2 local6 = this.aClass71_2.method2253();
			if (local6 == null) {
				this.anInt2537 = this.anInt2538;
				return;
			}
			local6.method3134();
			local6.method3072();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(JI)Lclient!ke;")
	public Class1_Sub2 method1970(@OriginalArg(0) long arg0) {
		@Pc(19) Class1_Sub2 local19 = (Class1_Sub2) this.aClass5_7.method134(arg0);
		if (local19 != null) {
			this.aClass71_2.method2254(local19);
		}
		return local19;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)V")
	public void method1971(@OriginalArg(1) long arg0) {
		@Pc(8) Class1_Sub2 local8 = (Class1_Sub2) this.aClass5_7.method134(arg0);
		if (local8 != null) {
			local8.method3134();
			local8.method3072();
			this.anInt2537++;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lclient!o;")
	public Class1 method1972() {
		return this.aClass5_7.method132();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ke;JB)V")
	public void method1973(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt2537 == 0) {
			@Pc(10) Class1_Sub2 local10 = this.aClass71_2.method2253();
			local10.method3134();
			local10.method3072();
			if (local10 == this.aClass1_Sub2_49) {
				local10 = this.aClass71_2.method2253();
				local10.method3134();
				local10.method3072();
			}
		} else {
			this.anInt2537--;
		}
		this.aClass5_7.method138(arg0, arg1);
		this.aClass71_2.method2254(arg0);
	}
}

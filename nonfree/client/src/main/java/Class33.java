import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class33 {

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!gb;")
	private final Class1_Sub1 aClass1_Sub1_43 = new Class1_Sub1();

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!l;")
	private final Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	private final int anInt1562;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	private int anInt1563;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!ta;")
	private final Class70 aClass70_4;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.anInt1562 = arg0;
		this.anInt1563 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass70_4 = new Class70(local19);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method1034() {
		while (true) {
			@Pc(6) Class1_Sub1 local6 = this.aClass42_1.method1203();
			if (local6 == null) {
				this.anInt1563 = this.anInt1562;
				return;
			}
			local6.method2128();
			local6.method2110();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(JI)V")
	public void method1037(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub1 local10 = (Class1_Sub1) this.aClass70_4.method1961(arg0);
		if (local10 != null) {
			local10.method2128();
			local10.method2110();
			this.anInt1563++;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJ)Lclient!gb;")
	public Class1_Sub1 method1038(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub1 local10 = (Class1_Sub1) this.aClass70_4.method1961(arg0);
		if (local10 != null) {
			this.aClass42_1.method1201(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!gb;IJ)V")
	public void method1042(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1563 == 0) {
			@Pc(26) Class1_Sub1 local26 = this.aClass42_1.method1203();
			local26.method2128();
			local26.method2110();
			if (local26 == this.aClass1_Sub1_43) {
				local26 = this.aClass42_1.method1203();
				local26.method2128();
				local26.method2110();
			}
		} else {
			this.anInt1563--;
		}
		this.aClass70_4.method1955(arg0, arg1);
		this.aClass42_1.method1201(arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class58 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!v;")
	private Class1_Sub1 aClass1_Sub1_28 = new Class1_Sub1();

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!ad;")
	private Class5 aClass5_10 = new Class5();

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	private int anInt1494;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "I")
	private int anInt1495;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!s;")
	private Class156 aClass156_7;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.anInt1494 = arg0;
		this.anInt1495 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass156_7 = new Class156(local19);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public void method1227() {
		this.aClass5_10.method55();
		this.aClass156_7.method3826();
		this.aClass1_Sub1_28 = new Class1_Sub1();
		this.anInt1495 = this.anInt1494;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)Lclient!mg;")
	public Class1 method1228() {
		return this.aClass156_7.method3822();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(JILclient!v;)V")
	public void method1229(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (this.anInt1495 == 0) {
			@Pc(18) Class1_Sub1 local18 = this.aClass5_10.method53();
			local18.method4616();
			local18.method4617();
			if (this.aClass1_Sub1_28 == local18) {
				local18 = this.aClass5_10.method53();
				local18.method4616();
				local18.method4617();
			}
		} else {
			this.anInt1495--;
		}
		this.aClass156_7.method3816(arg0, arg1);
		this.aClass5_10.method48(arg1);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Lclient!mg;")
	public Class1 method1232() {
		return this.aClass156_7.method3820();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)Lclient!v;")
	public Class1_Sub1 method1233(@OriginalArg(1) long arg0) {
		@Pc(18) Class1_Sub1 local18 = (Class1_Sub1) this.aClass156_7.method3821(arg0);
		if (local18 != null) {
			this.aClass5_10.method48(local18);
		}
		return local18;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class22 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!cd;")
	private final Class2_Sub1 aClass2_Sub1_26 = new Class2_Sub1();

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!a;")
	private final Class1 aClass1_3 = new Class1();

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	private final int anInt921;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!ja;")
	private final Class31 aClass31_1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V")
	public Class22(@OriginalArg(0) int arg0) {
		this.anInt921 = arg0;
		this.anInt919 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass31_1 = new Class31(local19);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)Lclient!cd;")
	public Class2_Sub1 method711(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub1 local15 = (Class2_Sub1) this.aClass31_1.method905(arg0);
		if (local15 != null) {
			this.aClass1_3.method5(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!cd;J)V")
	public void method712(@OriginalArg(1) Class2_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt919 == 0) {
			@Pc(19) Class2_Sub1 local19 = this.aClass1_3.method6();
			local19.method2073();
			local19.method2025();
			if (local19 == this.aClass2_Sub1_26) {
				local19 = this.aClass1_3.method6();
				local19.method2073();
				local19.method2025();
			}
		} else {
			this.anInt919--;
		}
		this.aClass31_1.method912(arg1, arg0);
		this.aClass1_3.method5(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IJ)V")
	public void method713(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub1 local15 = (Class2_Sub1) this.aClass31_1.method905(arg0);
		if (local15 != null) {
			local15.method2073();
			local15.method2025();
			this.anInt919++;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public void method716() {
		while (true) {
			@Pc(19) Class2_Sub1 local19 = this.aClass1_3.method6();
			if (local19 == null) {
				this.anInt919 = this.anInt921;
				return;
			}
			local19.method2073();
			local19.method2025();
		}
	}
}

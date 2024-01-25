import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class119 {

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!bba;")
	private Class30 aClass30_2;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!wm;")
	private final Class390 aClass390_38;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!wm;")
	private final Class390 aClass390_39;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;)V")
	public Class119(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1) {
		this.aClass390_38 = arg1;
		this.aClass390_39 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!rh;B)Lclient!ol;")
	public Interface21 method2963(@OriginalArg(0) Interface24 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(19) Class139 local19 = arg0.method8810();
		if (Static456.aClass139_7 == local19) {
			return new Class319((Class100) arg0);
		} else if (local19 == Static149.aClass139_3) {
			return new Class108(this.method2966(), (Class62) arg0);
		} else if (Static490.aClass139_8 == local19) {
			return new Class271(this.aClass390_39, (Class46) arg0);
		} else if (local19 == Static3.aClass139_1) {
			return new Class271_Sub1(this.aClass390_39, (Class46_Sub1) arg0);
		} else if (Static590.aClass139_10 == local19) {
			return new Class128_Sub1(this.aClass390_39, this.aClass390_38, (Class10_Sub3) arg0);
		} else if (Static549.aClass139_9 == local19) {
			return new Class128_Sub3(this.aClass390_39, this.aClass390_38, (Class10_Sub1) arg0);
		} else if (local19 == Static340.aClass139_5) {
			return new Class128_Sub2(this.aClass390_39, this.aClass390_38, (Class10_Sub2) arg0);
		} else if (local19 == Static212.aClass139_4) {
			return new Class293(this.aClass390_39, this.aClass390_38, (Class181) arg0);
		} else if (local19 == Static432.aClass139_6) {
			return new Class337(this.aClass390_39, (Class218) arg0);
		} else if (Static73.aClass139_2 == local19) {
			return new Class128_Sub2_Sub1(this.aClass390_39, this.aClass390_38, (Class10_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)Lclient!bba;")
	private Class30 method2966() {
		if (this.aClass30_2 == null) {
			this.aClass30_2 = new Class30();
		}
		return this.aClass30_2;
	}
}

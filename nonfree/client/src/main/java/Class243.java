import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class243 {

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Lclient!mg;")
	private Class6_Sub2 aClass6_Sub2_48 = new Class6_Sub2();

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Lclient!nf;")
	private final Class170 aClass170_11 = new Class170();

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	private final int anInt7242;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
	private int anInt7243;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Lclient!fe;")
	private final Class74 aClass74_30;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
	public Class243(@OriginalArg(0) int arg0) {
		this.anInt7242 = arg0;
		this.anInt7243 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass74_30 = new Class74(local19);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!mg;JI)V")
	public void method5960(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt7243 == 0) {
			@Pc(20) Class6_Sub2 local20 = this.aClass170_11.method4003();
			local20.method6525();
			local20.method6373();
			if (this.aClass6_Sub2_48 == local20) {
				local20 = this.aClass170_11.method4003();
				local20.method6525();
				local20.method6373();
			}
		} else {
			this.anInt7243--;
		}
		this.aClass74_30.method1890(arg1, arg0);
		this.aClass170_11.method4001(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZJ)Lclient!mg;")
	public Class6_Sub2 method5962(@OriginalArg(1) long arg0) {
		@Pc(15) Class6_Sub2 local15 = (Class6_Sub2) this.aClass74_30.method1883(arg0);
		if (local15 != null) {
			this.aClass170_11.method4001(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method5963() {
		this.aClass170_11.method4007();
		this.aClass74_30.method1888();
		this.aClass6_Sub2_48 = new Class6_Sub2();
		this.anInt7243 = this.anInt7242;
	}
}

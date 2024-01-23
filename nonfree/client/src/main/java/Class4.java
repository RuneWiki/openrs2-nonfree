import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!je;")
	private Class1_Sub1 aClass1_Sub1_5 = new Class1_Sub1();

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!vb;")
	private Class121 aClass121_1 = new Class121();

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!qc;")
	private Class90 aClass90_2;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V")
	public Class4(@OriginalArg(0) int arg0) {
		this.anInt104 = arg0;
		this.anInt105 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass90_2 = new Class90(local19);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!sa;")
	public Class1 method73() {
		return this.aClass90_2.method2821();
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public void method75() {
		this.aClass121_1.method3376();
		this.aClass90_2.method2818();
		this.aClass1_Sub1_5 = new Class1_Sub1();
		this.anInt104 = this.anInt105;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Lclient!sa;")
	public Class1 method79() {
		return this.aClass90_2.method2823();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JB)Lclient!je;")
	public Class1_Sub1 method81(@OriginalArg(0) long arg0) {
		@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) this.aClass90_2.method2819(arg0);
		if (local20 != null) {
			this.aClass121_1.method3383(local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!je;J)V")
	public void method83(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt104 == 0) {
			@Pc(18) Class1_Sub1 local18 = this.aClass121_1.method3374();
			local18.method3525();
			local18.method3531();
			if (local18 == this.aClass1_Sub1_5) {
				local18 = this.aClass121_1.method3374();
				local18.method3525();
				local18.method3531();
			}
		} else {
			this.anInt104--;
		}
		this.aClass90_2.method2817(arg0, arg1);
		this.aClass121_1.method3383(arg0);
	}
}

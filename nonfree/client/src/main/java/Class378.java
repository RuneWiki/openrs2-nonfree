import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class378 {

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Lclient!v;")
	private Class14_Sub2 aClass14_Sub2_65 = new Class14_Sub2();

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "Lclient!oga;")
	private final Class269 aClass269_169 = new Class269();

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
	private int anInt10631;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	private final int anInt10632;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!fw;")
	private final Class125 aClass125_44;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
	public Class378(@OriginalArg(0) int arg0) {
		this.anInt10631 = arg0;
		this.anInt10632 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass125_44 = new Class125(local19);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!v;J)V")
	public void method9078(@OriginalArg(1) Class14_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt10631 == 0) {
			@Pc(10) Class14_Sub2 local10 = this.aClass269_169.method6490();
			local10.method9513();
			local10.method9093();
			if (this.aClass14_Sub2_65 == local10) {
				local10 = this.aClass269_169.method6490();
				local10.method9513();
				local10.method9093();
			}
		} else {
			this.anInt10631--;
		}
		this.aClass125_44.method2626(arg0, arg1);
		this.aClass269_169.method6493(arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BJ)V")
	public void method9080(@OriginalArg(1) long arg0) {
		@Pc(10) Class14_Sub2 local10 = (Class14_Sub2) this.aClass125_44.method2630(arg0);
		if (local10 != null) {
			local10.method9513();
			local10.method9093();
			this.anInt10631++;
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(BJ)Lclient!v;")
	public Class14_Sub2 method9082(@OriginalArg(1) long arg0) {
		@Pc(10) Class14_Sub2 local10 = (Class14_Sub2) this.aClass125_44.method2630(arg0);
		if (local10 != null) {
			this.aClass269_169.method6493(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
	public void method9083() {
		this.aClass269_169.method6492();
		this.aClass125_44.method2628();
		this.aClass14_Sub2_65 = new Class14_Sub2();
		this.anInt10631 = this.anInt10632;
	}
}

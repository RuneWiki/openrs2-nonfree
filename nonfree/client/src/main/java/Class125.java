import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class125 {

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!na;")
	private Class1_Sub2 aClass1_Sub2_51 = new Class1_Sub2();

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!nb;")
	private Class104 aClass104_8 = new Class104();

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	private int anInt4623;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
	private int anInt4625;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "Lclient!ol;")
	private Class117 aClass117_16;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V")
	public Class125(@OriginalArg(0) int arg0) {
		this.anInt4623 = arg0;
		this.anInt4625 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass117_16 = new Class117(local19);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public void method3666() {
		this.aClass104_8.method3147();
		this.aClass117_16.method3440();
		this.aClass1_Sub2_51 = new Class1_Sub2();
		this.anInt4625 = this.anInt4623;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Lclient!hl;")
	public Class1 method3668() {
		return this.aClass117_16.method3444();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(JZ)Lclient!na;")
	public Class1_Sub2 method3669(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass117_16.method3438(arg0);
		if (local10 != null) {
			this.aClass104_8.method3145(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Lclient!hl;")
	public Class1 method3670() {
		return this.aClass117_16.method3441();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!na;IJ)V")
	public void method3671(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4625 == 0) {
			@Pc(22) Class1_Sub2 local22 = this.aClass104_8.method3149();
			local22.method4742();
			local22.method4661();
			if (local22 == this.aClass1_Sub2_51) {
				local22 = this.aClass104_8.method3149();
				local22.method4742();
				local22.method4661();
			}
		} else {
			this.anInt4625--;
		}
		this.aClass117_16.method3445(arg0, arg1);
		this.aClass104_8.method3145(arg0);
	}
}

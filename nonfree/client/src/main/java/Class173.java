import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class173 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!np;")
	private Class3_Sub3 aClass3_Sub3_48 = new Class3_Sub3();

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!vi;")
	private final Class248 aClass248_3 = new Class248();

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	private int anInt5202;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	private final int anInt5204;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Lclient!jr;")
	private final Class127 aClass127_28;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
	public Class173(@OriginalArg(0) int arg0) {
		this.anInt5202 = arg0;
		this.anInt5204 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass127_28 = new Class127(local19);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!np;JI)V")
	public void method4159(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt5202 == 0) {
			@Pc(17) Class3_Sub3 local17 = this.aClass248_3.method5662();
			local17.method5987();
			local17.method4647();
			if (this.aClass3_Sub3_48 == local17) {
				local17 = this.aClass248_3.method5662();
				local17.method5987();
				local17.method4647();
			}
		} else {
			this.anInt5202--;
		}
		this.aClass127_28.method3257(arg1, arg0);
		this.aClass248_3.method5659(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public void method4162() {
		this.aClass248_3.method5663();
		this.aClass127_28.method3249();
		this.aClass3_Sub3_48 = new Class3_Sub3();
		this.anInt5202 = this.anInt5204;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)Lclient!np;")
	public Class3_Sub3 method4163(@OriginalArg(0) long arg0) {
		@Pc(15) Class3_Sub3 local15 = (Class3_Sub3) this.aClass127_28.method3246(arg0);
		if (local15 != null) {
			this.aClass248_3.method5659(local15);
		}
		return local15;
	}
}

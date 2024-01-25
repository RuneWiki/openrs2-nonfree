import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class164 {

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "Lclient!ge;")
	private Class2_Sub2 aClass2_Sub2_36 = new Class2_Sub2();

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "Lclient!ld;")
	private final Class145 aClass145_5 = new Class145();

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
	private final int anInt4797;

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
	private int anInt4798;

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "Lclient!ub;")
	private final Class240 aClass240_23;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(I)V")
	public Class164(@OriginalArg(0) int arg0) {
		this.anInt4797 = arg0;
		this.anInt4798 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass240_23 = new Class240(local19);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IJ)Lclient!ge;")
	public Class2_Sub2 method3874(@OriginalArg(1) long arg0) {
		@Pc(14) Class2_Sub2 local14 = (Class2_Sub2) this.aClass240_23.method5439(arg0);
		if (local14 != null) {
			this.aClass145_5.method3387(local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
	public void method3875() {
		this.aClass145_5.method3388();
		this.aClass240_23.method5433();
		this.aClass2_Sub2_36 = new Class2_Sub2();
		this.anInt4798 = this.anInt4797;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!ge;BJ)V")
	public void method3877(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4798 == 0) {
			@Pc(11) Class2_Sub2 local11 = this.aClass145_5.method3391();
			local11.method6072();
			local11.method5934();
			if (this.aClass2_Sub2_36 == local11) {
				local11 = this.aClass145_5.method3391();
				local11.method6072();
				local11.method5934();
			}
		} else {
			this.anInt4798--;
		}
		this.aClass240_23.method5430(arg1, arg0);
		this.aClass145_5.method3387(arg0);
	}
}

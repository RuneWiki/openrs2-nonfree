import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class111 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
	public static int[] anIntArray297 = new int[99];

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!nh;")
	private Class4_Sub2 aClass4_Sub2_49 = new Class4_Sub2();

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!jo;")
	private Class86 aClass86_8 = new Class86();

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	private int anInt3551;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	private int anInt3549;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!tm;")
	private Class163 aClass163_28;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(15) int local15 = local6 + 1;
			@Pc(28) int local28 = (int) (Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D + (double) local15);
			local4 += local28;
			anIntArray297[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
	public Class111(@OriginalArg(0) int arg0) {
		this.anInt3551 = arg0;
		this.anInt3549 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass163_28 = new Class163(local19);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lclient!te;")
	public Class4 method2884() {
		return this.aClass163_28.method4192();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IJLclient!nh;)V")
	public void method2886(@OriginalArg(1) long arg0, @OriginalArg(2) Class4_Sub2 arg1) {
		if (this.anInt3551 == 0) {
			@Pc(18) Class4_Sub2 local18 = this.aClass86_8.method2186();
			local18.method4690();
			local18.method4697();
			if (this.aClass4_Sub2_49 == local18) {
				local18 = this.aClass86_8.method2186();
				local18.method4690();
				local18.method4697();
			}
		} else {
			this.anInt3551--;
		}
		this.aClass163_28.method4181(arg0, arg1);
		this.aClass86_8.method2185(arg1);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Lclient!te;")
	public Class4 method2888() {
		return this.aClass163_28.method4183();
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public void method2889() {
		this.aClass86_8.method2179();
		this.aClass163_28.method4190();
		this.aClass4_Sub2_49 = new Class4_Sub2();
		this.anInt3551 = this.anInt3549;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)Lclient!nh;")
	public Class4_Sub2 method2890(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub2 local10 = (Class4_Sub2) this.aClass163_28.method4188(arg0);
		if (local10 != null) {
			this.aClass86_8.method2185(local10);
		}
		return local10;
	}
}

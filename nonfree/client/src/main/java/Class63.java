import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class63 {

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!lg;")
	private final Class3_Sub2 aClass3_Sub2_57 = new Class3_Sub2();

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!wg;")
	private final Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	private final int anInt2998;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	private int anInt3000;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!wf;")
	private final Class87 aClass87_10;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
	public Class63(@OriginalArg(0) int arg0) {
		this.anInt2998 = arg0;
		this.anInt3000 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass87_10 = new Class87(local19);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)Lclient!lg;")
	public Class3_Sub2 method2337(@OriginalArg(1) long arg0) {
		@Pc(6) Class3_Sub2 local6 = (Class3_Sub2) this.aClass87_10.method3201(arg0);
		if (local6 != null) {
			this.aClass88_1.method3207(local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JLclient!lg;I)V")
	public void method2338(@OriginalArg(0) long arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (this.anInt3000 == 0) {
			@Pc(18) Class3_Sub2 local18 = this.aClass88_1.method3205();
			local18.method3167();
			local18.method3174();
			if (local18 == this.aClass3_Sub2_57) {
				local18 = this.aClass88_1.method3205();
				local18.method3167();
				local18.method3174();
			}
		} else {
			this.anInt3000--;
		}
		this.aClass87_10.method3200(arg0, arg1);
		this.aClass88_1.method3207(arg1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JI)V")
	public void method2341(@OriginalArg(0) long arg0) {
		@Pc(6) Class3_Sub2 local6 = (Class3_Sub2) this.aClass87_10.method3201(arg0);
		if (local6 != null) {
			local6.method3167();
			local6.method3174();
			this.anInt3000++;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Lclient!mb;")
	public Class3 method2342() {
		return this.aClass87_10.method3199();
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Lclient!mb;")
	public Class3 method2343() {
		return this.aClass87_10.method3203();
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	public void method2344() {
		while (true) {
			@Pc(9) Class3_Sub2 local9 = this.aClass88_1.method3205();
			if (local9 == null) {
				this.anInt3000 = this.anInt2998;
				return;
			}
			local9.method3167();
			local9.method3174();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class111 {

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!bd;")
	private Class2_Sub1 aClass2_Sub1_16 = new Class2_Sub1();

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "Lclient!em;")
	private final Class71 aClass71_3 = new Class71();

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	private final int anInt2804;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	private int anInt2806;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!ru;")
	private final Class220 aClass220_17;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V")
	public Class111(@OriginalArg(0) int arg0) {
		this.anInt2804 = arg0;
		this.anInt2806 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass220_17 = new Class220(local19);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZJ)Lclient!bd;")
	public Class2_Sub1 method2310(@OriginalArg(1) long arg0) {
		@Pc(16) Class2_Sub1 local16 = (Class2_Sub1) this.aClass220_17.method5099(arg0);
		if (local16 != null) {
			this.aClass71_3.method1430(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	public void method2311() {
		this.aClass71_3.method1429();
		this.aClass220_17.method5105();
		this.aClass2_Sub1_16 = new Class2_Sub1();
		this.anInt2806 = this.anInt2804;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!bd;JI)V")
	public void method2312(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt2806 == 0) {
			@Pc(22) Class2_Sub1 local22 = this.aClass71_3.method1434();
			local22.method6260();
			local22.method5838();
			if (this.aClass2_Sub1_16 == local22) {
				local22 = this.aClass71_3.method1434();
				local22.method6260();
				local22.method5838();
			}
		} else {
			this.anInt2806--;
		}
		this.aClass220_17.method5104(arg0, arg1);
		this.aClass71_3.method1430(arg0);
	}
}

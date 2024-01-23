import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class64 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Lclient!vg;")
	private Class1_Sub2 aClass1_Sub2_23 = new Class1_Sub2();

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "Lclient!bl;")
	private Class17 aClass17_4 = new Class17();

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	private int anInt1684;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
	private int anInt1688;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Lclient!cd;")
	private Class22 aClass22_9;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V")
	public Class64(@OriginalArg(0) int arg0) {
		this.anInt1684 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt1688 = arg0;
		while (arg0 > local16 + local16) {
			local16 += local16;
		}
		this.aClass22_9 = new Class22(local16);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public void method1463() {
		this.aClass17_4.method468();
		this.aClass22_9.method635();
		this.aClass1_Sub2_23 = new Class1_Sub2();
		this.anInt1684 = this.anInt1688;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!vg;JI)V")
	public void method1466(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt1684 == 0) {
			@Pc(16) Class1_Sub2 local16 = this.aClass17_4.method463();
			local16.method4534();
			local16.method4509();
			if (local16 == this.aClass1_Sub2_23) {
				local16 = this.aClass17_4.method463();
				local16.method4534();
				local16.method4509();
			}
		} else {
			this.anInt1684--;
		}
		this.aClass22_9.method643(arg1, arg0);
		this.aClass17_4.method462(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)Lclient!tf;")
	public Class1 method1470() {
		return this.aClass22_9.method637();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(JZ)Lclient!vg;")
	public Class1_Sub2 method1471(@OriginalArg(0) long arg0) {
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass22_9.method633(arg0);
		if (local15 != null) {
			this.aClass17_4.method462(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Lclient!tf;")
	public Class1 method1473() {
		return this.aClass22_9.method640();
	}
}

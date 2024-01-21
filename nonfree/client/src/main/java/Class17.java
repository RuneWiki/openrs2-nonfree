import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class17 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!kb;")
	private final Class2_Sub1 aClass2_Sub1_23 = new Class2_Sub1();

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!wc;")
	private final Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
	private final int anInt1172;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	private int anInt1167;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!qc;")
	private final Class50 aClass50_1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		this.anInt1172 = arg0;
		this.anInt1167 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass50_1 = new Class50(local19);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	public void method782() {
		while (true) {
			@Pc(6) Class2_Sub1 local6 = this.aClass63_1.method1752();
			if (local6 == null) {
				this.anInt1167 = this.anInt1172;
				return;
			}
			local6.method1695();
			local6.method1702();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!kb;ZJ)V")
	public void method783(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1167 == 0) {
			@Pc(19) Class2_Sub1 local19 = this.aClass63_1.method1752();
			local19.method1695();
			local19.method1702();
			if (this.aClass2_Sub1_23 == local19) {
				local19 = this.aClass63_1.method1752();
				local19.method1695();
				local19.method1702();
			}
		} else {
			this.anInt1167--;
		}
		this.aClass50_1.method1461(arg0, arg1);
		this.aClass63_1.method1748(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BJ)V")
	public void method785(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub1 local15 = (Class2_Sub1) this.aClass50_1.method1460(arg0);
		if (local15 != null) {
			local15.method1695();
			local15.method1702();
			this.anInt1167++;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(JB)Lclient!kb;")
	public Class2_Sub1 method786(@OriginalArg(0) long arg0) {
		@Pc(18) Class2_Sub1 local18 = (Class2_Sub1) this.aClass50_1.method1460(arg0);
		if (local18 != null) {
			this.aClass63_1.method1748(local18);
		}
		return local18;
	}
}

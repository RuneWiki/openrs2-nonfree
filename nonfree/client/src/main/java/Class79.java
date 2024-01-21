import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class79 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!ad;")
	private final Class1_Sub1 aClass1_Sub1_58 = new Class1_Sub1();

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!ma;")
	private final Class53 aClass53_2 = new Class53();

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	private final int anInt3843;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	private int anInt3844;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!bf;")
	private final Class10 aClass10_12;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
	public Class79(@OriginalArg(0) int arg0) {
		this.anInt3843 = arg0;
		this.anInt3844 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass10_12 = new Class10(local19);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(JI)V")
	public void method2653(@OriginalArg(0) long arg0) {
		@Pc(16) Class1_Sub1 local16 = (Class1_Sub1) this.aClass10_12.method256(arg0);
		if (local16 != null) {
			local16.method3141();
			local16.method3149();
			this.anInt3844++;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Lclient!hb;")
	public Class1 method2655() {
		return this.aClass10_12.method260();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IJ)Lclient!ad;")
	public Class1_Sub1 method2657(@OriginalArg(1) long arg0) {
		@Pc(18) Class1_Sub1 local18 = (Class1_Sub1) this.aClass10_12.method256(arg0);
		if (local18 != null) {
			this.aClass53_2.method1713(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(JLclient!ad;I)V")
	public void method2658(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (this.anInt3844 == 0) {
			@Pc(30) Class1_Sub1 local30 = this.aClass53_2.method1717();
			local30.method3141();
			local30.method3149();
			if (this.aClass1_Sub1_58 == local30) {
				local30 = this.aClass53_2.method1717();
				local30.method3141();
				local30.method3149();
			}
		} else {
			this.anInt3844--;
		}
		this.aClass10_12.method263(arg1, arg0);
		this.aClass53_2.method1713(arg1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public void method2659() {
		while (true) {
			@Pc(6) Class1_Sub1 local6 = this.aClass53_2.method1717();
			if (local6 == null) {
				this.anInt3844 = this.anInt3843;
				return;
			}
			local6.method3141();
			local6.method3149();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lclient!hb;")
	public Class1 method2660() {
		return this.aClass10_12.method257();
	}
}

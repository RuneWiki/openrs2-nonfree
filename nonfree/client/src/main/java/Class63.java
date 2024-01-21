import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class63 {

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!r;")
	private final Class1_Sub2 aClass1_Sub2_44 = new Class1_Sub2();

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!gb;")
	private final Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!p", name = "v", descriptor = "I")
	private final int anInt2028;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "I")
	private int anInt2029;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!qc;")
	private final Class66 aClass66_14;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I)V")
	public Class63(@OriginalArg(0) int arg0) {
		this.anInt2028 = arg0;
		this.anInt2029 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass66_14 = new Class66(local19);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public void method1513() {
		while (true) {
			@Pc(10) Class1_Sub2 local10 = this.aClass27_1.method899();
			if (local10 == null) {
				this.anInt2029 = this.anInt2028;
				return;
			}
			local10.method2024();
			local10.method1964();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZJ)Lclient!r;")
	public Class1_Sub2 method1517(@OriginalArg(1) long arg0) {
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass66_14.method1650(arg0);
		if (local15 != null) {
			this.aClass27_1.method896(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!r;J)V")
	public void method1520(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2029 == 0) {
			@Pc(8) Class1_Sub2 local8 = this.aClass27_1.method899();
			local8.method2024();
			local8.method1964();
			if (this.aClass1_Sub2_44 == local8) {
				local8 = this.aClass27_1.method899();
				local8.method2024();
				local8.method1964();
			}
		} else {
			this.anInt2029--;
		}
		this.aClass66_14.method1653(arg0, arg1);
		this.aClass27_1.method896(arg0);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(JB)V")
	public void method1521(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass66_14.method1650(arg0);
		if (local10 != null) {
			local10.method2024();
			local10.method1964();
			this.anInt2029++;
		}
	}
}

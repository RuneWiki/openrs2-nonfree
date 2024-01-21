import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class66 {

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Lclient!rc;")
	private final Class3_Sub1 aClass3_Sub1_60 = new Class3_Sub1();

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "Lclient!a;")
	private final Class1 aClass1_2 = new Class1();

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	private int anInt2885;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
	private final int anInt2884;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "Lclient!ec;")
	private final Class17 aClass17_20;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.anInt2885 = arg0;
		this.anInt2884 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass17_20 = new Class17(local19);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)V")
	public void method1968(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub1 local10 = (Class3_Sub1) this.aClass17_20.method599(arg0);
		if (local10 != null) {
			local10.method2201();
			local10.method2210();
			this.anInt2885++;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZJLclient!rc;)V")
	public void method1969(@OriginalArg(1) long arg0, @OriginalArg(2) Class3_Sub1 arg1) {
		if (this.anInt2885 == 0) {
			@Pc(14) Class3_Sub1 local14 = this.aClass1_2.method5();
			local14.method2201();
			local14.method2210();
			if (this.aClass3_Sub1_60 == local14) {
				local14 = this.aClass1_2.method5();
				local14.method2201();
				local14.method2210();
			}
		} else {
			this.anInt2885--;
		}
		this.aClass17_20.method594(arg1, arg0);
		this.aClass1_2.method1(arg1);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(JZ)Lclient!rc;")
	public Class3_Sub1 method1970(@OriginalArg(0) long arg0) {
		@Pc(15) Class3_Sub1 local15 = (Class3_Sub1) this.aClass17_20.method599(arg0);
		if (local15 != null) {
			this.aClass1_2.method1(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public void method1971() {
		while (true) {
			@Pc(6) Class3_Sub1 local6 = this.aClass1_2.method5();
			if (local6 == null) {
				this.anInt2885 = this.anInt2884;
				return;
			}
			local6.method2201();
			local6.method2210();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class52 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Lclient!ac;")
	private final Class3_Sub1 aClass3_Sub1_37 = new Class3_Sub1();

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Lclient!sb;")
	private final Class68 aClass68_2 = new Class68();

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	private int anInt2031;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	private final int anInt2026;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!ab;")
	private final Class2 aClass2_7;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(I)V")
	public Class52(@OriginalArg(0) int arg0) {
		this.anInt2031 = arg0;
		this.anInt2026 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass2_7 = new Class2(local19);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BJ)Lclient!ac;")
	public Class3_Sub1 method1342(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub1 local15 = (Class3_Sub1) this.aClass2_7.method17(arg0);
		if (local15 != null) {
			this.aClass68_2.method1730(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!ac;J)V")
	public void method1344(@OriginalArg(1) Class3_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2031 == 0) {
			@Pc(10) Class3_Sub1 local10 = this.aClass68_2.method1738();
			local10.method2055();
			local10.method2024();
			if (this.aClass3_Sub1_37 == local10) {
				local10 = this.aClass68_2.method1738();
				local10.method2055();
				local10.method2024();
			}
		} else {
			this.anInt2031--;
		}
		this.aClass2_7.method12(arg0, arg1);
		this.aClass68_2.method1730(arg0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(JI)V")
	public void method1345(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub1 local10 = (Class3_Sub1) this.aClass2_7.method17(arg0);
		if (local10 != null) {
			local10.method2055();
			local10.method2024();
			this.anInt2031++;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public void method1346() {
		while (true) {
			@Pc(14) Class3_Sub1 local14 = this.aClass68_2.method1738();
			if (local14 == null) {
				this.anInt2031 = this.anInt2026;
				return;
			}
			local14.method2055();
			local14.method2024();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class33 {

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!be;")
	private final Class4_Sub1 aClass4_Sub1_27 = new Class4_Sub1();

	@OriginalMember(owner = "client!ja", name = "H", descriptor = "Lclient!ve;")
	private final Class78 aClass78_1 = new Class78();

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
	private int anInt1491;

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
	private final int anInt1492;

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "Lclient!wc;")
	private final Class81 aClass81_5;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.anInt1491 = arg0;
		this.anInt1492 = arg0;
		while (local13 + local13 < arg0) {
			local13 += local13;
		}
		this.aClass81_5 = new Class81(local13);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(JBLclient!be;)V")
	public void method997(@OriginalArg(0) long arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		if (this.anInt1491 == 0) {
			@Pc(26) Class4_Sub1 local26 = this.aClass78_1.method1977();
			local26.method1999();
			local26.method1906();
			if (this.aClass4_Sub1_27 == local26) {
				local26 = this.aClass78_1.method1977();
				local26.method1999();
				local26.method1906();
			}
		} else {
			this.anInt1491--;
		}
		this.aClass81_5.method2015(arg0, arg1);
		this.aClass78_1.method1975(arg1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IJ)Lclient!be;")
	public Class4_Sub1 method998(@OriginalArg(1) long arg0) {
		@Pc(10) Class4_Sub1 local10 = (Class4_Sub1) this.aClass81_5.method2010(arg0);
		if (local10 != null) {
			this.aClass78_1.method1975(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(JZ)V")
	public void method999(@OriginalArg(0) long arg0) {
		@Pc(15) Class4_Sub1 local15 = (Class4_Sub1) this.aClass81_5.method2010(arg0);
		if (local15 != null) {
			local15.method1999();
			local15.method1906();
			this.anInt1491++;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public void method1003() {
		while (true) {
			@Pc(10) Class4_Sub1 local10 = this.aClass78_1.method1977();
			if (local10 == null) {
				this.anInt1491 = this.anInt1492;
				return;
			}
			local10.method1999();
			local10.method1906();
		}
	}
}

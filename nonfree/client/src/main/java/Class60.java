import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class60 {

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!gd;")
	private final Class1_Sub1 aClass1_Sub1_56 = new Class1_Sub1();

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "Lclient!la;")
	private final Class42 aClass42_3 = new Class42();

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
	private final int anInt2481;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	private int anInt2476;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!sb;")
	private final Class65 aClass65_37;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
	public Class60(@OriginalArg(0) int arg0) {
		this.anInt2481 = arg0;
		this.anInt2476 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass65_37 = new Class65(local19);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(JB)V")
	public void method1739(@OriginalArg(0) long arg0) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) this.aClass65_37.method1802(arg0);
		if (local6 != null) {
			local6.method2050();
			local6.method2003();
			this.anInt2476++;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(JLclient!gd;B)V")
	public void method1741(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (this.anInt2476 == 0) {
			@Pc(27) Class1_Sub1 local27 = this.aClass42_3.method1302();
			local27.method2050();
			local27.method2003();
			if (local27 == this.aClass1_Sub1_56) {
				local27 = this.aClass42_3.method1302();
				local27.method2050();
				local27.method2003();
			}
		} else {
			this.anInt2476--;
		}
		this.aClass65_37.method1797(arg1, arg0);
		this.aClass42_3.method1307(arg1);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(JI)Lclient!gd;")
	public Class1_Sub1 method1745(@OriginalArg(0) long arg0) {
		@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) this.aClass65_37.method1802(arg0);
		if (local12 != null) {
			this.aClass42_3.method1307(local12);
		}
		return local12;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public void method1747() {
		while (true) {
			@Pc(6) Class1_Sub1 local6 = this.aClass42_3.method1302();
			if (local6 == null) {
				this.anInt2476 = this.anInt2481;
				return;
			}
			local6.method2050();
			local6.method2003();
		}
	}
}

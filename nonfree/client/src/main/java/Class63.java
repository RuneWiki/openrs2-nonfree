import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class63 {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!eb;")
	private final Class1_Sub1 aClass1_Sub1_47 = new Class1_Sub1();

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!ve;")
	private final Class80 aClass80_2 = new Class80();

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	private int anInt2513;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	private final int anInt2512;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!mc;")
	private final Class48 aClass48_13;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public Class63(@OriginalArg(0) int arg0) {
		this.anInt2513 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt2512 = arg0;
		this.aClass48_13 = new Class48(local16);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!eb;JB)V")
	public void method1659(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt2513 == 0) {
			@Pc(10) Class1_Sub1 local10 = this.aClass80_2.method1984();
			local10.method2039();
			local10.method2004();
			if (local10 == this.aClass1_Sub1_47) {
				local10 = this.aClass80_2.method1984();
				local10.method2039();
				local10.method2004();
			}
		} else {
			this.anInt2513--;
		}
		this.aClass48_13.method1336(arg1, arg0);
		this.aClass80_2.method1981(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJ)V")
	public void method1660(@OriginalArg(1) long arg0) {
		@Pc(16) Class1_Sub1 local16 = (Class1_Sub1) this.aClass48_13.method1340(arg0);
		if (local16 != null) {
			local16.method2039();
			local16.method2004();
			this.anInt2513++;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IJ)Lclient!eb;")
	public Class1_Sub1 method1663(@OriginalArg(1) long arg0) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) this.aClass48_13.method1340(arg0);
		if (local6 != null) {
			this.aClass80_2.method1981(local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public void method1665() {
		while (true) {
			@Pc(6) Class1_Sub1 local6 = this.aClass80_2.method1984();
			if (local6 == null) {
				this.anInt2513 = this.anInt2512;
				return;
			}
			local6.method2039();
			local6.method2004();
		}
	}
}

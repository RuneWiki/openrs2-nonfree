import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class32 {

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!u;")
	private final Class2_Sub1 aClass2_Sub1_37 = new Class2_Sub1();

	@OriginalMember(owner = "client!i", name = "x", descriptor = "Lclient!ua;")
	private final Class70 aClass70_19 = new Class70();

	@OriginalMember(owner = "client!i", name = "y", descriptor = "I")
	private int anInt1529;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "I")
	private final int anInt1528;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "Lclient!ka;")
	private final Class41 aClass41_7;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
	public Class32(@OriginalArg(0) int arg0) {
		this.anInt1529 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt1528 = arg0;
		this.aClass41_7 = new Class41(local16);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public void method878() {
		while (true) {
			@Pc(10) Class2_Sub1 local10 = this.aClass70_19.method1846();
			if (local10 == null) {
				this.anInt1529 = this.anInt1528;
				return;
			}
			local10.method1961();
			local10.method1934();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!u;JB)V")
	public void method880(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt1529 == 0) {
			@Pc(10) Class2_Sub1 local10 = this.aClass70_19.method1846();
			local10.method1961();
			local10.method1934();
			if (this.aClass2_Sub1_37 == local10) {
				local10 = this.aClass70_19.method1846();
				local10.method1961();
				local10.method1934();
			}
		} else {
			this.anInt1529--;
		}
		this.aClass41_7.method1063(arg0, arg1);
		this.aClass70_19.method1849(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)V")
	public void method885(@OriginalArg(1) long arg0) {
		@Pc(6) Class2_Sub1 local6 = (Class2_Sub1) this.aClass41_7.method1056(arg0);
		if (local6 != null) {
			local6.method1961();
			local6.method1934();
			this.anInt1529++;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)Lclient!u;")
	public Class2_Sub1 method887(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass41_7.method1056(arg0);
		if (local10 != null) {
			this.aClass70_19.method1849(local10);
		}
		return local10;
	}
}

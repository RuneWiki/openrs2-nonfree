import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class53 {

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!ea;")
	private final Class2_Sub1 aClass2_Sub1_35 = new Class2_Sub1();

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Lclient!lj;")
	private final Class61 aClass61_2 = new Class61();

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	private int anInt2360;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	private final int anInt2357;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "Lclient!lc;")
	private final Class58 aClass58_11;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V")
	public Class53(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.anInt2360 = arg0;
		while (arg0 > local13 + local13) {
			local13 += local13;
		}
		this.anInt2357 = arg0;
		this.aClass58_11 = new Class58(local13);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lclient!nj;")
	public Class2 method1642() {
		return this.aClass58_11.method1705();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Lclient!nj;")
	public Class2 method1643() {
		return this.aClass58_11.method1709();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(JLclient!ea;I)V")
	public void method1645(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		if (this.anInt2360 == 0) {
			@Pc(18) Class2_Sub1 local18 = this.aClass61_2.method1791();
			local18.method3183();
			local18.method3186();
			if (local18 == this.aClass2_Sub1_35) {
				local18 = this.aClass61_2.method1791();
				local18.method3183();
				local18.method3186();
			}
		} else {
			this.anInt2360--;
		}
		this.aClass58_11.method1708(arg1, arg0);
		this.aClass61_2.method1783(arg1);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BJ)V")
	public void method1646(@OriginalArg(1) long arg0) {
		@Pc(13) Class2_Sub1 local13 = (Class2_Sub1) this.aClass58_11.method1704(arg0);
		if (local13 != null) {
			local13.method3183();
			local13.method3186();
			this.anInt2360++;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IJ)Lclient!ea;")
	public Class2_Sub1 method1648(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass58_11.method1704(arg0);
		if (local10 != null) {
			this.aClass61_2.method1783(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public void method1649() {
		while (true) {
			@Pc(10) Class2_Sub1 local10 = this.aClass61_2.method1791();
			if (local10 == null) {
				this.anInt2360 = this.anInt2357;
				return;
			}
			local10.method3183();
			local10.method3186();
		}
	}
}

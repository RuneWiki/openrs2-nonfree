import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class74 {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!ph;")
	private final Class2_Sub2 aClass2_Sub2_56 = new Class2_Sub2();

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!l;")
	private final Class46 aClass46_2 = new Class46();

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	private int anInt3021;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	private final int anInt3020;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!eh;")
	private final Class25 aClass25_10;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
	public Class74(@OriginalArg(0) int arg0) {
		this.anInt3021 = arg0;
		this.anInt3020 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass25_10 = new Class25(local19);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JILclient!ph;)V")
	public void method2341(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (this.anInt3021 == 0) {
			@Pc(7) Class2_Sub2 local7 = this.aClass46_2.method1578();
			local7.method3007();
			local7.method2843();
			if (this.aClass2_Sub2_56 == local7) {
				local7 = this.aClass46_2.method1578();
				local7.method3007();
				local7.method2843();
			}
		} else {
			this.anInt3021--;
		}
		this.aClass25_10.method838(arg0, arg1);
		this.aClass46_2.method1576(arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JB)V")
	public void method2342(@OriginalArg(0) long arg0) {
		@Pc(17) Class2_Sub2 local17 = (Class2_Sub2) this.aClass25_10.method836(arg0);
		if (local17 != null) {
			local17.method3007();
			local17.method2843();
			this.anInt3021++;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Lclient!hb;")
	public Class2 method2343() {
		return this.aClass25_10.method837();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)Lclient!ph;")
	public Class2_Sub2 method2345(@OriginalArg(0) long arg0) {
		@Pc(11) Class2_Sub2 local11 = (Class2_Sub2) this.aClass25_10.method836(arg0);
		if (local11 != null) {
			this.aClass46_2.method1576(local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lclient!hb;")
	public Class2 method2346() {
		return this.aClass25_10.method834();
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public void method2347() {
		while (true) {
			@Pc(10) Class2_Sub2 local10 = this.aClass46_2.method1578();
			if (local10 == null) {
				this.anInt3021 = this.anInt3020;
				return;
			}
			local10.method3007();
			local10.method2843();
		}
	}
}

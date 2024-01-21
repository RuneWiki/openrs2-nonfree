import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class86 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!cf;")
	private final Class2_Sub2 aClass2_Sub2_58 = new Class2_Sub2();

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!oe;")
	private final Class71 aClass71_2 = new Class71();

	@OriginalMember(owner = "client!s", name = "q", descriptor = "I")
	private final int anInt3525;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "I")
	private int anInt3523;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!nc;")
	private final Class63 aClass63_15;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
	public Class86(@OriginalArg(0) int arg0) {
		this.anInt3525 = arg0;
		this.anInt3523 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass63_15 = new Class63(local19);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public void method2641() {
		while (true) {
			@Pc(6) Class2_Sub2 local6 = this.aClass71_2.method2230();
			if (local6 == null) {
				this.anInt3523 = this.anInt3525;
				return;
			}
			local6.method3254();
			local6.method3026();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)Lclient!ib;")
	public Class2 method2642() {
		return this.aClass63_15.method2108();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BJ)Lclient!cf;")
	public Class2_Sub2 method2643(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub2 local10 = (Class2_Sub2) this.aClass63_15.method2110(arg0);
		if (local10 != null) {
			this.aClass71_2.method2231(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!cf;JB)V")
	public void method2647(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3523 == 0) {
			@Pc(11) Class2_Sub2 local11 = this.aClass71_2.method2230();
			local11.method3254();
			local11.method3026();
			if (this.aClass2_Sub2_58 == local11) {
				local11 = this.aClass71_2.method2230();
				local11.method3254();
				local11.method3026();
			}
		} else {
			this.anInt3523--;
		}
		this.aClass63_15.method2115(arg1, arg0);
		this.aClass71_2.method2231(arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
	public void method2648(@OriginalArg(0) long arg0) {
		@Pc(20) Class2_Sub2 local20 = (Class2_Sub2) this.aClass63_15.method2110(arg0);
		if (local20 != null) {
			local20.method3254();
			local20.method3026();
			this.anInt3523++;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lclient!ib;")
	public Class2 method2650() {
		return this.aClass63_15.method2114();
	}
}

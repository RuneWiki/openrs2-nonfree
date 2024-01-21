import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class25 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!lb;")
	private final Class1_Sub1 aClass1_Sub1_27 = new Class1_Sub1();

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!ff;")
	private final Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	private final int anInt1665;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	private int anInt1664;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!ge;")
	private final Class30 aClass30_7;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.anInt1665 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.anInt1664 = arg0;
		this.aClass30_7 = new Class30(local16);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lclient!jd;")
	public Class1 method1298() {
		return this.aClass30_7.method1470();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!lb;JB)V")
	public void method1299(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt1664 == 0) {
			@Pc(15) Class1_Sub1 local15 = this.aClass27_1.method1341();
			local15.method3499();
			local15.method3503();
			if (local15 == this.aClass1_Sub1_27) {
				local15 = this.aClass27_1.method1341();
				local15.method3499();
				local15.method3503();
			}
		} else {
			this.anInt1664--;
		}
		this.aClass30_7.method1464(arg0, arg1);
		this.aClass27_1.method1340(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public void method1300() {
		while (true) {
			@Pc(6) Class1_Sub1 local6 = this.aClass27_1.method1341();
			if (local6 == null) {
				this.anInt1664 = this.anInt1665;
				return;
			}
			local6.method3499();
			local6.method3503();
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!jd;")
	public Class1 method1301() {
		return this.aClass30_7.method1473();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JB)Lclient!lb;")
	public Class1_Sub1 method1302(@OriginalArg(0) long arg0) {
		@Pc(18) Class1_Sub1 local18 = (Class1_Sub1) this.aClass30_7.method1467(arg0);
		if (local18 != null) {
			this.aClass27_1.method1340(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)V")
	public void method1303(@OriginalArg(1) long arg0) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) this.aClass30_7.method1467(arg0);
		if (local6 != null) {
			local6.method3499();
			local6.method3503();
			this.anInt1664++;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class45 implements Interface24 {

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Z")
	private boolean aBoolean80;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "Lclient!r;")
	private Class78 aClass78_34;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient!pw;")
	private final Class278 aClass278_1;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[Lclient!co;")
	private final Interface6[] anInterface6Array1;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!pw;Lclient!ds;)V")
	public Class45(@OriginalArg(0) Class278 arg0, @OriginalArg(1) Class67 arg1) {
		this.aClass278_1 = arg0;
		this.anInterface6Array1 = new Interface6[this.aClass278_1.anInterface4Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface6Array1.length; local15++) {
			this.anInterface6Array1[local15] = arg1.method1474(this.aClass278_1.anInterface4Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method2168(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface6[] local10 = this.anInterface6Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface6 local18 = local10[local12];
			if (local18 != null) {
				local18.method7887();
			}
		}
		this.aBoolean80 = false;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I")
	@Override
	public int method2172() {
		return this.aClass278_1.anInt7313;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)I")
	@Override
	public int method2171() {
		@Pc(7) int local7 = 0;
		@Pc(16) Interface6[] local16 = this.anInterface6Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface6 local24 = local16[local18];
			if (local24 == null || local24.method7886()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface6Array1.length;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	@Override
	public void method2170() {
		if (this.aClass78_34 != Static31.aClass78_18) {
			this.aBoolean80 = true;
			this.aClass78_34 = Static31.aClass78_18;
		}
		this.aClass78_34.ja(0);
		@Pc(22) Interface6[] local22 = this.anInterface6Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Interface6 local30 = local22[local24];
			if (local30 != null) {
				local30.method7888();
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method2173(@OriginalArg(1) long arg0) {
		return Static480.method6650() >= arg0 + (long) this.aClass278_1.anInt7312;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	@Override
	public void method2169() {
	}
}

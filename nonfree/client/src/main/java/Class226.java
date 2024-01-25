import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class226 implements Interface12 {

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "Lclient!ha;")
	private Class5 aClass5_11;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "Z")
	private boolean aBoolean566;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!ie;")
	private final Class139 aClass139_1;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "[Lclient!rea;")
	private final Interface21[] anInterface21Array1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ie;Lclient!vu;)V")
	public Class226(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class366 arg1) {
		this.aClass139_1 = arg0;
		this.anInterface21Array1 = new Interface21[this.aClass139_1.anInterface25Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface21Array1.length; local15++) {
			this.anInterface21Array1[local15] = arg1.method8469(this.aClass139_1.anInterface25Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I")
	@Override
	public int method7297() {
		return this.aClass139_1.anInt5230;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
	@Override
	public void method7299() {
		if (Static467.aClass5_13 != this.aClass5_11) {
			this.aBoolean566 = true;
			this.aClass5_11 = Static467.aClass5_13;
		}
		this.aClass5_11.GA(0);
		@Pc(22) Interface21[] local22 = this.anInterface21Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Interface21 local30 = local22[local24];
			if (local30 != null) {
				local30.method7992();
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7295(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface21[] local10 = this.anInterface21Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(24) Interface21 local24 = local10[local12];
			if (local24 != null) {
				local24.method7994();
			}
		}
		this.aBoolean566 = false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7300(@OriginalArg(1) long arg0) {
		return Static582.method8056() >= (long) this.aClass139_1.anInt5229 + arg0;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)I")
	@Override
	public int method7298() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface21[] local10 = this.anInterface21Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface21 local18 = local10[local12];
			if (local18 == null || local18.method7993()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface21Array1.length;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	@Override
	public void method7296() {
	}
}

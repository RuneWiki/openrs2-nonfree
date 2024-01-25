import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class322 implements Interface14 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!ha;")
	private Class57 aClass57_12;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "Z")
	private boolean aBoolean712;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Lclient!oia;")
	private final Class262 aClass262_1;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "[Lclient!fu;")
	private final Interface5[] anInterface5Array1;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!oia;Lclient!oja;)V")
	public Class322(@OriginalArg(0) Class262 arg0, @OriginalArg(1) Class264 arg1) {
		this.aClass262_1 = arg0;
		this.anInterface5Array1 = new Interface5[this.aClass262_1.anInterface10Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface5Array1.length; local15++) {
			this.anInterface5Array1[local15] = arg1.method6317(this.aClass262_1.anInterface10Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	@Override
	public void method7950() {
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7952(@OriginalArg(1) boolean arg0) {
		@Pc(19) Interface5[] local19 = this.anInterface5Array1;
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Interface5 local27 = local19[local21];
			if (local27 != null) {
				local27.method8946();
			}
		}
		this.aBoolean712 = false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method7953(@OriginalArg(1) long arg0) {
		return Static515.method7499(74) >= (long) this.aClass262_1.anInt7309 + arg0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
	@Override
	public int method7949() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface5[] local10 = this.anInterface5Array1;
		for (@Pc(18) int local18 = 0; local18 < local10.length; local18++) {
			@Pc(24) Interface5 local24 = local10[local18];
			if (local24 == null || local24.method8947()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface5Array1.length;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	@Override
	public void method7948() {
		if (Static457.aClass57_11 != this.aClass57_12) {
			this.aBoolean712 = true;
			this.aClass57_12 = Static457.aClass57_11;
		}
		this.aClass57_12.GA(0);
		@Pc(29) Interface5[] local29 = this.anInterface5Array1;
		for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
			@Pc(37) Interface5 local37 = local29[local31];
			if (local37 != null) {
				local37.method8948();
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)I")
	@Override
	public int method7951() {
		return this.aClass262_1.anInt7308;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class215 implements Interface14 {

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Lclient!oa;")
	private Class121 aClass121_12;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Z")
	private boolean aBoolean394;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "Lclient!ki;")
	private final Class173 aClass173_1;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "[Lclient!mv;")
	private final Interface15[] anInterface15Array1;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!ki;Lclient!fda;)V")
	public Class215(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass173_1 = arg0;
		this.anInterface15Array1 = new Interface15[this.aClass173_1.anInterface10Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface15Array1.length; local15++) {
			this.anInterface15Array1[local15] = arg1.method2001(this.aClass173_1.anInterface10Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I")
	@Override
	public int method5122() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface15[] local10 = this.anInterface15Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface15 local18 = local10[local12];
			if (local18 == null || local18.method6566()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface15Array1.length;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5121() {
		return Static309.anInt5563 >= this.aClass173_1.anInt4252;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	@Override
	public void method5118() {
		if (this.aClass121_12 != Static176.aClass121_5) {
			this.aBoolean394 = true;
			this.aClass121_12 = Static176.aClass121_5;
		}
		this.aClass121_12.D(0);
		@Pc(22) Interface15[] local22 = this.anInterface15Array1;
		for (@Pc(29) int local29 = 0; local29 < local22.length; local29++) {
			@Pc(35) Interface15 local35 = local22[local29];
			if (local35 != null) {
				local35.method6567();
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	@Override
	public void method5119() {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5120(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface15[] local14 = this.anInterface15Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface15 local22 = local14[local16];
			if (local22 != null) {
				local22.method6565();
			}
		}
		this.aBoolean394 = false;
	}
}

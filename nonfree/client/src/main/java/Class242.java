import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class242 implements Interface14 {

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
	private boolean aBoolean563;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!ha;")
	private Class87 aClass87_10;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Lclient!ufa;")
	private final Class335 aClass335_1;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "[Lclient!ql;")
	private final Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ufa;Lclient!kb;)V")
	public Class242(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Class186 arg1) {
		this.aClass335_1 = arg0;
		this.anInterface20Array1 = new Interface20[this.aClass335_1.anInterface4Array1.length];
		for (@Pc(13) int local13 = 0; local13 < this.anInterface20Array1.length; local13++) {
			this.anInterface20Array1[local13] = arg1.method4474(this.aClass335_1.anInterface4Array1[local13]);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
	@Override
	public int method6245() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface20[] local10 = this.anInterface20Array1;
		for (@Pc(17) int local17 = 0; local17 < local10.length; local17++) {
			@Pc(23) Interface20 local23 = local10[local17];
			if (local23 == null || local23.method8023()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface20Array1.length;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6247(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface20[] local10 = this.anInterface20Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface20 local18 = local10[local12];
			if (local18 != null) {
				local18.method8022();
			}
		}
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	@Override
	public void method6248() {
		if (Static600.aClass87_15 != this.aClass87_10) {
			this.aBoolean563 = true;
			this.aClass87_10 = Static600.aClass87_15;
		}
		this.aClass87_10.GA(0);
		@Pc(22) Interface20[] local22 = this.anInterface20Array1;
		for (@Pc(29) int local29 = 0; local29 < local22.length; local29++) {
			@Pc(35) Interface20 local35 = local22[local29];
			if (local35 != null) {
				local35.method8024();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	@Override
	public void method6244() {
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method6249(@OriginalArg(0) long arg0) {
		return (long) this.aClass335_1.anInt9381 + arg0 <= Static438.method6517();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
	@Override
	public int method6246() {
		return this.aClass335_1.anInt9379;
	}
}

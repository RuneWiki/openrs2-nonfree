import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class291 implements Interface10 {

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Lclient!r;")
	private Class134 aClass134_12;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "Z")
	private boolean aBoolean605;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "Lclient!lg;")
	private final Class207 aClass207_1;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "[Lclient!kba;")
	private final Interface12[] anInterface12Array1;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!lg;Lclient!mu;)V")
	public Class291(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class228 arg1) {
		this.aClass207_1 = arg0;
		this.anInterface12Array1 = new Interface12[this.aClass207_1.anInterface24Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface12Array1.length; local15++) {
			this.anInterface12Array1[local15] = arg1.method4667(this.aClass207_1.anInterface24Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
	@Override
	public void method6290() {
		if (this.aClass134_12 != Static16.aClass134_1) {
			this.aClass134_12 = Static16.aClass134_1;
			this.aBoolean605 = true;
		}
		this.aClass134_12.ja(0);
		@Pc(22) Interface12[] local22 = this.anInterface12Array1;
		for (@Pc(29) int local29 = 0; local29 < local22.length; local29++) {
			@Pc(35) Interface12 local35 = local22[local29];
			if (local35 != null) {
				local35.method4315();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6292(@OriginalArg(0) boolean arg0) {
		@Pc(16) Interface12[] local16 = this.anInterface12Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface12 local24 = local16[local18];
			if (local24 != null) {
				local24.method4317();
			}
		}
		this.aBoolean605 = false;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	@Override
	public void method6293() {
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I")
	@Override
	public int method6289() {
		@Pc(7) int local7 = 0;
		@Pc(15) Interface12[] local15 = this.anInterface12Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface12 local23 = local15[local17];
			if (local23 == null || local23.method4316()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface12Array1.length;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method6294(@OriginalArg(1) long arg0) {
		return Static413.method5668() >= (long) this.aClass207_1.anInt5119 + arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)I")
	@Override
	public int method6291() {
		return this.aClass207_1.anInt5121;
	}
}

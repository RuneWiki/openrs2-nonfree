import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class114 implements Interface12 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!oa;")
	private Class14 aClass14_5;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "Lclient!wu;")
	private final Class363 aClass363_1;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "[Lclient!es;")
	private final Interface7[] anInterface7Array1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!wu;Lclient!lo;)V")
	public Class114(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class198 arg1) {
		this.aClass363_1 = arg0;
		this.anInterface7Array1 = new Interface7[this.aClass363_1.anInterface16Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface7Array1.length; local15++) {
			this.anInterface7Array1[local15] = arg1.method4691(this.aClass363_1.anInterface16Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5728(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface7[] local10 = this.anInterface7Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface7 local18 = local10[local12];
			if (local18 != null) {
				local18.method7571();
			}
		}
		this.aBoolean247 = false;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	@Override
	public void method5731() {
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
	@Override
	public int method5733() {
		@Pc(13) int local13 = 0;
		@Pc(16) Interface7[] local16 = this.anInterface7Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface7 local24 = local16[local18];
			if (local24 == null || local24.method7572()) {
				local13++;
			}
		}
		return local13 * 100 / this.anInterface7Array1.length;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5729() {
		if (Static240.aClass14_7 != this.aClass14_5) {
			this.aBoolean247 = true;
			this.aClass14_5 = Static240.aClass14_7;
		}
		this.aClass14_5.D(0);
		@Pc(22) Interface7[] local22 = this.anInterface7Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Interface7 local30 = local22[local24];
			if (local30 != null) {
				local30.method7570();
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method5730(@OriginalArg(0) long arg0) {
		return arg0 + (long) this.aClass363_1.anInt9623 <= Static8.method201();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I")
	@Override
	public int method5732() {
		return this.aClass363_1.anInt9627;
	}
}

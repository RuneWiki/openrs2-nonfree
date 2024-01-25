import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class270 implements Interface22 {

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "Z")
	private boolean aBoolean606;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "Lclient!ha;")
	private Class126 aClass126_15;

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "Lclient!lo;")
	private final Class213 aClass213_1;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "[Lclient!gb;")
	private final Interface12[] anInterface12Array1;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!lo;Lclient!ar;)V")
	public Class270(@OriginalArg(0) Class213 arg0, @OriginalArg(1) Class21 arg1) {
		this.aClass213_1 = arg0;
		this.anInterface12Array1 = new Interface12[this.aClass213_1.anInterface13Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface12Array1.length; local15++) {
			this.anInterface12Array1[local15] = arg1.method499(this.aClass213_1.anInterface13Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6467(@OriginalArg(0) boolean arg0) {
		@Pc(18) Interface12[] local18 = this.anInterface12Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface12 local26 = local18[local20];
			if (local26 != null) {
				local26.method8775();
			}
		}
		this.aBoolean606 = false;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
	@Override
	public void method6463() {
		if (this.aClass126_15 != Static485.aClass126_17) {
			this.aClass126_15 = Static485.aClass126_17;
			this.aBoolean606 = true;
		}
		this.aClass126_15.GA(0);
		@Pc(28) Interface12[] local28 = this.anInterface12Array1;
		for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
			@Pc(36) Interface12 local36 = local28[local30];
			if (local36 != null) {
				local36.method8777();
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)I")
	@Override
	public int method6464() {
		@Pc(7) int local7 = 0;
		@Pc(16) Interface12[] local16 = this.anInterface12Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface12 local24 = local16[local18];
			if (local24 == null || local24.method8776()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface12Array1.length;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)I")
	@Override
	public int method6465() {
		return this.aClass213_1.anInt5778;
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V")
	@Override
	public void method6466() {
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method6468(@OriginalArg(0) long arg0) {
		return Static205.method3179() >= (long) this.aClass213_1.anInt5777 + arg0;
	}
}

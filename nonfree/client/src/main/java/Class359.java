import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class359 implements Interface8 {

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!ha;")
	private Class95 aClass95_15;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
	private boolean aBoolean703;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!gk;")
	private final Class126 aClass126_1;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[Lclient!kd;")
	private final Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!gk;Lclient!gm;)V")
	public Class359(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class127 arg1) {
		this.aClass126_1 = arg0;
		this.anInterface14Array1 = new Interface14[this.aClass126_1.anInterface24Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface14Array1.length; local15++) {
			this.anInterface14Array1[local15] = arg1.method2752(this.aClass126_1.anInterface24Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)I")
	@Override
	public int method8057() {
		@Pc(15) int local15 = 0;
		@Pc(18) Interface14[] local18 = this.anInterface14Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface14 local26 = local18[local20];
			if (local26 == null || local26.method8642()) {
				local15++;
			}
		}
		return local15 * 100 / this.anInterface14Array1.length;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	@Override
	public int method8058() {
		return this.aClass126_1.anInt3226;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	@Override
	public void method8059() {
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8061(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface14[] local8 = this.anInterface14Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) Interface14 local18 = local8[local10];
			if (local18 != null) {
				local18.method8643();
			}
		}
		this.aBoolean703 = false;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
	@Override
	public void method8060() {
		if (this.aClass95_15 != Static192.aClass95_4) {
			this.aClass95_15 = Static192.aClass95_4;
			this.aBoolean703 = true;
		}
		this.aClass95_15.GA(0);
		@Pc(26) Interface14[] local26 = this.anInterface14Array1;
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Interface14 local34 = local26[local28];
			if (local34 != null) {
				local34.method8644();
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8056(@OriginalArg(0) long arg0) {
		return Static476.method6413() >= (long) this.aClass126_1.anInt3231 + arg0;
	}
}

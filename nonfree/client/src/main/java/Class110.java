import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class110 implements Interface9 {

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "Lclient!ha;")
	private Class75 aClass75_3;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "Lclient!dq;")
	private final Class83 aClass83_1;

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "[Lclient!wg;")
	private final Interface27[] anInterface27Array1;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!dq;Lclient!aea;)V")
	public Class110(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class10 arg1) {
		this.aClass83_1 = arg0;
		this.anInterface27Array1 = new Interface27[this.aClass83_1.anInterface15Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface27Array1.length; local15++) {
			this.anInterface27Array1[local15] = arg1.method116(this.aClass83_1.anInterface15Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V")
	@Override
	public void method3094() {
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)I")
	@Override
	public int method3091() {
		return this.aClass83_1.anInt2167;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
	@Override
	public void method3095() {
		if (this.aClass75_3 != Static202.aClass75_5) {
			this.aBoolean253 = true;
			this.aClass75_3 = Static202.aClass75_5;
		}
		this.aClass75_3.GA(0);
		@Pc(32) Interface27[] local32 = this.anInterface27Array1;
		for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
			@Pc(40) Interface27 local40 = local32[local34];
			if (local40 != null) {
				local40.method8040();
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)I")
	@Override
	public int method3096() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface27[] local10 = this.anInterface27Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface27 local18 = local10[local12];
			if (local18 == null || local18.method8038()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface27Array1.length;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method3093(@OriginalArg(1) long arg0) {
		return arg0 + (long) this.aClass83_1.anInt2166 <= Static549.method7758();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method3092(@OriginalArg(1) boolean arg0) {
		@Pc(19) Interface27[] local19 = this.anInterface27Array1;
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Interface27 local27 = local19[local21];
			if (local27 != null) {
				local27.method8039();
			}
		}
		this.aBoolean253 = false;
	}
}

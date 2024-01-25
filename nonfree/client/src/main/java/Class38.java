import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class38 implements Interface25 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Lclient!da;")
	private Class55 aClass55_3;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!la;")
	private final Class207 aClass207_13;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Lclient!la;")
	private final Class207 aClass207_12;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Lclient!wv;")
	private final Class380 aClass380_1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!wv;)V")
	public Class38(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass207_13 = arg1;
		this.aClass207_12 = arg0;
		this.aClass380_1 = arg2;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8110() {
		@Pc(15) int local15 = this.aClass380_1.aClass245_16.method5486(Static79.anInt1667, this.aClass380_1.anInt10626) + this.aClass380_1.anInt10613;
		@Pc(29) int local29 = this.aClass380_1.aClass183_13.method4291(this.aClass380_1.anInt10618, Static627.anInt10422) + this.aClass380_1.anInt10624;
		this.aClass55_3.method6008(this.aClass380_1.anInt10617, 0, this.aClass380_1.anInt10620, 0, local29, local15, null, this.aClass380_1.aString107, this.aClass380_1.anInt10623, this.aClass380_1.anInt10618, null, null, this.aClass380_1.anInt10614, this.aClass380_1.anInt10612, this.aClass380_1.anInt10626);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	@Override
	public void method8111() {
		@Pc(18) Class272 local18 = Static531.method7862(this.aClass207_13, this.aClass380_1.anInt10621);
		this.aClass55_3 = Static213.aClass133_5.method7255(local18, Static649.method2902(this.aClass207_12, this.aClass380_1.anInt10621));
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass207_12.method4678(this.aClass380_1.anInt10621)) {
			local5 = false;
		}
		if (!this.aClass207_13.method4678(this.aClass380_1.anInt10621)) {
			local5 = false;
		}
		return local5;
	}
}

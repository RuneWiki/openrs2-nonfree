import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class51 implements Interface12 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!da;")
	private Class6 aClass6_5;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Lclient!kca;")
	private final Class183 aClass183_1;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!wu;")
	private final Class384 aClass384_26;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!wu;")
	private final Class384 aClass384_25;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!kca;)V")
	public Class51(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class183 arg2) {
		this.aClass183_1 = arg2;
		this.aClass384_26 = arg1;
		this.aClass384_25 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8775() {
		@Pc(23) int local23 = this.aClass183_1.aClass204_8.method4964(this.aClass183_1.anInt4589, Static519.anInt7022) + this.aClass183_1.anInt4592;
		@Pc(38) int local38 = this.aClass183_1.aClass288_8.method6878(Static363.anInt6413, this.aClass183_1.anInt4591) + this.aClass183_1.anInt4595;
		this.aClass6_5.method7215(local38, this.aClass183_1.anInt4593, (Class1) null, this.aClass183_1.aString67, 0, (int[]) null, this.aClass183_1.anInt4588, local23, this.aClass183_1.anInt4591, this.aClass183_1.anInt4587, this.aClass183_1.anInt4596, (Class44[]) null, 0, this.aClass183_1.anInt4590, this.aClass183_1.anInt4589);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	@Override
	public void method8777() {
		@Pc(17) Class298 local17 = Static7.method166(this.aClass384_26, this.aClass183_1.anInt4597);
		this.aClass6_5 = Static485.aClass126_17.method7000(local17, Static654.method4058(this.aClass384_25, this.aClass183_1.anInt4597));
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8776() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass384_25.method8883(this.aClass183_1.anInt4597)) {
			local5 = false;
		}
		if (!this.aClass384_26.method8883(this.aClass183_1.anInt4597)) {
			local5 = false;
		}
		return local5;
	}
}

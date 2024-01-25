import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public class Class104 implements Interface24 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!f;")
	protected Class14 aClass14_11;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Lclient!aea;")
	protected final Class9 aClass9_2;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Lclient!tf;")
	private final Class322 aClass322_65;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!tf;Lclient!aea;)V")
	public Class104(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class9 arg1) {
		this.aClass9_2 = arg1;
		this.aClass322_65 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method6871() {
		return this.aClass322_65.method6797(this.aClass9_2.anInt4466);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	@Override
	public final void method6872() {
		this.aClass14_11 = Static249.method3865(this.aClass9_2.anInt4466, this.aClass322_65);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6873() {
		@Pc(18) int local18 = this.aClass9_2.aClass63_12.method1678(Static245.anInt4333, this.aClass14_11.A()) + this.aClass9_2.anInt4468;
		@Pc(34) int local34 = this.aClass9_2.aClass249_11.method5777(this.aClass14_11.ca(), Static66.anInt1531) + this.aClass9_2.anInt4463;
		this.aClass14_11.method7680(local18, local34);
	}
}

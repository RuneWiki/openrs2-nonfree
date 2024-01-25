import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public abstract class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "Z")
	public boolean aBoolean650;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "Lclient!qo;")
	protected final Class20_Sub3 aClass20_Sub3_33;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class2_Sub17(@OriginalArg(0) Class20_Sub3 arg0) {
		this.aClass20_Sub3_33 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!tp;Lclient!tp;IB)V")
	public abstract void method7499(@OriginalArg(0) Class85_Sub1 arg0, @OriginalArg(1) Class85_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7500();

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBI)V")
	public abstract void method7503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)V")
	public abstract void method7505(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)Z")
	public abstract boolean method7507();

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)Z")
	public final boolean method7508() {
		return false;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)Z")
	public final boolean method7509() {
		return this.aBoolean650;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(Z)I")
	public int method7510() {
		return 0;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)V")
	public abstract void method7512();

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)I")
	public final int method7513() {
		return 1;
	}
}

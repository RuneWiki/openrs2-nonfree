import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "Lclient!te;")
	protected final Class9_Sub3 aClass9_Sub3_35;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class1_Sub14(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aClass9_Sub3_35 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZI)V")
	public abstract void method6186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
	public abstract boolean method6187();

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!ea;Lclient!ea;)V")
	public abstract void method6189(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub3 arg1, @OriginalArg(3) Class20_Sub3 arg2);

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)V")
	public abstract void method6191(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)Z")
	public final boolean method6192() {
		return false;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)I")
	public int method6194() {
		return 0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)I")
	public final int method6195() {
		return 1;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)V")
	public abstract void method6196();

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Z")
	public final boolean method6197() {
		return this.aBoolean478;
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)Z")
	public abstract boolean method6198();
}

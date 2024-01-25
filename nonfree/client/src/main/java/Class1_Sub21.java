import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!ur;")
	protected final Class34_Sub2 aClass34_Sub2_18;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class1_Sub21(@OriginalArg(0) Class34_Sub2 arg0) {
		this.aClass34_Sub2_18 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)Z")
	public abstract boolean method2204();

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Z")
	public final boolean method2206() {
		return this.aBoolean297;
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)I")
	public int method2209() {
		return 0;
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)Z")
	public abstract boolean method2210();

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)I")
	public final int method2211() {
		return 1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)V")
	public abstract void method2212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public abstract void method2213(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Z")
	public final boolean method2214() {
		return false;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLclient!km;Lclient!km;I)V")
	public abstract void method2215(@OriginalArg(1) Class10_Sub1 arg0, @OriginalArg(2) Class10_Sub1 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)V")
	public abstract void method2217();
}

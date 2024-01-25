import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
	public boolean aBoolean207;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!jaa;")
	protected final Class14_Sub3 aClass14_Sub3_14;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class6_Sub6(@OriginalArg(0) Class14_Sub3 arg0) {
		this.aClass14_Sub3_14 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
	public final boolean method2527() {
		return false;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I")
	public int method2529() {
		return 0;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
	public final int method2530() {
		return 1;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)Z")
	public abstract boolean method2531();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!co;ILclient!co;)V")
	public abstract void method2533(@OriginalArg(1) Class51_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class51_Sub1 arg2);

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Z")
	public final boolean method2534() {
		return this.aBoolean207;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)V")
	public abstract void method2535(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)Z")
	public abstract boolean method2536();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	public abstract void method2537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
	public abstract void method2538();
}

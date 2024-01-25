import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public abstract class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!eq;")
	protected final Class33_Sub3 aClass33_Sub3_13;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class3_Sub21(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_13 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
	public abstract void method3423(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BII)V")
	public abstract void method3424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I")
	public final int method3425() {
		return 1;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)I")
	public int method3426() {
		return 0;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)Z")
	public abstract boolean method3427();

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)V")
	public abstract void method3428();

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "(I)Z")
	public abstract boolean method3429();

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)Z")
	public final boolean method3430() {
		return false;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!hga;ILclient!hga;B)V")
	public abstract void method3431(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121_Sub2 arg2);

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "(I)Z")
	public final boolean method3432() {
		return this.aBoolean334;
	}
}

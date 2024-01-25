import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class Class6_Sub21 extends Class6 {

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "Z")
	public boolean aBoolean252;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Lclient!bl;")
	protected final Class28_Sub1 aClass28_Sub1_25;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class6_Sub21(@OriginalArg(0) Class28_Sub1 arg0) {
		this.aClass28_Sub1_25 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLclient!sg;ILclient!sg;)V")
	public abstract void method3442(@OriginalArg(1) Class40_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40_Sub3 arg2);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
	public int method3443() {
		return 0;
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
	public abstract void method3444();

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)I")
	public final int method3446() {
		return 1;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Z")
	public final boolean method3447() {
		return false;
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Z")
	public final boolean method3448() {
		return this.aBoolean252;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(III)V")
	public abstract void method3450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(B)Z")
	public abstract boolean method3451();

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)Z")
	public abstract boolean method3452();

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(IZ)V")
	public abstract void method3453(@OriginalArg(0) int arg0);
}

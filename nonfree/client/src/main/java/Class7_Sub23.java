import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class7_Sub23 extends Class7 {

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Z")
	public boolean aBoolean292;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!vd;")
	protected final Class51_Sub2 aClass51_Sub2_30;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class7_Sub23(@OriginalArg(0) Class51_Sub2 arg0) {
		this.aClass51_Sub2_30 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Z")
	public final boolean method3676() {
		return this.aBoolean292;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)Z")
	public abstract boolean method3678();

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)I")
	public int method3679() {
		return 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ud;BILclient!ud;)V")
	public abstract void method3680(@OriginalArg(0) Class59_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class59_Sub3 arg2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	public abstract void method3681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public abstract void method3683(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Z")
	public final boolean method3684() {
		return false;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)I")
	public final int method3685() {
		return 1;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)Z")
	public abstract boolean method3686();

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
	public abstract void method3687();
}

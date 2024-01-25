import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "Z")
	public boolean aBoolean564;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "Lclient!er;")
	protected final Class31_Sub2 aClass31_Sub2_38;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class3_Sub23(@OriginalArg(0) Class31_Sub2 arg0) {
		this.aClass31_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z")
	public abstract boolean method6434();

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)I")
	public final int method6436() {
		return 1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Z")
	public abstract boolean method6437();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!wh;Lclient!wh;I)V")
	public abstract void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) Class50_Sub1 arg1, @OriginalArg(2) Class50_Sub1 arg2);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Z")
	public final boolean method6439() {
		return this.aBoolean564;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public abstract void method6440(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	public abstract void method6441();

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Z")
	public final boolean method6442() {
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	public abstract void method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)I")
	public int method6444() {
		return 0;
	}
}

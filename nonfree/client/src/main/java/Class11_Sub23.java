import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class Class11_Sub23 extends Class11 {

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "Z")
	public boolean aBoolean181;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!tb;")
	protected final Class129_Sub2 aClass129_Sub2_23;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class11_Sub23(@OriginalArg(0) Class129_Sub2 arg0) {
		this.aClass129_Sub2_23 = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)I")
	public final int method2232() {
		return 1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public abstract void method2233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "()I")
	public int method2234() {
		return 0;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "()Z")
	public abstract boolean method2235();

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "()V")
	public abstract void method2236();

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public abstract void method2237(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Z")
	public final boolean method2238() {
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "()Z")
	public abstract boolean method2239();

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!im;Lclient!im;)V")
	public abstract void method2240(@OriginalArg(0) int arg0, @OriginalArg(1) Class56_Sub4 arg1, @OriginalArg(2) Class56_Sub4 arg2);

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Z")
	public final boolean method2241() {
		return this.aBoolean181;
	}
}

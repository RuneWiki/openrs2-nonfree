import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
	public boolean aBoolean26;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "Lclient!ql;")
	protected final Class92_Sub2 aClass92_Sub2_2;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class4_Sub3(@OriginalArg(0) Class92_Sub2 arg0) {
		this.aClass92_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!jo;Lclient!jo;)V")
	public abstract void method422(@OriginalArg(0) int arg0, @OriginalArg(1) Class70_Sub4 arg1, @OriginalArg(2) Class70_Sub4 arg2);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)Z")
	public final boolean method423() {
		return false;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)I")
	public final int method424() {
		return 1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Z")
	public final boolean method425() {
		return this.aBoolean26;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public abstract void method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "()Z")
	public abstract boolean method427();

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "()Z")
	public abstract boolean method428();

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "()V")
	public abstract void method429();

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
	public abstract void method430(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()I")
	public int method431() {
		return 0;
	}
}

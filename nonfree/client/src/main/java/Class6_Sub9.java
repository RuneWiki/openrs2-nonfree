import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "Z")
	public boolean aBoolean700;

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "Lclient!ap;")
	protected final Class9_Sub2 aClass9_Sub2_39;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class6_Sub9(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aClass9_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)V")
	public abstract void method7845(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)Z")
	public final boolean method7846() {
		return this.aBoolean700;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)I")
	public final int method7847() {
		return 1;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!kp;ILclient!kp;I)V")
	public abstract void method7848(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
	public abstract void method7849();

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
	public int method7850() {
		return 0;
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)Z")
	public abstract boolean method7851();

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(III)V")
	public abstract void method7852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)Z")
	public abstract boolean method7854();

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "(I)Z")
	public final boolean method7855() {
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Lclient!qi;")
	protected final Class82_Sub2 aClass82_Sub2_30;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class2_Sub28(@OriginalArg(0) Class82_Sub2 arg0) {
		this.aClass82_Sub2_30 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "()Z")
	public abstract boolean method3950();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!ai;Lclient!ai;)V")
	public abstract void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1 arg1, @OriginalArg(2) Class7_Sub1 arg2);

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "()Z")
	public abstract boolean method3952();

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "()I")
	public int method3953() {
		return 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public abstract void method3954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "()V")
	public abstract void method3955();

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)Z")
	public final boolean method3956() {
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)I")
	public final int method3957() {
		return 1;
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
	public abstract void method3958(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(Z)Z")
	public final boolean method3959() {
		return this.aBoolean334;
	}
}

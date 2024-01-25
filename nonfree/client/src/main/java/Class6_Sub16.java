import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "Z")
	public boolean aBoolean353;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "Lclient!rl;")
	protected final Class66_Sub2 aClass66_Sub2_32;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class6_Sub16(@OriginalArg(0) Class66_Sub2 arg0) {
		this.aClass66_Sub2_32 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
	public abstract void method4740(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I")
	public final int method4741() {
		return 1;
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)Z")
	public abstract boolean method4742();

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)Z")
	public final boolean method4744() {
		return false;
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
	public abstract void method4745();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!ud;ILclient!ud;)V")
	public abstract void method4746(@OriginalArg(1) Class19_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19_Sub4 arg2);

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(B)Z")
	public final boolean method4747() {
		return this.aBoolean353;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)V")
	public abstract void method4748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "(I)I")
	public int method4749() {
		return 0;
	}

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)Z")
	public abstract boolean method4750();
}

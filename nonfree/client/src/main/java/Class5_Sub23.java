import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class Class5_Sub23 extends Class5 {

	@OriginalMember(owner = "client!vaa", name = "m", descriptor = "Z")
	public boolean aBoolean255;

	@OriginalMember(owner = "client!vaa", name = "p", descriptor = "Lclient!vf;")
	protected final Class100_Sub3 aClass100_Sub3_14;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class5_Sub23(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_14 = arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)I")
	public int method3251() {
		return 0;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
	public abstract void method3252();

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)Z")
	public abstract boolean method3254();

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Z")
	public final boolean method3255() {
		return false;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BII)V")
	public abstract void method3257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I")
	public final int method3258() {
		return 1;
	}

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "(I)Z")
	public final boolean method3259() {
		return this.aBoolean255;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!kia;Lclient!kia;I)V")
	public abstract void method3260(@OriginalArg(1) Class29_Sub3 arg0, @OriginalArg(2) Class29_Sub3 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)Z")
	public abstract boolean method3261();

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V")
	public abstract void method3262(@OriginalArg(1) int arg0);
}

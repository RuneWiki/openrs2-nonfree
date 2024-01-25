import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!vl", name = "B", descriptor = "Z")
	public boolean aBoolean601;

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "Lclient!qg;")
	protected final Class121_Sub2 aClass121_Sub2_38;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class1_Sub42(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aClass121_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)V")
	public abstract void method5570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public abstract void method5571(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I")
	public int method5572() {
		return 0;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
	public final boolean method5573() {
		return this.aBoolean601;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)Z")
	public abstract boolean method5574();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!jp;ILclient!jp;I)V")
	public abstract void method5575(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21_Sub2 arg2);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)Z")
	public abstract boolean method5576();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z")
	public final boolean method5577() {
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)I")
	public final int method5578() {
		return 1;
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V")
	public abstract void method5579();
}

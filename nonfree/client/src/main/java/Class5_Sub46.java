import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class5_Sub46 extends Class5 {

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "Z")
	public boolean aBoolean647;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!rs;")
	protected final Class133_Sub3 aClass133_Sub3_32;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class5_Sub46(@OriginalArg(0) Class133_Sub3 arg0) {
		this.aClass133_Sub3_32 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I")
	public final int method7571() {
		return 1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!wo;Lclient!wo;)V")
	public abstract void method7572(@OriginalArg(1) int arg0, @OriginalArg(2) Class167_Sub3 arg1, @OriginalArg(3) Class167_Sub3 arg2);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(B)Z")
	public abstract boolean method7573();

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "(B)Z")
	public final boolean method7575() {
		return this.aBoolean647;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z")
	public final boolean method7576() {
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)V")
	public abstract void method7577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Z")
	public abstract boolean method7578();

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V")
	public abstract void method7579(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "(B)I")
	public int method7580() {
		return 0;
	}

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "(B)V")
	public abstract void method7581();
}

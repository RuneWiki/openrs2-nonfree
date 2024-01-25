import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
	public boolean aBoolean30;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Lclient!na;")
	protected final Class75_Sub2 aClass75_Sub2_3;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class2_Sub6(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public abstract void method683();

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z")
	public final boolean method684() {
		return this.aBoolean30;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)V")
	public abstract void method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!sa;ZLclient!sa;)V")
	public abstract void method688(@OriginalArg(0) int arg0, @OriginalArg(1) Class64_Sub4 arg1, @OriginalArg(3) Class64_Sub4 arg2);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Z")
	public abstract boolean method689();

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
	public final int method690() {
		return 1;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Z")
	public abstract boolean method691();

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)Z")
	public final boolean method692() {
		return false;
	}

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)I")
	public int method695() {
		return 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
	public abstract void method696(@OriginalArg(1) int arg0);
}

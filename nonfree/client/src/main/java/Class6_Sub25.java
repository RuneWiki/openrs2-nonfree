import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public abstract class Class6_Sub25 extends Class6 {

	@OriginalMember(owner = "client!uga", name = "u", descriptor = "Z")
	public boolean aBoolean329;

	@OriginalMember(owner = "client!uga", name = "x", descriptor = "Lclient!wh;")
	protected final Class100_Sub3 aClass100_Sub3_28;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class6_Sub25(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_28 = arg0;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)Z")
	public abstract boolean method3988();

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
	public abstract void method3989();

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)Z")
	public abstract boolean method3990();

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(B)Z")
	public final boolean method3992() {
		return false;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(IZ)V")
	public abstract void method3995(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "(B)I")
	public final int method3996() {
		return 1;
	}

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "(I)Z")
	public final boolean method3997() {
		return this.aBoolean329;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IILclient!aw;Lclient!aw;)V")
	public abstract void method3998(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1, @OriginalArg(3) Class3_Sub2 arg2);

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(III)V")
	public abstract void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "(I)I")
	public int method4000() {
		return 0;
	}
}

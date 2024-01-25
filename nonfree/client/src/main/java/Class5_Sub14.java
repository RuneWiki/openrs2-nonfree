import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public abstract class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "Z")
	public boolean aBoolean707;

	@OriginalMember(owner = "client!faa", name = "o", descriptor = "Lclient!rda;")
	protected final Class126_Sub3 aClass126_Sub3_32;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class5_Sub14(@OriginalArg(0) Class126_Sub3 arg0) {
		this.aClass126_Sub3_32 = arg0;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)Z")
	public final boolean method7397() {
		return false;
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)Z")
	public abstract boolean method7398();

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!sia;Lclient!sia;II)V")
	public abstract void method7399(@OriginalArg(0) Class24_Sub4 arg0, @OriginalArg(1) Class24_Sub4 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(Z)Z")
	public abstract boolean method7400();

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)Z")
	public final boolean method7401() {
		return this.aBoolean707;
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(Z)V")
	public abstract void method7403();

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)I")
	public int method7404() {
		return 0;
	}

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)I")
	public final int method7406() {
		return 1;
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(IZ)V")
	public abstract void method7407(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(III)V")
	public abstract void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}

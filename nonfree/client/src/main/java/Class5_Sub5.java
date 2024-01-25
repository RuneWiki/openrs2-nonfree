import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Z")
	public boolean aBoolean65;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!po;")
	protected final Class59_Sub1 aClass59_Sub1_10;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class5_Sub5(@OriginalArg(0) Class59_Sub1 arg0) {
		this.aClass59_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()Z")
	public abstract boolean method819();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public abstract void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public abstract void method821(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	public abstract void method822();

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()I")
	public int method823() {
		return 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!fc;Lclient!fc;)V")
	public abstract void method824(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1, @OriginalArg(2) Class11_Sub1 arg2);

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)I")
	public final int method825() {
		return 1;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()Z")
	public abstract boolean method826();

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Z")
	public final boolean method827() {
		return false;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)Z")
	public final boolean method828() {
		return this.aBoolean65;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Z")
	public boolean aBoolean12;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!sq;")
	protected final Class46_Sub2 aClass46_Sub2_4;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class14_Sub1(@OriginalArg(0) Class46_Sub2 arg0) {
		this.aClass46_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I")
	public final int method259() {
		return 1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()Z")
	public abstract boolean method260();

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()Z")
	public abstract boolean method261();

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	public abstract void method262(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "()V")
	public abstract void method263();

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ai;Lclient!ai;)V")
	public abstract void method264(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1, @OriginalArg(2) Class8_Sub1 arg2);

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "()I")
	public int method265() {
		return 0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Z")
	public final boolean method266() {
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public abstract void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Z")
	public final boolean method268() {
		return this.aBoolean12;
	}
}

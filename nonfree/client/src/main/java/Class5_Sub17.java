import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class Class5_Sub17 extends Class5 {

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "Z")
	public boolean aBoolean126;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!kv;")
	protected final Class143_Sub2 aClass143_Sub2_15;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class5_Sub17(@OriginalArg(0) Class143_Sub2 arg0) {
		this.aClass143_Sub2_15 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZILclient!ho;Lclient!ho;)V")
	public abstract void method1726(@OriginalArg(1) int arg0, @OriginalArg(2) Class44_Sub1 arg1, @OriginalArg(3) Class44_Sub1 arg2);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I")
	public int method1727() {
		return 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)Z")
	public abstract boolean method1729();

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V")
	public abstract void method1730(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
	public abstract void method1731();

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)Z")
	public final boolean method1732() {
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)Z")
	public abstract boolean method1733();

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
	public final int method1734() {
		return 1;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Z")
	public final boolean method1735() {
		return this.aBoolean126;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)V")
	public abstract void method1736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}

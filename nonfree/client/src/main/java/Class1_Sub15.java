import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public abstract class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!uca", name = "B", descriptor = "Lclient!lj;")
	protected final Class78_Sub3 aClass78_Sub3_4;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class1_Sub15(@OriginalArg(0) Class78_Sub3 arg0) {
		this.aClass78_Sub3_4 = arg0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
	public abstract void method1203();

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)Z")
	public final boolean method1205() {
		return false;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)Z")
	public final boolean method1206() {
		return this.aBoolean88;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)Z")
	public abstract boolean method1207();

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)I")
	public int method1211() {
		return 0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!cw;IILclient!cw;)V")
	public abstract void method1212(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46_Sub2 arg2);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V")
	public abstract void method1215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)Z")
	public abstract boolean method1216();

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(B)I")
	public final int method1217() {
		return 1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)V")
	public abstract void method1219(@OriginalArg(0) int arg0);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Z")
	public boolean aBoolean299;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!ih;")
	protected final Class106_Sub2 aClass106_Sub2_31;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class1_Sub24(@OriginalArg(0) Class106_Sub2 arg0) {
		this.aClass106_Sub2_31 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	public int method3575() {
		return 0;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)Z")
	public abstract boolean method3576();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)V")
	public abstract void method3577(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ah;ZLclient!ah;I)V")
	public abstract void method3579(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(2) Class8_Sub1 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public abstract void method3580();

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Z")
	public abstract boolean method3581();

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)I")
	public final int method3582() {
		return 1;
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)Z")
	public final boolean method3583() {
		return this.aBoolean299;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
	public abstract void method3585(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)Z")
	public final boolean method3586() {
		return false;
	}
}

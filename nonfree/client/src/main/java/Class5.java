import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class5 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public final int anInt64;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
	public final int anInt67;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public final int anInt69;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public final int anInt66;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIII)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt64 = arg2;
		this.anInt67 = arg1;
		this.anInt69 = arg3;
		this.anInt66 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lclient!ac;")
	public Class5 method68(@OriginalArg(1) int arg0) {
		return new Class5(this.anInt66, arg0, this.anInt64, this.anInt69);
	}
}

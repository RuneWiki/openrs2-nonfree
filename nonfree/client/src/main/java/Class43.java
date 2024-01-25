import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class43 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public final int anInt1712;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public final int anInt1710;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "I")
	public final int anInt1709;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public final int anInt1707;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIII)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1712 = arg2;
		this.anInt1710 = arg3;
		this.anInt1709 = arg1;
		this.anInt1707 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Lclient!db;")
	public Class43 method1341(@OriginalArg(0) int arg0) {
		return new Class43(this.anInt1707, arg0, this.anInt1712, this.anInt1710);
	}
}

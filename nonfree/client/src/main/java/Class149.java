import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class149 {

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
	public final int anInt4076;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public final int anInt4077;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	public final int anInt4079;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public final int anInt4081;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIII)V")
	public Class149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4076 = arg3;
		this.anInt4077 = arg2;
		this.anInt4079 = arg1;
		this.anInt4081 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lclient!hk;")
	public Class149 method3549(@OriginalArg(0) int arg0) {
		return new Class149(this.anInt4081, arg0, this.anInt4077, this.anInt4076);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class120 {

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	public final int anInt3406;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	public final int anInt3400;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public final int anInt3402;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
	public final int anInt3401;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(IIII)V")
	public Class120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3406 = arg3;
		this.anInt3400 = arg2;
		this.anInt3402 = arg1;
		this.anInt3401 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lclient!hn;")
	public Class120 method3045(@OriginalArg(1) int arg0) {
		return new Class120(this.anInt3401, arg0, this.anInt3400, this.anInt3406);
	}
}

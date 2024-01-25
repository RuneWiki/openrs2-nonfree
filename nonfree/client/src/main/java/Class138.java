import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public final class Class138 {

	@OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
	public final int anInt3905;

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
	public final int anInt3901;

	@OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
	public final int anInt3907;

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
	public final int anInt3902;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(IIII)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3905 = arg2;
		this.anInt3901 = arg0;
		this.anInt3907 = arg3;
		this.anInt3902 = arg1;
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(II)Lclient!hfa;")
	public Class138 method3093(@OriginalArg(0) int arg0) {
		return new Class138(this.anInt3901, arg0, this.anInt3905, this.anInt3907);
	}
}

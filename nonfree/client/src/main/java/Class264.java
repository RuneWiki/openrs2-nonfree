import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class264 {

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	public final int anInt6894;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public final int anInt6895;

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
	public final int anInt6896;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	public final int anInt6891;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IIII)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6894 = arg3;
		this.anInt6895 = arg1;
		this.anInt6896 = arg0;
		this.anInt6891 = arg2;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)Lclient!vm;")
	public Class264 method5489(@OriginalArg(0) int arg0) {
		return new Class264(this.anInt6896, arg0, this.anInt6891, this.anInt6894);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class245 {

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public final int anInt6290;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	public final int anInt6288;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	public final int anInt6287;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public final int anInt6289;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIII)V")
	public Class245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6290 = arg3;
		this.anInt6288 = arg2;
		this.anInt6287 = arg1;
		this.anInt6289 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lclient!of;")
	public Class245 method5444(@OriginalArg(1) int arg0) {
		return new Class245(this.anInt6289, arg0, this.anInt6288, this.anInt6290);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class256 {

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	public final int anInt7424;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public final int anInt7422;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
	public final int anInt7427;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
	public final int anInt7426;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIII)V")
	public Class256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7424 = arg3;
		this.anInt7422 = arg2;
		this.anInt7427 = arg0;
		this.anInt7426 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Lclient!rm;")
	public Class256 method6640(@OriginalArg(0) int arg0) {
		return new Class256(this.anInt7427, arg0, this.anInt7422, this.anInt7424);
	}
}

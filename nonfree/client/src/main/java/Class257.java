import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public final class Class257 {

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
	public final int anInt6693;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
	public final int anInt6695;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
	public final int anInt6691;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
	public final int anInt6698;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(IIII)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6693 = arg2;
		this.anInt6695 = arg3;
		this.anInt6691 = arg0;
		this.anInt6698 = arg1;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZ)Lclient!oga;")
	public Class257 method5973(@OriginalArg(0) int arg0) {
		return new Class257(this.anInt6691, arg0, this.anInt6693, this.anInt6695);
	}
}

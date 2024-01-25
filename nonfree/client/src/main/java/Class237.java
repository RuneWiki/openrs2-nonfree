import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class237 {

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	public final int anInt6900;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	public final int anInt6894;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	public final int anInt6899;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	public final int anInt6897;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IIII)V")
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6900 = arg0;
		this.anInt6894 = arg3;
		this.anInt6899 = arg1;
		this.anInt6897 = arg2;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Lclient!t;")
	public Class237 method5246(@OriginalArg(1) int arg0) {
		return new Class237(this.anInt6900, arg0, this.anInt6897, this.anInt6894);
	}
}

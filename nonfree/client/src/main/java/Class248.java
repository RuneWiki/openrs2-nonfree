import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public final class Class248 {

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
	public int anInt6892;

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
	public int anInt6895;

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
	public int anInt6898;

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
	public int anInt6902;

	@OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
	public int anInt6903;

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "I")
	public int anInt6906;

	@OriginalMember(owner = "client!ow", name = "t", descriptor = "I")
	public int anInt6909;

	@OriginalMember(owner = "client!ow", name = "u", descriptor = "Lclient!ow;")
	public Class248 aClass248_2;

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "I")
	public int anInt6910;

	@OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
	public int anInt6911;

	@OriginalMember(owner = "client!ow", name = "i", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
	public final int anInt6900;

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
	public final int anInt6893;

	@OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
	private final int anInt6912;

	@OriginalMember(owner = "client!ow", name = "r", descriptor = "I")
	public final int anInt6907;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIB)V")
	public Class248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte80 = arg4;
		this.anInt6900 = arg2;
		this.anInt6893 = arg1;
		this.anInt6912 = arg0;
		this.anInt6907 = arg3;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)Lclient!ld;")
	public Class186 method5769() {
		return Static469.method3733(this.anInt6912);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIII)Lclient!ow;")
	public Class248 method5774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class248(this.anInt6912, arg0, arg2, arg1, this.aByte80);
	}
}

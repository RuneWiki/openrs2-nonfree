import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class66 {

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	public final int anInt2188;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public final int anInt2189;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	public final int anInt2185;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public final int anInt2184;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIII)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2188 = arg2;
		this.anInt2189 = arg0;
		this.anInt2185 = arg3;
		this.anInt2184 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)Lclient!dd;")
	public Class66 method2071(@OriginalArg(1) int arg0) {
		return new Class66(this.anInt2189, arg0, this.anInt2188, this.anInt2185);
	}
}

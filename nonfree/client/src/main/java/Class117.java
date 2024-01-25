import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class117 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
	public final int anInt2911;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	public final int anInt2914;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public final int anInt2910;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	public final int anInt2913;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(IIII)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2911 = arg0;
		this.anInt2914 = arg2;
		this.anInt2910 = arg1;
		this.anInt2913 = arg3;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Lclient!hr;")
	public Class117 method2391(@OriginalArg(0) int arg0) {
		return new Class117(this.anInt2911, arg0, this.anInt2914, this.anInt2913);
	}
}

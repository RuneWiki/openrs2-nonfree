import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class64 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public int anInt2118;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public int anInt2120 = 128;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	public int anInt2127 = 128;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public int anInt2121;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
	public Class64(@OriginalArg(0) int arg0) {
		this.anInt2121 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIII)V")
	private Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2121 = arg0;
		this.anInt2126 = arg5;
		this.anInt2120 = arg1;
		this.anInt2117 = arg4;
		this.anInt2118 = arg3;
		this.anInt2127 = arg2;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lclient!dh;")
	public Class64 method1962() {
		return new Class64(this.anInt2121, this.anInt2120, this.anInt2127, this.anInt2118, this.anInt2117, this.anInt2126);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLclient!dh;)V")
	public void method1964(@OriginalArg(1) Class64 arg0) {
		this.anInt2126 = arg0.anInt2126;
		this.anInt2121 = arg0.anInt2121;
		this.anInt2127 = arg0.anInt2127;
		this.anInt2120 = arg0.anInt2120;
		this.anInt2118 = arg0.anInt2118;
		this.anInt2117 = arg0.anInt2117;
	}
}

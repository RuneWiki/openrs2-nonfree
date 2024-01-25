import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
	private final int anInt2949;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	public final int anInt2932;

	@OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
	private final int anInt2951;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
	public final int anInt2937;

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
	private final int anInt2941;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
	private final int anInt2940;

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
	private final int anInt2946;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
	public final int anInt2936;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
	public final int anInt2944;

	static {
		new Class213("", 73);
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2949 = arg2;
		this.anInt2932 = arg7;
		this.anInt2951 = arg4;
		this.anInt2937 = arg6;
		this.anInt2941 = arg1;
		this.anInt2940 = arg0;
		this.anInt2946 = arg3;
		this.anInt2936 = arg8;
		this.anInt2944 = arg5;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIII)Z")
	public boolean method2402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt2940 == arg1 && this.anInt2941 <= arg2 && arg2 <= this.anInt2946 && this.anInt2949 <= arg0 && this.anInt2951 >= arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)Z")
	public boolean method2403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt2944 && this.anInt2932 >= arg1 && this.anInt2937 <= arg0 && this.anInt2936 >= arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([IIII)V")
	public void method2405(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = 0;
		arg0[2] = this.anInt2937 + arg2 - this.anInt2949;
		arg0[1] = this.anInt2944 + arg1 - this.anInt2941;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)Z")
	public boolean method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt2941 <= arg0 && arg0 <= this.anInt2946 && this.anInt2949 <= arg1 && arg1 <= this.anInt2951;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[III)V")
	public void method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[2] = arg0 + this.anInt2949 - this.anInt2937;
		arg1[1] = this.anInt2941 + arg2 - this.anInt2944;
		arg1[0] = this.anInt2940;
	}
}

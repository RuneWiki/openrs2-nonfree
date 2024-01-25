import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	private final int anInt6111;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
	public final int anInt6122;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	private final int anInt6113;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	private final int anInt6121;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
	public final int anInt6120;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public final int anInt6110;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
	private final int anInt6124;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	public final int anInt6112;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	private final int anInt6115;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6111 = arg0;
		this.anInt6122 = arg5;
		this.anInt6113 = arg2;
		this.anInt6121 = arg1;
		this.anInt6120 = arg6;
		this.anInt6110 = arg7;
		this.anInt6124 = arg4;
		this.anInt6112 = arg8;
		this.anInt6115 = arg3;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
	public boolean method5120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6122 <= arg1 && this.anInt6110 >= arg1 && arg0 >= this.anInt6120 && arg0 <= this.anInt6112;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI[I)V")
	public void method5122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = arg0 + this.anInt6120 - this.anInt6113;
		arg2[1] = arg1 + this.anInt6122 - this.anInt6121;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)Z")
	public boolean method5123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt6121 && this.anInt6115 >= arg0 && arg1 >= this.anInt6113 && this.anInt6124 >= arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB[I)V")
	public void method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt6111;
		arg2[2] = this.anInt6113 + arg0 - this.anInt6120;
		arg2[1] = arg1 + this.anInt6121 - this.anInt6122;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z")
	public boolean method5127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt6111 == arg1 && this.anInt6121 <= arg0 && this.anInt6115 >= arg0 && this.anInt6113 <= arg2 && arg2 <= this.anInt6124;
	}
}

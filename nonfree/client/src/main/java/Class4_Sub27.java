import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	public final int anInt5192;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	public final int anInt5197;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
	private final int anInt5199;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
	private final int anInt5194;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
	public final int anInt5200;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
	private final int anInt5195;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	private final int anInt5188;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
	public final int anInt5193;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
	private final int anInt5191;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5192 = arg5;
		this.anInt5197 = arg8;
		this.anInt5199 = arg0;
		this.anInt5194 = arg2;
		this.anInt5200 = arg7;
		this.anInt5195 = arg3;
		this.anInt5188 = arg1;
		this.anInt5193 = arg6;
		this.anInt5191 = arg4;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)Z")
	public boolean method4397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt5199 == arg1 && arg0 >= this.anInt5188 && arg0 <= this.anInt5195 && arg2 >= this.anInt5194 && this.anInt5191 >= arg2;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III[I)V")
	public void method4398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt5192 - this.anInt5188;
		arg2[2] = arg1 + this.anInt5193 - this.anInt5194;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
	public boolean method4399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5188 <= arg1 && this.anInt5195 >= arg1 && this.anInt5194 <= arg0 && this.anInt5191 >= arg0;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)Z")
	public boolean method4401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt5192 && arg0 <= this.anInt5200 && this.anInt5193 <= arg1 && this.anInt5197 >= arg1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBI[I)V")
	public void method4402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt5188 - this.anInt5192;
		arg2[0] = this.anInt5199;
		arg2[2] = this.anInt5194 + arg1 - this.anInt5193;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
	public final int anInt6248;

	@OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
	private final int anInt6242;

	@OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
	public final int anInt6250;

	@OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
	public final int anInt6243;

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "I")
	private final int anInt6236;

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
	private final int anInt6237;

	@OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
	private final int anInt6245;

	@OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
	public final int anInt6251;

	@OriginalMember(owner = "client!oda", name = "y", descriptor = "I")
	private final int anInt6249;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6248 = arg5;
		this.anInt6242 = arg3;
		this.anInt6250 = arg6;
		this.anInt6243 = arg7;
		this.anInt6236 = arg0;
		this.anInt6237 = arg4;
		this.anInt6245 = arg1;
		this.anInt6251 = arg8;
		this.anInt6249 = arg2;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III[I)V")
	public void method5416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt6236;
		arg2[2] = arg1 + this.anInt6249 - this.anInt6250;
		arg2[1] = arg0 + this.anInt6245 - this.anInt6248;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIII)Z")
	public boolean method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt6236 == arg1 && this.anInt6245 <= arg2 && this.anInt6242 >= arg2 && this.anInt6249 <= arg0 && arg0 <= this.anInt6237;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIB)Z")
	public boolean method5419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt6245 && arg0 <= this.anInt6242 && this.anInt6249 <= arg1 && arg1 <= this.anInt6237;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(III[I)V")
	public void method5420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = this.anInt6248 + arg0 - this.anInt6245;
		arg2[2] = arg1 + this.anInt6250 - this.anInt6249;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BII)Z")
	public boolean method5421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt6248 && this.anInt6243 >= arg1 && this.anInt6250 <= arg0 && this.anInt6251 >= arg0;
	}
}

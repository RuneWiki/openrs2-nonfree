import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
	private final int anInt7505;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
	private final int anInt7494;

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
	public final int anInt7507;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
	private final int anInt7504;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
	public final int anInt7497;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
	public final int anInt7495;

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
	private final int anInt7506;

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
	private final int anInt7499;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
	public final int anInt7501;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7505 = arg3;
		this.anInt7494 = arg0;
		this.anInt7507 = arg8;
		this.anInt7504 = arg2;
		this.anInt7497 = arg7;
		this.anInt7495 = arg6;
		this.anInt7506 = arg4;
		this.anInt7499 = arg1;
		this.anInt7501 = arg5;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z[III)V")
	public void method5918(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = this.anInt7494;
		arg0[1] = arg2 + this.anInt7499 - this.anInt7501;
		arg0[2] = this.anInt7504 + arg1 - this.anInt7495;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z")
	public boolean method5920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt7501 && arg0 <= this.anInt7497 && arg1 >= this.anInt7495 && this.anInt7507 >= arg1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III[I)V")
	public void method5922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = this.anInt7501 + arg1 - this.anInt7499;
		arg2[2] = arg0 + this.anInt7495 - this.anInt7504;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(III)Z")
	public boolean method5923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt7499 && this.anInt7505 >= arg0 && this.anInt7504 <= arg1 && this.anInt7506 >= arg1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII)Z")
	public boolean method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt7494 == arg0 && this.anInt7499 <= arg2 && arg2 <= this.anInt7505 && this.anInt7504 <= arg1 && this.anInt7506 >= arg1;
	}
}

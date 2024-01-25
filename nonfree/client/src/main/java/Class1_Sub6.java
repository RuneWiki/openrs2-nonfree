import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	public final int anInt483;

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
	public final int anInt497;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	public final int anInt493;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public final int anInt488;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
	private final int anInt491;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
	private final int anInt484;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
	private final int anInt492;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
	private final int anInt490;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	private final int anInt486;

	static {
		new Class142(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
		new Class142("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt483 = arg7;
		this.anInt497 = arg6;
		this.anInt493 = arg8;
		this.anInt488 = arg5;
		this.anInt491 = arg2;
		this.anInt484 = arg1;
		this.anInt492 = arg0;
		this.anInt490 = arg3;
		this.anInt486 = arg4;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Z")
	public boolean method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt484 && this.anInt490 >= arg0 && this.anInt491 <= arg1 && this.anInt486 >= arg1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII)Z")
	public boolean method459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt488 <= arg0 && arg0 <= this.anInt483 && this.anInt497 <= arg1 && arg1 <= this.anInt493;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([IIII)V")
	public void method460(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[2] = this.anInt497 + arg2 - this.anInt491;
		arg0[1] = this.anInt488 + arg1 - this.anInt484;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)Z")
	public boolean method461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt492 && this.anInt484 <= arg1 && arg1 <= this.anInt490 && this.anInt491 <= arg2 && arg2 <= this.anInt486;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[I)V")
	public void method463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt492;
		arg2[2] = arg1 + this.anInt491 - this.anInt497;
		arg2[1] = arg0 + this.anInt484 - this.anInt488;
	}
}

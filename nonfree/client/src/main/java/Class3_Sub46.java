import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	public final int anInt8676;

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	private final int anInt8687;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
	private final int anInt8673;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	private final int anInt8680;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	private final int anInt8678;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	public final int anInt8686;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
	public final int anInt8684;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	private final int anInt8674;

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
	public final int anInt8690;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8676 = arg6;
		this.anInt8687 = arg1;
		this.anInt8673 = arg4;
		this.anInt8680 = arg2;
		this.anInt8678 = arg3;
		this.anInt8686 = arg7;
		this.anInt8684 = arg5;
		this.anInt8674 = arg0;
		this.anInt8690 = arg8;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII[I)V")
	public void method7347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = arg1 + this.anInt8676 - this.anInt8680;
		arg2[1] = this.anInt8684 + arg0 - this.anInt8687;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II[II)V")
	public void method7348(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg0 + this.anInt8687 - this.anInt8684;
		arg1[0] = this.anInt8674;
		arg1[2] = this.anInt8680 + arg2 - this.anInt8676;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBII)Z")
	public boolean method7349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt8674 == arg2 && this.anInt8687 <= arg0 && arg0 <= this.anInt8678 && arg1 >= this.anInt8680 && this.anInt8673 >= arg1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)Z")
	public boolean method7351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt8684 && arg0 <= this.anInt8686 && this.anInt8676 <= arg1 && this.anInt8690 >= arg1;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)Z")
	public boolean method7353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt8687 <= arg0 && this.anInt8678 >= arg0 && arg1 >= this.anInt8680 && this.anInt8673 >= arg1;
	}
}

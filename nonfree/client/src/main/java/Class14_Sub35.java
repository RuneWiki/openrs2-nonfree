import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class14_Sub35 extends Class14 {

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
	public final int anInt6868;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
	private final int anInt6876;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
	public final int anInt6879;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
	public final int anInt6869;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
	public final int anInt6877;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
	private final int anInt6870;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
	private final int anInt6872;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
	private final int anInt6867;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
	private final int anInt6881;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class14_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6868 = arg6;
		this.anInt6876 = arg3;
		this.anInt6879 = arg8;
		this.anInt6869 = arg5;
		this.anInt6877 = arg7;
		this.anInt6870 = arg0;
		this.anInt6872 = arg1;
		this.anInt6867 = arg4;
		this.anInt6881 = arg2;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B[III)V")
	public void method5568(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = 0;
		arg0[2] = this.anInt6868 + arg1 - this.anInt6881;
		arg0[1] = arg2 + this.anInt6869 - this.anInt6872;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)Z")
	public boolean method5571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == this.anInt6870 && arg1 >= this.anInt6872 && this.anInt6876 >= arg1 && this.anInt6881 <= arg2 && this.anInt6867 >= arg2;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[III)V")
	public void method5572(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt6881 + arg2 - this.anInt6868;
		arg0[1] = arg1 + this.anInt6872 - this.anInt6869;
		arg0[0] = this.anInt6870;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
	public boolean method5573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt6872 && arg0 <= this.anInt6876 && this.anInt6881 <= arg1 && arg1 <= this.anInt6867;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)Z")
	public boolean method5574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6869 <= arg0 && arg0 <= this.anInt6877 && arg1 >= this.anInt6868 && this.anInt6879 >= arg1;
	}
}

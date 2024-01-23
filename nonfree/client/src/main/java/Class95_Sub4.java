import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class95_Sub4 extends Class95 {

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
	private int anInt5003;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	private int anInt4999;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	private int anInt4998;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	private int anInt4996;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIII)V")
	public Class95_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5003 = arg0;
		this.anInt4999 = arg2;
		this.anInt4998 = arg3;
		this.anInt4996 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	@Override
	public void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)V")
	@Override
	public void method3993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = this.anInt5003 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt4996 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt4999 * arg0 >> 12;
		@Pc(42) int local42 = this.anInt4998 * arg1 >> 12;
		Static255.method3846(local28, local21, this.anInt4995, this.anInt4994, this.anInt4991, local42, local35);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt5003 * arg0 >> 12;
		@Pc(13) int local13 = this.anInt4999 * arg0 >> 12;
		@Pc(20) int local20 = this.anInt4996 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4998 >> 12;
		Static77.method1182(local31, local6, this.anInt4991, local20, local13);
	}
}

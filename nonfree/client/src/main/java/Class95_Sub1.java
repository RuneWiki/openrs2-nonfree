import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!l", name = "u", descriptor = "I")
	private int anInt2960;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	private int anInt2956;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	private int anInt2955;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "I")
	private int anInt2962;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIII)V")
	public Class95_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2960 = arg3;
		this.anInt2956 = arg2;
		this.anInt2955 = arg1;
		this.anInt2962 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt2962 >> 12;
		@Pc(26) int local26 = arg0 * this.anInt2956 >> 12;
		@Pc(33) int local33 = arg1 * this.anInt2960 >> 12;
		@Pc(40) int local40 = arg1 * this.anInt2955 >> 12;
		Static77.method1192(local26, this.anInt4991, local6, local33, local40);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	@Override
	public void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2956 >> 12;
		@Pc(17) int local17 = this.anInt2960 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2962 >> 12;
		@Pc(31) int local31 = this.anInt2955 * arg0 >> 12;
		Static35.method516(local24, this.anInt4995, local17, local10, local31, this.anInt4994);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BII)V")
	@Override
	public void method3993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt2955 >> 12;
		@Pc(13) int local13 = this.anInt2962 * arg0 >> 12;
		@Pc(20) int local20 = arg1 * this.anInt2960 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt2956 >> 12;
		Static212.method3399(local37, this.anInt4991, this.anInt4995, local20, this.anInt4994, local6, local13);
	}
}

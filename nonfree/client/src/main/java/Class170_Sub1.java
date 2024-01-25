import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class170_Sub1 extends Class170 {

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "I")
	private final int anInt6659;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
	private final int anInt6652;

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
	private final int anInt6657;

	@OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
	private final int anInt6658;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(IIIIIII)V")
	public Class170_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6659 = arg1;
		this.anInt6652 = arg3;
		this.anInt6657 = arg2;
		this.anInt6658 = arg0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6658 >> 12;
		@Pc(25) int local25 = this.anInt6657 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt6659 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt6652 * arg0 >> 12;
		Static147.method3025(local25, super.anInt7389, super.anInt7392, local10, local39, local32);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6658 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt6657 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt6659 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt6652 * arg0 >> 12;
		Static192.method3534(super.anInt7390, local17, local24, local10, local39);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)V")
	@Override
	public void method6128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6658 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6657 >> 12;
		@Pc(24) int local24 = this.anInt6659 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt6652 >> 12;
		Static23.method439(super.anInt7389, local17, super.anInt7390, local31, local24, super.anInt7392, local10);
	}
}

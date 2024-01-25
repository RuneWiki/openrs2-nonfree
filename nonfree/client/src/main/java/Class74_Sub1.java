import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
	private final int anInt1785;

	@OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
	private final int anInt1783;

	@OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
	private final int anInt1789;

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
	private final int anInt1790;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(IIIIII)V")
	public Class74_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1785 = arg1;
		this.anInt1783 = arg2;
		this.anInt1789 = arg0;
		this.anInt1790 = arg3;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)V")
	@Override
	public void method7570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(III)V")
	@Override
	public void method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt1789 * arg1 >> 12;
		@Pc(27) int local27 = arg1 * this.anInt1783 >> 12;
		@Pc(34) int local34 = arg0 * this.anInt1785 >> 12;
		@Pc(41) int local41 = arg0 * this.anInt1790 >> 12;
		Static133.method2024(local20, super.anInt8751, local27, local34, local41);
	}
}

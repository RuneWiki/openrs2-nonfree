import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	private final int anInt1660;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	private final int anInt1657;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	private final int anInt1654;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	private final int anInt1653;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIII)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1660 = arg3;
		this.anInt1657 = arg0;
		this.anInt1654 = arg2;
		this.anInt1653 = arg1;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
	@Override
	public void method5624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt1657 >> 12;
		@Pc(22) int local22 = this.anInt1654 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt1653 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1660 >> 12;
		Static262.method3577(super.anInt7285, local15, local29, local36, local22);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	@Override
	public void method5621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}

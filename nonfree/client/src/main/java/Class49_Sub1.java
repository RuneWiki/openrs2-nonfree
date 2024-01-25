import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
	private final int anInt1383;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
	private final int anInt1382;

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
	private final int anInt1392;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	private final int anInt1376;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
	private final int anInt1374;

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
	private final int anInt1390;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	private final int anInt1377;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	private final int anInt1379;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt1383 = arg0;
		this.anInt1382 = arg2;
		this.anInt1392 = arg6;
		this.anInt1376 = arg5;
		this.anInt1374 = arg1;
		this.anInt1390 = arg7;
		this.anInt1377 = arg4;
		this.anInt1379 = arg3;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(III)V")
	@Override
	public void method4890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(III)V")
	@Override
	public void method4891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
	@Override
	public void method4887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt1383 * arg1 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt1374 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt1382 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt1379 >> 12;
		@Pc(44) int local44 = arg1 * this.anInt1377 >> 12;
		@Pc(51) int local51 = arg0 * this.anInt1376 >> 12;
		@Pc(58) int local58 = this.anInt1392 * arg1 >> 12;
		@Pc(65) int local65 = this.anInt1390 * arg0 >> 12;
		Static333.method5564(local37, local23, super.anInt5595, local30, local65, local51, local16, local44, local58);
	}
}

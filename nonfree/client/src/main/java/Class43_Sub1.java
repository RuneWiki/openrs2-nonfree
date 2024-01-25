import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cca", name = "s", descriptor = "I")
	private final int anInt1327;

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
	private final int anInt1321;

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
	private final int anInt1323;

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
	private final int anInt1322;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1327 = arg3;
		this.anInt1321 = arg1;
		this.anInt1323 = arg2;
		this.anInt1322 = arg0;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(III)V")
	@Override
	public void method7033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1322 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt1323 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt1321 >> 12;
		@Pc(35) int local35 = this.anInt1327 * arg1 >> 12;
		Static185.method3271(local10, local35, local28, super.anInt8583, local21);
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(III)V")
	@Override
	public void method7034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1322 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1323 >> 12;
		@Pc(32) int local32 = this.anInt1321 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt1327 * arg1 >> 12;
		Static588.method8319(super.anInt8582, local39, super.anInt8583, super.anInt8586, local32, local10, local17);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
	@Override
	public void method7030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	private final int anInt1267;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
	private final int anInt1266;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
	private final int anInt1268;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
	private final int anInt1271;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIIII)V")
	public Class52_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1267 = arg1;
		this.anInt1266 = arg3;
		this.anInt1268 = arg0;
		this.anInt1271 = arg2;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt1268 * arg0 >> 12;
		@Pc(20) int local20 = this.anInt1271 * arg0 >> 12;
		@Pc(27) int local27 = this.anInt1267 * arg1 >> 12;
		@Pc(34) int local34 = this.anInt1266 * arg1 >> 12;
		Static23.method620(local20, super.anInt6843, local34, local13, super.anInt6842, local27);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1268 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt1271 >> 12;
		@Pc(29) int local29 = this.anInt1267 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt1266 * arg1 >> 12;
		Static46.method1037(super.anInt6842, super.anInt6838, super.anInt6843, local22, local29, local36, local10);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1268 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1271 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1267 >> 12;
		@Pc(31) int local31 = this.anInt1266 * arg1 >> 12;
		Static14.method528(local24, local10, super.anInt6838, local17, local31);
	}
}

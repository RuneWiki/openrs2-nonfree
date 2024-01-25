import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class48 {

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	private int anInt1352;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
	private int anInt1357;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	private int anInt1348;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	private int anInt1347;

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
	private int anInt1364;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	private int anInt1356;

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
	private int anInt1362;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
	private int anInt1355;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
	private int anInt1359;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1352 = arg3 * arg3;
		this.anInt1357 = arg2;
		this.anInt1348 = arg0;
		this.anInt1347 = arg1;
		this.anInt1364 = arg4 + this.anInt1348;
		this.anInt1356 = arg8 + this.anInt1357;
		this.anInt1362 = this.anInt1347 + arg6;
		this.anInt1346 = arg7 + this.anInt1347;
		this.anInt1355 = this.anInt1348 + arg5;
		this.anInt1359 = this.anInt1357 + arg9;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BIII)Z")
	public boolean method1172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < this.anInt1364 || arg0 > this.anInt1355) {
			return false;
		} else if (this.anInt1362 > arg2 || arg2 > this.anInt1346) {
			return false;
		} else if (this.anInt1356 <= arg1 && arg1 <= this.anInt1359) {
			@Pc(55) int local55 = arg0 - this.anInt1348;
			@Pc(61) int local61 = arg1 - this.anInt1357;
			return local61 * local61 + local55 * local55 < this.anInt1352;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIBIIIIIIII)V")
	public void method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt1352 = arg7 * arg7;
		this.anInt1357 = arg1;
		this.anInt1347 = arg0;
		this.anInt1348 = arg8;
		this.anInt1362 = arg9 + this.anInt1347;
		this.anInt1346 = this.anInt1347 + arg4;
		this.anInt1356 = arg3 + this.anInt1357;
		this.anInt1364 = this.anInt1348 + arg2;
		this.anInt1355 = this.anInt1348 + arg6;
		this.anInt1359 = arg5 + this.anInt1357;
	}
}

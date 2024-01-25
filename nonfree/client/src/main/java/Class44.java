import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class44 {

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	private int anInt1341;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	private int anInt1333;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	private int anInt1340;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	private int anInt1332;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	private int anInt1328;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	private int anInt1330;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	private int anInt1334;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	private int anInt1337;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	private int anInt1329;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	private int anInt1344;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1341 = arg2;
		this.anInt1333 = arg1;
		this.anInt1340 = arg3 * arg3;
		this.anInt1332 = arg0;
		this.anInt1328 = this.anInt1332 + arg5;
		this.anInt1330 = this.anInt1333 + arg7;
		this.anInt1334 = arg4 + this.anInt1332;
		this.anInt1337 = this.anInt1341 + arg9;
		this.anInt1329 = this.anInt1341 + arg8;
		this.anInt1344 = arg6 + this.anInt1333;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method1333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		this.anInt1333 = arg3;
		this.anInt1340 = arg9 * arg9;
		this.anInt1332 = arg0;
		this.anInt1341 = arg2;
		this.anInt1337 = this.anInt1341 + arg7;
		this.anInt1334 = arg1 + this.anInt1332;
		this.anInt1330 = arg6 + this.anInt1333;
		this.anInt1344 = arg8 + this.anInt1333;
		this.anInt1328 = this.anInt1332 + arg4;
		this.anInt1329 = arg5 + this.anInt1341;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII)Z")
	public boolean method1335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt1334 > arg2 || arg2 > this.anInt1328) {
			return false;
		} else if (arg0 < this.anInt1344 || this.anInt1330 < arg0) {
			return false;
		} else if (this.anInt1329 <= arg1 && arg1 <= this.anInt1337) {
			@Pc(67) int local67 = arg2 - this.anInt1332;
			@Pc(73) int local73 = arg1 - this.anInt1341;
			return this.anInt1340 > local67 * local67 + local73 * local73;
		} else {
			return false;
		}
	}
}

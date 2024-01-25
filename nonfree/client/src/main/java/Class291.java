import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class291 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
	private int anInt8015;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	private int anInt8008;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
	private int anInt8018;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
	private int anInt8009;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	private int anInt8020;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	private int anInt8017;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	private int anInt8021;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	private int anInt8013;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
	private int anInt8016;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	private int anInt8011;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8015 = arg3 * arg3;
		this.anInt8008 = arg2;
		this.anInt8018 = arg0;
		this.anInt8009 = arg1;
		this.anInt8020 = arg9 + this.anInt8008;
		this.anInt8017 = this.anInt8009 + arg6;
		this.anInt8021 = arg4 + this.anInt8018;
		this.anInt8013 = this.anInt8008 + arg8;
		this.anInt8016 = arg7 + this.anInt8009;
		this.anInt8011 = this.anInt8018 + arg5;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method6635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt8008 = arg5;
		this.anInt8009 = arg2;
		this.anInt8018 = arg3;
		this.anInt8015 = arg0 * arg0;
		this.anInt8017 = arg6 + this.anInt8009;
		this.anInt8011 = arg7 + this.anInt8018;
		this.anInt8016 = this.anInt8009 + arg9;
		this.anInt8013 = this.anInt8008 + arg1;
		this.anInt8021 = this.anInt8018 + arg4;
		this.anInt8020 = this.anInt8008 + arg8;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIII)Z")
	public boolean method6638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < this.anInt8021 || arg1 > this.anInt8011) {
			return false;
		} else if (this.anInt8017 > arg0 || this.anInt8016 < arg0) {
			return false;
		} else if (arg2 >= this.anInt8013 && arg2 <= this.anInt8020) {
			@Pc(70) int local70 = arg1 - this.anInt8018;
			@Pc(76) int local76 = arg2 - this.anInt8008;
			return local76 * local76 + local70 * local70 < this.anInt8015;
		} else {
			return false;
		}
	}
}

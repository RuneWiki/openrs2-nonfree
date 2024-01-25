import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class297 {

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
	private int anInt8612;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	private int anInt8618;

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
	private int anInt8613;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	private int anInt8608;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	private int anInt8607;

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
	private int anInt8619;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
	private int anInt8609;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
	private int anInt8610;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	private int anInt8615;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
	private int anInt8611;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8612 = arg3 * arg3;
		this.anInt8618 = arg2;
		this.anInt8613 = arg1;
		this.anInt8608 = arg0;
		this.anInt8607 = this.anInt8613 + arg7;
		this.anInt8619 = arg5 + this.anInt8608;
		this.anInt8609 = this.anInt8613 + arg6;
		this.anInt8610 = this.anInt8608 + arg4;
		this.anInt8615 = arg9 + this.anInt8618;
		this.anInt8611 = arg8 + this.anInt8618;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIII)Z")
	public boolean method7394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt8610 > arg2 || this.anInt8619 < arg2) {
			return false;
		} else if (this.anInt8609 > arg1 || arg1 > this.anInt8607) {
			return false;
		} else if (this.anInt8611 <= arg0 && this.anInt8615 >= arg0) {
			@Pc(59) int local59 = arg2 - this.anInt8608;
			@Pc(70) int local70 = arg0 - this.anInt8618;
			return local70 * local70 + local59 * local59 < this.anInt8612;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIBII)V")
	public void method7396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt8608 = arg8;
		this.anInt8618 = arg9;
		this.anInt8612 = arg3 * arg3;
		this.anInt8613 = arg6;
		this.anInt8609 = arg7 + this.anInt8613;
		this.anInt8610 = this.anInt8608 + arg1;
		this.anInt8611 = arg4 + this.anInt8618;
		this.anInt8619 = arg0 + this.anInt8608;
		this.anInt8615 = this.anInt8618 + arg5;
		this.anInt8607 = this.anInt8613 + arg2;
	}
}

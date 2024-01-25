import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class308 {

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	private int anInt8875;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	private int anInt8878;

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
	private int anInt8884;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	private int anInt8879;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	private int anInt8877;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
	private int anInt8881;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	private int anInt8880;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	private int anInt8873;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	private int anInt8874;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
	private int anInt8883;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8875 = arg2;
		this.anInt8878 = arg0;
		this.anInt8884 = arg1;
		this.anInt8879 = arg3 * arg3;
		this.anInt8877 = this.anInt8878 + arg4;
		this.anInt8881 = arg7 + this.anInt8884;
		this.anInt8880 = arg6 + this.anInt8884;
		this.anInt8873 = this.anInt8875 + arg9;
		this.anInt8874 = arg5 + this.anInt8878;
		this.anInt8883 = arg8 + this.anInt8875;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZII)Z")
	public boolean method7240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt8877 > arg1 || arg1 > this.anInt8874) {
			return false;
		} else if (arg2 < this.anInt8880 || arg2 > this.anInt8881) {
			return false;
		} else if (this.anInt8883 <= arg0 && arg0 <= this.anInt8873) {
			@Pc(53) int local53 = arg1 - this.anInt8878;
			@Pc(59) int local59 = arg0 - this.anInt8875;
			return local53 * local53 + local59 * local59 < this.anInt8879;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIBIIIIII)V")
	public void method7241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt8878 = arg5;
		this.anInt8884 = arg8;
		this.anInt8875 = arg0;
		this.anInt8879 = arg4 * arg4;
		this.anInt8880 = arg9 + this.anInt8884;
		this.anInt8877 = this.anInt8878 + arg2;
		this.anInt8873 = this.anInt8875 + arg6;
		this.anInt8881 = this.anInt8884 + arg7;
		this.anInt8883 = this.anInt8875 + arg3;
		this.anInt8874 = arg1 + this.anInt8878;
	}
}

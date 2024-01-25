import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class280 {

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "I")
	private int anInt8091;

	@OriginalMember(owner = "client!pw", name = "u", descriptor = "I")
	private int anInt8095;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
	private int anInt8088;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
	private int anInt8086;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	public int anInt8084;

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
	public int anInt8087;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
	public int anInt8080;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
	public int anInt8092;

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
	public int anInt8093;

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
	public int anInt8085;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8091 = arg1;
		this.anInt8095 = arg2;
		this.anInt8088 = arg3 * arg3;
		this.anInt8086 = arg0;
		this.anInt8084 = arg7 + this.anInt8091;
		this.anInt8087 = arg8 + this.anInt8095;
		this.anInt8080 = arg5 + this.anInt8086;
		this.anInt8092 = this.anInt8095 + arg9;
		this.anInt8093 = this.anInt8091 + arg6;
		this.anInt8085 = arg4 + this.anInt8086;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIBIIIIIIII)V")
	public void method6871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt8086 = arg1;
		this.anInt8091 = arg0;
		this.anInt8088 = arg9 * arg9;
		this.anInt8095 = arg8;
		this.anInt8092 = this.anInt8095 + arg2;
		this.anInt8093 = arg6 + this.anInt8091;
		this.anInt8084 = arg3 + this.anInt8091;
		this.anInt8080 = arg4 + this.anInt8086;
		this.anInt8087 = arg5 + this.anInt8095;
		this.anInt8085 = this.anInt8086 + arg7;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIBI)Z")
	public boolean method6873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt8085 > arg0 || arg0 > this.anInt8080) {
			return false;
		} else if (arg2 < this.anInt8093 || this.anInt8084 < arg2) {
			return false;
		} else if (arg1 >= this.anInt8087 && this.anInt8092 >= arg1) {
			@Pc(55) int local55 = arg0 - this.anInt8086;
			@Pc(61) int local61 = arg1 - this.anInt8095;
			return this.anInt8088 > local61 * local61 + local55 * local55;
		} else {
			return false;
		}
	}
}

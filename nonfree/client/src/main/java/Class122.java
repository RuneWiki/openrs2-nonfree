import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class122 {

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
	private int anInt3981;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
	private int anInt3983;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	private int anInt3970;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	private int anInt3973;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
	private int anInt3977;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	private int anInt3980;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	private int anInt3971;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	private int anInt3972;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	private int anInt3978;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
	private int anInt3985;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt3981 = arg0;
		this.anInt3983 = arg1;
		this.anInt3970 = arg2;
		this.anInt3973 = arg3 * arg3;
		this.anInt3977 = this.anInt3981 + arg4;
		this.anInt3980 = arg8 + this.anInt3970;
		this.anInt3971 = this.anInt3983 + arg6;
		this.anInt3972 = arg9 + this.anInt3970;
		this.anInt3978 = arg5 + this.anInt3981;
		this.anInt3985 = this.anInt3983 + arg7;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BIIIIIIIIII)V")
	public void method3531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt3970 = arg0;
		this.anInt3973 = arg8 * arg8;
		this.anInt3983 = arg9;
		this.anInt3981 = arg3;
		this.anInt3972 = arg1 + this.anInt3970;
		this.anInt3977 = arg4 + this.anInt3981;
		this.anInt3978 = arg7 + this.anInt3981;
		this.anInt3985 = arg5 + this.anInt3983;
		this.anInt3980 = this.anInt3970 + arg2;
		this.anInt3971 = arg6 + this.anInt3983;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIBI)Z")
	public boolean method3536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < this.anInt3977 || arg1 > this.anInt3978) {
			return false;
		} else if (arg0 < this.anInt3971 || arg0 > this.anInt3985) {
			return false;
		} else if (arg2 >= this.anInt3980 && this.anInt3972 >= arg2) {
			@Pc(54) int local54 = arg1 - this.anInt3981;
			@Pc(65) int local65 = arg2 - this.anInt3970;
			return local65 * local65 + local54 * local54 < this.anInt3973;
		} else {
			return false;
		}
	}
}

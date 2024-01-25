import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class Class21 implements Interface26 {

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public final int anInt9576;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public final int anInt9571;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public final int anInt9573;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public final int anInt9570;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!gi;")
	public final Class131 aClass131_23;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public final int anInt9575;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public final int anInt9574;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!og;")
	public final Class266 aClass266_12;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	public final int anInt9572;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!og;Lclient!gi;IIIIIII)V")
	public Class21(@OriginalArg(0) Class266 arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9576 = arg2;
		this.anInt9571 = arg8;
		this.anInt9573 = arg3;
		this.anInt9570 = arg7;
		this.aClass131_23 = arg1;
		this.anInt9575 = arg6;
		this.anInt9574 = arg5;
		this.aClass266_12 = arg0;
		this.anInt9572 = arg4;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return null;
	}
}

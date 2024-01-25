import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class Class52 implements Interface19 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
	public final int anInt8820;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	public final int anInt8827;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!rt;")
	public final Class297 aClass297_12;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
	public final int anInt8828;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
	public final int anInt8821;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public final int anInt8824;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public final int anInt8822;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
	public final int anInt8826;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!cp;")
	public final Class58 aClass58_13;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!rt;Lclient!cp;IIIIIII)V")
	public Class52(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8820 = arg2;
		this.anInt8827 = arg7;
		this.aClass297_12 = arg0;
		this.anInt8828 = arg5;
		this.anInt8821 = arg8;
		this.anInt8824 = arg6;
		this.anInt8822 = arg4;
		this.anInt8826 = arg3;
		this.aClass58_13 = arg1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return null;
	}
}

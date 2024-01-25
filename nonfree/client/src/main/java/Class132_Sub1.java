import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public final int anInt6138;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
	public final int anInt6136;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
	public final int anInt6140;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
	public final int anInt6139;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public final int anInt6133;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
	public final int anInt6131;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!nv;Lclient!kka;IIIIIIIIIIIII)V")
	public Class132_Sub1(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6138 = arg12;
		this.anInt6136 = arg13;
		this.anInt6140 = arg9;
		this.anInt6139 = arg11;
		this.anInt6133 = arg14;
		this.anInt6131 = arg10;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return Static209.aClass51_36;
	}
}

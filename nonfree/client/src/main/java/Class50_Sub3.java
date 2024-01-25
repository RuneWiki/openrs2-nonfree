import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class Class50_Sub3 extends Class50 {

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
	public final int anInt7639;

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
	public final int anInt7647;

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
	public final int anInt7645;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
	public final int anInt7642;

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
	public final int anInt7641;

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
	public final int anInt7650;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!vn;Lclient!mf;IIIIIIIIIIIII)V")
	public Class50_Sub3(@OriginalArg(0) Class347 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt7639 = arg11;
		this.anInt7647 = arg14;
		this.anInt7645 = arg13;
		this.anInt7642 = arg10;
		this.anInt7641 = arg9;
		this.anInt7650 = arg12;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return Static317.aClass184_9;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class101_Sub3 extends Class101 {

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
	public final int anInt9023;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	public final int anInt9020;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public final int anInt9021;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	public final int anInt9022;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public final int anInt9017;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
	public final int anInt9018;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!ida;Lclient!ce;IIIIIIIIIII)V")
	public Class101_Sub3(@OriginalArg(0) Class148 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt9023 = arg8;
		this.anInt9020 = arg9;
		this.anInt9021 = arg7;
		this.anInt9022 = arg11;
		this.anInt9017 = arg12;
		this.anInt9018 = arg10;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static47.aClass271_1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class Class108_Sub1 extends Class108 {

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
	public final int anInt10020;

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
	public final int anInt10025;

	@OriginalMember(owner = "client!lea", name = "q", descriptor = "I")
	public final int anInt10018;

	@OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
	public final int anInt10027;

	@OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
	public final int anInt10022;

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
	public final int anInt10021;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!pe;Lclient!op;IIIIIIIIIIIII)V")
	public Class108_Sub1(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt10020 = arg11;
		this.anInt10025 = arg12;
		this.anInt10018 = arg14;
		this.anInt10027 = arg13;
		this.anInt10022 = arg10;
		this.anInt10021 = arg9;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static283.aClass307_15;
	}
}

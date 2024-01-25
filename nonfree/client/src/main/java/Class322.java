import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class322 implements Interface14 {

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	public final int anInt8078;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public final int anInt8071;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString110;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public final int anInt8079;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public final int anInt8075;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public final int anInt8070;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public final int anInt8068;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public final int anInt8072;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public final int anInt8069;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "Lclient!sc;")
	public final Class300 aClass300_12;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public final int anInt8076;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public final int anInt8077;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Lclient!ia;")
	public final Class140 aClass140_14;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!sc;Lclient!ia;IIIIIIIIII)V")
	public Class322(@OriginalArg(0) String arg0, @OriginalArg(1) Class300 arg1, @OriginalArg(2) Class140 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt8078 = arg9;
		this.anInt8071 = arg11;
		this.aString110 = arg0;
		this.anInt8079 = arg4;
		this.anInt8075 = arg3;
		this.anInt8070 = arg5;
		this.anInt8068 = arg12;
		this.anInt8072 = arg10;
		this.anInt8069 = arg6;
		this.aClass300_12 = arg1;
		this.anInt8076 = arg7;
		this.anInt8077 = arg8;
		this.aClass140_14 = arg2;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return Static9.aClass260_1;
	}
}

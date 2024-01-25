import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class333 implements Interface3 {

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
	public final int anInt8856;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public final int anInt8857;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public final int anInt8852;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!taa;")
	public final Class352 aClass352_12;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public final int anInt8846;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public final int anInt8859;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
	public final int anInt8853;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
	public final int anInt8854;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public final int anInt8850;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString116;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public final int anInt8847;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public final int anInt8858;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!lea;")
	public final Class223 aClass223_13;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!lea;Lclient!taa;IIIIIIIIII)V")
	public Class333(@OriginalArg(0) String arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt8856 = arg5;
		this.anInt8857 = arg11;
		this.anInt8852 = arg7;
		this.aClass352_12 = arg2;
		this.anInt8846 = arg8;
		this.anInt8859 = arg4;
		this.anInt8853 = arg6;
		this.anInt8854 = arg10;
		this.anInt8850 = arg9;
		this.aString116 = arg0;
		this.anInt8847 = arg3;
		this.anInt8858 = arg12;
		this.aClass223_13 = arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static601.aClass390_12;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public abstract class Class20_Sub2_Sub3 extends Class20_Sub2 {

	@OriginalMember(owner = "client!lt", name = "E", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IIIIII)V")
	protected Class20_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort76 = (short) arg5;
		super.aByte117 = (byte) arg4;
		super.anInt8795 = arg2;
		super.anInt8796 = arg0;
		super.aByte116 = (byte) arg3;
		super.anInt8790 = arg1;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method7259() {
		return Static116.aBooleanArrayArray4[Static246.anInt8757 + (super.anInt8796 >> Static378.anInt6665) - Static251.anInt4676][Static246.anInt8757 + (super.anInt8795 >> Static378.anInt6665) - Static63.anInt1544];
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([Lclient!qea;B)I")
	@Override
	public final int method7258(@OriginalArg(0) Class1_Sub5[] arg0) {
		return this.method7266(super.anInt8796 >> Static378.anInt6665, arg0, super.anInt8795 >> Static378.anInt6665);
	}

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7252() {
		return Static158.method2431(super.anInt8796 >> Static378.anInt6665, super.aByte117, super.anInt8795 >> Static378.anInt6665);
	}
}

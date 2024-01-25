import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class Class20_Sub2_Sub1 extends Class20_Sub2 {

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "S")
	public short aShort70;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "S")
	public short aShort71;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class20_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte116 = (byte) arg3;
		this.aShort70 = (short) arg5;
		super.anInt8795 = arg2;
		super.anInt8790 = arg1;
		super.aByte117 = (byte) arg4;
		this.aShort71 = (short) arg6;
		super.anInt8796 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7252() {
		return Static553.method7508(super.anInt8796 >> Static378.anInt6665, this.method7264(), super.anInt8795 >> Static378.anInt6665, super.aByte117);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public final void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([Lclient!qea;B)I")
	@Override
	public final int method7258(@OriginalArg(0) Class1_Sub5[] arg0) {
		return this.method7266(super.anInt8796 >> Static378.anInt6665, arg0, super.anInt8795 >> Static378.anInt6665);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method7259() {
		return Static116.aBooleanArrayArray4[(super.anInt8796 >> Static378.anInt6665) + Static246.anInt8757 - Static251.anInt4676][(super.anInt8795 >> Static378.anInt6665) + Static246.anInt8757 - Static63.anInt1544];
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
	@Override
	public final void method7263() {
		throw new IllegalStateException();
	}
}

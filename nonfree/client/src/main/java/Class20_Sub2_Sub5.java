import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public abstract class Class20_Sub2_Sub5 extends Class20_Sub2 {

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIII)V")
	public Class20_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte117 = (byte) arg4;
		super.aByte116 = (byte) arg3;
		super.anInt8796 = arg0;
		super.anInt8795 = arg2;
		super.anInt8790 = arg1;
	}

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7252() {
		@Pc(23) Class285 local23 = Static114.method1985(super.aByte116, super.anInt8796 >> Static378.anInt6665, super.anInt8795 >> Static378.anInt6665);
		return local23 != null && local23.aClass20_Sub2_Sub4_1.aBoolean638 ? Static553.method7508(super.anInt8796 >> Static378.anInt6665, local23.aClass20_Sub2_Sub4_1.method7264() + this.method7264(), super.anInt8795 >> Static378.anInt6665, super.aByte116) : Static158.method2431(super.anInt8796 >> Static378.anInt6665, super.aByte116, super.anInt8795 >> Static378.anInt6665);
	}

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method7259() {
		return Static116.aBooleanArrayArray4[(super.anInt8796 >> Static378.anInt6665) + Static246.anInt8757 - Static251.anInt4676][(super.anInt8795 >> Static378.anInt6665) + Static246.anInt8757 - Static63.anInt1544];
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(B)V")
	@Override
	public final void method7263() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public final void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "([Lclient!qea;B)I")
	@Override
	public final int method7258(@OriginalArg(0) Class1_Sub5[] arg0) {
		return this.method7266(super.anInt8796 >> Static378.anInt6665, arg0, super.anInt8795 >> Static378.anInt6665);
	}
}

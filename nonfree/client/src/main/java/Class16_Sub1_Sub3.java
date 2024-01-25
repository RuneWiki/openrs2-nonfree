import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public abstract class Class16_Sub1_Sub3 extends Class16_Sub1 {

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIIIII)V")
	protected Class16_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt8037 = arg0;
		super.anInt8034 = arg2;
		super.aByte108 = (byte) arg4;
		super.aByte109 = (byte) arg3;
		super.anInt8036 = arg1;
		this.aShort72 = (short) arg5;
	}

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "(B)Z")
	@Override
	public final boolean method6982() {
		return Static447.aBooleanArrayArray9[(super.anInt8037 >> Static326.anInt5713) + Static621.anInt10151 - Static636.anInt10301][Static621.anInt10151 + (super.anInt8034 >> Static326.anInt5713) - Static66.anInt1803];
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "([Lclient!laa;Z)I")
	@Override
	public final int method6977(@OriginalArg(0) Class2_Sub12[] arg0) {
		return this.method6973(super.anInt8037 >> Static326.anInt5713, super.anInt8034 >> Static326.anInt5713, arg0);
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method6979(@OriginalArg(1) Class13 arg0) {
		return Static213.method3543(super.aByte108, super.anInt8037 >> Static326.anInt5713, super.anInt8034 >> Static326.anInt5713);
	}
}

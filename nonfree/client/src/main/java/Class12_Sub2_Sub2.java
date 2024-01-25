import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public abstract class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!kga", name = "w", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(IIIIII)V")
	protected Class12_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9373 = arg1;
		super.aByte127 = (byte) arg4;
		super.anInt9375 = arg2;
		super.anInt9374 = arg0;
		super.aByte128 = (byte) arg3;
		this.aShort39 = (short) arg5;
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7499() {
		return Static590.aBooleanArrayArray10[(super.anInt9374 >> Static562.anInt9207) + Static351.anInt6012 - Static258.anInt4281][Static351.anInt6012 + (super.anInt9375 >> Static562.anInt9207) - Static505.anInt8016];
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I[Lclient!tg;)I")
	@Override
	public final int method7505(@OriginalArg(1) Class2_Sub11[] arg0) {
		return this.method7508(super.anInt9374 >> Static562.anInt9207, super.anInt9375 >> Static562.anInt9207, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(Z)Z")
	@Override
	public final boolean method7506() {
		return Static158.method6599(super.anInt9375 >> Static562.anInt9207, super.aByte127, super.anInt9374 >> Static562.anInt9207);
	}
}

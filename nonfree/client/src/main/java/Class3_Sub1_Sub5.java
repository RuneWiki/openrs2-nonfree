import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public abstract class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qja", name = "H", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(IIIIII)V")
	protected Class3_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9917 = arg2;
		super.anInt9925 = arg0;
		super.anInt9915 = arg1;
		super.aByte142 = (byte) arg4;
		super.aByte141 = (byte) arg3;
		this.aShort105 = (short) arg5;
	}

	@OriginalMember(owner = "client!qja", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8503() {
		return Static537.aBooleanArrayArray32[(super.anInt9925 >> Static273.anInt4424) + Static112.anInt2200 - Static323.anInt5049][(super.anInt9917 >> Static273.anInt4424) + Static112.anInt2200 - Static417.anInt6041];
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8490(@OriginalArg(0) Class33 arg0) {
		return Static592.method7783(super.aByte142, super.anInt9917 >> Static273.anInt4424, super.anInt9925 >> Static273.anInt4424);
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(B[Lclient!kp;)I")
	@Override
	public final int method8498(@OriginalArg(1) Class4_Sub29[] arg0) {
		return this.method8494(super.anInt9917 >> Static273.anInt4424, super.anInt9925 >> Static273.anInt4424, arg0);
	}
}

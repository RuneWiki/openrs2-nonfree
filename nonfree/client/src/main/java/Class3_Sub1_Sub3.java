import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public abstract class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bga", name = "N", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!bga", name = "P", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class3_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte142 = (byte) arg4;
		super.aByte141 = (byte) arg3;
		this.aShort87 = (short) arg5;
		super.anInt9915 = arg1;
		super.anInt9917 = arg2;
		this.aShort88 = (short) arg6;
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public final void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(B[Lclient!kp;)I")
	@Override
	public final int method8498(@OriginalArg(1) Class4_Sub29[] arg0) {
		return this.method8494(super.anInt9917 >> Static273.anInt4424, super.anInt9925 >> Static273.anInt4424, arg0);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8490(@OriginalArg(0) Class33 arg0) {
		return Static109.method2084(this.method8499(), super.aByte142, super.anInt9925 >> Static273.anInt4424, super.anInt9917 >> Static273.anInt4424);
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(Z)V")
	@Override
	public final void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "(Z)Z")
	@Override
	public final boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8503() {
		return Static537.aBooleanArrayArray32[Static112.anInt2200 + (super.anInt9925 >> Static273.anInt4424) - Static323.anInt5049][Static112.anInt2200 + (super.anInt9917 >> Static273.anInt4424) - Static417.anInt6041];
	}
}

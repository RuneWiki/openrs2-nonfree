import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public abstract class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIII)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt9917 = arg2;
		super.aByte142 = (byte) arg4;
		super.anInt9915 = arg1;
		super.aByte141 = (byte) arg3;
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(Z)Z")
	@Override
	public final boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B[Lclient!kp;)I")
	@Override
	public final int method8498(@OriginalArg(1) Class4_Sub29[] arg0) {
		return this.method8494(super.anInt9917 >> Static273.anInt4424, super.anInt9925 >> Static273.anInt4424, arg0);
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)V")
	@Override
	public final void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8490(@OriginalArg(0) Class33 arg0) {
		@Pc(23) Class144 local23 = Static432.method5964(super.aByte141, super.anInt9925 >> Static273.anInt4424, super.anInt9917 >> Static273.anInt4424);
		return local23 != null && local23.aClass3_Sub1_Sub2_1.aBoolean772 ? Static109.method2084(local23.aClass3_Sub1_Sub2_1.method8499() + this.method8499(), super.aByte141, super.anInt9925 >> Static273.anInt4424, super.anInt9917 >> Static273.anInt4424) : Static592.method7783(super.aByte141, super.anInt9917 >> Static273.anInt4424, super.anInt9925 >> Static273.anInt4424);
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8503() {
		return Static537.aBooleanArrayArray32[Static112.anInt2200 + (super.anInt9925 >> Static273.anInt4424) - Static323.anInt5049][(super.anInt9917 >> Static273.anInt4424) - (Static417.anInt6041 - Static112.anInt2200)];
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public final void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}

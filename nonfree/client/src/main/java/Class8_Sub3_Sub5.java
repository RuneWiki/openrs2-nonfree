import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public abstract class Class8_Sub3_Sub5 extends Class8_Sub3 {

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIII)V")
	public Class8_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte124 = (byte) arg4;
		super.aByte123 = (byte) arg3;
		super.anInt9370 = arg2;
		super.anInt9365 = arg0;
		super.anInt9361 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[Lclient!rc;)I")
	@Override
	public final int method7616(@OriginalArg(1) Class1_Sub18[] arg0) {
		return this.method7619(super.anInt9365 >> Static351.anInt5832, arg0, super.anInt9370 >> Static351.anInt5832);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7624() {
		return Static44.aBooleanArrayArray1[Static240.anInt4447 + (super.anInt9365 >> Static351.anInt5832) - Static258.anInt4643][Static240.anInt4447 + (super.anInt9370 >> Static351.anInt5832) - Static312.anInt5339];
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
	@Override
	public final void method7617() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method7629() {
		return false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public final void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method7631() {
		@Pc(20) Class111 local20 = Static90.method1579(super.aByte123, super.anInt9365 >> Static351.anInt5832, super.anInt9370 >> Static351.anInt5832);
		return local20 != null && local20.aClass8_Sub3_Sub3_1.aBoolean731 ? Static274.method266(super.anInt9370 >> Static351.anInt5832, super.aByte123, super.anInt9365 >> Static351.anInt5832, local20.aClass8_Sub3_Sub3_1.method7618() + this.method7618()) : Static548.method7005(super.aByte123, super.anInt9365 >> Static351.anInt5832, super.anInt9370 >> Static351.anInt5832);
	}
}

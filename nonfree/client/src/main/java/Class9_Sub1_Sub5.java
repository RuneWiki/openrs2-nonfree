import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public abstract class Class9_Sub1_Sub5 extends Class9_Sub1 {

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIII)V")
	public Class9_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte125 = (byte) arg4;
		super.anInt8980 = arg2;
		super.anInt8975 = arg0;
		super.aByte126 = (byte) arg3;
		super.anInt8977 = arg1;
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
	@Override
	public final void method7477() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([Lclient!ff;B)I")
	@Override
	public final int method7468(@OriginalArg(0) Class3_Sub22[] arg0) {
		return this.method7470(super.anInt8980 >> Static458.anInt7508, arg0, super.anInt8975 >> Static458.anInt7508);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7475() {
		return Static356.aBooleanArrayArray5[Static266.anInt4982 + (super.anInt8975 >> Static458.anInt7508) - Static210.anInt4205][Static266.anInt4982 + (super.anInt8980 >> Static458.anInt7508) - Static12.anInt136];
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method7483() {
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public final void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7484() {
		@Pc(20) Class16 local20 = Static65.method1514(super.aByte126, super.anInt8975 >> Static458.anInt7508, super.anInt8980 >> Static458.anInt7508);
		return local20 != null && local20.aClass9_Sub1_Sub1_1.aBoolean655 ? Static535.method7036(local20.aClass9_Sub1_Sub1_1.method7478() + this.method7478(), super.anInt8975 >> Static458.anInt7508, super.aByte126, super.anInt8980 >> Static458.anInt7508) : Static477.method6554(super.anInt8975 >> Static458.anInt7508, super.aByte126, super.anInt8980 >> Static458.anInt7508);
	}
}

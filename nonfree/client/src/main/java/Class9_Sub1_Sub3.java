import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class Class9_Sub1_Sub3 extends Class9_Sub1 {

	@OriginalMember(owner = "client!tea", name = "A", descriptor = "S")
	public final short aShort42;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(IIIIII)V")
	protected Class9_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt8980 = arg2;
		super.anInt8977 = arg1;
		super.aByte125 = (byte) arg4;
		super.aByte126 = (byte) arg3;
		this.aShort42 = (short) arg5;
		super.anInt8975 = arg0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([Lclient!ff;B)I")
	@Override
	public final int method7468(@OriginalArg(0) Class3_Sub22[] arg0) {
		return this.method7470(super.anInt8980 >> Static458.anInt7508, arg0, super.anInt8975 >> Static458.anInt7508);
	}

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7484() {
		return Static477.method6554(super.anInt8975 >> Static458.anInt7508, super.aByte125, super.anInt8980 >> Static458.anInt7508);
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7475() {
		return Static356.aBooleanArrayArray5[Static266.anInt4982 + (super.anInt8975 >> Static458.anInt7508) - Static210.anInt4205][Static266.anInt4982 + (super.anInt8980 >> Static458.anInt7508) - Static12.anInt136];
	}
}

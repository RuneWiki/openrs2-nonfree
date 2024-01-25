import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public abstract class Class23_Sub2_Sub3 extends Class23_Sub2 {

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "[F")
	public static final float[] aFloatArray75 = new float[16384];

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "[F")
	public static final float[] aFloatArray76 = new float[16384];

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "S")
	public final short aShort116;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray75[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray76[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIII)V")
	protected Class23_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte142 = (byte) arg3;
		super.anInt10114 = arg1;
		this.aShort116 = (short) arg5;
		super.anInt10109 = arg2;
		super.aByte143 = (byte) arg4;
		super.anInt10108 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8599(@OriginalArg(1) Class16 arg0) {
		return Static213.method3374(super.aByte143, super.anInt10108 >> Static436.anInt7634, super.anInt10109 >> Static436.anInt7634);
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8598() {
		return Static569.aBooleanArrayArray6[Static641.anInt9890 + (super.anInt10108 >> Static436.anInt7634) - Static177.anInt3330][(super.anInt10109 >> Static436.anInt7634) + Static641.anInt9890 - Static227.anInt4358];
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lclient!bq;Z)I")
	@Override
	public final int method8602(@OriginalArg(0) Class3_Sub7[] arg0) {
		return this.method8609(super.anInt10109 >> Static436.anInt7634, super.anInt10108 >> Static436.anInt7634, arg0);
	}
}

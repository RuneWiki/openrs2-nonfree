import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public abstract class Class11_Sub1_Sub5 extends Class11_Sub1 {

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "[I")
	public static final int[] anIntArray303 = new int[32];

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray303[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIII)V")
	public Class11_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte124 = (byte) arg3;
		super.anInt9929 = arg2;
		super.anInt9930 = arg1;
		super.anInt9925 = arg0;
		super.aByte125 = (byte) arg4;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public final void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "(B)Z")
	@Override
	public final boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8302() {
		@Pc(19) Class61 local19 = Static225.method3814(super.aByte124, super.anInt9925 >> Static415.anInt7579, super.anInt9929 >> Static415.anInt7579);
		return local19 != null && local19.aClass11_Sub1_Sub1_1.aBoolean497 ? Static263.method4281(super.anInt9929 >> Static415.anInt7579, local19.aClass11_Sub1_Sub1_1.method8315() + this.method8315(), super.anInt9925 >> Static415.anInt7579, super.aByte124) : Static182.method3302(super.aByte124, super.anInt9929 >> Static415.anInt7579, super.anInt9925 >> Static415.anInt7579);
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8314() {
		return Static36.aBooleanArrayArray2[Static319.anInt5795 + (super.anInt9925 >> Static415.anInt7579) - Static623.anInt9563][Static319.anInt5795 + (super.anInt9929 >> Static415.anInt7579) - Static507.anInt8547];
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
	@Override
	public final void method8311() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([Lclient!bh;I)I")
	@Override
	public final int method8318(@OriginalArg(0) Class2_Sub4[] arg0) {
		return this.method8317(arg0, super.anInt9925 >> Static415.anInt7579, super.anInt9929 >> Static415.anInt7579);
	}
}

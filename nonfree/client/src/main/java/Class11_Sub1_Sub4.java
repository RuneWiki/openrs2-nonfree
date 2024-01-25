import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class Class11_Sub1_Sub4 extends Class11_Sub1 {

	@OriginalMember(owner = "client!ht", name = "F", descriptor = "S")
	public final short aShort113;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIII)V")
	protected Class11_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9929 = arg2;
		super.anInt9930 = arg1;
		super.aByte124 = (byte) arg3;
		this.aShort113 = (short) arg5;
		super.aByte125 = (byte) arg4;
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8302() {
		return Static182.method3302(super.aByte125, super.anInt9929 >> Static415.anInt7579, super.anInt9925 >> Static415.anInt7579);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([Lclient!bh;I)I")
	@Override
	public final int method8318(@OriginalArg(0) Class2_Sub4[] arg0) {
		return this.method8317(arg0, super.anInt9925 >> Static415.anInt7579, super.anInt9929 >> Static415.anInt7579);
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8314() {
		return Static36.aBooleanArrayArray2[Static319.anInt5795 + (super.anInt9925 >> Static415.anInt7579) - Static623.anInt9563][(super.anInt9929 >> Static415.anInt7579) + Static319.anInt5795 - Static507.anInt8547];
	}
}

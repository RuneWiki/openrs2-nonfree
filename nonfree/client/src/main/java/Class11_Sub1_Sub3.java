import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class Class11_Sub1_Sub3 extends Class11_Sub1 {

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class11_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt9929 = arg2;
		this.aShort121 = (short) arg6;
		this.aShort122 = (short) arg5;
		super.anInt9930 = arg1;
		super.anInt9925 = arg0;
		super.aByte125 = (byte) arg4;
		super.aByte124 = (byte) arg3;
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8314() {
		return Static36.aBooleanArrayArray2[Static319.anInt5795 + (super.anInt9925 >> Static415.anInt7579) - Static623.anInt9563][Static319.anInt5795 + (super.anInt9929 >> Static415.anInt7579) - Static507.anInt8547];
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public final void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8302() {
		return Static263.method4281(super.anInt9929 >> Static415.anInt7579, this.method8315(), super.anInt9925 >> Static415.anInt7579, super.aByte125);
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	@Override
	public final void method8311() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(B)Z")
	@Override
	public final boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lclient!bh;I)I")
	@Override
	public final int method8318(@OriginalArg(0) Class2_Sub4[] arg0) {
		return this.method8317(arg0, super.anInt9925 >> Static415.anInt7579, super.anInt9929 >> Static415.anInt7579);
	}
}

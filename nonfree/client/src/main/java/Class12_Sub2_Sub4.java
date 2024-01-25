import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public abstract class Class12_Sub2_Sub4 extends Class12_Sub2 {

	@OriginalMember(owner = "client!fha", name = "F", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(IIIIII)V")
	protected Class12_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10998 = arg0;
		super.aByte146 = (byte) arg3;
		super.anInt11002 = arg2;
		super.aByte145 = (byte) arg4;
		this.aShort87 = (short) arg5;
		super.anInt10997 = arg1;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9155(@OriginalArg(1) Class137 arg0) {
		return Static623.method8750(super.anInt11002 >> Static579.anInt9935, super.anInt10998 >> Static579.anInt9935, super.aByte145);
	}

	@OriginalMember(owner = "client!fha", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9167() {
		return Static255.aBooleanArrayArray2[(super.anInt10998 >> Static579.anInt9935) + Static64.anInt1476 - Static358.anInt6609][Static64.anInt1476 + (super.anInt11002 >> Static579.anInt9935) - Static297.anInt5235];
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I[Lclient!qm;)I")
	@Override
	public final int method9165(@OriginalArg(1) Class14_Sub37[] arg0) {
		return this.method9168(super.anInt11002 >> Static579.anInt9935, arg0, super.anInt10998 >> Static579.anInt9935);
	}
}

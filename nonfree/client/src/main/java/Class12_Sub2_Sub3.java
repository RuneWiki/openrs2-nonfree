import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class Class12_Sub2_Sub3 extends Class12_Sub2 {

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class12_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt10997 = arg1;
		super.aByte145 = (byte) arg4;
		this.aShort119 = (short) arg5;
		super.anInt11002 = arg2;
		super.anInt10998 = arg0;
		this.aShort120 = (short) arg6;
		super.aByte146 = (byte) arg3;
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
	@Override
	public final void method9158() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9167() {
		return Static255.aBooleanArrayArray2[Static64.anInt1476 + (super.anInt10998 >> Static579.anInt9935) - Static358.anInt6609][(super.anInt11002 >> Static579.anInt9935) + Static64.anInt1476 - Static297.anInt5235];
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(Z)Z")
	@Override
	public final boolean method9160() {
		return false;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[Lclient!qm;)I")
	@Override
	public final int method9165(@OriginalArg(1) Class14_Sub37[] arg0) {
		return this.method9168(super.anInt11002 >> Static579.anInt9935, arg0, super.anInt10998 >> Static579.anInt9935);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public final void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9155(@OriginalArg(1) Class137 arg0) {
		return Static642.method8941(this.method9159(), super.anInt11002 >> Static579.anInt9935, super.anInt10998 >> Static579.anInt9935, super.aByte145);
	}
}

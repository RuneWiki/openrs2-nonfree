import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public abstract class Class12_Sub2_Sub5 extends Class12_Sub2 {

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIII)V")
	public Class12_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte145 = (byte) arg4;
		super.aByte146 = (byte) arg3;
		super.anInt11002 = arg2;
		super.anInt10998 = arg0;
		super.anInt10997 = arg1;
	}

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "(I)V")
	@Override
	public final void method9158() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(Z)Z")
	@Override
	public final boolean method9160() {
		return false;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9155(@OriginalArg(1) Class137 arg0) {
		@Pc(20) Class43 local20 = Static296.method5213(super.aByte146, super.anInt10998 >> Static579.anInt9935, super.anInt11002 >> Static579.anInt9935);
		return local20 != null && local20.aClass12_Sub2_Sub2_1.aBoolean738 ? Static642.method8941(local20.aClass12_Sub2_Sub2_1.method9159() + this.method9159(), super.anInt11002 >> Static579.anInt9935, super.anInt10998 >> Static579.anInt9935, super.aByte146) : Static623.method8750(super.anInt11002 >> Static579.anInt9935, super.anInt10998 >> Static579.anInt9935, super.aByte146);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public final void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9167() {
		return Static255.aBooleanArrayArray2[Static64.anInt1476 + (super.anInt10998 >> Static579.anInt9935) - Static358.anInt6609][Static64.anInt1476 + (super.anInt11002 >> Static579.anInt9935) - Static297.anInt5235];
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[Lclient!qm;)I")
	@Override
	public final int method9165(@OriginalArg(1) Class14_Sub37[] arg0) {
		return this.method9168(super.anInt11002 >> Static579.anInt9935, arg0, super.anInt10998 >> Static579.anInt9935);
	}
}

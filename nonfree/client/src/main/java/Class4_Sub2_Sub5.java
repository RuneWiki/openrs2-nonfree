import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public abstract class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte133 = (byte) arg3;
		super.anInt10229 = arg0;
		super.aByte134 = (byte) arg4;
		super.anInt10228 = arg2;
		super.anInt10234 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8972(@OriginalArg(1) Class145 arg0) {
		@Pc(24) Class142 local24 = Static64.method961(super.aByte133, super.anInt10229 >> Static260.anInt4053, super.anInt10228 >> Static260.anInt4053);
		return local24 != null && local24.aClass4_Sub2_Sub1_1.aBoolean888 ? Static252.method3567(super.anInt10228 >> Static260.anInt4053, local24.aClass4_Sub2_Sub1_1.method8977(0) + this.method8977(0), super.aByte133, super.anInt10229 >> Static260.anInt4053) : Static471.method6762(super.anInt10229 >> Static260.anInt4053, super.aByte133, super.anInt10228 >> Static260.anInt4053);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public final void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 != 89) {
			Static595.method6984(-3, (int[]) null, (long[]) null);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([Lclient!bba;B)I")
	@Override
	public final int method8969(@OriginalArg(0) Class2_Sub7[] arg0) {
		return this.method8965(super.anInt10228 >> Static260.anInt4053, super.anInt10229 >> Static260.anInt4053, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8964() {
		return Static208.aBooleanArrayArray6[Static128.anInt2136 + (super.anInt10229 >> Static260.anInt4053) - Static20.anInt267][Static128.anInt2136 + (super.anInt10228 >> Static260.anInt4053) - Static503.anInt2766];
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(Z)V")
	@Override
	public final void method8973() {
		throw new IllegalStateException();
	}
}

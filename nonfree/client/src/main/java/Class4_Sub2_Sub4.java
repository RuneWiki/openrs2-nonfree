import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public abstract class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uca", name = "C", descriptor = "S")
	public short aShort59;

	@OriginalMember(owner = "client!uca", name = "v", descriptor = "S")
	public short aShort58;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class4_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt10229 = arg0;
		super.aByte134 = (byte) arg4;
		super.aByte133 = (byte) arg3;
		super.anInt10228 = arg2;
		this.aShort59 = (short) arg6;
		this.aShort58 = (short) arg5;
		super.anInt10234 = arg1;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8964() {
		return Static208.aBooleanArrayArray6[Static128.anInt2136 + (super.anInt10229 >> Static260.anInt4053) - Static20.anInt267][(super.anInt10228 >> Static260.anInt4053) + Static128.anInt2136 - Static503.anInt2766];
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([Lclient!bba;B)I")
	@Override
	public final int method8969(@OriginalArg(0) Class2_Sub7[] arg0) {
		return this.method8965(super.anInt10228 >> Static260.anInt4053, super.anInt10229 >> Static260.anInt4053, arg0);
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8972(@OriginalArg(1) Class145 arg0) {
		return Static252.method3567(super.anInt10228 >> Static260.anInt4053, this.method8977(0), super.aByte134, super.anInt10229 >> Static260.anInt4053);
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(Z)V")
	@Override
	public final void method8973() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public final void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 == 89) {
			throw new IllegalStateException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qka")
public abstract class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!qka", name = "w", descriptor = "S")
	public final short aShort86;

	@OriginalMember(owner = "client!qka", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10228 = arg2;
		this.aShort86 = (short) arg5;
		super.aByte133 = (byte) arg3;
		super.aByte134 = (byte) arg4;
		super.anInt10229 = arg0;
		super.anInt10234 = arg1;
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8972(@OriginalArg(1) Class145 arg0) {
		return Static471.method6762(super.anInt10229 >> Static260.anInt4053, super.aByte134, super.anInt10228 >> Static260.anInt4053);
	}

	@OriginalMember(owner = "client!qka", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8964() {
		return Static208.aBooleanArrayArray6[(super.anInt10229 >> Static260.anInt4053) + Static128.anInt2136 - Static20.anInt267][Static128.anInt2136 + (super.anInt10228 >> Static260.anInt4053) - Static503.anInt2766];
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "([Lclient!bba;B)I")
	@Override
	public final int method8969(@OriginalArg(0) Class2_Sub7[] arg0) {
		return this.method8965(super.anInt10228 >> Static260.anInt4053, super.anInt10229 >> Static260.anInt4053, arg0);
	}
}

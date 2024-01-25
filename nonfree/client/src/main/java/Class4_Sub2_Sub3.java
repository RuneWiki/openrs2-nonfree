import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public abstract class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "S")
	public final short aShort120;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort120 = (short) arg5;
		super.aByte134 = (byte) arg4;
		super.anInt10229 = arg0;
		super.aByte133 = (byte) arg3;
		super.anInt10228 = arg2;
		super.anInt10234 = arg1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([Lclient!bba;B)I")
	@Override
	public final int method8969(@OriginalArg(0) Class2_Sub7[] arg0) {
		@Pc(10) int local10 = super.anInt10229 >> Static260.anInt4053;
		@Pc(15) int local15 = super.anInt10228 >> Static260.anInt4053;
		@Pc(24) int local24 = 0;
		if (Static20.anInt267 == local10) {
			local24++;
		} else if (local10 > Static20.anInt267) {
			local24 += 2;
		}
		if (Static503.anInt2766 == local15) {
			local24 += 3;
		} else if (Static503.anInt2766 > local15) {
			local24 += 6;
		}
		@Pc(60) int local60 = Static154.anIntArray192[local24];
		if ((local60 & this.aShort120) != 0) {
			return this.method8965(local15, local10, arg0);
		} else if (this.aShort120 == 1 && local10 > 0) {
			return this.method8965(local15, local10 - 1, arg0);
		} else if (this.aShort120 == 4 && Static372.anInt5930 >= local10) {
			return this.method8965(local15, local10 + 1, arg0);
		} else if (this.aShort120 == 8 && local15 > 0) {
			return this.method8965(local15 - 1, local10, arg0);
		} else if (this.aShort120 == 2 && Static545.anInt8590 >= local15) {
			return this.method8965(local15 + 1, local10, arg0);
		} else if (this.aShort120 == 16 && local10 > 0 && local15 <= Static545.anInt8590) {
			return this.method8965(local15 + 1, local10 + -1, arg0);
		} else if (this.aShort120 == 32 && Static372.anInt5930 >= local10 && local15 <= Static545.anInt8590) {
			return this.method8965(local15 + 1, local10 + 1, arg0);
		} else if (this.aShort120 == 128 && local10 > 0 && local15 > 0) {
			return this.method8965(local15 - 1, local10 + -1, arg0);
		} else if (this.aShort120 == 64 && Static372.anInt5930 >= local10 && local15 > 0) {
			return this.method8965(local15 - 1, local10 + 1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8972(@OriginalArg(1) Class145 arg0) {
		return Static206.method2901(super.aByte134, super.anInt10229 >> Static260.anInt4053, super.anInt10228 >> Static260.anInt4053, this);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8964() {
		return Static208.aBooleanArrayArray6[(super.anInt10229 >> Static260.anInt4053) - (Static20.anInt267 - Static128.anInt2136)][Static128.anInt2136 + (super.anInt10228 >> Static260.anInt4053) - Static503.anInt2766];
	}
}

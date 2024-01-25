import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public abstract class Class28_Sub1_Sub5 extends Class28_Sub1 {

	@OriginalMember(owner = "client!si", name = "x", descriptor = "S")
	public final short aShort59;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIII)V")
	protected Class28_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte144 = (byte) arg4;
		super.anInt10784 = arg2;
		this.aShort59 = (short) arg5;
		super.anInt10781 = arg0;
		super.anInt10779 = arg1;
		super.aByte145 = (byte) arg3;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([Lclient!gu;I)I")
	@Override
	public final int method8970(@OriginalArg(0) Class5_Sub18[] arg0) {
		@Pc(10) int local10 = super.anInt10781 >> Static588.anInt9672;
		@Pc(15) int local15 = super.anInt10784 >> Static588.anInt9672;
		@Pc(17) int local17 = 0;
		if (local10 == Static57.anInt852) {
			local17++;
		} else if (Static57.anInt852 < local10) {
			local17 += 2;
		}
		if (local15 == Static481.anInt8080) {
			local17 += 3;
		} else if (Static481.anInt8080 > local15) {
			local17 += 6;
		}
		@Pc(59) int local59 = Static364.anIntArray375[local17];
		if ((this.aShort59 & local59) != 0) {
			return this.method8967(local10, arg0, local15);
		} else if (this.aShort59 == 1 && local10 > 0) {
			return this.method8967(local10 - 1, arg0, local15);
		} else if (this.aShort59 == 4 && local10 <= Static216.anInt4042) {
			return this.method8967(local10 + 1, arg0, local15);
		} else if (this.aShort59 == 8 && local15 > 0) {
			return this.method8967(local10, arg0, local15 - 1);
		} else if (this.aShort59 == 2 && local15 <= Static233.anInt4238) {
			return this.method8967(local10, arg0, local15 + 1);
		} else if (this.aShort59 == 16 && local10 > 0 && local15 <= Static233.anInt4238) {
			return this.method8967(local10 - 1, arg0, local15 + 1);
		} else if (this.aShort59 == 32 && Static216.anInt4042 >= local10 && Static233.anInt4238 >= local15) {
			return this.method8967(local10 + 1, arg0, local15 + 1);
		} else if (this.aShort59 == 128 && local10 > 0 && local15 > 0) {
			return this.method8967(local10 - 1, arg0, local15 - 1);
		} else if (this.aShort59 == 64 && local10 <= Static216.anInt4042 && local15 > 0) {
			return this.method8967(local10 + 1, arg0, local15 - 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method8961() {
		return Static453.aBooleanArrayArray4[Static187.anInt6996 + (super.anInt10781 >> Static588.anInt9672) - Static57.anInt852][Static187.anInt6996 + (super.anInt10784 >> Static588.anInt9672) - Static481.anInt8080];
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method8974(@OriginalArg(0) Class65 arg0) {
		return Static500.method7125(this, super.anInt10784 >> Static588.anInt9672, super.aByte144, super.anInt10781 >> Static588.anInt9672);
	}
}

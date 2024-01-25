import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public abstract class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "S")
	public final short aShort27;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIII)V")
	protected Class2_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort27 = (short) arg5;
		super.anInt10001 = arg2;
		super.anInt10004 = arg1;
		super.anInt10006 = arg0;
		super.aByte141 = (byte) arg4;
		super.aByte140 = (byte) arg3;
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8461() {
		return Static443.aBooleanArrayArray8[(super.anInt10006 >> Static185.anInt3178) + Static514.anInt8546 - Static608.anInt9872][(super.anInt10001 >> Static185.anInt3178) + Static514.anInt8546 - Static370.anInt6309];
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8445(@OriginalArg(0) Class132 arg0) {
		return Static597.method8269(super.aByte141, super.anInt10006 >> Static185.anInt3178, super.anInt10001 >> Static185.anInt3178, this);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z[Lclient!sca;)I")
	@Override
	public final int method8450(@OriginalArg(1) Class6_Sub17[] arg0) {
		@Pc(10) int local10 = super.anInt10006 >> Static185.anInt3178;
		@Pc(15) int local15 = super.anInt10001 >> Static185.anInt3178;
		@Pc(17) int local17 = 0;
		if (Static608.anInt9872 == local10) {
			local17++;
		} else if (Static608.anInt9872 < local10) {
			local17 += 2;
		}
		if (local15 == Static370.anInt6309) {
			local17 += 3;
		} else if (local15 < Static370.anInt6309) {
			local17 += 6;
		}
		@Pc(41) int local41 = Static272.anIntArray266[local17];
		if ((this.aShort27 & local41) != 0) {
			return this.method8452(arg0, local15, local10);
		} else if (this.aShort27 == 1 && local10 > 0) {
			return this.method8452(arg0, local15, local10 - 1);
		} else if (this.aShort27 == 4 && local10 <= Static209.anInt3602) {
			return this.method8452(arg0, local15, local10 + 1);
		} else if (this.aShort27 == 8 && local15 > 0) {
			return this.method8452(arg0, local15 - 1, local10);
		} else if (this.aShort27 == 2 && Static245.anInt4308 >= local15) {
			return this.method8452(arg0, local15 + 1, local10);
		} else if (this.aShort27 == 16 && local10 > 0 && Static245.anInt4308 >= local15) {
			return this.method8452(arg0, local15 + 1, local10 + -1);
		} else if (this.aShort27 == 32 && Static209.anInt3602 >= local10 && Static245.anInt4308 >= local15) {
			return this.method8452(arg0, local15 + 1, local10 - -1);
		} else if (this.aShort27 == 128 && local10 > 0 && local15 > 0) {
			return this.method8452(arg0, local15 - 1, local10 + -1);
		} else if (this.aShort27 == 64 && Static209.anInt3602 >= local10 && local15 > 0) {
			return this.method8452(arg0, local15 - 1, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}
}

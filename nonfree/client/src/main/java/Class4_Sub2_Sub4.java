import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public abstract class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "S")
	public final short aShort89;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte131 = (byte) arg4;
		super.anInt10229 = arg2;
		super.anInt10231 = arg0;
		this.aShort89 = (short) arg5;
		super.aByte132 = (byte) arg3;
		super.anInt10228 = arg1;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8714(@OriginalArg(1) Class133 arg0) {
		return Static513.method767(super.anInt10231 >> Static115.anInt2156, this, super.aByte131, super.anInt10229 >> Static115.anInt2156);
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8717() {
		return Static475.aBooleanArrayArray8[(super.anInt10231 >> Static115.anInt2156) + Static51.anInt1064 - Static260.anInt4712][Static51.anInt1064 + (super.anInt10229 >> Static115.anInt2156) - Static598.anInt10044];
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "([Lclient!vt;I)I")
	@Override
	public final int method8729(@OriginalArg(0) Class5_Sub11[] arg0) {
		@Pc(10) int local10 = super.anInt10231 >> Static115.anInt2156;
		@Pc(15) int local15 = super.anInt10229 >> Static115.anInt2156;
		@Pc(17) int local17 = 0;
		if (local10 == Static260.anInt4712) {
			local17++;
		} else if (local10 > Static260.anInt4712) {
			local17 += 2;
		}
		if (local15 == Static598.anInt10044) {
			local17 += 3;
		} else if (local15 < Static598.anInt10044) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static632.anIntArray596[local17];
		if ((local49 & this.aShort89) != 0) {
			return this.method8731(local10, arg0, local15);
		} else if (this.aShort89 == 1 && local10 > 0) {
			return this.method8731(local10 - 1, arg0, local15);
		} else if (this.aShort89 == 4 && local10 <= Static357.anInt5961) {
			return this.method8731(local10 + 1, arg0, local15);
		} else if (this.aShort89 == 8 && local15 > 0) {
			return this.method8731(local10, arg0, local15 - 1);
		} else if (this.aShort89 == 2 && Static429.anInt7422 >= local15) {
			return this.method8731(local10, arg0, local15 + 1);
		} else if (this.aShort89 == 16 && local10 > 0 && Static429.anInt7422 >= local15) {
			return this.method8731(local10 - 1, arg0, local15 + 1);
		} else if (this.aShort89 == 32 && local10 <= Static357.anInt5961 && Static429.anInt7422 >= local15) {
			return this.method8731(local10 + 1, arg0, local15 + 1);
		} else if (this.aShort89 == 128 && local10 > 0 && local15 > 0) {
			return this.method8731(local10 - 1, arg0, local15 - 1);
		} else if (this.aShort89 == 64 && Static357.anInt5961 >= local10 && local15 > 0) {
			return this.method8731(local10 + 1, arg0, local15 - 1);
		} else {
			throw new RuntimeException("");
		}
	}
}

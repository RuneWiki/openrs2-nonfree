import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public abstract class Class23_Sub2_Sub5 extends Class23_Sub2 {

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "S")
	public final short aShort111;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIII)V")
	protected Class23_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte143 = (byte) arg4;
		super.anInt10109 = arg2;
		super.anInt10114 = arg1;
		this.aShort111 = (short) arg5;
		super.aByte142 = (byte) arg3;
		super.anInt10108 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8599(@OriginalArg(1) Class16 arg0) {
		return Static22.method743(this, super.anInt10108 >> Static436.anInt7634, super.anInt10109 >> Static436.anInt7634, super.aByte143);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([Lclient!bq;Z)I")
	@Override
	public final int method8602(@OriginalArg(0) Class3_Sub7[] arg0) {
		@Pc(10) int local10 = super.anInt10108 >> Static436.anInt7634;
		@Pc(15) int local15 = super.anInt10109 >> Static436.anInt7634;
		@Pc(17) int local17 = 0;
		if (Static177.anInt3330 == local10) {
			local17++;
		} else if (local10 > Static177.anInt3330) {
			local17 += 2;
		}
		if (Static227.anInt4358 == local15) {
			local17 += 3;
		} else if (Static227.anInt4358 > local15) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static379.anIntArray633[local17];
		if ((this.aShort111 & local49) != 0) {
			return this.method8609(local15, local10, arg0);
		} else if (this.aShort111 == 1 && local10 > 0) {
			return this.method8609(local15, local10 - 1, arg0);
		} else if (this.aShort111 == 4 && local10 <= Static410.anInt6962) {
			return this.method8609(local15, local10 + 1, arg0);
		} else if (this.aShort111 == 8 && local15 > 0) {
			return this.method8609(local15 - 1, local10, arg0);
		} else if (this.aShort111 == 2 && local15 <= Static315.anInt5894) {
			return this.method8609(local15 + 1, local10, arg0);
		} else if (this.aShort111 == 16 && local10 > 0 && local15 <= Static315.anInt5894) {
			return this.method8609(local15 + 1, local10 + -1, arg0);
		} else if (this.aShort111 == 32 && Static410.anInt6962 >= local10 && Static315.anInt5894 >= local15) {
			return this.method8609(local15 + 1, local10 + 1, arg0);
		} else if (this.aShort111 == 128 && local10 > 0 && local15 > 0) {
			return this.method8609(local15 - 1, local10 + -1, arg0);
		} else if (this.aShort111 == 64 && local10 <= Static410.anInt6962 && local15 > 0) {
			return this.method8609(local15 - 1, local10 + 1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8598() {
		return Static569.aBooleanArrayArray6[Static641.anInt9890 + (super.anInt10108 >> Static436.anInt7634) - Static177.anInt3330][Static641.anInt9890 + (super.anInt10109 >> Static436.anInt7634) - Static227.anInt4358];
	}
}

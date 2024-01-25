import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public abstract class Class9_Sub2_Sub3 extends Class9_Sub2 {

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIII)V")
	protected Class9_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte127 = (byte) arg3;
		super.anInt10152 = arg0;
		super.anInt10154 = arg1;
		super.anInt10158 = arg2;
		this.aShort83 = (short) arg5;
		super.aByte128 = (byte) arg4;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([Lclient!tj;B)I")
	@Override
	public final int method8601(@OriginalArg(0) Class3_Sub22[] arg0) {
		@Pc(10) int local10 = super.anInt10152 >> Static485.anInt8241;
		@Pc(15) int local15 = super.anInt10158 >> Static485.anInt8241;
		@Pc(17) int local17 = 0;
		if (Static281.anInt5392 == local10) {
			local17++;
		} else if (local10 > Static281.anInt5392) {
			local17 += 2;
		}
		if (local15 == Static394.anInt7055) {
			local17 += 3;
		} else if (local15 < Static394.anInt7055) {
			local17 += 6;
		}
		@Pc(45) int local45 = Static431.anIntArray450[local17];
		if ((local45 & this.aShort83) != 0) {
			return this.method8606(local10, local15, arg0);
		} else if (this.aShort83 == 1 && local10 > 0) {
			return this.method8606(local10 - 1, local15, arg0);
		} else if (this.aShort83 == 4 && Static573.anInt6750 >= local10) {
			return this.method8606(local10 + 1, local15, arg0);
		} else if (this.aShort83 == 8 && local15 > 0) {
			return this.method8606(local10, local15 - 1, arg0);
		} else if (this.aShort83 == 2 && local15 <= Static547.anInt9143) {
			return this.method8606(local10, local15 + 1, arg0);
		} else if (this.aShort83 == 16 && local10 > 0 && Static547.anInt9143 >= local15) {
			return this.method8606(local10 - 1, local15 - -1, arg0);
		} else if (this.aShort83 == 32 && local10 <= Static573.anInt6750 && Static547.anInt9143 >= local15) {
			return this.method8606(local10 + 1, local15 - -1, arg0);
		} else if (this.aShort83 == 128 && local10 > 0 && local15 > 0) {
			return this.method8606(local10 - 1, local15 + -1, arg0);
		} else if (this.aShort83 == 64 && Static573.anInt6750 >= local10 && local15 > 0) {
			return this.method8606(local10 + 1, local15 + -1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8608(@OriginalArg(0) Class82 arg0) {
		return Static63.method1053(super.anInt10152 >> Static485.anInt8241, super.aByte128, this, super.anInt10158 >> Static485.anInt8241);
	}

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		return Static140.aBooleanArrayArray2[Static361.anInt6683 + (super.anInt10152 >> Static485.anInt8241) - Static281.anInt5392][(super.anInt10158 >> Static485.anInt8241) + Static361.anInt6683 - Static394.anInt7055];
	}
}

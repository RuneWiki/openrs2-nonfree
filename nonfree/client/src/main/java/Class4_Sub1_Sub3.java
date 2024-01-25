import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public abstract class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte124 = (byte) arg4;
		super.aByte123 = (byte) arg3;
		super.anInt8915 = arg1;
		this.aShort53 = (short) arg5;
		super.anInt8916 = arg0;
		super.anInt8911 = arg2;
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7701() {
		return Static557.method8026(super.anInt8916 >> Static308.anInt5834, super.aByte124, super.anInt8911 >> Static308.anInt5834, this);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[Lclient!wh;)I")
	@Override
	public final int method7698(@OriginalArg(1) Class3_Sub16[] arg0) {
		@Pc(10) int local10 = super.anInt8916 >> Static308.anInt5834;
		@Pc(15) int local15 = super.anInt8911 >> Static308.anInt5834;
		@Pc(17) int local17 = 0;
		if (local10 == Static626.anInt10075) {
			local17++;
		} else if (local10 > Static626.anInt10075) {
			local17 += 2;
		}
		if (Static386.anInt7210 == local15) {
			local17 += 3;
		} else if (local15 < Static386.anInt7210) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static95.anIntArray84[local17];
		if ((local49 & this.aShort53) != 0) {
			return this.method7691(local10, arg0, local15);
		} else if (this.aShort53 == 1 && local10 > 0) {
			return this.method7691(local10 - 1, arg0, local15);
		} else if (this.aShort53 == 4 && Static569.anInt9425 >= local10) {
			return this.method7691(local10 + 1, arg0, local15);
		} else if (this.aShort53 == 8 && local15 > 0) {
			return this.method7691(local10, arg0, local15 - 1);
		} else if (this.aShort53 == 2 && Static293.anInt5181 >= local15) {
			return this.method7691(local10, arg0, local15 + 1);
		} else if (this.aShort53 == 16 && local10 > 0 && Static293.anInt5181 >= local15) {
			return this.method7691(local10 - 1, arg0, local15 + 1);
		} else if (this.aShort53 == 32 && local10 <= Static569.anInt9425 && local15 <= Static293.anInt5181) {
			return this.method7691(local10 + 1, arg0, local15 + 1);
		} else if (this.aShort53 == 128 && local10 > 0 && local15 > 0) {
			return this.method7691(local10 - 1, arg0, local15 - 1);
		} else if (this.aShort53 == 64 && Static569.anInt9425 >= local10 && local15 > 0) {
			return this.method7691(local10 + 1, arg0, local15 - 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7694() {
		return Static579.aBooleanArrayArray7[Static468.anInt10228 + (super.anInt8916 >> Static308.anInt5834) - Static626.anInt10075][Static468.anInt10228 + (super.anInt8911 >> Static308.anInt5834) - Static386.anInt7210];
	}
}

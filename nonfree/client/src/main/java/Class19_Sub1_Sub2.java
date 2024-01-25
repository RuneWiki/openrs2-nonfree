import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public abstract class Class19_Sub1_Sub2 extends Class19_Sub1 {

	@OriginalMember(owner = "client!qca", name = "y", descriptor = "S")
	public final short aShort127;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIIIII)V")
	protected Class19_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte145 = (byte) arg4;
		this.aShort127 = (short) arg5;
		super.anInt11208 = arg1;
		super.anInt11211 = arg2;
		super.anInt11204 = arg0;
		super.aByte146 = (byte) arg3;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZLclient!ha;)Z")
	@Override
	public final boolean method9370(@OriginalArg(1) Class67 arg0) {
		return Static148.method2427(super.anInt11204 >> Static394.anInt7067, super.aByte145, super.anInt11211 >> Static394.anInt7067, this);
	}

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method9365() {
		return Static624.aBooleanArrayArray7[Static726.anInt11312 + (super.anInt11204 >> Static394.anInt7067) - Static296.anInt3655][(super.anInt11211 >> Static394.anInt7067) + Static726.anInt11312 - Static450.anInt7928];
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "([Lclient!vj;B)I")
	@Override
	public final int method9376(@OriginalArg(0) Class3_Sub16[] arg0) {
		@Pc(16) int local16 = super.anInt11204 >> Static394.anInt7067;
		@Pc(21) int local21 = super.anInt11211 >> Static394.anInt7067;
		@Pc(23) int local23 = 0;
		if (Static296.anInt3655 == local16) {
			local23++;
		} else if (local16 > Static296.anInt3655) {
			local23 += 2;
		}
		if (local21 == Static450.anInt7928) {
			local23 += 3;
		} else if (Static450.anInt7928 > local21) {
			local23 += 6;
		}
		@Pc(63) int local63 = Static429.anIntArray406[local23];
		if ((this.aShort127 & local63) != 0) {
			return this.method9375(local16, arg0, local21);
		} else if (this.aShort127 == 1 && local16 > 0) {
			return this.method9375(local16 - 1, arg0, local21);
		} else if (this.aShort127 == 4 && local16 <= Static509.anInt8656) {
			return this.method9375(local16 + 1, arg0, local21);
		} else if (this.aShort127 == 8 && local21 > 0) {
			return this.method9375(local16, arg0, local21 - 1);
		} else if (this.aShort127 == 2 && Static164.anInt3059 >= local21) {
			return this.method9375(local16, arg0, local21 + 1);
		} else if (this.aShort127 == 16 && local16 > 0 && Static164.anInt3059 >= local21) {
			return this.method9375(local16 - 1, arg0, local21 + 1);
		} else if (this.aShort127 == 32 && Static509.anInt8656 >= local16 && local21 <= Static164.anInt3059) {
			return this.method9375(local16 + 1, arg0, local21 + 1);
		} else if (this.aShort127 == 128 && local16 > 0 && local21 > 0) {
			return this.method9375(local16 - 1, arg0, local21 - 1);
		} else if (this.aShort127 == 64 && Static509.anInt8656 >= local16 && local21 > 0) {
			return this.method9375(local16 + 1, arg0, local21 - 1);
		} else {
			throw new RuntimeException("");
		}
	}
}

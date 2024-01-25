import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public abstract class Class9_Sub1_Sub4 extends Class9_Sub1 {

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "S")
	public final short aShort103;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIII)V")
	protected Class9_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte126 = (byte) arg3;
		this.aShort103 = (short) arg5;
		super.anInt8977 = arg1;
		super.anInt8975 = arg0;
		super.aByte125 = (byte) arg4;
		super.anInt8980 = arg2;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7475() {
		return Static356.aBooleanArrayArray5[(super.anInt8975 >> Static458.anInt7508) + Static266.anInt4982 - Static210.anInt4205][(super.anInt8980 >> Static458.anInt7508) + Static266.anInt4982 - Static12.anInt136];
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7484() {
		return Static471.method6496(this, super.anInt8980 >> Static458.anInt7508, super.aByte125, super.anInt8975 >> Static458.anInt7508);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lclient!ff;B)I")
	@Override
	public final int method7468(@OriginalArg(0) Class3_Sub22[] arg0) {
		@Pc(10) int local10 = super.anInt8975 >> Static458.anInt7508;
		@Pc(15) int local15 = super.anInt8980 >> Static458.anInt7508;
		@Pc(25) int local25 = 0;
		if (local10 == Static210.anInt4205) {
			local25++;
		} else if (local10 > Static210.anInt4205) {
			local25 += 2;
		}
		if (local15 == Static12.anInt136) {
			local25 += 3;
		} else if (local15 < Static12.anInt136) {
			local25 += 6;
		}
		@Pc(49) int local49 = Static517.anIntArray626[local25];
		if ((this.aShort103 & local49) != 0) {
			return this.method7470(local15, arg0, local10);
		} else if (this.aShort103 == 1 && local10 > 0) {
			return this.method7470(local15, arg0, local10 - 1);
		} else if (this.aShort103 == 4 && Static411.anInt6927 >= local10) {
			return this.method7470(local15, arg0, local10 + 1);
		} else if (this.aShort103 == 8 && local15 > 0) {
			return this.method7470(local15 - 1, arg0, local10);
		} else if (this.aShort103 == 2 && Static157.anInt3168 >= local15) {
			return this.method7470(local15 + 1, arg0, local10);
		} else if (this.aShort103 == 16 && local10 > 0 && local15 <= Static157.anInt3168) {
			return this.method7470(local15 + 1, arg0, local10 - 1);
		} else if (this.aShort103 == 32 && Static411.anInt6927 >= local10 && Static157.anInt3168 >= local15) {
			return this.method7470(local15 + 1, arg0, local10 + 1);
		} else if (this.aShort103 == 128 && local10 > 0 && local15 > 0) {
			return this.method7470(local15 - 1, arg0, local10 - 1);
		} else if (this.aShort103 == 64 && local10 <= Static411.anInt6927 && local15 > 0) {
			return this.method7470(local15 - 1, arg0, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}
}

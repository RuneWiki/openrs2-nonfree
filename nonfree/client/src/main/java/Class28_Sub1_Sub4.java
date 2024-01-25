import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public abstract class Class28_Sub1_Sub4 extends Class28_Sub1 {

	@OriginalMember(owner = "client!kp", name = "H", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIII)V")
	protected Class28_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10729 = arg0;
		this.aShort104 = (short) arg5;
		super.aByte174 = (byte) arg3;
		super.anInt10731 = arg2;
		super.aByte173 = (byte) arg4;
		super.anInt10722 = arg1;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9295(@OriginalArg(1) Class13 arg0) {
		return Static265.method4369(super.anInt10731 >> Static391.anInt10262, super.anInt10729 >> Static391.anInt10262, super.aByte173, this);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B[Lclient!uca;)I")
	@Override
	public final int method9298(@OriginalArg(1) Class3_Sub15[] arg0) {
		@Pc(15) int local15 = super.anInt10729 >> Static391.anInt10262;
		@Pc(20) int local20 = super.anInt10731 >> Static391.anInt10262;
		@Pc(22) int local22 = 0;
		if (Static220.anInt4183 == local15) {
			local22++;
		} else if (Static220.anInt4183 < local15) {
			local22 += 2;
		}
		if (Static547.anInt8968 == local20) {
			local22 += 3;
		} else if (local20 < Static547.anInt8968) {
			local22 += 6;
		}
		@Pc(58) int local58 = Static646.anIntArray902[local22];
		if ((local58 & this.aShort104) != 0) {
			return this.method9279(local20, arg0, local15);
		} else if (this.aShort104 == 1 && local15 > 0) {
			return this.method9279(local20, arg0, local15 - 1);
		} else if (this.aShort104 == 4 && Static146.anInt2951 >= local15) {
			return this.method9279(local20, arg0, local15 + 1);
		} else if (this.aShort104 == 8 && local20 > 0) {
			return this.method9279(local20 - 1, arg0, local15);
		} else if (this.aShort104 == 2 && local20 <= Static602.anInt9668) {
			return this.method9279(local20 + 1, arg0, local15);
		} else if (this.aShort104 == 16 && local15 > 0 && Static602.anInt9668 >= local20) {
			return this.method9279(local20 + 1, arg0, local15 - 1);
		} else if (this.aShort104 == 32 && local15 <= Static146.anInt2951 && Static602.anInt9668 >= local20) {
			return this.method9279(local20 + 1, arg0, local15 + 1);
		} else if (this.aShort104 == 128 && local15 > 0 && local20 > 0) {
			return this.method9279(local20 - 1, arg0, local15 - 1);
		} else if (this.aShort104 == 64 && local15 <= Static146.anInt2951 && local20 > 0) {
			return this.method9279(local20 - 1, arg0, local15 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9280() {
		return Static430.aBooleanArrayArray7[(super.anInt10729 >> Static391.anInt10262) + Static7.anInt94 - Static220.anInt4183][(super.anInt10731 >> Static391.anInt10262) - (Static547.anInt8968 - Static7.anInt94)];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public abstract class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "S")
	public final short aShort98;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(IIIIII)V")
	protected Class6_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt8759 = arg1;
		super.anInt8764 = arg2;
		super.aByte112 = (byte) arg3;
		this.aShort98 = (short) arg5;
		super.anInt8761 = arg0;
		super.aByte111 = (byte) arg4;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "([Lclient!gga;I)I")
	@Override
	public final int method7315(@OriginalArg(0) Class2_Sub14[] arg0) {
		@Pc(10) int local10 = super.anInt8761 >> Static134.anInt2822;
		@Pc(23) int local23 = super.anInt8764 >> Static134.anInt2822;
		@Pc(25) int local25 = 0;
		if (local10 == Static350.anInt6287) {
			local25++;
		} else if (Static350.anInt6287 < local10) {
			local25 += 2;
		}
		if (Static148.anInt3061 == local23) {
			local25 += 3;
		} else if (Static148.anInt3061 > local23) {
			local25 += 6;
		}
		@Pc(57) int local57 = Static491.anIntArray411[local25];
		if ((local57 & this.aShort98) != 0) {
			return this.method7321(arg0, local10, local23);
		} else if (this.aShort98 == 1 && local10 > 0) {
			return this.method7321(arg0, local10 - 1, local23);
		} else if (this.aShort98 == 4 && Static496.anInt8369 >= local10) {
			return this.method7321(arg0, local10 + 1, local23);
		} else if (this.aShort98 == 8 && local23 > 0) {
			return this.method7321(arg0, local10, local23 - 1);
		} else if (this.aShort98 == 2 && Static357.anInt6390 >= local23) {
			return this.method7321(arg0, local10, local23 + 1);
		} else if (this.aShort98 == 16 && local10 > 0 && local23 <= Static357.anInt6390) {
			return this.method7321(arg0, local10 - 1, local23 + 1);
		} else if (this.aShort98 == 32 && local10 <= Static496.anInt8369 && local23 <= Static357.anInt6390) {
			return this.method7321(arg0, local10 + 1, local23 + 1);
		} else if (this.aShort98 == 128 && local10 > 0 && local23 > 0) {
			return this.method7321(arg0, local10 - 1, local23 + -1);
		} else if (this.aShort98 == 64 && Static496.anInt8369 >= local10 && local23 > 0) {
			return this.method7321(arg0, local10 + 1, local23 + -1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7327() {
		return Static557.aBooleanArrayArray9[Static74.anInt1648 + (super.anInt8761 >> Static134.anInt2822) - Static350.anInt6287][Static74.anInt1648 + (super.anInt8764 >> Static134.anInt2822) - Static148.anInt3061];
	}

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7320() {
		return Static156.method7054(super.aByte111, super.anInt8764 >> Static134.anInt2822, super.anInt8761 >> Static134.anInt2822, this);
	}
}

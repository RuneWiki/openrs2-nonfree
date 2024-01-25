import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public abstract class Class20_Sub2_Sub1 extends Class20_Sub2 {

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "S")
	public final short aShort112;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIII)V")
	protected Class20_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte130 = (byte) arg4;
		this.aShort112 = (short) arg5;
		super.anInt10724 = arg1;
		super.anInt10729 = arg2;
		super.anInt10725 = arg0;
		super.aByte131 = (byte) arg3;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9015(@OriginalArg(0) Class100 arg0) {
		return Static134.method2185(super.aByte130, super.anInt10725 >> Static643.anInt10682, super.anInt10729 >> Static643.anInt10682, this);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[Lclient!raa;)I")
	@Override
	public final int method9008(@OriginalArg(1) Class6_Sub1[] arg0) {
		@Pc(10) int local10 = super.anInt10725 >> Static643.anInt10682;
		@Pc(15) int local15 = super.anInt10729 >> Static643.anInt10682;
		@Pc(17) int local17 = 0;
		if (Static162.anInt3371 == local10) {
			local17++;
		} else if (local10 > Static162.anInt3371) {
			local17 += 2;
		}
		if (local15 == Static313.anInt5975) {
			local17 += 3;
		} else if (local15 < Static313.anInt5975) {
			local17 += 6;
		}
		@Pc(62) int local62 = Static467.anIntArray516[local17];
		if ((local62 & this.aShort112) != 0) {
			return this.method9009(local15, arg0, local10);
		} else if (this.aShort112 == 1 && local10 > 0) {
			return this.method9009(local15, arg0, local10 - 1);
		} else if (this.aShort112 == 4 && local10 <= Static544.anInt9353) {
			return this.method9009(local15, arg0, local10 + 1);
		} else if (this.aShort112 == 8 && local15 > 0) {
			return this.method9009(local15 - 1, arg0, local10);
		} else if (this.aShort112 == 2 && local15 <= Static608.anInt10072) {
			return this.method9009(local15 + 1, arg0, local10);
		} else if (this.aShort112 == 16 && local10 > 0 && Static608.anInt10072 >= local15) {
			return this.method9009(local15 + 1, arg0, local10 - 1);
		} else if (this.aShort112 == 32 && Static544.anInt9353 >= local10 && local15 <= Static608.anInt10072) {
			return this.method9009(local15 + 1, arg0, local10 + 1);
		} else if (this.aShort112 == 128 && local10 > 0 && local15 > 0) {
			return this.method9009(local15 - 1, arg0, local10 - 1);
		} else if (this.aShort112 == 64 && local10 <= Static544.anInt9353 && local15 > 0) {
			return this.method9009(local15 - 1, arg0, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method9010() {
		return Static460.aBooleanArrayArray6[(super.anInt10725 >> Static643.anInt10682) + Static197.anInt10372 - Static162.anInt3371][Static197.anInt10372 + (super.anInt10729 >> Static643.anInt10682) - Static313.anInt5975];
	}
}

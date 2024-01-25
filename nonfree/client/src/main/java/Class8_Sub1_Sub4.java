import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public abstract class Class8_Sub1_Sub4 extends Class8_Sub1 {

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIII)V")
	protected Class8_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort79 = (short) arg5;
		super.aByte146 = (byte) arg4;
		super.anInt10357 = arg1;
		super.aByte145 = (byte) arg3;
		super.anInt10363 = arg2;
		super.anInt10355 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8905() {
		return Static300.aBooleanArrayArray6[(super.anInt10355 >> Static611.anInt10115) + Static28.anInt9243 - Static128.anInt7021][Static28.anInt9243 + (super.anInt10363 >> Static611.anInt10115) - Static97.anInt1574];
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8896(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		return arg0 == -10204 ? Static194.method2800(super.anInt10363 >> Static611.anInt10115, super.anInt10355 >> Static611.anInt10115, super.aByte146, this) : false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!uf;Z)I")
	@Override
	public final int method8902(@OriginalArg(0) Class5_Sub43[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) int local10 = super.anInt10355 >> Static611.anInt10115;
		@Pc(15) int local15 = super.anInt10363 >> Static611.anInt10115;
		@Pc(17) int local17 = 0;
		if (Static128.anInt7021 == local10) {
			local17++;
		} else if (Static128.anInt7021 < local10) {
			local17 += 2;
		}
		if (Static97.anInt1574 == local15) {
			local17 += 3;
		} else if (local15 < Static97.anInt1574) {
			local17 += 6;
		}
		if (!arg1) {
			return -18;
		}
		@Pc(67) int local67 = Static49.anIntArray386[local17];
		if ((this.aShort79 & local67) != 0) {
			return this.method8910(arg0, local10, local15);
		} else if (this.aShort79 == 1 && local10 > 0) {
			return this.method8910(arg0, local10 - 1, local15);
		} else if (this.aShort79 == 4 && Static328.anInt5870 >= local10) {
			return this.method8910(arg0, local10 + 1, local15);
		} else if (this.aShort79 == 8 && local15 > 0) {
			return this.method8910(arg0, local10, local15 - 1);
		} else if (this.aShort79 == 2 && Static526.anInt8863 >= local15) {
			return this.method8910(arg0, local10, local15 + 1);
		} else if (this.aShort79 == 16 && local10 > 0 && local15 <= Static526.anInt8863) {
			return this.method8910(arg0, local10 - 1, local15 + 1);
		} else if (this.aShort79 == 32 && Static328.anInt5870 >= local10 && local15 <= Static526.anInt8863) {
			return this.method8910(arg0, local10 + 1, local15 + 1);
		} else if (this.aShort79 == 128 && local10 > 0 && local15 > 0) {
			return this.method8910(arg0, local10 - 1, local15 + -1);
		} else if (this.aShort79 == 64 && Static328.anInt5870 >= local10 && local15 > 0) {
			return this.method8910(arg0, local10 + 1, local15 + -1);
		} else {
			throw new RuntimeException("");
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public abstract class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qfa", name = "B", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IIIIII)V")
	protected Class3_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10303 = arg0;
		super.anInt10306 = arg1;
		super.aByte131 = (byte) arg4;
		super.anInt10310 = arg2;
		super.aByte132 = (byte) arg3;
		this.aShort62 = (short) arg5;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "([Lclient!ab;I)I")
	@Override
	public final int method8608(@OriginalArg(0) Class2_Sub1[] arg0) {
		@Pc(10) int local10 = super.anInt10303 >> Static151.anInt3896;
		@Pc(15) int local15 = super.anInt10310 >> Static151.anInt3896;
		@Pc(25) int local25 = 0;
		if (local10 == Static120.anInt3199) {
			local25++;
		} else if (local10 > Static120.anInt3199) {
			local25 += 2;
		}
		if (local15 == Static360.anInt7144) {
			local25 += 3;
		} else if (local15 < Static360.anInt7144) {
			local25 += 6;
		}
		@Pc(57) int local57 = Static254.anIntArray537[local25];
		if ((this.aShort62 & local57) != 0) {
			return this.method8614(arg0, local10, local15);
		} else if (this.aShort62 == 1 && local10 > 0) {
			return this.method8614(arg0, local10 - 1, local15);
		} else if (this.aShort62 == 4 && local10 <= Static477.anInt8929) {
			return this.method8614(arg0, local10 + 1, local15);
		} else if (this.aShort62 == 8 && local15 > 0) {
			return this.method8614(arg0, local10, local15 - 1);
		} else if (this.aShort62 == 2 && Static562.anInt10128 >= local15) {
			return this.method8614(arg0, local10, local15 + 1);
		} else if (this.aShort62 == 16 && local10 > 0 && local15 <= Static562.anInt10128) {
			return this.method8614(arg0, local10 - 1, local15 + 1);
		} else if (this.aShort62 == 32 && Static477.anInt8929 >= local10 && Static562.anInt10128 >= local15) {
			return this.method8614(arg0, local10 + 1, local15 + 1);
		} else if (this.aShort62 == 128 && local10 > 0 && local15 > 0) {
			return this.method8614(arg0, local10 - 1, local15 - 1);
		} else if (this.aShort62 == 64 && Static477.anInt8929 >= local10 && local15 > 0) {
			return this.method8614(arg0, local10 + 1, local15 + -1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8606() {
		return Static128.method3007(super.anInt10310 >> Static151.anInt3896, super.anInt10303 >> Static151.anInt3896, super.aByte131, this);
	}

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		return Static342.aBooleanArrayArray6[(super.anInt10303 >> Static151.anInt3896) + Static177.anInt4273 - Static120.anInt3199][Static177.anInt4273 + (super.anInt10310 >> Static151.anInt3896) - Static360.anInt7144];
	}
}

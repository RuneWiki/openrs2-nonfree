import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public abstract class Class9_Sub4_Sub5 extends Class9_Sub4 {

	@OriginalMember(owner = "client!jn", name = "J", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIIII)V")
	protected Class9_Sub4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort128 = (short) arg5;
		super.anInt10360 = arg0;
		super.aByte135 = (byte) arg3;
		super.aByte134 = (byte) arg4;
		super.anInt10365 = arg1;
		super.anInt10357 = arg2;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[Lclient!cba;)I")
	@Override
	public final int method8415(@OriginalArg(1) Class6_Sub10[] arg0) {
		@Pc(10) int local10 = super.anInt10360 >> Static606.anInt10280;
		@Pc(15) int local15 = super.anInt10357 >> Static606.anInt10280;
		@Pc(17) int local17 = 0;
		if (local10 == Static427.anInt7834) {
			local17++;
		} else if (Static427.anInt7834 < local10) {
			local17 += 2;
		}
		if (Static594.anInt10050 == local15) {
			local17 += 3;
		} else if (local15 < Static594.anInt10050) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static427.anIntArray410[local17];
		if ((this.aShort128 & local49) != 0) {
			return this.method8424(local10, arg0, local15);
		} else if (this.aShort128 == 1 && local10 > 0) {
			return this.method8424(local10 - 1, arg0, local15);
		} else if (this.aShort128 == 4 && local10 <= Static623.anInt10485) {
			return this.method8424(local10 + 1, arg0, local15);
		} else if (this.aShort128 == 8 && local15 > 0) {
			return this.method8424(local10, arg0, local15 - 1);
		} else if (this.aShort128 == 2 && Static142.anInt3372 >= local15) {
			return this.method8424(local10, arg0, local15 + 1);
		} else if (this.aShort128 == 16 && local10 > 0 && local15 <= Static142.anInt3372) {
			return this.method8424(local10 - 1, arg0, local15 + 1);
		} else if (this.aShort128 == 32 && Static623.anInt10485 >= local10 && Static142.anInt3372 >= local15) {
			return this.method8424(local10 + 1, arg0, local15 + 1);
		} else if (this.aShort128 == 128 && local10 > 0 && local15 > 0) {
			return this.method8424(local10 - 1, arg0, local15 - 1);
		} else if (this.aShort128 == 64 && local10 <= Static623.anInt10485 && local15 > 0) {
			return this.method8424(local10 + 1, arg0, local15 - 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method8426() {
		return Static137.aBooleanArrayArray1[(super.anInt10360 >> Static606.anInt10280) + (Static456.anInt8195 - Static427.anInt7834)][(super.anInt10357 >> Static606.anInt10280) + Static456.anInt8195 - Static594.anInt10050];
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8412(@OriginalArg(0) Class5 arg0) {
		return Static180.method3383(super.aByte134, super.anInt10360 >> Static606.anInt10280, super.anInt10357 >> Static606.anInt10280, this);
	}
}

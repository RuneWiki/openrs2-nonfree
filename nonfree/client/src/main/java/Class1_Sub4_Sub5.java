import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public abstract class Class1_Sub4_Sub5 extends Class1_Sub4 {

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "S")
	public final short aShort92;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIII)V")
	protected Class1_Sub4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte127 = (byte) arg4;
		super.anInt9935 = arg2;
		super.anInt9932 = arg1;
		super.anInt9934 = arg0;
		super.aByte126 = (byte) arg3;
		this.aShort92 = (short) arg5;
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method8126() {
		return Static522.aBooleanArrayArray18[(super.anInt9934 >> Static145.anInt3093) + Static579.anInt10075 - Static26.anInt403][(super.anInt9935 >> Static145.anInt3093) + (Static579.anInt10075 - Static528.anInt9392)];
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([Lclient!ul;I)I")
	@Override
	public final int method8129(@OriginalArg(0) Class4_Sub24[] arg0) {
		@Pc(10) int local10 = super.anInt9934 >> Static145.anInt3093;
		@Pc(15) int local15 = super.anInt9935 >> Static145.anInt3093;
		@Pc(17) int local17 = 0;
		if (Static26.anInt403 == local10) {
			local17++;
		} else if (local10 > Static26.anInt403) {
			local17 += 2;
		}
		if (Static528.anInt9392 == local15) {
			local17 += 3;
		} else if (local15 < Static528.anInt9392) {
			local17 += 6;
		}
		@Pc(53) int local53 = Static483.anIntArray480[local17];
		if ((this.aShort92 & local53) != 0) {
			return this.method8119(arg0, local15, local10);
		} else if (this.aShort92 == 1 && local10 > 0) {
			return this.method8119(arg0, local15, local10 - 1);
		} else if (this.aShort92 == 4 && Static182.anInt3633 >= local10) {
			return this.method8119(arg0, local15, local10 + 1);
		} else if (this.aShort92 == 8 && local15 > 0) {
			return this.method8119(arg0, local15 - 1, local10);
		} else if (this.aShort92 == 2 && Static253.anInt4651 >= local15) {
			return this.method8119(arg0, local15 + 1, local10);
		} else if (this.aShort92 == 16 && local10 > 0 && local15 <= Static253.anInt4651) {
			return this.method8119(arg0, local15 + 1, local10 + -1);
		} else if (this.aShort92 == 32 && local10 <= Static182.anInt3633 && Static253.anInt4651 >= local15) {
			return this.method8119(arg0, local15 + 1, local10 + 1);
		} else if (this.aShort92 == 128 && local10 > 0 && local15 > 0) {
			return this.method8119(arg0, local15 - 1, local10 + -1);
		} else if (this.aShort92 == 64 && local10 <= Static182.anInt3633 && local15 > 0) {
			return this.method8119(arg0, local15 - 1, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8115() {
		return Static33.method447(this, super.anInt9935 >> Static145.anInt3093, super.anInt9934 >> Static145.anInt3093, super.aByte127);
	}
}

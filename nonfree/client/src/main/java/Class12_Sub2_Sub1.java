import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public abstract class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!eba", name = "E", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(IIIIII)V")
	protected Class12_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort94 = (short) arg5;
		super.anInt11002 = arg2;
		super.aByte146 = (byte) arg3;
		super.aByte145 = (byte) arg4;
		super.anInt10997 = arg1;
		super.anInt10998 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9155(@OriginalArg(1) Class137 arg0) {
		return Static46.method966(this, super.anInt11002 >> Static579.anInt9935, super.aByte145, super.anInt10998 >> Static579.anInt9935);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[Lclient!qm;)I")
	@Override
	public final int method9165(@OriginalArg(1) Class14_Sub37[] arg0) {
		@Pc(10) int local10 = super.anInt10998 >> Static579.anInt9935;
		@Pc(15) int local15 = super.anInt11002 >> Static579.anInt9935;
		@Pc(17) int local17 = 0;
		if (local10 == Static358.anInt6609) {
			local17++;
		} else if (Static358.anInt6609 < local10) {
			local17 += 2;
		}
		if (Static297.anInt5235 == local15) {
			local17 += 3;
		} else if (Static297.anInt5235 > local15) {
			local17 += 6;
		}
		@Pc(46) int local46 = Static25.anIntArray28[local17];
		if ((this.aShort94 & local46) != 0) {
			return this.method9168(local15, arg0, local10);
		} else if (this.aShort94 == 1 && local10 > 0) {
			return this.method9168(local15, arg0, local10 - 1);
		} else if (this.aShort94 == 4 && Static28.anInt704 >= local10) {
			return this.method9168(local15, arg0, local10 + 1);
		} else if (this.aShort94 == 8 && local15 > 0) {
			return this.method9168(local15 - 1, arg0, local10);
		} else if (this.aShort94 == 2 && Static55.anInt1384 >= local15) {
			return this.method9168(local15 + 1, arg0, local10);
		} else if (this.aShort94 == 16 && local10 > 0 && local15 <= Static55.anInt1384) {
			return this.method9168(local15 + 1, arg0, local10 - 1);
		} else if (this.aShort94 == 32 && local10 <= Static28.anInt704 && Static55.anInt1384 >= local15) {
			return this.method9168(local15 + 1, arg0, local10 + 1);
		} else if (this.aShort94 == 128 && local10 > 0 && local15 > 0) {
			return this.method9168(local15 - 1, arg0, local10 - 1);
		} else if (this.aShort94 == 64 && Static28.anInt704 >= local10 && local15 > 0) {
			return this.method9168(local15 - 1, arg0, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9167() {
		return Static255.aBooleanArrayArray2[(super.anInt10998 >> Static579.anInt9935) + Static64.anInt1476 - Static358.anInt6609][(super.anInt11002 >> Static579.anInt9935) + Static64.anInt1476 - Static297.anInt5235];
	}
}

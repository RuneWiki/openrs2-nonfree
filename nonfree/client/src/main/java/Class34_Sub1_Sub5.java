import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public abstract class Class34_Sub1_Sub5 extends Class34_Sub1 {

	@OriginalMember(owner = "client!iga", name = "B", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(IIIIII)V")
	protected Class34_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9622 = arg1;
		super.aByte132 = (byte) arg3;
		super.anInt9619 = arg2;
		this.aShort53 = (short) arg5;
		super.aByte131 = (byte) arg4;
		super.anInt9614 = arg0;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lclient!ha;Z)Z")
	@Override
	public final boolean method7852(@OriginalArg(0) Class95 arg0) {
		return Static678.method9024(super.aByte131, this, super.anInt9619 >> Static571.anInt9216, super.anInt9614 >> Static571.anInt9216);
	}

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7836() {
		return Static375.aBooleanArrayArray6[Static362.anInt6205 + (super.anInt9614 >> Static571.anInt9216) - Static88.anInt1826][(super.anInt9619 >> Static571.anInt9216) + Static362.anInt6205 - Static353.anInt6041];
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(B[Lclient!uaa;)I")
	@Override
	public final int method7851(@OriginalArg(1) Class3_Sub13[] arg0) {
		@Pc(10) int local10 = super.anInt9614 >> Static571.anInt9216;
		@Pc(15) int local15 = super.anInt9619 >> Static571.anInt9216;
		@Pc(17) int local17 = 0;
		if (Static88.anInt1826 == local10) {
			local17++;
		} else if (Static88.anInt1826 < local10) {
			local17 += 2;
		}
		if (local15 == Static353.anInt6041) {
			local17 += 3;
		} else if (Static353.anInt6041 > local15) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static417.anIntArray355[local17];
		if ((local49 & this.aShort53) != 0) {
			return this.method7838(local15, arg0, local10);
		} else if (this.aShort53 == 1 && local10 > 0) {
			return this.method7838(local15, arg0, local10 - 1);
		} else if (this.aShort53 == 4 && Static133.anInt2551 >= local10) {
			return this.method7838(local15, arg0, local10 + 1);
		} else if (this.aShort53 == 8 && local15 > 0) {
			return this.method7838(local15 - 1, arg0, local10);
		} else if (this.aShort53 == 2 && Static155.anInt2874 >= local15) {
			return this.method7838(local15 + 1, arg0, local10);
		} else if (this.aShort53 == 16 && local10 > 0 && local15 <= Static155.anInt2874) {
			return this.method7838(local15 + 1, arg0, local10 - 1);
		} else if (this.aShort53 == 32 && Static133.anInt2551 >= local10 && Static155.anInt2874 >= local15) {
			return this.method7838(local15 + 1, arg0, local10 + 1);
		} else if (this.aShort53 == 128 && local10 > 0 && local15 > 0) {
			return this.method7838(local15 - 1, arg0, local10 - 1);
		} else if (this.aShort53 == 64 && Static133.anInt2551 >= local10 && local15 > 0) {
			return this.method7838(local15 - 1, arg0, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}
}

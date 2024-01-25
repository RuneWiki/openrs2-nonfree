import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public abstract class Class41_Sub2_Sub3 extends Class41_Sub2 {

	@OriginalMember(owner = "client!hfa", name = "E", descriptor = "S")
	public final short aShort141;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(IIIIII)V")
	protected Class41_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9442 = arg2;
		super.anInt9443 = arg1;
		this.aShort141 = (short) arg5;
		super.aByte118 = (byte) arg4;
		super.anInt9444 = arg0;
		super.aByte117 = (byte) arg3;
	}

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method7841() {
		return Static16.method242(super.anInt9444 >> Static315.anInt5369, this, super.aByte118, super.anInt9442 >> Static315.anInt5369);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I[Lclient!eq;)I")
	@Override
	public final int method7846(@OriginalArg(1) Class3_Sub10[] arg0) {
		@Pc(10) int local10 = super.anInt9444 >> Static315.anInt5369;
		@Pc(15) int local15 = super.anInt9442 >> Static315.anInt5369;
		@Pc(17) int local17 = 0;
		if (local10 == Static5.anInt120) {
			local17++;
		} else if (local10 > Static5.anInt120) {
			local17 += 2;
		}
		if (Static394.anInt6891 == local15) {
			local17 += 3;
		} else if (Static394.anInt6891 > local15) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static258.anIntArray469[local17];
		if ((this.aShort141 & local49) != 0) {
			return this.method7848(local10, local15, arg0);
		} else if (this.aShort141 == 1 && local10 > 0) {
			return this.method7848(local10 - 1, local15, arg0);
		} else if (this.aShort141 == 4 && Static155.anInt3254 >= local10) {
			return this.method7848(local10 + 1, local15, arg0);
		} else if (this.aShort141 == 8 && local15 > 0) {
			return this.method7848(local10, local15 - 1, arg0);
		} else if (this.aShort141 == 2 && local15 <= Static39.anInt747) {
			return this.method7848(local10, local15 + 1, arg0);
		} else if (this.aShort141 == 16 && local10 > 0 && Static39.anInt747 >= local15) {
			return this.method7848(local10 - 1, local15 + 1, arg0);
		} else if (this.aShort141 == 32 && Static155.anInt3254 >= local10 && local15 <= Static39.anInt747) {
			return this.method7848(local10 + 1, local15 - -1, arg0);
		} else if (this.aShort141 == 128 && local10 > 0 && local15 > 0) {
			return this.method7848(local10 - 1, local15 + -1, arg0);
		} else if (this.aShort141 == 64 && local10 <= Static155.anInt3254 && local15 > 0) {
			return this.method7848(local10 + 1, local15 - 1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7837() {
		return Static562.aBooleanArrayArray7[Static453.anInt7589 + (super.anInt9444 >> Static315.anInt5369) - Static5.anInt120][Static453.anInt7589 + (super.anInt9442 >> Static315.anInt5369) - Static394.anInt6891];
	}
}

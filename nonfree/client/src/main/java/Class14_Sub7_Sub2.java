import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class14_Sub7_Sub2 extends Class14_Sub7 {

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "[J")
	public static final long[] aLongArray5 = new long[256];

	static {
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(29) long local29 = (long) local25;
			for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
				if ((local29 & 0x1L) == 1L) {
					local29 = local29 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local29 >>>= 0x1;
				}
			}
			aLongArray5[local25] = local29;
		}
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(26) int local26 = Static655.anIntArray573[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static613.anInt10114; local28++) {
				local18[local28] = this.method920(Static588.anIntArray506[local28], local26) % 4096;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(III)I")
	private int method920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(25) int local25 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local25 * (local25 * 15731 * local25 + 789221) + 1376312589) / 262144;
	}
}

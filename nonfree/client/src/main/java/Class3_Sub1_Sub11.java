import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "[J")
	public static final long[] aLongArray3;

	static {
		new Class57("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
		aLongArray3 = new long[256];
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(38) long local38 = (long) local34;
			for (@Pc(40) int local40 = 0; local40 < 8; local40++) {
				if ((local38 & 0x1L) == 1L) {
					local38 = local38 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local38 >>>= 0x1;
				}
			}
			aLongArray3[local34] = local38;
		}
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		return Static187.anIntArray379;
	}
}

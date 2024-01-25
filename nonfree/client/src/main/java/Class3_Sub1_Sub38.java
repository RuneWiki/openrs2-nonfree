import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class3_Sub1_Sub38 extends Class3_Sub1 {

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	private int anInt9826 = 4;

	@OriginalMember(owner = "client!va", name = "M", descriptor = "I")
	private int anInt9829 = 4;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(27) int local27 = Static131.anInt2935 / this.anInt9826;
			@Pc(32) int local32 = Static331.anInt6903 / this.anInt9829;
			@Pc(51) int[] local51;
			@Pc(41) int local41;
			if (local32 > 0) {
				local41 = arg0 % local32;
				local51 = this.method8362(Static331.anInt6903 * local41 / local32, 0);
			} else {
				local51 = this.method8362(0, 0);
			}
			for (local41 = 0; local41 < Static131.anInt2935; local41++) {
				if (local27 <= 0) {
					local11[local41] = local51[0];
				} else {
					@Pc(77) int local77 = local41 % local27;
					local11[local41] = local51[local77 * Static131.anInt2935 / local27];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(28) int local28 = Static131.anInt2935 / this.anInt9826;
			@Pc(33) int local33 = Static331.anInt6903 / this.anInt9829;
			@Pc(52) int[][] local52;
			if (local33 > 0) {
				@Pc(42) int local42 = arg0 % local33;
				local52 = this.method8360(0, Static331.anInt6903 * local42 / local33);
			} else {
				local52 = this.method8360(0, 0);
			}
			@Pc(64) int[] local64 = local52[0];
			@Pc(68) int[] local68 = local52[1];
			@Pc(72) int[] local72 = local52[2];
			@Pc(76) int[] local76 = local11[0];
			@Pc(80) int[] local80 = local11[1];
			@Pc(84) int[] local84 = local11[2];
			for (@Pc(86) int local86 = 0; local86 < Static131.anInt2935; local86++) {
				@Pc(92) int local92;
				if (local28 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local86 % local28;
					local92 = Static131.anInt2935 * local98 / local28;
				}
				local76[local86] = local64[local92];
				local80[local86] = local68[local92];
				local84[local86] = local72[local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt9826 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt9829 = arg1.method6538();
		}
	}
}

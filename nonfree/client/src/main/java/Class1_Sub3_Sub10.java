import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dda", name = "D", descriptor = "I")
	private int anInt2163 = 1;

	@OriginalMember(owner = "client!dda", name = "H", descriptor = "I")
	private int anInt2167 = 0;

	@OriginalMember(owner = "client!dda", name = "I", descriptor = "I")
	private int anInt2168 = 0;

	static {
		new Class114("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2168 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt2167 = arg0.method3043();
		} else if (arg1 == 3) {
			this.anInt2163 = arg0.method3043();
		}
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		Static401.method6051();
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(26) int local26 = Static305.anIntArray416[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static236.anInt4609; local34++) {
				@Pc(40) int local40 = Static201.anIntArray324[local34];
				@Pc(46) int local46 = local40 - 2048 >> 1;
				@Pc(60) int local60;
				if (this.anInt2168 == 0) {
					local60 = (local40 - local26) * this.anInt2163;
				} else {
					@Pc(72) int local72 = local32 * local32 + local46 * local46 >> 12;
					local60 = (int) (Math.sqrt((double) ((float) local72 / 4096.0F)) * 4096.0D);
					local60 = (int) ((double) (local60 * this.anInt2163) * 3.141592653589793D);
				}
				local60 -= local60 & 0xFFFFF000;
				if (this.anInt2167 == 0) {
					local60 = Static510.anIntArray737[local60 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2167 == 2) {
					local60 -= 2048;
					if (local60 < 0) {
						local60 = -local60;
					}
					local60 = 2048 - local60 << 1;
				}
				local13[local34] = local60;
			}
		}
		return local13;
	}
}

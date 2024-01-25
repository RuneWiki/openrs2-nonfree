import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mt", name = "H", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[16384];

	@OriginalMember(owner = "client!mt", name = "I", descriptor = "[F")
	public static final float[] aFloatArray47 = new float[16384];

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
	private int anInt6456 = 1;

	@OriginalMember(owner = "client!mt", name = "L", descriptor = "I")
	private int anInt6458 = 0;

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
	private int anInt6459 = 0;

	static {
		@Pc(74) double local74 = 3.834951969714103E-4D;
		for (@Pc(76) int local76 = 0; local76 < 16384; local76++) {
			aFloatArray46[local76] = (float) Math.sin(local74 * (double) local76);
			aFloatArray47[local76] = (float) Math.cos((double) local76 * local74);
		}
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		Static561.method7327();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(26) int local26 = Static121.anIntArray145[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static379.anInt5859; local34++) {
				@Pc(40) int local40 = Static497.anIntArray579[local34];
				@Pc(46) int local46 = local40 - 2048 >> 1;
				@Pc(69) int local69;
				if (this.anInt6459 == 0) {
					local69 = this.anInt6456 * (local40 - local26);
				} else {
					@Pc(59) int local59 = local32 * local32 + local46 * local46 >> 12;
					local69 = (int) (Math.sqrt((double) ((float) local59 / 4096.0F)) * 4096.0D);
					local69 = (int) ((double) (local69 * this.anInt6456) * 3.141592653589793D);
				}
				local69 -= local69 & 0xFFFFF000;
				if (this.anInt6458 == 0) {
					local69 = Static642.anIntArray715[local69 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6458 == 2) {
					local69 -= 2048;
					if (local69 < 0) {
						local69 = -local69;
					}
					local69 = 2048 - local69 << 1;
				}
				local18[local34] = local69;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6459 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt6458 = arg1.method2048(255);
		} else if (arg0 == 3) {
			this.anInt6456 = arg1.method2048(255);
		}
	}
}

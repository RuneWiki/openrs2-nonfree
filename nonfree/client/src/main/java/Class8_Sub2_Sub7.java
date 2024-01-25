import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class8_Sub2_Sub7 extends Class8_Sub2 {

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[16384];

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[16384];

	@OriginalMember(owner = "client!cp", name = "F", descriptor = "I")
	private int anInt2360 = 1;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
	private int anInt2366 = 0;

	@OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
	private int anInt2365 = 0;

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			aFloatArray26[local17] = (float) Math.sin(local15 * (double) local17);
			aFloatArray25[local17] = (float) Math.cos((double) local17 * local15);
		}
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		Static282.method4762();
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(19) int local19 = Static426.anIntArray424[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static538.anInt9297; local27++) {
				@Pc(33) int local33 = Static93.anIntArray111[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(62) int local62;
				if (this.anInt2366 == 0) {
					local62 = this.anInt2360 * (local33 - local19);
				} else {
					@Pc(52) int local52 = local39 * local39 + local25 * local25 >> 12;
					local62 = (int) (Math.sqrt((double) ((float) local52 / 4096.0F)) * 4096.0D);
					local62 = (int) ((double) (local62 * this.anInt2360) * 3.141592653589793D);
				}
				local62 -= local62 & 0xFFFFF000;
				if (this.anInt2365 == 0) {
					local62 = Static246.anIntArray317[local62 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2365 == 2) {
					local62 -= 2048;
					if (local62 < 0) {
						local62 = -local62;
					}
					local62 = 2048 - local62 << 1;
				}
				local11[local27] = local62;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2366 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt2365 = arg1.method8525();
		} else if (arg0 == 3) {
			this.anInt2360 = arg1.method8525();
		}
	}
}

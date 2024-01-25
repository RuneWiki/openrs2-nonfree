import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class307 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "[F")
	public static final float[] aFloatArray88 = new float[16384];

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "[F")
	public static final float[] aFloatArray89 = new float[16384];

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
	private int anInt8752 = 0;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
	private int anInt8754 = -1;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!ef;")
	private Class102 aClass102_61 = new Class102();

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Z")
	public boolean aBoolean662 = false;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	private final int anInt8749;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	private final int anInt8750;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "[Lclient!tl;")
	private Class5_Sub51[] aClass5_Sub51Array1;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	static {
		@Pc(67) double local67 = 3.834951969714103E-4D;
		for (@Pc(69) int local69 = 0; local69 < 16384; local69++) {
			aFloatArray89[local69] = (float) Math.sin(local67 * (double) local69);
			aFloatArray88[local69] = (float) Math.cos((double) local69 * local67);
		}
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(III)V")
	public Class307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8749 = arg0;
		this.anInt8750 = arg1;
		this.aClass5_Sub51Array1 = new Class5_Sub51[this.anInt8750];
		this.anIntArrayArrayArray18 = new int[this.anInt8749][3][arg2];
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)[[[I")
	public int[][][] method7493() {
		if (this.anInt8749 != this.anInt8750) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt8749; local28++) {
			this.aClass5_Sub51Array1[local28] = Static280.aClass5_Sub51_1;
		}
		return this.anIntArrayArrayArray18;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	public void method7495() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8749; local3++) {
			this.anIntArrayArrayArray18[local3][0] = null;
			this.anIntArrayArrayArray18[local3][1] = null;
			this.anIntArrayArrayArray18[local3][2] = null;
			this.anIntArrayArrayArray18[local3] = null;
		}
		this.anIntArrayArrayArray18 = null;
		this.aClass5_Sub51Array1 = null;
		if (57 != 57) {
			Static514.method7492();
		}
		this.aClass102_61.method1932();
		this.aClass102_61 = null;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)[[I")
	public int[][] method7497(@OriginalArg(1) int arg0) {
		if (this.anInt8750 == this.anInt8749) {
			this.aBoolean662 = this.aClass5_Sub51Array1[arg0] == null;
			this.aClass5_Sub51Array1[arg0] = Static280.aClass5_Sub51_1;
			return this.anIntArrayArrayArray18[arg0];
		} else if (this.anInt8749 == 1) {
			this.aBoolean662 = arg0 != this.anInt8754;
			this.anInt8754 = arg0;
			return this.anIntArrayArrayArray18[0];
		} else {
			@Pc(55) Class5_Sub51 local55 = this.aClass5_Sub51Array1[arg0];
			if (local55 == null) {
				this.aBoolean662 = true;
				if (this.anInt8752 >= this.anInt8749) {
					@Pc(80) Class5_Sub51 local80 = (Class5_Sub51) this.aClass102_61.method1924();
					local55 = new Class5_Sub51(arg0, local80.anInt9668);
					this.aClass5_Sub51Array1[local80.anInt9669] = null;
					local80.method9327(1);
				} else {
					local55 = new Class5_Sub51(arg0, this.anInt8752);
					this.anInt8752++;
				}
				this.aClass5_Sub51Array1[arg0] = local55;
			} else {
				this.aBoolean662 = false;
			}
			this.aClass102_61.method1929(local55);
			return this.anIntArrayArrayArray18[local55.anInt9668];
		}
	}
}

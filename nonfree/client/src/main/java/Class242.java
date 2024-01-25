import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class242 {

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
	public static final int[] anIntArray384 = new int[16384];

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
	public static final int[] anIntArray383 = new int[16384];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	private int anInt6750 = 0;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	private int anInt6754 = -1;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!ga;")
	private Class124 aClass124_68 = new Class124();

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Z")
	public boolean aBoolean487 = false;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	private final int anInt6751;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	private final int anInt6755;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "[Lclient!cc;")
	private Class5_Sub11[] aClass5_Sub11Array1;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray384[local11] = (int) (Math.sin((double) local11 * local9) * 16384.0D);
			anIntArray383[local11] = (int) (Math.cos(local9 * (double) local11) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(III)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6751 = arg0;
		this.anInt6755 = arg1;
		this.anIntArrayArrayArray14 = new int[this.anInt6751][3][arg2];
		this.aClass5_Sub11Array1 = new Class5_Sub11[this.anInt6755];
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[[I")
	public int[][] method5691(@OriginalArg(1) int arg0) {
		if (this.anInt6755 == this.anInt6751) {
			this.aBoolean487 = this.aClass5_Sub11Array1[arg0] == null;
			this.aClass5_Sub11Array1[arg0] = Static603.aClass5_Sub11_1;
			return this.anIntArrayArrayArray14[arg0];
		} else if (this.anInt6751 == 1) {
			this.aBoolean487 = arg0 != this.anInt6754;
			this.anInt6754 = arg0;
			return this.anIntArrayArrayArray14[0];
		} else {
			@Pc(50) Class5_Sub11 local50 = this.aClass5_Sub11Array1[arg0];
			if (local50 == null) {
				this.aBoolean487 = true;
				if (this.anInt6750 >= this.anInt6751) {
					@Pc(70) Class5_Sub11 local70 = (Class5_Sub11) this.aClass124_68.method2573();
					local50 = new Class5_Sub11(arg0, local70.anInt1016);
					this.aClass5_Sub11Array1[local70.anInt1017] = null;
					local70.method8829();
				} else {
					local50 = new Class5_Sub11(arg0, this.anInt6750);
					this.anInt6750++;
				}
				this.aClass5_Sub11Array1[arg0] = local50;
			} else {
				this.aBoolean487 = false;
			}
			this.aClass124_68.method2570(local50);
			return this.anIntArrayArrayArray14[local50.anInt1016];
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)[[[I")
	public int[][][] method5693() {
		if (this.anInt6755 != this.anInt6751) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(30) int local30 = 0; local30 < this.anInt6751; local30++) {
			this.aClass5_Sub11Array1[local30] = Static603.aClass5_Sub11_1;
		}
		return this.anIntArrayArrayArray14;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public void method5694() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6751; local3++) {
			this.anIntArrayArrayArray14[local3][0] = null;
			this.anIntArrayArrayArray14[local3][1] = null;
			this.anIntArrayArrayArray14[local3][2] = null;
			this.anIntArrayArrayArray14[local3] = null;
		}
		this.aClass5_Sub11Array1 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass124_68.method2567();
		this.aClass124_68 = null;
	}
}

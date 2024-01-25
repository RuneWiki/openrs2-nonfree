import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class1_Sub5_Sub14 extends Class1_Sub5 {

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "[I")
	public static final int[] anIntArray329 = new int[32];

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
	private int anInt3416;

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
	private int anInt3417;

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
	private int anInt3418;

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray329[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	private Class1_Sub5_Sub14(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2896(arg0);
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub14() {
		this(0);
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)V")
	private void method2896(@OriginalArg(0) int arg0) {
		this.anInt3417 = arg0 >> 12 & 0xFF0;
		this.anInt3418 = arg0 >> 4 & 0xFF0;
		this.anInt3416 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static75.anInt1566; local34++) {
				local24[local34] = this.anInt3417;
				local28[local34] = this.anInt3418;
				local32[local34] = this.anInt3416;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method2896(arg0.method5705());
		}
	}
}

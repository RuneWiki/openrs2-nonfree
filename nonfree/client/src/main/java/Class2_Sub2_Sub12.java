import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
	private int anInt2116 = 4096;

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
	private int anInt2112 = 4096;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
	private int anInt2114 = 4096;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(28) int[][] local28 = this.method5474(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static217.anInt3574; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local64 == local60 && local68 == local64) {
					local44[local54] = this.anInt2116 * local60 >> 12;
					local48[local54] = local64 * this.anInt2114 >> 12;
					local52[local54] = local68 * this.anInt2112 >> 12;
				} else {
					local44[local54] = this.anInt2116;
					local48[local54] = this.anInt2114;
					local52[local54] = this.anInt2112;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2116 = arg0.method3555();
		} else if (arg1 == 1) {
			this.anInt2114 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt2112 = arg0.method3555();
		}
	}
}

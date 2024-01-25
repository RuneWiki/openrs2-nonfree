import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class2_Sub2_Sub29 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
	private int anInt5937 = 409;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
	private int anInt5939 = 4096;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
	private int anInt5942 = 4096;

	@OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
	private int anInt5944 = 4096;

	@OriginalMember(owner = "client!rn", name = "I", descriptor = "[I")
	private final int[] anIntArray517 = new int[3];

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(28) int[][] local28 = this.method5474(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static217.anInt3574; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(68) int local68 = local60 - this.anIntArray517[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt5937 < local68) {
					local44[local54] = local60;
					local48[local54] = local36[local54];
					local52[local54] = local40[local54];
				} else {
					@Pc(102) int local102 = local36[local54];
					local68 = local102 - this.anIntArray517[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (local68 > this.anInt5937) {
						local44[local54] = local60;
						local48[local54] = local102;
						local52[local54] = local40[local54];
					} else {
						@Pc(139) int local139 = local40[local54];
						local68 = local139 - this.anIntArray517[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (this.anInt5937 < local68) {
							local44[local54] = local60;
							local48[local54] = local102;
							local52[local54] = local139;
						} else {
							local44[local54] = this.anInt5942 * local60 >> 12;
							local48[local54] = this.anInt5944 * local102 >> 12;
							local52[local54] = local139 * this.anInt5939 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5937 = arg0.method3555();
		} else if (arg1 == 1) {
			this.anInt5939 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt5944 = arg0.method3555();
		} else if (arg1 == 3) {
			this.anInt5942 = arg0.method3555();
		} else if (arg1 == 4) {
			@Pc(65) int local65 = arg0.method3563();
			this.anIntArray517[1] = local65 >> 4 & 0xFF0;
			this.anIntArray517[2] = local65 >> 12 & 0x0;
			this.anIntArray517[0] = (local65 & 0xFF0000) << 4;
		}
	}
}

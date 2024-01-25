import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
	private int anInt2169 = 4096;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
	private int anInt2171 = 4096;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	private int anInt2172 = 4096;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "[I")
	private final int[] anIntArray159 = new int[3];

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
	private int anInt2173 = 409;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2173 = arg1.method4494();
		} else if (arg0 == 1) {
			this.anInt2172 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt2169 = arg1.method4494();
		} else if (arg0 == 3) {
			this.anInt2171 = arg1.method4494();
		} else if (arg0 == 4) {
			@Pc(65) int local65 = arg1.method4486();
			this.anIntArray159[1] = local65 >> 4 & 0xFF0;
			this.anIntArray159[0] = (local65 & 0xFF0000) << 4;
			this.anIntArray159[2] = local65 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(25) int[][] local25 = this.method8199(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local13[0];
			@Pc(45) int[] local45 = local13[1];
			@Pc(49) int[] local49 = local13[2];
			for (@Pc(51) int local51 = 0; local51 < Static254.anInt4973; local51++) {
				@Pc(57) int local57 = local29[local51];
				@Pc(64) int local64 = local57 - this.anIntArray159[0];
				if (local64 < 0) {
					local64 = -local64;
				}
				if (local64 > this.anInt2173) {
					local41[local51] = local57;
					local45[local51] = local33[local51];
					local49[local51] = local37[local51];
				} else {
					@Pc(99) int local99 = local33[local51];
					local64 = local99 - this.anIntArray159[1];
					if (local64 < 0) {
						local64 = -local64;
					}
					if (this.anInt2173 < local64) {
						local41[local51] = local57;
						local45[local51] = local99;
						local49[local51] = local37[local51];
					} else {
						@Pc(139) int local139 = local37[local51];
						local64 = local139 - this.anIntArray159[2];
						if (local64 < 0) {
							local64 = -local64;
						}
						if (local64 > this.anInt2173) {
							local41[local51] = local57;
							local45[local51] = local99;
							local49[local51] = local139;
						} else {
							local41[local51] = local57 * this.anInt2171 >> 12;
							local45[local51] = this.anInt2169 * local99 >> 12;
							local49[local51] = this.anInt2172 * local139 >> 12;
						}
					}
				}
			}
		}
		return local13;
	}
}

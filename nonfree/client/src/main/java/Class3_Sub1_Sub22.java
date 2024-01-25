import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class3_Sub1_Sub22 extends Class3_Sub1 {

	@OriginalMember(owner = "client!l", name = "F", descriptor = "[I")
	private final int[] anIntArray468 = new int[3];

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	private int anInt5483 = 4096;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "I")
	private int anInt5485 = 4096;

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
	private int anInt5490 = 409;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "I")
	private int anInt5482 = 4096;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(26) int[][] local26 = this.method7779(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static307.anInt4846; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(65) int local65 = local58 - this.anIntArray468[0];
				if (local65 < 0) {
					local65 = -local65;
				}
				if (this.anInt5490 < local65) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(96) int local96 = local34[local52];
					local65 = local96 - this.anIntArray468[1];
					if (local65 < 0) {
						local65 = -local65;
					}
					if (this.anInt5490 < local65) {
						local42[local52] = local58;
						local46[local52] = local96;
						local50[local52] = local38[local52];
					} else {
						@Pc(133) int local133 = local38[local52];
						local65 = local133 - this.anIntArray468[2];
						if (local65 < 0) {
							local65 = -local65;
						}
						if (local65 > this.anInt5490) {
							local42[local52] = local58;
							local46[local52] = local96;
							local50[local52] = local133;
						} else {
							local42[local52] = local58 * this.anInt5483 >> 12;
							local46[local52] = local96 * this.anInt5482 >> 12;
							local50[local52] = this.anInt5485 * local133 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt5490 = arg1.method7591();
		} else if (arg0 == 1) {
			this.anInt5485 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt5482 = arg1.method7591();
		} else if (arg0 == 3) {
			this.anInt5483 = arg1.method7591();
		} else if (arg0 == 4) {
			@Pc(57) int local57 = arg1.method7551();
			this.anIntArray468[0] = (local57 & 0xFF0000) << 4;
			this.anIntArray468[2] = local57 >> 12 & 0x0;
			this.anIntArray468[1] = local57 >> 4 & 0xFF0;
		}
	}
}

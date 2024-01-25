import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class3_Sub2_Sub21 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "[I")
	public static final int[] anIntArray358 = new int[16384];

	@OriginalMember(owner = "client!lr", name = "Q", descriptor = "[I")
	public static final int[] anIntArray356 = new int[16384];

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "[I")
	private final int[] anIntArray357 = new int[3];

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
	private int anInt6436 = 3216;

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
	private int anInt6437 = 4096;

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
	private int anInt6438 = 3216;

	static {
		@Pc(64) double local64 = 3.834951969714103E-4D;
		for (@Pc(66) int local66 = 0; local66 < 16384; local66++) {
			anIntArray358[local66] = (int) (Math.sin((double) local66 * local64) * 16384.0D);
			anIntArray356[local66] = (int) (Math.cos(local64 * (double) local66) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt6437 = arg1.method5272();
		} else if (arg0 == 1) {
			this.anInt6436 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt6438 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		this.method5453();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(30) int local30 = this.anInt6437 * Static644.anInt10386 >> 12;
			@Pc(40) int[] local40 = this.method9204(Static599.anInt9773 & arg0 - 1, 0);
			@Pc(46) int[] local46 = this.method9204(arg0, 0);
			@Pc(56) int[] local56 = this.method9204(Static599.anInt9773 & arg0 + 1, 0);
			for (@Pc(58) int local58 = 0; local58 < Static636.anInt10302; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = local30 * (local46[Static144.anInt2744 & local58 - 1] - local46[Static144.anInt2744 & local58 + 1]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				@Pc(102) int local102 = local73 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(138) int local138 = Class274.aByteArray83[local98 + (local102 * (local102 + 1) >> 1)] & 0xFF;
				@Pc(144) int local144 = local138 * local94 >> 8;
				@Pc(150) int local150 = local73 * local138 >> 8;
				@Pc(156) int local156 = local138 * 4096 >> 8;
				@Pc(165) int local165 = local150 * this.anIntArray357[1] >> 12;
				@Pc(174) int local174 = local156 * this.anIntArray357[2] >> 12;
				@Pc(183) int local183 = this.anIntArray357[0] * local144 >> 12;
				local11[local58] = local174 + local165 + local183;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	private void method5453() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6438 / 4096.0F));
		this.anIntArray357[0] = (int) (local11 * Math.sin((double) ((float) this.anInt6436 / 4096.0F)) * 4096.0D);
		this.anIntArray357[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt6436 / 4096.0F)));
		this.anIntArray357[2] = (int) (Math.sin((double) ((float) this.anInt6438 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray357[0] * this.anIntArray357[0] >> 12;
		@Pc(86) int local86 = this.anIntArray357[1] * this.anIntArray357[1] >> 12;
		@Pc(98) int local98 = this.anIntArray357[2] * this.anIntArray357[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local86 + local74 + local98 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray357[1] = (this.anIntArray357[1] << 12) / local111;
			this.anIntArray357[2] = (this.anIntArray357[2] << 12) / local111;
			this.anIntArray357[0] = (this.anIntArray357[0] << 12) / local111;
		}
	}
}

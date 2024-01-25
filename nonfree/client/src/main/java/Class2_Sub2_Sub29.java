import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub2_Sub29 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
	private int anInt5534 = 2048;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
	private int anInt5538 = 2;

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
	private int anInt5539 = 0;

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
	private int anInt5541 = 1;

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "[S")
	private short[] aShortArray80 = new short[512];

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "[B")
	private byte[] aByteArray62 = new byte[512];

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
	private int anInt5545 = 5;

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
	private int anInt5544 = 5;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt5544 = this.anInt5545 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt5539 = arg1.method4421();
		} else if (arg0 == 2) {
			this.anInt5534 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt5538 = arg1.method4421();
		} else if (arg0 == 4) {
			this.anInt5541 = arg1.method4421();
		} else if (arg0 == 5) {
			this.anInt5544 = arg1.method4421();
		} else if (arg0 == 6) {
			this.anInt5545 = arg1.method4421();
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	private void method4919() {
		@Pc(12) Random local12 = new Random((long) this.anInt5539);
		this.aShortArray80 = new short[512];
		if (this.anInt5534 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray80[local24] = (short) Static188.method3700(local12, this.anInt5534);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		this.aByteArray62 = Static208.method3729(this.anInt5539);
		this.method4919();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(29) int local29 = Class208.lb[arg0] * this.anInt5545 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static339.anInt6735; local39++) {
				Static113.anInt2539 = Integer.MAX_VALUE;
				Static144.anInt2964 = Integer.MAX_VALUE;
				Static129.anInt2724 = Integer.MAX_VALUE;
				Static39.anInt791 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt5544 * Static212.anIntArray325[local39] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(154) int local154;
				for (@Pc(71) int local71 = local33 - 1; local71 <= local37; local71++) {
					@Pc(95) int local95 = this.aByteArray62[(local71 >= this.anInt5545 ? local71 - this.anInt5545 : local71) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local63 - 1; local99 <= local67; local99++) {
						@Pc(125) int local125 = (this.aByteArray62[local95 + (this.anInt5544 > local99 ? local99 : local99 - this.anInt5544) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(138) int local138 = local59 - this.aShortArray80[local125] - (local99 << 12);
						@Pc(151) int local151 = local29 - (local71 << 12) - this.aShortArray80[local129];
						local154 = this.anInt5541;
						@Pc(189) int local189;
						if (local154 == 1) {
							local189 = local138 * local138 + local151 * local151 >> 12;
						} else if (local154 == 3) {
							local138 = local138 >= 0 ? local138 : -local138;
							local151 = local151 < 0 ? -local151 : local151;
							local189 = local151 < local138 ? local138 : local151;
						} else if (local154 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 < 0 ? -local138 : local138) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 < 0 ? -local151 : local151) / 4096.0F)) * 4096.0D);
							local189 = local138 + local151;
							local189 = local189 * local189 >> 12;
						} else if (local154 == 5) {
							local138 *= local138;
							local151 *= local151;
							local189 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local151) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local189 = (local151 < 0 ? -local151 : local151) + (local138 < 0 ? -local138 : local138);
						} else {
							local189 = (int) (Math.sqrt((double) ((float) (local138 * local138 + local151 * local151) / 1.6777216E7F)) * 4096.0D);
						}
						if (local189 < Static39.anInt791) {
							Static113.anInt2539 = Static144.anInt2964;
							Static144.anInt2964 = Static129.anInt2724;
							Static129.anInt2724 = Static39.anInt791;
							Static39.anInt791 = local189;
						} else if (Static129.anInt2724 > local189) {
							Static113.anInt2539 = Static144.anInt2964;
							Static144.anInt2964 = Static129.anInt2724;
							Static129.anInt2724 = local189;
						} else if (local189 < Static144.anInt2964) {
							Static113.anInt2539 = Static144.anInt2964;
							Static144.anInt2964 = local189;
						} else if (Static113.anInt2539 > local189) {
							Static113.anInt2539 = local189;
						}
					}
				}
				local154 = this.anInt5538;
				if (local154 == 0) {
					local11[local39] = Static39.anInt791;
				} else if (local154 == 1) {
					local11[local39] = Static129.anInt2724;
				} else if (local154 == 3) {
					local11[local39] = Static144.anInt2964;
				} else if (local154 == 4) {
					local11[local39] = Static113.anInt2539;
				} else if (local154 == 2) {
					local11[local39] = Static129.anInt2724 - Static39.anInt791;
				}
			}
		}
		return local11;
	}
}

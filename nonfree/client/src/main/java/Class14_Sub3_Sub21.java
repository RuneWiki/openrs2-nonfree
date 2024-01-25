import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class14_Sub3_Sub21 extends Class14_Sub3 {

	@OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
	private int anInt3296 = 4096;

	@OriginalMember(owner = "client!jq", name = "V", descriptor = "I")
	private int anInt3305 = 3216;

	@OriginalMember(owner = "client!jq", name = "X", descriptor = "I")
	private int anInt3307 = 3216;

	@OriginalMember(owner = "client!jq", name = "bb", descriptor = "[I")
	private final int[] anIntArray290 = new int[3];

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		this.method3050();
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(B)V")
	private void method3050() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3307 / 4096.0F));
		this.anIntArray290[0] = (int) (Math.sin((double) ((float) this.anInt3305 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray290[1] = (int) (Math.cos((double) ((float) this.anInt3305 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray290[2] = (int) (Math.sin((double) ((float) this.anInt3307 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray290[0] * this.anIntArray290[0] >> 12;
		@Pc(86) int local86 = this.anIntArray290[1] * this.anIntArray290[1] >> 12;
		@Pc(98) int local98 = this.anIntArray290[2] * this.anIntArray290[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local86 + local74 + local98 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray290[2] = (this.anIntArray290[2] << 12) / local112;
			this.anIntArray290[0] = (this.anIntArray290[0] << 12) / local112;
			this.anIntArray290[1] = (this.anIntArray290[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(28) int local28 = this.anInt3296 * Static233.anInt4558 >> 12;
			@Pc(38) int[] local38 = this.method6004(0, arg0 - 1 & Static179.anInt3689);
			@Pc(44) int[] local44 = this.method6004(0, arg0);
			@Pc(54) int[] local54 = this.method6004(0, Static179.anInt3689 & arg0 + 1);
			for (@Pc(56) int local56 = 0; local56 < Static294.anInt5657; local56++) {
				@Pc(71) int local71 = (local54[local56] - local38[local56]) * local28 >> 12;
				@Pc(92) int local92 = (local44[local56 - 1 & Static329.anInt6352] - local44[local56 + 1 & Static329.anInt6352]) * local28 >> 12;
				@Pc(96) int local96 = local92 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				@Pc(108) int local108 = local71 >> 4;
				if (local96 > 255) {
					local96 = 255;
				}
				if (local108 < 0) {
					local108 = -local108;
				}
				if (local108 > 255) {
					local108 = 255;
				}
				@Pc(140) int local140 = Class176.aByteArray159[local96 + (local108 * (local108 + 1) >> 1)] & 0xFF;
				@Pc(146) int local146 = local140 * local92 >> 8;
				@Pc(152) int local152 = local140 * 4096 >> 8;
				@Pc(158) int local158 = local140 * local71 >> 8;
				@Pc(167) int local167 = local158 * this.anIntArray290[1] >> 12;
				@Pc(176) int local176 = this.anIntArray290[2] * local152 >> 12;
				@Pc(185) int local185 = local146 * this.anIntArray290[0] >> 12;
				local17[local56] = local185 + local167 + local176;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3296 = arg0.method2498();
		} else if (arg1 == 1) {
			this.anInt3305 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt3307 = arg0.method2498();
		}
	}
}

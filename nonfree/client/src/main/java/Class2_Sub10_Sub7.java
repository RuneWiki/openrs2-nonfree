import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class2_Sub10_Sub7 extends Class2_Sub10 {

	@OriginalMember(owner = "client!fea", name = "E", descriptor = "[S")
	private short[] aShortArray38 = new short[512];

	@OriginalMember(owner = "client!fea", name = "I", descriptor = "I")
	private int anInt3453 = 2;

	@OriginalMember(owner = "client!fea", name = "L", descriptor = "I")
	private int anInt3455 = 0;

	@OriginalMember(owner = "client!fea", name = "H", descriptor = "I")
	private int anInt3452 = 5;

	@OriginalMember(owner = "client!fea", name = "B", descriptor = "I")
	private int anInt3449 = 2048;

	@OriginalMember(owner = "client!fea", name = "O", descriptor = "I")
	private int anInt3457 = 5;

	@OriginalMember(owner = "client!fea", name = "P", descriptor = "I")
	private int anInt3458 = 1;

	@OriginalMember(owner = "client!fea", name = "K", descriptor = "[B")
	private byte[] aByteArray33 = new byte[512];

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)V")
	private void method2839() {
		@Pc(16) Random local16 = new Random((long) this.anInt3455);
		this.aShortArray38 = new short[512];
		if (this.anInt3449 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray38[local28] = (short) Static610.method8343(local16, this.anInt3449);
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3457 = this.anInt3452 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt3455 = arg0.method6904();
		} else if (arg1 == 2) {
			this.anInt3449 = arg0.method6884();
		} else if (arg1 == 3) {
			this.anInt3453 = arg0.method6904();
		} else if (arg1 == 4) {
			this.anInt3458 = arg0.method6904();
		} else if (arg1 == 5) {
			this.anInt3457 = arg0.method6904();
		} else if (arg1 == 6) {
			this.anInt3452 = arg0.method6904();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(31) int local31 = this.anInt3452 * Static353.anIntArray424[arg0] + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static93.anInt1862; local41++) {
				Static511.anInt7697 = Integer.MAX_VALUE;
				Static395.anInt3533 = Integer.MAX_VALUE;
				Static375.anInt6712 = Integer.MAX_VALUE;
				Static582.anInt9561 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static561.anIntArray649[local41] * this.anInt3457 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(155) int local155;
				for (@Pc(72) int local72 = local35 - 1; local72 <= local39; local72++) {
					@Pc(93) int local93 = this.aByteArray33[(this.anInt3452 > local72 ? local72 : local72 - this.anInt3452) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local64 - 1; local97 <= local68; local97++) {
						@Pc(126) int local126 = (this.aByteArray33[(local97 < this.anInt3457 ? local97 : local97 - this.anInt3457) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = -(local97 << 12);
						@Pc(135) int local135 = local126 + 1;
						@Pc(140) int local140 = local60 + local131 - this.aShortArray38[local126];
						@Pc(152) int local152 = local31 - (local72 << 12) - this.aShortArray38[local135];
						local155 = this.anInt3458;
						@Pc(186) int local186;
						if (local155 == 1) {
							local186 = local152 * local152 + local140 * local140 >> 12;
						} else if (local155 == 3) {
							local152 = local152 >= 0 ? local152 : -local152;
							local140 = local140 < 0 ? -local140 : local140;
							local186 = local152 < local140 ? local140 : local152;
						} else if (local155 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 < 0 ? -local140 : local140) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 >= 0 ? local152 : -local152) / 4096.0F)) * 4096.0D);
							local186 = local140 + local152;
							local186 = local186 * local186 >> 12;
						} else if (local155 == 5) {
							local140 *= local140;
							local152 *= local152;
							local186 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local152 + local140) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local186 = (local152 < 0 ? -local152 : local152) + (local140 >= 0 ? local140 : -local140);
						} else {
							local186 = (int) (Math.sqrt((double) ((float) (local152 * local152 + local140 * local140) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static582.anInt9561 > local186) {
							Static511.anInt7697 = Static395.anInt3533;
							Static395.anInt3533 = Static375.anInt6712;
							Static375.anInt6712 = Static582.anInt9561;
							Static582.anInt9561 = local186;
						} else if (local186 < Static375.anInt6712) {
							Static511.anInt7697 = Static395.anInt3533;
							Static395.anInt3533 = Static375.anInt6712;
							Static375.anInt6712 = local186;
						} else if (local186 < Static395.anInt3533) {
							Static511.anInt7697 = Static395.anInt3533;
							Static395.anInt3533 = local186;
						} else if (local186 < Static511.anInt7697) {
							Static511.anInt7697 = local186;
						}
					}
				}
				local155 = this.anInt3453;
				if (local155 == 0) {
					local17[local41] = Static582.anInt9561;
				} else if (local155 == 1) {
					local17[local41] = Static375.anInt6712;
				} else if (local155 == 3) {
					local17[local41] = Static395.anInt3533;
				} else if (local155 == 4) {
					local17[local41] = Static511.anInt7697;
				} else if (local155 == 2) {
					local17[local41] = Static375.anInt6712 - Static582.anInt9561;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		this.aByteArray33 = Static555.method7689(this.anInt3455);
		this.method2839();
	}
}

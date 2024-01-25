import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class6_Sub1_Sub31 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
	private int anInt9127 = 2048;

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
	private int anInt9130 = 0;

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
	private int anInt9136 = 2048;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
	private int anInt9129 = 12288;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
	private int anInt9137 = 0;

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
	private int anInt9131 = 8192;

	@OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
	private int anInt9138 = 4096;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)Z")
	private boolean method7710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt9129 * (arg1 + arg0) >> 12;
		@Pc(30) int local30 = Static404.anIntArray300[local20 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt9129;
		@Pc(44) int local44 = (local37 << 12) / this.anInt9131;
		@Pc(51) int local51 = local44 * this.anInt9138 >> 12;
		return arg0 - arg1 < local51 && arg0 - arg1 > -local51;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(29) int local29 = Static230.anIntArray222[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static479.anInt8231; local31++) {
				@Pc(39) int local39 = Static205.anIntArray199[local31] - 2048;
				@Pc(45) int local45 = local39 + this.anInt9127;
				@Pc(56) int local56 = local45 >= -2048 ? local45 : local45 + 4096;
				@Pc(65) int local65 = local56 <= 2048 ? local56 : local56 - 4096;
				@Pc(70) int local70 = this.anInt9137 + local29;
				@Pc(79) int local79 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(90) int local90 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(95) int local95 = this.anInt9130 + local39;
				@Pc(104) int local104 = local95 < -2048 ? local95 + 4096 : local95;
				@Pc(115) int local115 = local104 <= 2048 ? local104 : local104 - 4096;
				@Pc(120) int local120 = this.anInt9136 + local29;
				@Pc(131) int local131 = local120 >= -2048 ? local120 : local120 + 4096;
				@Pc(140) int local140 = local131 <= 2048 ? local131 : local131 - 4096;
				local19[local31] = this.method7711(local90, local65) || this.method7710(local140, local115) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)Z")
	private boolean method7711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9129 * (arg0 - arg1) >> 12;
		@Pc(27) int local27 = Static404.anIntArray300[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt9129;
		@Pc(41) int local41 = (local34 << 12) / this.anInt9131;
		@Pc(48) int local48 = this.anInt9138 * local41 >> 12;
		return arg0 + arg1 < local48 && arg0 + arg1 > -local48;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		Static364.method5249();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9127 = arg0.method8363();
		} else if (arg1 == 1) {
			this.anInt9137 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt9130 = arg0.method8363();
		} else if (arg1 == 3) {
			this.anInt9136 = arg0.method8363();
		} else if (arg1 == 4) {
			this.anInt9129 = arg0.method8363();
		} else if (arg1 == 5) {
			this.anInt9138 = arg0.method8363();
		} else if (arg1 == 6) {
			this.anInt9131 = arg0.method8363();
		}
	}
}

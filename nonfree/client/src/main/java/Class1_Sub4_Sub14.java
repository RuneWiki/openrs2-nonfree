import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class1_Sub4_Sub14 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
	private int anInt3077;

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
	private int anInt3083;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
	private int anInt3084;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
	private int anInt3078 = 1024;

	@OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
	private int anInt3082 = 4;

	@OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
	private int anInt3085 = 409;

	@OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
	private int anInt3087 = 204;

	@OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
	private int anInt3089 = 1024;

	@OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
	private int anInt3088 = 8;

	@OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
	private int anInt3080 = 0;

	@OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
	private int anInt3091 = 81;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt3080 + Static266.anIntArray628[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt3088 > local23 && local30 >= this.anIntArray280[local23]) {
				local23++;
			}
			@Pc(58) int local58 = local23 - 1;
			@Pc(66) boolean local66 = (local23 & 0x1) == 0;
			@Pc(71) int local71 = this.anIntArray280[local23];
			@Pc(78) int local78 = this.anIntArray280[local23 - 1];
			if (local78 + this.anInt3077 < local30 && local71 - this.anInt3077 > local30) {
				for (@Pc(100) int local100 = 0; local100 < Static66.anInt1511; local100++) {
					@Pc(104) int local104 = 0;
					@Pc(113) int local113 = local66 ? this.anInt3089 : -this.anInt3089;
					@Pc(124) int local124;
					for (local124 = (local113 * this.anInt3084 >> 12) + Static121.anIntArray197[local100]; local124 < 0; local124 += 4096) {
					}
					while (local124 > 4096) {
						local124 -= 4096;
					}
					while (local104 < this.anInt3082 && this.anIntArrayArray37[local58][local104] <= local124) {
						local104++;
					}
					@Pc(160) int local160 = local104 - 1;
					@Pc(167) int local167 = this.anIntArrayArray37[local58][local160];
					@Pc(174) int local174 = this.anIntArrayArray37[local58][local104];
					if (local167 + this.anInt3077 < local124 && local124 < local174 - this.anInt3077) {
						local17[local100] = this.anIntArrayArray36[local58][local160];
					} else {
						local17[local100] = 0;
					}
				}
			} else {
				Static468.method4333(local17, 0, Static66.anInt1511, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt3082 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt3088 = arg1.method5366();
		} else if (arg0 == 2) {
			this.anInt3085 = arg1.method5362();
		} else if (arg0 == 3) {
			this.anInt3087 = arg1.method5362();
		} else if (arg0 == 4) {
			this.anInt3089 = arg1.method5362();
		} else if (arg0 == 5) {
			this.anInt3080 = arg1.method5362();
		} else if (arg0 == 6) {
			this.anInt3091 = arg1.method5362();
		} else if (arg0 == 7) {
			this.anInt3078 = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		this.method2674();
	}

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)V")
	private void method2674() {
		@Pc(12) Random local12 = new Random((long) this.anInt3088);
		this.anInt3077 = this.anInt3091 / 2;
		this.anInt3084 = 4096 / this.anInt3082;
		this.anInt3083 = 4096 / this.anInt3088;
		@Pc(35) int local35 = this.anInt3084 / 2;
		this.anIntArrayArray36 = new int[this.anInt3088][this.anInt3082];
		@Pc(47) int local47 = this.anInt3083 / 2;
		this.anIntArray280 = new int[this.anInt3088 + 1];
		this.anIntArrayArray37 = new int[this.anInt3088][this.anInt3082 + 1];
		this.anIntArray280[0] = 0;
		for (@Pc(75) int local75 = 0; local75 < this.anInt3088; local75++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local75 > 0) {
				local85 = this.anInt3083;
				local97 = (Static300.method5748(local12, 4096) - 2048) * this.anInt3087 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local47 >> 12);
				this.anIntArray280[local75] = this.anIntArray280[local75 - 1] + local105;
			}
			this.anIntArrayArray37[local75][0] = 0;
			for (local85 = 0; local85 < this.anInt3082; local85++) {
				if (local85 > 0) {
					local97 = this.anInt3084;
					@Pc(149) int local149 = (Static300.method5748(local12, 4096) - 2048) * this.anInt3085 >> 12;
					local97 += local149 * local35 >> 12;
					this.anIntArrayArray37[local75][local85] = local97 + this.anIntArrayArray37[local75][local85 - 1];
				}
				this.anIntArrayArray36[local75][local85] = this.anInt3078 > 0 ? 4096 - Static300.method5748(local12, this.anInt3078) : 4096;
			}
			this.anIntArrayArray37[local75][this.anInt3082] = 4096;
		}
		this.anIntArray280[this.anInt3088] = 4096;
	}
}

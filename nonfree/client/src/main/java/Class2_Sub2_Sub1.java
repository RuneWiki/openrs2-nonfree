import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
	private int anInt63;

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!ab", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ab", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ab", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
	private int anInt72 = 1024;

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
	private int anInt70 = 4;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	private int anInt64 = 0;

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
	private int anInt61 = 81;

	@OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
	private int anInt69 = 1024;

	@OriginalMember(owner = "client!ab", name = "hb", descriptor = "I")
	private int anInt76 = 409;

	@OriginalMember(owner = "client!ab", name = "jb", descriptor = "I")
	private int anInt78 = 8;

	@OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
	private int anInt80 = 204;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		this.method60();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt70 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt78 = arg1.method4421();
		} else if (arg0 == 2) {
			this.anInt76 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt80 = arg1.method4464();
		} else if (arg0 == 4) {
			this.anInt69 = arg1.method4464();
		} else if (arg0 == 5) {
			this.anInt64 = arg1.method4464();
		} else if (arg0 == 6) {
			this.anInt61 = arg1.method4464();
		} else if (arg0 == 7) {
			this.anInt72 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(21) int local21 = 0;
			@Pc(28) int local28;
			for (local28 = Class208.lb[arg0] + this.anInt64; local28 < 0; local28 += 4096) {
			}
			while (local28 > 4096) {
				local28 -= 4096;
			}
			while (this.anInt78 > local21 && local28 >= this.anIntArray1[local21]) {
				local21++;
			}
			@Pc(65) int local65 = local21 - 1;
			@Pc(73) boolean local73 = (local21 & 0x1) == 0;
			@Pc(78) int local78 = this.anIntArray1[local21];
			@Pc(85) int local85 = this.anIntArray1[local21 - 1];
			if (this.lb + local85 < local28 && local28 < local78 - this.lb) {
				for (@Pc(115) int local115 = 0; local115 < Static339.anInt6735; local115++) {
					@Pc(126) int local126 = local73 ? this.anInt69 : -this.anInt69;
					@Pc(128) int local128 = 0;
					@Pc(139) int local139;
					for (local139 = Static212.anIntArray325[local115] + (local126 * this.anInt63 >> 12); local139 < 0; local139 += 4096) {
					}
					while (local139 > 4096) {
						local139 -= 4096;
					}
					while (this.anInt70 > local128 && local139 >= this.anIntArrayArray6[local65][local128]) {
						local128++;
					}
					@Pc(176) int local176 = local128 - 1;
					@Pc(183) int local183 = this.anIntArrayArray6[local65][local176];
					@Pc(190) int local190 = this.anIntArrayArray6[local65][local128];
					if (local139 > this.lb + local183 && local139 < local190 - this.lb) {
						local11[local115] = this.anIntArrayArray5[local65][local176];
					} else {
						local11[local115] = 0;
					}
				}
			} else {
				Static359.method685(local11, 0, Static339.anInt6735, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	private void method60() {
		@Pc(12) Random local12 = new Random((long) this.anInt78);
		this.anInt63 = 4096 / this.anInt70;
		this.lb = this.anInt61 / 2;
		this.anInt68 = 4096 / this.anInt78;
		@Pc(35) int local35 = this.anInt63 / 2;
		this.anIntArray1 = new int[this.anInt78 + 1];
		@Pc(47) int local47 = this.anInt68 / 2;
		this.anIntArrayArray5 = new int[this.anInt78][this.anInt70];
		this.anIntArrayArray6 = new int[this.anInt78][this.anInt70 + 1];
		this.anIntArray1[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt78; local76++) {
			@Pc(86) int local86;
			@Pc(100) int local100;
			if (local76 > 0) {
				local86 = this.anInt68;
				local100 = (Static188.method3700(local12, 4096) - 2048) * this.anInt80 >> 12;
				@Pc(108) int local108 = local86 + (local100 * local47 >> 12);
				this.anIntArray1[local76] = this.anIntArray1[local76 - 1] + local108;
			}
			this.anIntArrayArray6[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt70; local86++) {
				if (local86 > 0) {
					local100 = this.anInt63;
					@Pc(149) int local149 = (Static188.method3700(local12, 4096) - 2048) * this.anInt76 >> 12;
					local100 += local35 * local149 >> 12;
					this.anIntArrayArray6[local76][local86] = this.anIntArrayArray6[local76][local86 - 1] + local100;
				}
				this.anIntArrayArray5[local76][local86] = this.anInt72 <= 0 ? 4096 : 4096 - Static188.method3700(local12, this.anInt72);
			}
			this.anIntArrayArray6[local76][this.anInt70] = 4096;
		}
		this.anIntArray1[this.anInt78] = 4096;
	}
}

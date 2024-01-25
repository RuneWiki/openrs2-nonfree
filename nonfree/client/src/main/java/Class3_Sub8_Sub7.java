import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class3_Sub8_Sub7 extends Class3_Sub8 {

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	private int anInt3249;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
	private int anInt3251;

	@OriginalMember(owner = "client!fo", name = "M", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!fo", name = "V", descriptor = "I")
	private int anInt3259;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
	private int anInt3247 = 204;

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
	private int anInt3253 = 4;

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
	private int anInt3252 = 8;

	@OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
	private int anInt3258 = 0;

	@OriginalMember(owner = "client!fo", name = "W", descriptor = "I")
	private int anInt3260 = 81;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
	private int anInt3250 = 1024;

	@OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
	private int anInt3257 = 1024;

	@OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
	private int anInt3255 = 409;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3253 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt3252 = arg1.method7954();
		} else if (arg0 == 2) {
			this.anInt3255 = arg1.method7951();
		} else if (arg0 == 3) {
			this.anInt3247 = arg1.method7951();
		} else if (arg0 == 4) {
			this.anInt3250 = arg1.method7951();
		} else if (arg0 == 5) {
			this.anInt3258 = arg1.method7951();
		} else if (arg0 == 6) {
			this.anInt3260 = arg1.method7951();
		} else if (arg0 == 7) {
			this.anInt3257 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt3258 + Static510.anIntArray172[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local23 < this.anInt3252 && this.anIntArray165[local23] <= local30) {
				local23++;
			}
			@Pc(65) int local65 = local23 - 1;
			@Pc(73) boolean local73 = (local23 & 0x1) == 0;
			@Pc(78) int local78 = this.anIntArray165[local23];
			@Pc(85) int local85 = this.anIntArray165[local23 - 1];
			if (local85 + this.anInt3249 < local30 && local30 < local78 - this.anInt3249) {
				for (@Pc(100) int local100 = 0; local100 < Static91.anInt1849; local100++) {
					@Pc(104) int local104 = 0;
					@Pc(113) int local113 = local73 ? this.anInt3250 : -this.anInt3250;
					@Pc(124) int local124;
					for (local124 = Static13.anIntArray11[local100] + (this.anInt3251 * local113 >> 12); local124 < 0; local124 += 4096) {
					}
					while (local124 > 4096) {
						local124 -= 4096;
					}
					while (this.anInt3253 > local104 && local124 >= this.anIntArrayArray22[local65][local104]) {
						local104++;
					}
					@Pc(165) int local165 = local104 - 1;
					@Pc(172) int local172 = this.anIntArrayArray22[local65][local104];
					@Pc(179) int local179 = this.anIntArrayArray22[local65][local165];
					if (local124 > this.anInt3249 + local179 && local124 < local172 - this.anInt3249) {
						local17[local100] = this.anIntArrayArray21[local65][local165];
					} else {
						local17[local100] = 0;
					}
				}
			} else {
				Static681.method4032(local17, 0, Static91.anInt1849, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		this.method2796();
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "(I)V")
	private void method2796() {
		@Pc(12) Random local12 = new Random((long) this.anInt3252);
		this.anInt3249 = this.anInt3260 / 2;
		this.anInt3259 = 4096 / this.anInt3252;
		this.anInt3251 = 4096 / this.anInt3253;
		@Pc(35) int local35 = this.anInt3251 / 2;
		this.anIntArray165 = new int[this.anInt3252 + 1];
		this.anIntArrayArray21 = new int[this.anInt3252][this.anInt3253];
		this.anIntArrayArray22 = new int[this.anInt3252][this.anInt3253 + 1];
		@Pc(63) int local63 = this.anInt3259 / 2;
		this.anIntArray165[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3252; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt3259;
				local89 = (Static93.method1603(4096, local12) - 2048) * this.anInt3247 >> 12;
				@Pc(97) int local97 = local77 + (local89 * local63 >> 12);
				this.anIntArray165[local70] = local97 + this.anIntArray165[local70 - 1];
			}
			this.anIntArrayArray22[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt3253; local77++) {
				if (local77 > 0) {
					local89 = this.anInt3251;
					@Pc(140) int local140 = (Static93.method1603(4096, local12) - 2048) * this.anInt3255 >> 12;
					local89 += local35 * local140 >> 12;
					this.anIntArrayArray22[local70][local77] = local89 + this.anIntArrayArray22[local70][local77 - 1];
				}
				this.anIntArrayArray21[local70][local77] = this.anInt3257 > 0 ? 4096 - Static93.method1603(this.anInt3257, local12) : 4096;
			}
			this.anIntArrayArray22[local70][this.anInt3253] = 4096;
		}
		this.anIntArray165[this.anInt3252] = 4096;
	}
}

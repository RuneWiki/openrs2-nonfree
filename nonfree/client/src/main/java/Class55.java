import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public abstract class Class55 {

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
	private int anInt2912 = 4;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	private int anInt2914 = 4;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "[S")
	private short[] aShortArray75 = new short[512];

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	protected int anInt2920 = 4;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	private int anInt2918 = 0;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	private int anInt2911 = 4;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIII)V")
	protected Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2912 = arg4;
		this.anInt2918 = arg0;
		this.anInt2911 = arg2;
		this.anInt2914 = arg3;
		this.anInt2920 = arg1;
		this.method2435();
		this.method2430();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBII)V")
	protected final void method2429() {
		@Pc(13) int[] local13 = new int[64];
		@Pc(16) int[] local16 = new int[64];
		@Pc(19) int[] local19 = new int[64];
		@Pc(21) int local21;
		for (local21 = 0; local21 < 64; local21++) {
			local13[local21] = (local21 << 12) / 64;
		}
		for (local21 = 0; local21 < 64; local21++) {
			local19[local21] = (local21 << 12) / 64;
		}
		for (local21 = 0; local21 < 64; local21++) {
			local16[local21] = (local21 << 12) / 64;
		}
		this.method2437();
		for (@Pc(76) int local76 = 0; local76 < 64; local76++) {
			for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
				for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
					for (@Pc(103) int local103 = 0; local103 < this.anInt2920; local103++) {
						local21 = this.aShortArray76[local103] << 12;
						@Pc(125) int local125 = local21 * this.anInt2911 >> 12;
						@Pc(133) int local133 = local21 * local16[local76] >> 12;
						@Pc(138) int local138 = local133 * this.anInt2912;
						@Pc(142) int local142 = local138 >> 12;
						@Pc(146) int local146 = local142 + 1;
						@Pc(154) int local154 = local21 * local13[local94] >> 12;
						@Pc(159) int local159 = local154 * this.anInt2911;
						@Pc(163) int local163 = local142 & 0xFF;
						@Pc(170) int local170 = this.anInt2912 * local21 >> 12;
						@Pc(177) int local177 = this.anInt2914 * local21 >> 12;
						if (local170 <= local146) {
							local146 = 0;
						} else {
							local146 &= 0xFF;
						}
						@Pc(193) short local193 = this.aShortArray75[local163];
						@Pc(201) int local201 = local21 * local19[local85] >> 12;
						@Pc(206) int local206 = local201 * this.anInt2914;
						@Pc(210) int local210 = local206 >> 12;
						@Pc(214) int local214 = local210 + 1;
						@Pc(219) short local219 = this.aShortArray75[local146];
						@Pc(223) int local223 = local159 >> 12;
						local133 = local138 & 0xFFF;
						local154 = local159 & 0xFFF;
						@Pc(235) int local235 = local133 - 4096;
						@Pc(239) int local239 = local223 + 1;
						@Pc(243) int local243 = local210 & 0xFF;
						if (local214 >= local177) {
							local214 = 0;
						} else {
							local214 &= 0xFF;
						}
						@Pc(262) int local262 = local154 - 4096;
						@Pc(266) int local266 = Class1_Sub2_Sub1_Sub2.anIntArray374[local154];
						@Pc(273) short local273 = this.aShortArray75[local243 + local219];
						@Pc(277) int local277 = Class1_Sub2_Sub1_Sub2.anIntArray374[local133];
						if (local239 >= local125) {
							local239 = 0;
						} else {
							local239 &= 0xFF;
						}
						@Pc(299) short local299 = this.aShortArray75[local193 + local214];
						@Pc(306) short local306 = this.aShortArray75[local219 + local214];
						local223 &= 0xFF;
						@Pc(317) short local317 = this.aShortArray75[local193 + local243];
						local201 = local206 & 0xFFF;
						@Pc(325) int local325 = Class1_Sub2_Sub1_Sub2.anIntArray374[local201];
						@Pc(329) int local329 = local201 - 4096;
						@Pc(344) int local344 = Static120.method1884(local154, this.aShortArray75[local223 + local317], local133, local201);
						@Pc(356) int local356 = Static120.method1884(local262, this.aShortArray75[local317 + local239], local133, local201);
						@Pc(367) int local367 = (local266 * (local356 - local344) >> 12) + local344;
						@Pc(381) int local381 = Static120.method1884(local154, this.aShortArray75[local299 + local223], local133, local329);
						@Pc(395) int local395 = Static120.method1884(local262, this.aShortArray75[local299 + local239], local133, local329);
						@Pc(405) int local405 = local381 + (local266 * (local395 - local381) >> 12);
						@Pc(417) int local417 = Static120.method1884(local154, this.aShortArray75[local273 + local223], local235, local201);
						@Pc(428) int local428 = ((local405 - local367) * local325 >> 12) + local367;
						@Pc(441) int local441 = Static120.method1884(local262, this.aShortArray75[local239 + local273], local235, local201);
						@Pc(452) int local452 = local417 + (local266 * (local441 - local417) >> 12);
						@Pc(466) int local466 = Static120.method1884(local154, this.aShortArray75[local223 + local306], local235, local329);
						@Pc(481) int local481 = Static120.method1884(local262, this.aShortArray75[local239 + local306], local235, local329);
						@Pc(493) int local493 = local466 + (local266 * (local481 - local466) >> 12);
						@Pc(504) int local504 = (local325 * (local493 - local452) >> 12) + local452;
						this.method2434(local428 + ((local504 - local428) * local277 >> 12), local103);
					}
					this.method2436();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	private void method2430() {
		@Pc(12) Random local12 = new Random((long) this.anInt2918);
		@Pc(14) int local14;
		for (local14 = 0; local14 < 255; local14++) {
			this.aShortArray75[local14] = (short) local14;
		}
		for (local14 = 0; local14 < 255; local14++) {
			@Pc(36) int local36 = 255 - local14;
			@Pc(41) int local41 = Static14.method284(local36, local12);
			@Pc(46) short local46 = this.aShortArray75[local41];
			this.aShortArray75[local41] = this.aShortArray75[local36];
			this.aShortArray75[local36] = this.aShortArray75[local36 + 256] = local46;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V")
	protected abstract void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	private void method2435() {
		this.aShortArray76 = new short[this.anInt2920];
		for (@Pc(12) int local12 = 0; local12 < this.anInt2920; local12++) {
			this.aShortArray76[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
	protected abstract void method2436();

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	protected abstract void method2437();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
	private int anInt3007;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
	private int anInt3006;

	@OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
	private int anInt3010;

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
	private int anInt3012;

	@OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
	private int anInt3014;

	@OriginalMember(owner = "client!mf", name = "ob", descriptor = "I")
	private int anInt3015;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		Static68.method1457();
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)Z")
	private boolean method2153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt3006 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static3.anIntArray6[local8 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt3006;
		@Pc(36) int local36 = (local29 << 12) / this.anInt3014;
		@Pc(43) int local43 = local36 * this.anInt3001 >> 12;
		return local43 > arg1 - arg0 && -local43 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(22) int local22 = Static18.anIntArray101[arg0] - 2048;
			for (@Pc(24) int local24 = 0; local24 < Static65.anInt1933; local24++) {
				@Pc(32) int local32 = Static106.anIntArray284[local24] - 2048;
				@Pc(37) int local37 = this.anInt3007 + local32;
				@Pc(48) int local48 = local37 >= -2048 ? local37 : local37 + 4096;
				@Pc(59) int local59 = local48 > 2048 ? local48 - 4096 : local48;
				@Pc(65) int local65 = local22 + this.anInt3010;
				@Pc(76) int local76 = local65 < -2048 ? local65 + 4096 : local65;
				@Pc(87) int local87 = local76 <= 2048 ? local76 : local76 - 4096;
				@Pc(92) int local92 = this.anInt3015 + local32;
				@Pc(103) int local103 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(108) int local108 = this.anInt3012 + local22;
				@Pc(117) int local117 = local108 >= -2048 ? local108 : local108 + 4096;
				@Pc(128) int local128 = local117 <= 2048 ? local117 : local117 - 4096;
				@Pc(139) int local139 = local103 <= 2048 ? local103 : local103 - 4096;
				local12[local24] = this.method2155(local87, local59) || this.method2153(local139, local128) ? 4096 : 0;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(III)Z")
	private boolean method2155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 - arg1) * this.anInt3006 >> 12;
		@Pc(22) int local22 = Static3.anIntArray6[local12 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local22 << 12) / this.anInt3006;
		@Pc(42) int local42 = (local35 << 12) / this.anInt3014;
		@Pc(49) int local49 = local42 * this.anInt3001 >> 12;
		return local49 > arg0 + arg1 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3007 = arg1.method1642();
		} else if (arg0 == 1) {
			this.anInt3010 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt3015 = arg1.method1642();
		} else if (arg0 == 3) {
			this.anInt3012 = arg1.method1642();
		} else if (arg0 == 4) {
			this.anInt3006 = arg1.method1642();
		} else if (arg0 == 5) {
			this.anInt3001 = arg1.method1642();
		} else if (arg0 == 6) {
			this.anInt3014 = arg1.method1642();
		}
	}
}

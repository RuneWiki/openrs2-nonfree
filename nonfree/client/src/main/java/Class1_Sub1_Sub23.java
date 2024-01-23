import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
	private int anInt3914;

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
	private int anInt3915;

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
	private int anInt3916;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
	private int anInt3911 = 0;

	@OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
	private int anInt3917 = 409;

	@OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
	private int anInt3920 = 4;

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
	private int anInt3919 = 1024;

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
	private int anInt3922 = 1024;

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
	private int anInt3924 = 81;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	private int anInt3910 = 8;

	@OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
	private int anInt3926 = 204;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3920 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt3910 = arg0.method2655();
		} else if (arg1 == 2) {
			this.anInt3917 = arg0.method2652();
		} else if (arg1 == 3) {
			this.anInt3926 = arg0.method2652();
		} else if (arg1 == 4) {
			this.anInt3919 = arg0.method2652();
		} else if (arg1 == 5) {
			this.anInt3911 = arg0.method2652();
		} else if (arg1 == 6) {
			this.anInt3924 = arg0.method2652();
		} else if (arg1 == 7) {
			this.anInt3922 = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V")
	private void method3179() {
		@Pc(12) Random local12 = new Random((long) this.anInt3910);
		this.anIntArrayArray25 = new int[this.anInt3910][this.anInt3920 + 1];
		this.anIntArrayArray26 = new int[this.anInt3910][this.anInt3920];
		this.anInt3915 = this.anInt3924 / 2;
		this.anInt3916 = 4096 / this.anInt3920;
		this.anInt3914 = 4096 / this.anInt3910;
		@Pc(51) int local51 = this.anInt3916 / 2;
		@Pc(56) int local56 = this.anInt3914 / 2;
		this.anIntArray356 = new int[this.anInt3910 + 1];
		this.anIntArray356[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt3910; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt3914;
				local96 = (Static13.method291(4096, local12) - 2048) * this.anInt3926 >> 12;
				@Pc(104) int local104 = local84 + (local56 * local96 >> 12);
				this.anIntArray356[local74] = this.anIntArray356[local74 - 1] + local104;
			}
			this.anIntArrayArray25[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt3920; local84++) {
				if (local84 > 0) {
					local96 = this.anInt3916;
					@Pc(147) int local147 = (Static13.method291(4096, local12) - 2048) * this.anInt3917 >> 12;
					local96 += local51 * local147 >> 12;
					this.anIntArrayArray25[local74][local84] = local96 + this.anIntArrayArray25[local74][local84 - 1];
				}
				this.anIntArrayArray26[local74][local84] = this.anInt3922 > 0 ? 4096 - Static13.method291(this.anInt3922, local12) : 4096;
			}
			this.anIntArrayArray25[local74][this.anInt3920] = 4096;
		}
		this.anIntArray356[this.anInt3910] = 4096;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(14) int local14 = 0;
			@Pc(21) int local21;
			for (local21 = Static98.anIntArray221[arg0] + this.anInt3911; local21 < 0; local21 += 4096) {
			}
			while (local21 > 4096) {
				local21 -= 4096;
			}
			while (this.anInt3910 > local14 && local21 >= this.anIntArray356[local14]) {
				local14++;
			}
			@Pc(65) int local65 = this.anIntArray356[local14 - 1];
			@Pc(76) boolean local76 = (local14 & 0x1) == 0;
			@Pc(80) int local80 = local14 - 1;
			@Pc(85) int local85 = this.anIntArray356[local14];
			if (local21 > local65 + this.anInt3915 && local21 < local85 - this.anInt3915) {
				for (@Pc(112) int local112 = 0; local112 < Static75.anInt1848; local112++) {
					@Pc(121) int local121 = 0;
					@Pc(130) int local130 = local76 ? this.anInt3919 : -this.anInt3919;
					@Pc(141) int local141;
					for (local141 = (this.anInt3916 * local130 >> 12) + Static157.anIntArray331[local112]; local141 < 0; local141 += 4096) {
					}
					while (local141 > 4096) {
						local141 -= 4096;
					}
					while (this.anInt3920 > local121 && local141 >= this.anIntArrayArray25[local80][local121]) {
						local121++;
					}
					@Pc(175) int local175 = local121 - 1;
					@Pc(182) int local182 = this.anIntArrayArray25[local80][local175];
					@Pc(189) int local189 = this.anIntArrayArray25[local80][local121];
					if (this.anInt3915 + local182 < local141 && local189 - this.anInt3915 > local141) {
						local7[local112] = this.anIntArrayArray26[local80][local175];
					} else {
						local7[local112] = 0;
					}
				}
			} else {
				Static302.method1371(local7, 0, Static75.anInt1848, 0);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		this.method3179();
	}
}

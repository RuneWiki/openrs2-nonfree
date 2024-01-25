import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
	private int anInt617;

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
	private int anInt619;

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
	private int anInt623;

	@OriginalMember(owner = "client!bh", name = "db", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
	private int anInt620 = 1024;

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
	private int anInt622 = 81;

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
	private int anInt618 = 0;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	private int anInt610 = 4;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
	private int anInt615 = 1024;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
	private int anInt621 = 8;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
	private int anInt624 = 204;

	@OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
	private int anInt627 = 409;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt610 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt621 = arg1.method3737();
		} else if (arg0 == 2) {
			this.anInt627 = arg1.method3711();
		} else if (arg0 == 3) {
			this.anInt624 = arg1.method3711();
		} else if (arg0 == 4) {
			this.anInt615 = arg1.method3711();
		} else if (arg0 == 5) {
			this.anInt618 = arg1.method3711();
		} else if (arg0 == 6) {
			this.anInt622 = arg1.method3711();
		} else if (arg0 == 7) {
			this.anInt620 = arg1.method3711();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt618 + Static373.anIntArray55[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt621 > local23 && local30 >= this.anIntArray32[local23]) {
				local23++;
			}
			@Pc(61) int local61 = local23 - 1;
			@Pc(69) boolean local69 = (local23 & 0x1) == 0;
			@Pc(74) int local74 = this.anIntArray32[local23];
			@Pc(81) int local81 = this.anIntArray32[local23 - 1];
			if (local30 > this.anInt623 + local81 && local30 < local74 - this.anInt623) {
				for (@Pc(103) int local103 = 0; local103 < Static131.anInt2581; local103++) {
					@Pc(107) int local107 = 0;
					@Pc(116) int local116 = local69 ? this.anInt615 : -this.anInt615;
					@Pc(128) int local128;
					for (local128 = Static252.anIntArray323[local103] + (this.anInt619 * local116 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (local107 < this.anInt610 && this.anIntArrayArray4[local61][local107] <= local128) {
						local107++;
					}
					@Pc(169) int local169 = local107 - 1;
					@Pc(176) int local176 = this.anIntArrayArray4[local61][local107];
					@Pc(183) int local183 = this.anIntArrayArray4[local61][local169];
					if (local183 + this.anInt623 < local128 && local128 < local176 - this.anInt623) {
						local11[local103] = this.anIntArrayArray3[local61][local169];
					} else {
						local11[local103] = 0;
					}
				}
			} else {
				Static459.method3349(local11, 0, Static131.anInt2581, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		this.method413();
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	private void method413() {
		@Pc(12) Random local12 = new Random((long) this.anInt621);
		this.anInt623 = this.anInt622 / 2;
		this.anInt619 = 4096 / this.anInt610;
		this.anInt617 = 4096 / this.anInt621;
		@Pc(43) int local43 = this.anInt619 / 2;
		this.anIntArrayArray4 = new int[this.anInt621][this.anInt610 + 1];
		this.anIntArrayArray3 = new int[this.anInt621][this.anInt610];
		@Pc(64) int local64 = this.anInt617 / 2;
		this.anIntArray32 = new int[this.anInt621 + 1];
		this.anIntArray32[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt621; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt617;
				local100 = (Static159.method2512(4096, local12) - 2048) * this.anInt624 >> 12;
				@Pc(108) int local108 = local88 + (local64 * local100 >> 12);
				this.anIntArray32[local78] = local108 + this.anIntArray32[local78 - 1];
			}
			this.anIntArrayArray4[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt610; local88++) {
				if (local88 > 0) {
					local100 = this.anInt619;
					@Pc(148) int local148 = (Static159.method2512(4096, local12) - 2048) * this.anInt627 >> 12;
					local100 += local148 * local43 >> 12;
					this.anIntArrayArray4[local78][local88] = local100 + this.anIntArrayArray4[local78][local88 - 1];
				}
				this.anIntArrayArray3[local78][local88] = this.anInt620 <= 0 ? 4096 : 4096 - Static159.method2512(this.anInt620, local12);
			}
			this.anIntArrayArray4[local78][this.anInt610] = 4096;
		}
		this.anIntArray32[this.anInt621] = 4096;
	}
}

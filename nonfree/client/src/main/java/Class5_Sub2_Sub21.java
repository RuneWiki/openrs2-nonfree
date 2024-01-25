import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class5_Sub2_Sub21 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lr", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	private int anInt6394;

	@OriginalMember(owner = "client!lr", name = "O", descriptor = "[I")
	private int[] anIntArray368;

	@OriginalMember(owner = "client!lr", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!lr", name = "bb", descriptor = "I")
	private int anInt6409;

	@OriginalMember(owner = "client!lr", name = "cb", descriptor = "I")
	private int anInt6410;

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
	private int anInt6397 = 204;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
	private int anInt6393 = 0;

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
	private int anInt6402 = 1024;

	@OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
	private int anInt6398 = 1024;

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
	private int anInt6391 = 81;

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
	private int anInt6396 = 8;

	@OriginalMember(owner = "client!lr", name = "Z", descriptor = "I")
	private int anInt6407 = 4;

	@OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
	private int anInt6401 = 409;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		this.method5335();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6407 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt6396 = arg0.method7816();
		} else if (arg1 == 2) {
			this.anInt6401 = arg0.method7860();
		} else if (arg1 == 3) {
			this.anInt6397 = arg0.method7860();
		} else if (arg1 == 4) {
			this.anInt6398 = arg0.method7860();
		} else if (arg1 == 5) {
			this.anInt6393 = arg0.method7860();
		} else if (arg1 == 6) {
			this.anInt6391 = arg0.method7860();
		} else if (arg1 == 7) {
			this.anInt6402 = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static369.anIntArray377[arg0] + this.anInt6393; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt6396 > local22 && local29 >= this.anIntArray368[local22]) {
				local22++;
			}
			@Pc(70) int local70 = local22 - 1;
			@Pc(81) boolean local81 = (local22 & 0x1) == 0;
			@Pc(86) int local86 = this.anIntArray368[local22];
			@Pc(93) int local93 = this.anIntArray368[local22 - 1];
			if (this.anInt6394 + local93 < local29 && local86 - this.anInt6394 > local29) {
				for (@Pc(108) int local108 = 0; local108 < Static195.anInt3759; local108++) {
					@Pc(119) int local119 = local81 ? this.anInt6398 : -this.anInt6398;
					@Pc(121) int local121 = 0;
					@Pc(132) int local132;
					for (local132 = Static554.anIntArray510[local108] + (local119 * this.anInt6409 >> 12); local132 < 0; local132 += 4096) {
					}
					while (local132 > 4096) {
						local132 -= 4096;
					}
					while (local121 < this.anInt6407 && local132 >= this.anIntArrayArray31[local70][local121]) {
						local121++;
					}
					@Pc(170) int local170 = local121 - 1;
					@Pc(177) int local177 = this.anIntArrayArray31[local70][local121];
					@Pc(184) int local184 = this.anIntArrayArray31[local70][local170];
					if (this.anInt6394 + local184 < local132 && local132 < local177 - this.anInt6394) {
						local16[local108] = this.anIntArrayArray32[local70][local170];
					} else {
						local16[local108] = 0;
					}
				}
			} else {
				Static686.method4970(local16, 0, Static195.anInt3759, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V")
	private void method5335() {
		@Pc(12) Random local12 = new Random((long) this.anInt6396);
		this.anInt6409 = 4096 / this.anInt6407;
		this.anInt6394 = this.anInt6391 / 2;
		this.anInt6410 = 4096 / this.anInt6396;
		@Pc(35) int local35 = this.anInt6409 / 2;
		this.anIntArrayArray32 = new int[this.anInt6396][this.anInt6407];
		this.anIntArray368 = new int[this.anInt6396 + 1];
		@Pc(62) int local62 = this.anInt6410 / 2;
		this.anIntArrayArray31 = new int[this.anInt6396][this.anInt6407 + 1];
		this.anIntArray368[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt6396; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt6410;
				local97 = (Static508.method7270(4096, local12) - 2048) * this.anInt6397 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local62 >> 12);
				this.anIntArray368[local78] = local105 + this.anIntArray368[local78 - 1];
			}
			this.anIntArrayArray31[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt6407; local85++) {
				if (local85 > 0) {
					local97 = this.anInt6409;
					@Pc(148) int local148 = (Static508.method7270(4096, local12) - 2048) * this.anInt6401 >> 12;
					local97 += local35 * local148 >> 12;
					this.anIntArrayArray31[local78][local85] = local97 + this.anIntArrayArray31[local78][local85 - 1];
				}
				this.anIntArrayArray32[local78][local85] = this.anInt6402 <= 0 ? 4096 : 4096 - Static508.method7270(this.anInt6402, local12);
			}
			this.anIntArrayArray31[local78][this.anInt6407] = 4096;
		}
		this.anIntArray368[this.anInt6396] = 4096;
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class7_Sub3_Sub35 extends Class7_Sub3 {

	@OriginalMember(owner = "client!va", name = "G", descriptor = "I")
	private int anInt6659;

	@OriginalMember(owner = "client!va", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "[I")
	private int[] anIntArray586;

	@OriginalMember(owner = "client!va", name = "R", descriptor = "I")
	private int anInt6667;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	private int anInt6672;

	@OriginalMember(owner = "client!va", name = "M", descriptor = "I")
	private int anInt6664 = 1024;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "I")
	private int anInt6663 = 204;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "I")
	private int anInt6658 = 0;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "I")
	private int anInt6657 = 409;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	private int anInt6666 = 8;

	@OriginalMember(owner = "client!va", name = "S", descriptor = "I")
	private int anInt6668 = 4;

	@OriginalMember(owner = "client!va", name = "U", descriptor = "I")
	private int anInt6670 = 1024;

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
	private int anInt6673 = 81;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static203.anIntArray322[arg0] + this.anInt6658; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt6666 && local32 >= this.anIntArray586[local25]) {
				local25++;
			}
			@Pc(71) int local71 = local25 - 1;
			@Pc(79) boolean local79 = (local25 & 0x1) == 0;
			@Pc(84) int local84 = this.anIntArray586[local25];
			@Pc(91) int local91 = this.anIntArray586[local25 - 1];
			if (local32 > this.anInt6672 + local91 && local84 - this.anInt6672 > local32) {
				for (@Pc(113) int local113 = 0; local113 < Static58.anInt1052; local113++) {
					@Pc(124) int local124 = local79 ? this.anInt6670 : -this.anInt6670;
					@Pc(126) int local126 = 0;
					@Pc(137) int local137;
					for (local137 = Static185.anIntArray298[local113] + (local124 * this.anInt6659 >> 12); local137 < 0; local137 += 4096) {
					}
					while (local137 > 4096) {
						local137 -= 4096;
					}
					while (local126 < this.anInt6668 && this.anIntArrayArray56[local71][local126] <= local137) {
						local126++;
					}
					@Pc(171) int local171 = local126 - 1;
					@Pc(178) int local178 = this.anIntArrayArray56[local71][local171];
					@Pc(185) int local185 = this.anIntArrayArray56[local71][local126];
					if (local178 + this.anInt6672 < local137 && local185 - this.anInt6672 > local137) {
						local11[local113] = this.anIntArrayArray57[local71][local171];
					} else {
						local11[local113] = 0;
					}
				}
			} else {
				Static464.method3634(local11, 0, Static58.anInt1052, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	private void method5249() {
		@Pc(12) Random local12 = new Random((long) this.anInt6666);
		this.anInt6659 = 4096 / this.anInt6668;
		this.anInt6667 = 4096 / this.anInt6666;
		this.anInt6672 = this.anInt6673 / 2;
		@Pc(35) int local35 = this.anInt6659 / 2;
		this.anIntArrayArray56 = new int[this.anInt6666][this.anInt6668 + 1];
		this.anIntArrayArray57 = new int[this.anInt6666][this.anInt6668];
		this.anIntArray586 = new int[this.anInt6666 + 1];
		@Pc(63) int local63 = this.anInt6667 / 2;
		this.anIntArray586[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt6666; local70++) {
			@Pc(80) int local80;
			@Pc(94) int local94;
			if (local70 > 0) {
				local80 = this.anInt6667;
				local94 = (Static304.method4043(4096, local12) - 2048) * this.anInt6663 >> 12;
				@Pc(102) int local102 = local80 + (local94 * local63 >> 12);
				this.anIntArray586[local70] = local102 + this.anIntArray586[local70 - 1];
			}
			this.anIntArrayArray56[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt6668; local80++) {
				if (local80 > 0) {
					local94 = this.anInt6659;
					@Pc(147) int local147 = (Static304.method4043(4096, local12) - 2048) * this.anInt6657 >> 12;
					local94 += local147 * local35 >> 12;
					this.anIntArrayArray56[local70][local80] = local94 + this.anIntArrayArray56[local70][local80 - 1];
				}
				this.anIntArrayArray57[local70][local80] = this.anInt6664 <= 0 ? 4096 : 4096 - Static304.method4043(this.anInt6664, local12);
			}
			this.anIntArrayArray56[local70][this.anInt6668] = 4096;
		}
		this.anIntArray586[this.anInt6666] = 4096;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt6668 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt6666 = arg1.method3981();
		} else if (arg0 == 2) {
			this.anInt6657 = arg1.method3943();
		} else if (arg0 == 3) {
			this.anInt6663 = arg1.method3943();
		} else if (arg0 == 4) {
			this.anInt6670 = arg1.method3943();
		} else if (arg0 == 5) {
			this.anInt6658 = arg1.method3943();
		} else if (arg0 == 6) {
			this.anInt6673 = arg1.method3943();
		} else if (arg0 == 7) {
			this.anInt6664 = arg1.method3943();
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		this.method5249();
	}
}

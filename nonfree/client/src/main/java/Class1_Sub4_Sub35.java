import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class1_Sub4_Sub35 extends Class1_Sub4 {

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
	private int anInt4936;

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
	private int anInt4943;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
	private int anInt4946;

	@OriginalMember(owner = "client!tk", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!tk", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
	private int anInt4941 = 1024;

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
	private int anInt4940 = 0;

	@OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
	private int anInt4947 = 409;

	@OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
	private int anInt4951 = 8;

	@OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
	private int anInt4945 = 204;

	@OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
	private int anInt4948 = 1024;

	@OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
	private int anInt4942 = 81;

	@OriginalMember(owner = "client!tk", name = "eb", descriptor = "I")
	private int anInt4955 = 4;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
	private void method4258() {
		@Pc(8) Random local8 = new Random((long) this.anInt4951);
		this.anInt4946 = 4096 / this.anInt4955;
		@Pc(23) int local23 = this.anInt4946 / 2;
		this.anInt4936 = 4096 / this.anInt4951;
		this.anIntArrayArray39 = new int[this.anInt4951][this.anInt4955];
		this.anIntArray436 = new int[this.anInt4951 + 1];
		this.anIntArray436[0] = 0;
		this.anIntArrayArray40 = new int[this.anInt4951][this.anInt4955 + 1];
		this.anInt4943 = this.anInt4942 / 2;
		@Pc(68) int local68 = this.anInt4936 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt4951; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt4936;
				local92 = (Static151.method2554(4096, local8) - 2048) * this.anInt4945 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local68 >> 12);
				this.anIntArray436[local70] = this.anIntArray436[local70 - 1] + local100;
			}
			this.anIntArrayArray40[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt4955; local80++) {
				if (local80 > 0) {
					local92 = this.anInt4946;
					@Pc(151) int local151 = (Static151.method2554(4096, local8) - 2048) * this.anInt4947 >> 12;
					local92 += local151 * local23 >> 12;
					this.anIntArrayArray40[local70][local80] = this.anIntArrayArray40[local70][local80 - 1] + local92;
				}
				this.anIntArrayArray39[local70][local80] = this.anInt4948 <= 0 ? 4096 : 4096 - Static151.method2554(this.anInt4948, local8);
			}
			this.anIntArrayArray40[local70][this.anInt4955] = 4096;
		}
		this.anIntArray436[this.anInt4951] = 4096;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		this.method4258();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(31) int local31 = this.anInt4940 + Static250.anIntArray398[arg0];
			@Pc(33) int local33 = 0;
			while (local31 < 0) {
				local31 += 4096;
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (this.anInt4951 > local33 && this.anIntArray436[local33] <= local31) {
				local33++;
			}
			@Pc(69) boolean local69 = (local33 & 0x1) == 0;
			@Pc(73) int local73 = local33 - 1;
			@Pc(80) int local80 = this.anIntArray436[local33 - 1];
			@Pc(85) int local85 = this.anIntArray436[local33];
			if (local31 > this.anInt4943 + local80 && local85 - this.anInt4943 > local31) {
				for (@Pc(115) int local115 = 0; local115 < Static182.anInt3492; local115++) {
					@Pc(131) int local131 = local69 ? this.anInt4941 : -this.anInt4941;
					@Pc(133) int local133 = 0;
					@Pc(144) int local144;
					for (local144 = Static279.anIntArray454[local115] + (local131 * this.anInt4946 >> 12); local144 < 0; local144 += 4096) {
					}
					while (local144 > 4096) {
						local144 -= 4096;
					}
					while (local133 < this.anInt4955 && local144 >= this.anIntArrayArray40[local73][local133]) {
						local133++;
					}
					@Pc(187) int local187 = this.anIntArrayArray40[local73][local133];
					@Pc(191) int local191 = local133 - 1;
					@Pc(198) int local198 = this.anIntArrayArray40[local73][local191];
					if (local198 + this.anInt4943 < local144 && local187 - this.anInt4943 > local144) {
						local9[local115] = this.anIntArrayArray39[local73][local191];
					} else {
						local9[local115] = 0;
					}
				}
			} else {
				Static319.method1765(local9, 0, Static182.anInt3492, 0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4955 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt4951 = arg0.method1378();
		} else if (arg1 == 2) {
			this.anInt4947 = arg0.method1386();
		} else if (arg1 == 3) {
			this.anInt4945 = arg0.method1386();
		} else if (arg1 == 4) {
			this.anInt4941 = arg0.method1386();
		} else if (arg1 == 5) {
			this.anInt4940 = arg0.method1386();
		} else if (arg1 == 6) {
			this.anInt4942 = arg0.method1386();
		} else if (arg1 == 7) {
			this.anInt4948 = arg0.method1386();
		}
	}
}

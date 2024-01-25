import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class129 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public int anInt2680;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "Lclient!js;")
	public Class183 aClass183_1;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "[Lclient!js;")
	public Class183[] aClass183Array1;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
	public int anInt2685;

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "[[B")
	public byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	public final int anInt2684;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([BI[B)V")
	public Class129(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt2684 = Static397.method5449(arg0, arg0.length);
		if (arg1 != this.anInt2684) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray41 = Static531.method6992(arg0.length, 0, arg0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray41[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method2310(arg0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[B)V")
	private void method2310(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub7 local12 = new Class2_Sub7(Static250.method3584(arg0));
		@Pc(18) int local18 = local12.method4464();
		if (local18 < 5 || local18 > 6) {
			throw new RuntimeException();
		}
		if (local18 >= 6) {
			this.anInt2680 = local12.method4509();
		} else {
			this.anInt2680 = 0;
		}
		@Pc(49) int local49 = local12.method4464();
		@Pc(57) boolean local57 = (local49 & 0x1) != 0;
		this.anInt2685 = local12.method4518();
		@Pc(70) boolean local70 = (local49 & 0x2) != 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = -1;
		this.anIntArray224 = new int[this.anInt2685];
		for (@Pc(88) int local88 = 0; local88 < this.anInt2685; local88++) {
			this.anIntArray224[local88] = local72 += local12.method4518();
			if (this.anIntArray224[local88] > local74) {
				local74 = this.anIntArray224[local88];
			}
		}
		this.anInt2679 = local74 + 1;
		this.anIntArray222 = new int[this.anInt2679];
		this.anIntArray227 = new int[this.anInt2679];
		this.anIntArray223 = new int[this.anInt2679];
		this.anIntArray225 = new int[this.anInt2679];
		if (local70) {
			this.aByteArrayArray7 = new byte[this.anInt2679][];
		}
		this.anIntArrayArray30 = new int[this.anInt2679][];
		@Pc(163) int local163;
		@Pc(177) int local177;
		if (local57) {
			this.anIntArray226 = new int[this.anInt2679];
			for (local163 = 0; local163 < this.anInt2679; local163++) {
				this.anIntArray226[local163] = -1;
			}
			for (local177 = 0; local177 < this.anInt2685; local177++) {
				this.anIntArray226[this.anIntArray224[local177]] = local12.method4509();
			}
			this.aClass183_1 = new Class183(this.anIntArray226);
		}
		for (local163 = 0; local163 < this.anInt2685; local163++) {
			this.anIntArray225[this.anIntArray224[local163]] = local12.method4509();
		}
		if (local70) {
			for (local177 = 0; local177 < this.anInt2685; local177++) {
				@Pc(233) byte[] local233 = new byte[64];
				local12.method4504(64, local233);
				this.aByteArrayArray7[this.anIntArray224[local177]] = local233;
			}
		}
		for (local177 = 0; local177 < this.anInt2685; local177++) {
			this.anIntArray222[this.anIntArray224[local177]] = local12.method4509();
		}
		for (@Pc(281) int local281 = 0; local281 < this.anInt2685; local281++) {
			this.anIntArray227[this.anIntArray224[local281]] = local12.method4518();
		}
		@Pc(309) int local309;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(326) int local326;
		@Pc(345) int local345;
		for (@Pc(302) int local302 = 0; local302 < this.anInt2685; local302++) {
			local309 = this.anIntArray224[local302];
			local314 = this.anIntArray227[local309];
			local72 = 0;
			this.anIntArrayArray30[local309] = new int[local314];
			local324 = -1;
			for (local326 = 0; local326 < local314; local326++) {
				local345 = this.anIntArrayArray30[local309][local326] = local72 += local12.method4518();
				if (local345 > local324) {
					local324 = local345;
				}
			}
			this.anIntArray223[local309] = local324 + 1;
			if (local314 == local324 + 1) {
				this.anIntArrayArray30[local309] = null;
			}
		}
		if (!local57) {
			return;
		}
		this.aClass183Array1 = new Class183[local74 + 1];
		this.anIntArrayArray29 = new int[local74 + 1][];
		for (local309 = 0; local309 < this.anInt2685; local309++) {
			local314 = this.anIntArray224[local309];
			local324 = this.anIntArray227[local314];
			this.anIntArrayArray29[local314] = new int[this.anIntArray223[local314]];
			for (local326 = 0; local326 < this.anIntArray223[local314]; local326++) {
				this.anIntArrayArray29[local314][local326] = -1;
			}
			for (local345 = 0; local345 < local324; local345++) {
				@Pc(463) int local463;
				if (this.anIntArrayArray30[local314] == null) {
					local463 = local345;
				} else {
					local463 = this.anIntArrayArray30[local314][local345];
				}
				this.anIntArrayArray29[local314][local463] = local12.method4509();
			}
			this.aClass183Array1[local314] = new Class183(this.anIntArrayArray29[local314]);
		}
	}
}

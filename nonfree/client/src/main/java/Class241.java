import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class241 {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "[I")
	public int[] anIntArray457;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	public int anInt7442;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
	public int anInt7443;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!oba", name = "k", descriptor = "Lclient!rv;")
	public Class296 aClass296_1;

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "[I")
	public int[] anIntArray460;

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "[Lclient!rv;")
	public Class296[] aClass296Array1;

	@OriginalMember(owner = "client!oba", name = "s", descriptor = "[I")
	public int[] anIntArray462;

	@OriginalMember(owner = "client!oba", name = "t", descriptor = "[[B")
	public byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!oba", name = "u", descriptor = "I")
	public int anInt7448;

	@OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
	public final int anInt7446;

	@OriginalMember(owner = "client!oba", name = "j", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "([BI[B)V")
	public Class241(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7446 = Static347.method5692(arg0.length, arg0);
		if (arg1 != this.anInt7446) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray75 = Static341.method5638(0, arg0.length, arg0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (arg2[local44] != this.aByteArray75[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6266(arg0);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "([BI)V")
	private void method6266(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub15 local12 = new Class3_Sub15(Static282.method4634(arg0));
		@Pc(16) int local16 = local12.method8401();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt7442 = 0;
		} else {
			this.anInt7442 = local12.method8402();
		}
		@Pc(49) int local49 = local12.method8401();
		@Pc(60) boolean local60 = (local49 & 0x1) != 0;
		@Pc(68) boolean local68 = (local49 & 0x2) != 0;
		this.anInt7443 = local12.method8414();
		@Pc(81) int local81 = 0;
		this.anIntArray459 = new int[this.anInt7443];
		@Pc(88) int local88 = -1;
		for (@Pc(90) int local90 = 0; local90 < this.anInt7443; local90++) {
			this.anIntArray459[local90] = local81 += local12.method8414();
			if (this.anIntArray459[local90] > local88) {
				local88 = this.anIntArray459[local90];
			}
		}
		this.anInt7448 = local88 + 1;
		this.anIntArray460 = new int[this.anInt7448];
		this.anIntArrayArray70 = new int[this.anInt7448][];
		this.anIntArray458 = new int[this.anInt7448];
		this.anIntArray457 = new int[this.anInt7448];
		if (local68) {
			this.aByteArrayArray15 = new byte[this.anInt7448][];
		}
		this.anIntArray461 = new int[this.anInt7448];
		@Pc(165) int local165;
		@Pc(183) int local183;
		if (local60) {
			this.anIntArray462 = new int[this.anInt7448];
			for (local165 = 0; local165 < this.anInt7448; local165++) {
				this.anIntArray462[local165] = -1;
			}
			for (local183 = 0; local183 < this.anInt7443; local183++) {
				this.anIntArray462[this.anIntArray459[local183]] = local12.method8402();
			}
			this.aClass296_1 = new Class296(this.anIntArray462);
		}
		for (local165 = 0; local165 < this.anInt7443; local165++) {
			this.anIntArray461[this.anIntArray459[local165]] = local12.method8402();
		}
		if (local68) {
			for (local183 = 0; local183 < this.anInt7443; local183++) {
				@Pc(239) byte[] local239 = new byte[64];
				local12.method8403(64, 0, local239);
				this.aByteArrayArray15[this.anIntArray459[local183]] = local239;
			}
		}
		for (local183 = 0; local183 < this.anInt7443; local183++) {
			this.anIntArray460[this.anIntArray459[local183]] = local12.method8402();
		}
		for (@Pc(283) int local283 = 0; local283 < this.anInt7443; local283++) {
			this.anIntArray458[this.anIntArray459[local283]] = local12.method8414();
		}
		@Pc(309) int local309;
		@Pc(316) int local316;
		@Pc(318) int local318;
		@Pc(326) int local326;
		@Pc(343) int local343;
		for (@Pc(302) int local302 = 0; local302 < this.anInt7443; local302++) {
			local309 = this.anIntArray459[local302];
			local81 = 0;
			local316 = this.anIntArray458[local309];
			local318 = -1;
			this.anIntArrayArray70[local309] = new int[local316];
			for (local326 = 0; local326 < local316; local326++) {
				local343 = this.anIntArrayArray70[local309][local326] = local81 += local12.method8414();
				if (local318 < local343) {
					local318 = local343;
				}
			}
			this.anIntArray457[local309] = local318 + 1;
			if (local316 == local318 + 1) {
				this.anIntArrayArray70[local309] = null;
			}
		}
		if (!local60) {
			return;
		}
		this.anIntArrayArray69 = new int[local88 + 1][];
		this.aClass296Array1 = new Class296[local88 + 1];
		for (local309 = 0; local309 < this.anInt7443; local309++) {
			local316 = this.anIntArray459[local309];
			local318 = this.anIntArray458[local316];
			this.anIntArrayArray69[local316] = new int[this.anIntArray457[local316]];
			for (local326 = 0; local326 < this.anIntArray457[local316]; local326++) {
				this.anIntArrayArray69[local316][local326] = -1;
			}
			for (local343 = 0; local343 < local318; local343++) {
				@Pc(449) int local449;
				if (this.anIntArrayArray70[local316] == null) {
					local449 = local343;
				} else {
					local449 = this.anIntArrayArray70[local316][local343];
				}
				this.anIntArrayArray69[local316][local449] = local12.method8402();
			}
			this.aClass296Array1[local316] = new Class296(this.anIntArrayArray69[local316]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class287 {

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "[[B")
	public byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
	public int anInt7866;

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "[I")
	public int[] anIntArray627;

	@OriginalMember(owner = "client!qia", name = "f", descriptor = "[I")
	public int[] anIntArray628;

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "[Lclient!hp;")
	public Class147[] aClass147Array1;

	@OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
	public int anInt7869;

	@OriginalMember(owner = "client!qia", name = "j", descriptor = "[I")
	public int[] anIntArray629;

	@OriginalMember(owner = "client!qia", name = "k", descriptor = "[I")
	public int[] anIntArray630;

	@OriginalMember(owner = "client!qia", name = "m", descriptor = "[I")
	public int[] anIntArray631;

	@OriginalMember(owner = "client!qia", name = "p", descriptor = "Lclient!hp;")
	public Class147 aClass147_1;

	@OriginalMember(owner = "client!qia", name = "t", descriptor = "[I")
	public int[] anIntArray633;

	@OriginalMember(owner = "client!qia", name = "u", descriptor = "I")
	public int anInt7873;

	@OriginalMember(owner = "client!qia", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!qia", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
	public final int anInt7867;

	@OriginalMember(owner = "client!qia", name = "n", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "([BI[B)V")
	public Class287(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7867 = Static487.method7154(arg0.length, arg0);
		if (arg1 != this.anInt7867) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray72 = Static39.method715(arg0, arg0.length, 0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray72[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6870(arg0);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "([BI)V")
	private void method6870(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class5_Sub12 local12 = new Class5_Sub12(Static281.method4200(arg0));
		@Pc(16) int local16 = local12.method8645();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt7866 = local12.method8623();
		} else {
			this.anInt7866 = 0;
		}
		@Pc(47) int local47 = local12.method8645();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		this.anInt7869 = local12.method8631();
		@Pc(71) boolean local71 = (local47 & 0x2) != 0;
		@Pc(73) int local73 = 0;
		@Pc(75) int local75 = -1;
		this.anIntArray630 = new int[this.anInt7869];
		for (@Pc(82) int local82 = 0; local82 < this.anInt7869; local82++) {
			this.anIntArray630[local82] = local73 += local12.method8631();
			if (local75 < this.anIntArray630[local82]) {
				local75 = this.anIntArray630[local82];
			}
		}
		this.anInt7873 = local75 + 1;
		this.anIntArray633 = new int[this.anInt7873];
		this.anIntArrayArray47 = new int[this.anInt7873][];
		this.anIntArray628 = new int[this.anInt7873];
		this.anIntArray629 = new int[this.anInt7873];
		if (local71) {
			this.aByteArrayArray20 = new byte[this.anInt7873][];
		}
		this.anIntArray627 = new int[this.anInt7873];
		@Pc(165) int local165;
		@Pc(183) int local183;
		if (local55) {
			this.anIntArray631 = new int[this.anInt7873];
			for (local165 = 0; local165 < this.anInt7873; local165++) {
				this.anIntArray631[local165] = -1;
			}
			for (local183 = 0; local183 < this.anInt7869; local183++) {
				this.anIntArray631[this.anIntArray630[local183]] = local12.method8623();
			}
			this.aClass147_1 = new Class147(this.anIntArray631);
		}
		for (local165 = 0; local165 < this.anInt7869; local165++) {
			this.anIntArray633[this.anIntArray630[local165]] = local12.method8623();
		}
		if (local71) {
			for (local183 = 0; local183 < this.anInt7869; local183++) {
				@Pc(239) byte[] local239 = new byte[64];
				local12.method8625(local239, 0, 64);
				this.aByteArrayArray20[this.anIntArray630[local183]] = local239;
			}
		}
		for (local183 = 0; local183 < this.anInt7869; local183++) {
			this.anIntArray627[this.anIntArray630[local183]] = local12.method8623();
		}
		for (@Pc(285) int local285 = 0; local285 < this.anInt7869; local285++) {
			this.anIntArray629[this.anIntArray630[local285]] = local12.method8631();
		}
		@Pc(311) int local311;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(345) int local345;
		for (@Pc(304) int local304 = 0; local304 < this.anInt7869; local304++) {
			local311 = this.anIntArray630[local304];
			local316 = this.anIntArray629[local311];
			local73 = 0;
			this.anIntArrayArray47[local311] = new int[local316];
			local326 = -1;
			for (local328 = 0; local328 < local316; local328++) {
				local345 = this.anIntArrayArray47[local311][local328] = local73 += local12.method8631();
				if (local345 > local326) {
					local326 = local345;
				}
			}
			this.anIntArray628[local311] = local326 + 1;
			if (local316 == local326 + 1) {
				this.anIntArrayArray47[local311] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.anIntArrayArray46 = new int[local75 + 1][];
		this.aClass147Array1 = new Class147[local75 + 1];
		for (local311 = 0; local311 < this.anInt7869; local311++) {
			local316 = this.anIntArray630[local311];
			local326 = this.anIntArray629[local316];
			this.anIntArrayArray46[local316] = new int[this.anIntArray628[local316]];
			for (local328 = 0; local328 < this.anIntArray628[local316]; local328++) {
				this.anIntArrayArray46[local316][local328] = -1;
			}
			for (local345 = 0; local345 < local326; local345++) {
				@Pc(455) int local455;
				if (this.anIntArrayArray47[local316] == null) {
					local455 = local345;
				} else {
					local455 = this.anIntArrayArray47[local316][local345];
				}
				this.anIntArrayArray46[local316][local455] = local12.method8623();
			}
			this.aClass147Array1[local316] = new Class147(this.anIntArrayArray46[local316]);
		}
	}
}

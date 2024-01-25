import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class317 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
	public int anInt9411;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	public int anInt9413;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	public int anInt9415;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
	public int[] anIntArray824;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!mt;")
	public Class191 aClass191_1;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "[I")
	public int[] anIntArray825;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "[Lclient!mt;")
	public Class191[] aClass191Array1;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray122;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "[[B")
	public byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "[I")
	public int[] anIntArray826;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
	public int[] anIntArray827;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "[I")
	public int[] anIntArray828;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "[I")
	public int[] anIntArray829;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray123;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	public final int anInt9412;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[B")
	private byte[] aByteArray117;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([BI[B)V")
	public Class317(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt9412 = Static304.method5354(arg0.length, arg0);
		if (arg1 != this.anInt9412) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray117 = Static271.method4826(0, arg0.length, arg0);
			for (@Pc(38) int local38 = 0; local38 < 64; local38++) {
				if (this.aByteArray117[local38] != arg2[local38]) {
					throw new RuntimeException();
				}
			}
		}
		this.method8115(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B[B)V")
	private void method8115(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub17 local12 = new Class1_Sub17(Static76.method1744(arg0));
		@Pc(16) int local16 = local12.method4487();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt9411 = 0;
		} else {
			this.anInt9411 = local12.method4481();
		}
		@Pc(47) int local47 = local12.method4487();
		@Pc(58) boolean local58 = (local47 & 0x1) != 0;
		this.anInt9415 = local12.method4494();
		@Pc(71) boolean local71 = (local47 & 0x2) != 0;
		@Pc(73) int local73 = 0;
		this.anIntArray825 = new int[this.anInt9415];
		@Pc(80) int local80 = -1;
		for (@Pc(82) int local82 = 0; local82 < this.anInt9415; local82++) {
			this.anIntArray825[local82] = local73 += local12.method4494();
			if (this.anIntArray825[local82] > local80) {
				local80 = this.anIntArray825[local82];
			}
		}
		this.anInt9413 = local80 + 1;
		this.anIntArray828 = new int[this.anInt9413];
		this.anIntArray827 = new int[this.anInt9413];
		this.anIntArray829 = new int[this.anInt9413];
		this.anIntArray826 = new int[this.anInt9413];
		this.anIntArrayArray123 = new int[this.anInt9413][];
		if (local71) {
			this.aByteArrayArray29 = new byte[this.anInt9413][];
		}
		@Pc(157) int local157;
		@Pc(171) int local171;
		if (local58) {
			this.anIntArray824 = new int[this.anInt9413];
			for (local157 = 0; local157 < this.anInt9413; local157++) {
				this.anIntArray824[local157] = -1;
			}
			for (local171 = 0; local171 < this.anInt9415; local171++) {
				this.anIntArray824[this.anIntArray825[local171]] = local12.method4481();
			}
			this.aClass191_1 = new Class191(this.anIntArray824);
		}
		for (local157 = 0; local157 < this.anInt9415; local157++) {
			this.anIntArray827[this.anIntArray825[local157]] = local12.method4481();
		}
		if (local71) {
			for (local171 = 0; local171 < this.anInt9415; local171++) {
				@Pc(237) byte[] local237 = new byte[64];
				local12.method4505(local237, 64);
				this.aByteArrayArray29[this.anIntArray825[local171]] = local237;
			}
		}
		for (local171 = 0; local171 < this.anInt9415; local171++) {
			this.anIntArray828[this.anIntArray825[local171]] = local12.method4481();
		}
		for (@Pc(281) int local281 = 0; local281 < this.anInt9415; local281++) {
			this.anIntArray826[this.anIntArray825[local281]] = local12.method4494();
		}
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(324) int local324;
		@Pc(341) int local341;
		for (@Pc(300) int local300 = 0; local300 < this.anInt9415; local300++) {
			local307 = this.anIntArray825[local300];
			local73 = 0;
			local314 = this.anIntArray826[local307];
			local316 = -1;
			this.anIntArrayArray123[local307] = new int[local314];
			for (local324 = 0; local324 < local314; local324++) {
				local341 = this.anIntArrayArray123[local307][local324] = local73 += local12.method4494();
				if (local316 < local341) {
					local316 = local341;
				}
			}
			this.anIntArray829[local307] = local316 + 1;
			if (local316 + 1 == local314) {
				this.anIntArrayArray123[local307] = null;
			}
		}
		if (!local58) {
			return;
		}
		this.anIntArrayArray122 = new int[local80 + 1][];
		this.aClass191Array1 = new Class191[local80 + 1];
		for (local307 = 0; local307 < this.anInt9415; local307++) {
			local314 = this.anIntArray825[local307];
			local316 = this.anIntArray826[local314];
			this.anIntArrayArray122[local314] = new int[this.anIntArray829[local314]];
			for (local324 = 0; local324 < this.anIntArray829[local314]; local324++) {
				this.anIntArrayArray122[local314][local324] = -1;
			}
			for (local341 = 0; local341 < local316; local341++) {
				@Pc(446) int local446;
				if (this.anIntArrayArray123[local314] == null) {
					local446 = local341;
				} else {
					local446 = this.anIntArrayArray123[local314][local341];
				}
				this.anIntArrayArray122[local314][local446] = local12.method4481();
			}
			this.aClass191Array1[local314] = new Class191(this.anIntArrayArray122[local314]);
		}
	}
}

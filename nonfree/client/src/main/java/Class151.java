import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class151 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "[I")
	public int[] anIntArray220;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "[Lclient!sq;")
	public Class306[] aClass306Array1;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "I")
	public int anInt4713;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!sq;")
	public Class306 aClass306_1;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "I")
	public int anInt4714;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "[[B")
	public byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "I")
	public int anInt4716;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "I")
	public final int anInt4717;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "[B")
	private byte[] aByteArray111;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "([BI[B)V")
	public Class151(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt4717 = Static143.method2747(arg0.length, arg0);
		if (this.anInt4717 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray111 = Static345.method5013(arg0, arg0.length, 0);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray111[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method3768(arg0);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I[B)V")
	private void method3768(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub26 local12 = new Class3_Sub26(Static156.method2877(arg0));
		@Pc(16) int local16 = local12.method6814();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt4714 = 0;
		} else {
			this.anInt4714 = local12.method6816();
		}
		@Pc(45) int local45 = local12.method6814();
		@Pc(53) boolean local53 = (local45 & 0x1) != 0;
		@Pc(64) boolean local64 = (local45 & 0x2) != 0;
		this.anInt4716 = local12.method6811();
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = -1;
		this.anIntArray219 = new int[this.anInt4716];
		for (@Pc(86) int local86 = 0; local86 < this.anInt4716; local86++) {
			this.anIntArray219[local86] = local71 += local12.method6811();
			if (local73 < this.anIntArray219[local86]) {
				local73 = this.anIntArray219[local86];
			}
		}
		this.anInt4713 = local73 + 1;
		this.anIntArray221 = new int[this.anInt4713];
		this.anIntArray223 = new int[this.anInt4713];
		this.anIntArray222 = new int[this.anInt4713];
		this.anIntArray218 = new int[this.anInt4713];
		this.anIntArrayArray46 = new int[this.anInt4713][];
		if (local64) {
			this.aByteArrayArray24 = new byte[this.anInt4713][];
		}
		@Pc(169) int local169;
		@Pc(187) int local187;
		if (local53) {
			this.anIntArray220 = new int[this.anInt4713];
			for (local169 = 0; local169 < this.anInt4713; local169++) {
				this.anIntArray220[local169] = -1;
			}
			for (local187 = 0; local187 < this.anInt4716; local187++) {
				this.anIntArray220[this.anIntArray219[local187]] = local12.method6816();
			}
			this.aClass306_1 = new Class306(this.anIntArray220);
		}
		for (local169 = 0; local169 < this.anInt4716; local169++) {
			this.anIntArray221[this.anIntArray219[local169]] = local12.method6816();
		}
		if (local64) {
			for (local187 = 0; local187 < this.anInt4716; local187++) {
				@Pc(239) byte[] local239 = new byte[64];
				local12.method6794(local239, 64);
				this.aByteArrayArray24[this.anIntArray219[local187]] = local239;
			}
		}
		for (local187 = 0; local187 < this.anInt4716; local187++) {
			this.anIntArray223[this.anIntArray219[local187]] = local12.method6816();
		}
		for (@Pc(283) int local283 = 0; local283 < this.anInt4716; local283++) {
			this.anIntArray218[this.anIntArray219[local283]] = local12.method6811();
		}
		@Pc(313) int local313;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(330) int local330;
		@Pc(347) int local347;
		for (@Pc(306) int local306 = 0; local306 < this.anInt4716; local306++) {
			local313 = this.anIntArray219[local306];
			local71 = 0;
			local320 = this.anIntArray218[local313];
			local322 = -1;
			this.anIntArrayArray46[local313] = new int[local320];
			for (local330 = 0; local330 < local320; local330++) {
				local347 = this.anIntArrayArray46[local313][local330] = local71 += local12.method6811();
				if (local322 < local347) {
					local322 = local347;
				}
			}
			this.anIntArray222[local313] = local322 + 1;
			if (local322 + 1 == local320) {
				this.anIntArrayArray46[local313] = null;
			}
		}
		if (!local53) {
			return;
		}
		this.aClass306Array1 = new Class306[local73 + 1];
		this.anIntArrayArray47 = new int[local73 + 1][];
		for (local313 = 0; local313 < this.anInt4716; local313++) {
			local320 = this.anIntArray219[local313];
			local322 = this.anIntArray218[local320];
			this.anIntArrayArray47[local320] = new int[this.anIntArray222[local320]];
			for (local330 = 0; local330 < this.anIntArray222[local320]; local330++) {
				this.anIntArrayArray47[local320][local330] = -1;
			}
			for (local347 = 0; local347 < local322; local347++) {
				@Pc(448) int local448;
				if (this.anIntArrayArray46[local320] == null) {
					local448 = local347;
				} else {
					local448 = this.anIntArrayArray46[local320][local347];
				}
				this.anIntArrayArray47[local320][local448] = local12.method6816();
			}
			this.aClass306Array1[local320] = new Class306(this.anIntArrayArray47[local320]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class85 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	public int anInt2073;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!id;")
	public Class152 aClass152_1;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "[Lclient!id;")
	public Class152[] aClass152Array1;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "[[B")
	public byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
	public int anInt2076;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
	public final int anInt2075;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "([BI[B)V")
	public Class85(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt2075 = Static209.method3350(arg0, arg0.length);
		if (this.anInt2075 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray23 = Static1.method1(arg0.length, arg0, 0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray23[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method1513(arg0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[B)V")
	private void method1513(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub15 local12 = new Class2_Sub15(Static123.method1788(arg0));
		@Pc(16) int local16 = local12.method4325();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt2073 = local12.method4307();
		} else {
			this.anInt2073 = 0;
		}
		@Pc(47) int local47 = local12.method4325();
		@Pc(58) boolean local58 = (local47 & 0x1) != 0;
		@Pc(66) boolean local66 = (local47 & 0x2) != 0;
		this.anInt2076 = local12.method4294();
		@Pc(73) int local73 = 0;
		this.anIntArray114 = new int[this.anInt2076];
		@Pc(80) int local80 = -1;
		for (@Pc(82) int local82 = 0; local82 < this.anInt2076; local82++) {
			this.anIntArray114[local82] = local73 += local12.method4294();
			if (this.anIntArray114[local82] > local80) {
				local80 = this.anIntArray114[local82];
			}
		}
		this.anInt2074 = local80 + 1;
		this.anIntArrayArray8 = new int[this.anInt2074][];
		this.anIntArray117 = new int[this.anInt2074];
		this.anIntArray116 = new int[this.anInt2074];
		this.anIntArray112 = new int[this.anInt2074];
		this.anIntArray113 = new int[this.anInt2074];
		if (local66) {
			this.aByteArrayArray7 = new byte[this.anInt2074][];
		}
		@Pc(161) int local161;
		@Pc(175) int local175;
		if (local58) {
			this.anIntArray115 = new int[this.anInt2074];
			for (local161 = 0; local161 < this.anInt2074; local161++) {
				this.anIntArray115[local161] = -1;
			}
			for (local175 = 0; local175 < this.anInt2076; local175++) {
				this.anIntArray115[this.anIntArray114[local175]] = local12.method4307();
			}
			this.aClass152_1 = new Class152(this.anIntArray115);
		}
		for (local161 = 0; local161 < this.anInt2076; local161++) {
			this.anIntArray116[this.anIntArray114[local161]] = local12.method4307();
		}
		if (local66) {
			for (local175 = 0; local175 < this.anInt2076; local175++) {
				@Pc(231) byte[] local231 = new byte[64];
				local12.method4346(local231, 64);
				this.aByteArrayArray7[this.anIntArray114[local175]] = local231;
			}
		}
		for (local175 = 0; local175 < this.anInt2076; local175++) {
			this.anIntArray112[this.anIntArray114[local175]] = local12.method4307();
		}
		for (@Pc(275) int local275 = 0; local275 < this.anInt2076; local275++) {
			this.anIntArray117[this.anIntArray114[local275]] = local12.method4294();
		}
		@Pc(305) int local305;
		@Pc(310) int local310;
		@Pc(314) int local314;
		@Pc(322) int local322;
		@Pc(339) int local339;
		for (@Pc(298) int local298 = 0; local298 < this.anInt2076; local298++) {
			local305 = this.anIntArray114[local298];
			local310 = this.anIntArray117[local305];
			local73 = 0;
			local314 = -1;
			this.anIntArrayArray8[local305] = new int[local310];
			for (local322 = 0; local322 < local310; local322++) {
				local339 = this.anIntArrayArray8[local305][local322] = local73 += local12.method4294();
				if (local314 < local339) {
					local314 = local339;
				}
			}
			this.anIntArray113[local305] = local314 + 1;
			if (local314 + 1 == local310) {
				this.anIntArrayArray8[local305] = null;
			}
		}
		if (!local58) {
			return;
		}
		this.aClass152Array1 = new Class152[local80 + 1];
		this.anIntArrayArray9 = new int[local80 + 1][];
		for (local305 = 0; local305 < this.anInt2076; local305++) {
			local310 = this.anIntArray114[local305];
			local314 = this.anIntArray117[local310];
			this.anIntArrayArray9[local310] = new int[this.anIntArray113[local310]];
			for (local322 = 0; local322 < this.anIntArray113[local310]; local322++) {
				this.anIntArrayArray9[local310][local322] = -1;
			}
			for (local339 = 0; local339 < local314; local339++) {
				@Pc(449) int local449;
				if (this.anIntArrayArray8[local310] == null) {
					local449 = local339;
				} else {
					local449 = this.anIntArrayArray8[local310][local339];
				}
				this.anIntArrayArray9[local310][local449] = local12.method4307();
			}
			this.aClass152Array1[local310] = new Class152(this.anIntArrayArray9[local310]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class99 {

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "I")
	public int anInt2727;

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
	public int anInt2730;

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "[[B")
	public byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "[Lclient!pg;")
	public Class266[] aClass266Array1;

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!fga", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fga", name = "q", descriptor = "Lclient!pg;")
	public Class266 aClass266_1;

	@OriginalMember(owner = "client!fga", name = "r", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
	public final int anInt2731;

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "([BI[B)V")
	public Class99(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt2731 = Static330.method4877(arg0.length, arg0);
		if (this.anInt2731 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray12 = Static387.method5581(arg0, 0, arg0.length);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray12[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method2403(arg0);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(B[B)V")
	private void method2403(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub3 local12 = new Class1_Sub3(Static258.method3756(arg0));
		@Pc(16) int local16 = local12.method7974();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt2730 = 0;
		} else {
			this.anInt2730 = local12.method7940();
		}
		@Pc(47) int local47 = local12.method7974();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		@Pc(63) boolean local63 = (local47 & 0x2) != 0;
		this.anInt2728 = local12.method7945();
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = -1;
		this.anIntArray122 = new int[this.anInt2728];
		for (@Pc(79) int local79 = 0; local79 < this.anInt2728; local79++) {
			this.anIntArray122[local79] = local70 += local12.method7945();
			if (this.anIntArray122[local79] > local72) {
				local72 = this.anIntArray122[local79];
			}
		}
		this.anInt2727 = local72 + 1;
		this.anIntArrayArray9 = new int[this.anInt2727][];
		this.anIntArray120 = new int[this.anInt2727];
		this.anIntArray121 = new int[this.anInt2727];
		this.anIntArray118 = new int[this.anInt2727];
		if (local63) {
			this.aByteArrayArray4 = new byte[this.anInt2727][];
		}
		this.anIntArray119 = new int[this.anInt2727];
		@Pc(160) int local160;
		@Pc(174) int local174;
		if (local55) {
			this.anIntArray117 = new int[this.anInt2727];
			for (local160 = 0; local160 < this.anInt2727; local160++) {
				this.anIntArray117[local160] = -1;
			}
			for (local174 = 0; local174 < this.anInt2728; local174++) {
				this.anIntArray117[this.anIntArray122[local174]] = local12.method7940();
			}
			this.aClass266_1 = new Class266(this.anIntArray117);
		}
		for (local160 = 0; local160 < this.anInt2728; local160++) {
			this.anIntArray119[this.anIntArray122[local160]] = local12.method7940();
		}
		if (local63) {
			for (local174 = 0; local174 < this.anInt2728; local174++) {
				@Pc(234) byte[] local234 = new byte[64];
				local12.method7957(local234, 64);
				this.aByteArrayArray4[this.anIntArray122[local174]] = local234;
			}
		}
		for (local174 = 0; local174 < this.anInt2728; local174++) {
			this.anIntArray120[this.anIntArray122[local174]] = local12.method7940();
		}
		for (@Pc(278) int local278 = 0; local278 < this.anInt2728; local278++) {
			this.anIntArray118[this.anIntArray122[local278]] = local12.method7945();
		}
		@Pc(308) int local308;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(325) int local325;
		@Pc(342) int local342;
		for (@Pc(301) int local301 = 0; local301 < this.anInt2728; local301++) {
			local308 = this.anIntArray122[local301];
			local70 = 0;
			local315 = this.anIntArray118[local308];
			local317 = -1;
			this.anIntArrayArray9[local308] = new int[local315];
			for (local325 = 0; local325 < local315; local325++) {
				local342 = this.anIntArrayArray9[local308][local325] = local70 += local12.method7945();
				if (local342 > local317) {
					local317 = local342;
				}
			}
			this.anIntArray121[local308] = local317 + 1;
			if (local317 + 1 == local315) {
				this.anIntArrayArray9[local308] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.aClass266Array1 = new Class266[local72 + 1];
		this.anIntArrayArray8 = new int[local72 + 1][];
		for (local308 = 0; local308 < this.anInt2728; local308++) {
			local315 = this.anIntArray122[local308];
			local317 = this.anIntArray118[local315];
			this.anIntArrayArray8[local315] = new int[this.anIntArray121[local315]];
			for (local325 = 0; local325 < this.anIntArray121[local315]; local325++) {
				this.anIntArrayArray8[local315][local325] = -1;
			}
			for (local342 = 0; local342 < local317; local342++) {
				@Pc(451) int local451;
				if (this.anIntArrayArray9[local315] == null) {
					local451 = local342;
				} else {
					local451 = this.anIntArrayArray9[local315][local342];
				}
				this.anIntArrayArray8[local315][local451] = local12.method7940();
			}
			this.aClass266Array1[local315] = new Class266(this.anIntArrayArray8[local315]);
		}
	}
}

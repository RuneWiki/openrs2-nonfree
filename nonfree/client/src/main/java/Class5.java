import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class5 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
	public int anInt241;

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "[Lclient!rd;")
	public Class283[] aClass283Array1;

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "Lclient!rd;")
	public Class283 aClass283_1;

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
	public int anInt242;

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!aca", name = "p", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "[[B")
	public byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!aca", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
	public final int anInt240;

	@OriginalMember(owner = "client!aca", name = "j", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "([BI[B)V")
	public Class5(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt240 = Static369.method5528(arg0.length, arg0);
		if (arg1 != this.anInt240) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray4 = Static222.method3989(0, arg0.length, arg0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (this.aByteArray4[local42] != arg2[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method160(arg0);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I[B)V")
	private void method160(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class6_Sub21 local14 = new Class6_Sub21(Static351.method7783(arg0));
		@Pc(18) int local18 = local14.method6069();
		if (local18 < 5 || local18 > 6) {
			throw new RuntimeException();
		}
		if (local18 >= 6) {
			this.anInt241 = local14.method6036();
		} else {
			this.anInt241 = 0;
		}
		@Pc(47) int local47 = local14.method6069();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		@Pc(66) boolean local66 = (local47 & 0x2) != 0;
		this.anInt243 = local14.method6003();
		@Pc(73) int local73 = 0;
		@Pc(75) int local75 = -1;
		this.anIntArray22 = new int[this.anInt243];
		for (@Pc(82) int local82 = 0; local82 < this.anInt243; local82++) {
			this.anIntArray22[local82] = local73 += local14.method6003();
			if (local75 < this.anIntArray22[local82]) {
				local75 = this.anIntArray22[local82];
			}
		}
		this.anInt242 = local75 + 1;
		this.anIntArray19 = new int[this.anInt242];
		if (local66) {
			this.aByteArrayArray1 = new byte[this.anInt242][];
		}
		this.anIntArray21 = new int[this.anInt242];
		this.anIntArrayArray3 = new int[this.anInt242][];
		this.anIntArray18 = new int[this.anInt242];
		this.anIntArray20 = new int[this.anInt242];
		@Pc(163) int local163;
		@Pc(177) int local177;
		if (local55) {
			this.anIntArray23 = new int[this.anInt242];
			for (local163 = 0; local163 < this.anInt242; local163++) {
				this.anIntArray23[local163] = -1;
			}
			for (local177 = 0; local177 < this.anInt243; local177++) {
				this.anIntArray23[this.anIntArray22[local177]] = local14.method6036();
			}
			this.aClass283_1 = new Class283(this.anIntArray23);
		}
		for (local163 = 0; local163 < this.anInt243; local163++) {
			this.anIntArray19[this.anIntArray22[local163]] = local14.method6036();
		}
		if (local66) {
			for (local177 = 0; local177 < this.anInt243; local177++) {
				@Pc(231) byte[] local231 = new byte[64];
				local14.method6053(64, local231);
				this.aByteArrayArray1[this.anIntArray22[local177]] = local231;
			}
		}
		for (local177 = 0; local177 < this.anInt243; local177++) {
			this.anIntArray20[this.anIntArray22[local177]] = local14.method6036();
		}
		for (@Pc(277) int local277 = 0; local277 < this.anInt243; local277++) {
			this.anIntArray21[this.anIntArray22[local277]] = local14.method6003();
		}
		@Pc(307) int local307;
		@Pc(312) int local312;
		@Pc(322) int local322;
		@Pc(324) int local324;
		@Pc(341) int local341;
		for (@Pc(300) int local300 = 0; local300 < this.anInt243; local300++) {
			local307 = this.anIntArray22[local300];
			local312 = this.anIntArray21[local307];
			local73 = 0;
			this.anIntArrayArray3[local307] = new int[local312];
			local322 = -1;
			for (local324 = 0; local324 < local312; local324++) {
				local341 = this.anIntArrayArray3[local307][local324] = local73 += local14.method6003();
				if (local341 > local322) {
					local322 = local341;
				}
			}
			this.anIntArray18[local307] = local322 + 1;
			if (local322 + 1 == local312) {
				this.anIntArrayArray3[local307] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.aClass283Array1 = new Class283[local75 + 1];
		this.anIntArrayArray2 = new int[local75 + 1][];
		for (local307 = 0; local307 < this.anInt243; local307++) {
			local312 = this.anIntArray22[local307];
			local322 = this.anIntArray21[local312];
			this.anIntArrayArray2[local312] = new int[this.anIntArray18[local312]];
			for (local324 = 0; local324 < this.anIntArray18[local312]; local324++) {
				this.anIntArrayArray2[local312][local324] = -1;
			}
			for (local341 = 0; local341 < local322; local341++) {
				@Pc(442) int local442;
				if (this.anIntArrayArray3[local312] == null) {
					local442 = local341;
				} else {
					local442 = this.anIntArrayArray3[local312][local341];
				}
				this.anIntArrayArray2[local312][local442] = local14.method6036();
			}
			this.aClass283Array1[local312] = new Class283(this.anIntArrayArray2[local312]);
		}
	}
}

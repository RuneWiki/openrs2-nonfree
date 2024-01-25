import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class99 {

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
	public int anInt2485;

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "Lclient!bia;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
	public int anInt2490;

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "[[B")
	public byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ega", name = "p", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!ega", name = "q", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!ega", name = "u", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!ega", name = "v", descriptor = "[Lclient!bia;")
	public Class38[] aClass38Array1;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
	public final int anInt2484;

	@OriginalMember(owner = "client!ega", name = "t", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "([BI[B)V")
	public Class99(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt2484 = Static131.method2270(arg0.length, arg0);
		if (this.anInt2484 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray19 = Static62.method1526(arg0.length, arg0, 0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (this.aByteArray19[local42] != arg2[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method2282(arg0);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "([BI)V")
	private void method2282(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub17 local12 = new Class3_Sub17(Static55.method1383(arg0));
		@Pc(16) int local16 = local12.method4888();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt2487 = 0;
		} else {
			this.anInt2487 = local12.method4868();
		}
		@Pc(47) int local47 = local12.method4888();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		@Pc(66) boolean local66 = (local47 & 0x2) != 0;
		this.anInt2485 = local12.method4858();
		@Pc(73) int local73 = 0;
		this.anIntArray165 = new int[this.anInt2485];
		@Pc(80) int local80 = -1;
		for (@Pc(82) int local82 = 0; local82 < this.anInt2485; local82++) {
			this.anIntArray165[local82] = local73 += local12.method4858();
			if (this.anIntArray165[local82] > local80) {
				local80 = this.anIntArray165[local82];
			}
		}
		this.anInt2490 = local80 + 1;
		this.anIntArrayArray33 = new int[this.anInt2490][];
		this.anIntArray166 = new int[this.anInt2490];
		if (local66) {
			this.aByteArrayArray1 = new byte[this.anInt2490][];
		}
		this.anIntArray169 = new int[this.anInt2490];
		this.anIntArray164 = new int[this.anInt2490];
		this.anIntArray168 = new int[this.anInt2490];
		@Pc(165) int local165;
		@Pc(179) int local179;
		if (local55) {
			this.anIntArray167 = new int[this.anInt2490];
			for (local165 = 0; local165 < this.anInt2490; local165++) {
				this.anIntArray167[local165] = -1;
			}
			for (local179 = 0; local179 < this.anInt2485; local179++) {
				this.anIntArray167[this.anIntArray165[local179]] = local12.method4868();
			}
			this.aClass38_1 = new Class38(this.anIntArray167);
		}
		for (local165 = 0; local165 < this.anInt2485; local165++) {
			this.anIntArray164[this.anIntArray165[local165]] = local12.method4868();
		}
		if (local66) {
			for (local179 = 0; local179 < this.anInt2485; local179++) {
				@Pc(242) byte[] local242 = new byte[64];
				local12.method4832(local242, 0, 64);
				this.aByteArrayArray1[this.anIntArray165[local179]] = local242;
			}
		}
		for (local179 = 0; local179 < this.anInt2485; local179++) {
			this.anIntArray169[this.anIntArray165[local179]] = local12.method4868();
		}
		for (@Pc(286) int local286 = 0; local286 < this.anInt2485; local286++) {
			this.anIntArray168[this.anIntArray165[local286]] = local12.method4858();
		}
		@Pc(312) int local312;
		@Pc(317) int local317;
		@Pc(327) int local327;
		@Pc(329) int local329;
		@Pc(346) int local346;
		for (@Pc(305) int local305 = 0; local305 < this.anInt2485; local305++) {
			local312 = this.anIntArray165[local305];
			local317 = this.anIntArray168[local312];
			local73 = 0;
			this.anIntArrayArray33[local312] = new int[local317];
			local327 = -1;
			for (local329 = 0; local329 < local317; local329++) {
				local346 = this.anIntArrayArray33[local312][local329] = local73 += local12.method4858();
				if (local346 > local327) {
					local327 = local346;
				}
			}
			this.anIntArray166[local312] = local327 + 1;
			if (local317 == local327 + 1) {
				this.anIntArrayArray33[local312] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.aClass38Array1 = new Class38[local80 + 1];
		this.anIntArrayArray34 = new int[local80 + 1][];
		for (local312 = 0; local312 < this.anInt2485; local312++) {
			local317 = this.anIntArray165[local312];
			local327 = this.anIntArray168[local317];
			this.anIntArrayArray34[local317] = new int[this.anIntArray166[local317]];
			for (local329 = 0; local329 < this.anIntArray166[local317]; local329++) {
				this.anIntArrayArray34[local317][local329] = -1;
			}
			for (local346 = 0; local346 < local327; local346++) {
				@Pc(456) int local456;
				if (this.anIntArrayArray33[local317] == null) {
					local456 = local346;
				} else {
					local456 = this.anIntArrayArray33[local317][local346];
				}
				this.anIntArrayArray34[local317][local456] = local12.method4868();
			}
			this.aClass38Array1[local317] = new Class38(this.anIntArrayArray34[local317]);
		}
	}
}

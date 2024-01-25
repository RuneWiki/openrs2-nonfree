import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class191 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!pr;")
	public Class262 aClass262_1;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public int anInt5084;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "[Lclient!pr;")
	public Class262[] aClass262Array1;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	public int anInt5089;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "I")
	public int anInt5090;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "[[B")
	public byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "I")
	public final int anInt5091;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "([BI[B)V")
	public Class191(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt5091 = Static252.method7833(arg0, arg0.length);
		if (arg1 != this.anInt5091) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray51 = Static149.method2389(arg0.length, arg0, 0);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (this.aByteArray51[local40] != arg2[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method4281(arg0);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[B)V")
	private void method4281(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub20 local12 = new Class1_Sub20(Static264.method4167(arg0));
		@Pc(16) int local16 = local12.method4393();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt5089 = local12.method4371();
		} else {
			this.anInt5089 = 0;
		}
		@Pc(45) int local45 = local12.method4393();
		@Pc(53) boolean local53 = (local45 & 0x1) != 0;
		this.anInt5090 = local12.method4426();
		@Pc(71) boolean local71 = (local45 & 0x2) != 0;
		@Pc(73) int local73 = 0;
		@Pc(75) int local75 = -1;
		this.anIntArray307 = new int[this.anInt5090];
		for (@Pc(82) int local82 = 0; local82 < this.anInt5090; local82++) {
			this.anIntArray307[local82] = local73 += local12.method4426();
			if (local75 < this.anIntArray307[local82]) {
				local75 = this.anIntArray307[local82];
			}
		}
		this.anInt5084 = local75 + 1;
		this.anIntArray308 = new int[this.anInt5084];
		this.anIntArray309 = new int[this.anInt5084];
		this.anIntArray305 = new int[this.anInt5084];
		this.anIntArrayArray34 = new int[this.anInt5084][];
		this.anIntArray310 = new int[this.anInt5084];
		if (local71) {
			this.aByteArrayArray17 = new byte[this.anInt5084][];
		}
		@Pc(167) int local167;
		@Pc(181) int local181;
		if (local53) {
			this.anIntArray306 = new int[this.anInt5084];
			for (local167 = 0; local167 < this.anInt5084; local167++) {
				this.anIntArray306[local167] = -1;
			}
			for (local181 = 0; local181 < this.anInt5090; local181++) {
				this.anIntArray306[this.anIntArray307[local181]] = local12.method4371();
			}
			this.aClass262_1 = new Class262(this.anIntArray306);
		}
		for (local167 = 0; local167 < this.anInt5090; local167++) {
			this.anIntArray305[this.anIntArray307[local167]] = local12.method4371();
		}
		if (local71) {
			for (local181 = 0; local181 < this.anInt5090; local181++) {
				@Pc(237) byte[] local237 = new byte[64];
				local12.method4425(local237, 64);
				this.aByteArrayArray17[this.anIntArray307[local181]] = local237;
			}
		}
		for (local181 = 0; local181 < this.anInt5090; local181++) {
			this.anIntArray309[this.anIntArray307[local181]] = local12.method4371();
		}
		for (@Pc(283) int local283 = 0; local283 < this.anInt5090; local283++) {
			this.anIntArray308[this.anIntArray307[local283]] = local12.method4426();
		}
		@Pc(313) int local313;
		@Pc(320) int local320;
		@Pc(328) int local328;
		@Pc(330) int local330;
		@Pc(347) int local347;
		for (@Pc(306) int local306 = 0; local306 < this.anInt5090; local306++) {
			local313 = this.anIntArray307[local306];
			local73 = 0;
			local320 = this.anIntArray308[local313];
			this.anIntArrayArray34[local313] = new int[local320];
			local328 = -1;
			for (local330 = 0; local330 < local320; local330++) {
				local347 = this.anIntArrayArray34[local313][local330] = local73 += local12.method4426();
				if (local328 < local347) {
					local328 = local347;
				}
			}
			this.anIntArray310[local313] = local328 + 1;
			if (local328 + 1 == local320) {
				this.anIntArrayArray34[local313] = null;
			}
		}
		if (!local53) {
			return;
		}
		this.anIntArrayArray35 = new int[local75 + 1][];
		this.aClass262Array1 = new Class262[local75 + 1];
		for (local313 = 0; local313 < this.anInt5090; local313++) {
			local320 = this.anIntArray307[local313];
			local328 = this.anIntArray308[local320];
			this.anIntArrayArray35[local320] = new int[this.anIntArray310[local320]];
			for (local330 = 0; local330 < this.anIntArray310[local320]; local330++) {
				this.anIntArrayArray35[local320][local330] = -1;
			}
			for (local347 = 0; local347 < local328; local347++) {
				@Pc(452) int local452;
				if (this.anIntArrayArray34[local320] == null) {
					local452 = local347;
				} else {
					local452 = this.anIntArrayArray34[local320][local347];
				}
				this.anIntArrayArray35[local320][local452] = local12.method4371();
			}
			this.aClass262Array1[local320] = new Class262(this.anIntArrayArray35[local320]);
		}
	}
}

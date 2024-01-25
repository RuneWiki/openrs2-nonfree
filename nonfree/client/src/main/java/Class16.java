import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class16 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "[[B")
	public byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "Lclient!jk;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "[Lclient!jk;")
	public Class174[] aClass174Array1;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
	public final int anInt296;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "([BI[B)V")
	public Class16(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt296 = Static370.method4985(arg0.length, arg0);
		if (arg1 != this.anInt296) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray5 = Static532.method7304(arg0.length, arg0, 0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (this.aByteArray5[local42] != arg2[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method243(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[B)V")
	private void method243(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub35 local12 = new Class1_Sub35(Static490.method6643(arg0));
		@Pc(16) int local16 = local12.method5750();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt295 = local12.method5804();
		} else {
			this.anInt295 = 0;
		}
		@Pc(43) int local43 = local12.method5750();
		@Pc(54) boolean local54 = (local43 & 0x1) != 0;
		this.anInt297 = local12.method5771();
		@Pc(67) boolean local67 = (local43 & 0x2) != 0;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = -1;
		this.anIntArray35 = new int[this.anInt297];
		for (@Pc(78) int local78 = 0; local78 < this.anInt297; local78++) {
			this.anIntArray35[local78] = local69 += local12.method5771();
			if (this.anIntArray35[local78] > local71) {
				local71 = this.anIntArray35[local78];
			}
		}
		this.anInt298 = local71 + 1;
		if (local67) {
			this.aByteArrayArray1 = new byte[this.anInt298][];
		}
		this.anIntArray33 = new int[this.anInt298];
		this.anIntArray31 = new int[this.anInt298];
		this.anIntArray32 = new int[this.anInt298];
		this.anIntArray36 = new int[this.anInt298];
		this.anIntArrayArray16 = new int[this.anInt298][];
		@Pc(165) int local165;
		@Pc(183) int local183;
		if (local54) {
			this.anIntArray34 = new int[this.anInt298];
			for (local165 = 0; local165 < this.anInt298; local165++) {
				this.anIntArray34[local165] = -1;
			}
			for (local183 = 0; local183 < this.anInt297; local183++) {
				this.anIntArray34[this.anIntArray35[local183]] = local12.method5804();
			}
			this.aClass174_1 = new Class174(this.anIntArray34);
		}
		for (local165 = 0; local165 < this.anInt297; local165++) {
			this.anIntArray31[this.anIntArray35[local165]] = local12.method5804();
		}
		if (local67) {
			for (local183 = 0; local183 < this.anInt297; local183++) {
				@Pc(239) byte[] local239 = new byte[64];
				local12.method5800(local239, 64);
				this.aByteArrayArray1[this.anIntArray35[local183]] = local239;
			}
		}
		for (local183 = 0; local183 < this.anInt297; local183++) {
			this.anIntArray36[this.anIntArray35[local183]] = local12.method5804();
		}
		for (@Pc(283) int local283 = 0; local283 < this.anInt297; local283++) {
			this.anIntArray32[this.anIntArray35[local283]] = local12.method5771();
		}
		@Pc(313) int local313;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(330) int local330;
		@Pc(347) int local347;
		for (@Pc(306) int local306 = 0; local306 < this.anInt297; local306++) {
			local313 = this.anIntArray35[local306];
			local69 = 0;
			local320 = this.anIntArray32[local313];
			local322 = -1;
			this.anIntArrayArray16[local313] = new int[local320];
			for (local330 = 0; local330 < local320; local330++) {
				local347 = this.anIntArrayArray16[local313][local330] = local69 += local12.method5771();
				if (local322 < local347) {
					local322 = local347;
				}
			}
			this.anIntArray33[local313] = local322 + 1;
			if (local322 + 1 == local320) {
				this.anIntArrayArray16[local313] = null;
			}
		}
		if (!local54) {
			return;
		}
		this.aClass174Array1 = new Class174[local71 + 1];
		this.anIntArrayArray17 = new int[local71 + 1][];
		for (local313 = 0; local313 < this.anInt297; local313++) {
			local320 = this.anIntArray35[local313];
			local322 = this.anIntArray32[local320];
			this.anIntArrayArray17[local320] = new int[this.anIntArray33[local320]];
			for (local330 = 0; local330 < this.anIntArray33[local320]; local330++) {
				this.anIntArrayArray17[local320][local330] = -1;
			}
			for (local347 = 0; local347 < local322; local347++) {
				@Pc(461) int local461;
				if (this.anIntArrayArray16[local320] == null) {
					local461 = local347;
				} else {
					local461 = this.anIntArrayArray16[local320][local347];
				}
				this.anIntArrayArray17[local320][local461] = local12.method5804();
			}
			this.aClass174Array1[local320] = new Class174(this.anIntArrayArray17[local320]);
		}
	}
}

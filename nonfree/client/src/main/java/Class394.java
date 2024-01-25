import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class394 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "[Lclient!kq;")
	public Class201[] aClass201Array1;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "[I")
	public int[] anIntArray598;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "[[B")
	public byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
	public int anInt11410;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	public int anInt11411;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "[I")
	public int[] anIntArray600;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "Lclient!kq;")
	public Class201 aClass201_1;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "[I")
	public int[] anIntArray601;

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "[I")
	public int[] anIntArray602;

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
	public int anInt11415;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
	public final int anInt11414;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "([BI[B)V")
	public Class394(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt11414 = Static538.method8271(arg0.length, arg0);
		if (this.anInt11414 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray104 = Static590.method8900(arg0, 0, arg0.length);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray104[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method9803(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[B)V")
	private void method9803(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub8 local12 = new Class2_Sub8(Static353.method6086(arg0));
		@Pc(16) int local16 = local12.method5203();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt11415 = 0;
		} else {
			this.anInt11415 = local12.method5172();
		}
		@Pc(49) int local49 = local12.method5203();
		@Pc(57) boolean local57 = (local49 & 0x1) != 0;
		this.anInt11410 = local12.method5211();
		@Pc(73) boolean local73 = (local49 & 0x2) != 0;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = -1;
		this.anIntArray603 = new int[this.anInt11410];
		for (@Pc(84) int local84 = 0; local84 < this.anInt11410; local84++) {
			this.anIntArray603[local84] = local75 += local12.method5211();
			if (local77 < this.anIntArray603[local84]) {
				local77 = this.anIntArray603[local84];
			}
		}
		this.anInt11411 = local77 + 1;
		this.anIntArray598 = new int[this.anInt11411];
		if (local73) {
			this.aByteArrayArray28 = new byte[this.anInt11411][];
		}
		this.anIntArrayArray61 = new int[this.anInt11411][];
		this.anIntArray601 = new int[this.anInt11411];
		this.anIntArray599 = new int[this.anInt11411];
		this.anIntArray602 = new int[this.anInt11411];
		@Pc(167) int local167;
		@Pc(181) int local181;
		if (local57) {
			this.anIntArray600 = new int[this.anInt11411];
			for (local167 = 0; local167 < this.anInt11411; local167++) {
				this.anIntArray600[local167] = -1;
			}
			for (local181 = 0; local181 < this.anInt11410; local181++) {
				this.anIntArray600[this.anIntArray603[local181]] = local12.method5172();
			}
			this.aClass201_1 = new Class201(this.anIntArray600);
		}
		for (local167 = 0; local167 < this.anInt11410; local167++) {
			this.anIntArray599[this.anIntArray603[local167]] = local12.method5172();
		}
		if (local73) {
			for (local181 = 0; local181 < this.anInt11410; local181++) {
				@Pc(237) byte[] local237 = new byte[64];
				local12.method5176(local237, 0, 64);
				this.aByteArrayArray28[this.anIntArray603[local181]] = local237;
			}
		}
		for (local181 = 0; local181 < this.anInt11410; local181++) {
			this.anIntArray602[this.anIntArray603[local181]] = local12.method5172();
		}
		for (@Pc(285) int local285 = 0; local285 < this.anInt11410; local285++) {
			this.anIntArray598[this.anIntArray603[local285]] = local12.method5211();
		}
		@Pc(313) int local313;
		@Pc(318) int local318;
		@Pc(322) int local322;
		@Pc(330) int local330;
		@Pc(347) int local347;
		for (@Pc(306) int local306 = 0; local306 < this.anInt11410; local306++) {
			local313 = this.anIntArray603[local306];
			local318 = this.anIntArray598[local313];
			local75 = 0;
			local322 = -1;
			this.anIntArrayArray61[local313] = new int[local318];
			for (local330 = 0; local330 < local318; local330++) {
				local347 = this.anIntArrayArray61[local313][local330] = local75 += local12.method5211();
				if (local322 < local347) {
					local322 = local347;
				}
			}
			this.anIntArray601[local313] = local322 + 1;
			if (local318 == local322 + 1) {
				this.anIntArrayArray61[local313] = null;
			}
		}
		if (!local57) {
			return;
		}
		this.anIntArrayArray62 = new int[local77 + 1][];
		this.aClass201Array1 = new Class201[local77 + 1];
		for (local313 = 0; local313 < this.anInt11410; local313++) {
			local318 = this.anIntArray603[local313];
			local322 = this.anIntArray598[local318];
			this.anIntArrayArray62[local318] = new int[this.anIntArray601[local318]];
			for (local330 = 0; local330 < this.anIntArray601[local318]; local330++) {
				this.anIntArrayArray62[local318][local330] = -1;
			}
			for (local347 = 0; local347 < local322; local347++) {
				@Pc(460) int local460;
				if (this.anIntArrayArray61[local318] == null) {
					local460 = local347;
				} else {
					local460 = this.anIntArrayArray61[local318][local347];
				}
				this.anIntArrayArray62[local318][local460] = local12.method5172();
			}
			this.aClass201Array1[local318] = new Class201(this.anIntArrayArray62[local318]);
		}
	}
}

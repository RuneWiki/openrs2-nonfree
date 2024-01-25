import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class352 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "[Lclient!np;")
	public Class240[] aClass240Array1;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!np;")
	public Class240 aClass240_1;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
	public int[] anIntArray613;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public int anInt9747;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public int anInt9748;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "[I")
	public int[] anIntArray614;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
	public int[] anIntArray616;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "[I")
	public int[] anIntArray617;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
	public int[] anIntArray618;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "[[B")
	public byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public int anInt9751;

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public final int anInt9745;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[B")
	private byte[] aByteArray98;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([BI[B)V")
	public Class352(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt9745 = Static266.method4462(arg0, arg0.length);
		if (this.anInt9745 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray98 = Static152.method2720(0, arg0, arg0.length);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (arg2[local42] != this.aByteArray98[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method8291(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([BB)V")
	private void method8291(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub9 local12 = new Class3_Sub9(Static2.method27(arg0));
		@Pc(16) int local16 = local12.method5633();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt9748 = 0;
		} else {
			this.anInt9748 = local12.method5585();
		}
		@Pc(47) int local47 = local12.method5633();
		@Pc(58) boolean local58 = (local47 & 0x1) != 0;
		this.anInt9747 = local12.method5610();
		@Pc(71) boolean local71 = (local47 & 0x2) != 0;
		@Pc(73) int local73 = 0;
		this.anIntArray616 = new int[this.anInt9747];
		@Pc(80) int local80 = -1;
		for (@Pc(90) int local90 = 0; local90 < this.anInt9747; local90++) {
			this.anIntArray616[local90] = local73 += local12.method5610();
			if (this.anIntArray616[local90] > local80) {
				local80 = this.anIntArray616[local90];
			}
		}
		this.anInt9751 = local80 + 1;
		this.anIntArray617 = new int[this.anInt9751];
		this.anIntArray618 = new int[this.anInt9751];
		if (local71) {
			this.aByteArrayArray26 = new byte[this.anInt9751][];
		}
		this.anIntArray615 = new int[this.anInt9751];
		this.anIntArrayArray57 = new int[this.anInt9751][];
		this.anIntArray613 = new int[this.anInt9751];
		@Pc(169) int local169;
		@Pc(183) int local183;
		if (local58) {
			this.anIntArray614 = new int[this.anInt9751];
			for (local169 = 0; local169 < this.anInt9751; local169++) {
				this.anIntArray614[local169] = -1;
			}
			for (local183 = 0; local183 < this.anInt9747; local183++) {
				this.anIntArray614[this.anIntArray616[local183]] = local12.method5585();
			}
			this.aClass240_1 = new Class240(this.anIntArray614);
		}
		for (local169 = 0; local169 < this.anInt9747; local169++) {
			this.anIntArray617[this.anIntArray616[local169]] = local12.method5585();
		}
		if (local71) {
			for (local183 = 0; local183 < this.anInt9747; local183++) {
				@Pc(237) byte[] local237 = new byte[64];
				local12.method5577(0, 64, local237);
				this.aByteArrayArray26[this.anIntArray616[local183]] = local237;
			}
		}
		for (local183 = 0; local183 < this.anInt9747; local183++) {
			this.anIntArray615[this.anIntArray616[local183]] = local12.method5585();
		}
		for (@Pc(283) int local283 = 0; local283 < this.anInt9747; local283++) {
			this.anIntArray618[this.anIntArray616[local283]] = local12.method5610();
		}
		@Pc(313) int local313;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(330) int local330;
		@Pc(349) int local349;
		for (@Pc(306) int local306 = 0; local306 < this.anInt9747; local306++) {
			local313 = this.anIntArray616[local306];
			local73 = 0;
			local320 = this.anIntArray618[local313];
			local322 = -1;
			this.anIntArrayArray57[local313] = new int[local320];
			for (local330 = 0; local330 < local320; local330++) {
				local349 = this.anIntArrayArray57[local313][local330] = local73 += local12.method5610();
				if (local322 < local349) {
					local322 = local349;
				}
			}
			this.anIntArray613[local313] = local322 + 1;
			if (local320 == local322 + 1) {
				this.anIntArrayArray57[local313] = null;
			}
		}
		if (!local58) {
			return;
		}
		this.anIntArrayArray56 = new int[local80 + 1][];
		this.aClass240Array1 = new Class240[local80 + 1];
		for (local313 = 0; local313 < this.anInt9747; local313++) {
			local320 = this.anIntArray616[local313];
			local322 = this.anIntArray618[local320];
			this.anIntArrayArray56[local320] = new int[this.anIntArray613[local320]];
			for (local330 = 0; local330 < this.anIntArray613[local320]; local330++) {
				this.anIntArrayArray56[local320][local330] = -1;
			}
			for (local349 = 0; local349 < local322; local349++) {
				@Pc(467) int local467;
				if (this.anIntArrayArray57[local320] == null) {
					local467 = local349;
				} else {
					local467 = this.anIntArrayArray57[local320][local349];
				}
				this.anIntArrayArray56[local320][local467] = local12.method5585();
			}
			this.aClass240Array1[local320] = new Class240(this.anIntArrayArray56[local320]);
		}
	}
}

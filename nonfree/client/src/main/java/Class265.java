import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class265 {

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "[[B")
	public byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "I")
	public int anInt7442;

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "Lclient!jw;")
	public Class186 aClass186_1;

	@OriginalMember(owner = "client!oia", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "[I")
	public int[] anIntArray422;

	@OriginalMember(owner = "client!oia", name = "j", descriptor = "[I")
	public int[] anIntArray423;

	@OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
	public int anInt7447;

	@OriginalMember(owner = "client!oia", name = "p", descriptor = "I")
	public int anInt7448;

	@OriginalMember(owner = "client!oia", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!oia", name = "s", descriptor = "[Lclient!jw;")
	public Class186[] aClass186Array1;

	@OriginalMember(owner = "client!oia", name = "t", descriptor = "[I")
	public int[] anIntArray424;

	@OriginalMember(owner = "client!oia", name = "v", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "client!oia", name = "w", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
	public final int anInt7444;

	@OriginalMember(owner = "client!oia", name = "u", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "([BI[B)V")
	public Class265(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7444 = Static432.method6356(arg0.length, arg0);
		if (this.anInt7444 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray71 = Static257.method4017(arg0, arg0.length, 0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (arg2[local42] != this.aByteArray71[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6271(arg0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "([BZ)V")
	private void method6271(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class5_Sub41 local12 = new Class5_Sub41(Static21.method286(arg0));
		@Pc(20) int local20 = local12.method7816();
		if (local20 < 5 || local20 > 6) {
			throw new RuntimeException();
		}
		if (local20 < 6) {
			this.anInt7447 = 0;
		} else {
			this.anInt7447 = local12.method7804();
		}
		@Pc(49) int local49 = local12.method7816();
		@Pc(57) boolean local57 = (local49 & 0x1) != 0;
		this.anInt7448 = local12.method7860();
		@Pc(73) boolean local73 = (local49 & 0x2) != 0;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = -1;
		this.anIntArray422 = new int[this.anInt7448];
		for (@Pc(84) int local84 = 0; local84 < this.anInt7448; local84++) {
			this.anIntArray422[local84] = local75 += local12.method7860();
			if (this.anIntArray422[local84] > local77) {
				local77 = this.anIntArray422[local84];
			}
		}
		this.anInt7442 = local77 + 1;
		this.anIntArray425 = new int[this.anInt7442];
		if (local73) {
			this.aByteArrayArray24 = new byte[this.anInt7442][];
		}
		this.anIntArrayArray38 = new int[this.anInt7442][];
		this.anIntArray423 = new int[this.anInt7442];
		this.anIntArray424 = new int[this.anInt7442];
		this.anIntArray421 = new int[this.anInt7442];
		@Pc(163) int local163;
		@Pc(181) int local181;
		if (local57) {
			this.anIntArray426 = new int[this.anInt7442];
			for (local163 = 0; local163 < this.anInt7442; local163++) {
				this.anIntArray426[local163] = -1;
			}
			for (local181 = 0; local181 < this.anInt7448; local181++) {
				this.anIntArray426[this.anIntArray422[local181]] = local12.method7804();
			}
			this.aClass186_1 = new Class186(this.anIntArray426);
		}
		for (local163 = 0; local163 < this.anInt7448; local163++) {
			this.anIntArray421[this.anIntArray422[local163]] = local12.method7804();
		}
		if (local73) {
			for (local181 = 0; local181 < this.anInt7448; local181++) {
				@Pc(241) byte[] local241 = new byte[64];
				local12.method7802(64, 0, local241);
				this.aByteArrayArray24[this.anIntArray422[local181]] = local241;
			}
		}
		for (local181 = 0; local181 < this.anInt7448; local181++) {
			this.anIntArray423[this.anIntArray422[local181]] = local12.method7804();
		}
		for (@Pc(285) int local285 = 0; local285 < this.anInt7448; local285++) {
			this.anIntArray424[this.anIntArray422[local285]] = local12.method7860();
		}
		@Pc(315) int local315;
		@Pc(320) int local320;
		@Pc(330) int local330;
		@Pc(332) int local332;
		@Pc(349) int local349;
		for (@Pc(308) int local308 = 0; local308 < this.anInt7448; local308++) {
			local315 = this.anIntArray422[local308];
			local320 = this.anIntArray424[local315];
			local75 = 0;
			this.anIntArrayArray38[local315] = new int[local320];
			local330 = -1;
			for (local332 = 0; local332 < local320; local332++) {
				local349 = this.anIntArrayArray38[local315][local332] = local75 += local12.method7860();
				if (local330 < local349) {
					local330 = local349;
				}
			}
			this.anIntArray425[local315] = local330 + 1;
			if (local320 == local330 + 1) {
				this.anIntArrayArray38[local315] = null;
			}
		}
		if (!local57) {
			return;
		}
		this.aClass186Array1 = new Class186[local77 + 1];
		this.anIntArrayArray37 = new int[local77 + 1][];
		for (local315 = 0; local315 < this.anInt7448; local315++) {
			local320 = this.anIntArray422[local315];
			local330 = this.anIntArray424[local320];
			this.anIntArrayArray37[local320] = new int[this.anIntArray425[local320]];
			for (local332 = 0; local332 < this.anIntArray425[local320]; local332++) {
				this.anIntArrayArray37[local320][local332] = -1;
			}
			for (local349 = 0; local349 < local330; local349++) {
				@Pc(473) int local473;
				if (this.anIntArrayArray38[local320] == null) {
					local473 = local349;
				} else {
					local473 = this.anIntArrayArray38[local320][local349];
				}
				this.anIntArrayArray37[local320][local473] = local12.method7804();
			}
			this.aClass186Array1[local320] = new Class186(this.anIntArrayArray37[local320]);
		}
	}
}

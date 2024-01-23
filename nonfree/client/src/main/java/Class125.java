import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class125 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "I")
	public int anInt4007;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public int anInt4008;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "[Lclient!cn;")
	public Class28[] aClass28Array1;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	public int anInt4009;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "[I")
	public int[] anIntArray321;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "Lclient!cn;")
	public Class28 aClass28_1;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public int anInt4013;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "([BI)V")
	public Class125(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4013 = Static243.method3736(arg0, arg0.length);
		if (this.anInt4013 != arg1) {
			throw new RuntimeException();
		}
		this.method3245(arg0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[B)V")
	private void method3245(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class4_Sub24 local12 = new Class4_Sub24(Static40.method748(arg0));
		@Pc(16) int local16 = local12.method3110();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt4009 = 0;
		} else {
			this.anInt4009 = local12.method3084();
		}
		@Pc(48) int local48 = local12.method3110();
		@Pc(50) int local50 = 0;
		this.anInt4008 = local12.method3085();
		@Pc(57) int local57 = -1;
		this.anIntArray319 = new int[this.anInt4008];
		@Pc(68) int local68;
		for (local68 = 0; local68 < this.anInt4008; local68++) {
			this.anIntArray319[local68] = local50 += local12.method3085();
			if (this.anIntArray319[local68] > local57) {
				local57 = this.anIntArray319[local68];
			}
		}
		this.anInt4007 = local57 + 1;
		this.anIntArray321 = new int[this.anInt4007];
		this.anIntArray323 = new int[this.anInt4007];
		this.anIntArrayArray26 = new int[this.anInt4007][];
		this.anIntArray318 = new int[this.anInt4007];
		this.anIntArray322 = new int[this.anInt4007];
		if (local48 != 0) {
			this.anIntArray320 = new int[this.anInt4007];
			for (local68 = 0; local68 < this.anInt4007; local68++) {
				this.anIntArray320[local68] = -1;
			}
			for (local68 = 0; local68 < this.anInt4008; local68++) {
				this.anIntArray320[this.anIntArray319[local68]] = local12.method3084();
			}
			this.aClass28_1 = new Class28(this.anIntArray320);
		}
		for (local68 = 0; local68 < this.anInt4008; local68++) {
			this.anIntArray318[this.anIntArray319[local68]] = local12.method3084();
		}
		for (local68 = 0; local68 < this.anInt4008; local68++) {
			this.anIntArray323[this.anIntArray319[local68]] = local12.method3084();
		}
		for (local68 = 0; local68 < this.anInt4008; local68++) {
			this.anIntArray321[this.anIntArray319[local68]] = local12.method3085();
		}
		@Pc(268) int local268;
		@Pc(275) int local275;
		@Pc(270) int local270;
		@Pc(283) int local283;
		for (local68 = 0; local68 < this.anInt4008; local68++) {
			local50 = 0;
			local268 = this.anIntArray319[local68];
			local270 = -1;
			local275 = this.anIntArray321[local268];
			this.anIntArrayArray26[local268] = new int[local275];
			for (local283 = 0; local283 < local275; local283++) {
				@Pc(305) int local305 = this.anIntArrayArray26[local268][local283] = local50 += local12.method3085();
				if (local305 > local270) {
					local270 = local305;
				}
			}
			this.anIntArray322[local268] = local270 + 1;
			if (local275 == local270 + 1) {
				this.anIntArrayArray26[local268] = null;
			}
		}
		if (local48 == 0) {
			return;
		}
		this.aClass28Array1 = new Class28[local57 + 1];
		this.anIntArrayArray27 = new int[local57 + 1][];
		for (local68 = 0; local68 < this.anInt4008; local68++) {
			local268 = this.anIntArray319[local68];
			local275 = this.anIntArray321[local268];
			this.anIntArrayArray27[local268] = new int[this.anIntArray322[local268]];
			for (local270 = 0; local270 < this.anIntArray322[local268]; local270++) {
				this.anIntArrayArray27[local268][local270] = -1;
			}
			for (local270 = 0; local270 < local275; local270++) {
				if (this.anIntArrayArray26[local268] == null) {
					local283 = local270;
				} else {
					local283 = this.anIntArrayArray26[local268][local270];
				}
				this.anIntArrayArray27[local268][local283] = local12.method3084();
			}
			this.aClass28Array1[local268] = new Class28(this.anIntArrayArray27[local268]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
	public int anInt2241;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
	public int anInt2242;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
	public int anInt2243;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
	public int anInt2247;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
	public int anInt2249;

	@OriginalMember(owner = "client!qd", name = "wb", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
	public int anInt2248 = -1;

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "Z")
	public boolean aBoolean109 = true;

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
	public int anInt2252 = -1;

	@OriginalMember(owner = "client!qd", name = "ub", descriptor = "I")
	public int anInt2256 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!m;BI)V")
	private void method1495(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub6 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2256 = arg1.method1596();
		} else if (arg2 == 2) {
			this.anInt2248 = arg1.method1587();
		} else if (arg2 == 5) {
			this.aBoolean109 = false;
		} else if (arg2 == 7) {
			this.anInt2252 = arg1.method1596();
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
	private void method1496(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local14;
		@Pc(32) double local32 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local32 < local14) {
			local23 = local32;
		}
		if (local23 > local21) {
			local23 = local21;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(48) double local48 = local14;
		if (local14 < local32) {
			local48 = local32;
		}
		if (local48 < local21) {
			local48 = local21;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local48 + local23) / 2.0D;
		this.anInt2243 = (int) (local72 * 256.0D);
		if (local48 != local23) {
			if (local14 == local48) {
				local46 = (local32 - local21) / (-local23 + local48);
			} else if (local32 == local48) {
				local46 = (local21 - local14) / (-local23 + local48) + 2.0D;
			} else if (local21 == local48) {
				local46 = (local14 - local32) / (-local23 + local48) + 4.0D;
			}
			if (local72 < 0.5D) {
				local66 = (local48 - local23) / (local23 + local48);
			}
			if (local72 >= 0.5D) {
				local66 = (local48 - local23) / (2.0D - local48 - local23);
			}
		}
		local46 /= 6.0D;
		this.anInt2247 = (int) (local46 * 256.0D);
		if (this.anInt2243 < 0) {
			this.anInt2243 = 0;
		} else if (this.anInt2243 > 255) {
			this.anInt2243 = 255;
		}
		this.anInt2257 = (int) (local66 * 256.0D);
		if (this.anInt2257 < 0) {
			this.anInt2257 = 0;
		} else if (this.anInt2257 > 255) {
			this.anInt2257 = 255;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public void method1497() {
		if (this.anInt2252 != -1) {
			this.method1496(this.anInt2252);
			this.anInt2241 = this.anInt2257;
			this.anInt2249 = this.anInt2243;
			this.anInt2242 = this.anInt2247;
		}
		this.method1496(this.anInt2256);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!m;I)V")
	public void method1499(@OriginalArg(1) Class3_Sub6 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method1587();
			if (local15 == 0) {
				return;
			}
			this.method1495(arg1, arg0, local15);
		}
	}
}

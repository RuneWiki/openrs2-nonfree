import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class64 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	public int anInt1740;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "Lclient!oh;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
	public int anInt1745;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
	public int[] anIntArray139;

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "[Lclient!oh;")
	public Class128[] aClass128Array1;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
	public int anInt1748;

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
	public int anInt1739;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([BI)V")
	public Class64(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1739 = Static110.method1797(arg0.length, arg0);
		if (this.anInt1739 != arg1) {
			throw new RuntimeException();
		}
		this.method1361(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([BB)V")
	private void method1361(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub14 local12 = new Class1_Sub14(Static154.method2653(arg0));
		@Pc(16) int local16 = local12.method2595();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt1748 = local12.method2647();
		} else {
			this.anInt1748 = 0;
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = -1;
		@Pc(50) int local50 = local12.method2595();
		this.anInt1740 = local12.method2593();
		this.anIntArray135 = new int[this.anInt1740];
		@Pc(62) int local62;
		for (local62 = 0; local62 < this.anInt1740; local62++) {
			this.anIntArray135[local62] = local44 += local12.method2593();
			if (this.anIntArray135[local62] > local46) {
				local46 = this.anIntArray135[local62];
			}
		}
		this.anInt1745 = local46 + 1;
		this.anIntArray136 = new int[this.anInt1745];
		this.anIntArray138 = new int[this.anInt1745];
		this.anIntArrayArray7 = new int[this.anInt1745][];
		this.anIntArray137 = new int[this.anInt1745];
		this.anIntArray139 = new int[this.anInt1745];
		if (local50 != 0) {
			this.anIntArray140 = new int[this.anInt1745];
			for (local62 = 0; local62 < this.anInt1745; local62++) {
				this.anIntArray140[local62] = -1;
			}
			for (local62 = 0; local62 < this.anInt1740; local62++) {
				this.anIntArray140[this.anIntArray135[local62]] = local12.method2647();
			}
			this.aClass128_1 = new Class128(this.anIntArray140);
		}
		for (local62 = 0; local62 < this.anInt1740; local62++) {
			this.anIntArray137[this.anIntArray135[local62]] = local12.method2647();
		}
		for (local62 = 0; local62 < this.anInt1740; local62++) {
			this.anIntArray138[this.anIntArray135[local62]] = local12.method2647();
		}
		for (local62 = 0; local62 < this.anInt1740; local62++) {
			this.anIntArray136[this.anIntArray135[local62]] = local12.method2593();
		}
		@Pc(269) int local269;
		@Pc(276) int local276;
		@Pc(271) int local271;
		@Pc(286) int local286;
		for (local62 = 0; local62 < this.anInt1740; local62++) {
			local269 = this.anIntArray135[local62];
			local271 = -1;
			local276 = this.anIntArray136[local269];
			local44 = 0;
			this.anIntArrayArray7[local269] = new int[local276];
			for (local286 = 0; local286 < local276; local286++) {
				@Pc(308) int local308 = this.anIntArrayArray7[local269][local286] = local44 += local12.method2593();
				if (local271 < local308) {
					local271 = local308;
				}
			}
			this.anIntArray139[local269] = local271 + 1;
			if (local276 == local271 + 1) {
				this.anIntArrayArray7[local269] = null;
			}
		}
		if (local50 == 0) {
			return;
		}
		this.aClass128Array1 = new Class128[local46 + 1];
		this.anIntArrayArray8 = new int[local46 + 1][];
		for (local62 = 0; local62 < this.anInt1740; local62++) {
			local269 = this.anIntArray135[local62];
			local276 = this.anIntArray136[local269];
			this.anIntArrayArray8[local269] = new int[this.anIntArray139[local269]];
			for (local271 = 0; local271 < this.anIntArray139[local269]; local271++) {
				this.anIntArrayArray8[local269][local271] = -1;
			}
			for (local271 = 0; local271 < local276; local271++) {
				if (this.anIntArrayArray7[local269] == null) {
					local286 = local271;
				} else {
					local286 = this.anIntArrayArray7[local269][local271];
				}
				this.anIntArrayArray8[local269][local286] = local12.method2647();
			}
			this.aClass128Array1[local269] = new Class128(this.anIntArrayArray8[local269]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class52 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
	public int[] anIntArray142;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!r;")
	public Class147 aClass147_1;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public int anInt1451;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "[Lclient!r;")
	public Class147[] aClass147Array1;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	public int anInt1454;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	public int anInt1455;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public int anInt1450;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([BI)V")
	public Class52(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1450 = Static147.method2495(arg0, arg0.length);
		if (arg1 != this.anInt1450) {
			throw new RuntimeException();
		}
		this.method1206(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[B)V")
	private void method1206(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub26 local12 = new Class3_Sub26(Static149.method2524(arg0));
		@Pc(16) int local16 = local12.method3915();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt1454 = 0;
		} else {
			this.anInt1454 = local12.method3896();
		}
		@Pc(46) int local46 = 0;
		@Pc(50) int local50 = local12.method3915();
		@Pc(52) int local52 = -1;
		this.anInt1451 = local12.method3948();
		this.anIntArray143 = new int[this.anInt1451];
		@Pc(64) int local64;
		for (local64 = 0; local64 < this.anInt1451; local64++) {
			this.anIntArray143[local64] = local46 += local12.method3948();
			if (this.anIntArray143[local64] > local52) {
				local52 = this.anIntArray143[local64];
			}
		}
		this.anInt1455 = local52 + 1;
		this.anIntArrayArray18 = new int[this.anInt1455][];
		this.anIntArray145 = new int[this.anInt1455];
		this.anIntArray142 = new int[this.anInt1455];
		this.anIntArray144 = new int[this.anInt1455];
		this.anIntArray146 = new int[this.anInt1455];
		if (local50 != 0) {
			this.anIntArray147 = new int[this.anInt1455];
			for (local64 = 0; local64 < this.anInt1455; local64++) {
				this.anIntArray147[local64] = -1;
			}
			for (local64 = 0; local64 < this.anInt1451; local64++) {
				this.anIntArray147[this.anIntArray143[local64]] = local12.method3896();
			}
			this.aClass147_1 = new Class147(this.anIntArray147);
		}
		for (local64 = 0; local64 < this.anInt1451; local64++) {
			this.anIntArray144[this.anIntArray143[local64]] = local12.method3896();
		}
		for (local64 = 0; local64 < this.anInt1451; local64++) {
			this.anIntArray142[this.anIntArray143[local64]] = local12.method3896();
		}
		for (local64 = 0; local64 < this.anInt1451; local64++) {
			this.anIntArray145[this.anIntArray143[local64]] = local12.method3948();
		}
		@Pc(262) int local262;
		@Pc(269) int local269;
		@Pc(264) int local264;
		@Pc(277) int local277;
		for (local64 = 0; local64 < this.anInt1451; local64++) {
			local46 = 0;
			local262 = this.anIntArray143[local64];
			local264 = -1;
			local269 = this.anIntArray145[local262];
			this.anIntArrayArray18[local262] = new int[local269];
			for (local277 = 0; local277 < local269; local277++) {
				@Pc(295) int local295 = this.anIntArrayArray18[local262][local277] = local46 += local12.method3948();
				if (local295 > local264) {
					local264 = local295;
				}
			}
			this.anIntArray146[local262] = local264 + 1;
			if (local264 + 1 == local269) {
				this.anIntArrayArray18[local262] = null;
			}
		}
		if (local50 == 0) {
			return;
		}
		this.aClass147Array1 = new Class147[local52 + 1];
		this.anIntArrayArray17 = new int[local52 + 1][];
		for (local64 = 0; local64 < this.anInt1451; local64++) {
			local262 = this.anIntArray143[local64];
			local269 = this.anIntArray145[local262];
			this.anIntArrayArray17[local262] = new int[this.anIntArray146[local262]];
			for (local264 = 0; local264 < this.anIntArray146[local262]; local264++) {
				this.anIntArrayArray17[local262][local264] = -1;
			}
			for (local264 = 0; local264 < local269; local264++) {
				if (this.anIntArrayArray18[local262] == null) {
					local277 = local264;
				} else {
					local277 = this.anIntArrayArray18[local262][local264];
				}
				this.anIntArrayArray17[local262][local277] = local12.method3896();
			}
			this.aClass147Array1[local262] = new Class147(this.anIntArrayArray17[local262]);
		}
	}
}

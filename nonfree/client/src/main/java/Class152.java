import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class152 {

	@OriginalMember(owner = "client!se", name = "b", descriptor = "[Lclient!sn;")
	public Class155[] aClass155Array1;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
	public int[] anIntArray359;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "[I")
	public int[] anIntArray362;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public int anInt4797;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!sn;")
	public Class155 aClass155_1;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	public int anInt4798;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	public int anInt4792;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([BI)V")
	public Class152(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4792 = Static94.method1495(arg0, arg0.length);
		if (this.anInt4792 != arg1) {
			throw new RuntimeException();
		}
		this.method3617(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([BZ)V")
	private void method3617(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class8_Sub2 local12 = new Class8_Sub2(Static258.method3875(arg0));
		@Pc(16) int local16 = local12.method2334();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		@Pc(28) int local28 = 0;
		if (local16 < 6) {
			this.anInt4795 = 0;
		} else {
			this.anInt4795 = local12.method2352();
		}
		@Pc(45) int local45 = local12.method2334();
		this.anInt4798 = local12.method2375();
		@Pc(52) int local52 = -1;
		this.anIntArray360 = new int[this.anInt4798];
		@Pc(59) int local59;
		for (local59 = 0; local59 < this.anInt4798; local59++) {
			this.anIntArray360[local59] = local28 += local12.method2375();
			if (this.anIntArray360[local59] > local52) {
				local52 = this.anIntArray360[local59];
			}
		}
		this.anInt4797 = local52 + 1;
		this.anIntArray361 = new int[this.anInt4797];
		this.anIntArray362 = new int[this.anInt4797];
		this.anIntArray364 = new int[this.anInt4797];
		this.anIntArrayArray32 = new int[this.anInt4797][];
		this.anIntArray359 = new int[this.anInt4797];
		if (local45 != 0) {
			this.anIntArray363 = new int[this.anInt4797];
			for (local59 = 0; local59 < this.anInt4797; local59++) {
				this.anIntArray363[local59] = -1;
			}
			for (local59 = 0; local59 < this.anInt4798; local59++) {
				this.anIntArray363[this.anIntArray360[local59]] = local12.method2352();
			}
			this.aClass155_1 = new Class155(this.anIntArray363);
		}
		for (local59 = 0; local59 < this.anInt4798; local59++) {
			this.anIntArray362[this.anIntArray360[local59]] = local12.method2352();
		}
		for (local59 = 0; local59 < this.anInt4798; local59++) {
			this.anIntArray364[this.anIntArray360[local59]] = local12.method2352();
		}
		for (local59 = 0; local59 < this.anInt4798; local59++) {
			this.anIntArray361[this.anIntArray360[local59]] = local12.method2375();
		}
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(262) int local262;
		@Pc(270) int local270;
		for (local59 = 0; local59 < this.anInt4798; local59++) {
			local253 = this.anIntArray360[local59];
			local28 = 0;
			local260 = this.anIntArray361[local253];
			local262 = -1;
			this.anIntArrayArray32[local253] = new int[local260];
			for (local270 = 0; local270 < local260; local270++) {
				@Pc(292) int local292 = this.anIntArrayArray32[local253][local270] = local28 += local12.method2375();
				if (local262 < local292) {
					local262 = local292;
				}
			}
			this.anIntArray359[local253] = local262 + 1;
			if (local260 == local262 + 1) {
				this.anIntArrayArray32[local253] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.aClass155Array1 = new Class155[local52 + 1];
		this.anIntArrayArray31 = new int[local52 + 1][];
		for (local59 = 0; local59 < this.anInt4798; local59++) {
			local253 = this.anIntArray360[local59];
			local260 = this.anIntArray361[local253];
			this.anIntArrayArray31[local253] = new int[this.anIntArray359[local253]];
			for (local262 = 0; local262 < this.anIntArray359[local253]; local262++) {
				this.anIntArrayArray31[local253][local262] = -1;
			}
			for (local262 = 0; local262 < local260; local262++) {
				if (this.anIntArrayArray32[local253] == null) {
					local270 = local262;
				} else {
					local270 = this.anIntArrayArray32[local253][local262];
				}
				this.anIntArrayArray31[local253][local270] = local12.method2352();
			}
			this.aClass155Array1[local253] = new Class155(this.anIntArrayArray31[local253]);
		}
	}
}

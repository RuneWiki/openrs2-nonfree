import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class254 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "[[B")
	public byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "[I")
	public int[] anIntArray446;

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
	public int anInt7288;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "[I")
	public int[] anIntArray447;

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "[I")
	public int[] anIntArray448;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "[Lclient!jia;")
	public Class175[] aClass175Array1;

	@OriginalMember(owner = "client!oga", name = "l", descriptor = "Lclient!jia;")
	public Class175 aClass175_1;

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
	public int anInt7291;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!oga", name = "q", descriptor = "[I")
	public int[] anIntArray450;

	@OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
	public int anInt7293;

	@OriginalMember(owner = "client!oga", name = "s", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
	public final int anInt7289;

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "([BI[B)V")
	public Class254(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7289 = Static332.method6605(arg0, arg0.length);
		if (arg1 != this.anInt7289) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray78 = Static474.method6311(arg0.length, 0, arg0);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray78[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6266(arg0);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "([BI)V")
	private void method6266(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class6_Sub23 local12 = new Class6_Sub23(Static75.method1314(arg0));
		@Pc(16) int local16 = local12.method8374();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt7293 = 0;
		} else {
			this.anInt7293 = local12.method8369();
		}
		@Pc(47) int local47 = local12.method8374();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		this.anInt7288 = local12.method8363();
		@Pc(71) boolean local71 = (local47 & 0x2) != 0;
		@Pc(73) int local73 = 0;
		@Pc(75) int local75 = -1;
		this.anIntArray447 = new int[this.anInt7288];
		for (@Pc(82) int local82 = 0; local82 < this.anInt7288; local82++) {
			this.anIntArray447[local82] = local73 += local12.method8363();
			if (this.anIntArray447[local82] > local75) {
				local75 = this.anIntArray447[local82];
			}
		}
		this.anInt7291 = local75 + 1;
		this.anIntArrayArray38 = new int[this.anInt7291][];
		this.anIntArray448 = new int[this.anInt7291];
		if (local71) {
			this.aByteArrayArray19 = new byte[this.anInt7291][];
		}
		this.anIntArray451 = new int[this.anInt7291];
		this.anIntArray450 = new int[this.anInt7291];
		this.anIntArray446 = new int[this.anInt7291];
		@Pc(161) int local161;
		@Pc(179) int local179;
		if (local55) {
			this.anIntArray449 = new int[this.anInt7291];
			for (local161 = 0; local161 < this.anInt7291; local161++) {
				this.anIntArray449[local161] = -1;
			}
			for (local179 = 0; local179 < this.anInt7288; local179++) {
				this.anIntArray449[this.anIntArray447[local179]] = local12.method8369();
			}
			this.aClass175_1 = new Class175(this.anIntArray449);
		}
		for (local161 = 0; local161 < this.anInt7288; local161++) {
			this.anIntArray451[this.anIntArray447[local161]] = local12.method8369();
		}
		if (local71) {
			for (local179 = 0; local179 < this.anInt7288; local179++) {
				@Pc(239) byte[] local239 = new byte[64];
				local12.method8375(64, local239, 0);
				this.aByteArrayArray19[this.anIntArray447[local179]] = local239;
			}
		}
		for (local179 = 0; local179 < this.anInt7288; local179++) {
			this.anIntArray448[this.anIntArray447[local179]] = local12.method8369();
		}
		for (@Pc(287) int local287 = 0; local287 < this.anInt7288; local287++) {
			this.anIntArray450[this.anIntArray447[local287]] = local12.method8363();
		}
		@Pc(317) int local317;
		@Pc(322) int local322;
		@Pc(332) int local332;
		@Pc(334) int local334;
		@Pc(351) int local351;
		for (@Pc(310) int local310 = 0; local310 < this.anInt7288; local310++) {
			local317 = this.anIntArray447[local310];
			local322 = this.anIntArray450[local317];
			local73 = 0;
			this.anIntArrayArray38[local317] = new int[local322];
			local332 = -1;
			for (local334 = 0; local334 < local322; local334++) {
				local351 = this.anIntArrayArray38[local317][local334] = local73 += local12.method8363();
				if (local332 < local351) {
					local332 = local351;
				}
			}
			this.anIntArray446[local317] = local332 + 1;
			if (local322 == local332 + 1) {
				this.anIntArrayArray38[local317] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.aClass175Array1 = new Class175[local75 + 1];
		this.anIntArrayArray37 = new int[local75 + 1][];
		for (local317 = 0; local317 < this.anInt7288; local317++) {
			local322 = this.anIntArray447[local317];
			local332 = this.anIntArray450[local322];
			this.anIntArrayArray37[local322] = new int[this.anIntArray446[local322]];
			for (local334 = 0; local334 < this.anIntArray446[local322]; local334++) {
				this.anIntArrayArray37[local322][local334] = -1;
			}
			for (local351 = 0; local351 < local332; local351++) {
				@Pc(457) int local457;
				if (this.anIntArrayArray38[local322] == null) {
					local457 = local351;
				} else {
					local457 = this.anIntArrayArray38[local322][local351];
				}
				this.anIntArrayArray37[local322][local457] = local12.method8369();
			}
			this.aClass175Array1[local322] = new Class175(this.anIntArrayArray37[local322]);
		}
	}
}

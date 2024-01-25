import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class16 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Lclient!cp;")
	public Class44 aClass44_1;

	@OriginalMember(owner = "client!at", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "[Lclient!cp;")
	public Class44[] aClass44Array1;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!at", name = "r", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!at", name = "t", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "I")
	public int anInt313;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "I")
	public final int anInt308;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "([BI)V")
	public Class16(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt308 = Static8.method146(arg0.length, arg0);
		if (arg1 != this.anInt308) {
			throw new RuntimeException();
		}
		this.method273(arg0);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([BI)V")
	private void method273(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub12 local12 = new Class2_Sub12(Static331.method5389(arg0));
		@Pc(16) int local16 = local12.method3124();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt315 = local12.method3135();
		} else {
			this.anInt315 = 0;
		}
		@Pc(47) int local47 = local12.method3124();
		this.anInt313 = local12.method3104();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray33 = new int[this.anInt313];
		for (@Pc(63) int local63 = 0; local63 < this.anInt313; local63++) {
			this.anIntArray33[local63] = local54 += local12.method3104();
			if (this.anIntArray33[local63] > local56) {
				local56 = this.anIntArray33[local63];
			}
		}
		this.anInt309 = local56 + 1;
		this.anIntArray34 = new int[this.anInt309];
		this.anIntArray37 = new int[this.anInt309];
		this.anIntArray36 = new int[this.anInt309];
		this.anIntArrayArray5 = new int[this.anInt309][];
		this.anIntArray38 = new int[this.anInt309];
		@Pc(135) int local135;
		@Pc(149) int local149;
		if (local47 != 0) {
			this.anIntArray35 = new int[this.anInt309];
			for (local135 = 0; local135 < this.anInt309; local135++) {
				this.anIntArray35[local135] = -1;
			}
			for (local149 = 0; local149 < this.anInt313; local149++) {
				this.anIntArray35[this.anIntArray33[local149]] = local12.method3135();
			}
			this.aClass44_1 = new Class44(this.anIntArray35);
		}
		for (local135 = 0; local135 < this.anInt313; local135++) {
			this.anIntArray37[this.anIntArray33[local135]] = local12.method3135();
		}
		for (local149 = 0; local149 < this.anInt313; local149++) {
			this.anIntArray36[this.anIntArray33[local149]] = local12.method3135();
		}
		for (@Pc(219) int local219 = 0; local219 < this.anInt313; local219++) {
			this.anIntArray34[this.anIntArray33[local219]] = local12.method3104();
		}
		@Pc(249) int local249;
		@Pc(254) int local254;
		@Pc(264) int local264;
		@Pc(266) int local266;
		@Pc(283) int local283;
		for (@Pc(242) int local242 = 0; local242 < this.anInt313; local242++) {
			local249 = this.anIntArray33[local242];
			local254 = this.anIntArray34[local249];
			local54 = 0;
			this.anIntArrayArray5[local249] = new int[local254];
			local264 = -1;
			for (local266 = 0; local266 < local254; local266++) {
				local283 = this.anIntArrayArray5[local249][local266] = local54 += local12.method3104();
				if (local264 < local283) {
					local264 = local283;
				}
			}
			this.anIntArray38[local249] = local264 + 1;
			if (local264 + 1 == local254) {
				this.anIntArrayArray5[local249] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass44Array1 = new Class44[local56 + 1];
		this.anIntArrayArray6 = new int[local56 + 1][];
		for (local249 = 0; local249 < this.anInt313; local249++) {
			local254 = this.anIntArray33[local249];
			local264 = this.anIntArray34[local254];
			this.anIntArrayArray6[local254] = new int[this.anIntArray38[local254]];
			for (local266 = 0; local266 < this.anIntArray38[local254]; local266++) {
				this.anIntArrayArray6[local254][local266] = -1;
			}
			for (local283 = 0; local283 < local264; local283++) {
				@Pc(396) int local396;
				if (this.anIntArrayArray5[local254] == null) {
					local396 = local283;
				} else {
					local396 = this.anIntArrayArray5[local254][local283];
				}
				this.anIntArrayArray6[local254][local396] = local12.method3135();
			}
			this.aClass44Array1[local254] = new Class44(this.anIntArrayArray6[local254]);
		}
	}
}

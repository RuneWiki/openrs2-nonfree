import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class118 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public int anInt3743;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!kt;")
	public Class140 aClass140_1;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt3747;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public int anInt3748;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
	public int[] anIntArray291;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[Lclient!kt;")
	public Class140[] aClass140Array1;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public final int anInt3746;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([BI)V")
	public Class118(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3746 = Static399.method5379(arg0.length, arg0);
		if (arg1 != this.anInt3746) {
			throw new RuntimeException();
		}
		this.method3112(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V")
	private void method3112(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub2 local12 = new Class3_Sub2(Static333.method4851(arg0));
		@Pc(16) int local16 = local12.method6053();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt3748 = local12.method6014();
		} else {
			this.anInt3748 = 0;
		}
		@Pc(47) int local47 = local12.method6053();
		this.anInt3743 = local12.method6004();
		@Pc(54) int local54 = 0;
		this.anIntArray290 = new int[this.anInt3743];
		@Pc(61) int local61 = -1;
		for (@Pc(63) int local63 = 0; local63 < this.anInt3743; local63++) {
			this.anIntArray290[local63] = local54 += local12.method6004();
			if (this.anIntArray290[local63] > local61) {
				local61 = this.anIntArray290[local63];
			}
		}
		this.anInt3747 = local61 + 1;
		this.anIntArray287 = new int[this.anInt3747];
		this.anIntArrayArray31 = new int[this.anInt3747][];
		this.anIntArray286 = new int[this.anInt3747];
		this.anIntArray291 = new int[this.anInt3747];
		this.anIntArray288 = new int[this.anInt3747];
		@Pc(138) int local138;
		@Pc(156) int local156;
		if (local47 != 0) {
			this.anIntArray289 = new int[this.anInt3747];
			for (local138 = 0; local138 < this.anInt3747; local138++) {
				this.anIntArray289[local138] = -1;
			}
			for (local156 = 0; local156 < this.anInt3743; local156++) {
				this.anIntArray289[this.anIntArray290[local156]] = local12.method6014();
			}
			this.aClass140_1 = new Class140(this.anIntArray289);
		}
		for (local138 = 0; local138 < this.anInt3743; local138++) {
			this.anIntArray286[this.anIntArray290[local138]] = local12.method6014();
		}
		for (local156 = 0; local156 < this.anInt3743; local156++) {
			this.anIntArray291[this.anIntArray290[local156]] = local12.method6014();
		}
		for (@Pc(230) int local230 = 0; local230 < this.anInt3743; local230++) {
			this.anIntArray287[this.anIntArray290[local230]] = local12.method6004();
		}
		@Pc(260) int local260;
		@Pc(267) int local267;
		@Pc(275) int local275;
		@Pc(277) int local277;
		@Pc(294) int local294;
		for (@Pc(253) int local253 = 0; local253 < this.anInt3743; local253++) {
			local260 = this.anIntArray290[local253];
			local54 = 0;
			local267 = this.anIntArray287[local260];
			this.anIntArrayArray31[local260] = new int[local267];
			local275 = -1;
			for (local277 = 0; local277 < local267; local277++) {
				local294 = this.anIntArrayArray31[local260][local277] = local54 += local12.method6004();
				if (local294 > local275) {
					local275 = local294;
				}
			}
			this.anIntArray288[local260] = local275 + 1;
			if (local275 + 1 == local267) {
				this.anIntArrayArray31[local260] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass140Array1 = new Class140[local61 + 1];
		this.anIntArrayArray32 = new int[local61 + 1][];
		for (local260 = 0; local260 < this.anInt3743; local260++) {
			local267 = this.anIntArray290[local260];
			local275 = this.anIntArray287[local267];
			this.anIntArrayArray32[local267] = new int[this.anIntArray288[local267]];
			for (local277 = 0; local277 < this.anIntArray288[local267]; local277++) {
				this.anIntArrayArray32[local267][local277] = -1;
			}
			for (local294 = 0; local294 < local275; local294++) {
				@Pc(400) int local400;
				if (this.anIntArrayArray31[local267] == null) {
					local400 = local294;
				} else {
					local400 = this.anIntArrayArray31[local267][local294];
				}
				this.anIntArrayArray32[local267][local400] = local12.method6014();
			}
			this.aClass140Array1[local267] = new Class140(this.anIntArrayArray32[local267]);
		}
	}
}

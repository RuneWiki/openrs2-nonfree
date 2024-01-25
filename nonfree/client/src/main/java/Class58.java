import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class58 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "I")
	public int anInt1736;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "I")
	public int anInt1738;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "Lclient!nl;")
	public Class139 aClass139_1;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!er", name = "o", descriptor = "I")
	public int anInt1743;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!er", name = "r", descriptor = "[Lclient!nl;")
	public Class139[] aClass139Array1;

	@OriginalMember(owner = "client!er", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!er", name = "n", descriptor = "I")
	public final int anInt1742;

	static {
		new Class93("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "([BI)V")
	public Class58(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1742 = Static330.method5772(arg0.length, arg0);
		if (this.anInt1742 != arg1) {
			throw new RuntimeException();
		}
		this.method1813(arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([BI)V")
	private void method1813(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub10 local12 = new Class2_Sub10(Static145.method5966(arg0));
		@Pc(16) int local16 = local12.method4421();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt1743 = local12.method4444();
		} else {
			this.anInt1743 = 0;
		}
		@Pc(47) int local47 = local12.method4421();
		this.anInt1736 = local12.method4464();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray187 = new int[this.anInt1736];
		for (@Pc(63) int local63 = 0; local63 < this.anInt1736; local63++) {
			this.anIntArray187[local63] = local54 += local12.method4464();
			if (this.anIntArray187[local63] > local56) {
				local56 = this.anIntArray187[local63];
			}
		}
		this.anInt1738 = local56 + 1;
		this.anIntArray186 = new int[this.anInt1738];
		this.anIntArray191 = new int[this.anInt1738];
		this.anIntArray188 = new int[this.anInt1738];
		this.anIntArray189 = new int[this.anInt1738];
		this.anIntArrayArray55 = new int[this.anInt1738][];
		@Pc(139) int local139;
		@Pc(153) int local153;
		if (local47 != 0) {
			this.anIntArray190 = new int[this.anInt1738];
			for (local139 = 0; local139 < this.anInt1738; local139++) {
				this.anIntArray190[local139] = -1;
			}
			for (local153 = 0; local153 < this.anInt1736; local153++) {
				this.anIntArray190[this.anIntArray187[local153]] = local12.method4444();
			}
			this.aClass139_1 = new Class139(this.anIntArray190);
		}
		for (local139 = 0; local139 < this.anInt1736; local139++) {
			this.anIntArray189[this.anIntArray187[local139]] = local12.method4444();
		}
		for (local153 = 0; local153 < this.anInt1736; local153++) {
			this.anIntArray186[this.anIntArray187[local153]] = local12.method4444();
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt1736; local225++) {
			this.anIntArray188[this.anIntArray187[local225]] = local12.method4464();
		}
		@Pc(255) int local255;
		@Pc(262) int local262;
		@Pc(264) int local264;
		@Pc(272) int local272;
		@Pc(289) int local289;
		for (@Pc(248) int local248 = 0; local248 < this.anInt1736; local248++) {
			local255 = this.anIntArray187[local248];
			local54 = 0;
			local262 = this.anIntArray188[local255];
			local264 = -1;
			this.anIntArrayArray55[local255] = new int[local262];
			for (local272 = 0; local272 < local262; local272++) {
				local289 = this.anIntArrayArray55[local255][local272] = local54 += local12.method4464();
				if (local264 < local289) {
					local264 = local289;
				}
			}
			this.anIntArray191[local255] = local264 + 1;
			if (local264 + 1 == local262) {
				this.anIntArrayArray55[local255] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass139Array1 = new Class139[local56 + 1];
		this.anIntArrayArray54 = new int[local56 + 1][];
		for (local255 = 0; local255 < this.anInt1736; local255++) {
			local262 = this.anIntArray187[local255];
			local264 = this.anIntArray188[local262];
			this.anIntArrayArray54[local262] = new int[this.anIntArray191[local262]];
			for (local272 = 0; local272 < this.anIntArray191[local262]; local272++) {
				this.anIntArrayArray54[local262][local272] = -1;
			}
			for (local289 = 0; local289 < local264; local289++) {
				@Pc(398) int local398;
				if (this.anIntArrayArray55[local262] == null) {
					local398 = local289;
				} else {
					local398 = this.anIntArrayArray55[local262][local289];
				}
				this.anIntArrayArray54[local262][local398] = local12.method4444();
			}
			this.aClass139Array1[local262] = new Class139(this.anIntArrayArray54[local262]);
		}
	}
}

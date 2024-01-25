import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class77 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	public int anInt1852;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "[Lclient!to;")
	public Class242[] aClass242Array1;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	public int anInt1855;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Lclient!to;")
	public Class242 aClass242_1;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "[I")
	public int[] anIntArray139;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	public int anInt1856;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
	public int[] anIntArray141;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	public final int anInt1854;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "([BI)V")
	public Class77(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1854 = Static426.method3629(arg0, arg0.length);
		if (arg1 != this.anInt1854) {
			throw new RuntimeException();
		}
		this.method1518(arg0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([BI)V")
	private void method1518(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class4_Sub9 local12 = new Class4_Sub9(Static446.method5930(arg0));
		@Pc(16) int local16 = local12.method5007();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt1852 = 0;
		} else {
			this.anInt1852 = local12.method4997();
		}
		@Pc(47) int local47 = local12.method5007();
		this.anInt1856 = local12.method5028();
		@Pc(54) int local54 = 0;
		this.anIntArray137 = new int[this.anInt1856];
		@Pc(61) int local61 = -1;
		for (@Pc(63) int local63 = 0; local63 < this.anInt1856; local63++) {
			this.anIntArray137[local63] = local54 += local12.method5028();
			if (local61 < this.anIntArray137[local63]) {
				local61 = this.anIntArray137[local63];
			}
		}
		this.anInt1855 = local61 + 1;
		this.anIntArrayArray22 = new int[this.anInt1855][];
		this.anIntArray136 = new int[this.anInt1855];
		this.anIntArray141 = new int[this.anInt1855];
		this.anIntArray135 = new int[this.anInt1855];
		this.anIntArray138 = new int[this.anInt1855];
		@Pc(139) int local139;
		@Pc(153) int local153;
		if (local47 != 0) {
			this.anIntArray139 = new int[this.anInt1855];
			for (local139 = 0; local139 < this.anInt1855; local139++) {
				this.anIntArray139[local139] = -1;
			}
			for (local153 = 0; local153 < this.anInt1856; local153++) {
				this.anIntArray139[this.anIntArray137[local153]] = local12.method4997();
			}
			this.aClass242_1 = new Class242(this.anIntArray139);
		}
		for (local139 = 0; local139 < this.anInt1856; local139++) {
			this.anIntArray141[this.anIntArray137[local139]] = local12.method4997();
		}
		for (local153 = 0; local153 < this.anInt1856; local153++) {
			this.anIntArray136[this.anIntArray137[local153]] = local12.method4997();
		}
		for (@Pc(221) int local221 = 0; local221 < this.anInt1856; local221++) {
			this.anIntArray135[this.anIntArray137[local221]] = local12.method5028();
		}
		@Pc(251) int local251;
		@Pc(258) int local258;
		@Pc(260) int local260;
		@Pc(268) int local268;
		@Pc(285) int local285;
		for (@Pc(244) int local244 = 0; local244 < this.anInt1856; local244++) {
			local251 = this.anIntArray137[local244];
			local54 = 0;
			local258 = this.anIntArray135[local251];
			local260 = -1;
			this.anIntArrayArray22[local251] = new int[local258];
			for (local268 = 0; local268 < local258; local268++) {
				local285 = this.anIntArrayArray22[local251][local268] = local54 += local12.method5028();
				if (local285 > local260) {
					local260 = local285;
				}
			}
			this.anIntArray138[local251] = local260 + 1;
			if (local258 == local260 + 1) {
				this.anIntArrayArray22[local251] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass242Array1 = new Class242[local61 + 1];
		this.anIntArrayArray21 = new int[local61 + 1][];
		for (local251 = 0; local251 < this.anInt1856; local251++) {
			local258 = this.anIntArray137[local251];
			local260 = this.anIntArray135[local258];
			this.anIntArrayArray21[local258] = new int[this.anIntArray138[local258]];
			for (local268 = 0; local268 < this.anIntArray138[local258]; local268++) {
				this.anIntArrayArray21[local258][local268] = -1;
			}
			for (local285 = 0; local285 < local260; local285++) {
				@Pc(399) int local399;
				if (this.anIntArrayArray22[local258] == null) {
					local399 = local285;
				} else {
					local399 = this.anIntArrayArray22[local258][local285];
				}
				this.anIntArrayArray21[local258][local399] = local12.method4997();
			}
			this.aClass242Array1[local258] = new Class242(this.anIntArrayArray21[local258]);
		}
	}
}

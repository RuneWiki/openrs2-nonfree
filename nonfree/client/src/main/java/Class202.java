import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class202 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
	public int[] anIntArray518;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
	public int[] anIntArray519;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public int anInt6058;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "Lclient!ph;")
	public Class158 aClass158_1;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "[Lclient!ph;")
	public Class158[] aClass158Array1;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
	public int anInt6065;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
	public int anInt6066;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "[I")
	public int[] anIntArray523;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
	public final int anInt6061;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "([BI)V")
	public Class202(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6061 = Static347.method5724(arg0.length, arg0);
		if (arg1 != this.anInt6061) {
			throw new RuntimeException();
		}
		this.method5394(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B[B)V")
	private void method5394(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class5_Sub1 local12 = new Class5_Sub1(Static230.method3964(arg0));
		@Pc(16) int local16 = local12.method1832();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6066 = 0;
		} else {
			this.anInt6066 = local12.method1826();
		}
		@Pc(43) int local43 = local12.method1832();
		this.anInt6058 = local12.method1845();
		@Pc(50) int local50 = 0;
		this.anIntArray522 = new int[this.anInt6058];
		@Pc(57) int local57 = -1;
		for (@Pc(59) int local59 = 0; local59 < this.anInt6058; local59++) {
			this.anIntArray522[local59] = local50 += local12.method1845();
			if (local57 < this.anIntArray522[local59]) {
				local57 = this.anIntArray522[local59];
			}
		}
		this.anInt6065 = local57 + 1;
		this.anIntArray523 = new int[this.anInt6065];
		this.anIntArrayArray54 = new int[this.anInt6065][];
		this.anIntArray518 = new int[this.anInt6065];
		this.anIntArray520 = new int[this.anInt6065];
		this.anIntArray521 = new int[this.anInt6065];
		@Pc(136) int local136;
		@Pc(154) int local154;
		if (local43 != 0) {
			this.anIntArray519 = new int[this.anInt6065];
			for (local136 = 0; local136 < this.anInt6065; local136++) {
				this.anIntArray519[local136] = -1;
			}
			for (local154 = 0; local154 < this.anInt6058; local154++) {
				this.anIntArray519[this.anIntArray522[local154]] = local12.method1826();
			}
			this.aClass158_1 = new Class158(this.anIntArray519);
		}
		for (local136 = 0; local136 < this.anInt6058; local136++) {
			this.anIntArray518[this.anIntArray522[local136]] = local12.method1826();
		}
		for (local154 = 0; local154 < this.anInt6058; local154++) {
			this.anIntArray521[this.anIntArray522[local154]] = local12.method1826();
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt6058; local227++) {
			this.anIntArray520[this.anIntArray522[local227]] = local12.method1845();
		}
		@Pc(257) int local257;
		@Pc(262) int local262;
		@Pc(266) int local266;
		@Pc(274) int local274;
		@Pc(291) int local291;
		for (@Pc(250) int local250 = 0; local250 < this.anInt6058; local250++) {
			local257 = this.anIntArray522[local250];
			local262 = this.anIntArray520[local257];
			local50 = 0;
			local266 = -1;
			this.anIntArrayArray54[local257] = new int[local262];
			for (local274 = 0; local274 < local262; local274++) {
				local291 = this.anIntArrayArray54[local257][local274] = local50 += local12.method1845();
				if (local291 > local266) {
					local266 = local291;
				}
			}
			this.anIntArray523[local257] = local266 + 1;
			if (local266 + 1 == local262) {
				this.anIntArrayArray54[local257] = null;
			}
		}
		if (local43 == 0) {
			return;
		}
		this.aClass158Array1 = new Class158[local57 + 1];
		this.anIntArrayArray53 = new int[local57 + 1][];
		for (local257 = 0; local257 < this.anInt6058; local257++) {
			local262 = this.anIntArray522[local257];
			local266 = this.anIntArray520[local262];
			this.anIntArrayArray53[local262] = new int[this.anIntArray523[local262]];
			for (local274 = 0; local274 < this.anIntArray523[local262]; local274++) {
				this.anIntArrayArray53[local262][local274] = -1;
			}
			for (local291 = 0; local291 < local266; local291++) {
				@Pc(408) int local408;
				if (this.anIntArrayArray54[local262] == null) {
					local408 = local291;
				} else {
					local408 = this.anIntArrayArray54[local262][local291];
				}
				this.anIntArrayArray53[local262][local408] = local12.method1826();
			}
			this.aClass158Array1[local262] = new Class158(this.anIntArrayArray53[local262]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class272 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!is;")
	public Class115 aClass115_1;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "[I")
	public int[] anIntArray515;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	public int anInt7537;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
	public int anInt7538;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "[I")
	public int[] anIntArray516;

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "[I")
	public int[] anIntArray517;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "[Lclient!is;")
	public Class115[] aClass115Array1;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "[I")
	public int[] anIntArray518;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "[I")
	public int[] anIntArray519;

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
	public int anInt7541;

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
	public final int anInt7539;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "([BI)V")
	public Class272(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7539 = Static278.method3865(arg0, arg0.length);
		if (arg1 != this.anInt7539) {
			throw new RuntimeException();
		}
		this.method5948(arg0);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([BI)V")
	private void method5948(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub28 local12 = new Class1_Sub28(Static369.method4903(arg0));
		@Pc(16) int local16 = local12.method5337();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt7541 = 0;
		} else {
			this.anInt7541 = local12.method5355();
		}
		@Pc(53) int local53 = local12.method5337();
		this.anInt7537 = local12.method5335();
		@Pc(60) int local60 = 0;
		this.anIntArray520 = new int[this.anInt7537];
		@Pc(67) int local67 = -1;
		for (@Pc(69) int local69 = 0; local69 < this.anInt7537; local69++) {
			this.anIntArray520[local69] = local60 += local12.method5335();
			if (local67 < this.anIntArray520[local69]) {
				local67 = this.anIntArray520[local69];
			}
		}
		this.anInt7538 = local67 + 1;
		this.anIntArray517 = new int[this.anInt7538];
		this.anIntArray519 = new int[this.anInt7538];
		this.anIntArray516 = new int[this.anInt7538];
		this.anIntArrayArray64 = new int[this.anInt7538][];
		this.anIntArray515 = new int[this.anInt7538];
		@Pc(141) int local141;
		@Pc(155) int local155;
		if (local53 != 0) {
			this.anIntArray518 = new int[this.anInt7538];
			for (local141 = 0; local141 < this.anInt7538; local141++) {
				this.anIntArray518[local141] = -1;
			}
			for (local155 = 0; local155 < this.anInt7537; local155++) {
				this.anIntArray518[this.anIntArray520[local155]] = local12.method5355();
			}
			this.aClass115_1 = new Class115(this.anIntArray518);
		}
		for (local141 = 0; local141 < this.anInt7537; local141++) {
			this.anIntArray517[this.anIntArray520[local141]] = local12.method5355();
		}
		for (local155 = 0; local155 < this.anInt7537; local155++) {
			this.anIntArray515[this.anIntArray520[local155]] = local12.method5355();
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt7537; local227++) {
			this.anIntArray516[this.anIntArray520[local227]] = local12.method5335();
		}
		@Pc(257) int local257;
		@Pc(264) int local264;
		@Pc(266) int local266;
		@Pc(274) int local274;
		@Pc(291) int local291;
		for (@Pc(250) int local250 = 0; local250 < this.anInt7537; local250++) {
			local257 = this.anIntArray520[local250];
			local60 = 0;
			local264 = this.anIntArray516[local257];
			local266 = -1;
			this.anIntArrayArray64[local257] = new int[local264];
			for (local274 = 0; local274 < local264; local274++) {
				local291 = this.anIntArrayArray64[local257][local274] = local60 += local12.method5335();
				if (local291 > local266) {
					local266 = local291;
				}
			}
			this.anIntArray519[local257] = local266 + 1;
			if (local264 == local266 + 1) {
				this.anIntArrayArray64[local257] = null;
			}
		}
		if (local53 == 0) {
			return;
		}
		this.anIntArrayArray65 = new int[local67 + 1][];
		this.aClass115Array1 = new Class115[local67 + 1];
		for (local257 = 0; local257 < this.anInt7537; local257++) {
			local264 = this.anIntArray520[local257];
			local266 = this.anIntArray516[local264];
			this.anIntArrayArray65[local264] = new int[this.anIntArray519[local264]];
			for (local274 = 0; local274 < this.anIntArray519[local264]; local274++) {
				this.anIntArrayArray65[local264][local274] = -1;
			}
			for (local291 = 0; local291 < local266; local291++) {
				@Pc(404) int local404;
				if (this.anIntArrayArray64[local264] == null) {
					local404 = local291;
				} else {
					local404 = this.anIntArrayArray64[local264][local291];
				}
				this.anIntArrayArray65[local264][local404] = local12.method5355();
			}
			this.aClass115Array1[local264] = new Class115(this.anIntArrayArray65[local264]);
		}
	}
}

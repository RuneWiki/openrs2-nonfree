import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class150 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
	public int[] anIntArray416;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
	public int[] anIntArray417;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "[I")
	public int[] anIntArray418;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "[I")
	public int[] anIntArray419;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
	public int[] anIntArray420;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	public int anInt4530;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "[Lclient!kj;")
	public Class124[] aClass124Array1;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	public int anInt4533;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "[I")
	public int[] anIntArray422;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "Lclient!kj;")
	public Class124 aClass124_1;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "I")
	public int anInt4535;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "I")
	public final int anInt4536;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "([BI)V")
	public Class150(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4536 = Static111.method1800(arg0, arg0.length);
		if (this.anInt4536 != arg1) {
			throw new RuntimeException();
		}
		this.method3952(arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[B)V")
	private void method3952(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub21 local12 = new Class1_Sub21(Static99.method1590(arg0));
		@Pc(16) int local16 = local12.method5720();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt4530 = local12.method5716();
		} else {
			this.anInt4530 = 0;
		}
		@Pc(47) int local47 = local12.method5720();
		this.anInt4535 = local12.method5715();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray418 = new int[this.anInt4535];
		for (@Pc(63) int local63 = 0; local63 < this.anInt4535; local63++) {
			this.anIntArray418[local63] = local54 += local12.method5715();
			if (this.anIntArray418[local63] > local56) {
				local56 = this.anIntArray418[local63];
			}
		}
		this.anInt4533 = local56 + 1;
		this.anIntArray417 = new int[this.anInt4533];
		this.anIntArray420 = new int[this.anInt4533];
		this.anIntArrayArray36 = new int[this.anInt4533][];
		this.anIntArray419 = new int[this.anInt4533];
		this.anIntArray416 = new int[this.anInt4533];
		@Pc(140) int local140;
		@Pc(154) int local154;
		if (local47 != 0) {
			this.anIntArray422 = new int[this.anInt4533];
			for (local140 = 0; local140 < this.anInt4533; local140++) {
				this.anIntArray422[local140] = -1;
			}
			for (local154 = 0; local154 < this.anInt4535; local154++) {
				this.anIntArray422[this.anIntArray418[local154]] = local12.method5716();
			}
			this.aClass124_1 = new Class124(this.anIntArray422);
		}
		for (local140 = 0; local140 < this.anInt4535; local140++) {
			this.anIntArray417[this.anIntArray418[local140]] = local12.method5716();
		}
		for (local154 = 0; local154 < this.anInt4535; local154++) {
			this.anIntArray419[this.anIntArray418[local154]] = local12.method5716();
		}
		for (@Pc(222) int local222 = 0; local222 < this.anInt4535; local222++) {
			this.anIntArray416[this.anIntArray418[local222]] = local12.method5715();
		}
		@Pc(248) int local248;
		@Pc(255) int local255;
		@Pc(263) int local263;
		@Pc(265) int local265;
		@Pc(282) int local282;
		for (@Pc(241) int local241 = 0; local241 < this.anInt4535; local241++) {
			local248 = this.anIntArray418[local241];
			local54 = 0;
			local255 = this.anIntArray416[local248];
			this.anIntArrayArray36[local248] = new int[local255];
			local263 = -1;
			for (local265 = 0; local265 < local255; local265++) {
				local282 = this.anIntArrayArray36[local248][local265] = local54 += local12.method5715();
				if (local263 < local282) {
					local263 = local282;
				}
			}
			this.anIntArray420[local248] = local263 + 1;
			if (local255 == local263 + 1) {
				this.anIntArrayArray36[local248] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass124Array1 = new Class124[local56 + 1];
		this.anIntArrayArray37 = new int[local56 + 1][];
		for (local248 = 0; local248 < this.anInt4535; local248++) {
			local255 = this.anIntArray418[local248];
			local263 = this.anIntArray416[local255];
			this.anIntArrayArray37[local255] = new int[this.anIntArray420[local255]];
			for (local265 = 0; local265 < this.anIntArray420[local255]; local265++) {
				this.anIntArrayArray37[local255][local265] = -1;
			}
			for (local282 = 0; local282 < local263; local282++) {
				@Pc(387) int local387;
				if (this.anIntArrayArray36[local255] == null) {
					local387 = local282;
				} else {
					local387 = this.anIntArrayArray36[local255][local282];
				}
				this.anIntArrayArray37[local255][local387] = local12.method5716();
			}
			this.aClass124Array1[local255] = new Class124(this.anIntArrayArray37[local255]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class176 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!ge;")
	public Class61 aClass61_1;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[Lclient!ge;")
	public Class61[] aClass61Array1;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
	public int[] anIntArray611;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	public int anInt6186;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
	public int[] anIntArray612;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
	public int[] anIntArray613;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	public int anInt6188;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
	public int[] anIntArray614;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	public int anInt6191;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
	public int[] anIntArray616;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
	public int anInt6187;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "([BI)V")
	public Class176(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6187 = Static193.method3429(arg0.length, arg0);
		if (arg1 != this.anInt6187) {
			throw new RuntimeException();
		}
		this.method4789(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B)V")
	private void method4789(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub16 local12 = new Class1_Sub16(Static150.method1242(arg0));
		@Pc(16) int local16 = local12.method2655();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt6188 = local12.method2610();
		} else {
			this.anInt6188 = 0;
		}
		@Pc(53) int local53 = -1;
		@Pc(55) int local55 = 0;
		@Pc(59) int local59 = local12.method2655();
		this.anInt6186 = local12.method2652();
		this.anIntArray614 = new int[this.anInt6186];
		@Pc(71) int local71;
		for (local71 = 0; local71 < this.anInt6186; local71++) {
			this.anIntArray614[local71] = local55 += local12.method2652();
			if (local53 < this.anIntArray614[local71]) {
				local53 = this.anIntArray614[local71];
			}
		}
		this.anInt6191 = local53 + 1;
		this.anIntArray612 = new int[this.anInt6191];
		this.anIntArray613 = new int[this.anInt6191];
		this.anIntArrayArray46 = new int[this.anInt6191][];
		this.anIntArray611 = new int[this.anInt6191];
		this.anIntArray615 = new int[this.anInt6191];
		if (local59 != 0) {
			this.anIntArray616 = new int[this.anInt6191];
			for (local71 = 0; local71 < this.anInt6191; local71++) {
				this.anIntArray616[local71] = -1;
			}
			for (local71 = 0; local71 < this.anInt6186; local71++) {
				this.anIntArray616[this.anIntArray614[local71]] = local12.method2610();
			}
			this.aClass61_1 = new Class61(this.anIntArray616);
		}
		for (local71 = 0; local71 < this.anInt6186; local71++) {
			this.anIntArray611[this.anIntArray614[local71]] = local12.method2610();
		}
		for (local71 = 0; local71 < this.anInt6186; local71++) {
			this.anIntArray615[this.anIntArray614[local71]] = local12.method2610();
		}
		for (local71 = 0; local71 < this.anInt6186; local71++) {
			this.anIntArray613[this.anIntArray614[local71]] = local12.method2652();
		}
		@Pc(268) int local268;
		@Pc(275) int local275;
		@Pc(270) int local270;
		@Pc(283) int local283;
		for (local71 = 0; local71 < this.anInt6186; local71++) {
			local55 = 0;
			local268 = this.anIntArray614[local71];
			local270 = -1;
			local275 = this.anIntArray613[local268];
			this.anIntArrayArray46[local268] = new int[local275];
			for (local283 = 0; local283 < local275; local283++) {
				@Pc(305) int local305 = this.anIntArrayArray46[local268][local283] = local55 += local12.method2652();
				if (local305 > local270) {
					local270 = local305;
				}
			}
			this.anIntArray612[local268] = local270 + 1;
			if (local270 + 1 == local275) {
				this.anIntArrayArray46[local268] = null;
			}
		}
		if (local59 == 0) {
			return;
		}
		this.anIntArrayArray45 = new int[local53 + 1][];
		this.aClass61Array1 = new Class61[local53 + 1];
		for (local71 = 0; local71 < this.anInt6186; local71++) {
			local268 = this.anIntArray614[local71];
			local275 = this.anIntArray613[local268];
			this.anIntArrayArray45[local268] = new int[this.anIntArray612[local268]];
			for (local270 = 0; local270 < this.anIntArray612[local268]; local270++) {
				this.anIntArrayArray45[local268][local270] = -1;
			}
			for (local270 = 0; local270 < local275; local270++) {
				if (this.anIntArrayArray46[local268] == null) {
					local283 = local270;
				} else {
					local283 = this.anIntArrayArray46[local268][local270];
				}
				this.anIntArrayArray45[local268][local283] = local12.method2610();
			}
			this.aClass61Array1[local268] = new Class61(this.anIntArrayArray45[local268]);
		}
	}
}

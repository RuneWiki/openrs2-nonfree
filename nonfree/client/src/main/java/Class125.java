import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class125 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!ti;")
	public Class164 aClass164_1;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	public int anInt3945;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "[Lclient!ti;")
	public Class164[] aClass164Array1;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "[I")
	public int[] anIntArray321;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "I")
	public int anInt3953;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "I")
	public int anInt3954;

	@OriginalMember(owner = "client!of", name = "z", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	public int anInt3943;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "([BI)V")
	public Class125(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3943 = Static56.method1093(arg0, arg0.length);
		if (arg1 != this.anInt3943) {
			throw new RuntimeException();
		}
		this.method3182(arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BB)V")
	private void method3182(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub26 local8 = new Class2_Sub26(Static150.method2609(arg0));
		@Pc(20) int local20 = local8.method4261();
		if (local20 != 5 && local20 != 6) {
			throw new RuntimeException();
		}
		if (local20 < 6) {
			this.anInt3953 = 0;
		} else {
			this.anInt3953 = local8.method4228();
		}
		@Pc(50) int local50 = local8.method4261();
		@Pc(52) int local52 = 0;
		this.anInt3954 = local8.method4242();
		@Pc(59) int local59 = -1;
		this.anIntArray317 = new int[this.anInt3954];
		@Pc(66) int local66;
		for (local66 = 0; local66 < this.anInt3954; local66++) {
			this.anIntArray317[local66] = local52 += local8.method4242();
			if (this.anIntArray317[local66] > local59) {
				local59 = this.anIntArray317[local66];
			}
		}
		this.anInt3945 = local59 + 1;
		this.anIntArray322 = new int[this.anInt3945];
		this.anIntArray316 = new int[this.anInt3945];
		this.anIntArray321 = new int[this.anInt3945];
		this.anIntArray319 = new int[this.anInt3945];
		this.anIntArrayArray34 = new int[this.anInt3945][];
		if (local50 != 0) {
			this.anIntArray320 = new int[this.anInt3945];
			for (local66 = 0; local66 < this.anInt3945; local66++) {
				this.anIntArray320[local66] = -1;
			}
			for (local66 = 0; local66 < this.anInt3954; local66++) {
				this.anIntArray320[this.anIntArray317[local66]] = local8.method4228();
			}
			this.aClass164_1 = new Class164(this.anIntArray320);
		}
		for (local66 = 0; local66 < this.anInt3954; local66++) {
			this.anIntArray322[this.anIntArray317[local66]] = local8.method4228();
		}
		for (local66 = 0; local66 < this.anInt3954; local66++) {
			this.anIntArray319[this.anIntArray317[local66]] = local8.method4228();
		}
		for (local66 = 0; local66 < this.anInt3954; local66++) {
			this.anIntArray316[this.anIntArray317[local66]] = local8.method4242();
		}
		@Pc(251) int local251;
		@Pc(256) int local256;
		@Pc(264) int local264;
		@Pc(266) int local266;
		for (local66 = 0; local66 < this.anInt3954; local66++) {
			local52 = 0;
			local251 = this.anIntArray317[local66];
			local256 = this.anIntArray316[local251];
			this.anIntArrayArray34[local251] = new int[local256];
			local264 = -1;
			for (local266 = 0; local266 < local256; local266++) {
				@Pc(288) int local288 = this.anIntArrayArray34[local251][local266] = local52 += local8.method4242();
				if (local288 > local264) {
					local264 = local288;
				}
			}
			this.anIntArray321[local251] = local264 + 1;
			if (local256 == local264 + 1) {
				this.anIntArrayArray34[local251] = null;
			}
		}
		if (local50 == 0) {
			return;
		}
		this.anIntArrayArray35 = new int[local59 + 1][];
		this.aClass164Array1 = new Class164[local59 + 1];
		for (local66 = 0; local66 < this.anInt3954; local66++) {
			local251 = this.anIntArray317[local66];
			local256 = this.anIntArray316[local251];
			this.anIntArrayArray35[local251] = new int[this.anIntArray321[local251]];
			for (local264 = 0; local264 < this.anIntArray321[local251]; local264++) {
				this.anIntArrayArray35[local251][local264] = -1;
			}
			for (local264 = 0; local264 < local256; local264++) {
				if (this.anIntArrayArray34[local251] == null) {
					local266 = local264;
				} else {
					local266 = this.anIntArrayArray34[local251][local264];
				}
				this.anIntArrayArray35[local251][local266] = local8.method4228();
			}
			this.aClass164Array1[local251] = new Class164(this.anIntArrayArray35[local251]);
		}
	}
}

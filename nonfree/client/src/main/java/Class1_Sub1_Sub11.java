import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jf", name = "L", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!jf", name = "P", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!jf", name = "K", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Lclient!wg;")
	private final Class90 aClass90_1;

	@OriginalMember(owner = "client!jf", name = "Y", descriptor = "Z")
	public boolean aBoolean98;

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "Z")
	public final boolean aBoolean97;

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
	public final int anInt2541;

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
	private int anInt2540;

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
	private int anInt2535;

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
	private int anInt2538;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
	private int anInt2543;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class1_Sub1_Sub11(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aClass90_1 = new Class90(arg0);
		@Pc(14) int local14 = arg0.method1234();
		this.aBoolean98 = (local14 & 0x2) != 0;
		this.aBoolean97 = (local14 & 0x1) != 0;
		this.anInt2541 = arg0.method1234();
		this.anInt2544 = arg0.method1280();
		this.anInt2540 = arg0.method1234();
		if (this.anInt2540 == 255) {
			this.anInt2540 = 256;
		}
		@Pc(66) int local66 = arg0.method1234();
		@Pc(70) int local70 = arg0.method1234();
		this.anInt2535 = (local70 & 0x3F) - 6;
		this.anInt2538 = local70 >> 6 & 0x3;
		this.anInt2543 = local66 >> 6 & 0x3;
		arg0.method1234();
		arg0.method1234();
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		this.aClass90_1 = new Class90();
		this.anInt2541 = 1;
		this.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!u;ZLclient!th;)Z")
	public boolean method1880(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Interface2 arg1) {
		return this.aClass90_1.method3517(arg1, arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!u;ILclient!th;F)[I")
	public int[] method1882(@OriginalArg(1) Class76 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) float arg3) {
		if (this.anIntArray245 == null || this.aFloat2 != arg3) {
			if (!this.aClass90_1.method3517(arg2, arg0)) {
				return null;
			}
			@Pc(39) int local39 = this.anInt2541 <= arg1 ? this.anInt2541 : arg1;
			this.anIntArray245 = this.aClass90_1.method3512(local39, arg0, true, local39, (double) arg3, arg2);
			this.aFloat2 = arg3;
		}
		return this.anIntArray245;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!u;ILclient!th;B)[I")
	public int[] method1883(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2 arg2) {
		if (this.aClass90_1.method3517(arg2, arg0)) {
			@Pc(31) int local31 = arg1 < this.anInt2541 ? arg1 : this.anInt2541;
			return this.aClass90_1.method3512(local31, arg0, false, local31, 1.0D, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
	public void method1884(@OriginalArg(0) int arg0) {
		if (this.anIntArray245 == null) {
			return;
		}
		@Pc(38) short local38;
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(92) int[] local92;
		if (this.anInt2538 != 0) {
			if (Static54.anIntArray176 == null || this.anIntArray245.length > Static54.anIntArray176.length) {
				Static54.anIntArray176 = new int[this.anIntArray245.length];
			}
			if (this.anIntArray245.length == 4096) {
				local38 = 64;
			} else {
				local38 = 128;
			}
			local46 = this.anIntArray245.length;
			local53 = this.anInt2535 * arg0 * local38;
			local57 = local46 - 1;
			if (this.anInt2538 == 2) {
				local53 = -local53;
			}
			for (local66 = 0; local66 < local46; local66++) {
				local74 = local53 + local66 & local57;
				Static54.anIntArray176[local66] = this.anIntArray245[local74];
			}
			local92 = this.anIntArray245;
			this.anIntArray245 = Static54.anIntArray176;
			Static54.anIntArray176 = local92;
		}
		if (this.anInt2543 == 0) {
			return;
		}
		if (Static54.anIntArray176 == null || this.anIntArray245.length > Static54.anIntArray176.length) {
			Static54.anIntArray176 = new int[this.anIntArray245.length];
		}
		local46 = this.anIntArray245.length;
		local53 = arg0 * this.anInt2535;
		if (this.anInt2543 == 1) {
			local53 = -local53;
		}
		if (this.anIntArray245.length == 4096) {
			local38 = 64;
		} else {
			local38 = 128;
		}
		local57 = local38 - 1;
		for (local66 = 0; local66 < local46; local66 += local38) {
			for (local74 = 0; local74 < local38; local74++) {
				@Pc(165) int local165 = local66 + (local57 & local74 + local53);
				@Pc(169) int local169 = local74 + local66;
				Static54.anIntArray176[local169] = this.anIntArray245[local165];
			}
		}
		local92 = this.anIntArray245;
		this.anIntArray245 = Static54.anIntArray176;
		Static54.anIntArray176 = local92;
	}
}

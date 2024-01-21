import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!r", name = "I", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!r", name = "L", descriptor = "[I")
	private int[] anIntArray470;

	@OriginalMember(owner = "client!r", name = "K", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "Lclient!bg;")
	private final Class11 aClass11_1;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "Z")
	public final boolean aBoolean180;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!r", name = "J", descriptor = "I")
	public final int anInt3522;

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
	public int anInt3526;

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
	private int anInt3531;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "I")
	private int anInt3529;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "I")
	private int anInt3528;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "I")
	private int anInt3527;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class1_Sub1_Sub15(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass11_1 = new Class11(arg0);
		@Pc(14) int local14 = arg0.method861();
		this.aBoolean180 = (local14 & 0x1) != 0;
		this.aBoolean179 = (local14 & 0x2) != 0;
		this.anInt3522 = arg0.method861();
		this.anInt3526 = arg0.method878();
		this.anInt3531 = arg0.method861();
		if (this.anInt3531 == 255) {
			this.anInt3531 = 256;
		}
		@Pc(63) int local63 = arg0.method861();
		@Pc(67) int local67 = arg0.method861();
		this.anInt3529 = (local67 & 0x3F) - 6;
		this.anInt3528 = local63 >> 6 & 0x3;
		this.anInt3527 = local67 >> 6 & 0x3;
		arg0.method861();
		arg0.method861();
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		this.aClass11_1 = new Class11();
		this.aBoolean180 = true;
		this.anInt3522 = 1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ga;Lclient!ai;Z)Z")
	public boolean method2424(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Interface1 arg1) {
		return this.aClass11_1.method266(arg1, arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!ai;Lclient!ga;I)[I")
	public int[] method2425(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) Class30 arg2) {
		if (this.aClass11_1.method266(arg1, arg2)) {
			@Pc(26) int local26 = this.anInt3522 <= arg0 ? this.anInt3522 : arg0;
			return this.aClass11_1.method271(local26, arg2, local26, arg1, false, 1.0D);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public void method2427(@OriginalArg(1) int arg0) {
		if (this.anIntArray470 == null) {
			return;
		}
		@Pc(42) short local42;
		@Pc(33) int local33;
		@Pc(57) int local57;
		@Pc(50) int local50;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(92) int[] local92;
		if (this.anInt3527 != 0) {
			if (Static43.anIntArray141 == null || this.anIntArray470.length > Static43.anIntArray141.length) {
				Static43.anIntArray141 = new int[this.anIntArray470.length];
			}
			local33 = this.anIntArray470.length;
			if (this.anIntArray470.length == 4096) {
				local42 = 64;
			} else {
				local42 = 128;
			}
			local50 = local33 - 1;
			local57 = local42 * arg0 * this.anInt3529;
			if (this.anInt3527 == 2) {
				local57 = -local57;
			}
			for (local66 = 0; local66 < local33; local66++) {
				local74 = local50 & local57 + local66;
				Static43.anIntArray141[local66] = this.anIntArray470[local74];
			}
			local92 = this.anIntArray470;
			this.anIntArray470 = Static43.anIntArray141;
			Static43.anIntArray141 = local92;
		}
		if (this.anInt3528 == 0) {
			return;
		}
		if (Static43.anIntArray141 == null || Static43.anIntArray141.length < this.anIntArray470.length) {
			Static43.anIntArray141 = new int[this.anIntArray470.length];
		}
		if (this.anIntArray470.length == 4096) {
			local42 = 64;
		} else {
			local42 = 128;
		}
		local33 = this.anIntArray470.length;
		local57 = arg0 * this.anInt3529;
		if (this.anInt3528 == 1) {
			local57 = -local57;
		}
		local50 = local42 - 1;
		for (local66 = 0; local66 < local33; local66 += local42) {
			for (local74 = 0; local74 < local42; local74++) {
				@Pc(167) int local167 = (local50 & local57 + local74) + local66;
				@Pc(171) int local171 = local66 + local74;
				Static43.anIntArray141[local171] = this.anIntArray470[local167];
			}
		}
		local92 = this.anIntArray470;
		this.anIntArray470 = Static43.anIntArray141;
		Static43.anIntArray141 = local92;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ga;Lclient!ai;IFI)[I")
	public int[] method2428(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray470 == null || arg2 != this.aFloat3) {
			if (!this.aClass11_1.method266(arg1, arg0)) {
				return null;
			}
			@Pc(29) int local29 = this.anInt3522 > arg3 ? arg3 : this.anInt3522;
			this.anIntArray470 = this.aClass11_1.method271(local29, arg0, local29, arg1, true, (double) arg2);
			this.aFloat3 = arg2;
		}
		return this.anIntArray470;
	}
}

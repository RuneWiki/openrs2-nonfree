import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
	public int anInt3123;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
	public int anInt3124;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
	public int anInt3130;

	@OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
	public int anInt3135;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
	public int anInt3131 = -1;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	public int anInt3129 = 0;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
	public int anInt3132 = -1;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public void method2229() {
		if (this.anInt3132 != -1) {
			this.method2233(this.anInt3132);
			this.anInt3127 = this.anInt3130;
			this.anInt3124 = this.anInt3123;
			this.anInt3135 = this.anInt3128;
		}
		this.method2233(this.anInt3129);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!va;IB)V")
	public void method2230(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1461();
			if (local9 == 0) {
				return;
			}
			this.method2234(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	private void method2233(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local10;
		@Pc(40) double local40 = local10;
		@Pc(42) double local42 = 0.0D;
		if (local10 > local36) {
			local38 = local36;
		}
		if (local23 < local38) {
			local38 = local23;
		}
		if (local36 > local10) {
			local40 = local36;
		}
		@Pc(62) double local62 = 0.0D;
		if (local40 < local23) {
			local40 = local23;
		}
		@Pc(74) double local74 = (local38 + local40) / 2.0D;
		if (local38 != local40) {
			if (local74 < 0.5D) {
				local62 = (local40 - local38) / (local38 + local40);
			}
			if (local10 == local40) {
				local42 = (local36 - local23) / (local40 - local38);
			} else if (local36 == local40) {
				local42 = (local23 - local10) / (local40 - local38) + 2.0D;
			} else if (local40 == local23) {
				local42 = (local10 - local36) / (-local38 + local40) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local62 = (local40 - local38) / (2.0D - local40 - local38);
			}
		}
		this.anInt3123 = (int) (local74 * 256.0D);
		this.anInt3130 = (int) (local62 * 256.0D);
		if (this.anInt3123 < 0) {
			this.anInt3123 = 0;
		} else if (this.anInt3123 > 255) {
			this.anInt3123 = 255;
		}
		local42 /= 6.0D;
		this.anInt3128 = (int) (local42 * 256.0D);
		if (this.anInt3130 < 0) {
			this.anInt3130 = 0;
		} else if (this.anInt3130 > 255) {
			this.anInt3130 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILclient!va;I)V")
	private void method2234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt3129 = arg2.method1436();
		} else if (arg1 == 2) {
			this.anInt3131 = arg2.method1461();
		} else if (arg1 == 3) {
			this.anInt3131 = arg2.method1456();
			if (this.anInt3131 == 65535) {
				this.anInt3131 = -1;
				return;
			}
			return;
		} else if (arg1 == 5) {
			this.aBoolean139 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt3132 = arg2.method1436();
			return;
		}
	}
}

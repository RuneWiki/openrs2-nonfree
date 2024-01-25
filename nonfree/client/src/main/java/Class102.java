import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class102 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	private int anInt3109;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public int anInt3110;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public int anInt3112;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "J")
	public long aLong110;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public int anInt3117;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
	public int anInt3118;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public int anInt3120;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
	public int anInt3125;

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
	public int anInt3129;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
	public int anInt3123 = 0;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
	public int anInt3124 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public void method2873() {
		this.anInt3110 = Class208.anIntArray478[this.anInt3109 << 3];
		this.anInt3120 = (int) Math.sqrt((double) (this.anInt3117 * this.anInt3117 + this.anInt3128 * this.anInt3128 + this.anInt3125 * this.anInt3125));
		if (this.anInt3129 == 0) {
			this.anInt3129 = 1;
		}
		if (this.anInt3118 == 0) {
			this.aLong110 = 2147483647L;
		} else if (this.anInt3118 == 1) {
			this.aLong110 = this.anInt3120 * 8 / this.anInt3129;
			this.aLong110 *= this.aLong110;
		} else if (this.anInt3118 == 2) {
			this.aLong110 = this.anInt3120 * 8 / this.anInt3129;
		}
		if (this.aBoolean211) {
			this.anInt3120 *= -1;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!at;)V")
	public void method2874(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2132();
			if (local5 == 0) {
				return;
			}
			this.method2876(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!at;II)V")
	private void method2876(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3109 = arg0.method2161();
		} else if (arg1 == 2) {
			arg0.method2132();
		} else if (arg1 == 3) {
			this.anInt3117 = arg0.method2140();
			this.anInt3128 = arg0.method2140();
			this.anInt3125 = arg0.method2140();
		} else if (arg1 == 4) {
			this.anInt3118 = arg0.method2132();
			this.anInt3129 = arg0.method2140();
		} else if (arg1 == 6) {
			this.anInt3112 = arg0.method2132();
		} else if (arg1 == 8) {
			this.anInt3123 = 1;
		} else if (arg1 == 9) {
			this.anInt3124 = 1;
		} else if (arg1 == 10) {
			this.aBoolean211 = true;
		}
	}
}

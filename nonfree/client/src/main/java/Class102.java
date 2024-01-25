import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class102 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
	public int anInt3090;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	public int anInt3091;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	public int anInt3092;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "J")
	public long aLong96;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
	public int anInt3095;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
	public int anInt3096;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
	public int anInt3097;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
	public int anInt3101;

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
	public int anInt3102;

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
	public int anInt3103;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
	private int anInt3105;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Z")
	private boolean aBoolean277 = false;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	public int anInt3089 = 0;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
	public int anInt3100 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!cu;)V")
	public void method2483(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2582();
			if (local14 == 0) {
				return;
			}
			this.method2486(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public void method2485() {
		this.anInt3102 = Class3_Sub2_Sub17.anIntArray290[this.anInt3105 << 3];
		this.anInt3090 = (int) Math.sqrt((double) (this.anInt3095 * this.anInt3095 + this.anInt3092 * this.anInt3092 + this.anInt3091 * this.anInt3091));
		if (this.anInt3101 == 0) {
			this.anInt3101 = 1;
		}
		if (this.anInt3097 == 0) {
			this.aLong96 = 2147483647L;
		} else if (this.anInt3097 == 1) {
			this.aLong96 = this.anInt3090 * 8 / this.anInt3101;
			this.aLong96 *= this.aLong96;
		} else if (this.anInt3097 == 2) {
			this.aLong96 = this.anInt3090 * 8 / this.anInt3101;
		}
		if (this.aBoolean277) {
			this.anInt3090 *= -1;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLclient!cu;I)V")
	private void method2486(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3105 = arg0.method2588();
		} else if (arg1 == 2) {
			arg0.method2582();
		} else if (arg1 == 3) {
			this.anInt3092 = arg0.method2589();
			this.anInt3095 = arg0.method2589();
			this.anInt3091 = arg0.method2589();
		} else if (arg1 == 4) {
			this.anInt3097 = arg0.method2582();
			this.anInt3101 = arg0.method2589();
		} else if (arg1 == 6) {
			this.anInt3103 = arg0.method2582();
		} else if (arg1 == 8) {
			this.anInt3100 = 1;
		} else if (arg1 == 9) {
			this.anInt3089 = 1;
		} else if (arg1 == 10) {
			this.aBoolean277 = true;
		}
	}
}

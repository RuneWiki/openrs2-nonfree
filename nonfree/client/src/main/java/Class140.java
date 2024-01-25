import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class140 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public int anInt3949;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public int anInt3950;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	private int anInt3952;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public int anInt3953;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public int anInt3955;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	public int anInt3957;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "J")
	public long aLong125;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	public int anInt3959;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
	public int anInt3960;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	public int anInt3962;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public int anInt3963;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public int anInt3947 = 0;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
	public int anInt3958 = 0;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Z")
	private boolean aBoolean361 = false;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!wm;)V")
	public void method3086(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2915();
			if (local11 == 0) {
				return;
			}
			this.method3089(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!wm;)V")
	private void method3089(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.anInt3952 = arg1.method2896();
		} else if (arg0 == 2) {
			arg1.method2915();
		} else if (arg0 == 3) {
			this.anInt3949 = arg1.method2877();
			this.anInt3953 = arg1.method2877();
			this.anInt3955 = arg1.method2877();
		} else if (arg0 == 4) {
			this.anInt3963 = arg1.method2915();
			this.anInt3959 = arg1.method2877();
		} else if (arg0 == 6) {
			this.anInt3962 = arg1.method2915();
		} else if (arg0 == 8) {
			this.anInt3947 = 1;
			return;
		} else if (arg0 == 9) {
			this.anInt3958 = 1;
			return;
		} else if (arg0 == 10) {
			this.aBoolean361 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public void method3091() {
		this.anInt3957 = Class1_Sub29.anIntArray536[this.anInt3952 << 3];
		this.anInt3950 = (int) Math.sqrt((double) (this.anInt3955 * this.anInt3955 + this.anInt3953 * this.anInt3953 + this.anInt3949 * this.anInt3949));
		if (this.anInt3959 == 0) {
			this.anInt3959 = 1;
		}
		if (this.anInt3963 == 0) {
			this.aLong125 = 2147483647L;
		} else if (this.anInt3963 == 1) {
			this.aLong125 = this.anInt3950 * 8 / this.anInt3959;
			this.aLong125 *= this.aLong125;
		} else if (this.anInt3963 == 2) {
			this.aLong125 = this.anInt3950 * 8 / this.anInt3959;
		}
		if (this.aBoolean361) {
			this.anInt3950 *= -1;
		}
	}
}

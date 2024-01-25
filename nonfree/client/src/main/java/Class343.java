import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class343 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	public int anInt9082;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	public int anInt9083;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "J")
	public long aLong401;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	private int anInt9086;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public int anInt9088;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	public int anInt9090;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	public int anInt9091;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
	public int anInt9092;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	public int anInt9095;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	public int anInt9096;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
	public int anInt9097;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
	public int anInt9087 = 0;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
	public int anInt9093 = 0;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "Z")
	private boolean aBoolean666 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!io;I)V")
	private void method7519(@OriginalArg(1) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9086 = arg0.method4426();
		} else if (arg1 == 2) {
			arg0.method4393();
		} else if (arg1 == 3) {
			this.anInt9095 = arg0.method4371();
			this.anInt9082 = arg0.method4371();
			this.anInt9088 = arg0.method4371();
		} else if (arg1 == 4) {
			this.anInt9096 = arg0.method4393();
			this.anInt9091 = arg0.method4371();
		} else if (arg1 == 6) {
			this.anInt9083 = arg0.method4393();
		} else if (arg1 == 8) {
			this.anInt9093 = 1;
			return;
		} else if (arg1 == 9) {
			this.anInt9087 = 1;
			return;
		} else if (arg1 == 10) {
			this.aBoolean666 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!io;Z)V")
	public void method7520(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4393();
			if (local9 == 0) {
				return;
			}
			this.method7519(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
	public void method7522() {
		this.anInt9092 = Class151.anIntArray245[this.anInt9086 << 3];
		@Pc(17) long local17 = (long) this.anInt9095;
		@Pc(21) long local21 = (long) this.anInt9082;
		@Pc(25) long local25 = (long) this.anInt9088;
		this.anInt9090 = (int) Math.sqrt((double) (local17 * local17 + local21 * local21 + local25 * local25));
		if (this.anInt9091 == 0) {
			this.anInt9091 = 1;
		}
		if (this.anInt9096 == 0) {
			this.aLong401 = 2147483647L;
		} else if (this.anInt9096 == 1) {
			this.aLong401 = this.anInt9090 * 8 / this.anInt9091;
			this.aLong401 *= this.aLong401;
		} else if (this.anInt9096 == 2) {
			this.aLong401 = this.anInt9090 * 8 / this.anInt9091;
		}
		if (this.aBoolean666) {
			this.anInt9090 *= -1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class274 {

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
	public int anInt7207;

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
	public int anInt7211;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
	private int anInt7213;

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
	public int anInt7214;

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
	public int anInt7216;

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "J")
	public long aLong206;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
	public int anInt7217;

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
	public int anInt7218;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
	public int anInt7219;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
	public int anInt7223;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
	public int anInt7224;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
	public int anInt7220 = 0;

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
	public int anInt7210 = 0;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "Z")
	private boolean aBoolean482 = false;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
	public void method6278() {
		this.anInt7219 = Class42.anIntArray52[this.anInt7213 << 3];
		@Pc(17) long local17 = (long) this.anInt7214;
		@Pc(21) long local21 = (long) this.anInt7224;
		@Pc(33) long local33 = (long) this.anInt7223;
		this.anInt7216 = (int) Math.sqrt((double) (local33 * local33 + local17 * local17 + local21 * local21));
		if (this.anInt7218 == 0) {
			this.anInt7218 = 1;
		}
		if (this.anInt7217 == 0) {
			this.aLong206 = 2147483647L;
		} else if (this.anInt7217 == 1) {
			this.aLong206 = (long) (this.anInt7216 * 8 / this.anInt7218);
			this.aLong206 *= this.aLong206;
		} else if (this.anInt7217 == 2) {
			this.aLong206 = (long) (this.anInt7216 * 8 / this.anInt7218);
		}
		if (this.aBoolean482) {
			this.anInt7216 *= -1;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!wq;II)V")
	private void method6281(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7213 = arg0.method7333();
		} else if (arg1 == 2) {
			arg0.method7291();
		} else if (arg1 == 3) {
			this.anInt7214 = arg0.method7268();
			this.anInt7224 = arg0.method7268();
			this.anInt7223 = arg0.method7268();
		} else if (arg1 == 4) {
			this.anInt7217 = arg0.method7291();
			this.anInt7218 = arg0.method7268();
		} else if (arg1 == 6) {
			this.anInt7211 = arg0.method7291();
		} else if (arg1 == 8) {
			this.anInt7220 = 1;
		} else if (arg1 == 9) {
			this.anInt7210 = 1;
		} else if (arg1 == 10) {
			this.aBoolean482 = true;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLclient!wq;)V")
	public void method6282(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7291();
			if (local5 == 0) {
				return;
			}
			this.method6281(arg0, local5);
		}
	}
}

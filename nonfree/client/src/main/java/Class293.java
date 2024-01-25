import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class293 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "J")
	public long aLong212;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	public int anInt7709;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
	public int anInt7712;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public int anInt7713;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	public int anInt7714;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	public int anInt7715;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
	public int anInt7716;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	public int anInt7717;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
	public int anInt7718;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
	public int anInt7720;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
	private int anInt7722;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	public int anInt7710 = 0;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public int anInt7711 = 0;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Z")
	private boolean aBoolean539 = false;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!dt;B)V")
	public void method6395(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7954();
			if (local13 == 0) {
				return;
			}
			this.method6396(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!dt;BI)V")
	private void method6396(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7722 = arg0.method7951();
		} else if (arg1 == 2) {
			arg0.method7954();
		} else if (arg1 == 3) {
			this.anInt7714 = arg0.method7895();
			this.anInt7712 = arg0.method7895();
			this.anInt7716 = arg0.method7895();
		} else if (arg1 == 4) {
			this.anInt7713 = arg0.method7954();
			this.anInt7709 = arg0.method7895();
		} else if (arg1 == 6) {
			this.anInt7718 = arg0.method7954();
		} else if (arg1 == 8) {
			this.anInt7710 = 1;
		} else if (arg1 == 9) {
			this.anInt7711 = 1;
		} else if (arg1 == 10) {
			this.aBoolean539 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public void method6397() {
		this.anInt7717 = Class94.anIntArray560[this.anInt7722 << 3];
		@Pc(17) long local17 = (long) this.anInt7714;
		@Pc(27) long local27 = (long) this.anInt7712;
		@Pc(31) long local31 = (long) this.anInt7716;
		this.anInt7720 = (int) Math.sqrt((double) (local31 * local31 + local27 * local27 + local17 * local17));
		if (this.anInt7709 == 0) {
			this.anInt7709 = 1;
		}
		if (this.anInt7713 == 0) {
			this.aLong212 = 2147483647L;
		} else if (this.anInt7713 == 1) {
			this.aLong212 = (long) (this.anInt7720 * 8 / this.anInt7709);
			this.aLong212 *= this.aLong212;
		} else if (this.anInt7713 == 2) {
			this.aLong212 = (long) (this.anInt7720 * 8 / this.anInt7709);
		}
		if (this.aBoolean539) {
			this.anInt7720 *= -1;
		}
	}
}

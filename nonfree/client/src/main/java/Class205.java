import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class205 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public int anInt6012;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public int anInt6014;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	private int anInt6017;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
	public int anInt6018;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public int anInt6019;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "J")
	public long aLong166;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
	public int anInt6025;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	public int anInt6026;

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
	public int anInt6027;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
	public int anInt6029;

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
	public int anInt6031;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public int anInt6013 = 0;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
	public int anInt6028 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!ie;)V")
	public void method4884(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6814();
			if (local9 == 0) {
				return;
			}
			this.method4886(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLclient!ie;)V")
	private void method4886(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt6017 = arg1.method6811();
		} else if (arg0 == 2) {
			arg1.method6814();
		} else if (arg0 == 3) {
			this.anInt6025 = arg1.method6816();
			this.anInt6031 = arg1.method6816();
			this.anInt6019 = arg1.method6816();
		} else if (arg0 == 4) {
			this.anInt6026 = arg1.method6814();
			this.anInt6018 = arg1.method6816();
		} else if (arg0 == 6) {
			this.anInt6012 = arg1.method6814();
		} else if (arg0 == 8) {
			this.anInt6013 = 1;
		} else if (arg0 == 9) {
			this.anInt6028 = 1;
		} else if (arg0 == 10) {
			this.aBoolean427 = true;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public void method4887() {
		this.anInt6027 = Class3_Sub28.anIntArray231[this.anInt6017 << 3];
		@Pc(17) long local17 = (long) this.anInt6025;
		@Pc(21) long local21 = (long) this.anInt6031;
		@Pc(31) long local31 = (long) this.anInt6019;
		this.anInt6014 = (int) Math.sqrt((double) (local21 * local21 + local17 * local17 + local31 * local31));
		if (this.anInt6018 == 0) {
			this.anInt6018 = 1;
		}
		if (this.anInt6026 == 0) {
			this.aLong166 = 2147483647L;
		} else if (this.anInt6026 == 1) {
			this.aLong166 = this.anInt6014 * 8 / this.anInt6018;
			this.aLong166 *= this.aLong166;
		} else if (this.anInt6026 == 2) {
			this.aLong166 = this.anInt6014 * 8 / this.anInt6018;
		}
		if (this.aBoolean427) {
			this.anInt6014 *= -1;
		}
	}
}

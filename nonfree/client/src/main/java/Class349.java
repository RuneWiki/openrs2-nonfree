import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class349 {

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	public int anInt9198;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
	public int anInt9200;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public int anInt9203;

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
	public int anInt9204;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	public int anInt9205;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	public int anInt9207;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	private int anInt9208;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
	public int anInt9209;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
	public int anInt9210;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
	public int anInt9211;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "J")
	public long aLong252;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Z")
	private boolean aBoolean710 = false;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	public int anInt9206 = 0;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public int anInt9202 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	public void method7636() {
		this.anInt9204 = Class363.anIntArray698[this.anInt9208 << 3];
		@Pc(17) long local17 = (long) this.anInt9209;
		@Pc(21) long local21 = (long) this.anInt9210;
		@Pc(25) long local25 = (long) this.anInt9200;
		this.anInt9211 = (int) Math.sqrt((double) (local25 * local25 + local21 * local21 + local17 * local17));
		if (this.anInt9203 == 0) {
			this.anInt9203 = 1;
		}
		if (this.anInt9207 == 0) {
			this.aLong252 = 2147483647L;
		} else if (this.anInt9207 == 1) {
			this.aLong252 = this.anInt9211 * 8 / this.anInt9203;
			this.aLong252 *= this.aLong252;
		} else if (this.anInt9207 == 2) {
			this.aLong252 = this.anInt9211 * 8 / this.anInt9203;
		}
		if (this.aBoolean710) {
			this.anInt9211 *= -1;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!es;IB)V")
	private void method7638(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9208 = arg0.method4294();
		} else if (arg1 == 2) {
			arg0.method4325();
		} else if (arg1 == 3) {
			this.anInt9209 = arg0.method4307();
			this.anInt9210 = arg0.method4307();
			this.anInt9200 = arg0.method4307();
		} else if (arg1 == 4) {
			this.anInt9207 = arg0.method4325();
			this.anInt9203 = arg0.method4307();
		} else if (arg1 == 6) {
			this.anInt9198 = arg0.method4325();
		} else if (arg1 == 8) {
			this.anInt9202 = 1;
		} else if (arg1 == 9) {
			this.anInt9206 = 1;
		} else if (arg1 == 10) {
			this.aBoolean710 = true;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!es;)V")
	public void method7640(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4325();
			if (local9 == 0) {
				return;
			}
			this.method7638(arg0, local9);
		}
	}
}

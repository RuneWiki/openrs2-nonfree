import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class42 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public int anInt1158;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public int anInt1160;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public int anInt1163;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "J")
	public long aLong35;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public int anInt1164;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	private int anInt1165;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public int anInt1166;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt1167;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public int anInt1169;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt1170;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public int anInt1172;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public int anInt1157 = 0;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public int anInt1161 = 0;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!ji;)V")
	private void method1158(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt1165 = arg1.method6003();
		} else if (arg0 == 2) {
			arg1.method6069();
		} else if (arg0 == 3) {
			this.anInt1160 = arg1.method6036();
			this.anInt1170 = arg1.method6036();
			this.anInt1172 = arg1.method6036();
		} else if (arg0 == 4) {
			this.anInt1167 = arg1.method6069();
			this.anInt1163 = arg1.method6036();
		} else if (arg0 == 6) {
			this.anInt1164 = arg1.method6069();
		} else if (arg0 == 8) {
			this.anInt1161 = 1;
		} else if (arg0 == 9) {
			this.anInt1157 = 1;
		} else if (arg0 == 10) {
			this.aBoolean65 = true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public void method1160() {
		this.anInt1158 = Class6_Sub2_Sub7.anIntArray177[this.anInt1165 << 3];
		this.anInt1169 = (int) Math.sqrt((double) (this.anInt1170 * this.anInt1170 + this.anInt1160 * this.anInt1160 + this.anInt1172 * this.anInt1172));
		if (this.anInt1163 == 0) {
			this.anInt1163 = 1;
		}
		if (this.anInt1167 == 0) {
			this.aLong35 = 2147483647L;
		} else if (this.anInt1167 == 1) {
			this.aLong35 = this.anInt1169 * 8 / this.anInt1163;
			this.aLong35 *= this.aLong35;
		} else if (this.anInt1167 == 2) {
			this.aLong35 = this.anInt1169 * 8 / this.anInt1163;
		}
		if (this.aBoolean65) {
			this.anInt1169 *= -1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method1161(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6069();
			if (local13 == 0) {
				return;
			}
			this.method1158(local13, arg0);
		}
	}
}

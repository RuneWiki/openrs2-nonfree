import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class282 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	public int anInt7976;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
	public int anInt7977;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
	public int anInt7979;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
	private int anInt7980;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	public int anInt7981;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
	public int anInt7982;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
	public int anInt7984;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
	public int anInt7985;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "J")
	public long aLong197;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
	public int anInt7986;

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
	public int anInt7987;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	public int anInt7975 = 0;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public int anInt7978 = 0;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "Z")
	private boolean aBoolean520 = false;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!jr;B)V")
	private void method6349(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt7980 = arg1.method6044();
		} else if (arg0 == 2) {
			arg1.method6019();
		} else if (arg0 == 3) {
			this.anInt7985 = arg1.method6015();
			this.anInt7982 = arg1.method6015();
			this.anInt7976 = arg1.method6015();
		} else if (arg0 == 4) {
			this.anInt7979 = arg1.method6019();
			this.anInt7977 = arg1.method6015();
		} else if (arg0 == 6) {
			this.anInt7984 = arg1.method6019();
		} else if (arg0 == 8) {
			this.anInt7975 = 1;
		} else if (arg0 == 9) {
			this.anInt7978 = 1;
		} else if (arg0 == 10) {
			this.aBoolean520 = true;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	public void method6351() {
		this.anInt7981 = Class22.anIntArray19[this.anInt7980 << 3];
		this.anInt7986 = (int) Math.sqrt((double) (this.anInt7976 * this.anInt7976 + this.anInt7985 * this.anInt7985 + this.anInt7982 * this.anInt7982));
		if (this.anInt7977 == 0) {
			this.anInt7977 = 1;
		}
		if (this.anInt7979 == 0) {
			this.aLong197 = 2147483647L;
		} else if (this.anInt7979 == 1) {
			this.aLong197 = this.anInt7986 * 8 / this.anInt7977;
			this.aLong197 *= this.aLong197;
		} else if (this.anInt7979 == 2) {
			this.aLong197 = this.anInt7986 * 8 / this.anInt7977;
		}
		if (this.aBoolean520) {
			this.anInt7986 *= -1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!jr;)V")
	public void method6353(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6019();
			if (local5 == 0) {
				return;
			}
			this.method6349(local5, arg0);
		}
	}
}

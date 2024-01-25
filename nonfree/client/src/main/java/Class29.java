import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class29 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public int anInt979;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public int anInt980;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public int anInt983;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	public int anInt987;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
	public int anInt989;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
	public int anInt991;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	public int anInt994;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
	public int anInt995;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "J")
	public long aLong40;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public int anInt985 = 0;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
	public int anInt992 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!fd;)V")
	public void method1075(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6538();
			if (local3 == 0) {
				return;
			}
			this.method1077(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!fd;)V")
	private void method1077(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt986 = arg1.method6535();
		} else if (arg0 == 2) {
			arg1.method6538();
		} else if (arg0 == 3) {
			this.anInt983 = arg1.method6497();
			this.anInt979 = arg1.method6497();
			this.anInt994 = arg1.method6497();
		} else if (arg0 == 4) {
			this.anInt991 = arg1.method6538();
			this.anInt988 = arg1.method6497();
		} else if (arg0 == 6) {
			this.anInt980 = arg1.method6538();
		} else if (arg0 == 8) {
			this.anInt992 = 1;
		} else if (arg0 == 9) {
			this.anInt985 = 1;
		} else if (arg0 == 10) {
			this.aBoolean77 = true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public void method1078() {
		this.anInt987 = Class2_Sub3.anIntArray621[this.anInt986 << 3];
		this.anInt989 = (int) Math.sqrt((double) (this.anInt994 * this.anInt994 + this.anInt983 * this.anInt983 + this.anInt979 * this.anInt979));
		if (this.anInt988 == 0) {
			this.anInt988 = 1;
		}
		if (this.anInt991 == 0) {
			this.aLong40 = 2147483647L;
		} else if (this.anInt991 == 1) {
			this.aLong40 = this.anInt989 * 8 / this.anInt988;
			this.aLong40 *= this.aLong40;
		} else if (this.anInt991 == 2) {
			this.aLong40 = this.anInt989 * 8 / this.anInt988;
		}
		if (this.aBoolean77) {
			this.anInt989 *= -1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class27 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public int anInt984;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public int anInt985;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt987;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	private int anInt986 = 2;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[I")
	private int[] anIntArray112 = new int[2];

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[I")
	private int[] anIntArray111 = new int[2];

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class27() {
		this.anIntArray112[0] = 0;
		this.anIntArray112[1] = 65535;
		this.anIntArray111[0] = 0;
		this.anIntArray111[1] = 65535;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
	public void method635() {
		this.anInt989 = 0;
		this.anInt990 = 0;
		this.anInt988 = 0;
		this.anInt991 = 0;
		this.anInt992 = 0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ne;)V")
	public void method636(@OriginalArg(0) Class4_Sub10 arg0) {
		this.anInt986 = arg0.method599();
		this.anIntArray112 = new int[this.anInt986];
		this.anIntArray111 = new int[this.anInt986];
		for (@Pc(16) int local16 = 0; local16 < this.anInt986; local16++) {
			this.anIntArray112[local16] = arg0.method604();
			this.anIntArray111[local16] = arg0.method604();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Lclient!ne;)V")
	public void method637(@OriginalArg(0) Class4_Sub10 arg0) {
		this.anInt985 = arg0.method599();
		this.anInt987 = arg0.method549();
		this.anInt984 = arg0.method549();
		this.method636(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
	public int method638(@OriginalArg(0) int arg0) {
		if (this.anInt992 >= this.anInt989) {
			this.anInt991 = this.anIntArray111[this.anInt990++] << 15;
			if (this.anInt990 >= this.anInt986) {
				this.anInt990 = this.anInt986 - 1;
			}
			this.anInt989 = (int) ((double) this.anIntArray112[this.anInt990] / 65536.0D * (double) arg0);
			if (this.anInt989 > this.anInt992) {
				this.anInt988 = ((this.anIntArray111[this.anInt990] << 15) - this.anInt991) / (this.anInt989 - this.anInt992);
			}
		}
		this.anInt991 += this.anInt988;
		this.anInt992++;
		return this.anInt991 - this.anInt988 >> 15;
	}
}

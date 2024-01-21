import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class48 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public int anInt1955;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public int anInt1956;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public int anInt1957;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	private int anInt1959;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
	private int anInt1960;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	private int anInt1961;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	private int anInt1962;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	private int anInt1963;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	private int anInt1958 = 2;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
	private int[] anIntArray207 = new int[2];

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
	private int[] anIntArray208 = new int[2];

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class48() {
		this.anIntArray207[0] = 0;
		this.anIntArray207[1] = 65535;
		this.anIntArray208[0] = 0;
		this.anIntArray208[1] = 65535;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kd;)V")
	public void method1185(@OriginalArg(0) Class3_Sub8 arg0) {
		this.anInt1958 = arg0.method1803();
		this.anIntArray207 = new int[this.anInt1958];
		this.anIntArray208 = new int[this.anInt1958];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1958; local16++) {
			this.anIntArray207[local16] = arg0.method1789();
			this.anIntArray208[local16] = arg0.method1789();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	public void method1186() {
		this.anInt1959 = 0;
		this.anInt1963 = 0;
		this.anInt1962 = 0;
		this.anInt1961 = 0;
		this.anInt1960 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)I")
	public int method1187(@OriginalArg(0) int arg0) {
		if (this.anInt1960 >= this.anInt1959) {
			this.anInt1961 = this.anIntArray208[this.anInt1963++] << 15;
			if (this.anInt1963 >= this.anInt1958) {
				this.anInt1963 = this.anInt1958 - 1;
			}
			this.anInt1959 = (int) ((double) this.anIntArray207[this.anInt1963] / 65536.0D * (double) arg0);
			if (this.anInt1959 > this.anInt1960) {
				this.anInt1962 = ((this.anIntArray208[this.anInt1963] << 15) - this.anInt1961) / (this.anInt1959 - this.anInt1960);
			}
		}
		this.anInt1961 += this.anInt1962;
		this.anInt1960++;
		return this.anInt1961 - this.anInt1962 >> 15;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!kd;)V")
	public void method1188(@OriginalArg(0) Class3_Sub8 arg0) {
		this.anInt1956 = arg0.method1803();
		this.anInt1955 = arg0.method1770();
		this.anInt1957 = arg0.method1770();
		this.method1185(arg0);
	}
}

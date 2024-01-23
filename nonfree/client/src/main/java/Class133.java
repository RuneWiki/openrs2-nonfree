import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class133 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
	public int anInt4004;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
	public int anInt4005;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	public int anInt4006;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	private int anInt4007;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	private int anInt4008;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	private int anInt4009;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	private int anInt4010;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	private int anInt4011;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
	private int anInt4003 = 2;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
	private int[] anIntArray357 = new int[2];

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "[I")
	private int[] anIntArray356 = new int[2];

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class133() {
		this.anIntArray357[0] = 0;
		this.anIntArray357[1] = 65535;
		this.anIntArray356[0] = 0;
		this.anIntArray356[1] = 65535;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!p;)V")
	public void method3263(@OriginalArg(0) Class4_Sub17 arg0) {
		this.anInt4006 = arg0.method1874();
		this.anInt4005 = arg0.method1889();
		this.anInt4004 = arg0.method1889();
		this.method3264(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Lclient!p;)V")
	public void method3264(@OriginalArg(0) Class4_Sub17 arg0) {
		this.anInt4003 = arg0.method1874();
		this.anIntArray357 = new int[this.anInt4003];
		this.anIntArray356 = new int[this.anInt4003];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4003; local16++) {
			this.anIntArray357[local16] = arg0.method1837();
			this.anIntArray356[local16] = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I")
	public int method3265(@OriginalArg(0) int arg0) {
		if (this.anInt4007 >= this.anInt4008) {
			this.anInt4011 = this.anIntArray356[this.anInt4010++] << 15;
			if (this.anInt4010 >= this.anInt4003) {
				this.anInt4010 = this.anInt4003 - 1;
			}
			this.anInt4008 = (int) ((double) this.anIntArray357[this.anInt4010] / 65536.0D * (double) arg0);
			if (this.anInt4008 > this.anInt4007) {
				this.anInt4009 = ((this.anIntArray356[this.anInt4010] << 15) - this.anInt4011) / (this.anInt4008 - this.anInt4007);
			}
		}
		this.anInt4011 += this.anInt4009;
		this.anInt4007++;
		return this.anInt4011 - this.anInt4009 >> 15;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
	public void method3266() {
		this.anInt4008 = 0;
		this.anInt4010 = 0;
		this.anInt4009 = 0;
		this.anInt4011 = 0;
		this.anInt4007 = 0;
	}
}

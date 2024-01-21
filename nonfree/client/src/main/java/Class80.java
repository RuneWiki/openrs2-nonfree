import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class80 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public int anInt3003;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public int anInt3004;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public int anInt3006;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	private int anInt3007;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	private int anInt3008;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
	private int anInt3009;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	private int anInt3010;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
	private int anInt3011;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	private int anInt3005 = 2;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
	private int[] anIntArray399 = new int[2];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
	private int[] anIntArray398 = new int[2];

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class80() {
		this.anIntArray399[0] = 0;
		this.anIntArray399[1] = 65535;
		this.anIntArray398[0] = 0;
		this.anIntArray398[1] = 65535;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	public int method1976(@OriginalArg(0) int arg0) {
		if (this.anInt3010 >= this.anInt3007) {
			this.anInt3009 = this.anIntArray398[this.anInt3011++] << 15;
			if (this.anInt3011 >= this.anInt3005) {
				this.anInt3011 = this.anInt3005 - 1;
			}
			this.anInt3007 = (int) ((double) this.anIntArray399[this.anInt3011] / 65536.0D * (double) arg0);
			if (this.anInt3007 > this.anInt3010) {
				this.anInt3008 = ((this.anIntArray398[this.anInt3011] << 15) - this.anInt3009) / (this.anInt3007 - this.anInt3010);
			}
		}
		this.anInt3009 += this.anInt3008;
		this.anInt3010++;
		return this.anInt3009 - this.anInt3008 >> 15;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
	public void method1977() {
		this.anInt3007 = 0;
		this.anInt3011 = 0;
		this.anInt3008 = 0;
		this.anInt3009 = 0;
		this.anInt3010 = 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!wd;)V")
	public void method1978(@OriginalArg(0) Class8_Sub20 arg0) {
		this.anInt3006 = arg0.method1872();
		this.anInt3003 = arg0.method1853();
		this.anInt3004 = arg0.method1853();
		this.method1979(arg0);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lclient!wd;)V")
	public void method1979(@OriginalArg(0) Class8_Sub20 arg0) {
		this.anInt3005 = arg0.method1872();
		this.anIntArray399 = new int[this.anInt3005];
		this.anIntArray398 = new int[this.anInt3005];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3005; local16++) {
			this.anIntArray399[local16] = arg0.method1839();
			this.anIntArray398[local16] = arg0.method1839();
		}
	}
}

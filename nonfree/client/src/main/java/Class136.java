import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class136 {

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	public int anInt3615;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public int anInt3616;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	public int anInt3617;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	private int anInt3618;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	private int anInt3619;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	private int anInt3620;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	private int anInt3621;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	private int anInt3622;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	private int anInt3614 = 2;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "[I")
	private int[] anIntArray201 = new int[2];

	@OriginalMember(owner = "client!go", name = "c", descriptor = "[I")
	private int[] anIntArray202 = new int[2];

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class136() {
		this.anIntArray201[0] = 0;
		this.anIntArray201[1] = 65535;
		this.anIntArray202[0] = 0;
		this.anIntArray202[1] = 65535;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!dt;)V")
	public void method3087(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt3615 = arg0.method7954();
		this.anInt3617 = arg0.method7895();
		this.anInt3616 = arg0.method7895();
		this.method3090(arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
	public void method3088() {
		this.anInt3619 = 0;
		this.anInt3618 = 0;
		this.anInt3620 = 0;
		this.anInt3622 = 0;
		this.anInt3621 = 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I")
	public int method3089(@OriginalArg(0) int arg0) {
		if (this.anInt3621 >= this.anInt3619) {
			this.anInt3622 = this.anIntArray202[this.anInt3618++] << 15;
			if (this.anInt3618 >= this.anInt3614) {
				this.anInt3618 = this.anInt3614 - 1;
			}
			this.anInt3619 = (int) ((double) this.anIntArray201[this.anInt3618] / 65536.0D * (double) arg0);
			if (this.anInt3619 > this.anInt3621) {
				this.anInt3620 = ((this.anIntArray202[this.anInt3618] << 15) - this.anInt3622) / (this.anInt3619 - this.anInt3621);
			}
		}
		this.anInt3622 += this.anInt3620;
		this.anInt3621++;
		return this.anInt3622 - this.anInt3620 >> 15;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Lclient!dt;)V")
	public void method3090(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt3614 = arg0.method7954();
		this.anIntArray201 = new int[this.anInt3614];
		this.anIntArray202 = new int[this.anInt3614];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3614; local16++) {
			this.anIntArray201[local16] = arg0.method7951();
			this.anIntArray202[local16] = arg0.method7951();
		}
	}
}

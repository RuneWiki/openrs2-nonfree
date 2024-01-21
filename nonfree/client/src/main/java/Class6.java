import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	private int anInt40;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	private int anInt41;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	private int anInt42;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	private int anInt43;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	private int anInt44;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	private int anInt38 = 2;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
	private int[] anIntArray22 = new int[2];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
	private int[] anIntArray21 = new int[2];

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class6() {
		this.anIntArray22[0] = 0;
		this.anIntArray22[1] = 65535;
		this.anIntArray21[0] = 0;
		this.anIntArray21[1] = 65535;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I")
	public int method37(@OriginalArg(0) int arg0) {
		if (this.anInt44 >= this.anInt40) {
			this.anInt43 = this.anIntArray21[this.anInt41++] << 15;
			if (this.anInt41 >= this.anInt38) {
				this.anInt41 = this.anInt38 - 1;
			}
			this.anInt40 = (int) ((double) this.anIntArray22[this.anInt41] / 65536.0D * (double) arg0);
			if (this.anInt40 > this.anInt44) {
				this.anInt42 = ((this.anIntArray21[this.anInt41] << 15) - this.anInt43) / (this.anInt40 - this.anInt44);
			}
		}
		this.anInt43 += this.anInt42;
		this.anInt44++;
		return this.anInt43 - this.anInt42 >> 15;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	public void method38() {
		this.anInt40 = 0;
		this.anInt41 = 0;
		this.anInt42 = 0;
		this.anInt43 = 0;
		this.anInt44 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!tc;)V")
	public void method39(@OriginalArg(0) Class10_Sub10 arg0) {
		this.anInt38 = arg0.method1111();
		this.anIntArray22 = new int[this.anInt38];
		this.anIntArray21 = new int[this.anInt38];
		for (@Pc(16) int local16 = 0; local16 < this.anInt38; local16++) {
			this.anIntArray22[local16] = arg0.method1160();
			this.anIntArray21[local16] = arg0.method1160();
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lclient!tc;)V")
	public void method40(@OriginalArg(0) Class10_Sub10 arg0) {
		this.anInt36 = arg0.method1111();
		this.anInt39 = arg0.method1112();
		this.anInt37 = arg0.method1112();
		this.method39(arg0);
	}
}

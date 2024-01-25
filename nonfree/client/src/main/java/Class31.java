import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class31 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
	private int anInt667 = 2;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
	private int[] anIntArray60 = new int[2];

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "[I")
	private int[] anIntArray61 = new int[2];

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class31() {
		this.anIntArray60[0] = 0;
		this.anIntArray60[1] = 65535;
		this.anIntArray61[0] = 0;
		this.anIntArray61[1] = 65535;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!si;)V")
	public void method576(@OriginalArg(0) Class2_Sub23 arg0) {
		this.anInt668 = arg0.method5495();
		this.anInt670 = arg0.method5508();
		this.anInt669 = arg0.method5508();
		this.method578(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I")
	public int method577(@OriginalArg(0) int arg0) {
		if (this.anInt671 >= this.anInt675) {
			this.anInt674 = this.anIntArray61[this.anInt672++] << 15;
			if (this.anInt672 >= this.anInt667) {
				this.anInt672 = this.anInt667 - 1;
			}
			this.anInt675 = (int) ((double) this.anIntArray60[this.anInt672] / 65536.0D * (double) arg0);
			if (this.anInt675 > this.anInt671) {
				this.anInt673 = ((this.anIntArray61[this.anInt672] << 15) - this.anInt674) / (this.anInt675 - this.anInt671);
			}
		}
		this.anInt674 += this.anInt673;
		this.anInt671++;
		return this.anInt674 - this.anInt673 >> 15;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Lclient!si;)V")
	public void method578(@OriginalArg(0) Class2_Sub23 arg0) {
		this.anInt667 = arg0.method5495();
		this.anIntArray60 = new int[this.anInt667];
		this.anIntArray61 = new int[this.anInt667];
		for (@Pc(16) int local16 = 0; local16 < this.anInt667; local16++) {
			this.anIntArray60[local16] = arg0.method5500();
			this.anIntArray61[local16] = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()V")
	public void method579() {
		this.anInt675 = 0;
		this.anInt672 = 0;
		this.anInt673 = 0;
		this.anInt674 = 0;
		this.anInt671 = 0;
	}
}

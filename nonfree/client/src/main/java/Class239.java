import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class239 {

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
	public int anInt6629;

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
	public int anInt6630;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	public int anInt6632;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
	private int anInt6633;

	@OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
	private int anInt6634;

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
	private int anInt6635;

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
	private int anInt6636;

	@OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
	private int anInt6637;

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
	private int anInt6631 = 2;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "[I")
	private int[] anIntArray432 = new int[2];

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "[I")
	private int[] anIntArray431 = new int[2];

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "()V")
	public Class239() {
		this.anIntArray432[0] = 0;
		this.anIntArray432[1] = 65535;
		this.anIntArray431[0] = 0;
		this.anIntArray431[1] = 65535;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)I")
	public int method5681(@OriginalArg(0) int arg0) {
		if (this.anInt6637 >= this.anInt6634) {
			this.anInt6636 = this.anIntArray431[this.anInt6635++] << 15;
			if (this.anInt6635 >= this.anInt6631) {
				this.anInt6635 = this.anInt6631 - 1;
			}
			this.anInt6634 = (int) ((double) this.anIntArray432[this.anInt6635] / 65536.0D * (double) arg0);
			if (this.anInt6634 > this.anInt6637) {
				this.anInt6633 = ((this.anIntArray431[this.anInt6635] << 15) - this.anInt6636) / (this.anInt6634 - this.anInt6637);
			}
		}
		this.anInt6636 += this.anInt6633;
		this.anInt6637++;
		return this.anInt6636 - this.anInt6633 >> 15;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!sl;)V")
	public void method5682(@OriginalArg(0) Class2_Sub17 arg0) {
		this.anInt6632 = arg0.method2859();
		this.anInt6630 = arg0.method2881();
		this.anInt6629 = arg0.method2881();
		this.method5684(arg0);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "()V")
	public void method5683() {
		this.anInt6634 = 0;
		this.anInt6635 = 0;
		this.anInt6633 = 0;
		this.anInt6636 = 0;
		this.anInt6637 = 0;
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(Lclient!sl;)V")
	public void method5684(@OriginalArg(0) Class2_Sub17 arg0) {
		this.anInt6631 = arg0.method2859();
		this.anIntArray432 = new int[this.anInt6631];
		this.anIntArray431 = new int[this.anInt6631];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6631; local16++) {
			this.anIntArray432[local16] = arg0.method2825();
			this.anIntArray431[local16] = arg0.method2825();
		}
	}
}

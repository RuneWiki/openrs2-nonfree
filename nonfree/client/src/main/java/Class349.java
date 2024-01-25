import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class349 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public int anInt9720;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	public int anInt9721;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
	public int anInt9723;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	private int anInt9724;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
	private int anInt9725;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
	private int anInt9726;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	private int anInt9727;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	private int anInt9728;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
	private int anInt9722 = 2;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "[I")
	private int[] anIntArray837 = new int[2];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "[I")
	private int[] anIntArray836 = new int[2];

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class349() {
		this.anIntArray837[0] = 0;
		this.anIntArray837[1] = 65535;
		this.anIntArray836[0] = 0;
		this.anIntArray836[1] = 65535;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!iaa;)V")
	public void method8093(@OriginalArg(0) Class6_Sub26 arg0) {
		this.anInt9723 = arg0.method4966();
		this.anInt9720 = arg0.method5000();
		this.anInt9721 = arg0.method5000();
		this.method8094(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(Lclient!iaa;)V")
	public void method8094(@OriginalArg(0) Class6_Sub26 arg0) {
		this.anInt9722 = arg0.method4966();
		this.anIntArray837 = new int[this.anInt9722];
		this.anIntArray836 = new int[this.anInt9722];
		for (@Pc(16) int local16 = 0; local16 < this.anInt9722; local16++) {
			this.anIntArray837[local16] = arg0.method4999();
			this.anIntArray836[local16] = arg0.method4999();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	public int method8095(@OriginalArg(0) int arg0) {
		if (this.anInt9724 >= this.anInt9726) {
			this.anInt9725 = this.anIntArray836[this.anInt9727++] << 15;
			if (this.anInt9727 >= this.anInt9722) {
				this.anInt9727 = this.anInt9722 - 1;
			}
			this.anInt9726 = (int) ((double) this.anIntArray837[this.anInt9727] / 65536.0D * (double) arg0);
			if (this.anInt9726 > this.anInt9724) {
				this.anInt9728 = ((this.anIntArray836[this.anInt9727] << 15) - this.anInt9725) / (this.anInt9726 - this.anInt9724);
			}
		}
		this.anInt9725 += this.anInt9728;
		this.anInt9724++;
		return this.anInt9725 - this.anInt9728 >> 15;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "()V")
	public void method8096() {
		this.anInt9726 = 0;
		this.anInt9727 = 0;
		this.anInt9728 = 0;
		this.anInt9725 = 0;
		this.anInt9724 = 0;
	}
}

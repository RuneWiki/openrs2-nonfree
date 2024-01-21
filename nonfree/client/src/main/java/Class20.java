import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class20 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public int anInt1014;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	public int anInt1015;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public int anInt1016;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	private int anInt1017 = 2;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
	private int[] anIntArray102 = new int[2];

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
	private int[] anIntArray103 = new int[2];

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class20() {
		this.anIntArray102[0] = 0;
		this.anIntArray102[1] = 65535;
		this.anIntArray103[0] = 0;
		this.anIntArray103[1] = 65535;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!m;)V")
	public void method609(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt1014 = arg0.method981();
		this.anInt1015 = arg0.method984();
		this.anInt1016 = arg0.method984();
		this.method612(arg0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I")
	public int method610(@OriginalArg(0) int arg0) {
		if (this.anInt1018 >= this.anInt1020) {
			this.anInt1019 = this.anIntArray103[this.anInt1021++] << 15;
			if (this.anInt1021 >= this.anInt1017) {
				this.anInt1021 = this.anInt1017 - 1;
			}
			this.anInt1020 = (int) ((double) this.anIntArray102[this.anInt1021] / 65536.0D * (double) arg0);
			if (this.anInt1020 > this.anInt1018) {
				this.anInt1022 = ((this.anIntArray103[this.anInt1021] << 15) - this.anInt1019) / (this.anInt1020 - this.anInt1018);
			}
		}
		this.anInt1019 += this.anInt1022;
		this.anInt1018++;
		return this.anInt1019 - this.anInt1022 >> 15;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	public void method611() {
		this.anInt1020 = 0;
		this.anInt1021 = 0;
		this.anInt1022 = 0;
		this.anInt1019 = 0;
		this.anInt1018 = 0;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!m;)V")
	public void method612(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt1017 = arg0.method981();
		this.anIntArray102 = new int[this.anInt1017];
		this.anIntArray103 = new int[this.anInt1017];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1017; local16++) {
			this.anIntArray102[local16] = arg0.method974();
			this.anIntArray103[local16] = arg0.method974();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class42 {

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private static int anInt807 = 587;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "I")
	private int anInt808;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "I")
	public int anInt811;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
	private int anInt812;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
	private int anInt814;

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(BLclient!kb;)V")
	public void method532(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			this.anInt811 = arg1.method372();
			this.anInt809 = arg1.method377();
			this.anInt810 = arg1.method377();
			this.anInt808 = arg1.method372();
			if (arg0 != 6) {
				anInt807 = 164;
			}
			this.anIntArray227 = new int[this.anInt808];
			this.anIntArray228 = new int[this.anInt808];
			for (@Pc(34) int local34 = 0; local34 < this.anInt808; local34++) {
				this.anIntArray227[local34] = arg1.method374();
				this.anIntArray228[local34] = arg1.method374();
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("65869, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I)V")
	public void method533() {
		try {
			this.anInt812 = 0;
			this.anInt813 = 0;
			this.anInt814 = 0;
			this.anInt815 = 0;
			this.anInt816 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("85500, " + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(II)I")
	public int method534(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt816 >= this.anInt812) {
				this.anInt815 = this.anIntArray228[this.anInt813++] << 15;
				if (this.anInt813 >= this.anInt808) {
					this.anInt813 = this.anInt808 - 1;
				}
				this.anInt812 = (int) ((double) this.anIntArray227[this.anInt813] / 65536.0D * (double) arg0);
				if (this.anInt812 > this.anInt816) {
					this.anInt814 = ((this.anIntArray228[this.anInt813] << 15) - this.anInt815) / (this.anInt812 - this.anInt816);
				}
			}
			this.anInt815 += this.anInt814;
			this.anInt816++;
			return this.anInt815 - this.anInt814 >> 15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("64906, " + arg0 + ", " + -536 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}

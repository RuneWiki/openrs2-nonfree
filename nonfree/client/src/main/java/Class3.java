import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt153 = -156;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!mb;)V")
	public void method48(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt157 = arg0.method503();
			this.anInt155 = arg0.method508();
			this.anInt156 = arg0.method508();
			this.method49(arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("24052, " + 44 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method49(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt154 = arg0.method503();
			this.anIntArray15 = new int[this.anInt154];
			this.anIntArray16 = new int[this.anInt154];
			for (@Pc(18) int local18 = 0; local18 < this.anInt154; local18++) {
				this.anIntArray15[local18] = arg0.method505();
				this.anIntArray16[local18] = arg0.method505();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("64446, " + -156 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method50(@OriginalArg(0) int arg0) {
		try {
			this.anInt158 = 0;
			this.anInt159 = 0;
			this.anInt160 = 0;
			@Pc(12) boolean local12 = false;
			this.anInt161 = 0;
			this.anInt162 = 0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("8480, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)I")
	public int method51(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt162 >= this.anInt158) {
				this.anInt161 = this.anIntArray16[this.anInt159++] << 15;
				if (this.anInt159 >= this.anInt154) {
					this.anInt159 = this.anInt154 - 1;
				}
				this.anInt158 = (int) ((double) this.anIntArray15[this.anInt159] / 65536.0D * (double) arg0);
				if (this.anInt158 > this.anInt162) {
					this.anInt160 = ((this.anIntArray16[this.anInt159] << 15) - this.anInt161) / (this.anInt158 - this.anInt162);
				}
			}
			this.anInt161 += this.anInt160;
			this.anInt162++;
			return this.anInt161 - this.anInt160 >> 15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("63462, " + arg0 + ", " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}
}

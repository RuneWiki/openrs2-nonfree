import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class38 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public int anInt1109;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	public int anInt1110;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public int anInt1111;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	private int anInt1113;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	private int anInt1114;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	private int anInt1115;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
	private int anInt1116;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
	private int anInt1117;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	private int anInt1112 = 2;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "[I")
	private int[] anIntArray104 = new int[2];

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "[I")
	private int[] anIntArray105 = new int[2];

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class38() {
		this.anIntArray104[0] = 0;
		this.anIntArray104[1] = 65535;
		this.anIntArray105[0] = 0;
		this.anIntArray105[1] = 65535;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
	public int method947(@OriginalArg(0) int arg0) {
		if (this.anInt1114 >= this.anInt1115) {
			this.anInt1117 = this.anIntArray105[this.anInt1116++] << 15;
			if (this.anInt1116 >= this.anInt1112) {
				this.anInt1116 = this.anInt1112 - 1;
			}
			this.anInt1115 = (int) ((double) this.anIntArray104[this.anInt1116] / 65536.0D * (double) arg0);
			if (this.anInt1115 > this.anInt1114) {
				this.anInt1113 = ((this.anIntArray105[this.anInt1116] << 15) - this.anInt1117) / (this.anInt1115 - this.anInt1114);
			}
		}
		this.anInt1117 += this.anInt1113;
		this.anInt1114++;
		return this.anInt1117 - this.anInt1113 >> 15;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ug;)V")
	public void method948(@OriginalArg(0) Class3_Sub26 arg0) {
		this.anInt1109 = arg0.method3915();
		this.anInt1111 = arg0.method3896();
		this.anInt1110 = arg0.method3896();
		this.method949(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lclient!ug;)V")
	public void method949(@OriginalArg(0) Class3_Sub26 arg0) {
		this.anInt1112 = arg0.method3915();
		this.anIntArray104 = new int[this.anInt1112];
		this.anIntArray105 = new int[this.anInt1112];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1112; local16++) {
			this.anIntArray104[local16] = arg0.method3948();
			this.anIntArray105[local16] = arg0.method3948();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
	public void method950() {
		this.anInt1115 = 0;
		this.anInt1116 = 0;
		this.anInt1113 = 0;
		this.anInt1117 = 0;
		this.anInt1114 = 0;
	}
}

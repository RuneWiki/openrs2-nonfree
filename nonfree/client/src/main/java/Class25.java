import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LMFHFXBO")
public final class Class25 {

	@OriginalMember(owner = "client!LMFHFXBO", name = "b", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!LMFHFXBO", name = "c", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!LMFHFXBO", name = "d", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!LMFHFXBO", name = "e", descriptor = "I")
	public int anInt433;

	@OriginalMember(owner = "client!LMFHFXBO", name = "f", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!LMFHFXBO", name = "g", descriptor = "I")
	public int anInt435;

	@OriginalMember(owner = "client!LMFHFXBO", name = "h", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!LMFHFXBO", name = "i", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!LMFHFXBO", name = "j", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!LMFHFXBO", name = "k", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!LMFHFXBO", name = "l", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "I")
	private int anInt431 = 473;

	@OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	public void method275(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			this.anInt435 = arg0.method307();
			this.anInt433 = arg0.method312();
			this.anInt434 = arg0.method312();
			this.method276(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("80287, " + arg0 + ", " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "(ILclient!MNKDCXXG;)V")
	public void method276(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		try {
			this.anInt432 = arg0.method307();
			this.anIntArray102 = new int[this.anInt432];
			this.anIntArray103 = new int[this.anInt432];
			for (@Pc(18) int local18 = 0; local18 < this.anInt432; local18++) {
				this.anIntArray102[local18] = arg0.method309();
				this.anIntArray103[local18] = arg0.method309();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("5702, " + 0 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "(B)V")
	public void method277(@OriginalArg(0) byte arg0) {
		try {
			this.anInt436 = 0;
			this.anInt437 = 0;
			@Pc(10) boolean local10 = false;
			this.anInt438 = 0;
			this.anInt439 = 0;
			this.anInt440 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("52775, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "(II)I")
	public int method278(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt440 >= this.anInt436) {
				this.anInt439 = this.anIntArray103[this.anInt437++] << 15;
				if (this.anInt437 >= this.anInt432) {
					this.anInt437 = this.anInt432 - 1;
				}
				this.anInt436 = (int) ((double) this.anIntArray102[this.anInt437] / 65536.0D * (double) arg0);
				if (this.anInt436 > this.anInt440) {
					this.anInt438 = ((this.anIntArray103[this.anInt437] << 15) - this.anInt439) / (this.anInt436 - this.anInt440);
				}
			}
			this.anInt439 += this.anInt438;
			this.anInt440++;
			return this.anInt439 - this.anInt438 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("20660, " + arg0 + ", " + 478 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}

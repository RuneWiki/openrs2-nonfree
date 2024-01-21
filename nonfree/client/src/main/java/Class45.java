import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YJSRODCC")
public final class Class45 {

	@OriginalMember(owner = "client!YJSRODCC", name = "b", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!YJSRODCC", name = "c", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!YJSRODCC", name = "d", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!YJSRODCC", name = "e", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!YJSRODCC", name = "f", descriptor = "I")
	public int anInt712;

	@OriginalMember(owner = "client!YJSRODCC", name = "g", descriptor = "I")
	public int anInt713;

	@OriginalMember(owner = "client!YJSRODCC", name = "h", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!YJSRODCC", name = "i", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!YJSRODCC", name = "j", descriptor = "I")
	private int anInt716;

	@OriginalMember(owner = "client!YJSRODCC", name = "k", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!YJSRODCC", name = "l", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!YJSRODCC", name = "a", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!YJSRODCC", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	public void method541(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt713 = arg0.method355();
			this.anInt711 = arg0.method360();
			this.anInt712 = arg0.method360();
			if (arg1 <= 0) {
				throw new NullPointerException();
			}
			this.method542(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("26945, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YJSRODCC", name = "b", descriptor = "(Lclient!PGNBHFUF;I)V")
	public void method542(@OriginalArg(0) Class4_Sub1_Sub4 arg0) {
		try {
			this.anInt710 = arg0.method355();
			this.anIntArray179 = new int[this.anInt710];
			this.anIntArray180 = new int[this.anInt710];
			for (@Pc(18) int local18 = 0; local18 < this.anInt710; local18++) {
				this.anIntArray179[local18] = arg0.method357();
				this.anIntArray180[local18] = arg0.method357();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("68488, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YJSRODCC", name = "a", descriptor = "(B)V")
	public void method543() {
		try {
			this.anInt714 = 0;
			this.anInt715 = 0;
			this.anInt716 = 0;
			this.anInt717 = 0;
			this.anInt718 = 0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("5744, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YJSRODCC", name = "a", descriptor = "(IZ)I")
	public int method544(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt718 >= this.anInt714) {
				this.anInt717 = this.anIntArray180[this.anInt715++] << 15;
				if (this.anInt715 >= this.anInt710) {
					this.anInt715 = this.anInt710 - 1;
				}
				this.anInt714 = (int) ((double) this.anIntArray179[this.anInt715] / 65536.0D * (double) arg0);
				if (this.anInt714 > this.anInt718) {
					this.anInt716 = ((this.anIntArray180[this.anInt715] << 15) - this.anInt717) / (this.anInt714 - this.anInt718);
				}
			}
			this.anInt717 += this.anInt716;
			this.anInt718++;
			return this.anInt717 - this.anInt716 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("36550, " + arg0 + ", " + true + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}

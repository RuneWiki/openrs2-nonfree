import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MWRZAKOJ")
public final class Class25 {

	@OriginalMember(owner = "client!MWRZAKOJ", name = "d", descriptor = "I")
	private int anInt453;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "e", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "f", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "g", descriptor = "I")
	public int anInt454;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "h", descriptor = "I")
	public int anInt455;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "i", descriptor = "I")
	public int anInt456;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "j", descriptor = "I")
	private int anInt457;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "k", descriptor = "I")
	private int anInt458;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "l", descriptor = "I")
	private int anInt459;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "m", descriptor = "I")
	private int anInt460;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "n", descriptor = "I")
	private int anInt461;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "a", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "b", descriptor = "I")
	private int anInt452 = 6;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "c", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!MWRZAKOJ", name = "a", descriptor = "(Lclient!IUVBENCV;B)V")
	public void method285(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			this.anInt456 = arg0.method152();
			this.anInt454 = arg0.method157();
			this.anInt455 = arg0.method157();
			this.method286(arg0, (byte) 1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("43237, " + arg0 + ", " + 1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWRZAKOJ", name = "b", descriptor = "(Lclient!IUVBENCV;B)V")
	public void method286(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt453 = arg0.method152();
			@Pc(10) boolean local10 = false;
			this.anIntArray129 = new int[this.anInt453];
			this.anIntArray130 = new int[this.anInt453];
			for (@Pc(31) int local31 = 0; local31 < this.anInt453; local31++) {
				this.anIntArray129[local31] = arg0.method154();
				this.anIntArray130[local31] = arg0.method154();
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("92466, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWRZAKOJ", name = "a", descriptor = "(Z)V")
	public void method287() {
		try {
			this.anInt457 = 0;
			this.anInt458 = 0;
			this.anInt459 = 0;
			this.anInt460 = 0;
			this.anInt461 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("95442, " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWRZAKOJ", name = "a", descriptor = "(II)I")
	public int method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt461 >= this.anInt457) {
				this.anInt460 = this.anIntArray130[this.anInt458++] << 15;
				if (this.anInt458 >= this.anInt453) {
					this.anInt458 = this.anInt453 - 1;
				}
				this.anInt457 = (int) ((double) this.anIntArray129[this.anInt458] / 65536.0D * (double) arg1);
				if (this.anInt457 > this.anInt461) {
					this.anInt459 = ((this.anIntArray130[this.anInt458] << 15) - this.anInt460) / (this.anInt457 - this.anInt461);
				}
			}
			this.anInt460 += this.anInt459;
			this.anInt461++;
			if (arg0 < this.anInt452 || arg0 > this.anInt452) {
				this.aBoolean107 = !this.aBoolean107;
			}
			return this.anInt460 - this.anInt459 >> 15;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("65428, " + arg0 + ", " + arg1 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class195 {

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public int anInt6005;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
	public int anInt6007;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt6010;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public int anInt6011;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt6012;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	private int anInt6014;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public int anInt6016;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public int anInt6020;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public int anInt6022;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	public int anInt6025;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "J")
	public long aLong181;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public int anInt6001 = 0;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "Z")
	private boolean aBoolean581 = false;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
	public int anInt6026 = 0;

	static {
		new Class34("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method5124() {
		this.anInt6020 = Class1_Sub3_Sub8.anIntArray156[this.anInt6014 << 3];
		this.anInt6022 = (int) Math.sqrt((double) (this.anInt6012 * this.anInt6012 + this.anInt6016 * this.anInt6016 + this.anInt6011 * this.anInt6011));
		if (this.anInt6005 == 0) {
			this.anInt6005 = 1;
		}
		if (this.anInt6025 == 0) {
			this.aLong181 = 2147483647L;
		} else if (this.anInt6025 == 1) {
			this.aLong181 = this.anInt6022 * 8 / this.anInt6005;
			this.aLong181 *= this.aLong181;
		} else if (this.anInt6025 == 2) {
			this.aLong181 = this.anInt6022 * 8 / this.anInt6005;
		}
		if (this.aBoolean581) {
			this.anInt6022 *= -1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!bg;)V")
	private void method5131(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6014 = arg1.method4556();
		} else if (arg0 == 2) {
			arg1.method4532();
		} else if (arg0 == 3) {
			this.anInt6016 = arg1.method4545();
			this.anInt6012 = arg1.method4545();
			this.anInt6011 = arg1.method4545();
		} else if (arg0 == 4) {
			this.anInt6025 = arg1.method4532();
			this.anInt6005 = arg1.method4545();
		} else if (arg0 == 6) {
			this.anInt6010 = arg1.method4532();
		} else if (arg0 == 8) {
			this.anInt6026 = 1;
		} else if (arg0 == 9) {
			this.anInt6001 = 1;
		} else if (arg0 == 10) {
			this.aBoolean581 = true;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!bg;)V")
	public void method5132(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4532();
			if (local15 == 0) {
				return;
			}
			this.method5131(local15, arg0);
		}
	}
}

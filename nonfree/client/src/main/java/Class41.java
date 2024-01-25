import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class41 {

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
	public int anInt1041;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "J")
	public long aLong37;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
	public int anInt1045;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
	public int anInt1047;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
	public int anInt1049;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
	public int anInt1051;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
	public int anInt1054;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
	public int anInt1055;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	public int anInt1042 = 0;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
	public int anInt1056 = 0;

	static {
		new Class32("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!kk;II)V")
	private void method867(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1043 = arg0.method5312();
		} else if (arg1 == 2) {
			arg0.method5350();
		} else if (arg1 == 3) {
			this.anInt1055 = arg0.method5346();
			this.anInt1048 = arg0.method5346();
			this.anInt1040 = arg0.method5346();
		} else if (arg1 == 4) {
			this.anInt1045 = arg0.method5350();
			this.anInt1054 = arg0.method5346();
		} else if (arg1 == 6) {
			this.anInt1047 = arg0.method5350();
		} else if (arg1 == 8) {
			this.anInt1056 = 1;
		} else if (arg1 == 9) {
			this.anInt1042 = 1;
		} else if (arg1 == 10) {
			this.aBoolean81 = true;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	public void method868() {
		this.anInt1041 = Class177.anIntArray844[this.anInt1043 << 3];
		this.anInt1051 = (int) Math.sqrt((double) (this.anInt1040 * this.anInt1040 + this.anInt1055 * this.anInt1055 + this.anInt1048 * this.anInt1048));
		if (this.anInt1054 == 0) {
			this.anInt1054 = 1;
		}
		if (this.anInt1045 == 0) {
			this.aLong37 = 2147483647L;
		} else if (this.anInt1045 == 1) {
			this.aLong37 = this.anInt1051 * 8 / this.anInt1054;
			this.aLong37 *= this.aLong37;
		} else if (this.anInt1045 == 2) {
			this.aLong37 = this.anInt1051 * 8 / this.anInt1054;
		}
		if (this.aBoolean81) {
			this.anInt1051 *= -1;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method871(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5350();
			if (local13 == 0) {
				return;
			}
			this.method867(arg0, local13);
		}
	}
}

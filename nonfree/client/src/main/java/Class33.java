import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class33 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public int anInt982;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public int anInt983;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public int anInt984;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "I")
	public int anInt991;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class33() {
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class33(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aByte7 = arg0.method2212();
		this.anInt984 = arg0.method2244();
		this.anInt988 = arg0.method2194();
		this.anInt991 = arg0.method2194();
		this.anInt982 = arg0.method2194();
		this.anInt983 = arg0.method2194();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)I")
	public int method816() {
		return this.aByte7 & 0x7;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)I")
	public int method818() {
		return (this.aByte7 & 0x8) == 8 ? 1 : 0;
	}
}

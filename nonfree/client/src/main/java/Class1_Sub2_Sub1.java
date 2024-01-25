import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	public int anInt218;

	static {
		new Class84("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong227 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public void method195() {
		super.aLong221 = Static101.method1557() + 500L | Long.MIN_VALUE & super.aLong221;
		Static248.aClass42_10.method1068(this);
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)I")
	public int method196() {
		return (int) super.aLong227;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)I")
	public int method198() {
		return (int) (super.aLong227 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)J")
	public long method199() {
		return super.aLong221 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)V")
	public void method202() {
		super.aLong221 |= Long.MIN_VALUE;
		if (this.method199() == 0L) {
			Static124.aClass42_2.method1068(this);
		}
	}
}

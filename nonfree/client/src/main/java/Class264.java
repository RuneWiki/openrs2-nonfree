import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class264 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	public int anInt8058;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "I")
	public int anInt8059;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "I")
	public int anInt8061;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "B")
	private byte aByte100;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "I")
	public int anInt8062;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	public int anInt8063;

	static {
		new Class202("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class264() {
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!ps;)V")
	public Class264(@OriginalArg(0) Class2_Sub29 arg0) {
		this.aByte100 = arg0.method5179();
		this.anInt8061 = arg0.method5229();
		this.anInt8059 = arg0.method5198();
		this.anInt8062 = arg0.method5198();
		this.anInt8063 = arg0.method5198();
		this.anInt8058 = arg0.method5198();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)I")
	public int method6747() {
		return this.aByte100 & 0x7;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I")
	public int method6748() {
		return (this.aByte100 & 0x8) == 8 ? 1 : 0;
	}
}

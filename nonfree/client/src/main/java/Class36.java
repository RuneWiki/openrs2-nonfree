import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class36 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	public int anInt955;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "B")
	private byte aByte21;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	public int anInt958;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	public int anInt962;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class36() {
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class36(@OriginalArg(0) Class2_Sub22 arg0) {
		this.aByte21 = arg0.method8548();
		this.anInt955 = arg0.method8546();
		this.anInt962 = arg0.method8542();
		this.anInt959 = arg0.method8542();
		this.anInt958 = arg0.method8542();
		this.anInt954 = arg0.method8542();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
	public int method739() {
		return this.aByte21 & 0x7;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
	public int method742() {
		return (this.aByte21 & 0x8) == 8 ? 1 : 0;
	}
}

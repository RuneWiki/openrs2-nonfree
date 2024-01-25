import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class120 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "I")
	public int anInt3032;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public int anInt3033;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	public int anInt3036;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	public int anInt3037;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "B")
	private byte aByte30;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "I")
	public int anInt3042;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class120() {
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!ti;)V")
	public Class120(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aByte30 = arg0.method4529();
		this.anInt3032 = arg0.method4498();
		this.anInt3036 = arg0.method4500();
		this.anInt3037 = arg0.method4500();
		this.anInt3042 = arg0.method4500();
		this.anInt3033 = arg0.method4500();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)I")
	public int method2639() {
		return this.aByte30 & 0x7;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)I")
	public int method2640() {
		return (this.aByte30 & 0x8) == 8 ? 1 : 0;
	}
}

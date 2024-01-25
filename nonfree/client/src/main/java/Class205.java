import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class205 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public int anInt6490;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "B")
	private byte aByte86;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	public int anInt6493;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public int anInt6494;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public int anInt6496;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public int anInt6497;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class205() {
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class205(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aByte86 = arg0.method6011();
		this.anInt6497 = arg0.method6004();
		this.anInt6490 = arg0.method6014();
		this.anInt6494 = arg0.method6014();
		this.anInt6496 = arg0.method6014();
		this.anInt6493 = arg0.method6014();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I")
	public int method5116() {
		return this.aByte86 & 0x7;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)I")
	public int method5117() {
		return (this.aByte86 & 0x8) == 8 ? 1 : 0;
	}
}

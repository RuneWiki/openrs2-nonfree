import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class255 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public int anInt7861;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public int anInt7862;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public int anInt7864;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public int anInt7866;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
	public int anInt7867;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class255() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class255(@OriginalArg(0) Class6_Sub40 arg0) {
		this.aByte90 = arg0.method8602();
		this.anInt7862 = arg0.method8571();
		this.anInt7866 = arg0.method8579();
		this.anInt7867 = arg0.method8579();
		this.anInt7861 = arg0.method8579();
		this.anInt7864 = arg0.method8579();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
	public int method6752() {
		return this.aByte90 & 0x7;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
	public int method6753() {
		return (this.aByte90 & 0x8) == 8 ? 1 : 0;
	}
}

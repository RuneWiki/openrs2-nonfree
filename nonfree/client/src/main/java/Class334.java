import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class334 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public int anInt9034;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "B")
	private byte aByte103;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public int anInt9035;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
	public int anInt9038;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public int anInt9039;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public int anInt9043;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class334() {
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!eh;)V")
	public Class334(@OriginalArg(0) Class4_Sub9 arg0) {
		this.aByte103 = arg0.method6021();
		this.anInt9034 = arg0.method5982();
		this.anInt9039 = arg0.method6026();
		this.anInt9038 = arg0.method6026();
		this.anInt9035 = arg0.method6026();
		this.anInt9043 = arg0.method6026();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)I")
	public int method7417() {
		return this.aByte103 & 0x7;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)I")
	public int method7419() {
		return (this.aByte103 & 0x8) == 8 ? 1 : 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class278 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
	public int anInt8050;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "B")
	private byte aByte95;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
	public int anInt8054;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	public int anInt8057;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	public int anInt8058;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
	public int anInt8059;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class278() {
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class278(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aByte95 = arg0.method3677();
		this.anInt8057 = arg0.method3698();
		this.anInt8059 = arg0.method3671();
		this.anInt8050 = arg0.method3671();
		this.anInt8058 = arg0.method3671();
		this.anInt8054 = arg0.method3671();
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)I")
	public int method6849() {
		return (this.aByte95 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)I")
	public int method6851() {
		return this.aByte95 & 0x7;
	}
}

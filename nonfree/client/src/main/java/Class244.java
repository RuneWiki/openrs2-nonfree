import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class244 {

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "B")
	private byte aByte91;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
	public int anInt6466;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
	public int anInt6467;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
	public int anInt6468;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
	public int anInt6469;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
	public int anInt6470;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class244() {
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class244(@OriginalArg(0) Class1_Sub19 arg0) {
		this.aByte91 = arg0.method2917();
		this.anInt6469 = arg0.method2896();
		this.anInt6468 = arg0.method2877();
		this.anInt6467 = arg0.method2877();
		this.anInt6470 = arg0.method2877();
		this.anInt6466 = arg0.method2877();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)I")
	public int method5195() {
		return this.aByte91 & 0x7;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)I")
	public int method5196() {
		return (this.aByte91 & 0x8) == 8 ? 1 : 0;
	}
}

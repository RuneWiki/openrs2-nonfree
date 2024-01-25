import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class232 {

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	public int anInt6384;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public int anInt6386;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public int anInt6387;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	public int anInt6388;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "B")
	private byte aByte97;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
	public int anInt6390;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class232() {
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class232(@OriginalArg(0) Class3_Sub28 arg0) {
		this.aByte97 = arg0.method5288();
		this.anInt6384 = arg0.method5272();
		this.anInt6388 = arg0.method5312();
		this.anInt6387 = arg0.method5312();
		this.anInt6390 = arg0.method5312();
		this.anInt6386 = arg0.method5312();
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)I")
	public int method5414() {
		return (this.aByte97 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)I")
	public int method5416() {
		return this.aByte97 & 0x7;
	}
}

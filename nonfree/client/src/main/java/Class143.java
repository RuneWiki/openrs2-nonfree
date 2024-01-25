import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class143 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
	public int anInt4075;

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
	public int anInt4077;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
	public int anInt4079;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
	public int anInt4082;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	public int anInt4083;

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "B")
	private byte aByte69;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class143() {
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!tl;)V")
	public Class143(@OriginalArg(0) Class4_Sub30 arg0) {
		this.aByte69 = arg0.method4865();
		this.anInt4082 = arg0.method4877();
		this.anInt4075 = arg0.method4872();
		this.anInt4077 = arg0.method4872();
		this.anInt4079 = arg0.method4872();
		this.anInt4083 = arg0.method4872();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
	public int method3099() {
		return this.aByte69 & 0x7;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)I")
	public int method3102() {
		return (this.aByte69 & 0x8) == 8 ? 1 : 0;
	}
}

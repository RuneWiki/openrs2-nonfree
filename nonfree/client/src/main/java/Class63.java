import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class63 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public int anInt2974;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	public int anInt2975;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	public int anInt2980;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "I")
	public int anInt2982;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	public int anInt2986;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class63() {
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!ff;)V")
	public Class63(@OriginalArg(0) Class3_Sub12 arg0) {
		this.aByte8 = arg0.method1342();
		this.anInt2982 = arg0.method1359();
		this.anInt2986 = arg0.method1373();
		this.anInt2974 = arg0.method1373();
		this.anInt2975 = arg0.method1373();
		this.anInt2980 = arg0.method1373();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
	public int method2171() {
		return this.aByte8 & 0x7;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)I")
	public int method2177() {
		return (this.aByte8 & 0x8) == 8 ? 1 : 0;
	}
}

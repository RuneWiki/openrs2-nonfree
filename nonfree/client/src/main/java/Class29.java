import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class29 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	public int anInt869;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	public int anInt872;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	public int anInt874;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "B")
	private byte aByte4;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class29(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aByte4 = arg0.method2114();
		this.anInt872 = arg0.method2095();
		this.anInt874 = arg0.method2133();
		this.anInt863 = arg0.method2133();
		this.anInt873 = arg0.method2133();
		this.anInt869 = arg0.method2133();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
	public int method631() {
		return this.aByte4 & 0x7;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)I")
	public int method632() {
		return (this.aByte4 & 0x8) == 8 ? 1 : 0;
	}
}

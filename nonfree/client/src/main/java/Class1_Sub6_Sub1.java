import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "Z")
	public boolean aBoolean57;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt643 = arg0;
		this.aByteArray6 = arg1;
		this.anInt645 = arg2;
		this.anInt644 = arg3;
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt643 = arg0;
		this.aByteArray6 = arg1;
		this.anInt645 = arg2;
		this.anInt644 = arg3;
		this.aBoolean57 = arg4;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!dl;)Lclient!bv;")
	public Class1_Sub6_Sub1 method537(@OriginalArg(0) Class57 arg0) {
		this.aByteArray6 = arg0.method1104(this.aByteArray6);
		this.anInt643 = arg0.method1107(this.anInt643);
		if (this.anInt645 == this.anInt644) {
			this.anInt645 = this.anInt644 = arg0.method1106(this.anInt645);
		} else {
			this.anInt645 = arg0.method1106(this.anInt645);
			this.anInt644 = arg0.method1106(this.anInt644);
			if (this.anInt645 == this.anInt644) {
				this.anInt645--;
			}
		}
		return this;
	}
}

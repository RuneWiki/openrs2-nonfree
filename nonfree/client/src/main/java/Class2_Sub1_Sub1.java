import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aaa", name = "o", descriptor = "Z")
	public boolean aBoolean1;

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
	public int anInt15;

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
	public int anInt14;

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "I")
	public int anInt16;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt15 = arg0;
		this.aByteArray1 = arg1;
		this.anInt14 = arg2;
		this.anInt16 = arg3;
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt15 = arg0;
		this.aByteArray1 = arg1;
		this.anInt14 = arg2;
		this.anInt16 = arg3;
		this.aBoolean1 = arg4;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!md;)Lclient!aaa;")
	public Class2_Sub1_Sub1 method32(@OriginalArg(0) Class217 arg0) {
		this.aByteArray1 = arg0.method4587(this.aByteArray1);
		this.anInt15 = arg0.method4589(this.anInt15);
		if (this.anInt14 == this.anInt16) {
			this.anInt14 = this.anInt16 = arg0.method4591(this.anInt14);
		} else {
			this.anInt14 = arg0.method4591(this.anInt14);
			this.anInt16 = arg0.method4591(this.anInt16);
			if (this.anInt14 == this.anInt16) {
				this.anInt14--;
			}
		}
		return this;
	}
}

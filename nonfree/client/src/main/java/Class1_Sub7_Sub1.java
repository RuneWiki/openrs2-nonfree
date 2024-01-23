import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Z")
	public boolean aBoolean65;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt808 = arg0;
		this.aByteArray5 = arg1;
		this.anInt810 = arg2;
		this.anInt809 = arg3;
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt808 = arg0;
		this.aByteArray5 = arg1;
		this.anInt810 = arg2;
		this.anInt809 = arg3;
		this.aBoolean65 = arg4;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!sl;)Lclient!d;")
	public Class1_Sub7_Sub1 method713(@OriginalArg(0) Class163 arg0) {
		this.aByteArray5 = arg0.method3911(this.aByteArray5);
		this.anInt808 = arg0.method3914(this.anInt808);
		if (this.anInt810 == this.anInt809) {
			this.anInt810 = this.anInt809 = arg0.method3913(this.anInt810);
		} else {
			this.anInt810 = arg0.method3913(this.anInt810);
			this.anInt809 = arg0.method3913(this.anInt809);
			if (this.anInt810 == this.anInt809) {
				this.anInt810--;
			}
		}
		return this;
	}
}

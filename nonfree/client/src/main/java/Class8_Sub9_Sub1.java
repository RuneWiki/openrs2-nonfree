import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class8_Sub9_Sub1 extends Class8_Sub9 {

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
	public int anInt1947;

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
	public int anInt1948;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
	public int anInt1946;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(I[BII)V")
	public Class8_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1947 = arg0;
		this.aByteArray8 = arg1;
		this.anInt1948 = arg2;
		this.anInt1946 = arg3;
	}

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class8_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1947 = arg0;
		this.aByteArray8 = arg1;
		this.anInt1948 = arg2;
		this.anInt1946 = arg3;
		this.aBoolean132 = arg4;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!gfa;)Lclient!cba;")
	public Class8_Sub9_Sub1 method1674(@OriginalArg(0) Class116 arg0) {
		this.aByteArray8 = arg0.method3381(this.aByteArray8);
		this.anInt1947 = arg0.method3384(this.anInt1947);
		if (this.anInt1948 == this.anInt1946) {
			this.anInt1948 = this.anInt1946 = arg0.method3383(this.anInt1948);
		} else {
			this.anInt1948 = arg0.method3383(this.anInt1948);
			this.anInt1946 = arg0.method3383(this.anInt1946);
			if (this.anInt1948 == this.anInt1946) {
				this.anInt1948--;
			}
		}
		return this;
	}
}

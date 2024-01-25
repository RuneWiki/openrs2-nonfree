import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class1_Sub39_Sub1 extends Class1_Sub39 {

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Z")
	public boolean aBoolean453;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public int anInt6076;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
	public int anInt6077;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public int anInt6075;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6076 = arg0;
		this.aByteArray89 = arg1;
		this.anInt6077 = arg2;
		this.anInt6075 = arg3;
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6076 = arg0;
		this.aByteArray89 = arg1;
		this.anInt6077 = arg2;
		this.anInt6075 = arg3;
		this.aBoolean453 = arg4;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!gj;)Lclient!ua;")
	public Class1_Sub39_Sub1 method5474(@OriginalArg(0) Class70 arg0) {
		this.aByteArray89 = arg0.method2227(this.aByteArray89);
		this.anInt6076 = arg0.method2224(this.anInt6076);
		if (this.anInt6077 == this.anInt6075) {
			this.anInt6077 = this.anInt6075 = arg0.method2225(this.anInt6077);
		} else {
			this.anInt6077 = arg0.method2225(this.anInt6077);
			this.anInt6075 = arg0.method2225(this.anInt6075);
			if (this.anInt6077 == this.anInt6075) {
				this.anInt6077--;
			}
		}
		return this;
	}
}

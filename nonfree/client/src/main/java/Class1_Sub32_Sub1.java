import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class1_Sub32_Sub1 extends Class1_Sub32 {

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "Z")
	public boolean aBoolean329;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
	public int anInt4942;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
	public int anInt4941;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
	public int anInt4940;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub32_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4942 = arg0;
		this.aByteArray62 = arg1;
		this.anInt4941 = arg2;
		this.anInt4940 = arg3;
	}

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub32_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4942 = arg0;
		this.aByteArray62 = arg1;
		this.anInt4941 = arg2;
		this.anInt4940 = arg3;
		this.aBoolean329 = arg4;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!tp;)Lclient!nv;")
	public Class1_Sub32_Sub1 method4014(@OriginalArg(0) Class229 arg0) {
		this.aByteArray62 = arg0.method5354(this.aByteArray62);
		this.anInt4942 = arg0.method5355(this.anInt4942);
		if (this.anInt4941 == this.anInt4940) {
			this.anInt4941 = this.anInt4940 = arg0.method5353(this.anInt4941);
		} else {
			this.anInt4941 = arg0.method5353(this.anInt4941);
			this.anInt4940 = arg0.method5353(this.anInt4940);
			if (this.anInt4941 == this.anInt4940) {
				this.anInt4941--;
			}
		}
		return this;
	}
}

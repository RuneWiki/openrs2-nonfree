import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	public int anInt856;

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
	public int anInt857;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt856 = arg0;
		this.aByteArray7 = arg1;
		this.anInt857 = arg2;
		this.anInt858 = arg3;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ce;)Lclient!fd;")
	public Class3_Sub5_Sub1 method554(@OriginalArg(0) Class12 arg0) {
		this.aByteArray7 = arg0.method325(this.aByteArray7);
		this.anInt856 = arg0.method320(this.anInt856);
		if (this.anInt857 == this.anInt858) {
			this.anInt857 = this.anInt858 = arg0.method322(this.anInt857);
		} else {
			this.anInt857 = arg0.method322(this.anInt857);
			this.anInt858 = arg0.method322(this.anInt858);
			if (this.anInt857 == this.anInt858) {
				this.anInt857--;
			}
		}
		return this;
	}
}

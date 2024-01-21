import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
	public boolean aBoolean107;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	public int anInt2121;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	public int anInt2122;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	public int anInt2120;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2121 = arg0;
		this.aByteArray23 = arg1;
		this.anInt2122 = arg2;
		this.anInt2120 = arg3;
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2121 = arg0;
		this.aByteArray23 = arg1;
		this.anInt2122 = arg2;
		this.anInt2120 = arg3;
		this.aBoolean107 = arg4;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!be;)Lclient!nb;")
	public Class3_Sub5_Sub1 method1371(@OriginalArg(0) Class9 arg0) {
		this.aByteArray23 = arg0.method175(this.aByteArray23);
		this.anInt2121 = arg0.method176(this.anInt2121);
		if (this.anInt2122 == this.anInt2120) {
			this.anInt2122 = this.anInt2120 = arg0.method178(this.anInt2122);
		} else {
			this.anInt2122 = arg0.method178(this.anInt2122);
			this.anInt2120 = arg0.method178(this.anInt2120);
			if (this.anInt2122 == this.anInt2120) {
				this.anInt2122--;
			}
		}
		return this;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class3_Sub12_Sub1 extends Class3_Sub12 {

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Z")
	public boolean aBoolean564;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public int anInt6625;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public int anInt6623;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	public int anInt6624;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6625 = arg0;
		this.aByteArray70 = arg1;
		this.anInt6623 = arg2;
		this.anInt6624 = arg3;
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6625 = arg0;
		this.aByteArray70 = arg1;
		this.anInt6623 = arg2;
		this.anInt6624 = arg3;
		this.aBoolean564 = arg4;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!wu;)Lclient!ma;")
	public Class3_Sub12_Sub1 method5544(@OriginalArg(0) Class381 arg0) {
		this.aByteArray70 = arg0.method8653(this.aByteArray70);
		this.anInt6625 = arg0.method8657(this.anInt6625);
		if (this.anInt6623 == this.anInt6624) {
			this.anInt6623 = this.anInt6624 = arg0.method8655(this.anInt6623);
		} else {
			this.anInt6623 = arg0.method8655(this.anInt6623);
			this.anInt6624 = arg0.method8655(this.anInt6624);
			if (this.anInt6623 == this.anInt6624) {
				this.anInt6623--;
			}
		}
		return this;
	}
}

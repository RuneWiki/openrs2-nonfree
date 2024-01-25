import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class1_Sub15_Sub1 extends Class1_Sub15 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Z")
	public boolean aBoolean619;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public int anInt6345;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public int anInt6346;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6345 = arg0;
		this.aByteArray92 = arg1;
		this.anInt6346 = arg2;
		this.anInt6347 = arg3;
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6345 = arg0;
		this.aByteArray92 = arg1;
		this.anInt6346 = arg2;
		this.anInt6347 = arg3;
		this.aBoolean619 = arg4;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ik;)Lclient!ve;")
	public Class1_Sub15_Sub1 method5363(@OriginalArg(0) Class95 arg0) {
		this.aByteArray92 = arg0.method2615(this.aByteArray92);
		this.anInt6345 = arg0.method2623(this.anInt6345);
		if (this.anInt6346 == this.anInt6347) {
			this.anInt6346 = this.anInt6347 = arg0.method2624(this.anInt6346);
		} else {
			this.anInt6346 = arg0.method2624(this.anInt6346);
			this.anInt6347 = arg0.method2624(this.anInt6347);
			if (this.anInt6346 == this.anInt6347) {
				this.anInt6346--;
			}
		}
		return this;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
	public int anInt4357;

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
	public int anInt4359;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
	public int anInt4358;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4357 = arg0;
		this.aByteArray61 = arg1;
		this.anInt4359 = arg2;
		this.anInt4358 = arg3;
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4357 = arg0;
		this.aByteArray61 = arg1;
		this.anInt4359 = arg2;
		this.anInt4358 = arg3;
		this.aBoolean271 = arg4;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qe;)Lclient!tf;")
	public Class2_Sub9_Sub1 method3006(@OriginalArg(0) Class82 arg0) {
		this.aByteArray61 = arg0.method2590(this.aByteArray61);
		this.anInt4357 = arg0.method2592(this.anInt4357);
		if (this.anInt4359 == this.anInt4358) {
			this.anInt4359 = this.anInt4358 = arg0.method2591(this.anInt4359);
		} else {
			this.anInt4359 = arg0.method2591(this.anInt4359);
			this.anInt4358 = arg0.method2591(this.anInt4358);
			if (this.anInt4359 == this.anInt4358) {
				this.anInt4359--;
			}
		}
		return this;
	}
}

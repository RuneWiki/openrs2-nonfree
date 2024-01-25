import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class1_Sub28_Sub1 extends Class1_Sub28 {

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "Z")
	public boolean aBoolean341;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
	public int anInt4314;

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
	public int anInt4315;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
	public int anInt4313;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub28_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4314 = arg0;
		this.aByteArray48 = arg1;
		this.anInt4315 = arg2;
		this.anInt4313 = arg3;
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub28_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4314 = arg0;
		this.aByteArray48 = arg1;
		this.anInt4315 = arg2;
		this.anInt4313 = arg3;
		this.aBoolean341 = arg4;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!tm;)Lclient!nq;")
	public Class1_Sub28_Sub1 method3469(@OriginalArg(0) Class233 arg0) {
		this.aByteArray48 = arg0.method4938(this.aByteArray48);
		this.anInt4314 = arg0.method4939(this.anInt4314);
		if (this.anInt4315 == this.anInt4313) {
			this.anInt4315 = this.anInt4313 = arg0.method4937(this.anInt4315);
		} else {
			this.anInt4315 = arg0.method4937(this.anInt4315);
			this.anInt4313 = arg0.method4937(this.anInt4313);
			if (this.anInt4315 == this.anInt4313) {
				this.anInt4315--;
			}
		}
		return this;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class3_Sub29_Sub1 extends Class3_Sub29 {

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Z")
	public boolean aBoolean324;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public int anInt4131;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public int anInt4133;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public int anInt4132;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4131 = arg0;
		this.aByteArray54 = arg1;
		this.anInt4133 = arg2;
		this.anInt4132 = arg3;
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4131 = arg0;
		this.aByteArray54 = arg1;
		this.anInt4133 = arg2;
		this.anInt4132 = arg3;
		this.aBoolean324 = arg4;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!cl;)Lclient!nd;")
	public Class3_Sub29_Sub1 method3841(@OriginalArg(0) Class41 arg0) {
		this.aByteArray54 = arg0.method865(this.aByteArray54);
		this.anInt4131 = arg0.method861(this.anInt4131);
		if (this.anInt4133 == this.anInt4132) {
			this.anInt4133 = this.anInt4132 = arg0.method866(this.anInt4133);
		} else {
			this.anInt4133 = arg0.method866(this.anInt4133);
			this.anInt4132 = arg0.method866(this.anInt4132);
			if (this.anInt4133 == this.anInt4132) {
				this.anInt4133--;
			}
		}
		return this;
	}
}

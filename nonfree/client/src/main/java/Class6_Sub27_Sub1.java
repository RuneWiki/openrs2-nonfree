import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class6_Sub27_Sub1 extends Class6_Sub27 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Z")
	public boolean aBoolean413;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public int anInt5146;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	public int anInt5148;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	public int anInt5147;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5146 = arg0;
		this.aByteArray33 = arg1;
		this.anInt5148 = arg2;
		this.anInt5147 = arg3;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5146 = arg0;
		this.aByteArray33 = arg1;
		this.anInt5148 = arg2;
		this.anInt5147 = arg3;
		this.aBoolean413 = arg4;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!tg;)Lclient!ib;")
	public Class6_Sub27_Sub1 method4220(@OriginalArg(0) Class321 arg0) {
		this.aByteArray33 = arg0.method7678(this.aByteArray33);
		this.anInt5146 = arg0.method7679(this.anInt5146);
		if (this.anInt5148 == this.anInt5147) {
			this.anInt5148 = this.anInt5147 = arg0.method7674(this.anInt5148);
		} else {
			this.anInt5148 = arg0.method7674(this.anInt5148);
			this.anInt5147 = arg0.method7674(this.anInt5147);
			if (this.anInt5148 == this.anInt5147) {
				this.anInt5148--;
			}
		}
		return this;
	}
}

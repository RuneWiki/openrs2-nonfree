import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class12_Sub29_Sub1 extends Class12_Sub29 {

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Z")
	public boolean aBoolean400;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	public int anInt5186;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
	public int anInt5187;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public int anInt5185;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BII)V")
	public Class12_Sub29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5186 = arg0;
		this.aByteArray59 = arg1;
		this.anInt5187 = arg2;
		this.anInt5185 = arg3;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class12_Sub29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5186 = arg0;
		this.aByteArray59 = arg1;
		this.anInt5187 = arg2;
		this.anInt5185 = arg3;
		this.aBoolean400 = arg4;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ii;)Lclient!ke;")
	public Class12_Sub29_Sub1 method4348(@OriginalArg(0) Class144 arg0) {
		this.aByteArray59 = arg0.method3830(this.aByteArray59);
		this.anInt5186 = arg0.method3834(this.anInt5186);
		if (this.anInt5187 == this.anInt5185) {
			this.anInt5187 = this.anInt5185 = arg0.method3832(this.anInt5187);
		} else {
			this.anInt5187 = arg0.method3832(this.anInt5187);
			this.anInt5185 = arg0.method3832(this.anInt5185);
			if (this.anInt5187 == this.anInt5185) {
				this.anInt5187--;
			}
		}
		return this;
	}
}

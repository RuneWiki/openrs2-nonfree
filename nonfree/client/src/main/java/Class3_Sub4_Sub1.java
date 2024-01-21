import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!r", name = "L", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!r", name = "J", descriptor = "I")
	public int anInt2499;

	@OriginalMember(owner = "client!r", name = "K", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2498 = arg0;
		this.aByteArray32 = arg1;
		this.anInt2499 = arg2;
		this.anInt2500 = arg3;
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2498 = arg0;
		this.aByteArray32 = arg1;
		this.anInt2499 = arg2;
		this.anInt2500 = arg3;
		this.aBoolean117 = arg4;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!cf;)Lclient!r;")
	public Class3_Sub4_Sub1 method1678(@OriginalArg(0) Class13 arg0) {
		this.aByteArray32 = arg0.method351(this.aByteArray32);
		this.anInt2498 = arg0.method356(this.anInt2498);
		if (this.anInt2499 == this.anInt2500) {
			this.anInt2499 = this.anInt2500 = arg0.method359(this.anInt2499);
		} else {
			this.anInt2499 = arg0.method359(this.anInt2499);
			this.anInt2500 = arg0.method359(this.anInt2500);
			if (this.anInt2499 == this.anInt2500) {
				this.anInt2499--;
			}
		}
		return this;
	}
}

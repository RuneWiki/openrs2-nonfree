import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class3_Sub19_Sub1 extends Class3_Sub19 {

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
	public boolean aBoolean110;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	public int anInt2750;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	public int anInt2751;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2750 = arg0;
		this.aByteArray37 = arg1;
		this.anInt2751 = arg2;
		this.anInt2749 = arg3;
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2750 = arg0;
		this.aByteArray37 = arg1;
		this.anInt2751 = arg2;
		this.anInt2749 = arg3;
		this.aBoolean110 = arg4;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ce;)Lclient!oc;")
	public Class3_Sub19_Sub1 method1922(@OriginalArg(0) Class15 arg0) {
		this.aByteArray37 = arg0.method367(this.aByteArray37);
		this.anInt2750 = arg0.method364(this.anInt2750);
		if (this.anInt2751 == this.anInt2749) {
			this.anInt2751 = this.anInt2749 = arg0.method365(this.anInt2751);
		} else {
			this.anInt2751 = arg0.method365(this.anInt2751);
			this.anInt2749 = arg0.method365(this.anInt2749);
			if (this.anInt2751 == this.anInt2749) {
				this.anInt2751--;
			}
		}
		return this;
	}
}

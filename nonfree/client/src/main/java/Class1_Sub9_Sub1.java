import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!te", name = "D", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public int anInt2570;

	@OriginalMember(owner = "client!te", name = "E", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "I")
	public int anInt2568;

	@OriginalMember(owner = "client!te", name = "G", descriptor = "I")
	public int anInt2569;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2570 = arg0;
		this.aByteArray15 = arg1;
		this.anInt2568 = arg2;
		this.anInt2569 = arg3;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ia;)Lclient!te;")
	public Class1_Sub9_Sub1 method1670(@OriginalArg(0) Class26 arg0) {
		this.aByteArray15 = arg0.method865(this.aByteArray15);
		this.anInt2570 = arg0.method872(this.anInt2570);
		if (this.anInt2568 == this.anInt2569) {
			this.anInt2568 = this.anInt2569 = arg0.method870(this.anInt2568);
		} else {
			this.anInt2568 = arg0.method870(this.anInt2568);
			this.anInt2569 = arg0.method870(this.anInt2569);
			if (this.anInt2568 == this.anInt2569) {
				this.anInt2568--;
			}
		}
		return this;
	}
}

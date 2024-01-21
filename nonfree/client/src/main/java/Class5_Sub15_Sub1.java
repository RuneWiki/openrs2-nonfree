import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class5_Sub15_Sub1 extends Class5_Sub15 {

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
	public boolean aBoolean126;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	public int anInt2842;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "I")
	public int anInt2843;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2841 = arg0;
		this.aByteArray29 = arg1;
		this.anInt2842 = arg2;
		this.anInt2843 = arg3;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!pa;)Lclient!w;")
	public Class5_Sub15_Sub1 method1907(@OriginalArg(0) Class51 arg0) {
		this.aByteArray29 = arg0.method1346(this.aByteArray29);
		this.anInt2841 = arg0.method1352(this.anInt2841);
		if (this.anInt2842 == this.anInt2843) {
			this.anInt2842 = this.anInt2843 = arg0.method1348(this.anInt2842);
		} else {
			this.anInt2842 = arg0.method1348(this.anInt2842);
			this.anInt2843 = arg0.method1348(this.anInt2843);
			if (this.anInt2842 == this.anInt2843) {
				this.anInt2842--;
			}
		}
		return this;
	}
}

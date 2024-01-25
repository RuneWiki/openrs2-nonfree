import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class2_Sub14_Sub1 extends Class2_Sub14 {

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "Z")
	public boolean aBoolean184;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
	public int anInt2196;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
	public int anInt2197;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
	public int anInt2198;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2196 = arg0;
		this.aByteArray17 = arg1;
		this.anInt2197 = arg2;
		this.anInt2198 = arg3;
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2196 = arg0;
		this.aByteArray17 = arg1;
		this.anInt2197 = arg2;
		this.anInt2198 = arg3;
		this.aBoolean184 = arg4;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!pp;)Lclient!ct;")
	public Class2_Sub14_Sub1 method1819(@OriginalArg(0) Class276 arg0) {
		this.aByteArray17 = arg0.method6369(this.aByteArray17);
		this.anInt2196 = arg0.method6372(this.anInt2196);
		if (this.anInt2197 == this.anInt2198) {
			this.anInt2197 = this.anInt2198 = arg0.method6368(this.anInt2197);
		} else {
			this.anInt2197 = arg0.method6368(this.anInt2197);
			this.anInt2198 = arg0.method6368(this.anInt2198);
			if (this.anInt2197 == this.anInt2198) {
				this.anInt2197--;
			}
		}
		return this;
	}
}

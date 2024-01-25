import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class4_Sub35_Sub1 extends Class4_Sub35 {

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "Z")
	public boolean aBoolean468;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
	public int anInt6961;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
	public int anInt6960;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
	public int anInt6962;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6961 = arg0;
		this.aByteArray92 = arg1;
		this.anInt6960 = arg2;
		this.anInt6962 = arg3;
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6961 = arg0;
		this.aByteArray92 = arg1;
		this.anInt6960 = arg2;
		this.anInt6962 = arg3;
		this.aBoolean468 = arg4;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!bf;)Lclient!uq;")
	public Class4_Sub35_Sub1 method5373(@OriginalArg(0) Class21 arg0) {
		this.aByteArray92 = arg0.method536(this.aByteArray92);
		this.anInt6961 = arg0.method537(this.anInt6961);
		if (this.anInt6960 == this.anInt6962) {
			this.anInt6960 = this.anInt6962 = arg0.method538(this.anInt6960);
		} else {
			this.anInt6960 = arg0.method538(this.anInt6960);
			this.anInt6962 = arg0.method538(this.anInt6962);
			if (this.anInt6960 == this.anInt6962) {
				this.anInt6960--;
			}
		}
		return this;
	}
}

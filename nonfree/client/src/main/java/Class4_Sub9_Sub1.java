import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class4_Sub9_Sub1 extends Class4_Sub9 {

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "Z")
	public boolean aBoolean99;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
	public int anInt1419;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
	public int anInt1420;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
	public int anInt1418;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1419 = arg0;
		this.aByteArray18 = arg1;
		this.anInt1420 = arg2;
		this.anInt1418 = arg3;
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1419 = arg0;
		this.aByteArray18 = arg1;
		this.anInt1420 = arg2;
		this.anInt1418 = arg3;
		this.aBoolean99 = arg4;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!uj;)Lclient!cv;")
	public Class4_Sub9_Sub1 method1302(@OriginalArg(0) Class254 arg0) {
		this.aByteArray18 = arg0.method5816(this.aByteArray18);
		this.anInt1419 = arg0.method5818(this.anInt1419);
		if (this.anInt1420 == this.anInt1418) {
			this.anInt1420 = this.anInt1418 = arg0.method5817(this.anInt1420);
		} else {
			this.anInt1420 = arg0.method5817(this.anInt1420);
			this.anInt1418 = arg0.method5817(this.anInt1418);
			if (this.anInt1420 == this.anInt1418) {
				this.anInt1420--;
			}
		}
		return this;
	}
}

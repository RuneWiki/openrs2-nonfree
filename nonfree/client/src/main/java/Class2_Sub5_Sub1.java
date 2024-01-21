import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "I")
	public int anInt1822;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	public int anInt1820;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "I")
	public int anInt1821;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1822 = arg0;
		this.aByteArray25 = arg1;
		this.anInt1820 = arg2;
		this.anInt1821 = arg3;
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1822 = arg0;
		this.aByteArray25 = arg1;
		this.anInt1820 = arg2;
		this.anInt1821 = arg3;
		this.aBoolean78 = arg4;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!pa;)Lclient!k;")
	public Class2_Sub5_Sub1 method1451(@OriginalArg(0) Class64 arg0) {
		this.aByteArray25 = arg0.method2150(this.aByteArray25);
		this.anInt1822 = arg0.method2151(this.anInt1822);
		if (this.anInt1820 == this.anInt1821) {
			this.anInt1820 = this.anInt1821 = arg0.method2147(this.anInt1820);
		} else {
			this.anInt1820 = arg0.method2147(this.anInt1820);
			this.anInt1821 = arg0.method2147(this.anInt1821);
			if (this.anInt1820 == this.anInt1821) {
				this.anInt1820--;
			}
		}
		return this;
	}
}

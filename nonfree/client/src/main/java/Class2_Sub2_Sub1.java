import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt295 = arg0;
		this.aByteArray2 = arg1;
		this.anInt294 = arg2;
		this.anInt296 = arg3;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!q;)Lclient!ca;")
	public Class2_Sub2_Sub1 method255(@OriginalArg(0) Class54 arg0) {
		this.aByteArray2 = arg0.method1496(this.aByteArray2);
		this.anInt295 = arg0.method1498(this.anInt295);
		if (this.anInt294 == this.anInt296) {
			this.anInt294 = this.anInt296 = arg0.method1495(this.anInt294);
		} else {
			this.anInt294 = arg0.method1495(this.anInt294);
			this.anInt296 = arg0.method1495(this.anInt296);
			if (this.anInt294 == this.anInt296) {
				this.anInt294--;
			}
		}
		return this;
	}
}

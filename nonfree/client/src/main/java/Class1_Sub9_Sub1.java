import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Z")
	public boolean aBoolean70;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	public int anInt1574;

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
	public int anInt1576;

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
	public int anInt1575;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1574 = arg0;
		this.aByteArray13 = arg1;
		this.anInt1576 = arg2;
		this.anInt1575 = arg3;
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1574 = arg0;
		this.aByteArray13 = arg1;
		this.anInt1576 = arg2;
		this.anInt1575 = arg3;
		this.aBoolean70 = arg4;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!bc;)Lclient!gf;")
	public Class1_Sub9_Sub1 method1016(@OriginalArg(0) Class9 arg0) {
		this.aByteArray13 = arg0.method215(this.aByteArray13);
		this.anInt1574 = arg0.method212(this.anInt1574);
		if (this.anInt1576 == this.anInt1575) {
			this.anInt1576 = this.anInt1575 = arg0.method213(this.anInt1576);
		} else {
			this.anInt1576 = arg0.method213(this.anInt1576);
			this.anInt1575 = arg0.method213(this.anInt1575);
			if (this.anInt1576 == this.anInt1575) {
				this.anInt1576--;
			}
		}
		return this;
	}
}

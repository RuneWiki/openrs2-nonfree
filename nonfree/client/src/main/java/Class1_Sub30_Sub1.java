import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class1_Sub30_Sub1 extends Class1_Sub30 {

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Z")
	public boolean aBoolean452;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
	public int anInt5920;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
	public int anInt5921;

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
	public int anInt5922;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5920 = arg0;
		this.aByteArray77 = arg1;
		this.anInt5921 = arg2;
		this.anInt5922 = arg3;
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5920 = arg0;
		this.aByteArray77 = arg1;
		this.anInt5921 = arg2;
		this.anInt5922 = arg3;
		this.aBoolean452 = arg4;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!ri;)Lclient!mr;")
	public Class1_Sub30_Sub1 method5375(@OriginalArg(0) Class254 arg0) {
		this.aByteArray77 = arg0.method6586(this.aByteArray77);
		this.anInt5920 = arg0.method6583(this.anInt5920);
		if (this.anInt5921 == this.anInt5922) {
			this.anInt5921 = this.anInt5922 = arg0.method6589(this.anInt5921);
		} else {
			this.anInt5921 = arg0.method6589(this.anInt5921);
			this.anInt5922 = arg0.method6589(this.anInt5922);
			if (this.anInt5921 == this.anInt5922) {
				this.anInt5921--;
			}
		}
		return this;
	}
}

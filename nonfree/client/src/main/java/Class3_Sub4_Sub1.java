import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Z")
	public boolean aBoolean21;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public int anInt308;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	public int anInt307;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt308 = arg0;
		this.aByteArray2 = arg1;
		this.anInt309 = arg2;
		this.anInt307 = arg3;
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt308 = arg0;
		this.aByteArray2 = arg1;
		this.anInt309 = arg2;
		this.anInt307 = arg3;
		this.aBoolean21 = arg4;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!jf;)Lclient!bb;")
	public Class3_Sub4_Sub1 method203(@OriginalArg(0) Class44 arg0) {
		this.aByteArray2 = arg0.method1303(this.aByteArray2);
		this.anInt308 = arg0.method1301(this.anInt308);
		if (this.anInt309 == this.anInt307) {
			this.anInt309 = this.anInt307 = arg0.method1300(this.anInt309);
		} else {
			this.anInt309 = arg0.method1300(this.anInt309);
			this.anInt307 = arg0.method1300(this.anInt307);
			if (this.anInt309 == this.anInt307) {
				this.anInt309--;
			}
		}
		return this;
	}
}

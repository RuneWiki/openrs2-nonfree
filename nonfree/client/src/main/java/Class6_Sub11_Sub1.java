import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class6_Sub11_Sub1 extends Class6_Sub11 {

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "Z")
	public boolean aBoolean154;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
	public int anInt2865;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	public int anInt2866;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
	public int anInt2867;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2865 = arg0;
		this.aByteArray34 = arg1;
		this.anInt2866 = arg2;
		this.anInt2867 = arg3;
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2865 = arg0;
		this.aByteArray34 = arg1;
		this.anInt2866 = arg2;
		this.anInt2867 = arg3;
		this.aBoolean154 = arg4;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ke;)Lclient!ta;")
	public Class6_Sub11_Sub1 method1879(@OriginalArg(0) Class43 arg0) {
		this.aByteArray34 = arg0.method1214(this.aByteArray34);
		this.anInt2865 = arg0.method1213(this.anInt2865);
		if (this.anInt2866 == this.anInt2867) {
			this.anInt2866 = this.anInt2867 = arg0.method1209(this.anInt2866);
		} else {
			this.anInt2866 = arg0.method1209(this.anInt2866);
			this.anInt2867 = arg0.method1209(this.anInt2867);
			if (this.anInt2866 == this.anInt2867) {
				this.anInt2866--;
			}
		}
		return this;
	}
}

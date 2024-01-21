import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	public boolean aBoolean85;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	public int anInt1944;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	public int anInt1945;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1944 = arg0;
		this.aByteArray28 = arg1;
		this.anInt1943 = arg2;
		this.anInt1945 = arg3;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1944 = arg0;
		this.aByteArray28 = arg1;
		this.anInt1943 = arg2;
		this.anInt1945 = arg3;
		this.aBoolean85 = arg4;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!fa;)Lclient!jb;")
	public Class2_Sub5_Sub1 method1397(@OriginalArg(0) Class27 arg0) {
		this.aByteArray28 = arg0.method825(this.aByteArray28);
		this.anInt1944 = arg0.method827(this.anInt1944);
		if (this.anInt1943 == this.anInt1945) {
			this.anInt1943 = this.anInt1945 = arg0.method826(this.anInt1943);
		} else {
			this.anInt1943 = arg0.method826(this.anInt1943);
			this.anInt1945 = arg0.method826(this.anInt1945);
			if (this.anInt1943 == this.anInt1945) {
				this.anInt1943--;
			}
		}
		return this;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class4_Sub5_Sub1 extends Class4_Sub5 {

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "Z")
	public boolean aBoolean295;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	public int anInt4737;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	public int anInt4735;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	public int anInt4736;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4737 = arg0;
		this.aByteArray57 = arg1;
		this.anInt4735 = arg2;
		this.anInt4736 = arg3;
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4737 = arg0;
		this.aByteArray57 = arg1;
		this.anInt4735 = arg2;
		this.anInt4736 = arg3;
		this.aBoolean295 = arg4;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!bn;)Lclient!ri;")
	public Class4_Sub5_Sub1 method3689(@OriginalArg(0) Class16 arg0) {
		this.aByteArray57 = arg0.method587(this.aByteArray57);
		this.anInt4737 = arg0.method589(this.anInt4737);
		if (this.anInt4735 == this.anInt4736) {
			this.anInt4735 = this.anInt4736 = arg0.method591(this.anInt4735);
		} else {
			this.anInt4735 = arg0.method591(this.anInt4735);
			this.anInt4736 = arg0.method591(this.anInt4736);
			if (this.anInt4735 == this.anInt4736) {
				this.anInt4735--;
			}
		}
		return this;
	}
}

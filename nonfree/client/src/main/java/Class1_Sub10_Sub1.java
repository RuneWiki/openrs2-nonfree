import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class1_Sub10_Sub1 extends Class1_Sub10 {

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Z")
	public boolean aBoolean52;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt650 = arg0;
		this.aByteArray10 = arg1;
		this.anInt648 = arg2;
		this.anInt649 = arg3;
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt650 = arg0;
		this.aByteArray10 = arg1;
		this.anInt648 = arg2;
		this.anInt649 = arg3;
		this.aBoolean52 = arg4;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ra;)Lclient!cc;")
	public Class1_Sub10_Sub1 method546(@OriginalArg(0) Class143 arg0) {
		this.aByteArray10 = arg0.method3480(this.aByteArray10);
		this.anInt650 = arg0.method3484(this.anInt650);
		if (this.anInt648 == this.anInt649) {
			this.anInt648 = this.anInt649 = arg0.method3481(this.anInt648);
		} else {
			this.anInt648 = arg0.method3481(this.anInt648);
			this.anInt649 = arg0.method3481(this.anInt649);
			if (this.anInt648 == this.anInt649) {
				this.anInt648--;
			}
		}
		return this;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public int anInt1672;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	public int anInt1674;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	public int anInt1673;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1672 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1674 = arg2;
		this.anInt1673 = arg3;
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1672 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1674 = arg2;
		this.anInt1673 = arg3;
		this.aBoolean90 = arg4;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!nc;)Lclient!fn;")
	public Class1_Sub5_Sub1 method1592(@OriginalArg(0) Class117 arg0) {
		this.aByteArray21 = arg0.method3001(this.aByteArray21);
		this.anInt1672 = arg0.method3004(this.anInt1672);
		if (this.anInt1674 == this.anInt1673) {
			this.anInt1674 = this.anInt1673 = arg0.method3003(this.anInt1674);
		} else {
			this.anInt1674 = arg0.method3003(this.anInt1674);
			this.anInt1673 = arg0.method3003(this.anInt1673);
			if (this.anInt1674 == this.anInt1673) {
				this.anInt1674--;
			}
		}
		return this;
	}
}

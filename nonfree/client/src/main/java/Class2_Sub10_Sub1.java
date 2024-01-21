import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public int anInt1799;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	public int anInt1798;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
	public int anInt1797;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1799 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1798 = arg2;
		this.anInt1797 = arg3;
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1799 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1798 = arg2;
		this.anInt1797 = arg3;
		this.aBoolean78 = arg4;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!d;)Lclient!jc;")
	public Class2_Sub10_Sub1 method1269(@OriginalArg(0) Class13 arg0) {
		this.aByteArray21 = arg0.method598(this.aByteArray21);
		this.anInt1799 = arg0.method594(this.anInt1799);
		if (this.anInt1798 == this.anInt1797) {
			this.anInt1798 = this.anInt1797 = arg0.method596(this.anInt1798);
		} else {
			this.anInt1798 = arg0.method596(this.anInt1798);
			this.anInt1797 = arg0.method596(this.anInt1797);
			if (this.anInt1798 == this.anInt1797) {
				this.anInt1798--;
			}
		}
		return this;
	}
}

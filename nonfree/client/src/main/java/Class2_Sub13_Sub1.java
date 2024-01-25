import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Z")
	public boolean aBoolean801;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
	public int anInt9545;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
	public int anInt9544;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public int anInt9546;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9545 = arg0;
		this.aByteArray101 = arg1;
		this.anInt9544 = arg2;
		this.anInt9546 = arg3;
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9545 = arg0;
		this.aByteArray101 = arg1;
		this.anInt9544 = arg2;
		this.anInt9546 = arg3;
		this.aBoolean801 = arg4;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!gu;)Lclient!wm;")
	public Class2_Sub13_Sub1 method7647(@OriginalArg(0) Class132 arg0) {
		this.aByteArray101 = arg0.method2355(this.aByteArray101);
		this.anInt9545 = arg0.method2354(this.anInt9545);
		if (this.anInt9544 == this.anInt9546) {
			this.anInt9544 = this.anInt9546 = arg0.method2356(this.anInt9544);
		} else {
			this.anInt9544 = arg0.method2356(this.anInt9544);
			this.anInt9546 = arg0.method2356(this.anInt9546);
			if (this.anInt9544 == this.anInt9546) {
				this.anInt9544--;
			}
		}
		return this;
	}
}

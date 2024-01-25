import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class4_Sub7_Sub1 extends Class4_Sub7 {

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
	public int anInt481;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt482 = arg0;
		this.aByteArray5 = arg1;
		this.anInt483 = arg2;
		this.anInt481 = arg3;
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt482 = arg0;
		this.aByteArray5 = arg1;
		this.anInt483 = arg2;
		this.anInt481 = arg3;
		this.aBoolean36 = arg4;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!of;)Lclient!bg;")
	public Class4_Sub7_Sub1 method394(@OriginalArg(0) Class150 arg0) {
		this.aByteArray5 = arg0.method4049(this.aByteArray5);
		this.anInt482 = arg0.method4045(this.anInt482);
		if (this.anInt483 == this.anInt481) {
			this.anInt483 = this.anInt481 = arg0.method4047(this.anInt483);
		} else {
			this.anInt483 = arg0.method4047(this.anInt483);
			this.anInt481 = arg0.method4047(this.anInt481);
			if (this.anInt483 == this.anInt481) {
				this.anInt483--;
			}
		}
		return this;
	}
}

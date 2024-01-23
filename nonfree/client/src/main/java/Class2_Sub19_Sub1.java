import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class2_Sub19_Sub1 extends Class2_Sub19 {

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
	public boolean aBoolean241;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public int anInt3518;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public int anInt3519;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3520 = arg0;
		this.aByteArray36 = arg1;
		this.anInt3518 = arg2;
		this.anInt3519 = arg3;
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3520 = arg0;
		this.aByteArray36 = arg1;
		this.anInt3518 = arg2;
		this.anInt3519 = arg3;
		this.aBoolean241 = arg4;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ca;)Lclient!lb;")
	public Class2_Sub19_Sub1 method2904(@OriginalArg(0) Class23 arg0) {
		this.aByteArray36 = arg0.method578(this.aByteArray36);
		this.anInt3520 = arg0.method571(this.anInt3520);
		if (this.anInt3518 == this.anInt3519) {
			this.anInt3518 = this.anInt3519 = arg0.method573(this.anInt3518);
		} else {
			this.anInt3518 = arg0.method573(this.anInt3518);
			this.anInt3519 = arg0.method573(this.anInt3519);
			if (this.anInt3518 == this.anInt3519) {
				this.anInt3518--;
			}
		}
		return this;
	}
}

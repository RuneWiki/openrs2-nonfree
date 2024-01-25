import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "Z")
	public boolean aBoolean517;

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
	public int anInt6608;

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
	public int anInt6607;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
	public int anInt6609;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6608 = arg0;
		this.aByteArray68 = arg1;
		this.anInt6607 = arg2;
		this.anInt6609 = arg3;
	}

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6608 = arg0;
		this.aByteArray68 = arg1;
		this.anInt6607 = arg2;
		this.anInt6609 = arg3;
		this.aBoolean517 = arg4;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!ui;)Lclient!oaa;")
	public Class2_Sub7_Sub1 method5536(@OriginalArg(0) Class335 arg0) {
		this.aByteArray68 = arg0.method7349(this.aByteArray68);
		this.anInt6608 = arg0.method7346(this.anInt6608);
		if (this.anInt6607 == this.anInt6609) {
			this.anInt6607 = this.anInt6609 = arg0.method7348(this.anInt6607);
		} else {
			this.anInt6607 = arg0.method7348(this.anInt6607);
			this.anInt6609 = arg0.method7348(this.anInt6609);
			if (this.anInt6607 == this.anInt6609) {
				this.anInt6607--;
			}
		}
		return this;
	}
}

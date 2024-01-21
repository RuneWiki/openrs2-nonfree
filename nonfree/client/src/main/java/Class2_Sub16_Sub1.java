import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class2_Sub16_Sub1 extends Class2_Sub16 {

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
	public int anInt3446;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
	public int anInt3445;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public int anInt3447;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3446 = arg0;
		this.aByteArray38 = arg1;
		this.anInt3445 = arg2;
		this.anInt3447 = arg3;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3446 = arg0;
		this.aByteArray38 = arg1;
		this.anInt3445 = arg2;
		this.anInt3447 = arg3;
		this.aBoolean128 = arg4;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tg;)Lclient!oa;")
	public Class2_Sub16_Sub1 method2661(@OriginalArg(0) Class84 arg0) {
		this.aByteArray38 = arg0.method3270(this.aByteArray38);
		this.anInt3446 = arg0.method3271(this.anInt3446);
		if (this.anInt3445 == this.anInt3447) {
			this.anInt3445 = this.anInt3447 = arg0.method3273(this.anInt3445);
		} else {
			this.anInt3445 = arg0.method3273(this.anInt3445);
			this.anInt3447 = arg0.method3273(this.anInt3447);
			if (this.anInt3445 == this.anInt3447) {
				this.anInt3445--;
			}
		}
		return this;
	}
}

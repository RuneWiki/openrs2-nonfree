import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "Z")
	public boolean aBoolean13;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt484 = arg0;
		this.aByteArray6 = arg1;
		this.anInt483 = arg2;
		this.anInt482 = arg3;
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt484 = arg0;
		this.aByteArray6 = arg1;
		this.anInt483 = arg2;
		this.anInt482 = arg3;
		this.aBoolean13 = arg4;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!jda;)Lclient!ar;")
	public Class5_Sub5_Sub1 method616(@OriginalArg(0) Class157 arg0) {
		this.aByteArray6 = arg0.method3779(this.aByteArray6);
		this.anInt484 = arg0.method3778(this.anInt484);
		if (this.anInt483 == this.anInt482) {
			this.anInt483 = this.anInt482 = arg0.method3782(this.anInt483);
		} else {
			this.anInt483 = arg0.method3782(this.anInt483);
			this.anInt482 = arg0.method3782(this.anInt482);
			if (this.anInt483 == this.anInt482) {
				this.anInt483--;
			}
		}
		return this;
	}
}

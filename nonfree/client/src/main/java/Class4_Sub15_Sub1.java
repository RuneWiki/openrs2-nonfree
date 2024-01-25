import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class4_Sub15_Sub1 extends Class4_Sub15 {

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Z")
	public boolean aBoolean257;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public int anInt3298;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public int anInt3296;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt3297;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3298 = arg0;
		this.aByteArray34 = arg1;
		this.anInt3296 = arg2;
		this.anInt3297 = arg3;
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3298 = arg0;
		this.aByteArray34 = arg1;
		this.anInt3296 = arg2;
		this.anInt3297 = arg3;
		this.aBoolean257 = arg4;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!av;)Lclient!jc;")
	public Class4_Sub15_Sub1 method2508(@OriginalArg(0) Class17 arg0) {
		this.aByteArray34 = arg0.method296(this.aByteArray34);
		this.anInt3298 = arg0.method293(this.anInt3298);
		if (this.anInt3296 == this.anInt3297) {
			this.anInt3296 = this.anInt3297 = arg0.method295(this.anInt3296);
		} else {
			this.anInt3296 = arg0.method295(this.anInt3296);
			this.anInt3297 = arg0.method295(this.anInt3297);
			if (this.anInt3296 == this.anInt3297) {
				this.anInt3296--;
			}
		}
		return this;
	}
}

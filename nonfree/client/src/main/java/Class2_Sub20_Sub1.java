import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class2_Sub20_Sub1 extends Class2_Sub20 {

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "Z")
	public boolean aBoolean257;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public int anInt3404;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
	public int anInt3406;

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
	public int anInt3405;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3404 = arg0;
		this.aByteArray40 = arg1;
		this.anInt3406 = arg2;
		this.anInt3405 = arg3;
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3404 = arg0;
		this.aByteArray40 = arg1;
		this.anInt3406 = arg2;
		this.anInt3405 = arg3;
		this.aBoolean257 = arg4;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!j;)Lclient!jk;")
	public Class2_Sub20_Sub1 method2918(@OriginalArg(0) Class113 arg0) {
		this.aByteArray40 = arg0.method2769(this.aByteArray40);
		this.anInt3404 = arg0.method2767(this.anInt3404);
		if (this.anInt3406 == this.anInt3405) {
			this.anInt3406 = this.anInt3405 = arg0.method2768(this.anInt3406);
		} else {
			this.anInt3406 = arg0.method2768(this.anInt3406);
			this.anInt3405 = arg0.method2768(this.anInt3405);
			if (this.anInt3406 == this.anInt3405) {
				this.anInt3406--;
			}
		}
		return this;
	}
}

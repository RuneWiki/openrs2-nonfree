import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class1_Sub19_Sub1 extends Class1_Sub19 {

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Z")
	public boolean aBoolean182;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	public int anInt3298;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public int anInt3296;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
	public int anInt3297;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3298 = arg0;
		this.aByteArray42 = arg1;
		this.anInt3296 = arg2;
		this.anInt3297 = arg3;
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3298 = arg0;
		this.aByteArray42 = arg1;
		this.anInt3296 = arg2;
		this.anInt3297 = arg3;
		this.aBoolean182 = arg4;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!jj;)Lclient!pd;")
	public Class1_Sub19_Sub1 method2523(@OriginalArg(0) Class53 arg0) {
		this.aByteArray42 = arg0.method1727(this.aByteArray42);
		this.anInt3298 = arg0.method1725(this.anInt3298);
		if (this.anInt3296 == this.anInt3297) {
			this.anInt3296 = this.anInt3297 = arg0.method1726(this.anInt3296);
		} else {
			this.anInt3296 = arg0.method1726(this.anInt3296);
			this.anInt3297 = arg0.method1726(this.anInt3297);
			if (this.anInt3296 == this.anInt3297) {
				this.anInt3296--;
			}
		}
		return this;
	}
}

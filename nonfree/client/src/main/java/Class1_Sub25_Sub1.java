import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class1_Sub25_Sub1 extends Class1_Sub25 {

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public int anInt3338;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	public int anInt3340;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
	public int anInt3339;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3338 = arg0;
		this.aByteArray37 = arg1;
		this.anInt3340 = arg2;
		this.anInt3339 = arg3;
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3338 = arg0;
		this.aByteArray37 = arg1;
		this.anInt3340 = arg2;
		this.anInt3339 = arg3;
		this.aBoolean384 = arg4;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!vp;)Lclient!jj;")
	public Class1_Sub25_Sub1 method2771(@OriginalArg(0) Class255 arg0) {
		this.aByteArray37 = arg0.method5704(this.aByteArray37);
		this.anInt3338 = arg0.method5703(this.anInt3338);
		if (this.anInt3340 == this.anInt3339) {
			this.anInt3340 = this.anInt3339 = arg0.method5706(this.anInt3340);
		} else {
			this.anInt3340 = arg0.method5706(this.anInt3340);
			this.anInt3339 = arg0.method5706(this.anInt3339);
			if (this.anInt3340 == this.anInt3339) {
				this.anInt3340--;
			}
		}
		return this;
	}
}

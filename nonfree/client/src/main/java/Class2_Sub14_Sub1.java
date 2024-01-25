import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class2_Sub14_Sub1 extends Class2_Sub14 {

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Z")
	public boolean aBoolean257;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
	public int anInt3845;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
	public int anInt3844;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public int anInt3843;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3845 = arg0;
		this.aByteArray50 = arg1;
		this.anInt3844 = arg2;
		this.anInt3843 = arg3;
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3845 = arg0;
		this.aByteArray50 = arg1;
		this.anInt3844 = arg2;
		this.anInt3843 = arg3;
		this.aBoolean257 = arg4;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!kn;)Lclient!lf;")
	public Class2_Sub14_Sub1 method3133(@OriginalArg(0) Class148 arg0) {
		this.aByteArray50 = arg0.method3056(this.aByteArray50);
		this.anInt3845 = arg0.method3058(this.anInt3845);
		if (this.anInt3844 == this.anInt3843) {
			this.anInt3844 = this.anInt3843 = arg0.method3059(this.anInt3844);
		} else {
			this.anInt3844 = arg0.method3059(this.anInt3844);
			this.anInt3843 = arg0.method3059(this.anInt3843);
			if (this.anInt3844 == this.anInt3843) {
				this.anInt3844--;
			}
		}
		return this;
	}
}

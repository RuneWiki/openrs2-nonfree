import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class6_Sub17_Sub1 extends Class6_Sub17 {

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "Z")
	public boolean aBoolean195;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
	public int anInt3086;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
	public int anInt3088;

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
	public int anInt3087;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3086 = arg0;
		this.aByteArray38 = arg1;
		this.anInt3088 = arg2;
		this.anInt3087 = arg3;
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3086 = arg0;
		this.aByteArray38 = arg1;
		this.anInt3088 = arg2;
		this.anInt3087 = arg3;
		this.aBoolean195 = arg4;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!as;)Lclient!hh;")
	public Class6_Sub17_Sub1 method2572(@OriginalArg(0) Class14 arg0) {
		this.aByteArray38 = arg0.method469(this.aByteArray38);
		this.anInt3086 = arg0.method467(this.anInt3086);
		if (this.anInt3088 == this.anInt3087) {
			this.anInt3088 = this.anInt3087 = arg0.method474(this.anInt3088);
		} else {
			this.anInt3088 = arg0.method474(this.anInt3088);
			this.anInt3087 = arg0.method474(this.anInt3087);
			if (this.anInt3088 == this.anInt3087) {
				this.anInt3088--;
			}
		}
		return this;
	}
}

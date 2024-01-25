import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class4_Sub16_Sub1 extends Class4_Sub16 {

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Z")
	public boolean aBoolean247;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt3115;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public int anInt3114;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt3116;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3115 = arg0;
		this.aByteArray37 = arg1;
		this.anInt3114 = arg2;
		this.anInt3116 = arg3;
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3115 = arg0;
		this.aByteArray37 = arg1;
		this.anInt3114 = arg2;
		this.anInt3116 = arg3;
		this.aBoolean247 = arg4;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!uw;)Lclient!fc;")
	public Class4_Sub16_Sub1 method2817(@OriginalArg(0) Class342 arg0) {
		this.aByteArray37 = arg0.method7551(this.aByteArray37);
		this.anInt3115 = arg0.method7548(this.anInt3115);
		if (this.anInt3114 == this.anInt3116) {
			this.anInt3114 = this.anInt3116 = arg0.method7550(this.anInt3114);
		} else {
			this.anInt3114 = arg0.method7550(this.anInt3114);
			this.anInt3116 = arg0.method7550(this.anInt3116);
			if (this.anInt3114 == this.anInt3116) {
				this.anInt3114--;
			}
		}
		return this;
	}
}

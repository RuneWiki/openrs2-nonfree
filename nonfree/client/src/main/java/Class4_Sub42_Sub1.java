import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class4_Sub42_Sub1 extends Class4_Sub42 {

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
	public boolean aBoolean646;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
	public int anInt9491;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
	public int anInt9493;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
	public int anInt9492;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9491 = arg0;
		this.aByteArray90 = arg1;
		this.anInt9493 = arg2;
		this.anInt9492 = arg3;
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9491 = arg0;
		this.aByteArray90 = arg1;
		this.anInt9493 = arg2;
		this.anInt9492 = arg3;
		this.aBoolean646 = arg4;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!qu;)Lclient!tk;")
	public Class4_Sub42_Sub1 method7307(@OriginalArg(0) Class285 arg0) {
		this.aByteArray90 = arg0.method6532(this.aByteArray90);
		this.anInt9491 = arg0.method6536(this.anInt9491);
		if (this.anInt9493 == this.anInt9492) {
			this.anInt9493 = this.anInt9492 = arg0.method6531(this.anInt9493);
		} else {
			this.anInt9493 = arg0.method6531(this.anInt9493);
			this.anInt9492 = arg0.method6531(this.anInt9492);
			if (this.anInt9493 == this.anInt9492) {
				this.anInt9493--;
			}
		}
		return this;
	}
}

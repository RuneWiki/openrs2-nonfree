import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class2_Sub22_Sub1 extends Class2_Sub22 {

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "Z")
	public boolean aBoolean108;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
	public int anInt2518;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
	public int anInt2519;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	public int anInt2517;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2518 = arg0;
		this.aByteArray39 = arg1;
		this.anInt2519 = arg2;
		this.anInt2517 = arg3;
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2518 = arg0;
		this.aByteArray39 = arg1;
		this.anInt2519 = arg2;
		this.anInt2517 = arg3;
		this.aBoolean108 = arg4;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!ti;)Lclient!kh;")
	public Class2_Sub22_Sub1 method1956(@OriginalArg(0) Class96 arg0) {
		this.aByteArray39 = arg0.method3557(this.aByteArray39);
		this.anInt2518 = arg0.method3556(this.anInt2518);
		if (this.anInt2519 == this.anInt2517) {
			this.anInt2519 = this.anInt2517 = arg0.method3551(this.anInt2519);
		} else {
			this.anInt2519 = arg0.method3551(this.anInt2519);
			this.anInt2517 = arg0.method3551(this.anInt2517);
			if (this.anInt2519 == this.anInt2517) {
				this.anInt2519--;
			}
		}
		return this;
	}
}

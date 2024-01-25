import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class6_Sub21_Sub1 extends Class6_Sub21 {

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Z")
	public boolean aBoolean169;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	public int anInt2712;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	public int anInt2711;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public int anInt2710;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2712 = arg0;
		this.aByteArray29 = arg1;
		this.anInt2711 = arg2;
		this.anInt2710 = arg3;
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2712 = arg0;
		this.aByteArray29 = arg1;
		this.anInt2711 = arg2;
		this.anInt2710 = arg3;
		this.aBoolean169 = arg4;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!fc;)Lclient!fk;")
	public Class6_Sub21_Sub1 method2289(@OriginalArg(0) Class101 arg0) {
		this.aByteArray29 = arg0.method2137(this.aByteArray29);
		this.anInt2712 = arg0.method2135(this.anInt2712);
		if (this.anInt2711 == this.anInt2710) {
			this.anInt2711 = this.anInt2710 = arg0.method2138(this.anInt2711);
		} else {
			this.anInt2711 = arg0.method2138(this.anInt2711);
			this.anInt2710 = arg0.method2138(this.anInt2710);
			if (this.anInt2711 == this.anInt2710) {
				this.anInt2711--;
			}
		}
		return this;
	}
}

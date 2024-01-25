import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Z")
	public boolean aBoolean134;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	public int anInt1553;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	public int anInt1551;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	public int anInt1552;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1553 = arg0;
		this.aByteArray22 = arg1;
		this.anInt1551 = arg2;
		this.anInt1552 = arg3;
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1553 = arg0;
		this.aByteArray22 = arg1;
		this.anInt1551 = arg2;
		this.anInt1552 = arg3;
		this.aBoolean134 = arg4;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!vo;)Lclient!eg;")
	public Class1_Sub12_Sub1 method1480(@OriginalArg(0) Class213 arg0) {
		this.aByteArray22 = arg0.method5576(this.aByteArray22);
		this.anInt1553 = arg0.method5577(this.anInt1553);
		if (this.anInt1551 == this.anInt1552) {
			this.anInt1551 = this.anInt1552 = arg0.method5580(this.anInt1551);
		} else {
			this.anInt1551 = arg0.method5580(this.anInt1551);
			this.anInt1552 = arg0.method5580(this.anInt1552);
			if (this.anInt1551 == this.anInt1552) {
				this.anInt1551--;
			}
		}
		return this;
	}
}

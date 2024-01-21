import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!s", name = "E", descriptor = "Z")
	public boolean aBoolean201;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!s", name = "G", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "I")
	public int anInt2501;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "I")
	public int anInt2502;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2500 = arg0;
		this.aByteArray35 = arg1;
		this.anInt2501 = arg2;
		this.anInt2502 = arg3;
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2500 = arg0;
		this.aByteArray35 = arg1;
		this.anInt2501 = arg2;
		this.anInt2502 = arg3;
		this.aBoolean201 = arg4;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!hc;)Lclient!s;")
	public Class2_Sub4_Sub1 method1815(@OriginalArg(0) Class31 arg0) {
		this.aByteArray35 = arg0.method789(this.aByteArray35);
		this.anInt2500 = arg0.method786(this.anInt2500);
		if (this.anInt2501 == this.anInt2502) {
			this.anInt2501 = this.anInt2502 = arg0.method788(this.anInt2501);
		} else {
			this.anInt2501 = arg0.method788(this.anInt2501);
			this.anInt2502 = arg0.method788(this.anInt2502);
			if (this.anInt2501 == this.anInt2502) {
				this.anInt2501--;
			}
		}
		return this;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class2_Sub14_Sub1 extends Class2_Sub14 {

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Z")
	public boolean aBoolean55;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	public int anInt1408;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
	public int anInt1409;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
	public int anInt1410;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1408 = arg0;
		this.aByteArray11 = arg1;
		this.anInt1409 = arg2;
		this.anInt1410 = arg3;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1408 = arg0;
		this.aByteArray11 = arg1;
		this.anInt1409 = arg2;
		this.anInt1410 = arg3;
		this.aBoolean55 = arg4;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!hc;)Lclient!ke;")
	public Class2_Sub14_Sub1 method993(@OriginalArg(0) Class33 arg0) {
		this.aByteArray11 = arg0.method730(this.aByteArray11);
		this.anInt1408 = arg0.method734(this.anInt1408);
		if (this.anInt1409 == this.anInt1410) {
			this.anInt1409 = this.anInt1410 = arg0.method735(this.anInt1409);
		} else {
			this.anInt1409 = arg0.method735(this.anInt1409);
			this.anInt1410 = arg0.method735(this.anInt1410);
			if (this.anInt1409 == this.anInt1410) {
				this.anInt1409--;
			}
		}
		return this;
	}
}

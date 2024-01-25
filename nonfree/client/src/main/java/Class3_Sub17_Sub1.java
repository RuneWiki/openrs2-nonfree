import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class3_Sub17_Sub1 extends Class3_Sub17 {

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Z")
	public boolean aBoolean139;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
	public int anInt2523;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
	public int anInt2521;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
	public int anInt2522;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2523 = arg0;
		this.aByteArray48 = arg1;
		this.anInt2521 = arg2;
		this.anInt2522 = arg3;
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2523 = arg0;
		this.aByteArray48 = arg1;
		this.anInt2521 = arg2;
		this.anInt2522 = arg3;
		this.aBoolean139 = arg4;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!me;)Lclient!hh;")
	public Class3_Sub17_Sub1 method2051(@OriginalArg(0) Class132 arg0) {
		this.aByteArray48 = arg0.method3422(this.aByteArray48);
		this.anInt2523 = arg0.method3423(this.anInt2523);
		if (this.anInt2521 == this.anInt2522) {
			this.anInt2521 = this.anInt2522 = arg0.method3419(this.anInt2521);
		} else {
			this.anInt2521 = arg0.method3419(this.anInt2521);
			this.anInt2522 = arg0.method3419(this.anInt2522);
			if (this.anInt2521 == this.anInt2522) {
				this.anInt2521--;
			}
		}
		return this;
	}
}

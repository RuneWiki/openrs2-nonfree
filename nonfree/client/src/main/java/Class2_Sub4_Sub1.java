import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Z")
	public boolean aBoolean731;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public int anInt8532;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "[B")
	public byte[] aByteArray102;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
	public int anInt8533;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public int anInt8534;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8532 = arg0;
		this.aByteArray102 = arg1;
		this.anInt8533 = arg2;
		this.anInt8534 = arg3;
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8532 = arg0;
		this.aByteArray102 = arg1;
		this.anInt8533 = arg2;
		this.anInt8534 = arg3;
		this.aBoolean731 = arg4;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!c;)Lclient!rb;")
	public Class2_Sub4_Sub1 method7558(@OriginalArg(0) Class51 arg0) {
		this.aByteArray102 = arg0.method1029(this.aByteArray102);
		this.anInt8532 = arg0.method1025(this.anInt8532);
		if (this.anInt8533 == this.anInt8534) {
			this.anInt8533 = this.anInt8534 = arg0.method1027(this.anInt8533);
		} else {
			this.anInt8533 = arg0.method1027(this.anInt8533);
			this.anInt8534 = arg0.method1027(this.anInt8534);
			if (this.anInt8533 == this.anInt8534) {
				this.anInt8533--;
			}
		}
		return this;
	}
}

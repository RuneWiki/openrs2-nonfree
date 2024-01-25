import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "Z")
	public boolean aBoolean51;

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
	public int anInt914;

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	public int anInt913;

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
	public int anInt915;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt914 = arg0;
		this.aByteArray8 = arg1;
		this.anInt913 = arg2;
		this.anInt915 = arg3;
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt914 = arg0;
		this.aByteArray8 = arg1;
		this.anInt913 = arg2;
		this.anInt915 = arg3;
		this.aBoolean51 = arg4;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!mt;)Lclient!bu;")
	public Class1_Sub13_Sub1 method805(@OriginalArg(0) Class227 arg0) {
		this.aByteArray8 = arg0.method4901(this.aByteArray8);
		this.anInt914 = arg0.method4905(this.anInt914);
		if (this.anInt913 == this.anInt915) {
			this.anInt913 = this.anInt915 = arg0.method4904(this.anInt913);
		} else {
			this.anInt913 = arg0.method4904(this.anInt913);
			this.anInt915 = arg0.method4904(this.anInt915);
			if (this.anInt913 == this.anInt915) {
				this.anInt913--;
			}
		}
		return this;
	}
}

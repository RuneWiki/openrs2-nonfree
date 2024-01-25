import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "Z")
	public boolean aBoolean95;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
	public int anInt1042;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
	public int anInt1041;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1042 = arg0;
		this.aByteArray16 = arg1;
		this.anInt1041 = arg2;
		this.anInt1040 = arg3;
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1042 = arg0;
		this.aByteArray16 = arg1;
		this.anInt1041 = arg2;
		this.anInt1040 = arg3;
		this.aBoolean95 = arg4;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!od;)Lclient!bq;")
	public Class3_Sub6_Sub1 method743(@OriginalArg(0) Class174 arg0) {
		this.aByteArray16 = arg0.method4043(this.aByteArray16);
		this.anInt1042 = arg0.method4039(this.anInt1042);
		if (this.anInt1041 == this.anInt1040) {
			this.anInt1041 = this.anInt1040 = arg0.method4042(this.anInt1041);
		} else {
			this.anInt1041 = arg0.method4042(this.anInt1041);
			this.anInt1040 = arg0.method4042(this.anInt1040);
			if (this.anInt1041 == this.anInt1040) {
				this.anInt1041--;
			}
		}
		return this;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class2_Sub44_Sub1 extends Class2_Sub44 {

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Z")
	public boolean aBoolean748;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	public int anInt10350;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public int anInt10349;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	public int anInt10351;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub44_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10350 = arg0;
		this.aByteArray92 = arg1;
		this.anInt10349 = arg2;
		this.anInt10351 = arg3;
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub44_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10350 = arg0;
		this.aByteArray92 = arg1;
		this.anInt10349 = arg2;
		this.anInt10351 = arg3;
		this.aBoolean748 = arg4;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ou;)Lclient!ud;")
	public Class2_Sub44_Sub1 method8940(@OriginalArg(0) Class269 arg0) {
		this.aByteArray92 = arg0.method7160(this.aByteArray92);
		this.anInt10350 = arg0.method7162(this.anInt10350);
		if (this.anInt10349 == this.anInt10351) {
			this.anInt10349 = this.anInt10351 = arg0.method7164(this.anInt10349);
		} else {
			this.anInt10349 = arg0.method7164(this.anInt10349);
			this.anInt10351 = arg0.method7164(this.anInt10351);
			if (this.anInt10349 == this.anInt10351) {
				this.anInt10349--;
			}
		}
		return this;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class10_Sub25_Sub1 extends Class10_Sub25 {

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "Z")
	public boolean aBoolean498;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
	public int anInt7555;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
	public int anInt7556;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
	public int anInt7557;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I[BII)V")
	public Class10_Sub25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7555 = arg0;
		this.aByteArray94 = arg1;
		this.anInt7556 = arg2;
		this.anInt7557 = arg3;
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class10_Sub25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7555 = arg0;
		this.aByteArray94 = arg1;
		this.anInt7556 = arg2;
		this.anInt7557 = arg3;
		this.aBoolean498 = arg4;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ng;)Lclient!wq;")
	public Class10_Sub25_Sub1 method6029(@OriginalArg(0) Class172 arg0) {
		this.aByteArray94 = arg0.method3822(this.aByteArray94);
		this.anInt7555 = arg0.method3823(this.anInt7555);
		if (this.anInt7556 == this.anInt7557) {
			this.anInt7556 = this.anInt7557 = arg0.method3824(this.anInt7556);
		} else {
			this.anInt7556 = arg0.method3824(this.anInt7556);
			this.anInt7557 = arg0.method3824(this.anInt7557);
			if (this.anInt7556 == this.anInt7557) {
				this.anInt7556--;
			}
		}
		return this;
	}
}

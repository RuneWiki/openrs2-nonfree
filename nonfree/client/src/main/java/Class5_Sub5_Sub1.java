import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!e", name = "y", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public int anInt773;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt775 = arg0;
		this.aByteArray18 = arg1;
		this.anInt773 = arg2;
		this.anInt774 = arg3;
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt775 = arg0;
		this.aByteArray18 = arg1;
		this.anInt773 = arg2;
		this.anInt774 = arg3;
		this.aBoolean33 = arg4;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!td;)Lclient!e;")
	public Class5_Sub5_Sub1 method541(@OriginalArg(0) Class71 arg0) {
		this.aByteArray18 = arg0.method1925(this.aByteArray18);
		this.anInt775 = arg0.method1927(this.anInt775);
		if (this.anInt773 == this.anInt774) {
			this.anInt773 = this.anInt774 = arg0.method1928(this.anInt773);
		} else {
			this.anInt773 = arg0.method1928(this.anInt773);
			this.anInt774 = arg0.method1928(this.anInt774);
			if (this.anInt773 == this.anInt774) {
				this.anInt773--;
			}
		}
		return this;
	}
}

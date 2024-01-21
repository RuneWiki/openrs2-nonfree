import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Z")
	public boolean aBoolean63;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
	public int anInt1300;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
	public int anInt1302;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	public int anInt1301;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1300 = arg0;
		this.aByteArray9 = arg1;
		this.anInt1302 = arg2;
		this.anInt1301 = arg3;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!me;)Lclient!ie;")
	public Class3_Sub4_Sub1 method867(@OriginalArg(0) Class46 arg0) {
		this.aByteArray9 = arg0.method1197(this.aByteArray9);
		this.anInt1300 = arg0.method1195(this.anInt1300);
		if (this.anInt1302 == this.anInt1301) {
			this.anInt1302 = this.anInt1301 = arg0.method1193(this.anInt1302);
		} else {
			this.anInt1302 = arg0.method1193(this.anInt1302);
			this.anInt1301 = arg0.method1193(this.anInt1301);
			if (this.anInt1302 == this.anInt1301) {
				this.anInt1302--;
			}
		}
		return this;
	}
}

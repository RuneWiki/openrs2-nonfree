import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt611 = arg0;
		this.aByteArray8 = arg1;
		this.anInt613 = arg2;
		this.anInt612 = arg3;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!t;)Lclient!ed;")
	public Class2_Sub4_Sub1 method491(@OriginalArg(0) Class56 arg0) {
		this.aByteArray8 = arg0.method1465(this.aByteArray8);
		this.anInt611 = arg0.method1463(this.anInt611);
		if (this.anInt613 == this.anInt612) {
			this.anInt613 = this.anInt612 = arg0.method1462(this.anInt613);
		} else {
			this.anInt613 = arg0.method1462(this.anInt613);
			this.anInt612 = arg0.method1462(this.anInt612);
			if (this.anInt613 == this.anInt612) {
				this.anInt613--;
			}
		}
		return this;
	}
}

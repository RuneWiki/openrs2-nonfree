import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!na", name = "E", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "I")
	public int anInt1630;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "I")
	public int anInt1631;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "I")
	public int anInt1629;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1630 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1631 = arg2;
		this.anInt1629 = arg3;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!h;)Lclient!na;")
	public Class1_Sub4_Sub1 method1190(@OriginalArg(0) Class32 arg0) {
		this.aByteArray21 = arg0.method692(this.aByteArray21);
		this.anInt1630 = arg0.method693(this.anInt1630);
		if (this.anInt1631 == this.anInt1629) {
			this.anInt1631 = this.anInt1629 = arg0.method691(this.anInt1631);
		} else {
			this.anInt1631 = arg0.method691(this.anInt1631);
			this.anInt1629 = arg0.method691(this.anInt1629);
			if (this.anInt1631 == this.anInt1629) {
				this.anInt1631--;
			}
		}
		return this;
	}
}

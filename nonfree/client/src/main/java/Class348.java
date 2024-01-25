import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class348 {

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
	public int anInt10066;

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
	public int anInt10067;

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "B")
	private byte aByte107;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
	public int anInt10070;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	public int anInt10071;

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
	public int anInt10072;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "()V")
	public Class348() {
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class348(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aByte107 = arg0.method6529();
		this.anInt10072 = arg0.method6535();
		this.anInt10070 = arg0.method6497();
		this.anInt10071 = arg0.method6497();
		this.anInt10066 = arg0.method6497();
		this.anInt10067 = arg0.method6497();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)I")
	public int method8171() {
		return this.aByte107 & 0x7;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)I")
	public int method8172() {
		return (this.aByte107 & 0x8) == 8 ? 1 : 0;
	}
}

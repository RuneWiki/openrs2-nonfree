import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class70 {

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	public int anInt1985;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public int anInt1986;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "B")
	private byte aByte30;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public int anInt1987;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public int anInt1990;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
	public int anInt1991;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class70() {
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class70(@OriginalArg(0) Class6_Sub23 arg0) {
		this.aByte30 = arg0.method8391();
		this.anInt1985 = arg0.method8363();
		this.anInt1990 = arg0.method8369();
		this.anInt1991 = arg0.method8369();
		this.anInt1986 = arg0.method8369();
		this.anInt1987 = arg0.method8369();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)I")
	public int method1751() {
		return this.aByte30 & 0x7;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)I")
	public int method1753() {
		return (this.aByte30 & 0x8) == 8 ? 1 : 0;
	}
}

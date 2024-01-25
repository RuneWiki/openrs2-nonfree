import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class272 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public int anInt7861;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public int anInt7862;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public int anInt7864;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public int anInt7865;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
	public int anInt7868;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "B")
	private byte aByte116;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class272() {
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class272(@OriginalArg(0) Class14_Sub29 arg0) {
		this.aByte116 = arg0.method5845();
		this.anInt7868 = arg0.method5900();
		this.anInt7862 = arg0.method5878();
		this.anInt7864 = arg0.method5878();
		this.anInt7861 = arg0.method5878();
		this.anInt7865 = arg0.method5878();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)I")
	public int method6504() {
		return this.aByte116 & 0x7;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I")
	public int method6506() {
		return (this.aByte116 & 0x8) == 8 ? 1 : 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class105 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	public int anInt3693;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	public int anInt3695;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	public int anInt3696;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "B")
	private byte aByte35;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	public int anInt3697;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
	public int anInt3698;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class105() {
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!rt;)V")
	public Class105(@OriginalArg(0) Class3_Sub27 arg0) {
		this.aByte35 = arg0.method7584();
		this.anInt3698 = arg0.method7591();
		this.anInt3695 = arg0.method7549();
		this.anInt3697 = arg0.method7549();
		this.anInt3693 = arg0.method7549();
		this.anInt3696 = arg0.method7549();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	public int method3098() {
		return this.aByte35 & 0x7;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
	public int method3100() {
		return (this.aByte35 & 0x8) == 8 ? 1 : 0;
	}
}

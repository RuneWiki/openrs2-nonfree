import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!qja", name = "u", descriptor = "I")
	public final int anInt7828;

	@OriginalMember(owner = "client!qja", name = "p", descriptor = "I")
	public final int anInt7824;

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(II)V")
	public Class3_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7828 = arg1;
		this.anInt7824 = arg0;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(I)Z")
	public boolean method6480() {
		return (this.anInt7824 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(B)Z")
	public boolean method6483() {
		return (this.anInt7824 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qja", name = "c", descriptor = "(I)I")
	public int method6484() {
		return Static364.method5246(this.anInt7824);
	}

	@OriginalMember(owner = "client!qja", name = "f", descriptor = "(I)I")
	public int method6485() {
		return this.anInt7824 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(II)Z")
	public boolean method6486(@OriginalArg(0) int arg0) {
		return (this.anInt7824 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qja", name = "c", descriptor = "(B)Z")
	public boolean method6488() {
		return (this.anInt7824 >> 22 & 0x1) != 0;
	}
}

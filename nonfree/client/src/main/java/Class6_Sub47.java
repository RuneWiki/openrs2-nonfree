import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class6_Sub47 extends Class6 {

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	public final int anInt9595;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public final int anInt9598;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V")
	public Class6_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9595 = arg0;
		this.anInt9598 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
	public boolean method8143() {
		return (this.anInt9595 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z")
	public boolean method8145() {
		return (this.anInt9595 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)I")
	public int method8146() {
		return this.anInt9595 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)I")
	public int method8147() {
		return Static351.method5659(this.anInt9595);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
	public boolean method8148(@OriginalArg(0) int arg0) {
		return (this.anInt9595 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Z")
	public boolean method8149() {
		return (this.anInt9595 >> 22 & 0x1) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class7_Sub27 extends Class7 {

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	public final int anInt4220;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	public final int anInt4221;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V")
	public Class7_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4220 = arg1;
		this.anInt4221 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)Z")
	public boolean method3755(@OriginalArg(0) int arg0) {
		return (this.anInt4221 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Z")
	public boolean method3756() {
		return (this.anInt4221 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)Z")
	public boolean method3757() {
		return (this.anInt4221 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Z")
	public boolean method3758() {
		return (this.anInt4221 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)Z")
	public boolean method3761() {
		return (this.anInt4221 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)I")
	public int method3762() {
		return this.anInt4221 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)Z")
	public boolean method3764() {
		return (this.anInt4221 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)I")
	public int method3765() {
		return Static152.method2975(this.anInt4221);
	}

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)Z")
	public boolean method3766() {
		return (this.anInt4221 >> 28 & 0x1) != 0;
	}
}

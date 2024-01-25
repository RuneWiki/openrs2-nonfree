import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	public final int anInt22;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public final int anInt19;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt22 = arg1;
		this.anInt19 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Z")
	public boolean method35() {
		return (this.anInt19 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)I")
	public int method36() {
		return this.anInt19 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Z")
	public boolean method37() {
		return (this.anInt19 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
	public boolean method38(@OriginalArg(0) int arg0) {
		return (this.anInt19 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Z")
	public boolean method39() {
		return (this.anInt19 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)I")
	public int method40() {
		return Static524.method5364(this.anInt19);
	}
}

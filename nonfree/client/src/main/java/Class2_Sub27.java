import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	public final int anInt4225;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	public final int anInt4220;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
	public Class2_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4225 = arg1;
		this.anInt4220 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z")
	public boolean method3755(@OriginalArg(0) int arg0) {
		return (this.anInt4220 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
	public boolean method3756() {
		return (this.anInt4220 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Z")
	public boolean method3757() {
		return (this.anInt4220 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
	public int method3759() {
		return Static76.method1316(this.anInt4220);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)I")
	public int method3760() {
		return this.anInt4220 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Z")
	public boolean method3762() {
		return (this.anInt4220 & 0x1) != 0;
	}
}

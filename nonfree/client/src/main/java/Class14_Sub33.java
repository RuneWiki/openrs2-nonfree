import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class14_Sub33 extends Class14 {

	@OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
	public final int anInt6586;

	@OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
	public final int anInt6587;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(II)V")
	public Class14_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6586 = arg0;
		this.anInt6587 = arg1;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
	public boolean method5401() {
		return (this.anInt6586 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)I")
	public int method5402() {
		return Static250.method3682(this.anInt6586);
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(B)Z")
	public boolean method5403() {
		return (this.anInt6586 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)I")
	public int method5406() {
		return this.anInt6586 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(II)Z")
	public boolean method5411(@OriginalArg(0) int arg0) {
		return (this.anInt6586 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "(I)Z")
	public boolean method5412() {
		return (this.anInt6586 >> 21 & 0x1) != 0;
	}
}

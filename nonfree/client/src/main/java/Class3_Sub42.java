import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	public final int anInt6288;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
	public final int anInt6291;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(II)V")
	public Class3_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6288 = arg1;
		this.anInt6291 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)Z")
	public boolean method5600() {
		return (this.anInt6291 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z")
	public boolean method5602(@OriginalArg(1) int arg0) {
		return (this.anInt6291 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)I")
	public int method5603() {
		return Static1.method12(this.anInt6291);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)Z")
	public boolean method5604() {
		return (this.anInt6291 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)Z")
	public boolean method5606() {
		return (this.anInt6291 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)I")
	public int method5607() {
		return this.anInt6291 >> 18 & 0x7;
	}
}

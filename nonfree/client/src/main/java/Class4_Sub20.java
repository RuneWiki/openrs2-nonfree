import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
	public final int anInt3510;

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
	public final int anInt3514;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(II)V")
	public Class4_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3510 = arg1;
		this.anInt3514 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
	public int method2789() {
		return this.anInt3514 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Z")
	public boolean method2792() {
		return (this.anInt3514 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)Z")
	public boolean method2793() {
		return (this.anInt3514 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Z")
	public boolean method2794(@OriginalArg(1) int arg0) {
		return (this.anInt3514 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "(I)Z")
	public boolean method2795() {
		return (this.anInt3514 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)I")
	public int method2796() {
		return Static278.method3677(this.anInt3514);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class5_Sub42 extends Class5 {

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
	public final int anInt7814;

	@OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
	public final int anInt7813;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(II)V")
	public Class5_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7814 = arg1;
		this.anInt7813 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Z")
	public boolean method6627() {
		return (this.anInt7813 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)I")
	public int method6628() {
		return this.anInt7813 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)I")
	public int method6629() {
		return Static264.method3756(this.anInt7813);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)Z")
	public boolean method6630(@OriginalArg(0) int arg0) {
		return (this.anInt7813 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)Z")
	public boolean method6631() {
		return (this.anInt7813 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "(I)Z")
	public boolean method6634() {
		return (this.anInt7813 & 0x1) != 0;
	}
}

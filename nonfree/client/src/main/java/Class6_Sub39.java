import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class6_Sub39 extends Class6 {

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public final int anInt7305;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "I")
	public final int anInt7309;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(II)V")
	public Class6_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7305 = arg0;
		this.anInt7309 = arg1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)I")
	public int method5829() {
		return this.anInt7305 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)Z")
	public boolean method5830() {
		return (this.anInt7305 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Z")
	public boolean method5831() {
		return (this.anInt7305 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Z")
	public boolean method5833(@OriginalArg(1) int arg0) {
		return (this.anInt7305 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
	public int method5834() {
		return Static535.method7286(this.anInt7305);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Z")
	public boolean method5836() {
		return (this.anInt7305 >> 22 & 0x1) != 0;
	}
}

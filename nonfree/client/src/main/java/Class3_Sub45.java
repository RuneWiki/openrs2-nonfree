import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	public final int anInt7653;

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
	public final int anInt7660;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(II)V")
	public Class3_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7653 = arg1;
		this.anInt7660 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)Z")
	public boolean method5979() {
		return (this.anInt7660 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)I")
	public int method5980() {
		return Static153.method2476(this.anInt7660);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)Z")
	public boolean method5982(@OriginalArg(0) int arg0) {
		return (this.anInt7660 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Z)I")
	public int method5984() {
		return this.anInt7660 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(Z)Z")
	public boolean method5985() {
		return (this.anInt7660 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Z")
	public boolean method5987() {
		return (this.anInt7660 >> 21 & 0x1) != 0;
	}
}

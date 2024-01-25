import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
	public final int anInt7661;

	@OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
	public final int anInt7657;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(II)V")
	public Class2_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7661 = arg0;
		this.anInt7657 = arg1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)I")
	public int method6403() {
		return this.anInt7661 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)Z")
	public boolean method6405() {
		return (this.anInt7661 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)Z")
	public boolean method6406() {
		return (this.anInt7661 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)Z")
	public boolean method6407(@OriginalArg(1) int arg0) {
		return (this.anInt7661 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)Z")
	public boolean method6408() {
		return (this.anInt7661 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(Z)I")
	public int method6409() {
		return Static111.method4493(this.anInt7661);
	}
}

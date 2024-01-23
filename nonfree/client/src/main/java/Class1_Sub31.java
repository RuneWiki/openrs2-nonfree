import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
	public int anInt5647;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
	public int anInt5641;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V")
	public Class1_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5647 = arg0;
		this.anInt5641 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)I")
	public int method4338() {
		return this.anInt5647 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)Z")
	public boolean method4340() {
		return (this.anInt5647 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)Z")
	public boolean method4342() {
		return (this.anInt5647 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)Z")
	public boolean method4344() {
		return (this.anInt5647 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)Z")
	public boolean method4345() {
		return (this.anInt5647 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)Z")
	public boolean method4346() {
		return (this.anInt5647 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)Z")
	public boolean method4347() {
		return (this.anInt5647 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)Z")
	public boolean method4348() {
		return (this.anInt5647 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)Z")
	public boolean method4350(@OriginalArg(1) int arg0) {
		return (this.anInt5647 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)I")
	public int method4351() {
		return Static263.method4059(this.anInt5647);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	public final int anInt507;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	public final int anInt508;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(II)V")
	public Class5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt507 = arg0;
		this.anInt508 = arg1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)Z")
	public boolean method453(@OriginalArg(0) int arg0) {
		return (this.anInt507 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Z")
	public boolean method454() {
		return (this.anInt507 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)I")
	public int method455() {
		return this.anInt507 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)Z")
	public boolean method456() {
		return (this.anInt507 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)I")
	public int method457() {
		return Static119.method2232(this.anInt507);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(B)Z")
	public boolean method460() {
		return (this.anInt507 & 0x1) != 0;
	}
}

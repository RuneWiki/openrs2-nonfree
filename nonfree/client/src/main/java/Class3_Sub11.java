import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
	public final int anInt1134;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
	public final int anInt1135;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(II)V")
	public Class3_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1134 = arg0;
		this.anInt1135 = arg1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I")
	public int method1185() {
		return this.anInt1134 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
	public boolean method1186() {
		return (this.anInt1134 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)Z")
	public boolean method1188(@OriginalArg(0) int arg0) {
		return (this.anInt1134 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)Z")
	public boolean method1189() {
		return (this.anInt1134 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "(B)Z")
	public boolean method1190() {
		return (this.anInt1134 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)I")
	public int method1191() {
		return Static554.method7814(this.anInt1134);
	}
}

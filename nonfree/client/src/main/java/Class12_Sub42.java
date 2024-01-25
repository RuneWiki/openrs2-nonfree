import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class12_Sub42 extends Class12 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	public final int anInt6901;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	public final int anInt6906;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
	public Class12_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6901 = arg0;
		this.anInt6906 = arg1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Z")
	public boolean method5777(@OriginalArg(0) int arg0) {
		return (this.anInt6901 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
	public boolean method5778() {
		return (this.anInt6901 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Z")
	public boolean method5779() {
		return (this.anInt6901 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
	public int method5780() {
		return Static231.method4125(this.anInt6901);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Z")
	public boolean method5781() {
		return (this.anInt6901 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)I")
	public int method5782() {
		return this.anInt6901 >> 18 & 0x7;
	}
}

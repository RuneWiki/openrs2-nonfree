import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class8_Sub34 extends Class8 {

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
	public final int anInt6421;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
	public final int anInt6429;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(II)V")
	public Class8_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6421 = arg0;
		this.anInt6429 = arg1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Z")
	public boolean method5215() {
		return (this.anInt6421 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	public int method5216() {
		return this.anInt6421 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Z")
	public boolean method5217() {
		return (this.anInt6421 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)I")
	public int method5219() {
		return Static528.method7470(this.anInt6421);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)Z")
	public boolean method5220(@OriginalArg(0) int arg0) {
		return (this.anInt6421 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "(I)Z")
	public boolean method5222() {
		return (this.anInt6421 >> 22 & 0x1) != 0;
	}
}

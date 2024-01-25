import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public final int anInt5881;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	public final int anInt5878;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(II)V")
	public Class4_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5881 = arg1;
		this.anInt5878 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Z")
	public boolean method4967(@OriginalArg(1) int arg0) {
		return (this.anInt5878 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
	public int method4968() {
		return this.anInt5878 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Z")
	public boolean method4970() {
		return (this.anInt5878 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)Z")
	public boolean method4971() {
		return (this.anInt5878 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)I")
	public int method4973() {
		return Static515.method7277(this.anInt5878);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Z")
	public boolean method4974() {
		return (this.anInt5878 & 0x1) != 0;
	}
}

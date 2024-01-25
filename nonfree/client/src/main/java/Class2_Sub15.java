import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	public final int anInt1899;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
	public final int anInt1904;

	static {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			aRectangleArray1[local7] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(II)V")
	public Class2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1899 = arg1;
		this.anInt1904 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Z")
	public boolean method1533() {
		return (this.anInt1904 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)I")
	public int method1535() {
		return this.anInt1904 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)Z")
	public boolean method1536(@OriginalArg(1) int arg0) {
		return (this.anInt1904 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z")
	public boolean method1537() {
		return (this.anInt1904 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)I")
	public int method1538() {
		return Static308.method4226(this.anInt1904);
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)Z")
	public boolean method1539() {
		return (this.anInt1904 >> 21 & 0x1) != 0;
	}
}

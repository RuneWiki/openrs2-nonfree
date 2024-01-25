import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
	public final int anInt1311;

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
	public final int anInt1310;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V")
	public Class1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1311 = arg0;
		this.anInt1310 = arg1;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)I")
	public int method1086() {
		return Static201.method5707(this.anInt1311);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Z")
	public boolean method1089() {
		return (this.anInt1311 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Z")
	public boolean method1090() {
		return (this.anInt1311 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)Z")
	public boolean method1092() {
		return (this.anInt1311 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
	public boolean method1093(@OriginalArg(1) int arg0) {
		return (this.anInt1311 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)Z")
	public boolean method1094() {
		return (this.anInt1311 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Z")
	public boolean method1095() {
		return (this.anInt1311 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "(I)I")
	public int method1097() {
		return this.anInt1311 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "(I)Z")
	public boolean method1098() {
		return (this.anInt1311 >> 30 & 0x1) != 0;
	}
}

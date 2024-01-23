import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	public int anInt1759;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	public int anInt1760;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(II)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1759 = arg0;
		this.anInt1760 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)Z")
	public boolean method1366(@OriginalArg(1) int arg0) {
		return (this.anInt1759 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z")
	public boolean method1367() {
		return (this.anInt1759 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)Z")
	public boolean method1368() {
		return (this.anInt1759 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Z")
	public boolean method1369() {
		return (this.anInt1759 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)I")
	public int method1370() {
		return this.anInt1759 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)Z")
	public boolean method1372() {
		return (this.anInt1759 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Z")
	public boolean method1373() {
		return (this.anInt1759 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(B)Z")
	public boolean method1374() {
		return (this.anInt1759 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)I")
	public int method1375() {
		return Static246.method3813(this.anInt1759);
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Z")
	public boolean method1376() {
		return (this.anInt1759 >> 21 & 0x1) != 0;
	}
}

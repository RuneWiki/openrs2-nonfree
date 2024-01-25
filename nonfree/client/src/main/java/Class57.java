import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class57 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	public int anInt1623;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	public int anInt1624;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	public int anInt1627;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	public int anInt1628;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
	public int anInt1629;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	public int anInt1631;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "Lclient!ds;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	public int anInt1633;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
	public int anInt1639;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
	public final int anInt1636;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	public final int anInt1635;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	public final int anInt1632;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
	public final int anInt1634;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIB)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte31 = arg4;
		this.anInt1636 = arg1;
		this.anInt1635 = arg3;
		this.anInt1632 = arg2;
		this.anInt1634 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ds;I)V")
	public Class57(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		this.aClass57_1 = arg0;
		this.anInt1636 = arg1 + this.aClass57_1.anInt1636;
		this.anInt1632 = arg1 + this.aClass57_1.anInt1632;
		this.anInt1635 = this.aClass57_1.anInt1635 + arg1;
		this.anInt1634 = this.aClass57_1.anInt1634;
		this.aByte31 = this.aClass57_1.aByte31;
	}
}

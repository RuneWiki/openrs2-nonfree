import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class50 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public int anInt1618;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	public int anInt1619;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public int anInt1622;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	public int anInt1623;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	public int anInt1624;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class50() {
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class50(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aByte8 = arg0.method1363();
		this.anInt1623 = arg0.method1386();
		this.anInt1624 = arg0.method1392();
		this.anInt1622 = arg0.method1392();
		this.anInt1619 = arg0.method1392();
		this.anInt1618 = arg0.method1392();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public int method1556() {
		return this.aByte8 & 0x7;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
	public int method1558() {
		return (this.aByte8 & 0x8) == 8 ? 1 : 0;
	}
}

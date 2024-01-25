import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!el", name = "i", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "J")
	public long aLong40;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public int anInt1567;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "Z")
	public boolean aBoolean138;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "Lclient!el;")
	public Class69_Sub1 aClass69_Sub1_1;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "I")
	public int anInt1571;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)I")
	@Override
	public int method1263() {
		return this.anInt1567;
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(I)I")
	@Override
	public int method1266() {
		return this.anInt1571;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(B)J")
	@Override
	public long method1262() {
		return this.aLong40;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)C")
	@Override
	public char method1261() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method1260() {
		return this.aBoolean138;
	}
}

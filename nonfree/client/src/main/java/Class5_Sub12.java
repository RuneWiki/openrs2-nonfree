import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class5_Sub12 extends Class5 implements Interface10 {

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	public int anInt1535;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	public int anInt1541;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	public int anInt1542;

	@OriginalMember(owner = "client!du", name = "x", descriptor = "J")
	public long aLong56;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)I")
	@Override
	public int method1251() {
		return this.anInt1541;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)I")
	@Override
	public int method1252() {
		return this.anInt1542;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(Z)I")
	@Override
	public int method1255() {
		return this.anInt1535;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)C")
	@Override
	public char method1253() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)J")
	@Override
	public long method1254() {
		return this.aLong56;
	}
}

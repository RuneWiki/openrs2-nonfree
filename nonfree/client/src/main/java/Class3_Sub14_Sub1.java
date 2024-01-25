import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class3_Sub14_Sub1 extends Class3_Sub14 {

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "J")
	public long aLong66;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	public int anInt1309;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	public int anInt1310;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
	public int anInt1312;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	public int anInt1314;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)J")
	@Override
	public long method4297() {
		return this.aLong66;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)I")
	@Override
	public int method4298() {
		return this.anInt1309;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)I")
	@Override
	public int method4294() {
		return this.anInt1312;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I")
	@Override
	public int method4292() {
		return this.anInt1310;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	@Override
	public int method4295() {
		return this.anInt1314;
	}
}

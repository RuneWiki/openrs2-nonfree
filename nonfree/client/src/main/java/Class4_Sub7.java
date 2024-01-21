import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	public int anInt1493;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	public int anInt1494;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	public int anInt1495;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt1498;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt1499;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
	public int anInt1501;

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "Lclient!oc;")
	public Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "Lclient!j;")
	public Class4_Sub2_Sub10 aClass4_Sub2_Sub10_1;

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
	public int anInt1503;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Lclient!oc;")
	public Class4_Sub1_Sub4 aClass4_Sub1_Sub4_2;

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
	public int anInt1505;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
	public int anInt1506;

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
	public int anInt1507;

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method980() {
		@Pc(6) int local6 = this.anInt1493;
		@Pc(11) Class4_Sub2_Sub10 local11 = this.aClass4_Sub2_Sub10_1.method925();
		if (local11 == null) {
			this.anIntArray149 = null;
			this.anInt1493 = -1;
			this.anInt1507 = 0;
			this.anInt1495 = 0;
			this.anInt1501 = 0;
		} else {
			this.anIntArray149 = local11.anIntArray147;
			this.anInt1495 = local11.anInt1409;
			this.anInt1493 = local11.anInt1427;
			this.anInt1501 = local11.anInt1425 * 128;
			this.anInt1507 = local11.anInt1391;
		}
		if (local6 != this.anInt1493 && this.aClass4_Sub1_Sub4_2 != null) {
			Static85.aClass4_Sub1_Sub2_2.method363(this.aClass4_Sub1_Sub4_2);
			this.aClass4_Sub1_Sub4_2 = null;
		}
	}
}

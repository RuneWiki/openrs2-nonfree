import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class7_Sub13 extends Class7 {

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public int anInt1391;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
	public int anInt1392;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!pf;")
	public Class189 aClass189_1;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!sr;")
	public Class26_Sub2_Sub4_Sub1 aClass26_Sub2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!td;")
	public Class7_Sub8_Sub4 aClass7_Sub8_Sub4_2;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	public int anInt1393;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	public int anInt1394;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
	public int anInt1395;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "Lclient!td;")
	public Class7_Sub8_Sub4 aClass7_Sub8_Sub4_3;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
	public int anInt1400;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
	public int anInt1401;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
	public int anInt1402;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "Z")
	public boolean aBoolean86;

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
	public int anInt1404;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "Lclient!vi;")
	public Class26_Sub2_Sub4_Sub2 aClass26_Sub2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	public int anInt1396 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public void method1199() {
		@Pc(13) int local13 = this.anInt1404;
		if (this.aClass189_1 != null) {
			@Pc(22) Class189 local22 = this.aClass189_1.method4038(Static224.aClass239_7);
			if (local22 == null) {
				this.anInt1392 = 0;
				this.anInt1394 = 0;
				this.anInt1401 = 0;
				this.anInt1400 = 0;
				this.anInt1404 = -1;
				this.anIntArray104 = null;
			} else {
				this.anInt1394 = local22.anInt5108;
				this.anInt1400 = local22.anInt5092;
				this.anInt1392 = local22.anInt5075;
				this.anIntArray104 = local22.anIntArray450;
				this.anInt1404 = local22.anInt5105;
				this.anInt1401 = local22.anInt5060 << 7;
			}
		} else if (this.aClass26_Sub2_Sub4_Sub1_1 != null) {
			@Pc(105) int local105 = Static27.method306(this.aClass26_Sub2_Sub4_Sub1_1);
			if (local13 != local105) {
				this.anInt1404 = local105;
				@Pc(115) Class249 local115 = this.aClass26_Sub2_Sub4_Sub1_1.aClass249_1;
				if (local115.anIntArray579 != null) {
					local115 = local115.method5179(Static224.aClass239_7);
				}
				if (local115 == null) {
					this.anInt1394 = this.anInt1401 = 0;
				} else {
					this.anInt1394 = local115.anInt6528;
					this.anInt1401 = local115.anInt6524 << 7;
				}
			}
		} else if (this.aClass26_Sub2_Sub4_Sub2_1 != null) {
			this.anInt1404 = Static362.method4647(this.aClass26_Sub2_Sub4_Sub2_1);
			this.anInt1401 = this.aClass26_Sub2_Sub4_Sub2_1.anInt7126 << 7;
			this.anInt1394 = this.aClass26_Sub2_Sub4_Sub2_1.anInt7122;
		}
		if (local13 != this.anInt1404 && this.aClass7_Sub8_Sub4_3 != null) {
			Static452.aClass7_Sub8_Sub1_2.method2428(this.aClass7_Sub8_Sub4_3);
			this.aClass7_Sub8_Sub4_3 = null;
		}
	}
}

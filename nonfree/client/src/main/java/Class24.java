import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class24 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "F")
	public float aFloat2 = 0.25F;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "F")
	public float aFloat6 = 1.0F;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "F")
	public float aFloat7 = 1.0F;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
	public float aFloat3;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "F")
	public float aFloat4;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!bn;")
	public Class8_Sub1_Sub3 aClass8_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class24() {
		this.anInt775 = Static233.anInt4709;
		this.aFloat3 = 0.69921875F;
		this.anInt767 = 0;
		this.anInt768 = -60;
		this.anInt774 = -50;
		this.aFloat4 = 1.2F;
		this.aFloat5 = 1.1523438F;
		this.anInt776 = -50;
		this.anInt766 = Static233.anInt4710;
		if (Static234.anIntArray353 != null) {
			this.aClass8_Sub1_Sub3_1 = Static29.method488(Static234.anIntArray353[0], Static234.anIntArray353[1], Static234.anIntArray353[2], Static234.anIntArray353[3], Static234.anIntArray353[4], Static234.anIntArray353[5]);
		}
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class24(@OriginalArg(0) Class8_Sub2 arg0) {
		@Pc(16) int local16 = arg0.method2334();
		if ((local16 & 0x1) == 0) {
			this.anInt766 = Static233.anInt4710;
		} else {
			this.anInt766 = arg0.method2352();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat5 = 1.1523438F;
		} else {
			this.aFloat5 = (float) arg0.method2375() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat3 = 0.69921875F;
		} else {
			this.aFloat3 = (float) arg0.method2375() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat4 = 1.2F;
		} else {
			this.aFloat4 = (float) arg0.method2375() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt774 = -50;
			this.anInt776 = -50;
			this.anInt768 = -60;
		} else {
			this.anInt776 = arg0.method2360();
			this.anInt768 = arg0.method2360();
			this.anInt774 = arg0.method2360();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt775 = Static233.anInt4709;
		} else {
			this.anInt775 = arg0.method2352();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt767 = 0;
		} else {
			this.anInt767 = arg0.method2375();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass8_Sub1_Sub3_1 = Static29.method488(arg0.method2375(), arg0.method2375(), arg0.method2375(), arg0.method2375(), arg0.method2375(), arg0.method2375());
		} else if (Static234.anIntArray353 != null) {
			this.aClass8_Sub1_Sub3_1 = Static29.method488(Static234.anIntArray353[0], Static234.anIntArray353[1], Static234.anIntArray353[2], Static234.anIntArray353[3], Static234.anIntArray353[4], Static234.anIntArray353[5]);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!aj;)V")
	public void method534(@OriginalArg(1) Class8_Sub2 arg0) {
		this.aFloat7 = (float) (arg0.method2334() * 8) / 255.0F;
		this.aFloat2 = (float) (arg0.method2334() * 8) / 255.0F;
		this.aFloat6 = (float) (arg0.method2334() * 8) / 255.0F;
	}
}

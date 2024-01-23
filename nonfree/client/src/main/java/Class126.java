import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class126 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "F")
	public float aFloat110 = 0.25F;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "F")
	public float aFloat111 = 1.0F;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "F")
	public float aFloat112 = 1.0F;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
	public int anInt3821;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public int anInt3818;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public int anInt3816;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	public int anInt3823;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	public int anInt3814;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public int anInt3815;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!ti;")
	public Class1_Sub2_Sub20 aClass1_Sub2_Sub20_5;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class126() {
		this.anInt3821 = -50;
		this.anInt3818 = 0;
		this.aFloat109 = 1.1523438F;
		this.aFloat113 = 0.69921875F;
		this.anInt3816 = Static283.anInt5101;
		this.anInt3823 = -50;
		this.anInt3814 = Static283.anInt5100;
		this.anInt3815 = -60;
		this.aFloat114 = 1.2F;
		if (Static224.anIntArray349 != null) {
			this.aClass1_Sub2_Sub20_5 = Static271.method4231(Static224.anIntArray349[0], Static224.anIntArray349[1], Static224.anIntArray349[2], Static224.anIntArray349[3], Static224.anIntArray349[4], Static224.anIntArray349[5]);
		}
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class126(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(16) int local16 = arg0.method1378();
		if ((local16 & 0x1) == 0) {
			this.anInt3816 = Static283.anInt5101;
		} else {
			this.anInt3816 = arg0.method1392();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat109 = 1.1523438F;
		} else {
			this.aFloat109 = (float) arg0.method1386() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat113 = 0.69921875F;
		} else {
			this.aFloat113 = (float) arg0.method1386() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat114 = 1.2F;
		} else {
			this.aFloat114 = (float) arg0.method1386() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3823 = -50;
			this.anInt3821 = -50;
			this.anInt3815 = -60;
		} else {
			this.anInt3823 = arg0.method1356();
			this.anInt3815 = arg0.method1356();
			this.anInt3821 = arg0.method1356();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3814 = Static283.anInt5100;
		} else {
			this.anInt3814 = arg0.method1392();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3818 = 0;
		} else {
			this.anInt3818 = arg0.method1386();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass1_Sub2_Sub20_5 = Static271.method4231(arg0.method1386(), arg0.method1386(), arg0.method1386(), arg0.method1386(), arg0.method1386(), arg0.method1386());
		} else if (Static224.anIntArray349 != null) {
			this.aClass1_Sub2_Sub20_5 = Static271.method4231(Static224.anIntArray349[0], Static224.anIntArray349[1], Static224.anIntArray349[2], Static224.anIntArray349[3], Static224.anIntArray349[4], Static224.anIntArray349[5]);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!lf;)V")
	public void method3203(@OriginalArg(1) Class1_Sub14 arg0) {
		this.aFloat111 = (float) (arg0.method1378() * 8) / 255.0F;
		this.aFloat110 = (float) (arg0.method1378() * 8) / 255.0F;
		this.aFloat112 = (float) (arg0.method1378() * 8) / 255.0F;
	}
}

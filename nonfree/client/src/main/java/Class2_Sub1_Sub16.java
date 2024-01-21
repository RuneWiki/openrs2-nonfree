import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "[I")
	public int[] anIntArray349;

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
	public int anInt2933;

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "[I")
	public int[] anIntArray350;

	@OriginalMember(owner = "client!vf", name = "cb", descriptor = "[Lclient!je;")
	public Class40[] aClass40Array23;

	@OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
	public int anInt2938;

	@OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
	public int anInt2939;

	@OriginalMember(owner = "client!vf", name = "ab", descriptor = "Lclient!je;")
	public Class40 aClass40_1593 = Static124.aClass40_1560;

	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
	public int anInt2935 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!na;)V")
	public void method2105(@OriginalArg(1) Class2_Sub9 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method640();
			if (local10 == 0) {
				return;
			}
			this.method2107(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!na;I)V")
	private void method2107(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt2939 = arg1.method640();
		} else if (arg0 == 2) {
			this.anInt2938 = arg1.method640();
		} else if (arg0 == 3) {
			this.aClass40_1593 = arg1.method625();
		} else if (arg0 == 4) {
			this.anInt2933 = arg1.method622();
			return;
		} else {
			@Pc(57) int local57;
			if (arg0 == 5) {
				this.anInt2935 = arg1.method632();
				this.anIntArray350 = new int[this.anInt2935];
				this.aClass40Array23 = new Class40[this.anInt2935];
				for (local57 = 0; local57 < this.anInt2935; local57++) {
					this.anIntArray350[local57] = arg1.method622();
					this.aClass40Array23[local57] = arg1.method625();
				}
				return;
			}
			if (arg0 == 6) {
				this.anInt2935 = arg1.method632();
				this.anIntArray350 = new int[this.anInt2935];
				this.anIntArray349 = new int[this.anInt2935];
				for (local57 = 0; local57 < this.anInt2935; local57++) {
					this.anIntArray350[local57] = arg1.method622();
					this.anIntArray349[local57] = arg1.method622();
				}
				return;
			}
		}
	}
}

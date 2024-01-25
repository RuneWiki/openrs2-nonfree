import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt701 = 0;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	private int anInt696 = 0;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	private int anInt695 = 0;

	static {
		new Class142("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
	private void method651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg2 * (arg1 + 4096) >> 12;
		if (local27 <= 0) {
			this.anInt698 = this.anInt694 = this.anInt697 = arg2;
			return;
		}
		@Pc(44) int local44 = arg0 * 6;
		@Pc(52) int local52 = arg2 + arg2 - local27;
		@Pc(61) int local61 = (local27 - local52 << 12) / local27;
		@Pc(65) int local65 = local44 >> 12;
		@Pc(72) int local72 = local44 - (local65 << 12);
		@Pc(80) int local80 = local61 * local27 >> 12;
		@Pc(86) int local86 = local80 * local72 >> 12;
		@Pc(90) int local90 = local86 + local52;
		@Pc(95) int local95 = local27 - local86;
		if (local65 == 0) {
			this.anInt694 = local90;
			this.anInt697 = local52;
			this.anInt698 = local27;
		} else if (local65 == 1) {
			this.anInt698 = local95;
			this.anInt694 = local27;
			this.anInt697 = local52;
		} else if (local65 == 2) {
			this.anInt697 = local90;
			this.anInt694 = local27;
			this.anInt698 = local52;
		} else if (local65 == 3) {
			this.anInt697 = local27;
			this.anInt698 = local52;
			this.anInt694 = local95;
		} else if (local65 == 4) {
			this.anInt698 = local90;
			this.anInt694 = local52;
			this.anInt697 = local27;
		} else if (local65 == 5) {
			this.anInt698 = local27;
			this.anInt694 = local52;
			this.anInt697 = local95;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(26) int[][] local26 = this.method5968(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static218.anInt3990; local52++) {
				this.method654(local30[local52], local34[local52], local38[local52]);
				this.anInt706 += this.anInt696;
				this.anInt702 += this.anInt701;
				for (this.anInt707 += this.anInt695; this.anInt707 < 0; this.anInt707 += 4096) {
				}
				while (this.anInt707 > 4096) {
					this.anInt707 -= 4096;
				}
				if (this.anInt702 < 0) {
					this.anInt702 = 0;
				}
				if (this.anInt702 > 4096) {
					this.anInt702 = 4096;
				}
				if (this.anInt706 < 0) {
					this.anInt706 = 0;
				}
				if (this.anInt706 > 4096) {
					this.anInt706 = 4096;
				}
				this.method651(this.anInt707, this.anInt702, this.anInt706);
				local42[local52] = this.anInt698;
				local46[local52] = this.anInt694;
				local50[local52] = this.anInt697;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)V")
	private void method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 <= arg1 ? arg1 : arg0;
		@Pc(23) int local23 = arg2 <= local12 ? local12 : arg2;
		@Pc(30) int local30 = arg0 >= arg1 ? arg1 : arg0;
		@Pc(37) int local37 = arg2 < local30 ? arg2 : local30;
		@Pc(41) int local41 = local23 - local37;
		this.anInt706 = (local23 + local37) / 2;
		if (this.anInt706 > 0 && this.anInt706 < 4096) {
			this.anInt702 = (local41 << 12) / (this.anInt706 <= 2048 ? this.anInt706 * 2 : 8192 - this.anInt706 * 2);
		} else {
			this.anInt702 = 0;
		}
		if (local41 <= 0) {
			this.anInt707 = 0;
			return;
		}
		@Pc(107) int local107 = (local23 - arg0 << 12) / local41;
		@Pc(116) int local116 = (local23 - arg1 << 12) / local41;
		@Pc(125) int local125 = (local23 - arg2 << 12) / local41;
		if (arg0 == local23) {
			this.anInt707 = local37 == arg1 ? local125 + 20480 : -local116 + 4096;
		} else if (local23 == arg1) {
			this.anInt707 = local37 == arg2 ? local107 + 4096 : 12288 - local125;
		} else {
			this.anInt707 = local37 == arg0 ? local116 + 12288 : 20480 - local107;
		}
		this.anInt707 /= 6;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt695 = arg0.method2929();
		} else if (arg1 == 1) {
			this.anInt701 = (arg0.method2917() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt696 = (arg0.method2917() << 12) / 100;
		}
	}
}

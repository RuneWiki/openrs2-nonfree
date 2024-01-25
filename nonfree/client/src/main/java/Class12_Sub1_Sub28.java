import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class12_Sub1_Sub28 extends Class12_Sub1 {

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
	private int anInt7925;

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
	private int anInt7927;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
	private int anInt7928;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
	private int anInt7930;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
	private int anInt7933;

	@OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
	private int anInt7937;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	private int anInt7921 = 0;

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
	private int anInt7929 = 0;

	@OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
	private int anInt7932 = 0;

	static {
		new Class88("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(26) int[][] local26 = this.method7790(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static357.anInt6670; local52++) {
				this.method6574(local38[local52], local30[local52], local34[local52]);
				this.anInt7927 += this.anInt7932;
				this.anInt7937 += this.anInt7921;
				this.anInt7928 += this.anInt7929;
				while (this.anInt7937 < 0) {
					this.anInt7937 += 4096;
				}
				while (this.anInt7937 > 4096) {
					this.anInt7937 -= 4096;
				}
				if (this.anInt7927 < 0) {
					this.anInt7927 = 0;
				}
				if (this.anInt7928 < 0) {
					this.anInt7928 = 0;
				}
				if (this.anInt7927 > 4096) {
					this.anInt7927 = 4096;
				}
				if (this.anInt7928 > 4096) {
					this.anInt7928 = 4096;
				}
				this.method6578(this.anInt7927, this.anInt7928, this.anInt7937);
				local42[local52] = this.anInt7933;
				local46[local52] = this.anInt7930;
				local50[local52] = this.anInt7925;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZI)V")
	private void method6574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 <= arg2 ? arg2 : arg1;
		@Pc(31) int local31 = arg1 < arg2 ? arg1 : arg2;
		@Pc(38) int local38 = arg0 > local12 ? arg0 : local12;
		@Pc(49) int local49 = arg0 >= local31 ? local31 : arg0;
		this.anInt7928 = (local38 + local49) / 2;
		@Pc(61) int local61 = local38 - local49;
		if (this.anInt7928 > 0 && this.anInt7928 < 4096) {
			this.anInt7927 = (local61 << 12) / (this.anInt7928 > 2048 ? 8192 - this.anInt7928 * 2 : this.anInt7928 * 2);
		} else {
			this.anInt7927 = 0;
		}
		if (local61 <= 0) {
			this.anInt7937 = 0;
			return;
		}
		@Pc(107) int local107 = (local38 - arg1 << 12) / local61;
		@Pc(116) int local116 = (local38 - arg2 << 12) / local61;
		@Pc(125) int local125 = (local38 - arg0 << 12) / local61;
		if (local38 == arg1) {
			this.anInt7937 = local49 == arg2 ? local125 + 20480 : -local116 + 4096;
		} else if (arg2 == local38) {
			this.anInt7937 = local49 == arg0 ? local107 + 4096 : -local125 + 12288;
		} else {
			this.anInt7937 = local49 == arg1 ? local116 + 12288 : -local107 + 20480;
		}
		this.anInt7937 /= 6;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7921 = arg0.method5217();
		} else if (arg1 == 1) {
			this.anInt7932 = (arg0.method5173() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt7929 = (arg0.method5173() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
	private void method6578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(32) int local32 = arg1 > 2048 ? arg1 + arg0 - (arg0 * arg1 >> 12) : (arg0 + 4096) * arg1 >> 12;
		if (local32 <= 0) {
			this.anInt7933 = this.anInt7930 = this.anInt7925 = arg1;
			return;
		}
		@Pc(41) int local41 = arg2 * 6;
		@Pc(48) int local48 = arg1 + arg1 - local32;
		@Pc(56) int local56 = (local32 - local48 << 12) / local32;
		@Pc(60) int local60 = local41 >> 12;
		@Pc(67) int local67 = local41 - (local60 << 12);
		@Pc(75) int local75 = local32 * local56 >> 12;
		@Pc(81) int local81 = local75 * local67 >> 12;
		@Pc(85) int local85 = local81 + local48;
		@Pc(90) int local90 = local32 - local81;
		if (local60 == 0) {
			this.anInt7933 = local32;
			this.anInt7930 = local85;
			this.anInt7925 = local48;
			return;
		}
		if (local60 == 1) {
			this.anInt7933 = local90;
			this.anInt7930 = local32;
			this.anInt7925 = local48;
			return;
		}
		if (local60 == 2) {
			this.anInt7933 = local48;
			this.anInt7930 = local32;
			this.anInt7925 = local85;
			return;
		}
		if (local60 == 3) {
			this.anInt7930 = local90;
			this.anInt7925 = local32;
			this.anInt7933 = local48;
			return;
		}
		if (local60 == 4) {
			this.anInt7925 = local32;
			this.anInt7930 = local48;
			this.anInt7933 = local85;
			return;
		}
		if (local60 == 5) {
			this.anInt7925 = local90;
			this.anInt7933 = local32;
			this.anInt7930 = local48;
			return;
		}
	}
}

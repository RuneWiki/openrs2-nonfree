import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
	private int anInt5444 = 1;

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
	private int anInt5447 = 204;

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
	private int anInt5445 = 1;

	static {
		new Class189("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5444 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt5445 = arg0.method2582();
		} else if (arg1 == 2) {
			this.anInt5447 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			for (@Pc(21) int local21 = 0; local21 < Static406.anInt6694; local21++) {
				@Pc(27) int local27 = Static86.anIntArray125[local21];
				@Pc(31) int local31 = Static441.anIntArray522[arg0];
				@Pc(38) int local38 = this.anInt5444 * local27 >> 12;
				@Pc(45) int local45 = local31 * this.anInt5445 >> 12;
				@Pc(55) int local55 = local27 % (4096 / this.anInt5444) * this.anInt5444;
				@Pc(65) int local65 = this.anInt5445 * (local31 % (4096 / this.anInt5445));
				if (this.anInt5447 > local65) {
					for (local38 -= local45; local38 < 0; local38 += 4) {
					}
					while (local38 > 3) {
						local38 -= 4;
					}
					if (local38 != 1) {
						local15[local21] = 0;
						continue;
					}
					if (this.anInt5447 > local55) {
						local15[local21] = 0;
						continue;
					}
				}
				if (this.anInt5447 > local55) {
					for (local38 -= local45; local38 < 0; local38 += 4) {
					}
					while (local38 > 3) {
						local38 -= 4;
					}
					if (local38 > 0) {
						local15[local21] = 0;
						continue;
					}
				}
				local15[local21] = 4096;
			}
		}
		return local15;
	}
}

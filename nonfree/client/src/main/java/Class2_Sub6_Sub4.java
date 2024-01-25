import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class2_Sub6_Sub4 extends Class2_Sub6 {

	@OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
	private int anInt1809 = 1;

	@OriginalMember(owner = "client!dfa", name = "L", descriptor = "I")
	private int anInt1812 = 204;

	@OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
	private int anInt1813 = 1;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt1813 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt1809 = arg1.method8547();
		} else if (arg0 == 2) {
			this.anInt1812 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			for (@Pc(25) int local25 = 0; local25 < Static51.anInt1085; local25++) {
				@Pc(31) int local31 = Static586.anIntArray653[local25];
				@Pc(35) int local35 = Static564.anIntArray630[arg0];
				@Pc(42) int local42 = this.anInt1813 * local31 >> 12;
				@Pc(49) int local49 = local35 * this.anInt1809 >> 12;
				@Pc(59) int local59 = local31 % (4096 / this.anInt1813) * this.anInt1813;
				@Pc(69) int local69 = this.anInt1809 * (local35 % (4096 / this.anInt1809));
				if (local69 < this.anInt1812) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (local59 < this.anInt1812) {
						local19[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt1812) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}
}

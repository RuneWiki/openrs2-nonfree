import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class14_Sub7_Sub26 extends Class14_Sub7 {

	@OriginalMember(owner = "client!nja", name = "O", descriptor = "I")
	private int anInt7092 = 1;

	@OriginalMember(owner = "client!nja", name = "S", descriptor = "I")
	private int anInt7095 = 204;

	@OriginalMember(owner = "client!nja", name = "Q", descriptor = "I")
	private int anInt7099 = 1;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			for (@Pc(24) int local24 = 0; local24 < Static613.anInt10114; local24++) {
				@Pc(30) int local30 = Static588.anIntArray506[local24];
				@Pc(34) int local34 = Static655.anIntArray573[arg0];
				@Pc(41) int local41 = this.anInt7092 * local30 >> 12;
				@Pc(48) int local48 = local34 * this.anInt7099 >> 12;
				@Pc(58) int local58 = local30 % (4096 / this.anInt7092) * this.anInt7092;
				@Pc(68) int local68 = this.anInt7099 * (local34 % (4096 / this.anInt7099));
				if (local68 < this.anInt7095) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 != 1) {
						local11[local24] = 0;
						continue;
					}
					if (local58 < this.anInt7095) {
						local11[local24] = 0;
						continue;
					}
				}
				if (this.anInt7095 > local58) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 > 0) {
						local11[local24] = 0;
						continue;
					}
				}
				local11[local24] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt7092 = arg1.method7695(106);
		} else if (arg0 == 1) {
			this.anInt7099 = arg1.method7695(97);
		} else if (arg0 == 2) {
			this.anInt7095 = arg1.method7717(-1978450544);
		}
	}
}

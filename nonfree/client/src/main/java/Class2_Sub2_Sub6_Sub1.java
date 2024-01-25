import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class2_Sub2_Sub6_Sub1 extends Class2_Sub2_Sub6 {

	static {
		new Class209("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375 && this.method1321()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(47) int local47 = super.anInt1556 * (arg0 % super.anInt1556);
			for (@Pc(49) int local49 = 0; local49 < Static429.anInt6518; local49++) {
				@Pc(62) int local62 = super.anIntArray133[local47 + local49 % super.anInt1552];
				local39[local49] = (local62 & 0xFF) << 4;
				local35[local49] = local62 >> 4 & 0xFF0;
				local31[local49] = local62 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}

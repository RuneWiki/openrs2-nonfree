import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
	private int anInt1505 = 4096;

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
	private int anInt1506 = 0;

	static {
		new Class62("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(27) int[][] local27 = this.method6061(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static391.anInt7118; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local39[local53];
				if (this.anInt1506 > local59) {
					local43[local53] = this.anInt1506;
				} else if (local59 <= this.anInt1505) {
					local43[local53] = local59;
				} else {
					local43[local53] = this.anInt1505;
				}
				if (this.anInt1506 > local63) {
					local47[local53] = this.anInt1506;
				} else if (local63 > this.anInt1505) {
					local47[local53] = this.anInt1505;
				} else {
					local47[local53] = local63;
				}
				if (local67 < this.anInt1506) {
					local51[local53] = this.anInt1506;
				} else if (this.anInt1505 < local67) {
					local51[local53] = this.anInt1505;
				} else {
					local51[local53] = local67;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1506 = arg1.method5753();
		} else if (arg0 == 1) {
			this.anInt1505 = arg1.method5753();
		} else if (arg0 == 2) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(21) int[] local21 = this.method6069(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static391.anInt7118; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt1506 > local29) {
					local11[local23] = this.anInt1506;
				} else if (local29 <= this.anInt1505) {
					local11[local23] = local29;
				} else {
					local11[local23] = this.anInt1505;
				}
			}
		}
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class3_Sub2_Sub38 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vv", name = "J", descriptor = "[Lclient!ev;")
	private Class71[] aClass71Array1;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[[I)V")
	private void method5768(@OriginalArg(1) int[][] arg0) {
		@Pc(11) int local11 = Static406.anInt6694;
		@Pc(13) int local13 = Static286.anInt1445;
		Static187.method2988(arg0);
		Static200.method3064(Static350.anInt3654, Static5.anInt72);
		if (this.aClass71Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass71Array1.length; local29++) {
			@Pc(36) Class71 local36 = this.aClass71Array1[local29];
			@Pc(39) int local39 = local36.anInt6815;
			@Pc(42) int local42 = local36.anInt6816;
			if (local39 >= 0) {
				if (local42 < 0) {
					local36.method5331(local13, local11);
				} else {
					local36.method5334(local11, local13);
				}
			} else if (local42 >= 0) {
				local36.method5333(local11, local13);
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass71Array1 = new Class71[arg0.method2582()];
			for (@Pc(38) int local38 = 0; local38 < this.aClass71Array1.length; local38++) {
				@Pc(44) int local44 = arg0.method2582();
				if (local44 == 0) {
					this.aClass71Array1[local38] = Static222.method3353(arg0);
				} else if (local44 == 1) {
					this.aClass71Array1[local38] = Static46.method861(arg0);
				} else if (local44 == 2) {
					this.aClass71Array1[local38] = Static217.method3301(arg0);
				} else if (local44 == 3) {
					this.aClass71Array1[local38] = Static268.method3864(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean650 = arg0.method2582() == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			this.method5768(super.aClass62_41.method1669());
		}
		return local9;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(22) int local22 = Static406.anInt6694;
			@Pc(24) int local24 = Static286.anInt1445;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass249_41.method5301();
			this.method5768(local28);
			for (@Pc(39) int local39 = 0; local39 < Static286.anInt1445; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static406.anInt6694; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}

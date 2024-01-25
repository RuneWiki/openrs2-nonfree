import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "[Lclient!uj;")
	public static final Class242[] aClass242Array1 = new Class242[5];

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "[Lclient!vu;")
	private Class9[] aClass9Array1;

	static {
		for (@Pc(16) int local16 = 0; local16 < aClass242Array1.length; local16++) {
			aClass242Array1[local16] = new Class242();
		}
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass9Array1 = new Class9[arg0.method4548()];
			for (@Pc(39) int local39 = 0; local39 < this.aClass9Array1.length; local39++) {
				@Pc(45) int local45 = arg0.method4548();
				if (local45 == 0) {
					this.aClass9Array1[local39] = Static300.method4101(arg0);
				} else if (local45 == 1) {
					this.aClass9Array1[local39] = Static38.method504(arg0);
				} else if (local45 == 2) {
					this.aClass9Array1[local39] = Static58.method890(arg0);
				} else if (local45 == 3) {
					this.aClass9Array1[local39] = Static184.method2955(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean645 = arg0.method4548() == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(22) int local22 = Static410.anInt7198;
			@Pc(24) int local24 = Static214.anInt6457;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass190_41.method4097();
			this.method2303(local28);
			for (@Pc(39) int local39 = 0; local39 < Static214.anInt6457; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static410.anInt7198; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			this.method2303(super.aClass264_41.method5971());
		}
		return local17;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[[I)V")
	private void method2303(@OriginalArg(1) int[][] arg0) {
		@Pc(11) int local11 = Static410.anInt7198;
		@Pc(13) int local13 = Static214.anInt6457;
		Static353.method5058(arg0);
		Static347.method4989(Static301.anInt5026, Static421.anInt7373);
		if (this.aClass9Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass9Array1.length; local27++) {
			@Pc(34) Class9 local34 = this.aClass9Array1[local27];
			@Pc(37) int local37 = local34.anInt6015;
			@Pc(40) int local40 = local34.anInt6017;
			if (local37 >= 0) {
				if (local40 < 0) {
					local34.method4773(local13, local11);
				} else {
					local34.method4772(local11, local13);
				}
			} else if (local40 >= 0) {
				local34.method4774(local11, local13);
			}
		}
	}
}

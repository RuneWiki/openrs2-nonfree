import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class2_Sub2_Sub39 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wv", name = "K", descriptor = "Z")
	private boolean aBoolean519 = true;

	@OriginalMember(owner = "client!wv", name = "S", descriptor = "I")
	private int anInt7777 = 4096;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(27) int[] local27 = this.method6266(0, Static71.anInt1203 & arg0 - 1);
			@Pc(35) int[] local35 = this.method6266(0, arg0);
			@Pc(45) int[] local45 = this.method6266(0, arg0 + 1 & Static71.anInt1203);
			@Pc(49) int[] local49 = local13[0];
			@Pc(53) int[] local53 = local13[1];
			@Pc(57) int[] local57 = local13[2];
			for (@Pc(59) int local59 = 0; local59 < Static398.anInt6955; local59++) {
				@Pc(73) int local73 = (local45[local59] - local27[local59]) * this.anInt7777;
				@Pc(93) int local93 = (local35[Static210.anInt3600 & local59 + 1] - local35[local59 - 1 & Static210.anInt3600]) * this.anInt7777;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(135) int local135;
				@Pc(131) int local131;
				if (local127 == 0) {
					local131 = 0;
					local133 = 0;
					local135 = 0;
				} else {
					local131 = 16777216 / local127;
					local133 = local93 / local127;
					local135 = local73 / local127;
				}
				if (this.aBoolean519) {
					local131 = (local131 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
				}
				local49[local59] = local133;
				local53[local59] = local135;
				local57[local59] = local131;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7777 = arg0.method6148();
		} else if (arg1 == 1) {
			this.aBoolean519 = arg0.method6138() == 1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class4_Sub6_Sub37 extends Class4_Sub6 {

	@OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
	private int anInt7001 = 4096;

	@OriginalMember(owner = "client!vk", name = "K", descriptor = "Z")
	private boolean aBoolean658 = true;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt7001 = arg1.method2536();
		} else if (arg0 == 1) {
			this.aBoolean658 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(30) int[] local30 = this.method5508(Static211.anInt3929 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method5508(arg0, 0);
			@Pc(46) int[] local46 = this.method5508(Static211.anInt3929 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static80.anInt1616; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt7001;
				@Pc(92) int local92 = (local36[local60 + 1 & Static203.anInt3883] - local36[Static203.anInt3883 & local60 - 1]) * this.anInt7001;
				@Pc(96) int local96 = local92 >> 12;
				@Pc(100) int local100 = local73 >> 12;
				@Pc(106) int local106 = local96 * local96 >> 12;
				@Pc(112) int local112 = local100 * local100 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local106 + local112 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(131) int local131;
				@Pc(135) int local135;
				if (local127 == 0) {
					local131 = 0;
					local133 = 0;
					local135 = 0;
				} else {
					local131 = local73 / local127;
					local133 = local92 / local127;
					local135 = 16777216 / local127;
				}
				if (this.aBoolean658) {
					local135 = (local135 >> 1) + 2048;
					local131 = (local131 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
				}
				local50[local60] = local133;
				local54[local60] = local131;
				local58[local60] = local135;
			}
		}
		return local11;
	}
}

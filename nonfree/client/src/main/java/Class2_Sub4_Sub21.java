import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class2_Sub4_Sub21 extends Class2_Sub4 {

	@OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
	private int anInt6109 = 4096;

	@OriginalMember(owner = "client!nl", name = "H", descriptor = "Z")
	private boolean aBoolean478 = true;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(27) int[] local27 = this.method7568(arg0 - 1 & Static407.anInt6676, 0);
			@Pc(33) int[] local33 = this.method7568(arg0, 0);
			@Pc(43) int[] local43 = this.method7568(arg0 + 1 & Static407.anInt6676, 0);
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static143.anInt7434; local57++) {
				@Pc(71) int local71 = (local43[local57] - local27[local57]) * this.anInt6109;
				@Pc(91) int local91 = (local33[local57 + 1 & Static464.anInt7427] - local33[local57 - 1 & Static464.anInt7427]) * this.anInt6109;
				@Pc(95) int local95 = local91 >> 12;
				@Pc(99) int local99 = local71 >> 12;
				@Pc(105) int local105 = local95 * local95 >> 12;
				@Pc(111) int local111 = local99 * local99 >> 12;
				@Pc(125) int local125 = (int) (Math.sqrt((double) ((float) (local111 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129;
				@Pc(133) int local133;
				@Pc(131) int local131;
				if (local125 == 0) {
					local129 = 0;
					local131 = 0;
					local133 = 0;
				} else {
					local133 = local71 / local125;
					local131 = 16777216 / local125;
					local129 = local91 / local125;
				}
				if (this.aBoolean478) {
					local133 = (local133 >> 1) + 2048;
					local129 = (local129 >> 1) + 2048;
					local131 = (local131 >> 1) + 2048;
				}
				local47[local57] = local129;
				local51[local57] = local133;
				local55[local57] = local131;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6109 = arg1.method4518();
		} else if (arg0 == 1) {
			this.aBoolean478 = arg1.method4464() == 1;
		}
	}
}

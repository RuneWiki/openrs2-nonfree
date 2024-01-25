import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class3_Sub6_Sub36 extends Class3_Sub6 {

	@OriginalMember(owner = "client!uv", name = "L", descriptor = "I")
	private int anInt9686 = 2048;

	@OriginalMember(owner = "client!uv", name = "U", descriptor = "I")
	private int anInt9694 = 3072;

	@OriginalMember(owner = "client!uv", name = "Y", descriptor = "I")
	private int anInt9698 = 1024;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(27) int[] local27 = this.method8001(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static481.anInt8358; local29++) {
				local17[local29] = (this.anInt9686 * local27[local29] >> 12) + this.anInt9698;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9698 = arg0.method6811();
		} else if (arg1 == 1) {
			this.anInt9694 = arg0.method6811();
		} else if (arg1 == 2) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		this.anInt9686 = this.anInt9694 - this.anInt9698;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(27) int[][] local27 = this.method8005(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static481.anInt8358; local53++) {
				local43[local53] = this.anInt9698 + (this.anInt9686 * local31[local53] >> 12);
				local47[local53] = (this.anInt9686 * local35[local53] >> 12) + this.anInt9698;
				local51[local53] = (this.anInt9686 * local39[local53] >> 12) + this.anInt9698;
			}
		}
		return local17;
	}
}

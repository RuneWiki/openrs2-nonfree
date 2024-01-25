import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public class Class5_Sub6_Sub22 extends Class5_Sub6 {

	@OriginalMember(owner = "client!md", name = "H", descriptor = "I")
	protected int anInt4735;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "I")
	protected int anInt4737;

	@OriginalMember(owner = "client!md", name = "N", descriptor = "[I")
	protected int[] anIntArray278;

	@OriginalMember(owner = "client!md", name = "K", descriptor = "I")
	private int anInt4738 = -1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub22() {
		super(0, false);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487 && this.method4149()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = this.anInt4737 * (this.anInt4735 == Static378.anInt6579 ? arg0 : arg0 * this.anInt4735 / Static378.anInt6579);
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (this.anInt4737 == Static421.anInt7443) {
				for (local57 = 0; local57 < Static421.anInt7443; local57++) {
					local66 = this.anIntArray278[local47++];
					local31[local57] = (local66 & 0xFF) << 4;
					local27[local57] = local66 >> 4 & 0xFF0;
					local23[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static421.anInt7443; local57++) {
					local66 = local57 * this.anInt4737 / Static421.anInt7443;
					@Pc(73) int local73 = this.anIntArray278[local66 + local47];
					local31[local57] = (local73 & 0xFF) << 4;
					local27[local57] = local73 >> 4 & 0xFF0;
					local23[local57] = local73 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(B)I")
	@Override
	public final int method8126() {
		return this.anInt4738;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	@Override
	public final void method8121() {
		super.method8121();
		this.anIntArray278 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public final void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4738 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z")
	protected final boolean method4149() {
		if (this.anIntArray278 != null) {
			return true;
		} else if (this.anInt4738 >= 0) {
			@Pc(27) Class301 local27 = Static141.anInt2341 < 0 ? Static684.method7235(Static314.aClass50_89, this.anInt4738) : Static684.method7228(Static314.aClass50_89, Static141.anInt2341, this.anInt4738);
			local27.method7222();
			this.anIntArray278 = local27.method7221();
			this.anInt4735 = local27.anInt8497;
			this.anInt4737 = local27.anInt8501;
			return true;
		} else {
			return false;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public class Class6_Sub8_Sub8 extends Class6_Sub8 {

	@OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
	protected int anInt3926;

	@OriginalMember(owner = "client!oj", name = "H", descriptor = "[I")
	protected int[] anIntArray205;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
	protected int anInt3930;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
	private int anInt3922 = -1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	@Override
	public final void method8937() {
		super.method8937();
		this.anIntArray205 = null;
	}

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)Z")
	protected final boolean method3631() {
		if (this.anIntArray205 != null) {
			return true;
		} else if (this.anInt3922 >= 0) {
			@Pc(43) Class64 local43 = Static367.anInt6183 < 0 ? Static691.method1246(Static312.aClass223_69, this.anInt3922) : Static691.method1249(Static312.aClass223_69, Static367.anInt6183, this.anInt3922);
			local43.method1250();
			this.anIntArray205 = local43.method1248();
			this.anInt3926 = local43.anInt1300;
			this.anInt3930 = local43.anInt1297;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331 && this.method3631()) {
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			@Pc(60) int local60 = this.anInt3926 * (Static226.anInt4404 == this.anInt3930 ? arg0 : this.anInt3930 * arg0 / Static226.anInt4404);
			@Pc(70) int local70;
			@Pc(78) int local78;
			if (this.anInt3926 == Static83.anInt1268) {
				for (local70 = 0; local70 < Static83.anInt1268; local70++) {
					local78 = this.anIntArray205[local60++];
					local39[local70] = (local78 & 0xFF) << 4;
					local35[local70] = local78 >> 4 & 0xFF0;
					local31[local70] = local78 >> 12 & 0xFF0;
				}
			} else {
				for (local70 = 0; local70 < Static83.anInt1268; local70++) {
					local78 = this.anInt3926 * local70 / Static83.anInt1268;
					@Pc(132) int local132 = this.anIntArray205[local78 + local60];
					local39[local70] = (local132 & 0xFF) << 4;
					local35[local70] = local132 >> 4 & 0xFF0;
					local31[local70] = local132 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public final void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3922 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
	@Override
	public final int method8927() {
		return this.anInt3922;
	}
}

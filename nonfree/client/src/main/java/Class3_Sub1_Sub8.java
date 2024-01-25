import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
	protected int anInt1776;

	@OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
	protected int anInt1780;

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "[I")
	protected int[] anIntArray201;

	@OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
	private int anInt1782 = -1;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "(I)I")
	@Override
	public final int method7787() {
		return this.anInt1782;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434 && this.method1676()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = (Static397.anInt7340 == this.anInt1776 ? arg0 : this.anInt1776 * arg0 / Static397.anInt7340) * this.anInt1780;
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (this.anInt1780 == Static307.anInt4846) {
				for (local61 = 0; local61 < Static307.anInt4846; local61++) {
					local69 = this.anIntArray201[local51++];
					local31[local61] = (local69 & 0xFF) << 4;
					local27[local61] = local69 >> 4 & 0xFF0;
					local23[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static307.anInt4846; local61++) {
					local69 = this.anInt1780 * local61 / Static307.anInt4846;
					@Pc(121) int local121 = this.anIntArray201[local69 + local51];
					local31[local61] = (local121 & 0xFF) << 4;
					local27[local61] = local121 >> 4 & 0xFF0;
					local23[local61] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	@Override
	public final void method7780() {
		super.method7780();
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public final void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt1782 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
	protected final boolean method1676() {
		if (this.anIntArray201 != null) {
			return true;
		} else if (this.anInt1782 >= 0) {
			@Pc(35) Class9 local35 = Static488.anInt8707 >= 0 ? Static551.method531(Static400.aClass161_90, Static488.anInt8707, this.anInt1782) : Static551.method538(Static400.aClass161_90, this.anInt1782);
			local35.method532();
			this.anIntArray201 = local35.method539();
			this.anInt1780 = local35.anInt478;
			this.anInt1776 = local35.anInt481;
			return true;
		} else {
			return false;
		}
	}
}

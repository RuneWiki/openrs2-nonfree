import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
	protected int anInt2587;

	@OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
	protected int anInt2592;

	@OriginalMember(owner = "client!rs", name = "J", descriptor = "[I")
	protected int[] anIntArray156;

	@OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
	private int anInt2596 = -1;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	@Override
	public final void method7890() {
		super.method7890();
		this.anIntArray156 = null;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340 && this.method2187()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(55) int local55 = (Static4.anInt81 == this.anInt2587 ? arg0 : this.anInt2587 * arg0 / Static4.anInt81) * this.anInt2592;
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (this.anInt2592 == Static87.anInt1964) {
				for (local61 = 0; local61 < Static87.anInt1964; local61++) {
					local70 = this.anIntArray156[local55++];
					local39[local61] = (local70 & 0xFF) << 4;
					local35[local61] = local70 >> 4 & 0xFF0;
					local31[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static87.anInt1964; local61++) {
					local70 = local61 * this.anInt2592 / Static87.anInt1964;
					@Pc(77) int local77 = this.anIntArray156[local55 + local70];
					local39[local61] = (local77 & 0xFF) << 4;
					local35[local61] = local77 >> 4 & 0xFF0;
					local31[local61] = local77 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)I")
	@Override
	public final int method7889() {
		return this.anInt2596;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public final void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2596 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)Z")
	protected final boolean method2187() {
		if (this.anIntArray156 != null) {
			return true;
		} else if (this.anInt2596 >= 0) {
			@Pc(33) Class318 local33 = Static164.anInt2987 < 0 ? Static604.method7064(Static134.aClass111_128, this.anInt2596) : Static604.method7062(Static134.aClass111_128, Static164.anInt2987, this.anInt2596);
			local33.method7076();
			this.anIntArray156 = local33.method7075();
			this.anInt2592 = local33.anInt8537;
			this.anInt2587 = local33.anInt8535;
			return true;
		} else {
			return false;
		}
	}
}

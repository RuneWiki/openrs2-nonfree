import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public class Class10_Sub2_Sub13 extends Class10_Sub2 {

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "[I")
	protected int[] anIntArray213;

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
	protected int anInt2350;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
	protected int anInt2351;

	@OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
	private int anInt2355 = -1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub13() {
		super(0, false);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	@Override
	public final void method6047() {
		super.method6047();
		this.anIntArray213 = null;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I")
	@Override
	public final int method6046() {
		return this.anInt2355;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)Z")
	protected final boolean method2028() {
		if (this.anIntArray213 != null) {
			return true;
		} else if (this.anInt2355 >= 0) {
			@Pc(25) Class66 local25 = Static380.anInt6529 >= 0 ? Static463.method1657(Static318.aClass187_94, Static380.anInt6529, this.anInt2355) : Static463.method1655(Static318.aClass187_94, this.anInt2355);
			local25.method1662();
			this.anIntArray213 = local25.method1667();
			this.anInt2350 = local25.anInt1862;
			this.anInt2351 = local25.anInt1861;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216 && this.method2028()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(55) int local55 = (this.anInt2350 == Static190.anInt3835 ? arg0 : arg0 * this.anInt2350 / Static190.anInt3835) * this.anInt2351;
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static121.anInt2458 == this.anInt2351) {
				for (local65 = 0; local65 < Static121.anInt2458; local65++) {
					local73 = this.anIntArray213[local55++];
					local39[local65] = (local73 & 0xFF) << 4;
					local35[local65] = local73 >> 4 & 0xFF0;
					local31[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static121.anInt2458; local65++) {
					local73 = local65 * this.anInt2351 / Static121.anInt2458;
					@Pc(125) int local125 = this.anIntArray213[local73 + local55];
					local39[local65] = (local125 & 0xFF) << 4;
					local35[local65] = local125 >> 4 & 0xFF0;
					local31[local65] = local125 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public final void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2355 = arg1.method2485();
		}
	}
}

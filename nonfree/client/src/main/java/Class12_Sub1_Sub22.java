import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public class Class12_Sub1_Sub22 extends Class12_Sub1 {

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
	protected int anInt7647;

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "[I")
	protected int[] anIntArray538;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	protected int anInt7654;

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
	private int anInt7648 = -1;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub22() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108 && this.method6369()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(56) int local56 = this.anInt7647 * (Static138.anInt3102 == this.anInt7654 ? arg0 : this.anInt7654 * arg0 / Static138.anInt3102);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt7647 == Static357.anInt6670) {
				for (local62 = 0; local62 < Static357.anInt6670; local62++) {
					local70 = this.anIntArray538[local56++];
					local36[local62] = (local70 & 0xFF) << 4;
					local32[local62] = local70 >> 4 & 0xFF0;
					local28[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static357.anInt6670; local62++) {
					local70 = local62 * this.anInt7647 / Static357.anInt6670;
					@Pc(122) int local122 = this.anIntArray538[local70 + local56];
					local36[local62] = (local122 & 0xFF) << 4;
					local32[local62] = local122 >> 4 & 0xFF0;
					local28[local62] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	@Override
	public final void method7789() {
		super.method7789();
		this.anIntArray538 = null;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Z")
	protected final boolean method6369() {
		if (this.anIntArray538 != null) {
			return true;
		} else if (this.anInt7648 >= 0) {
			@Pc(33) Class40 local33 = Static336.anInt6442 >= 0 ? Static550.method897(Static10.aClass16_3, Static336.anInt6442, this.anInt7648) : Static550.method894(Static10.aClass16_3, this.anInt7648);
			local33.method906();
			this.anIntArray538 = local33.method893();
			this.anInt7654 = local33.anInt894;
			this.anInt7647 = local33.anInt895;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I")
	@Override
	public final int method7796() {
		return this.anInt7648;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public final void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7648 = arg0.method5199();
		}
	}
}

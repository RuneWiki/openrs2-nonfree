import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public class Class4_Sub6_Sub3 extends Class4_Sub6 {

	@OriginalMember(owner = "client!el", name = "D", descriptor = "I")
	protected int anInt1078;

	@OriginalMember(owner = "client!el", name = "M", descriptor = "I")
	protected int anInt1086;

	@OriginalMember(owner = "client!el", name = "O", descriptor = "[I")
	protected int[] anIntArray62;

	@OriginalMember(owner = "client!el", name = "L", descriptor = "I")
	private int anInt1085 = -1;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437 && this.method986()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(52) int local52 = (Static262.anInt4939 == this.anInt1086 ? arg0 : this.anInt1086 * arg0 / Static262.anInt4939) * this.anInt1078;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (Static80.anInt1616 == this.anInt1078) {
				for (local62 = 0; local62 < Static80.anInt1616; local62++) {
					local71 = this.anIntArray62[local52++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static80.anInt1616; local62++) {
					local71 = local62 * this.anInt1078 / Static80.anInt1616;
					@Pc(79) int local79 = this.anIntArray62[local52 + local71];
					local36[local62] = (local79 & 0xFF) << 4;
					local32[local62] = local79 >> 4 & 0xFF0;
					local28[local62] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	@Override
	public final int method5511() {
		return this.anInt1085;
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V")
	@Override
	public final void method5517() {
		super.method5517();
		this.anIntArray62 = null;
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(I)Z")
	protected final boolean method986() {
		if (this.anIntArray62 != null) {
			return true;
		} else if (this.anInt1085 >= 0) {
			@Pc(32) Class18 local32 = Static182.anInt3496 >= 0 ? Static456.method318(Static40.aClass76_9, Static182.anInt3496, this.anInt1085) : Static456.method328(Static40.aClass76_9, this.anInt1085);
			local32.method322();
			this.anIntArray62 = local32.method319();
			this.anInt1086 = local32.anInt366;
			this.anInt1078 = local32.anInt367;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public final void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt1085 = arg1.method2536();
		}
	}
}

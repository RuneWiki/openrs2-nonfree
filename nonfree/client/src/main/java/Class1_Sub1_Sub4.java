import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!td", name = "D", descriptor = "[I")
	protected int[] anIntArray37;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	protected int anInt806;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "I")
	protected int anInt807;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	private int anInt802 = -1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505 && this.method709()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = this.anInt806 * (Static8.anInt5990 == this.anInt807 ? arg0 : this.anInt807 * arg0 / Static8.anInt5990);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt806 == Static501.anInt8748) {
				for (local62 = 0; local62 < Static501.anInt8748; local62++) {
					local70 = this.anIntArray37[local56++];
					local36[local62] = (local70 & 0xFF) << 4;
					local32[local62] = local70 >> 4 & 0xFF0;
					local28[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static501.anInt8748; local62++) {
					local70 = this.anInt806 * local62 / Static501.anInt8748;
					@Pc(122) int local122 = this.anIntArray37[local56 + local70];
					local36[local62] = (local122 & 0xFF) << 4;
					local32[local62] = local122 >> 4 & 0xFF0;
					local28[local62] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)Z")
	protected final boolean method709() {
		if (this.anIntArray37 != null) {
			return true;
		} else if (this.anInt802 >= 0) {
			@Pc(32) Class282 local32 = Static41.anInt8217 >= 0 ? Static604.method6027(Static107.aClass308_42, Static41.anInt8217, this.anInt802) : Static604.method6022(Static107.aClass308_42, this.anInt802);
			local32.method6018();
			this.anIntArray37 = local32.method6016();
			this.anInt806 = local32.anInt7490;
			this.anInt807 = local32.anInt7493;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public final void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt802 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	@Override
	public final void method7829() {
		super.method7829();
		this.anIntArray37 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
	@Override
	public final int method7827() {
		return this.anInt802;
	}
}

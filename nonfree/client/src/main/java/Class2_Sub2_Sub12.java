import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
	private int anInt2956 = 4096;

	static {
		new Class209("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2956 = arg0.method5500();
		} else if (arg1 == 1) {
			this.aBoolean225 = arg0.method5495() == 1;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(33) int[] local33 = this.method5839(arg0 - 1 & Static246.anInt4669, 0);
			@Pc(39) int[] local39 = this.method5839(arg0, 0);
			@Pc(49) int[] local49 = this.method5839(arg0 + 1 & Static246.anInt4669, 0);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static429.anInt6518; local63++) {
				@Pc(77) int local77 = this.anInt2956 * (local49[local63] - local33[local63]);
				@Pc(97) int local97 = this.anInt2956 * (local39[Static303.anInt5406 & local63 + 1] - local39[local63 - 1 & Static303.anInt5406]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(132) int local132 = (int) (Math.sqrt((double) ((float) (local111 + local117 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(138) int local138;
				@Pc(140) int local140;
				if (local132 == 0) {
					local136 = 0;
					local138 = 0;
					local140 = 0;
				} else {
					local136 = local97 / local132;
					local138 = local77 / local132;
					local140 = 16777216 / local132;
				}
				if (this.aBoolean225) {
					local136 = (local136 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
				}
				local53[local63] = local136;
				local57[local63] = local138;
				local61[local63] = local140;
			}
		}
		return local19;
	}
}

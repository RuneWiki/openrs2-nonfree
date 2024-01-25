import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	private int anInt1930;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
	private int anInt1934;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
	private int anInt1933 = -1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub11() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(43) int local43 = this.anInt1934 * (Static241.anInt4307 == this.anInt1930 ? arg0 : arg0 * this.anInt1930 / Static241.anInt4307);
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (this.anInt1934 == Static347.anInt5974) {
				for (local65 = 0; local65 < Static347.anInt5974; local65++) {
					local74 = this.anIntArray168[local43++];
					local55[local65] = (local74 & 0xFF) << 4;
					local51[local65] = local74 >> 4 & 0xFF0;
					local47[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static347.anInt5974; local65++) {
					local74 = local65 * this.anInt1934 / Static347.anInt5974;
					@Pc(81) int local81 = this.anIntArray168[local43 + local74];
					local55[local65] = (local81 & 0xFF) << 4;
					local51[local65] = local81 >> 4 & 0xFF0;
					local47[local65] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	@Override
	public void method6080() {
		super.method6080();
		this.anIntArray168 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1933 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I")
	@Override
	public int method6075() {
		return this.anInt1933;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)V")
	@Override
	public void method6081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method6081(arg0, arg1);
		if (this.anInt1933 >= 0 && Static74.anInterface7_3 != null) {
			@Pc(35) int local35 = Static74.anInterface7_3.method4836(this.anInt1933).aBoolean295 ? 64 : 128;
			this.anIntArray168 = Static74.anInterface7_3.method4839(false, local35, 1.0F, local35, this.anInt1933);
			this.anInt1934 = local35;
			this.anInt1930 = local35;
		}
	}
}

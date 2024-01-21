import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class5_Sub2_Sub4_Sub5 extends Class5_Sub2_Sub4 {

	@OriginalMember(owner = "client!m", name = "Kb", descriptor = "I")
	private final int anInt1899;

	@OriginalMember(owner = "client!m", name = "Ib", descriptor = "I")
	private final int anInt1897;

	@OriginalMember(owner = "client!m", name = "yb", descriptor = "I")
	private final int anInt1893;

	@OriginalMember(owner = "client!m", name = "Bb", descriptor = "I")
	private final int anInt1894;

	@OriginalMember(owner = "client!m", name = "Cb", descriptor = "I")
	private final int anInt1895;

	@OriginalMember(owner = "client!m", name = "tb", descriptor = "I")
	private final int anInt1889;

	@OriginalMember(owner = "client!m", name = "ub", descriptor = "I")
	private final int anInt1890;

	@OriginalMember(owner = "client!m", name = "vb", descriptor = "Lclient!ka;")
	private Class5_Sub2_Sub9 aClass5_Sub2_Sub9_2;

	@OriginalMember(owner = "client!m", name = "xb", descriptor = "I")
	private int anInt1892;

	@OriginalMember(owner = "client!m", name = "wb", descriptor = "I")
	private int anInt1891;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIIZLclient!jf;)V")
	public Class5_Sub2_Sub4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class5_Sub2_Sub4 arg9) {
		this.anInt1899 = arg4;
		this.anInt1897 = arg1;
		this.anInt1893 = arg5;
		this.anInt1894 = arg3;
		this.anInt1895 = arg2;
		this.anInt1889 = arg6;
		this.anInt1890 = arg0;
		if (arg7 != -1) {
			this.aClass5_Sub2_Sub9_2 = Static63.method1252(arg7);
			this.anInt1892 = Static3.anInt94 - 1;
			this.anInt1891 = 0;
			if (this.aClass5_Sub2_Sub9_2.anInt1664 == 0 && arg9 != null && arg9 instanceof Class5_Sub2_Sub4_Sub5) {
				@Pc(53) Class5_Sub2_Sub4_Sub5 local53 = (Class5_Sub2_Sub4_Sub5) arg9;
				if (local53.aClass5_Sub2_Sub9_2 == this.aClass5_Sub2_Sub9_2) {
					this.anInt1891 = local53.anInt1891;
					this.anInt1892 = local53.anInt1892;
					return;
				}
			}
			if (arg8 && this.aClass5_Sub2_Sub9_2.anInt1672 != -1) {
				this.anInt1891 = (int) ((double) this.aClass5_Sub2_Sub9_2.anIntArray249.length * Math.random());
				this.anInt1892 -= (int) (Math.random() * (double) this.aClass5_Sub2_Sub9_2.anIntArray252[this.anInt1891]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)Lclient!dd;")
	@Override
	public Class5_Sub2_Sub4_Sub2 method1612() {
		if (this.aClass5_Sub2_Sub9_2 != null) {
			@Pc(14) int local14 = Static3.anInt94 - this.anInt1892;
			if (local14 > 100 && this.aClass5_Sub2_Sub9_2.anInt1672 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass5_Sub2_Sub9_2.anIntArray252[this.anInt1891] >= local14) {
							break label37;
						}
						local14 -= this.aClass5_Sub2_Sub9_2.anIntArray252[this.anInt1891];
						this.anInt1891++;
					} while (this.anInt1891 < this.aClass5_Sub2_Sub9_2.anIntArray249.length);
					this.anInt1891 -= this.aClass5_Sub2_Sub9_2.anInt1672;
				} while (this.anInt1891 >= 0 && this.anInt1891 < this.aClass5_Sub2_Sub9_2.anIntArray249.length);
				this.aClass5_Sub2_Sub9_2 = null;
			}
			this.anInt1892 = Static3.anInt94 - local14;
		}
		@Pc(98) Class5_Sub2_Sub7 local98 = Static62.method1232(this.anInt1890);
		if (local98.anIntArray143 != null) {
			local98 = local98.method606();
		}
		return local98 == null ? null : local98.method601(this.aClass5_Sub2_Sub9_2, this.anInt1894, this.anInt1895, this.anInt1897, this.anInt1899, this.anInt1891, this.anInt1889, this.anInt1893);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class67 {

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	private int anInt2157 = 0;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	private int anInt2156 = -1;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!wl;")
	private Class265 aClass265_18 = new Class265();

	@OriginalMember(owner = "client!el", name = "n", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	private final int anInt2160;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	private final int anInt2159;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "[Lclient!mu;")
	private Class2_Sub28[] aClass2_Sub28Array1;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(III)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2160 = arg0;
		this.anInt2159 = arg1;
		this.aClass2_Sub28Array1 = new Class2_Sub28[this.anInt2159];
		this.anIntArrayArray13 = new int[this.anInt2160][arg2];
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I")
	public int[] method1594(@OriginalArg(1) int arg0) {
		if (this.anInt2160 == this.anInt2159) {
			this.aBoolean187 = this.aClass2_Sub28Array1[arg0] == null;
			this.aClass2_Sub28Array1[arg0] = Static294.aClass2_Sub28_4;
			return this.anIntArrayArray13[arg0];
		} else if (this.anInt2160 == 1) {
			this.aBoolean187 = arg0 != this.anInt2156;
			this.anInt2156 = arg0;
			return this.anIntArrayArray13[0];
		} else {
			@Pc(50) Class2_Sub28 local50 = this.aClass2_Sub28Array1[arg0];
			if (local50 == null) {
				this.aBoolean187 = true;
				if (this.anInt2157 < this.anInt2160) {
					local50 = new Class2_Sub28(arg0, this.anInt2157);
					this.anInt2157++;
				} else {
					@Pc(83) Class2_Sub28 local83 = (Class2_Sub28) this.aClass265_18.method6006();
					local50 = new Class2_Sub28(arg0, local83.anInt4789);
					this.aClass2_Sub28Array1[local83.anInt4788] = null;
					local83.method6072();
				}
				this.aClass2_Sub28Array1[arg0] = local50;
			} else {
				this.aBoolean187 = false;
			}
			this.aClass265_18.method5992(local50);
			return this.anIntArrayArray13[local50.anInt4789];
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)[[I")
	public int[][] method1595() {
		if (this.anInt2160 != this.anInt2159) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2160; local17++) {
			this.aClass2_Sub28Array1[local17] = Static294.aClass2_Sub28_4;
		}
		return this.anIntArrayArray13;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
	public void method1598() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2160; local7++) {
			this.anIntArrayArray13[local7] = null;
		}
		this.anIntArrayArray13 = null;
		this.aClass2_Sub28Array1 = null;
		this.aClass265_18.method6003();
		this.aClass265_18 = null;
	}
}

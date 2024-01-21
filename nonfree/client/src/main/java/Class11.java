import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class11 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	private int anInt714 = -1;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	private int anInt719 = 0;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "Lclient!cb;")
	private Class10 aClass10_24 = new Class10();

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	private final int anInt721;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "[Lclient!wc;")
	private Class2_Sub22[] aClass2_Sub22Array1;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	private final int anInt716;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt721 = arg0;
		this.aClass2_Sub22Array1 = new Class2_Sub22[arg1];
		this.anIntArrayArrayArray3 = new int[arg0][3][arg2];
		this.anInt716 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[[I")
	public int[][] method511(@OriginalArg(1) int arg0) {
		if (this.anInt721 == this.anInt716) {
			this.aBoolean37 = this.aClass2_Sub22Array1[arg0] == null;
			this.aClass2_Sub22Array1[arg0] = Static112.aClass2_Sub22_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt721 == 1) {
			this.aBoolean37 = arg0 != this.anInt714;
			this.anInt714 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(67) Class2_Sub22 local67 = this.aClass2_Sub22Array1[arg0];
			if (this.aBoolean37 = local67 == null) {
				if (this.anInt721 > this.anInt719) {
					local67 = new Class2_Sub22(arg0, this.anInt719);
					this.anInt719++;
				} else {
					@Pc(108) Class2_Sub22 local108 = (Class2_Sub22) this.aClass10_24.method446();
					local67 = new Class2_Sub22(arg0, local108.anInt4478);
					this.aClass2_Sub22Array1[local108.anInt4480] = null;
					local108.method3004();
				}
				this.aClass2_Sub22Array1[arg0] = local67;
			}
			this.aClass10_24.method447(local67);
			return this.anIntArrayArrayArray3[local67.anInt4478];
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public void method512() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt721; local7++) {
			this.anIntArrayArrayArray3[local7][0] = null;
			this.anIntArrayArrayArray3[local7][1] = null;
			this.anIntArrayArrayArray3[local7][2] = null;
			this.anIntArrayArrayArray3[local7] = null;
		}
		this.anIntArrayArrayArray3 = null;
		this.aClass2_Sub22Array1 = null;
		this.aClass10_24.method454();
		this.aClass10_24 = null;
	}
}

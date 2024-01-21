import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class40 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	private int anInt1718 = -1;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	private int anInt1725 = 0;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!s;")
	private Class87 aClass87_12 = new Class87();

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Z")
	public boolean aBoolean86 = false;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	private final int anInt1723;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	private final int anInt1727;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[Lclient!vh;")
	private Class1_Sub26[] aClass1_Sub26Array1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1723 = arg1;
		this.anInt1727 = arg0;
		this.anIntArrayArray13 = new int[this.anInt1727][arg2];
		this.aClass1_Sub26Array1 = new Class1_Sub26[this.anInt1723];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)[I")
	public int[] method1362(@OriginalArg(1) int arg0) {
		if (this.anInt1723 == this.anInt1727) {
			this.aBoolean86 = this.aClass1_Sub26Array1[arg0] == null;
			this.aClass1_Sub26Array1[arg0] = Static184.aClass1_Sub26_1;
			return this.anIntArrayArray13[arg0];
		} else if (this.anInt1727 == 1) {
			this.aBoolean86 = arg0 != this.anInt1718;
			this.anInt1718 = arg0;
			return this.anIntArrayArray13[0];
		} else {
			@Pc(51) Class1_Sub26 local51 = this.aClass1_Sub26Array1[arg0];
			if (local51 == null) {
				this.aBoolean86 = true;
				if (this.anInt1727 > this.anInt1725) {
					local51 = new Class1_Sub26(arg0, this.anInt1725);
					this.anInt1725++;
				} else {
					@Pc(86) Class1_Sub26 local86 = (Class1_Sub26) this.aClass87_12.method2828();
					local51 = new Class1_Sub26(arg0, local86.anInt4520);
					this.aClass1_Sub26Array1[local86.anInt4522] = null;
					local86.method3563();
				}
				this.aClass1_Sub26Array1[arg0] = local51;
			} else {
				this.aBoolean86 = false;
			}
			this.aClass87_12.method2824(local51);
			return this.anIntArrayArray13[local51.anInt4520];
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)[[I")
	public int[][] method1363() {
		if (this.anInt1727 != this.anInt1723) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt1727; local21++) {
			this.aClass1_Sub26Array1[local21] = Static184.aClass1_Sub26_1;
		}
		return this.anIntArrayArray13;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public void method1366() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1727; local7++) {
			this.anIntArrayArray13[local7] = null;
		}
		this.anIntArrayArray13 = null;
		this.aClass1_Sub26Array1 = null;
		this.aClass87_12.method2831();
		this.aClass87_12 = null;
	}
}

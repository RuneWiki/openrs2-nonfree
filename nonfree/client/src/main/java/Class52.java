import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class52 {

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
	private int anInt1967 = 0;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
	private int anInt1966 = -1;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "Lclient!dc;")
	private Class19 aClass19_10 = new Class19();

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	private final int anInt1964;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
	private final int anInt1963;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "[Lclient!me;")
	private Class2_Sub19[] aClass2_Sub19Array1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(III)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1964 = arg0;
		this.anIntArrayArray15 = new int[this.anInt1964][arg2];
		this.anInt1963 = arg1;
		this.aClass2_Sub19Array1 = new Class2_Sub19[this.anInt1963];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)[I")
	public int[] method1596(@OriginalArg(1) int arg0) {
		if (this.anInt1964 == this.anInt1963) {
			this.aBoolean103 = this.aClass2_Sub19Array1[arg0] == null;
			this.aClass2_Sub19Array1[arg0] = Static9.aClass2_Sub19_1;
			return this.anIntArrayArray15[arg0];
		} else if (this.anInt1964 == 1) {
			this.aBoolean103 = this.anInt1966 != arg0;
			this.anInt1966 = arg0;
			return this.anIntArrayArray15[0];
		} else {
			@Pc(69) Class2_Sub19 local69 = this.aClass2_Sub19Array1[arg0];
			if (local69 == null) {
				this.aBoolean103 = true;
				if (this.anInt1967 >= this.anInt1964) {
					@Pc(94) Class2_Sub19 local94 = (Class2_Sub19) this.aClass19_10.method683();
					local69 = new Class2_Sub19(arg0, local94.anInt2702);
					this.aClass2_Sub19Array1[local94.anInt2704] = null;
					local94.method3254();
				} else {
					local69 = new Class2_Sub19(arg0, this.anInt1967);
					this.anInt1967++;
				}
				this.aClass2_Sub19Array1[arg0] = local69;
			} else {
				this.aBoolean103 = false;
			}
			this.aClass19_10.method682(local69);
			return this.anIntArrayArray15[local69.anInt2702];
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)[[I")
	public int[][] method1597() {
		if (this.anInt1963 != this.anInt1964) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt1964; local21++) {
			this.aClass2_Sub19Array1[local21] = Static9.aClass2_Sub19_1;
		}
		return this.anIntArrayArray15;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
	public void method1599() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1964; local7++) {
			this.anIntArrayArray15[local7] = null;
		}
		this.anIntArrayArray15 = null;
		this.aClass2_Sub19Array1 = null;
		this.aClass19_10.method685();
		this.aClass19_10 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class100 {

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	private int anInt2450 = -1;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	private int anInt2451 = 0;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Lclient!ft;")
	private Class88 aClass88_27 = new Class88();

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	private final int anInt2449;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
	private final int anInt2446;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "[Lclient!te;")
	private Class6_Sub35[] aClass6_Sub35Array1;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(III)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2449 = arg1;
		this.anInt2446 = arg0;
		this.anIntArrayArray23 = new int[this.anInt2446][arg2];
		this.aClass6_Sub35Array1 = new Class6_Sub35[this.anInt2449];
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	public void method2223() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2446; local3++) {
			this.anIntArrayArray23[local3] = null;
		}
		this.anIntArrayArray23 = null;
		this.aClass6_Sub35Array1 = null;
		this.aClass88_27.method1887();
		this.aClass88_27 = null;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)[[I")
	public int[][] method2224() {
		if (this.anInt2446 != this.anInt2449) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2446; local17++) {
			this.aClass6_Sub35Array1[local17] = Static249.aClass6_Sub35_1;
		}
		return this.anIntArrayArray23;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)[I")
	public int[] method2225(@OriginalArg(0) int arg0) {
		if (this.anInt2446 == this.anInt2449) {
			this.aBoolean185 = this.aClass6_Sub35Array1[arg0] == null;
			this.aClass6_Sub35Array1[arg0] = Static249.aClass6_Sub35_1;
			return this.anIntArrayArray23[arg0];
		} else if (this.anInt2446 == 1) {
			this.aBoolean185 = arg0 != this.anInt2450;
			this.anInt2450 = arg0;
			return this.anIntArrayArray23[0];
		} else {
			@Pc(68) Class6_Sub35 local68 = this.aClass6_Sub35Array1[arg0];
			if (local68 == null) {
				this.aBoolean185 = true;
				if (this.anInt2446 > this.anInt2451) {
					local68 = new Class6_Sub35(arg0, this.anInt2451);
					this.anInt2451++;
				} else {
					@Pc(104) Class6_Sub35 local104 = (Class6_Sub35) this.aClass88_27.method1883();
					local68 = new Class6_Sub35(arg0, local104.anInt6268);
					this.aClass6_Sub35Array1[local104.anInt6267] = null;
					local104.method5977();
				}
				this.aClass6_Sub35Array1[arg0] = local68;
			} else {
				this.aBoolean185 = false;
			}
			this.aClass88_27.method1885(local68);
			return this.anIntArrayArray23[local68.anInt6268];
		}
	}
}

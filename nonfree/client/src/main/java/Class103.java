import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class103 {

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	private int anInt2529 = -1;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
	private int anInt2532 = 0;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "Lclient!rh;")
	private Class275 aClass275_50 = new Class275();

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	private final int anInt2526;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	private final int anInt2528;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "[Lclient!tba;")
	private Class6_Sub45[] aClass6_Sub45Array1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(III)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2526 = arg0;
		this.anInt2528 = arg1;
		this.anIntArrayArrayArray6 = new int[this.anInt2526][3][arg2];
		this.aClass6_Sub45Array1 = new Class6_Sub45[this.anInt2528];
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)[[[I")
	public int[][][] method2139() {
		if (this.anInt2528 != this.anInt2526) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2526; local17++) {
			this.aClass6_Sub45Array1[local17] = Static344.aClass6_Sub45_1;
		}
		return this.anIntArrayArrayArray6;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)[[I")
	public int[][] method2141(@OriginalArg(1) int arg0) {
		if (this.anInt2528 == this.anInt2526) {
			this.aBoolean172 = this.aClass6_Sub45Array1[arg0] == null;
			this.aClass6_Sub45Array1[arg0] = Static344.aClass6_Sub45_1;
			return this.anIntArrayArrayArray6[arg0];
		} else if (this.anInt2526 == 1) {
			this.aBoolean172 = this.anInt2529 != arg0;
			this.anInt2529 = arg0;
			return this.anIntArrayArrayArray6[0];
		} else {
			@Pc(24) Class6_Sub45 local24 = this.aClass6_Sub45Array1[arg0];
			if (local24 == null) {
				this.aBoolean172 = true;
				if (this.anInt2532 < this.anInt2526) {
					local24 = new Class6_Sub45(arg0, this.anInt2532);
					this.anInt2532++;
				} else {
					@Pc(55) Class6_Sub45 local55 = (Class6_Sub45) this.aClass275_50.method6369();
					local24 = new Class6_Sub45(arg0, local55.anInt8089);
					this.aClass6_Sub45Array1[local55.anInt8092] = null;
					local55.method7849();
				}
				this.aClass6_Sub45Array1[arg0] = local24;
			} else {
				this.aBoolean172 = false;
			}
			this.aClass275_50.method6368(local24);
			return this.anIntArrayArrayArray6[local24.anInt8089];
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	public void method2142() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt2526; local12++) {
			this.anIntArrayArrayArray6[local12][0] = null;
			this.anIntArrayArrayArray6[local12][1] = null;
			this.anIntArrayArrayArray6[local12][2] = null;
			this.anIntArrayArrayArray6[local12] = null;
		}
		this.aClass6_Sub45Array1 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass275_50.method6357();
		this.aClass275_50 = null;
	}
}

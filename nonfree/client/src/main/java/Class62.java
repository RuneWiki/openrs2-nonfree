import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class62 {

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	private int anInt2151 = -1;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	private int anInt2141 = 0;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "Lclient!ug;")
	private Class243 aClass243_13 = new Class243();

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	private final int anInt2148;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
	private final int anInt2147;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "[Lclient!nr;")
	private Class3_Sub33[] aClass3_Sub33Array1;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(III)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2148 = arg1;
		this.anInt2147 = arg0;
		this.aClass3_Sub33Array1 = new Class3_Sub33[this.anInt2148];
		this.anIntArrayArray14 = new int[this.anInt2147][arg2];
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public void method1667() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2147; local3++) {
			this.anIntArrayArray14[local3] = null;
		}
		this.aClass3_Sub33Array1 = null;
		this.anIntArrayArray14 = null;
		this.aClass243_13.method5200();
		this.aClass243_13 = null;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)[[I")
	public int[][] method1669() {
		if (this.anInt2147 != this.anInt2148) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt2147; local29++) {
			this.aClass3_Sub33Array1[local29] = Static373.aClass3_Sub33_1;
		}
		return this.anIntArrayArray14;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)[I")
	public int[] method1670(@OriginalArg(1) int arg0) {
		if (this.anInt2148 == this.anInt2147) {
			this.aBoolean169 = this.aClass3_Sub33Array1[arg0] == null;
			this.aClass3_Sub33Array1[arg0] = Static373.aClass3_Sub33_1;
			return this.anIntArrayArray14[arg0];
		} else if (this.anInt2147 == 1) {
			this.aBoolean169 = arg0 != this.anInt2151;
			this.anInt2151 = arg0;
			return this.anIntArrayArray14[0];
		} else {
			@Pc(64) Class3_Sub33 local64 = this.aClass3_Sub33Array1[arg0];
			if (local64 == null) {
				this.aBoolean169 = true;
				if (this.anInt2141 >= this.anInt2147) {
					@Pc(85) Class3_Sub33 local85 = (Class3_Sub33) this.aClass243_13.method5207();
					local64 = new Class3_Sub33(arg0, local85.anInt5102);
					this.aClass3_Sub33Array1[local85.anInt5104] = null;
					local85.method5977();
				} else {
					local64 = new Class3_Sub33(arg0, this.anInt2141);
					this.anInt2141++;
				}
				this.aClass3_Sub33Array1[arg0] = local64;
			} else {
				this.aBoolean169 = false;
			}
			this.aClass243_13.method5209(local64);
			return this.anIntArrayArray14[local64.anInt5102];
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class225 {

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
	private int anInt6283 = 0;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
	private int anInt6286 = -1;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "Lclient!bv;")
	private Class37 aClass37_62 = new Class37();

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "Z")
	public boolean aBoolean456 = false;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
	private final int anInt6285;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
	private final int anInt6287;

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "[Lclient!uu;")
	private Class1_Sub48[] aClass1_Sub48Array1;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(III)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6285 = arg0;
		this.anInt6287 = arg1;
		this.aClass1_Sub48Array1 = new Class1_Sub48[this.anInt6287];
		this.anIntArrayArrayArray14 = new int[this.anInt6285][3][arg2];
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)[[[I")
	public int[][][] method5317() {
		if (this.anInt6285 != this.anInt6287) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6285; local17++) {
			this.aClass1_Sub48Array1[local17] = Static137.aClass1_Sub48_1;
		}
		return this.anIntArrayArrayArray14;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)[[I")
	public int[][] method5319(@OriginalArg(1) int arg0) {
		if (this.anInt6285 == this.anInt6287) {
			this.aBoolean456 = this.aClass1_Sub48Array1[arg0] == null;
			this.aClass1_Sub48Array1[arg0] = Static137.aClass1_Sub48_1;
			return this.anIntArrayArrayArray14[arg0];
		} else if (this.anInt6285 == 1) {
			this.aBoolean456 = this.anInt6286 != arg0;
			this.anInt6286 = arg0;
			return this.anIntArrayArrayArray14[0];
		} else {
			@Pc(67) Class1_Sub48 local67 = this.aClass1_Sub48Array1[arg0];
			if (local67 == null) {
				this.aBoolean456 = true;
				if (this.anInt6285 > this.anInt6283) {
					local67 = new Class1_Sub48(arg0, this.anInt6283);
					this.anInt6283++;
				} else {
					@Pc(102) Class1_Sub48 local102 = (Class1_Sub48) this.aClass37_62.method974();
					local67 = new Class1_Sub48(arg0, local102.anInt8505);
					this.aClass1_Sub48Array1[local102.anInt8503] = null;
					local102.method7525();
				}
				this.aClass1_Sub48Array1[arg0] = local67;
			} else {
				this.aBoolean456 = false;
			}
			this.aClass37_62.method976(local67);
			return this.anIntArrayArrayArray14[local67.anInt8505];
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V")
	public void method5320() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6285; local11++) {
			this.anIntArrayArrayArray14[local11][0] = null;
			this.anIntArrayArrayArray14[local11][1] = null;
			this.anIntArrayArrayArray14[local11][2] = null;
			this.anIntArrayArrayArray14[local11] = null;
		}
		this.anIntArrayArrayArray14 = null;
		this.aClass1_Sub48Array1 = null;
		this.aClass37_62.method967();
		this.aClass37_62 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	private int anInt7 = -1;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	private int anInt14 = 0;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Lclient!ea;")
	private Class23 aClass23_1 = new Class23();

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	private final int anInt5;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	private final int anInt8;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "[Lclient!qc;")
	private Class3_Sub19[] aClass3_Sub19Array1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArrayArray1 = new int[arg0][3][arg2];
		this.anInt5 = arg1;
		this.anInt8 = arg0;
		this.aClass3_Sub19Array1 = new Class3_Sub19[arg1];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public void method6() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8; local1++) {
			this.anIntArrayArrayArray1[local1][0] = null;
			this.anIntArrayArrayArray1[local1][1] = null;
			this.anIntArrayArrayArray1[local1][2] = null;
			this.anIntArrayArrayArray1[local1] = null;
		}
		this.anIntArrayArrayArray1 = null;
		this.aClass3_Sub19Array1 = null;
		this.aClass23_1.method863();
		this.aClass23_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)[[I")
	public int[][] method10(@OriginalArg(0) int arg0) {
		if (this.anInt5 == this.anInt8) {
			this.aBoolean1 = this.aClass3_Sub19Array1[arg0] == null;
			this.aClass3_Sub19Array1[arg0] = Static134.aClass3_Sub19_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt8 == 1) {
			this.aBoolean1 = arg0 != this.anInt7;
			this.anInt7 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(51) Class3_Sub19 local51 = this.aClass3_Sub19Array1[arg0];
			if (this.aBoolean1 = local51 == null) {
				if (this.anInt8 > this.anInt14) {
					local51 = new Class3_Sub19(arg0, this.anInt14);
					this.anInt14++;
				} else {
					@Pc(92) Class3_Sub19 local92 = (Class3_Sub19) this.aClass23_1.method857();
					local51 = new Class3_Sub19(arg0, local92.anInt3263);
					this.aClass3_Sub19Array1[local92.anInt3264] = null;
					local92.method3167();
				}
				this.aClass3_Sub19Array1[arg0] = local51;
			}
			this.aClass23_1.method859(local51);
			return this.anIntArrayArrayArray1[local51.anInt3263];
		}
	}
}

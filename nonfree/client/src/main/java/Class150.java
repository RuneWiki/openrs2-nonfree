import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class150 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	private int anInt4705 = 0;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	private int anInt4710 = -1;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!fk;")
	private Class56 aClass56_22 = new Class56();

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	private int anInt4704;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	private int anInt4703;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "[Lclient!kh;")
	private Class3_Sub18[] aClass3_Sub18Array1;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V")
	public Class150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4704 = arg0;
		this.anInt4703 = arg1;
		this.aClass3_Sub18Array1 = new Class3_Sub18[this.anInt4703];
		this.anIntArrayArrayArray13 = new int[this.anInt4704][3][arg2];
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)[[[I")
	public int[][][] method3992() {
		if (this.anInt4704 != this.anInt4703) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4704; local25++) {
			this.aClass3_Sub18Array1[local25] = Static201.aClass3_Sub18_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)[[I")
	public int[][] method3994(@OriginalArg(1) int arg0) {
		if (this.anInt4703 == this.anInt4704) {
			this.aBoolean319 = this.aClass3_Sub18Array1[arg0] == null;
			this.aClass3_Sub18Array1[arg0] = Static201.aClass3_Sub18_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt4704 == 1) {
			this.aBoolean319 = this.anInt4710 != arg0;
			this.anInt4710 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(61) Class3_Sub18 local61 = this.aClass3_Sub18Array1[arg0];
			if (local61 == null) {
				this.aBoolean319 = true;
				if (this.anInt4705 >= this.anInt4704) {
					@Pc(81) Class3_Sub18 local81 = (Class3_Sub18) this.aClass56_22.method1275();
					local61 = new Class3_Sub18(arg0, local81.anInt2769);
					this.aClass3_Sub18Array1[local81.anInt2766] = null;
					local81.method5013();
				} else {
					local61 = new Class3_Sub18(arg0, this.anInt4705);
					this.anInt4705++;
				}
				this.aClass3_Sub18Array1[arg0] = local61;
			} else {
				this.aBoolean319 = false;
			}
			this.aClass56_22.method1274(local61);
			return this.anIntArrayArrayArray13[local61.anInt2769];
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	public void method3998() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4704; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass3_Sub18Array1 = null;
		this.aClass56_22.method1270();
		this.aClass56_22 = null;
	}
}

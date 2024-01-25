import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class50 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	private int anInt1238 = -1;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	private int anInt1246 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!sr;")
	private Class227 aClass227_5 = new Class227();

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	private final int anInt1243;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	private final int anInt1239;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[Lclient!bv;")
	private Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1243 = arg0;
		this.anInt1239 = arg1;
		this.aClass1_Sub9Array1 = new Class1_Sub9[this.anInt1239];
		this.anIntArrayArrayArray1 = new int[this.anInt1243][3][arg2];
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)[[[I")
	public int[][][] method1085() {
		if (this.anInt1243 != this.anInt1239) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt1243; local21++) {
			this.aClass1_Sub9Array1[local21] = Static51.aClass1_Sub9_1;
		}
		return this.anIntArrayArrayArray1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[[I")
	public int[][] method1086(@OriginalArg(1) int arg0) {
		if (this.anInt1243 == this.anInt1239) {
			this.aBoolean131 = this.aClass1_Sub9Array1[arg0] == null;
			this.aClass1_Sub9Array1[arg0] = Static51.aClass1_Sub9_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt1243 == 1) {
			this.aBoolean131 = arg0 != this.anInt1238;
			this.anInt1238 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(44) Class1_Sub9 local44 = this.aClass1_Sub9Array1[arg0];
			if (local44 == null) {
				this.aBoolean131 = true;
				if (this.anInt1246 < this.anInt1243) {
					local44 = new Class1_Sub9(arg0, this.anInt1246);
					this.anInt1246++;
				} else {
					@Pc(79) Class1_Sub9 local79 = (Class1_Sub9) this.aClass227_5.method4978();
					local44 = new Class1_Sub9(arg0, local79.anInt725);
					this.aClass1_Sub9Array1[local79.anInt722] = null;
					local79.method5915();
				}
				this.aClass1_Sub9Array1[arg0] = local44;
			} else {
				this.aBoolean131 = false;
			}
			this.aClass227_5.method4968(local44);
			return this.anIntArrayArrayArray1[local44.anInt725];
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public void method1089() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt1243; local12++) {
			this.anIntArrayArrayArray1[local12][0] = null;
			this.anIntArrayArrayArray1[local12][1] = null;
			this.anIntArrayArrayArray1[local12][2] = null;
			this.anIntArrayArrayArray1[local12] = null;
		}
		this.anIntArrayArrayArray1 = null;
		this.aClass1_Sub9Array1 = null;
		this.aClass227_5.method4981();
		this.aClass227_5 = null;
	}
}

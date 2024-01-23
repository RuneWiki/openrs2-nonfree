import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class21 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	private int anInt915 = -1;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	private int anInt923 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!ab;")
	private Class3 aClass3_5 = new Class3();

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "[Lclient!ki;")
	private Class1_Sub17[] aClass1_Sub17Array1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(III)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt918 = arg0;
		this.anInt920 = arg1;
		this.anIntArrayArrayArray4 = new int[this.anInt918][3][arg2];
		this.aClass1_Sub17Array1 = new Class1_Sub17[this.anInt920];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public void method586() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt918; local3++) {
			this.anIntArrayArrayArray4[local3][0] = null;
			this.anIntArrayArrayArray4[local3][1] = null;
			this.anIntArrayArrayArray4[local3][2] = null;
			this.anIntArrayArrayArray4[local3] = null;
		}
		this.aClass1_Sub17Array1 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass3_5.method29();
		this.aClass3_5 = null;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)[[[I")
	public int[][][] method588() {
		if (this.anInt918 != this.anInt920) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt918; local21++) {
			this.aClass1_Sub17Array1[local21] = Static44.aClass1_Sub17_1;
		}
		return this.anIntArrayArrayArray4;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[[I")
	public int[][] method589(@OriginalArg(1) int arg0) {
		if (this.anInt918 == this.anInt920) {
			this.aBoolean48 = this.aClass1_Sub17Array1[arg0] == null;
			this.aClass1_Sub17Array1[arg0] = Static44.aClass1_Sub17_1;
			return this.anIntArrayArrayArray4[arg0];
		} else if (this.anInt918 == 1) {
			this.aBoolean48 = this.anInt915 != arg0;
			this.anInt915 = arg0;
			return this.anIntArrayArrayArray4[0];
		} else {
			@Pc(46) Class1_Sub17 local46 = this.aClass1_Sub17Array1[arg0];
			if (local46 == null) {
				this.aBoolean48 = true;
				if (this.anInt918 > this.anInt923) {
					local46 = new Class1_Sub17(arg0, this.anInt923);
					this.anInt923++;
				} else {
					@Pc(82) Class1_Sub17 local82 = (Class1_Sub17) this.aClass3_5.method32();
					local46 = new Class1_Sub17(arg0, local82.anInt3181);
					this.aClass1_Sub17Array1[local82.anInt3180] = null;
					local82.method4186();
				}
				this.aClass1_Sub17Array1[arg0] = local46;
			} else {
				this.aBoolean48 = false;
			}
			this.aClass3_5.method31(local46);
			return this.anIntArrayArrayArray4[local46.anInt3181];
		}
	}
}

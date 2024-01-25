import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class175 {

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
	private int anInt5034 = 0;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
	private int anInt5040 = -1;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "Lclient!ar;")
	private Class14 aClass14_37 = new Class14();

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
	private final int anInt5039;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
	private final int anInt5035;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "[Lclient!o;")
	private Class2_Sub29[] aClass2_Sub29Array1;

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(III)V")
	public Class175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5039 = arg1;
		this.anInt5035 = arg0;
		this.aClass2_Sub29Array1 = new Class2_Sub29[this.anInt5039];
		this.anIntArrayArrayArray8 = new int[this.anInt5035][3][arg2];
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	public void method4049() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5035; local3++) {
			this.anIntArrayArrayArray8[local3][0] = null;
			this.anIntArrayArrayArray8[local3][1] = null;
			this.anIntArrayArrayArray8[local3][2] = null;
			this.anIntArrayArrayArray8[local3] = null;
		}
		this.aClass2_Sub29Array1 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass14_37.method305();
		this.aClass14_37 = null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)[[I")
	public int[][] method4051(@OriginalArg(0) int arg0) {
		if (this.anInt5035 == this.anInt5039) {
			this.aBoolean375 = this.aClass2_Sub29Array1[arg0] == null;
			this.aClass2_Sub29Array1[arg0] = Static289.aClass2_Sub29_1;
			return this.anIntArrayArrayArray8[arg0];
		} else if (this.anInt5035 == 1) {
			this.aBoolean375 = this.anInt5040 != arg0;
			this.anInt5040 = arg0;
			return this.anIntArrayArrayArray8[0];
		} else {
			@Pc(47) Class2_Sub29 local47 = this.aClass2_Sub29Array1[arg0];
			if (local47 == null) {
				this.aBoolean375 = true;
				if (this.anInt5035 <= this.anInt5034) {
					@Pc(67) Class2_Sub29 local67 = (Class2_Sub29) this.aClass14_37.method302();
					local47 = new Class2_Sub29(arg0, local67.anInt5046);
					this.aClass2_Sub29Array1[local67.anInt5047] = null;
					local67.method5866();
				} else {
					local47 = new Class2_Sub29(arg0, this.anInt5034);
					this.anInt5034++;
				}
				this.aClass2_Sub29Array1[arg0] = local47;
			} else {
				this.aBoolean375 = false;
			}
			this.aClass14_37.method308(local47);
			return this.anIntArrayArrayArray8[local47.anInt5046];
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)[[[I")
	public int[][][] method4052() {
		if (this.anInt5035 != this.anInt5039) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt5035; local22++) {
			this.aClass2_Sub29Array1[local22] = Static289.aClass2_Sub29_1;
		}
		return this.anIntArrayArrayArray8;
	}
}

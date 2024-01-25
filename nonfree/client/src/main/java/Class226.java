import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class226 {

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
	private int anInt6821 = -1;

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
	private int anInt6827 = 0;

	@OriginalMember(owner = "client!pba", name = "m", descriptor = "Lclient!eea;")
	private Class71 aClass71_54 = new Class71();

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "Z")
	public boolean aBoolean434 = false;

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
	private final int anInt6826;

	@OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
	private final int anInt6828;

	@OriginalMember(owner = "client!pba", name = "o", descriptor = "[Lclient!ak;")
	private Class3_Sub2[] aClass3_Sub2Array1;

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(III)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6826 = arg1;
		this.anInt6828 = arg0;
		this.aClass3_Sub2Array1 = new Class3_Sub2[this.anInt6826];
		this.anIntArrayArrayArray13 = new int[this.anInt6828][3][arg2];
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)[[[I")
	public int[][][] method5722() {
		if (this.anInt6828 != this.anInt6826) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6828; local17++) {
			this.aClass3_Sub2Array1[local17] = Static110.aClass3_Sub2_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)[[I")
	public int[][] method5724(@OriginalArg(0) int arg0) {
		if (this.anInt6826 == this.anInt6828) {
			this.aBoolean434 = this.aClass3_Sub2Array1[arg0] == null;
			this.aClass3_Sub2Array1[arg0] = Static110.aClass3_Sub2_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt6828 == 1) {
			this.aBoolean434 = this.anInt6821 != arg0;
			this.anInt6821 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(68) Class3_Sub2 local68 = this.aClass3_Sub2Array1[arg0];
			if (local68 == null) {
				this.aBoolean434 = true;
				if (this.anInt6827 >= this.anInt6828) {
					@Pc(91) Class3_Sub2 local91 = (Class3_Sub2) this.aClass71_54.method2081();
					local68 = new Class3_Sub2(arg0, local91.anInt626);
					this.aClass3_Sub2Array1[local91.anInt629] = null;
					local91.method7820();
				} else {
					local68 = new Class3_Sub2(arg0, this.anInt6827);
					this.anInt6827++;
				}
				this.aClass3_Sub2Array1[arg0] = local68;
			} else {
				this.aBoolean434 = false;
			}
			this.aClass71_54.method2080(local68);
			return this.anIntArrayArrayArray13[local68.anInt626];
		}
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)V")
	public void method5725() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6828; local3++) {
			this.anIntArrayArrayArray13[local3][0] = null;
			this.anIntArrayArrayArray13[local3][1] = null;
			this.anIntArrayArrayArray13[local3][2] = null;
			this.anIntArrayArrayArray13[local3] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass3_Sub2Array1 = null;
		this.aClass71_54.method2088();
		this.aClass71_54 = null;
	}
}

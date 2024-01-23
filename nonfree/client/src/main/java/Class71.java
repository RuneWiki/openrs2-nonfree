import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class71 {

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	private int anInt2081 = -1;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	private int anInt2079 = 0;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!jo;")
	private Class96 aClass96_6 = new Class96();

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	private int anInt2088;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "[Lclient!pg;")
	private Class1_Sub24[] aClass1_Sub24Array1;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	private int anInt2089;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2088 = arg1;
		this.aClass1_Sub24Array1 = new Class1_Sub24[this.anInt2088];
		this.anInt2089 = arg0;
		this.anIntArrayArrayArray7 = new int[this.anInt2089][3][arg2];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)[[I")
	public int[][] method1894(@OriginalArg(0) int arg0) {
		if (this.anInt2089 == this.anInt2088) {
			this.aBoolean190 = this.aClass1_Sub24Array1[arg0] == null;
			this.aClass1_Sub24Array1[arg0] = Static107.aClass1_Sub24_1;
			return this.anIntArrayArrayArray7[arg0];
		} else if (this.anInt2089 == 1) {
			this.aBoolean190 = arg0 != this.anInt2081;
			this.anInt2081 = arg0;
			return this.anIntArrayArrayArray7[0];
		} else {
			@Pc(67) Class1_Sub24 local67 = this.aClass1_Sub24Array1[arg0];
			if (local67 == null) {
				this.aBoolean190 = true;
				if (this.anInt2089 > this.anInt2079) {
					local67 = new Class1_Sub24(arg0, this.anInt2079);
					this.anInt2079++;
				} else {
					@Pc(108) Class1_Sub24 local108 = (Class1_Sub24) this.aClass96_6.method2345();
					local67 = new Class1_Sub24(arg0, local108.anInt4022);
					this.aClass1_Sub24Array1[local108.anInt4025] = null;
					local108.method4573();
				}
				this.aClass1_Sub24Array1[arg0] = local67;
			} else {
				this.aBoolean190 = false;
			}
			this.aClass96_6.method2337(local67);
			return this.anIntArrayArrayArray7[local67.anInt4022];
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method1897() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2089; local3++) {
			this.anIntArrayArrayArray7[local3][0] = null;
			this.anIntArrayArrayArray7[local3][1] = null;
			this.anIntArrayArrayArray7[local3][2] = null;
			this.anIntArrayArrayArray7[local3] = null;
		}
		this.aClass1_Sub24Array1 = null;
		this.anIntArrayArrayArray7 = null;
		this.aClass96_6.method2341();
		this.aClass96_6 = null;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)[[[I")
	public int[][][] method1898() {
		if (this.anInt2088 != this.anInt2089) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2089; local17++) {
			this.aClass1_Sub24Array1[local17] = Static107.aClass1_Sub24_1;
		}
		return this.anIntArrayArrayArray7;
	}
}

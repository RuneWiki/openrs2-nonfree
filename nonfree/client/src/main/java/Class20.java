import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class20 {

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	private int anInt546 = -1;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private int anInt548 = 0;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!wo;")
	private Class266 aClass266_7 = new Class266();

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Z")
	public boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private final int anInt550;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	private final int anInt545;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[Lclient!ks;")
	private Class1_Sub22[] aClass1_Sub22Array1;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(III)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt550 = arg1;
		this.anInt545 = arg0;
		this.aClass1_Sub22Array1 = new Class1_Sub22[this.anInt550];
		this.anIntArrayArrayArray1 = new int[this.anInt545][3][arg2];
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method473() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt545; local3++) {
			this.anIntArrayArrayArray1[local3][0] = null;
			this.anIntArrayArrayArray1[local3][1] = null;
			this.anIntArrayArrayArray1[local3][2] = null;
			this.anIntArrayArrayArray1[local3] = null;
		}
		this.anIntArrayArrayArray1 = null;
		this.aClass1_Sub22Array1 = null;
		this.aClass266_7.method6004();
		this.aClass266_7 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[[I")
	public int[][] method474(@OriginalArg(0) int arg0) {
		if (this.anInt545 == this.anInt550) {
			this.aBoolean14 = this.aClass1_Sub22Array1[arg0] == null;
			this.aClass1_Sub22Array1[arg0] = Static372.aClass1_Sub22_3;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt545 == 1) {
			this.aBoolean14 = arg0 != this.anInt546;
			this.anInt546 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(65) Class1_Sub22 local65 = this.aClass1_Sub22Array1[arg0];
			if (local65 == null) {
				this.aBoolean14 = true;
				if (this.anInt548 < this.anInt545) {
					local65 = new Class1_Sub22(arg0, this.anInt548);
					this.anInt548++;
				} else {
					@Pc(101) Class1_Sub22 local101 = (Class1_Sub22) this.aClass266_7.method6005();
					local65 = new Class1_Sub22(arg0, local101.anInt3948);
					this.aClass1_Sub22Array1[local101.anInt3949] = null;
					local101.method6071();
				}
				this.aClass1_Sub22Array1[arg0] = local65;
			} else {
				this.aBoolean14 = false;
			}
			this.aClass266_7.method5997(local65);
			return this.anIntArrayArrayArray1[local65.anInt3948];
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)[[[I")
	public int[][][] method476() {
		if (this.anInt545 != this.anInt550) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt545; local21++) {
			this.aClass1_Sub22Array1[local21] = Static372.aClass1_Sub22_3;
		}
		return this.anIntArrayArrayArray1;
	}
}

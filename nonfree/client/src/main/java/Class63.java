import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class63 {

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
	private int anInt1381 = 0;

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
	private int anInt1391 = -1;

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "Lclient!aq;")
	private Class16 aClass16_16 = new Class16();

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "Z")
	public boolean aBoolean85 = false;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
	private final int anInt1379;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	private final int anInt1387;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "[Lclient!p;")
	private Class11_Sub31[] aClass11_Sub31Array1;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(III)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1379 = arg0;
		this.anInt1387 = arg1;
		this.aClass11_Sub31Array1 = new Class11_Sub31[this.anInt1387];
		this.anIntArrayArrayArray1 = new int[this.anInt1379][3][arg2];
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public void method1117() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1379; local7++) {
			this.anIntArrayArrayArray1[local7][0] = null;
			this.anIntArrayArrayArray1[local7][1] = null;
			this.anIntArrayArrayArray1[local7][2] = null;
			this.anIntArrayArrayArray1[local7] = null;
		}
		this.aClass11_Sub31Array1 = null;
		this.anIntArrayArrayArray1 = null;
		this.aClass16_16.method191();
		this.aClass16_16 = null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[[I")
	public int[][] method1118(@OriginalArg(0) int arg0) {
		if (this.anInt1387 == this.anInt1379) {
			this.aBoolean85 = this.aClass11_Sub31Array1[arg0] == null;
			this.aClass11_Sub31Array1[arg0] = Static117.aClass11_Sub31_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt1379 == 1) {
			this.aBoolean85 = this.anInt1391 != arg0;
			this.anInt1391 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(49) Class11_Sub31 local49 = this.aClass11_Sub31Array1[arg0];
			if (local49 == null) {
				this.aBoolean85 = true;
				if (this.anInt1381 >= this.anInt1379) {
					@Pc(70) Class11_Sub31 local70 = (Class11_Sub31) this.aClass16_16.method181();
					local49 = new Class11_Sub31(arg0, local70.anInt4715);
					this.aClass11_Sub31Array1[local70.anInt4716] = null;
					local70.method5701();
				} else {
					local49 = new Class11_Sub31(arg0, this.anInt1381);
					this.anInt1381++;
				}
				this.aClass11_Sub31Array1[arg0] = local49;
			} else {
				this.aBoolean85 = false;
			}
			this.aClass16_16.method186(local49);
			return this.anIntArrayArrayArray1[local49.anInt4715];
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)[[[I")
	public int[][][] method1120() {
		if (this.anInt1379 != this.anInt1387) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt1379; local17++) {
			this.aClass11_Sub31Array1[local17] = Static117.aClass11_Sub31_1;
		}
		return this.anIntArrayArrayArray1;
	}
}

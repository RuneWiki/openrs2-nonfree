import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class51 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt2145 = 0;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt2148 = -1;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!he;")
	private Class44 aClass44_22 = new Class44();

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt2144;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
	private int anInt2155;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "[Lclient!cf;")
	private Class2_Sub8[] aClass2_Sub8Array1;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2144 = arg0;
		this.anInt2155 = arg1;
		this.aClass2_Sub8Array1 = new Class2_Sub8[this.anInt2155];
		this.anIntArrayArrayArray4 = new int[this.anInt2144][3][arg2];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public void method1693() {
		for (@Pc(16) int local16 = 0; local16 < this.anInt2144; local16++) {
			this.anIntArrayArrayArray4[local16][0] = null;
			this.anIntArrayArrayArray4[local16][1] = null;
			this.anIntArrayArrayArray4[local16][2] = null;
			this.anIntArrayArrayArray4[local16] = null;
		}
		this.aClass2_Sub8Array1 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass44_22.method1362();
		this.aClass44_22 = null;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)[[[I")
	public int[][][] method1698() {
		if (this.anInt2144 != this.anInt2155) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt2144; local26++) {
			this.aClass2_Sub8Array1[local26] = Static3.aClass2_Sub8_1;
		}
		return this.anIntArrayArrayArray4;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)[[I")
	public int[][] method1700(@OriginalArg(0) int arg0) {
		if (this.anInt2144 == this.anInt2155) {
			this.aBoolean82 = this.aClass2_Sub8Array1[arg0] == null;
			this.aClass2_Sub8Array1[arg0] = Static3.aClass2_Sub8_1;
			return this.anIntArrayArrayArray4[arg0];
		} else if (this.anInt2144 == 1) {
			this.aBoolean82 = arg0 != this.anInt2148;
			this.anInt2148 = arg0;
			return this.anIntArrayArrayArray4[0];
		} else {
			@Pc(51) Class2_Sub8 local51 = this.aClass2_Sub8Array1[arg0];
			if (local51 == null) {
				this.aBoolean82 = true;
				if (this.anInt2144 <= this.anInt2145) {
					@Pc(71) Class2_Sub8 local71 = (Class2_Sub8) this.aClass44_22.method1366();
					local51 = new Class2_Sub8(arg0, local71.anInt550);
					this.aClass2_Sub8Array1[local71.anInt552] = null;
					local71.method3986();
				} else {
					local51 = new Class2_Sub8(arg0, this.anInt2145);
					this.anInt2145++;
				}
				this.aClass2_Sub8Array1[arg0] = local51;
			} else {
				this.aBoolean82 = false;
			}
			this.aClass44_22.method1354(local51);
			return this.anIntArrayArrayArray4[local51.anInt550];
		}
	}
}

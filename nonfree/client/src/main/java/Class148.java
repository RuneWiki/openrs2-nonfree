import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class148 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	private int anInt4262 = 0;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	private int anInt4266 = -1;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!ps;")
	private Class193 aClass193_37 = new Class193();

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Z")
	public boolean aBoolean309 = false;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private final int anInt4264;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	private final int anInt4263;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[Lclient!vi;")
	private Class3_Sub46[] aClass3_Sub46Array1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(III)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4264 = arg0;
		this.anInt4263 = arg1;
		this.anIntArrayArrayArray9 = new int[this.anInt4264][3][arg2];
		this.aClass3_Sub46Array1 = new Class3_Sub46[this.anInt4263];
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public void method3564() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt4264; local15++) {
			this.anIntArrayArrayArray9[local15][0] = null;
			this.anIntArrayArrayArray9[local15][1] = null;
			this.anIntArrayArrayArray9[local15][2] = null;
			this.anIntArrayArrayArray9[local15] = null;
		}
		this.anIntArrayArrayArray9 = null;
		this.aClass3_Sub46Array1 = null;
		this.aClass193_37.method4524();
		this.aClass193_37 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)[[I")
	public int[][] method3566(@OriginalArg(1) int arg0) {
		if (this.anInt4263 == this.anInt4264) {
			this.aBoolean309 = this.aClass3_Sub46Array1[arg0] == null;
			this.aClass3_Sub46Array1[arg0] = Static109.aClass3_Sub46_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt4264 == 1) {
			this.aBoolean309 = arg0 != this.anInt4266;
			this.anInt4266 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(67) Class3_Sub46 local67 = this.aClass3_Sub46Array1[arg0];
			if (local67 == null) {
				this.aBoolean309 = true;
				if (this.anInt4262 >= this.anInt4264) {
					@Pc(92) Class3_Sub46 local92 = (Class3_Sub46) this.aClass193_37.method4531();
					local67 = new Class3_Sub46(arg0, local92.anInt7258);
					this.aClass3_Sub46Array1[local92.anInt7257] = null;
					local92.method6288();
				} else {
					local67 = new Class3_Sub46(arg0, this.anInt4262);
					this.anInt4262++;
				}
				this.aClass3_Sub46Array1[arg0] = local67;
			} else {
				this.aBoolean309 = false;
			}
			this.aClass193_37.method4522(local67);
			return this.anIntArrayArrayArray9[local67.anInt7258];
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[[[I")
	public int[][][] method3567() {
		if (this.anInt4264 != this.anInt4263) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt4264; local29++) {
			this.aClass3_Sub46Array1[local29] = Static109.aClass3_Sub46_1;
		}
		return this.anIntArrayArrayArray9;
	}
}

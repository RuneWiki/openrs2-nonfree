import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class93 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	private int anInt2930 = 0;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	private int anInt2935 = -1;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!gw;")
	private Class91 aClass91_17 = new Class91();

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Z")
	public boolean aBoolean189 = false;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	private final int anInt2934;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	private final int anInt2929;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lclient!cl;")
	private Class4_Sub8[] aClass4_Sub8Array1;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2934 = arg1;
		this.anInt2929 = arg0;
		this.anIntArrayArrayArray8 = new int[this.anInt2929][3][arg2];
		this.aClass4_Sub8Array1 = new Class4_Sub8[this.anInt2934];
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public void method2619() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2929; local3++) {
			this.anIntArrayArrayArray8[local3][0] = null;
			this.anIntArrayArrayArray8[local3][1] = null;
			this.anIntArrayArrayArray8[local3][2] = null;
			this.anIntArrayArrayArray8[local3] = null;
		}
		this.aClass4_Sub8Array1 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass91_17.method2582();
		this.aClass91_17 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[[I")
	public int[][] method2622(@OriginalArg(0) int arg0) {
		if (this.anInt2929 == this.anInt2934) {
			this.aBoolean189 = this.aClass4_Sub8Array1[arg0] == null;
			this.aClass4_Sub8Array1[arg0] = Static400.aClass4_Sub8_1;
			return this.anIntArrayArrayArray8[arg0];
		} else if (this.anInt2929 == 1) {
			this.aBoolean189 = this.anInt2935 != arg0;
			this.anInt2935 = arg0;
			return this.anIntArrayArrayArray8[0];
		} else {
			@Pc(44) Class4_Sub8 local44 = this.aClass4_Sub8Array1[arg0];
			if (local44 == null) {
				this.aBoolean189 = true;
				if (this.anInt2929 > this.anInt2930) {
					local44 = new Class4_Sub8(arg0, this.anInt2930);
					this.anInt2930++;
				} else {
					@Pc(84) Class4_Sub8 local84 = (Class4_Sub8) this.aClass91_17.method2577();
					local44 = new Class4_Sub8(arg0, local84.anInt1147);
					this.aClass4_Sub8Array1[local84.anInt1145] = null;
					local84.method6330();
				}
				this.aClass4_Sub8Array1[arg0] = local44;
			} else {
				this.aBoolean189 = false;
			}
			this.aClass91_17.method2574(local44);
			return this.anIntArrayArrayArray8[local44.anInt1147];
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)[[[I")
	public int[][][] method2623() {
		if (this.anInt2929 != this.anInt2934) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt2929; local22++) {
			this.aClass4_Sub8Array1[local22] = Static400.aClass4_Sub8_1;
		}
		return this.anIntArrayArrayArray8;
	}
}

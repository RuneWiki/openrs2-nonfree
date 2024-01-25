import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class64 {

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
	private int anInt1936 = -1;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
	private int anInt1937 = 0;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "Lclient!au;")
	private Class22 aClass22_16 = new Class22();

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "Z")
	public boolean aBoolean154 = false;

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
	private final int anInt1941;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
	private final int anInt1940;

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "[Lclient!fn;")
	private Class4_Sub17[] aClass4_Sub17Array1;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(III)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1941 = arg1;
		this.anInt1940 = arg0;
		this.aClass4_Sub17Array1 = new Class4_Sub17[this.anInt1941];
		this.anIntArrayArrayArray3 = new int[this.anInt1940][3][arg2];
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)[[I")
	public int[][] method1614(@OriginalArg(1) int arg0) {
		if (this.anInt1940 == this.anInt1941) {
			this.aBoolean154 = this.aClass4_Sub17Array1[arg0] == null;
			this.aClass4_Sub17Array1[arg0] = Static201.aClass4_Sub17_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt1940 == 1) {
			this.aBoolean154 = arg0 != this.anInt1936;
			this.anInt1936 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(49) Class4_Sub17 local49 = this.aClass4_Sub17Array1[arg0];
			if (local49 == null) {
				this.aBoolean154 = true;
				if (this.anInt1937 < this.anInt1940) {
					local49 = new Class4_Sub17(arg0, this.anInt1937);
					this.anInt1937++;
				} else {
					@Pc(89) Class4_Sub17 local89 = (Class4_Sub17) this.aClass22_16.method885();
					local49 = new Class4_Sub17(arg0, local89.anInt3142);
					this.aClass4_Sub17Array1[local89.anInt3141] = null;
					local89.method8193();
				}
				this.aClass4_Sub17Array1[arg0] = local49;
			} else {
				this.aBoolean154 = false;
			}
			this.aClass22_16.method892(local49);
			return this.anIntArrayArrayArray3[local49.anInt3142];
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public void method1616() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1940; local7++) {
			this.anIntArrayArrayArray3[local7][0] = null;
			this.anIntArrayArrayArray3[local7][1] = null;
			this.anIntArrayArrayArray3[local7][2] = null;
			this.anIntArrayArrayArray3[local7] = null;
		}
		this.anIntArrayArrayArray3 = null;
		this.aClass4_Sub17Array1 = null;
		this.aClass22_16.method886();
		this.aClass22_16 = null;
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)[[[I")
	public int[][][] method1619() {
		if (this.anInt1940 != this.anInt1941) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt1940; local22++) {
			this.aClass4_Sub17Array1[local22] = Static201.aClass4_Sub17_1;
		}
		return this.anIntArrayArrayArray3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class279 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt8206 = -1;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	private int anInt8214 = 0;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!ok;")
	private Class262 aClass262_49 = new Class262();

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Z")
	public boolean aBoolean571 = false;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	private final int anInt8209;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	private final int anInt8212;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[Lclient!ol;")
	private Class14_Sub40[] aClass14_Sub40Array1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(III)V")
	public Class279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8209 = arg1;
		this.anInt8212 = arg0;
		this.anIntArrayArrayArray12 = new int[this.anInt8212][3][arg2];
		this.aClass14_Sub40Array1 = new Class14_Sub40[this.anInt8209];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)[[[I")
	public int[][][] method6837() {
		if (this.anInt8209 != this.anInt8212) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt8212; local22++) {
			this.aClass14_Sub40Array1[local22] = Static474.aClass14_Sub40_2;
		}
		return this.anIntArrayArrayArray12;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public void method6839() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8212; local7++) {
			this.anIntArrayArrayArray12[local7][0] = null;
			this.anIntArrayArrayArray12[local7][1] = null;
			this.anIntArrayArrayArray12[local7][2] = null;
			this.anIntArrayArrayArray12[local7] = null;
		}
		this.aClass14_Sub40Array1 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass262_49.method6316();
		this.aClass262_49 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)[[I")
	public int[][] method6840(@OriginalArg(1) int arg0) {
		if (this.anInt8212 == this.anInt8209) {
			this.aBoolean571 = this.aClass14_Sub40Array1[arg0] == null;
			this.aClass14_Sub40Array1[arg0] = Static474.aClass14_Sub40_2;
			return this.anIntArrayArrayArray12[arg0];
		} else if (this.anInt8212 == 1) {
			this.aBoolean571 = this.anInt8206 != arg0;
			this.anInt8206 = arg0;
			return this.anIntArrayArrayArray12[0];
		} else {
			@Pc(51) Class14_Sub40 local51 = this.aClass14_Sub40Array1[arg0];
			if (local51 == null) {
				this.aBoolean571 = true;
				if (this.anInt8212 > this.anInt8214) {
					local51 = new Class14_Sub40(arg0, this.anInt8214);
					this.anInt8214++;
				} else {
					@Pc(91) Class14_Sub40 local91 = (Class14_Sub40) this.aClass262_49.method6320();
					local51 = new Class14_Sub40(arg0, local91.anInt7712);
					this.aClass14_Sub40Array1[local91.anInt7711] = null;
					local91.method9315();
				}
				this.aClass14_Sub40Array1[arg0] = local51;
			} else {
				this.aBoolean571 = false;
			}
			this.aClass262_49.method6315(local51);
			return this.anIntArrayArrayArray12[local51.anInt7712];
		}
	}
}

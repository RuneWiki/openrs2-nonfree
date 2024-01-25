import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class249 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
	private int anInt6766 = 0;

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
	private int anInt6770 = -1;

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "Lclient!ug;")
	private Class243 aClass243_43 = new Class243();

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Z")
	public boolean aBoolean583 = false;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
	private final int anInt6776;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
	private final int anInt6775;

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "[Lclient!ju;")
	private Class3_Sub27[] aClass3_Sub27Array1;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(III)V")
	public Class249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6776 = arg1;
		this.anInt6775 = arg0;
		this.aClass3_Sub27Array1 = new Class3_Sub27[this.anInt6776];
		this.anIntArrayArrayArray15 = new int[this.anInt6775][3][arg2];
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	public void method5296() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6775; local7++) {
			this.anIntArrayArrayArray15[local7][0] = null;
			this.anIntArrayArrayArray15[local7][1] = null;
			this.anIntArrayArrayArray15[local7][2] = null;
			this.anIntArrayArrayArray15[local7] = null;
		}
		this.anIntArrayArrayArray15 = null;
		this.aClass3_Sub27Array1 = null;
		this.aClass243_43.method5200();
		this.aClass243_43 = null;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)[[[I")
	public int[][][] method5301() {
		if (this.anInt6776 != this.anInt6775) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt6775; local22++) {
			this.aClass3_Sub27Array1[local22] = Static205.aClass3_Sub27_1;
		}
		return this.anIntArrayArrayArray15;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)[[I")
	public int[][] method5303(@OriginalArg(0) int arg0) {
		if (this.anInt6776 == this.anInt6775) {
			this.aBoolean583 = this.aClass3_Sub27Array1[arg0] == null;
			this.aClass3_Sub27Array1[arg0] = Static205.aClass3_Sub27_1;
			return this.anIntArrayArrayArray15[arg0];
		} else if (this.anInt6775 == 1) {
			this.aBoolean583 = arg0 != this.anInt6770;
			this.anInt6770 = arg0;
			return this.anIntArrayArrayArray15[0];
		} else {
			@Pc(46) Class3_Sub27 local46 = this.aClass3_Sub27Array1[arg0];
			if (local46 == null) {
				this.aBoolean583 = true;
				if (this.anInt6775 > this.anInt6766) {
					local46 = new Class3_Sub27(arg0, this.anInt6766);
					this.anInt6766++;
				} else {
					@Pc(81) Class3_Sub27 local81 = (Class3_Sub27) this.aClass243_43.method5207();
					local46 = new Class3_Sub27(arg0, local81.anInt3912);
					this.aClass3_Sub27Array1[local81.anInt3914] = null;
					local81.method5977();
				}
				this.aClass3_Sub27Array1[arg0] = local46;
			} else {
				this.aBoolean583 = false;
			}
			this.aClass243_43.method5209(local46);
			return this.anIntArrayArrayArray15[local46.anInt3912];
		}
	}
}

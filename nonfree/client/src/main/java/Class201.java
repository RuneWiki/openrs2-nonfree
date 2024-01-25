import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class201 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	private int anInt5212 = 0;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
	private int anInt5218 = -1;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Lclient!gj;")
	private Class124 aClass124_27 = new Class124();

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "Z")
	public boolean aBoolean392 = false;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
	private final int anInt5215;

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
	private final int anInt5216;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "[Lclient!kg;")
	private Class4_Sub26[] aClass4_Sub26Array1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(III)V")
	public Class201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5215 = arg0;
		this.anInt5216 = arg1;
		this.anIntArrayArrayArray14 = new int[this.anInt5215][3][arg2];
		this.aClass4_Sub26Array1 = new Class4_Sub26[this.anInt5216];
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)[[[I")
	public int[][][] method4415() {
		if (this.anInt5215 != this.anInt5216) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt5215; local21++) {
			this.aClass4_Sub26Array1[local21] = Static134.aClass4_Sub26_5;
		}
		return this.anIntArrayArrayArray14;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public void method4416() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5215; local7++) {
			this.anIntArrayArrayArray14[local7][0] = null;
			this.anIntArrayArrayArray14[local7][1] = null;
			this.anIntArrayArrayArray14[local7][2] = null;
			this.anIntArrayArrayArray14[local7] = null;
		}
		this.aClass4_Sub26Array1 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass124_27.method3265();
		this.aClass124_27 = null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)[[I")
	public int[][] method4419(@OriginalArg(1) int arg0) {
		if (this.anInt5215 == this.anInt5216) {
			this.aBoolean392 = this.aClass4_Sub26Array1[arg0] == null;
			this.aClass4_Sub26Array1[arg0] = Static134.aClass4_Sub26_5;
			return this.anIntArrayArrayArray14[arg0];
		} else if (this.anInt5215 == 1) {
			this.aBoolean392 = arg0 != this.anInt5218;
			this.anInt5218 = arg0;
			return this.anIntArrayArrayArray14[0];
		} else {
			@Pc(52) Class4_Sub26 local52 = this.aClass4_Sub26Array1[arg0];
			if (local52 == null) {
				this.aBoolean392 = true;
				if (this.anInt5215 <= this.anInt5212) {
					@Pc(73) Class4_Sub26 local73 = (Class4_Sub26) this.aClass124_27.method3274();
					local52 = new Class4_Sub26(arg0, local73.anInt5160);
					this.aClass4_Sub26Array1[local73.anInt5159] = null;
					local73.method8013();
				} else {
					local52 = new Class4_Sub26(arg0, this.anInt5212);
					this.anInt5212++;
				}
				this.aClass4_Sub26Array1[arg0] = local52;
			} else {
				this.aBoolean392 = false;
			}
			this.aClass124_27.method3268(local52);
			return this.anIntArrayArrayArray14[local52.anInt5160];
		}
	}
}

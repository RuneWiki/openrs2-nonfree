import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class291 {

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "F")
	public float aFloat157 = 1.0F;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "F")
	public float aFloat158 = 0.25F;

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "F")
	public float aFloat159 = 1.0F;

	@OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
	public final int anInt8326;

	@OriginalMember(owner = "client!rea", name = "u", descriptor = "F")
	public final float aFloat161;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "F")
	public final float aFloat156;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
	public final int anInt8322;

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "Lclient!he;")
	public final Class141 aClass141_4;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
	public final int anInt8324;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
	public final int anInt8318;

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
	public final int anInt8321;

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "F")
	public final float aFloat160;

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
	public final int anInt8319;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
	public Class291() {
		this.anInt8326 = Static569.anInt9378;
		this.aFloat161 = 1.2F;
		this.aFloat156 = 0.69921875F;
		this.anInt8322 = 0;
		this.aClass141_4 = Static429.aClass141_2;
		this.anInt8324 = -50;
		this.anInt8318 = -60;
		this.anInt8321 = Static95.anInt1911;
		this.aFloat160 = 1.1523438F;
		this.anInt8319 = -50;
	}

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class291(@OriginalArg(0) Class3_Sub9 arg0) {
		@Pc(16) int local16 = arg0.method5633();
		if (Static32.aClass3_Sub41_3.aClass7_Sub6_1.method3237() == 1 && Static511.aClass82_16.method6131() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt8326 = Static569.anInt9378;
			} else {
				this.anInt8326 = arg0.method5585();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat160 = 1.1523438F;
			} else {
				this.aFloat160 = (float) arg0.method5610() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat156 = 0.69921875F;
			} else {
				this.aFloat156 = (float) arg0.method5610() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat161 = 1.2F;
			} else {
				this.aFloat161 = (float) arg0.method5610() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5585();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5610();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5610();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5610();
			}
			this.aFloat156 = 0.69921875F;
			this.aFloat161 = 1.2F;
			this.aFloat160 = 1.1523438F;
			this.anInt8326 = Static569.anInt9378;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt8318 = -60;
			this.anInt8324 = -50;
			this.anInt8319 = -50;
		} else {
			this.anInt8319 = arg0.method5624();
			this.anInt8318 = arg0.method5624();
			this.anInt8324 = arg0.method5624();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt8321 = Static95.anInt1911;
		} else {
			this.anInt8321 = arg0.method5585();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt8322 = 0;
		} else {
			this.anInt8322 = arg0.method5610();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass141_4 = Static429.aClass141_2;
		} else {
			@Pc(211) int local211 = arg0.method5610();
			@Pc(215) int local215 = arg0.method5610();
			@Pc(219) int local219 = arg0.method5610();
			@Pc(223) int local223 = arg0.method5610();
			@Pc(227) int local227 = arg0.method5610();
			@Pc(231) int local231 = arg0.method5610();
			this.aClass141_4 = Static636.method8569(local219, local227, local211, local223, local215, local231);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!rea;)Z")
	public boolean method7194(@OriginalArg(1) Class291 arg0) {
		return this.anInt8326 == arg0.anInt8326 && this.aFloat160 == arg0.aFloat160 && this.aFloat156 == arg0.aFloat156 && this.aFloat161 == arg0.aFloat161 && arg0.aFloat158 == this.aFloat158 && arg0.aFloat157 == this.aFloat157 && arg0.aFloat159 == this.aFloat159 && arg0.anInt8321 == this.anInt8321 && this.anInt8322 == arg0.anInt8322 && arg0.aClass141_4 == this.aClass141_4;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!dc;)V")
	public void method7196(@OriginalArg(1) Class3_Sub9 arg0) {
		this.aFloat157 = (float) (arg0.method5633() * 8) / 255.0F;
		this.aFloat158 = (float) (arg0.method5633() * 8) / 255.0F;
		this.aFloat159 = (float) (arg0.method5633() * 8) / 255.0F;
	}
}

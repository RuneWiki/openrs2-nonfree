import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class216 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "F")
	public float aFloat173 = 1.0F;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "F")
	public float aFloat175 = 1.0F;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "F")
	public float aFloat177 = 0.25F;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public final int anInt6016;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
	public final int anInt6025;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public final int anInt6024;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!jt;")
	public final Class37 aClass37_5;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "F")
	public final float aFloat172;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public final int anInt6023;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public final int anInt6020;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "F")
	public final float aFloat174;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "F")
	public final float aFloat176;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	public final int anInt6019;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class216() {
		this.anInt6016 = -60;
		this.anInt6025 = 0;
		this.anInt6024 = Static218.anInt5033;
		this.aClass37_5 = Static78.aClass37_8;
		this.aFloat172 = 1.2F;
		this.anInt6023 = -50;
		this.anInt6020 = -50;
		this.aFloat174 = 1.1523438F;
		this.aFloat176 = 0.69921875F;
		this.anInt6019 = Static481.anInt8211;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class216(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(16) int local16 = arg0.method4325();
		if (Static72.aClass2_Sub12_Sub1_1.method1408(Static391.anInt6846) && Static312.aClass100_7.method6185() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6024 = Static218.anInt5033;
			} else {
				this.anInt6024 = arg0.method4307();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat174 = 1.1523438F;
			} else {
				this.aFloat174 = (float) arg0.method4294() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat176 = 0.69921875F;
			} else {
				this.aFloat176 = (float) arg0.method4294() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat172 = 1.2F;
			} else {
				this.aFloat172 = (float) arg0.method4294() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4307();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4294();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4294();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4294();
			}
			this.aFloat174 = 1.1523438F;
			this.aFloat176 = 0.69921875F;
			this.aFloat172 = 1.2F;
			this.anInt6024 = Static218.anInt5033;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6020 = -50;
			this.anInt6016 = -60;
			this.anInt6023 = -50;
		} else {
			this.anInt6020 = arg0.method4334();
			this.anInt6016 = arg0.method4334();
			this.anInt6023 = arg0.method4334();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6019 = Static481.anInt8211;
		} else {
			this.anInt6019 = arg0.method4307();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6025 = 0;
		} else {
			this.anInt6025 = arg0.method4294();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass37_5 = Static78.aClass37_8;
		} else {
			@Pc(216) int local216 = arg0.method4294();
			@Pc(220) int local220 = arg0.method4294();
			@Pc(224) int local224 = arg0.method4294();
			@Pc(228) int local228 = arg0.method4294();
			@Pc(232) int local232 = arg0.method4294();
			@Pc(236) int local236 = arg0.method4294();
			this.aClass37_5 = Static583.method7914(local216, local228, local232, local236, local224, local220);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!mc;)Z")
	public boolean method5008(@OriginalArg(1) Class216 arg0) {
		return this.anInt6024 == arg0.anInt6024 && this.aFloat174 == arg0.aFloat174 && this.aFloat176 == arg0.aFloat176 && arg0.aFloat172 == this.aFloat172 && this.aFloat177 == arg0.aFloat177 && arg0.aFloat175 == this.aFloat175 && this.aFloat173 == arg0.aFloat173 && this.anInt6019 == arg0.anInt6019 && arg0.anInt6025 == this.anInt6025 && this.aClass37_5 == arg0.aClass37_5;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!es;)V")
	public void method5009(@OriginalArg(1) Class2_Sub15 arg0) {
		this.aFloat175 = (float) (arg0.method4325() * 8) / 255.0F;
		this.aFloat177 = (float) (arg0.method4325() * 8) / 255.0F;
		this.aFloat173 = (float) (arg0.method4325() * 8) / 255.0F;
	}
}

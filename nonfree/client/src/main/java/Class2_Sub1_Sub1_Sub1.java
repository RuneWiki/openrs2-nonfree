import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AMMGDAXD")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!AMMGDAXD", name = "u", descriptor = "I")
	private int anInt14;

	@OriginalMember(owner = "client!AMMGDAXD", name = "v", descriptor = "I")
	private int anInt15;

	@OriginalMember(owner = "client!AMMGDAXD", name = "l", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!AMMGDAXD", name = "r", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!AMMGDAXD", name = "t", descriptor = "Lclient!HTOEUNMD;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!AMMGDAXD", name = "m", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!AMMGDAXD", name = "n", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!AMMGDAXD", name = "o", descriptor = "I")
	public int anInt11;

	@OriginalMember(owner = "client!AMMGDAXD", name = "p", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!AMMGDAXD", name = "q", descriptor = "I")
	public int anInt13;

	@OriginalMember(owner = "client!AMMGDAXD", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass16_1 = Class16.aClass16Array1[arg2];
			this.anInt9 = arg4;
			this.anInt10 = arg7;
			this.anInt11 = arg3;
			this.anInt12 = arg0;
			this.anInt13 = arg1 + arg6;
			this.aBoolean11 = false;
			if (arg5 != -17889) {
				this.aBoolean12 = !this.aBoolean12;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("52775, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AMMGDAXD", name = "a", descriptor = "(II)V")
	public void method15(@OriginalArg(1) int arg0) {
		try {
			this.anInt15 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt15 <= this.aClass16_1.aClass22_2.method277(this.anInt14)) {
							return;
						}
						this.anInt15 -= this.aClass16_1.aClass22_2.method277(this.anInt14) + 1;
						this.anInt14++;
					} while (this.anInt14 < this.aClass16_1.aClass22_2.anInt372);
				} while (this.anInt14 >= 0 && this.anInt14 < this.aClass16_1.aClass22_2.anInt372);
				this.anInt14 = 0;
				this.aBoolean11 = true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("14108, " + -149 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AMMGDAXD", name = "a", descriptor = "(I)Lclient!OGORHYVW;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method565() {
		try {
			@Pc(3) Class2_Sub1_Sub1_Sub6 local3 = this.aClass16_1.method151();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass16_1.aClass22_2.anIntArray92[this.anInt14];
			@Pc(26) Class2_Sub1_Sub1_Sub6 local26 = new Class2_Sub1_Sub1_Sub6(-18434, true, local3, Class29.method419(local15), false);
			if (!this.aBoolean11) {
				local26.method392();
				local26.method393((byte) 9, local15);
				local26.anIntArrayArray16 = null;
				local26.anIntArrayArray15 = null;
			}
			if (this.aClass16_1.anInt241 != 128 || this.aClass16_1.anInt242 != 128) {
				local26.method401(this.aClass16_1.anInt241, this.aClass16_1.anInt241, this.aClass16_1.anInt242);
			}
			if (this.aClass16_1.anInt243 != 0) {
				if (this.aClass16_1.anInt243 == 90) {
					local26.method396();
				}
				if (this.aClass16_1.anInt243 == 180) {
					local26.method396();
					local26.method396();
				}
				if (this.aClass16_1.anInt243 == 270) {
					local26.method396();
					local26.method396();
					local26.method396();
				}
			}
			local26.method402(this.aClass16_1.anInt244 + 64, this.aClass16_1.anInt245 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("9611, " + 0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZVYASFEK")
public final class Class4_Sub1_Sub2_Sub6 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZVYASFEK", name = "r", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!ZVYASFEK", name = "s", descriptor = "I")
	private int anInt805;

	@OriginalMember(owner = "client!ZVYASFEK", name = "p", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ZVYASFEK", name = "q", descriptor = "Lclient!JXKRPXFX;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!ZVYASFEK", name = "l", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!ZVYASFEK", name = "m", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!ZVYASFEK", name = "n", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!ZVYASFEK", name = "o", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!ZVYASFEK", name = "t", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!ZVYASFEK", name = "<init>", descriptor = "(IIIIIBII)V")
	public Class4_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass16_2 = Class16.aClass16Array1[arg6];
			this.anInt800 = arg3;
			this.anInt801 = arg0;
			this.anInt802 = arg7;
			this.anInt803 = arg4;
			this.anInt806 = arg2 + arg1;
			this.aBoolean213 = false;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("65012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZVYASFEK", name = "a", descriptor = "(B)Lclient!KUGNQTGL;")
	@Override
	protected Class4_Sub1_Sub2_Sub3 method575() {
		try {
			@Pc(3) Class4_Sub1_Sub2_Sub3 local3 = this.aClass16_2.method215();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass16_2.aClass27_2.anIntArray95[this.anInt804];
			@Pc(32) Class4_Sub1_Sub2_Sub3 local32 = new Class4_Sub1_Sub2_Sub3(local3, false, true, Class37.method388(local15), 584);
			if (!this.aBoolean213) {
				local32.method262();
				local32.method263(local15);
				local32.anIntArrayArray3 = null;
				local32.anIntArrayArray2 = null;
			}
			if (this.aClass16_2.anInt184 != 128 || this.aClass16_2.anInt185 != 128) {
				local32.method271(this.aClass16_2.anInt184, this.aClass16_2.anInt184, this.aClass16_2.anInt185);
			}
			if (this.aClass16_2.anInt186 != 0) {
				if (this.aClass16_2.anInt186 == 90) {
					local32.method266();
				}
				if (this.aClass16_2.anInt186 == 180) {
					local32.method266();
					local32.method266();
				}
				if (this.aClass16_2.anInt186 == 270) {
					local32.method266();
					local32.method266();
					local32.method266();
				}
			}
			local32.method272(this.aClass16_2.anInt187 + 64, this.aClass16_2.anInt188 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("44747, " + 0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZVYASFEK", name = "a", descriptor = "(IB)V")
	public void method576(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			this.anInt805 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt805 <= this.aClass16_2.aClass27_2.method330(this.anInt804)) {
							return;
						}
						this.anInt805 -= this.aClass16_2.aClass27_2.method330(this.anInt804);
						this.anInt804++;
					} while (this.anInt804 < this.aClass16_2.aClass27_2.anInt366);
				} while (this.anInt804 >= 0 && this.anInt804 < this.aClass16_2.aClass27_2.anInt366);
				this.anInt804 = 0;
				this.aBoolean213 = true;
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("10674, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}

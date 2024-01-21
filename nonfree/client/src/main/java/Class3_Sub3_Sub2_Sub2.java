import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CMOSDPGZ")
public final class Class3_Sub3_Sub2_Sub2 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!CMOSDPGZ", name = "o", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "p", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "m", descriptor = "I")
	private int anInt160 = -215;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "n", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "r", descriptor = "Z")
	private boolean aBoolean36 = true;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "s", descriptor = "I")
	private int anInt163 = 36073;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "q", descriptor = "Lclient!XBHNZKGU;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "t", descriptor = "I")
	public int anInt164;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "u", descriptor = "I")
	public int anInt165;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "v", descriptor = "I")
	public int anInt166;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "w", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "x", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!CMOSDPGZ", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class3_Sub3_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass43_1 = Class43.aClass43Array1[arg4];
			this.anInt164 = arg5;
			this.anInt165 = arg1;
			this.anInt166 = arg7;
			this.anInt167 = arg0;
			this.anInt168 = arg2 + arg6;
			this.aBoolean35 = false;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("17180, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMOSDPGZ", name = "a", descriptor = "(II)V")
	public void method65(@OriginalArg(1) int arg0) {
		try {
			this.anInt162 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt162 <= this.aClass43_1.aClass46_1.method520(this.anInt161)) {
							return;
						}
						this.anInt162 -= this.aClass43_1.aClass46_1.method520(this.anInt161) + 1;
						this.anInt161++;
					} while (this.anInt161 < this.aClass43_1.aClass46_1.anInt780);
				} while (this.anInt161 >= 0 && this.anInt161 < this.aClass43_1.aClass46_1.anInt780);
				this.anInt161 = 0;
				this.aBoolean35 = true;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("98795, " + 11509 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMOSDPGZ", name = "a", descriptor = "(I)Lclient!FCIDIKVY;")
	@Override
	protected Class3_Sub3_Sub2_Sub3 method525() {
		try {
			@Pc(3) Class3_Sub3_Sub2_Sub3 local3 = this.aClass43_1.method516();
			if (local3 == null) {
				return null;
			}
			@Pc(20) int local20 = this.aClass43_1.aClass46_1.anIntArray198[this.anInt161];
			@Pc(31) Class3_Sub3_Sub2_Sub3 local31 = new Class3_Sub3_Sub2_Sub3(false, Class12.method116(local20), true, local3, true);
			if (!this.aBoolean35) {
				local31.method87();
				local31.method88(local20);
				local31.anIntArrayArray3 = null;
				local31.anIntArrayArray2 = null;
			}
			if (this.aClass43_1.anInt758 != 128 || this.aClass43_1.anInt759 != 128) {
				local31.method96(this.aClass43_1.anInt758, this.aClass43_1.anInt758, this.aBoolean36, this.aClass43_1.anInt759);
			}
			if (this.aClass43_1.anInt760 != 0) {
				if (this.aClass43_1.anInt760 == 90) {
					local31.method91();
				}
				if (this.aClass43_1.anInt760 == 180) {
					local31.method91();
					local31.method91();
				}
				if (this.aClass43_1.anInt760 == 270) {
					local31.method91();
					local31.method91();
					local31.method91();
				}
			}
			local31.method97(this.aClass43_1.anInt761 + 64, this.aClass43_1.anInt762 + 850, -30, -50, -30, true);
			return local31;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("86324, " + 0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}
}

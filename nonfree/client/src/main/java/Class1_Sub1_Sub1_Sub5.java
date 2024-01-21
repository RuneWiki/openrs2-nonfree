import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PEKVALKR")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!PEKVALKR", name = "l", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!PEKVALKR", name = "m", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!PEKVALKR", name = "s", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!PEKVALKR", name = "t", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!PEKVALKR", name = "n", descriptor = "Lclient!RTDMFIDA;")
	private Class34 aClass34_2;

	@OriginalMember(owner = "client!PEKVALKR", name = "o", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!PEKVALKR", name = "p", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!PEKVALKR", name = "q", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!PEKVALKR", name = "r", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!PEKVALKR", name = "k", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!PEKVALKR", name = "<init>", descriptor = "(ZIIIIIII)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass34_2 = Class34.aClass34Array1[arg3];
			this.anInt505 = arg1;
			this.anInt506 = arg7;
			this.anInt507 = arg4;
			this.anInt508 = arg6;
			this.anInt502 = arg5 + arg2;
			this.aBoolean106 = false;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("34393, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PEKVALKR", name = "a", descriptor = "(Z)Lclient!IYSWJGDE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method513() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub3 local3 = this.aClass34_2.method390();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass34_2.aClass19_2.anIntArray99[this.anInt503];
			@Pc(32) Class1_Sub1_Sub1_Sub3 local32 = new Class1_Sub1_Sub1_Sub3(Class30.method334(local15), local3, 946, true, false);
			if (!this.aBoolean106) {
				local32.method154();
				local32.method155(local15);
				local32.anIntArrayArray8 = null;
				local32.anIntArrayArray7 = null;
			}
			if (this.aClass34_2.anInt584 != 128 || this.aClass34_2.anInt585 != 128) {
				local32.method163(this.aClass34_2.anInt584, this.aClass34_2.anInt584, this.aClass34_2.anInt585);
			}
			if (this.aClass34_2.anInt586 != 0) {
				if (this.aClass34_2.anInt586 == 90) {
					local32.method158();
				}
				if (this.aClass34_2.anInt586 == 180) {
					local32.method158();
					local32.method158();
				}
				if (this.aClass34_2.anInt586 == 270) {
					local32.method158();
					local32.method158();
					local32.method158();
				}
			}
			local32.method164(this.aClass34_2.anInt587 + 64, this.aClass34_2.anInt588 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("14294, " + true + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PEKVALKR", name = "a", descriptor = "(IZ)V")
	public void method321(@OriginalArg(0) int arg0) {
		try {
			this.anInt504 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt504 <= this.aClass34_2.aClass19_2.method193(this.anInt503)) {
							return;
						}
						this.anInt504 -= this.aClass34_2.aClass19_2.method193(this.anInt503) + 1;
						this.anInt503++;
					} while (this.anInt503 < this.aClass34_2.aClass19_2.anInt211);
				} while (this.anInt503 >= 0 && this.anInt503 < this.aClass34_2.aClass19_2.anInt211);
				this.anInt503 = 0;
				this.aBoolean106 = true;
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("17567, " + arg0 + ", " + true + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}

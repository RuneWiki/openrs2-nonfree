import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XTUDEFUJ")
public final class Class2_Sub1_Sub3_Sub6 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!XTUDEFUJ", name = "o", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "p", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "v", descriptor = "I")
	private int anInt738;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "m", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "n", descriptor = "Z")
	public boolean aBoolean206 = false;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "u", descriptor = "Lclient!TGYZPJQJ;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "q", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "r", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "s", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "t", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "l", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!XTUDEFUJ", name = "<init>", descriptor = "(IZIIIIII)V")
	public Class2_Sub1_Sub3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass37_2 = Class37.aClass37Array1[arg0];
			this.anInt734 = arg6;
			this.anInt735 = arg4;
			this.anInt736 = arg2;
			this.anInt737 = arg5;
			this.anInt731 = arg7 + arg3;
			this.aBoolean206 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("30394, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTUDEFUJ", name = "a", descriptor = "(ZI)V")
	public void method511(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			this.anInt733 += arg1;
			while (true) {
				do {
					do {
						if (this.anInt733 <= this.aClass37_2.aClass23_2.method235(this.anInt732, this.anInt738)) {
							return;
						}
						this.anInt733 -= this.aClass37_2.aClass23_2.method235(this.anInt732, this.anInt738) + 1;
						this.anInt732++;
					} while (this.anInt732 < this.aClass37_2.aClass23_2.anInt358);
				} while (this.anInt732 >= 0 && this.anInt732 < this.aClass37_2.aClass23_2.anInt358);
				this.anInt732 = 0;
				this.aBoolean206 = true;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("33614, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTUDEFUJ", name = "a", descriptor = "(Z)Lclient!WRJMHIDY;")
	@Override
	protected Class2_Sub1_Sub3_Sub5 method510() {
		try {
			@Pc(3) Class2_Sub1_Sub3_Sub5 local3 = this.aClass37_2.method397();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass37_2.aClass23_2.anIntArray82[this.anInt732];
			@Pc(31) Class2_Sub1_Sub3_Sub5 local31 = new Class2_Sub1_Sub3_Sub5(local3, true, false, Class31.method295(local15, (byte) 6), (byte) 0);
			if (!this.aBoolean206) {
				local31.method430();
				local31.method431(local15);
				local31.anIntArrayArray12 = null;
				local31.anIntArrayArray11 = null;
			}
			if (this.aClass37_2.anInt620 != 128 || this.aClass37_2.anInt621 != 128) {
				local31.method439(this.aBoolean205, this.aClass37_2.anInt620, this.aClass37_2.anInt620, this.aClass37_2.anInt621);
			}
			if (this.aClass37_2.anInt622 != 0) {
				if (this.aClass37_2.anInt622 == 90) {
					local31.method434();
				}
				if (this.aClass37_2.anInt622 == 180) {
					local31.method434();
					local31.method434();
				}
				if (this.aClass37_2.anInt622 == 270) {
					local31.method434();
					local31.method434();
					local31.method434();
				}
			}
			local31.method440(this.aClass37_2.anInt623 + 64, this.aClass37_2.anInt624 + 850, -30, -50, -30, true);
			return local31;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("38537, " + false + ", " + local126.toString());
			throw new RuntimeException();
		}
	}
}

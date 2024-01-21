import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt64;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt65;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	private int anInt58 = -898;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Z")
	private boolean aBoolean19 = true;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Z")
	public boolean aBoolean20 = false;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!kc;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public int anInt60;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public int anInt61;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public int anInt62;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt59;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IBIIIIII)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass21_2 = Class21.aClass21Array1[arg3];
			this.anInt60 = arg7;
			this.anInt61 = arg5;
			this.anInt62 = arg4;
			this.anInt63 = arg2;
			this.anInt59 = arg6 + arg0;
			this.aBoolean20 = false;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("37913, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	public void method29(@OriginalArg(1) int arg0) {
		try {
			this.anInt65 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt65 <= this.aClass21_2.aClass19_1.anIntArray188[this.anInt64]) {
							return;
						}
						this.anInt65 -= this.aClass21_2.aClass19_1.anIntArray188[this.anInt64] + 1;
						this.anInt64++;
					} while (this.anInt64 < this.aClass21_2.aClass19_1.anInt521);
				} while (this.anInt64 >= 0 && this.anInt64 < this.aClass21_2.aClass19_1.anInt521);
				this.anInt64 = 0;
				this.aBoolean20 = true;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("9530, " + 7 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method548() {
		try {
			@Pc(3) Class1_Sub3_Sub1 local3 = this.aClass21_2.method390();
			@Pc(18) Class1_Sub3_Sub1 local18 = new Class1_Sub3_Sub1(false, (byte) 8, true, !this.aClass21_2.aBoolean148, local3);
			if (!this.aBoolean20) {
				local18.method218();
				local18.method219(this.aClass21_2.aClass19_1.anIntArray186[this.anInt64]);
				local18.anIntArrayArray7 = null;
				local18.anIntArrayArray6 = null;
			}
			if (this.aClass21_2.anInt548 != 128 || this.aClass21_2.anInt549 != 128) {
				local18.method227(this.aClass21_2.anInt549, this.aClass21_2.anInt548, this.aClass21_2.anInt548);
			}
			if (this.aClass21_2.anInt550 != 0) {
				if (this.aClass21_2.anInt550 == 90) {
					local18.method222((byte) 4);
				}
				if (this.aClass21_2.anInt550 == 180) {
					local18.method222((byte) 4);
					local18.method222((byte) 4);
				}
				if (this.aClass21_2.anInt550 == 270) {
					local18.method222((byte) 4);
					local18.method222((byte) 4);
					local18.method222((byte) 4);
				}
			}
			local18.method228(this.aClass21_2.anInt551 + 64, this.aClass21_2.anInt552 + 850, -30, -50, -30, true);
			return local18;
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("53276, " + 7 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FNTVIFXL")
public final class Class8_Sub1_Sub1_Sub2 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!FNTVIFXL", name = "u", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!FNTVIFXL", name = "v", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!FNTVIFXL", name = "r", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!FNTVIFXL", name = "t", descriptor = "Lclient!EBBSHPSJ;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!FNTVIFXL", name = "n", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!FNTVIFXL", name = "o", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!FNTVIFXL", name = "p", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!FNTVIFXL", name = "q", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!FNTVIFXL", name = "m", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!FNTVIFXL", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class8_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass12_1 = Class12.aClass12Array1[arg2];
			this.anInt139 = arg3;
			this.anInt140 = arg6;
			this.anInt141 = arg4;
			this.anInt142 = arg1;
			@Pc(25) int local25 = 31 / arg0;
			this.anInt138 = arg5 + arg7;
			this.aBoolean31 = false;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("86180, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FNTVIFXL", name = "a", descriptor = "(II)V")
	public void method82(@OriginalArg(1) int arg0) {
		try {
			this.anInt144 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt144 <= this.aClass12_1.aClass46_1.method486(this.anInt143, (byte) 6)) {
							return;
						}
						this.anInt144 -= this.aClass12_1.aClass46_1.method486(this.anInt143, (byte) 6);
						this.anInt143++;
					} while (this.anInt143 < this.aClass12_1.aClass46_1.anInt759);
				} while (this.anInt143 >= 0 && this.anInt143 < this.aClass12_1.aClass46_1.anInt759);
				this.anInt143 = 0;
				this.aBoolean31 = true;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("24353, " + 43006 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FNTVIFXL", name = "a", descriptor = "(B)Lclient!JJMVUSJJ;")
	@Override
	protected Class8_Sub1_Sub1_Sub5 method533(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(19) Class8_Sub1_Sub1_Sub5 local19 = this.aClass12_1.method75();
			if (local19 == null) {
				return null;
			}
			@Pc(31) int local31 = this.aClass12_1.aClass46_1.anIntArray194[this.anInt143];
			@Pc(42) Class8_Sub1_Sub1_Sub5 local42 = new Class8_Sub1_Sub1_Sub5(true, Class29.method309(local31), false, 9, local19);
			if (!this.aBoolean31) {
				local42.method217(979);
				local42.method218(local31);
				local42.anIntArrayArray8 = null;
				local42.anIntArrayArray7 = null;
			}
			if (this.aClass12_1.anInt104 != 128 || this.aClass12_1.anInt105 != 128) {
				local42.method226(this.aClass12_1.anInt105, this.aClass12_1.anInt104, this.aClass12_1.anInt104);
			}
			if (this.aClass12_1.anInt106 != 0) {
				if (this.aClass12_1.anInt106 == 90) {
					local42.method221((byte) 3);
				}
				if (this.aClass12_1.anInt106 == 180) {
					local42.method221((byte) 3);
					local42.method221((byte) 3);
				}
				if (this.aClass12_1.anInt106 == 270) {
					local42.method221((byte) 3);
					local42.method221((byte) 3);
					local42.method221((byte) 3);
				}
			}
			local42.method227(this.aClass12_1.anInt107 + 64, this.aClass12_1.anInt108 + 850, -30, -50, -30, true);
			return local42;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("45842, " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}
}

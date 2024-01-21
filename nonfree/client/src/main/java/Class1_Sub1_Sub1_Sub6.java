import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!qc;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(ZIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass35_2 = Class35.aClass35Array1[arg2];
			this.anInt510 = arg5;
			this.anInt511 = arg7;
			this.anInt512 = arg3;
			this.anInt513 = arg6;
			this.anInt509 = arg1 + arg4;
			this.aBoolean117 = false;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("41898, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt515 += arg0;
			if (arg1 != 0) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			while (true) {
				do {
					do {
						if (this.anInt515 <= this.aClass35_2.aClass29_2.method529(this.anInt514)) {
							return;
						}
						this.anInt515 -= this.aClass35_2.aClass29_2.method529(this.anInt514) + 1;
						this.anInt514++;
					} while (this.anInt514 < this.aClass35_2.aClass29_2.anInt807);
				} while (this.anInt514 >= 0 && this.anInt514 < this.aClass35_2.aClass29_2.anInt807);
				this.anInt514 = 0;
				this.aBoolean117 = true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("76695, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method693() {
		try {
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.aClass35_2.method546();
			if (local10 == null) {
				return null;
			}
			@Pc(22) int local22 = this.aClass35_2.aClass29_2.anIntArray237[this.anInt514];
			@Pc(33) Class1_Sub1_Sub1_Sub5 local33 = new Class1_Sub1_Sub1_Sub5(false, -164, local10, true, Class12.method304(local22));
			if (!this.aBoolean117) {
				local33.method263(this.anInt508);
				local33.method264(local22);
				local33.anIntArrayArray9 = null;
				local33.anIntArrayArray8 = null;
			}
			if (this.aClass35_2.anInt845 != 128 || this.aClass35_2.anInt846 != 128) {
				local33.method272(this.aClass35_2.anInt845, this.aClass35_2.anInt845, this.aClass35_2.anInt846);
			}
			if (this.aClass35_2.anInt847 != 0) {
				if (this.aClass35_2.anInt847 == 90) {
					local33.method267();
				}
				if (this.aClass35_2.anInt847 == 180) {
					local33.method267();
					local33.method267();
				}
				if (this.aClass35_2.anInt847 == 270) {
					local33.method267();
					local33.method267();
					local33.method267();
				}
			}
			local33.method273(this.aClass35_2.anInt848 + 64, this.aClass35_2.anInt849 + 850, -30, -50, -30, true);
			return local33;
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("82167, " + -21173 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}
}

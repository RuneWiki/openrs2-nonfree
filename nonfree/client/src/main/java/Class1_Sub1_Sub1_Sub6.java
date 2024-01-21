import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg5];
			this.anInt506 = arg3;
			this.anInt507 = arg1;
			this.anInt508 = arg7;
			this.anInt509 = arg2;
			this.anInt505 = arg4 + arg0;
			this.aBoolean146 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("83106, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method298(@OriginalArg(1) int arg0) {
		try {
			this.anInt511 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt511 <= this.aClass33_2.aClass27_2.method498(this.anInt510)) {
							return;
						}
						this.anInt511 -= this.aClass33_2.aClass27_2.method498(this.anInt510) + 1;
						this.anInt510++;
					} while (this.anInt510 < this.aClass33_2.aClass27_2.anInt768);
				} while (this.anInt510 >= 0 && this.anInt510 < this.aClass33_2.aClass27_2.anInt768);
				this.anInt510 = 0;
				this.aBoolean146 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("64141, " + 8 + ", " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method669() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_2.method515();
			if (local3 == null) {
				return null;
			}
			@Pc(25) int local25 = this.aClass33_2.aClass27_2.anIntArray222[this.anInt510];
			@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = new Class1_Sub1_Sub1_Sub5(false, true, local3, Class12.method303(local25, 681), 9);
			if (!this.aBoolean146) {
				local36.method266();
				local36.method267(local25);
				local36.anIntArrayArray9 = null;
				local36.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt804 != 128 || this.aClass33_2.anInt805 != 128) {
				local36.method275(this.aClass33_2.anInt804, this.aClass33_2.anInt805, this.aClass33_2.anInt804);
			}
			if (this.aClass33_2.anInt806 != 0) {
				if (this.aClass33_2.anInt806 == 90) {
					local36.method270((byte) 4);
				}
				if (this.aClass33_2.anInt806 == 180) {
					local36.method270((byte) 4);
					local36.method270((byte) 4);
				}
				if (this.aClass33_2.anInt806 == 270) {
					local36.method270((byte) 4);
					local36.method270((byte) 4);
					local36.method270((byte) 4);
				}
			}
			local36.method276(this.aClass33_2.anInt807 + 64, this.aClass33_2.anInt808 + 850, -30, -50, -30, true);
			return local36;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("19600, " + 0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}

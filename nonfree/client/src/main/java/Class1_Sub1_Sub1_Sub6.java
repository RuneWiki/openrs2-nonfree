import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
	private int anInt547;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
	private boolean aBoolean140 = true;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	private int anInt540 = 1727;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	public int anInt544;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(BIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg5];
			this.anInt542 = arg4;
			this.anInt543 = arg3;
			this.anInt544 = arg7;
			this.anInt545 = arg2;
			this.anInt541 = arg1 + arg6;
			this.aBoolean144 = false;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("89876, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	public void method301(@OriginalArg(0) int arg0) {
		try {
			this.anInt547 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt547 <= this.aClass33_2.aClass27_2.method506(this.anInt546, this.aBoolean142)) {
							return;
						}
						this.anInt547 -= this.aClass33_2.aClass27_2.method506(this.anInt546, this.aBoolean142) + 1;
						this.anInt546++;
					} while (this.anInt546 < this.aClass33_2.aClass27_2.anInt814);
				} while (this.anInt546 >= 0 && this.anInt546 < this.aClass33_2.aClass27_2.anInt814);
				this.anInt546 = 0;
				this.aBoolean144 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("76174, " + arg0 + ", " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_2.method523();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass33_2.aClass27_2.anIntArray225[this.anInt546];
			@Pc(27) Class1_Sub1_Sub1_Sub5 local27 = new Class1_Sub1_Sub1_Sub5(false, -16051, local3, Class12.method306(local15, this.aBoolean140), true);
			if (!this.aBoolean144) {
				local27.method268();
				local27.method269(local15);
				local27.anIntArrayArray9 = null;
				local27.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt847 != 128 || this.aClass33_2.anInt848 != 128) {
				local27.method277(this.aClass33_2.anInt847, this.aClass33_2.anInt847, this.aClass33_2.anInt848);
			}
			if (this.aClass33_2.anInt849 != 0) {
				if (this.aClass33_2.anInt849 == 90) {
					local27.method272();
				}
				if (this.aClass33_2.anInt849 == 180) {
					local27.method272();
					local27.method272();
				}
				if (this.aClass33_2.anInt849 == 270) {
					local27.method272();
					local27.method272();
					local27.method272();
				}
			}
			local27.method278(this.aClass33_2.anInt850 + 64, this.aClass33_2.anInt851 + 850, -30, -50, -30, true);
			return local27;
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("20144, " + -47094 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}
}

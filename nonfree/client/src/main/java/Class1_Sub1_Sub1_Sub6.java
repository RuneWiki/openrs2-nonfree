import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	private int anInt539;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public int anInt544;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt540;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg1];
			this.anInt541 = arg6;
			this.anInt542 = arg3;
			this.anInt543 = arg4;
			this.anInt544 = arg5;
			this.anInt540 = arg0 + arg2;
			this.aBoolean139 = false;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("75229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method301(@OriginalArg(0) int arg0) {
		try {
			this.anInt546 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt546 <= this.aClass33_2.aClass27_2.method506(this.anInt545)) {
							return;
						}
						this.anInt546 -= this.aClass33_2.aClass27_2.method506(this.anInt545) + 1;
						this.anInt545++;
					} while (this.anInt545 < this.aClass33_2.aClass27_2.anInt807);
				} while (this.anInt545 >= 0 && this.anInt545 < this.aClass33_2.aClass27_2.anInt807);
				this.anInt545 = 0;
				this.aBoolean139 = true;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("46781, " + arg0 + ", " + 0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_2.method523();
			if (arg0 != 0) {
				this.anInt539 = -197;
			}
			if (local3 == null) {
				return null;
			}
			@Pc(20) int local20 = this.aClass33_2.aClass27_2.anIntArray225[this.anInt545];
			@Pc(31) Class1_Sub1_Sub1_Sub5 local31 = new Class1_Sub1_Sub1_Sub5(local3, true, false, Class12.method306(local20), 0);
			if (!this.aBoolean139) {
				local31.method268();
				local31.method269(428, local20);
				local31.anIntArrayArray9 = null;
				local31.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt844 != 128 || this.aClass33_2.anInt845 != 128) {
				local31.method277((byte) 4, this.aClass33_2.anInt845, this.aClass33_2.anInt844, this.aClass33_2.anInt844);
			}
			if (this.aClass33_2.anInt846 != 0) {
				if (this.aClass33_2.anInt846 == 90) {
					local31.method272();
				}
				if (this.aClass33_2.anInt846 == 180) {
					local31.method272();
					local31.method272();
				}
				if (this.aClass33_2.anInt846 == 270) {
					local31.method272();
					local31.method272();
					local31.method272();
				}
			}
			local31.method278(this.aClass33_2.anInt847 + 64, this.aClass33_2.anInt848 + 850, -30, -50, -30, true);
			return local31;
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("75276, " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}
}

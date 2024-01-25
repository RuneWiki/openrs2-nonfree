import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class227 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
	public static final int[] anIntArray583 = new int[128];

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public int anInt6831 = 0;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public int anInt6832 = 0;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!hp;")
	private final Class125 aClass125_43 = new Class125(64);

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!si;")
	private Interface16 anInterface16_1 = null;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!kea;")
	private final Class161 aClass161_79;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!kea;")
	private final Class161 aClass161_81;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray583.length; local4++) {
			anIntArray583[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray583[local20] = local20 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray583[local35] = local35 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray583[local50] = local50 + 52 - 48;
		}
		anIntArray583[45] = anIntArray583[47] = 63;
		anIntArray583[42] = anIntArray583[43] = 62;
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ILclient!kea;Lclient!kea;Lclient!si;)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Interface16 arg3) {
		this.aClass161_79 = arg1;
		this.aClass161_81 = arg2;
		this.anInterface16_1 = arg3;
		if (this.aClass161_79 != null) {
			this.anInt6831 = this.aClass161_79.method4266(1);
		}
		if (this.aClass161_81 != null) {
			this.anInt6832 = this.aClass161_81.method4266(1);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!co;")
	public Class3_Sub10_Sub3 method5726(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub10_Sub3 local13 = (Class3_Sub10_Sub3) this.aClass125_43.method3512((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass161_79.method4243(arg0, 1);
		} else {
			local27 = this.aClass161_81.method4243(arg0 & 0x7FFF, 1);
		}
		local13 = new Class3_Sub10_Sub3();
		local13.aClass227_1 = this;
		if (local27 != null) {
			local13.method1329(new Class3_Sub27(local27));
		}
		if (arg0 >= 32768) {
			local13.method1335();
		}
		this.aClass125_43.method3519((long) arg0, local13);
		return local13;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(JLclient!db;[II)Ljava/lang/String;")
	public String method5729(@OriginalArg(0) long arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int[] arg2) {
		if (this.anInterface16_1 != null) {
			@Pc(19) String local19 = this.anInterface16_1.method4897(arg1, arg2, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg0);
	}
}

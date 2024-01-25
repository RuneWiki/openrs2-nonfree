import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class149 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	public int anInt4042 = 0;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public int anInt4043 = 0;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!dc;")
	private final Class44 aClass44_30 = new Class44(64);

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!im;")
	private Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!he;")
	private final Class100 aClass100_43;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!he;")
	private final Class100 aClass100_42;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(ILclient!he;Lclient!he;Lclient!im;)V")
	public Class149(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Interface3 arg3) {
		this.anInterface3_1 = arg3;
		this.aClass100_43 = arg2;
		this.aClass100_42 = arg1;
		if (this.aClass100_42 != null) {
			this.anInt4042 = this.aClass100_42.method2523(1);
		}
		if (this.aClass100_43 != null) {
			this.anInt4043 = this.aClass100_43.method2523(1);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!on;")
	public Class6_Sub2_Sub12 method3356(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub2_Sub12 local11 = (Class6_Sub2_Sub12) this.aClass44_30.method1353((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass100_43.method2520(arg0 & 0x7FFF, 1);
		} else {
			local27 = this.aClass100_42.method2520(arg0, 1);
		}
		local11 = new Class6_Sub2_Sub12();
		local11.aClass149_1 = this;
		if (local27 != null) {
			local11.method4360(new Class6_Sub1(local27));
		}
		if (arg0 >= 32768) {
			local11.method4355();
		}
		this.aClass44_30.method1349(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIJLclient!ak;)Ljava/lang/String;")
	public String method3360(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class10 arg2) {
		if (this.anInterface3_1 != null) {
			@Pc(18) String local18 = this.anInterface3_1.method2(arg1, arg2, arg0);
			if (local18 != null) {
				return local18;
			}
		}
		return Long.toString(arg1);
	}
}

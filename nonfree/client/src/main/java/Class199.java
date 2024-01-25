import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class199 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "[C")
	public static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!pp;")
	private Class6_Sub4 aClass6_Sub4_32 = new Class6_Sub4();

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Lclient!hv;")
	private final Class143 aClass143_4 = new Class143();

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	private int anInt5679;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	private final int anInt5678;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!tq;")
	private final Class305 aClass305_26;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray6[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray6[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray6[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray6[63] = '-';
		aCharArray6[62] = '*';
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
	public Class199(@OriginalArg(0) int arg0) {
		this.anInt5679 = arg0;
		this.anInt5678 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass305_26 = new Class305(local19);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLclient!pp;J)V")
	public void method4858(@OriginalArg(1) Class6_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5679 == 0) {
			@Pc(18) Class6_Sub4 local18 = this.aClass143_4.method3836();
			local18.method8151();
			local18.method8035();
			if (local18 == this.aClass6_Sub4_32) {
				local18 = this.aClass143_4.method3836();
				local18.method8151();
				local18.method8035();
			}
		} else {
			this.anInt5679--;
		}
		this.aClass305_26.method7448(arg1, arg0);
		this.aClass143_4.method3835(arg0);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public void method4861() {
		this.aClass143_4.method3837();
		this.aClass305_26.method7440();
		this.aClass6_Sub4_32 = new Class6_Sub4();
		this.anInt5679 = this.anInt5678;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IJ)Lclient!pp;")
	public Class6_Sub4 method4863(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub4 local10 = (Class6_Sub4) this.aClass305_26.method7447(arg0);
		if (local10 != null) {
			this.aClass143_4.method3835(local10);
		}
		return local10;
	}
}

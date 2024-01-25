import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class75 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Lclient!ww;")
	private Class2_Sub2 aClass2_Sub2_27;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!ww;")
	public final Class2_Sub2 aClass2_Sub2_26 = new Class2_Sub2();

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray1[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray1[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray1[local36] = (char) (local36 - 4);
		}
		aCharArray1[62] = '*';
		aCharArray1[63] = '-';
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class75() {
		this.aClass2_Sub2_26.aClass2_Sub2_67 = this.aClass2_Sub2_26;
		this.aClass2_Sub2_26.aClass2_Sub2_66 = this.aClass2_Sub2_26;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)I")
	public int method1566() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class2_Sub2 local17 = this.aClass2_Sub2_26.aClass2_Sub2_67;
		while (local17 != this.aClass2_Sub2_26) {
			local17 = local17.aClass2_Sub2_67;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
	public void method1567() {
		while (true) {
			@Pc(9) Class2_Sub2 local9 = this.aClass2_Sub2_26.aClass2_Sub2_67;
			if (local9 == this.aClass2_Sub2_26) {
				this.aClass2_Sub2_27 = null;
				return;
			}
			local9.method8271();
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Lclient!ww;")
	public Class2_Sub2 method1568() {
		@Pc(6) Class2_Sub2 local6 = this.aClass2_Sub2_27;
		if (local6 == this.aClass2_Sub2_26) {
			this.aClass2_Sub2_27 = null;
			return null;
		} else {
			this.aClass2_Sub2_27 = local6.aClass2_Sub2_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)Lclient!ww;")
	public Class2_Sub2 method1571() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_26.aClass2_Sub2_67;
		if (this.aClass2_Sub2_26 == local7) {
			return null;
		} else {
			local7.method8271();
			return local7;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!ww;)V")
	public void method1572(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_66 != null) {
			arg0.method8271();
		}
		arg0.aClass2_Sub2_66 = this.aClass2_Sub2_26.aClass2_Sub2_66;
		arg0.aClass2_Sub2_67 = this.aClass2_Sub2_26;
		arg0.aClass2_Sub2_66.aClass2_Sub2_67 = arg0;
		arg0.aClass2_Sub2_67.aClass2_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)Lclient!ww;")
	public Class2_Sub2 method1573() {
		@Pc(12) Class2_Sub2 local12 = this.aClass2_Sub2_26.aClass2_Sub2_67;
		if (local12 == this.aClass2_Sub2_26) {
			this.aClass2_Sub2_27 = null;
			return null;
		} else {
			this.aClass2_Sub2_27 = local12.aClass2_Sub2_67;
			return local12;
		}
	}
}

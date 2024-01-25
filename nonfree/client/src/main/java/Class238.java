import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class238 {

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!du;")
	private Class81 aClass81_48;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	private int anInt6478;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!du;")
	public Class81 aClass81_49;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Ljava/lang/String;")
	private String aString103 = "null";

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	private void method5735() {
		this.aClass81_48 = new Class81(this.aClass81_49.method1603());
		for (@Pc(20) Class5_Sub36 local20 = (Class5_Sub36) this.aClass81_49.method1608(); local20 != null; local20 = (Class5_Sub36) this.aClass81_49.method1610()) {
			@Pc(31) Class5_Sub43 local31 = new Class5_Sub43(local20.aString106, (int) local20.aLong282);
			this.aClass81_48.method1607(local31, Static373.method5811(local20.aString106));
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I")
	public int method5736(@OriginalArg(1) int arg0) {
		if (this.aClass81_49 == null) {
			return this.anInt6478;
		} else {
			@Pc(22) Class5_Sub41 local22 = (Class5_Sub41) this.aClass81_49.method1599((long) arg0);
			return local22 == null ? this.anInt6478 : local22.anInt7411;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5737(@OriginalArg(0) String arg0) {
		if (this.aClass81_49 == null) {
			return false;
		}
		if (this.aClass81_48 == null) {
			this.method5735();
		}
		for (@Pc(27) Class5_Sub43 local27 = (Class5_Sub43) this.aClass81_48.method1599(Static373.method5811(arg0)); local27 != null; local27 = (Class5_Sub43) this.aClass81_48.method1605()) {
			if (local27.aString126.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!ee;)V")
	public void method5739(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8645();
			if (local17 == 0) {
				return;
			}
			this.method5741(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	private void method5740() {
		this.aClass81_48 = new Class81(this.aClass81_49.method1603());
		for (@Pc(20) Class5_Sub41 local20 = (Class5_Sub41) this.aClass81_49.method1608(); local20 != null; local20 = (Class5_Sub41) this.aClass81_49.method1610()) {
			@Pc(29) Class5_Sub41 local29 = new Class5_Sub41((int) local20.aLong282);
			this.aClass81_48.method1607(local29, (long) local20.anInt7411);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!ee;)V")
	private void method5741(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static382.method8494(arg1.method8635());
		} else if (arg0 == 2) {
			this.aChar4 = Static382.method8494(arg1.method8635());
		} else if (arg0 == 3) {
			this.aString103 = arg1.method8617();
		} else if (arg0 == 4) {
			this.anInt6478 = arg1.method8623();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(41) int local41 = arg1.method8631();
			this.aClass81_49 = new Class81(Static522.method6795(local41));
			for (@Pc(51) int local51 = 0; local51 < local41; local51++) {
				@Pc(57) int local57 = arg1.method8623();
				@Pc(67) Class5 local67;
				if (arg0 == 5) {
					local67 = new Class5_Sub36(arg1.method8617());
				} else {
					local67 = new Class5_Sub41(arg1.method8623());
				}
				this.aClass81_49.method1607(local67, (long) local57);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method5742(@OriginalArg(1) int arg0) {
		if (this.aClass81_49 == null) {
			return this.aString103;
		} else {
			@Pc(25) Class5_Sub36 local25 = (Class5_Sub36) this.aClass81_49.method1599((long) arg0);
			return local25 == null ? this.aString103 : local25.aString106;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
	public boolean method5743(@OriginalArg(0) int arg0) {
		if (this.aClass81_49 == null) {
			return false;
		}
		if (this.aClass81_48 == null) {
			this.method5740();
		}
		@Pc(22) Class5_Sub41 local22 = (Class5_Sub41) this.aClass81_48.method1599((long) arg0);
		return local22 != null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class318 {

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "Lclient!pl;")
	private Class273 aClass273_39;

	@OriginalMember(owner = "client!sia", name = "g", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!sia", name = "k", descriptor = "I")
	private int anInt8860;

	@OriginalMember(owner = "client!sia", name = "n", descriptor = "Lclient!pl;")
	public Class273 aClass273_40;

	@OriginalMember(owner = "client!sia", name = "l", descriptor = "Ljava/lang/String;")
	private String aString101 = "null";

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BLclient!ofa;)V")
	public void method7629(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5966();
			if (local9 == 0) {
				return;
			}
			this.method7633(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
	private void method7630() {
		this.aClass273_39 = new Class273(this.aClass273_40.method6583());
		for (@Pc(24) Class5_Sub7 local24 = (Class5_Sub7) this.aClass273_40.method6577(); local24 != null; local24 = (Class5_Sub7) this.aClass273_40.method6589()) {
			@Pc(35) Class5_Sub33 local35 = new Class5_Sub33(local24.aString19, (int) local24.aLong278);
			this.aClass273_39.method6585(Static245.method8118(local24.aString19), local35);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method7631(@OriginalArg(1) String arg0) {
		if (this.aClass273_40 == null) {
			return false;
		}
		if (this.aClass273_39 == null) {
			this.method7630();
		}
		for (@Pc(30) Class5_Sub33 local30 = (Class5_Sub33) this.aClass273_39.method6581(Static245.method8118(arg0)); local30 != null; local30 = (Class5_Sub33) this.aClass273_39.method6582()) {
			if (local30.aString58.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZ)Z")
	public boolean method7632(@OriginalArg(0) int arg0) {
		if (this.aClass273_40 == null) {
			return false;
		}
		if (this.aClass273_39 == null) {
			this.method7637();
		}
		@Pc(22) Class5_Sub41 local22 = (Class5_Sub41) this.aClass273_39.method6581((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ofa;BI)V")
	private void method7633(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static644.method9020(arg0.method5963());
		} else if (arg1 == 2) {
			this.aChar4 = Static644.method9020(arg0.method5963());
		} else if (arg1 == 3) {
			this.aString101 = arg0.method5937();
		} else if (arg1 == 4) {
			this.anInt8860 = arg0.method5913();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(57) int local57 = arg0.method5968();
			this.aClass273_40 = new Class273(Static613.method8740(local57));
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				@Pc(73) int local73 = arg0.method5913();
				@Pc(83) Class5 local83;
				if (arg1 == 5) {
					local83 = new Class5_Sub7(arg0.method5937());
				} else {
					local83 = new Class5_Sub41(arg0.method5913());
				}
				this.aClass273_40.method6585((long) local73, local83);
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method7634(@OriginalArg(0) int arg0) {
		if (this.aClass273_40 == null) {
			return this.aString101;
		} else {
			@Pc(17) Class5_Sub7 local17 = (Class5_Sub7) this.aClass273_40.method6581((long) arg0);
			return local17 == null ? this.aString101 : local17.aString19;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BI)I")
	public int method7635(@OriginalArg(1) int arg0) {
		if (this.aClass273_40 == null) {
			return this.anInt8860;
		} else {
			@Pc(17) Class5_Sub41 local17 = (Class5_Sub41) this.aClass273_40.method6581((long) arg0);
			return local17 == null ? this.anInt8860 : local17.anInt7600;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V")
	private void method7637() {
		this.aClass273_39 = new Class273(this.aClass273_40.method6583());
		for (@Pc(26) Class5_Sub41 local26 = (Class5_Sub41) this.aClass273_40.method6577(); local26 != null; local26 = (Class5_Sub41) this.aClass273_40.method6589()) {
			@Pc(35) Class5_Sub41 local35 = new Class5_Sub41((int) local26.aLong278);
			this.aClass273_39.method6585((long) local26.anInt7600, local35);
		}
	}
}

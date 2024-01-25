import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class300 {

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "Lclient!cja;")
	private Class62 aClass62_41;

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
	private int anInt8453;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "Lclient!cja;")
	public Class62 aClass62_42;

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "Ljava/lang/String;")
	private String aString105 = "null";

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
	private void method7150() {
		this.aClass62_41 = new Class62(this.aClass62_42.method1684());
		for (@Pc(27) Class3_Sub40 local27 = (Class3_Sub40) this.aClass62_42.method1680(); local27 != null; local27 = (Class3_Sub40) this.aClass62_42.method1681()) {
			@Pc(38) Class3_Sub41 local38 = new Class3_Sub41(local27.aString100, (int) local27.aLong309);
			this.aClass62_41.method1686(Static636.method8360(local27.aString100), local38);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method7151(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method7154(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BI)I")
	public int method7153(@OriginalArg(1) int arg0) {
		if (this.aClass62_42 == null) {
			return this.anInt8453;
		} else {
			@Pc(25) Class3_Sub53 local25 = (Class3_Sub53) this.aClass62_42.method1682((long) arg0);
			return local25 == null ? this.anInt8453 : local25.anInt10023;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!fca;II)V")
	private void method7154(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static669.method8682(arg0.method4861());
		} else if (arg1 == 2) {
			this.aChar4 = Static669.method8682(arg0.method4861());
		} else if (arg1 == 3) {
			this.aString105 = arg0.method4847();
		} else if (arg1 == 4) {
			this.anInt8453 = arg0.method4868();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(72) int local72 = arg0.method4858();
			this.aClass62_42 = new Class62(Static527.method7377(local72));
			for (@Pc(82) int local82 = 0; local82 < local72; local82++) {
				@Pc(90) int local90 = arg0.method4868();
				@Pc(102) Class3 local102;
				if (arg1 == 5) {
					local102 = new Class3_Sub40(arg0.method4847());
				} else {
					local102 = new Class3_Sub53(arg0.method4868());
				}
				this.aClass62_42.method1686((long) local90, local102);
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method7155(@OriginalArg(0) int arg0) {
		if (this.aClass62_42 == null) {
			return this.aString105;
		} else {
			@Pc(24) Class3_Sub40 local24 = (Class3_Sub40) this.aClass62_42.method1682((long) arg0);
			return local24 == null ? this.aString105 : local24.aString100;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method7156(@OriginalArg(1) String arg0) {
		if (this.aClass62_42 == null) {
			return false;
		}
		if (this.aClass62_41 == null) {
			this.method7150();
		}
		for (@Pc(25) Class3_Sub41 local25 = (Class3_Sub41) this.aClass62_41.method1682(Static636.method8360(arg0)); local25 != null; local25 = (Class3_Sub41) this.aClass62_41.method1689()) {
			if (local25.aString101.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)V")
	private void method7157() {
		this.aClass62_41 = new Class62(this.aClass62_42.method1684());
		for (@Pc(26) Class3_Sub53 local26 = (Class3_Sub53) this.aClass62_42.method1680(); local26 != null; local26 = (Class3_Sub53) this.aClass62_42.method1681()) {
			@Pc(35) Class3_Sub53 local35 = new Class3_Sub53((int) local26.aLong309);
			this.aClass62_41.method1686((long) local26.anInt10023, local35);
		}
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)Z")
	public boolean method7158(@OriginalArg(0) int arg0) {
		if (this.aClass62_42 == null) {
			return false;
		}
		if (this.aClass62_41 == null) {
			this.method7157();
		}
		@Pc(26) Class3_Sub53 local26 = (Class3_Sub53) this.aClass62_41.method1682((long) arg0);
		return local26 != null;
	}
}

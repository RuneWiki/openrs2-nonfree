import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class238 {

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "[C")
	private static final char[] aCharArray10 = new char[64];

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "Lclient!tq;")
	private Class2 aClass2_202;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!tq;")
	public final Class2 aClass2_201 = new Class2();

	static {
		for (@Pc(8) int local8 = 0; local8 < 26; local8++) {
			aCharArray10[local8] = (char) (local8 + 65);
		}
		for (@Pc(22) int local22 = 26; local22 < 52; local22++) {
			aCharArray10[local22] = (char) (local22 + 71);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray10[local36] = (char) (local36 - 4);
		}
		aCharArray10[63] = '/';
		aCharArray10[62] = '+';
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class238() {
		this.aClass2_201.aClass2_299 = this.aClass2_201;
		this.aClass2_201.aClass2_300 = this.aClass2_201;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Lclient!tq;")
	public Class2 method5832() {
		@Pc(7) Class2 local7 = this.aClass2_201.aClass2_300;
		if (local7 == this.aClass2_201) {
			return null;
		} else {
			local7.method8599();
			return local7;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)Lclient!tq;")
	public Class2 method5833() {
		@Pc(7) Class2 local7 = this.aClass2_201.aClass2_300;
		if (local7 == this.aClass2_201) {
			this.aClass2_202 = null;
			return null;
		} else {
			this.aClass2_202 = local7.aClass2_300;
			return local7;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)Lclient!tq;")
	public Class2 method5834() {
		@Pc(15) Class2 local15 = this.aClass2_201.aClass2_299;
		if (local15 == this.aClass2_201) {
			this.aClass2_202 = null;
			return null;
		} else {
			this.aClass2_202 = local15.aClass2_299;
			return local15;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!tq;)V")
	public void method5835(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_299 != null) {
			arg0.method8599();
		}
		arg0.aClass2_299 = this.aClass2_201;
		arg0.aClass2_300 = this.aClass2_201.aClass2_300;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!tq;I)V")
	public void method5837(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_299 != null) {
			arg0.method8599();
		}
		arg0.aClass2_299 = this.aClass2_201.aClass2_299;
		arg0.aClass2_300 = this.aClass2_201;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)Lclient!tq;")
	public Class2 method5838() {
		@Pc(11) Class2 local11 = this.aClass2_202;
		if (local11 == this.aClass2_201) {
			this.aClass2_202 = null;
			return null;
		} else {
			this.aClass2_202 = local11.aClass2_300;
			return local11;
		}
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Z")
	public boolean method5839() {
		return this.aClass2_201.aClass2_300 == this.aClass2_201;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!nt;)V")
	public void method5840(@OriginalArg(1) Class238 arg0) {
		this.method5844(arg0, this.aClass2_201.aClass2_300);
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)V")
	public void method5841() {
		while (true) {
			@Pc(3) Class2 local3 = this.aClass2_201.aClass2_300;
			if (this.aClass2_201 == local3) {
				this.aClass2_202 = null;
				return;
			}
			local3.method8599();
		}
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)I")
	public int method5842() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class2 local9 = this.aClass2_201.aClass2_300; local9 != this.aClass2_201; local9 = local9.aClass2_300) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(B)Lclient!tq;")
	public Class2 method5843() {
		@Pc(6) Class2 local6 = this.aClass2_202;
		if (this.aClass2_201 == local6) {
			this.aClass2_202 = null;
			return null;
		} else {
			this.aClass2_202 = local6.aClass2_299;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!nt;Lclient!tq;I)V")
	private void method5844(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class2 arg1) {
		@Pc(13) Class2 local13 = this.aClass2_201.aClass2_299;
		this.aClass2_201.aClass2_299 = arg1.aClass2_299;
		arg1.aClass2_299.aClass2_300 = this.aClass2_201;
		if (this.aClass2_201 != arg1) {
			arg1.aClass2_299 = arg0.aClass2_201.aClass2_299;
			arg1.aClass2_299.aClass2_300 = arg1;
			local13.aClass2_300 = arg0.aClass2_201;
			arg0.aClass2_201.aClass2_299 = local13;
		}
	}
}

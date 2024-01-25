import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class177 {

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "Lclient!vg;")
	private Class342 aClass342_110 = new Class342(64);

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!ri;")
	private final Class284 aClass284_86;

	static {
		for (@Pc(12) int local12 = 0; local12 < 26; local12++) {
			aCharArray6[local12] = (char) (local12 + 65);
		}
		for (@Pc(26) int local26 = 26; local26 < 52; local26++) {
			aCharArray6[local26] = (char) (local26 + 97 - 26);
		}
		for (@Pc(44) int local44 = 52; local44 < 62; local44++) {
			aCharArray6[local44] = (char) (local44 + 48 - 52);
		}
		aCharArray6[63] = '-';
		aCharArray6[62] = '*';
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class177(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_86 = arg2;
		if (this.aClass284_86 != null) {
			@Pc(20) int local20 = this.aClass284_86.method6322() - 1;
			this.aClass284_86.method6354(local20);
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public void method4302() {
		@Pc(2) Class342 local2 = this.aClass342_110;
		synchronized (this.aClass342_110) {
			this.aClass342_110.method7687();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	public void method4303(@OriginalArg(0) int arg0) {
		@Pc(10) Class342 local10 = this.aClass342_110;
		synchronized (this.aClass342_110) {
			this.aClass342_110.method7693();
			this.aClass342_110 = new Class342(arg0);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	public void method4304() {
		@Pc(2) Class342 local2 = this.aClass342_110;
		synchronized (this.aClass342_110) {
			this.aClass342_110.method7693();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)Lclient!ea;")
	public Class78 method4305(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_110;
		@Pc(16) Class78 local16;
		synchronized (this.aClass342_110) {
			local16 = (Class78) this.aClass342_110.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_86;
		@Pc(42) byte[] local42;
		synchronized (this.aClass284_86) {
			local42 = this.aClass284_86.method6331(Static557.method4955(arg0), Static374.method5249(arg0));
		}
		local16 = new Class78();
		if (local42 != null) {
			local16.method2204(new Class3_Sub26(local42));
		}
		@Pc(64) Class342 local64 = this.aClass342_110;
		synchronized (this.aClass342_110) {
			this.aClass342_110.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V")
	public void method4307() {
		@Pc(2) Class342 local2 = this.aClass342_110;
		synchronized (this.aClass342_110) {
			this.aClass342_110.method7697(5);
		}
	}
}

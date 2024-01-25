import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class255 {

	@OriginalMember(owner = "client!oha", name = "h", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
	private int anInt7310;

	@OriginalMember(owner = "client!oha", name = "l", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!oha", name = "m", descriptor = "Lclient!lk;")
	private Class209 aClass209_42;

	@OriginalMember(owner = "client!oha", name = "s", descriptor = "I")
	private int anInt7316;

	@OriginalMember(owner = "client!oha", name = "u", descriptor = "Lclient!lk;")
	public Class209 aClass209_43;

	@OriginalMember(owner = "client!oha", name = "q", descriptor = "Ljava/lang/String;")
	private String aString96 = "null";

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method6280(@OriginalArg(0) int arg0) {
		if (this.aClass209_43 == null) {
			return this.aString96;
		} else {
			@Pc(17) Class6_Sub16 local17 = (Class6_Sub16) this.aClass209_43.method5038((long) arg0);
			return local17 == null ? this.aString96 : local17.aString22;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)Z")
	public boolean method6282(@OriginalArg(0) int arg0) {
		if (this.aClass209_43 == null) {
			return false;
		}
		if (this.aClass209_42 == null) {
			this.method6286();
		}
		@Pc(22) Class6_Sub36 local22 = (Class6_Sub36) this.aClass209_42.method5038((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IILclient!gga;)V")
	private void method6283(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static622.method8571(arg1.method8391());
		} else if (arg0 == 2) {
			this.aChar4 = Static622.method8571(arg1.method8391());
		} else if (arg0 == 3) {
			this.aString96 = arg1.method8354();
		} else if (arg0 == 4) {
			this.anInt7310 = arg1.method8369();
		} else if (arg0 == 5 || arg0 == 6) {
			this.anInt7316 = arg1.method8363();
			this.aClass209_43 = new Class209(Static655.method8912(this.anInt7316));
			for (@Pc(52) int local52 = 0; local52 < this.anInt7316; local52++) {
				@Pc(58) int local58 = arg1.method8369();
				@Pc(70) Class6 local70;
				if (arg0 == 5) {
					local70 = new Class6_Sub16(arg1.method8354());
				} else {
					local70 = new Class6_Sub36(arg1.method8369());
				}
				this.aClass209_43.method5035((long) local58, local70);
			}
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6285(@OriginalArg(0) String arg0) {
		if (this.aClass209_43 == null) {
			return false;
		}
		if (this.aClass209_42 == null) {
			this.method6288();
		}
		for (@Pc(32) Class6_Sub28 local32 = (Class6_Sub28) this.aClass209_42.method5038(Static604.method3789(arg0)); local32 != null; local32 = (Class6_Sub28) this.aClass209_42.method5042()) {
			if (local32.aString56.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Z)V")
	private void method6286() {
		this.aClass209_42 = new Class209(this.aClass209_43.method5039());
		for (@Pc(26) Class6_Sub36 local26 = (Class6_Sub36) this.aClass209_43.method5037(); local26 != null; local26 = (Class6_Sub36) this.aClass209_43.method5036()) {
			@Pc(35) Class6_Sub36 local35 = new Class6_Sub36((int) local26.aLong314);
			this.aClass209_42.method5035((long) local26.anInt5996, local35);
		}
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)I")
	public int method6287(@OriginalArg(0) int arg0) {
		if (this.aClass209_43 == null) {
			return this.anInt7310;
		} else {
			@Pc(23) Class6_Sub36 local23 = (Class6_Sub36) this.aClass209_43.method5038((long) arg0);
			return local23 == null ? this.anInt7310 : local23.anInt5996;
		}
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V")
	private void method6288() {
		this.aClass209_42 = new Class209(this.aClass209_43.method5039());
		for (@Pc(24) Class6_Sub16 local24 = (Class6_Sub16) this.aClass209_43.method5037(); local24 != null; local24 = (Class6_Sub16) this.aClass209_43.method5036()) {
			@Pc(35) Class6_Sub28 local35 = new Class6_Sub28(local24.aString22, (int) local24.aLong314);
			this.aClass209_42.method5035(Static604.method3789(local24.aString22), local35);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lclient!gga;B)V")
	public void method6289(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8374();
			if (local13 == 0) {
				return;
			}
			this.method6283(local13, arg0);
		}
	}
}

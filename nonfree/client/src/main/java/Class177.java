import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class177 {

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "[C")
	public static final char[] aCharArray5 = new char[64];

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
	private int anInt4457;

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "Lclient!nj;")
	public Class212 aClass212_15;

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "Lclient!nj;")
	private Class212 aClass212_16;

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "Ljava/lang/String;")
	private String aString62 = "null";

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray5[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray5[local18] = (char) (local18 + 71);
		}
		for (@Pc(32) int local32 = 52; local32 < 62; local32++) {
			aCharArray5[local32] = (char) (local32 + 48 - 52);
		}
		aCharArray5[62] = '+';
		aCharArray5[63] = '/';
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)I")
	public int method3822(@OriginalArg(0) int arg0) {
		if (this.aClass212_15 == null) {
			return this.anInt4457;
		} else {
			@Pc(22) Class6_Sub9 local22 = (Class6_Sub9) this.aClass212_15.method5106((long) arg0);
			return local22 == null ? this.anInt4457 : local22.anInt1006;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
	private void method3823() {
		this.aClass212_16 = new Class212(this.aClass212_15.method5108());
		for (@Pc(26) Class6_Sub9 local26 = (Class6_Sub9) this.aClass212_15.method5099(); local26 != null; local26 = (Class6_Sub9) this.aClass212_15.method5103()) {
			@Pc(35) Class6_Sub9 local35 = new Class6_Sub9((int) local26.aLong249);
			this.aClass212_16.method5104((long) local26.anInt1006, local35);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3824(@OriginalArg(1) int arg0) {
		if (this.aClass212_15 == null) {
			return this.aString62;
		} else {
			@Pc(23) Class6_Sub6 local23 = (Class6_Sub6) this.aClass212_15.method5106((long) arg0);
			return local23 == null ? this.aString62 : local23.aString7;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3825(@OriginalArg(1) String arg0) {
		if (this.aClass212_15 == null) {
			return false;
		}
		if (this.aClass212_16 == null) {
			this.method3829();
		}
		for (@Pc(33) Class6_Sub21 local33 = (Class6_Sub21) this.aClass212_16.method5106(Static390.method5796(arg0)); local33 != null; local33 = (Class6_Sub21) this.aClass212_16.method5107()) {
			if (local33.aString44.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!dga;IB)V")
	private void method3826(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static276.method3963(arg0.method6034());
		} else if (arg1 == 2) {
			this.aChar3 = Static276.method3963(arg0.method6034());
		} else if (arg1 == 3) {
			this.aString62 = arg0.method5991();
		} else if (arg1 == 4) {
			this.anInt4457 = arg0.method6027();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(52) int local52 = arg0.method6006();
			this.aClass212_15 = new Class212(Static516.method7313(local52));
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				@Pc(68) int local68 = arg0.method6027();
				@Pc(80) Class6 local80;
				if (arg1 == 5) {
					local80 = new Class6_Sub6(arg0.method5991());
				} else {
					local80 = new Class6_Sub9(arg0.method6027());
				}
				this.aClass212_15.method5104((long) local68, local80);
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLclient!dga;)V")
	public void method3827(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6041();
			if (local13 == 0) {
				return;
			}
			this.method3826(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
	private void method3829() {
		this.aClass212_16 = new Class212(this.aClass212_15.method5108());
		for (@Pc(20) Class6_Sub6 local20 = (Class6_Sub6) this.aClass212_15.method5099(); local20 != null; local20 = (Class6_Sub6) this.aClass212_15.method5103()) {
			@Pc(31) Class6_Sub21 local31 = new Class6_Sub21(local20.aString7, (int) local20.aLong249);
			this.aClass212_16.method5104(Static390.method5796(local20.aString7), local31);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IB)Z")
	public boolean method3830(@OriginalArg(0) int arg0) {
		if (this.aClass212_15 == null) {
			return false;
		}
		if (this.aClass212_16 == null) {
			this.method3823();
		}
		@Pc(27) Class6_Sub9 local27 = (Class6_Sub9) this.aClass212_16.method5106((long) arg0);
		return local27 != null;
	}
}

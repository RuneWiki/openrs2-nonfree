import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class315 {

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!pfa;")
	private Class253 aClass253_34;

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "Lclient!pfa;")
	public Class253 aClass253_35;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
	private int anInt9096;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Ljava/lang/String;")
	private String aString93 = "null";

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BI)I")
	public int method7451(@OriginalArg(1) int arg0) {
		if (this.aClass253_35 == null) {
			return this.anInt9096;
		} else {
			@Pc(25) Class8_Sub17 local25 = (Class8_Sub17) this.aClass253_35.method6594((long) arg0);
			return local25 == null ? this.anInt9096 : local25.anInt2919;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
	public boolean method7452(@OriginalArg(0) int arg0) {
		if (this.aClass253_35 == null) {
			return false;
		}
		if (this.aClass253_34 == null) {
			this.method7459();
		}
		@Pc(22) Class8_Sub17 local22 = (Class8_Sub17) this.aClass253_34.method6594((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method7453(@OriginalArg(0) int arg0) {
		if (this.aClass253_35 == null) {
			return this.aString93;
		} else {
			@Pc(17) Class8_Sub28 local17 = (Class8_Sub28) this.aClass253_35.method6594((long) arg0);
			return local17 == null ? this.aString93 : local17.aString63;
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	private void method7454() {
		this.aClass253_34 = new Class253(this.aClass253_35.method6597());
		for (@Pc(20) Class8_Sub28 local20 = (Class8_Sub28) this.aClass253_35.method6593(); local20 != null; local20 = (Class8_Sub28) this.aClass253_35.method6595()) {
			@Pc(31) Class8_Sub27 local31 = new Class8_Sub27(local20.aString63, (int) local20.aLong285);
			this.aClass253_34.method6591(local31, Static40.method1285(local20.aString63));
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7456(@OriginalArg(0) String arg0) {
		if (this.aClass253_35 == null) {
			return false;
		}
		if (this.aClass253_34 == null) {
			this.method7454();
		}
		for (@Pc(30) Class8_Sub27 local30 = (Class8_Sub27) this.aClass253_34.method6594(Static40.method1285(arg0)); local30 != null; local30 = (Class8_Sub27) this.aClass253_34.method6599()) {
			if (local30.aString59.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ig;BI)V")
	private void method7457(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static303.method4962(arg0.method8550());
		} else if (arg1 == 2) {
			this.aChar4 = Static303.method4962(arg0.method8550());
		} else if (arg1 == 3) {
			this.aString93 = arg0.method8570();
		} else if (arg1 == 4) {
			this.anInt9096 = arg0.method8540();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(67) int local67 = arg0.method8578();
			this.aClass253_35 = new Class253(Static629.method8469(local67));
			for (@Pc(77) int local77 = 0; local77 < local67; local77++) {
				@Pc(83) int local83 = arg0.method8540();
				@Pc(97) Class8 local97;
				if (arg1 == 5) {
					local97 = new Class8_Sub28(arg0.method8570());
				} else {
					local97 = new Class8_Sub17(arg0.method8540());
				}
				this.aClass253_35.method6591(local97, (long) local83);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ig;B)V")
	public void method7458(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8525();
			if (local9 == 0) {
				return;
			}
			this.method7457(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
	private void method7459() {
		this.aClass253_34 = new Class253(this.aClass253_35.method6597());
		for (@Pc(24) Class8_Sub17 local24 = (Class8_Sub17) this.aClass253_35.method6593(); local24 != null; local24 = (Class8_Sub17) this.aClass253_35.method6595()) {
			@Pc(33) Class8_Sub17 local33 = new Class8_Sub17((int) local24.aLong285);
			this.aClass253_34.method6591(local33, (long) local24.anInt2919);
		}
	}
}

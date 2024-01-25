import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class146 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!cp;")
	private Class44 aClass44_21;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!cp;")
	public Class44 aClass44_22;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	private int anInt3609;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Ljava/lang/String;")
	private String aString36 = "null";

	static {
		new Class57("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	private void method3150() {
		this.aClass44_21 = new Class44(this.aClass44_22.method951());
		for (@Pc(24) Class3_Sub20 local24 = (Class3_Sub20) this.aClass44_22.method950(); local24 != null; local24 = (Class3_Sub20) this.aClass44_22.method949()) {
			@Pc(35) Class3_Sub43 local35 = new Class3_Sub43(local24.aString28, (int) local24.aLong240);
			this.aClass44_21.method948(Static357.method5341(local24.aString28), local35);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZLclient!rp;)V")
	private void method3151(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static240.method4859(arg1.method2753());
		} else if (arg0 == 2) {
			this.aChar3 = Static240.method4859(arg1.method2753());
		} else if (arg0 == 3) {
			this.aString36 = arg1.method2788();
		} else if (arg0 == 4) {
			this.anInt3609 = arg1.method2726();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(48) int local48 = arg1.method2767();
			this.aClass44_22 = new Class44(Static304.method2746(local48));
			for (@Pc(58) int local58 = 0; local58 < local48; local58++) {
				@Pc(64) int local64 = arg1.method2726();
				@Pc(74) Class3 local74;
				if (arg0 == 5) {
					local74 = new Class3_Sub20(arg1.method2788());
				} else {
					local74 = new Class3_Sub28(arg1.method2726());
				}
				this.aClass44_22.method948((long) local64, local74);
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3152(@OriginalArg(1) String arg0) {
		if (this.aClass44_22 == null) {
			return false;
		}
		if (this.aClass44_21 == null) {
			this.method3150();
		}
		for (@Pc(30) Class3_Sub43 local30 = (Class3_Sub43) this.aClass44_21.method942(Static357.method5341(arg0)); local30 != null; local30 = (Class3_Sub43) this.aClass44_21.method946()) {
			if (local30.aString67.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
	public int method3154(@OriginalArg(0) int arg0) {
		if (this.aClass44_22 == null) {
			return this.anInt3609;
		} else {
			@Pc(17) Class3_Sub28 local17 = (Class3_Sub28) this.aClass44_22.method942((long) arg0);
			return local17 == null ? this.anInt3609 : local17.anInt3982;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method3155(@OriginalArg(0) int arg0) {
		if (this.aClass44_22 == null) {
			return this.aString36;
		} else {
			@Pc(17) Class3_Sub20 local17 = (Class3_Sub20) this.aClass44_22.method942((long) arg0);
			return local17 == null ? this.aString36 : local17.aString28;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Z")
	public boolean method3156(@OriginalArg(1) int arg0) {
		if (this.aClass44_22 == null) {
			return false;
		}
		if (this.aClass44_21 == null) {
			this.method3158();
		}
		@Pc(22) Class3_Sub28 local22 = (Class3_Sub28) this.aClass44_21.method942((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!rp;I)V")
	public void method3157(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method3151(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	private void method3158() {
		this.aClass44_21 = new Class44(this.aClass44_22.method951());
		for (@Pc(20) Class3_Sub28 local20 = (Class3_Sub28) this.aClass44_22.method950(); local20 != null; local20 = (Class3_Sub28) this.aClass44_22.method949()) {
			@Pc(29) Class3_Sub28 local29 = new Class3_Sub28((int) local20.aLong240);
			this.aClass44_21.method948((long) local20.anInt3982, local29);
		}
	}
}

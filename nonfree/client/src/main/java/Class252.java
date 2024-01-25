import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class252 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Lclient!tq;")
	private Class305 aClass305_32;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
	private int anInt7518;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Lclient!tq;")
	public Class305 aClass305_33;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "Ljava/lang/String;")
	private String aString97 = "null";

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method6269(@OriginalArg(0) int arg0) {
		if (this.aClass305_33 == null) {
			return this.aString97;
		} else {
			@Pc(17) Class6_Sub30 local17 = (Class6_Sub30) this.aClass305_33.method7447((long) arg0);
			return local17 == null ? this.aString97 : local17.aString55;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	private void method6271() {
		this.aClass305_32 = new Class305(this.aClass305_33.method7441());
		for (@Pc(26) Class6_Sub30 local26 = (Class6_Sub30) this.aClass305_33.method7445(); local26 != null; local26 = (Class6_Sub30) this.aClass305_33.method7449()) {
			@Pc(37) Class6_Sub18 local37 = new Class6_Sub18(local26.aString55, (int) local26.aLong252);
			this.aClass305_32.method7448(Static479.method7314(local26.aString55), local37);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)I")
	public int method6272(@OriginalArg(0) int arg0) {
		if (this.aClass305_33 == null) {
			return this.anInt7518;
		} else {
			@Pc(22) Class6_Sub24 local22 = (Class6_Sub24) this.aClass305_33.method7447((long) arg0);
			return local22 == null ? this.anInt7518 : local22.anInt4156;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method6273(@OriginalArg(0) String arg0) {
		if (this.aClass305_33 == null) {
			return false;
		}
		if (this.aClass305_32 == null) {
			this.method6271();
		}
		for (@Pc(33) Class6_Sub18 local33 = (Class6_Sub18) this.aClass305_32.method7447(Static479.method7314(arg0)); local33 != null; local33 = (Class6_Sub18) this.aClass305_32.method7446()) {
			if (local33.aString29.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	private void method6274() {
		this.aClass305_32 = new Class305(this.aClass305_33.method7441());
		for (@Pc(18) Class6_Sub24 local18 = (Class6_Sub24) this.aClass305_33.method7445(); local18 != null; local18 = (Class6_Sub24) this.aClass305_33.method7449()) {
			@Pc(29) Class6_Sub24 local29 = new Class6_Sub24((int) local18.aLong252);
			this.aClass305_32.method7448((long) local18.anInt4156, local29);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!iaa;IB)V")
	private void method6275(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static60.method1329(arg0.method4972());
		} else if (arg1 == 2) {
			this.aChar2 = Static60.method1329(arg0.method4972());
		} else if (arg1 == 3) {
			this.aString97 = arg0.method4941();
		} else if (arg1 == 4) {
			this.anInt7518 = arg0.method5000();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(47) int local47 = arg0.method4999();
			this.aClass305_33 = new Class305(Static247.method4363(local47));
			for (@Pc(57) int local57 = 0; local57 < local47; local57++) {
				@Pc(63) int local63 = arg0.method5000();
				@Pc(73) Class6 local73;
				if (arg1 == 5) {
					local73 = new Class6_Sub30(arg0.method4941());
				} else {
					local73 = new Class6_Sub24(arg0.method5000());
				}
				this.aClass305_33.method7448((long) local63, local73);
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method6276(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4966();
			if (local14 == 0) {
				return;
			}
			this.method6275(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)Z")
	public boolean method6278(@OriginalArg(1) int arg0) {
		if (this.aClass305_33 == null) {
			return false;
		}
		if (this.aClass305_32 == null) {
			this.method6274();
		}
		@Pc(29) Class6_Sub24 local29 = (Class6_Sub24) this.aClass305_32.method7447((long) arg0);
		return local29 != null;
	}
}

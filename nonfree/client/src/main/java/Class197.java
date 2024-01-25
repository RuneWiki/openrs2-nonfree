import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class197 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	private int anInt5511;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!an;")
	private Class11 aClass11_34;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "Lclient!an;")
	public Class11 aClass11_35;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Ljava/lang/String;")
	private String aString53 = "null";

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Z")
	public boolean method4318(@OriginalArg(1) int arg0) {
		if (this.aClass11_35 == null) {
			return false;
		}
		if (this.aClass11_34 == null) {
			this.method4320();
		}
		@Pc(22) Class3_Sub34 local22 = (Class3_Sub34) this.aClass11_34.method324((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	private void method4319() {
		this.aClass11_34 = new Class11(this.aClass11_35.method315());
		for (@Pc(26) Class3_Sub35 local26 = (Class3_Sub35) this.aClass11_35.method313(); local26 != null; local26 = (Class3_Sub35) this.aClass11_35.method316()) {
			@Pc(36) Class3_Sub13 local36 = new Class3_Sub13(local26.aString54, (int) local26.aLong234);
			this.aClass11_34.method319(local36, Static347.method4610(local26.aString54));
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	private void method4320() {
		this.aClass11_34 = new Class11(this.aClass11_35.method315());
		for (@Pc(22) Class3_Sub34 local22 = (Class3_Sub34) this.aClass11_35.method313(); local22 != null; local22 = (Class3_Sub34) this.aClass11_35.method316()) {
			@Pc(30) Class3_Sub34 local30 = new Class3_Sub34((int) local22.aLong234);
			this.aClass11_34.method319(local30, (long) local22.anInt5289);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)I")
	public int method4321(@OriginalArg(1) int arg0) {
		if (this.aClass11_35 == null) {
			return this.anInt5511;
		} else {
			@Pc(23) Class3_Sub34 local23 = (Class3_Sub34) this.aClass11_35.method324((long) arg0);
			return local23 == null ? this.anInt5511 : local23.anInt5289;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLclient!cu;I)V")
	private void method4324(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static35.method718(arg0.method2612());
		} else if (arg1 == 2) {
			this.aChar4 = Static35.method718(arg0.method2612());
		} else if (arg1 == 3) {
			this.aString53 = arg0.method2620();
		} else if (arg1 == 4) {
			this.anInt5511 = arg0.method2589();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(51) int local51 = arg0.method2588();
			this.aClass11_35 = new Class11(Static288.method4088(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(66) int local66 = arg0.method2589();
				@Pc(78) Class3 local78;
				if (arg1 == 5) {
					local78 = new Class3_Sub35(arg0.method2620());
				} else {
					local78 = new Class3_Sub34(arg0.method2589());
				}
				this.aClass11_35.method319(local78, (long) local66);
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method4325(@OriginalArg(1) int arg0) {
		if (this.aClass11_35 == null) {
			return this.aString53;
		} else {
			@Pc(23) Class3_Sub35 local23 = (Class3_Sub35) this.aClass11_35.method324((long) arg0);
			return local23 == null ? this.aString53 : local23.aString54;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!cu;)V")
	public void method4326(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method4324(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4327(@OriginalArg(1) String arg0) {
		if (this.aClass11_35 == null) {
			return false;
		}
		if (this.aClass11_34 == null) {
			this.method4319();
		}
		for (@Pc(28) Class3_Sub13 local28 = (Class3_Sub13) this.aClass11_34.method324(Static347.method4610(arg0)); local28 != null; local28 = (Class3_Sub13) this.aClass11_34.method318()) {
			if (local28.aString11.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}

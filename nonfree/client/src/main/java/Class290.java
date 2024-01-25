import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class290 {

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!qp;")
	public Class280 aClass280_36;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!qp;")
	private Class280 aClass280_37;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	private int anInt8430;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Ljava/lang/String;")
	private String aString95 = "null";

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method7225(@OriginalArg(1) String arg0) {
		if (this.aClass280_36 == null) {
			return false;
		}
		if (this.aClass280_37 == null) {
			this.method7226();
		}
		for (@Pc(30) Class3_Sub8 local30 = (Class3_Sub8) this.aClass280_37.method7107(Static422.method6618(arg0)); local30 != null; local30 = (Class3_Sub8) this.aClass280_37.method7105()) {
			if (local30.aString9.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	private void method7226() {
		this.aClass280_37 = new Class280(this.aClass280_36.method7102());
		for (@Pc(20) Class3_Sub48 local20 = (Class3_Sub48) this.aClass280_36.method7110(); local20 != null; local20 = (Class3_Sub48) this.aClass280_36.method7108()) {
			@Pc(31) Class3_Sub8 local31 = new Class3_Sub8(local20.aString106, (int) local20.aLong276);
			this.aClass280_37.method7109(local31, Static422.method6618(local20.aString106));
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!sl;)V")
	private void method7227(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static242.method3969(arg1.method4254());
		} else if (arg0 == 2) {
			this.aChar1 = Static242.method3969(arg1.method4254());
		} else if (arg0 == 3) {
			this.aString95 = arg1.method4233();
		} else if (arg0 == 4) {
			this.anInt8430 = arg1.method4207();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(67) int local67 = arg1.method4221();
			this.aClass280_36 = new Class280(Static109.method2234(local67));
			for (@Pc(77) int local77 = 0; local77 < local67; local77++) {
				@Pc(83) int local83 = arg1.method4207();
				@Pc(95) Class3 local95;
				if (arg0 == 5) {
					local95 = new Class3_Sub48(arg1.method4233());
				} else {
					local95 = new Class3_Sub19(arg1.method4207());
				}
				this.aClass280_36.method7109(local95, (long) local83);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)I")
	public int method7228(@OriginalArg(1) int arg0) {
		if (this.aClass280_36 == null) {
			return this.anInt8430;
		} else {
			@Pc(17) Class3_Sub19 local17 = (Class3_Sub19) this.aClass280_36.method7107((long) arg0);
			return local17 == null ? this.anInt8430 : local17.anInt2696;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method7229(@OriginalArg(0) int arg0) {
		if (this.aClass280_36 == null) {
			return this.aString95;
		} else {
			@Pc(17) Class3_Sub48 local17 = (Class3_Sub48) this.aClass280_36.method7107((long) arg0);
			return local17 == null ? this.aString95 : local17.aString106;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	private void method7230() {
		this.aClass280_37 = new Class280(this.aClass280_36.method7102());
		for (@Pc(28) Class3_Sub19 local28 = (Class3_Sub19) this.aClass280_36.method7110(); local28 != null; local28 = (Class3_Sub19) this.aClass280_36.method7108()) {
			@Pc(37) Class3_Sub19 local37 = new Class3_Sub19((int) local28.aLong276);
			this.aClass280_37.method7109(local37, (long) local28.anInt2696);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)Z")
	public boolean method7233(@OriginalArg(0) int arg0) {
		if (this.aClass280_36 == null) {
			return false;
		}
		if (this.aClass280_37 == null) {
			this.method7230();
		}
		@Pc(22) Class3_Sub19 local22 = (Class3_Sub19) this.aClass280_37.method7107((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!sl;)V")
	public void method7234(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4225();
			if (local5 == 0) {
				return;
			}
			this.method7227(local5, arg0);
		}
	}
}

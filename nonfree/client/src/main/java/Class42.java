import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class42 {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt932 = 2;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!u;")
	private Class44 aClass44_1 = new Class44(1024, 0);

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!qb;")
	private Class34 aClass34_1 = new Class34(true);

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt935 = arg1;
			this.anInt936 = arg1;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("86907, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!x;")
	public Class1_Sub1 method641(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass44_1.method644(arg0);
		if (local5 == null) {
			this.anInt933++;
		} else {
			this.aClass34_1.method531(local5);
			this.anInt934++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IJLclient!x;)V")
	public void method642(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt936 == 0) {
				@Pc(9) Class1_Sub1 local9 = this.aClass34_1.method532();
				local9.method669();
				local9.method515();
				if (local9 == this.aClass1_Sub1_37) {
					local9 = this.aClass34_1.method532();
					local9.method669();
					local9.method515();
				}
			} else {
				this.anInt936--;
			}
			this.aClass44_1.method645(arg1, this.anInt932, arg0);
			this.aClass34_1.method531(arg1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("93837, " + -630 + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method643() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass34_1.method532();
			if (local3 == null) {
				this.anInt936 = this.anInt935;
				return;
			}
			local3.method669();
			local3.method515();
		}
	}
}

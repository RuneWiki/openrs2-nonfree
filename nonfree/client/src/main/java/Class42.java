import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class42 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean251 = true;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt931 = -589;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "B")
	private byte aByte38 = 67;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!u;")
	private Class44 aClass44_1 = new Class44(1024, (byte) 1);

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!qb;")
	private Class34 aClass34_1 = new Class34(2);

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt934 = arg0;
			this.anInt935 = arg0;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("75526, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!x;")
	public Class1_Sub1 method641(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass44_1.method644(arg0);
		if (local5 == null) {
			this.anInt932++;
		} else {
			this.aClass34_1.method531(local5);
			this.anInt933++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!x;JB)V")
	public void method642(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.anInt935 == 0) {
				@Pc(6) Class1_Sub1 local6 = this.aClass34_1.method532();
				local6.method669();
				local6.method515();
				if (local6 == this.aClass1_Sub1_37) {
					local6 = this.aClass34_1.method532();
					local6.method669();
					local6.method515();
				}
			} else {
				this.anInt935--;
			}
			this.aClass44_1.method645(352, arg1, arg0);
			this.aClass34_1.method531(arg0);
			if (arg2 != this.aByte38) {
				this.anInt931 = -122;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("80574, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method643() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass34_1.method532();
			if (local3 == null) {
				this.anInt935 = this.anInt934;
				return;
			}
			local3.method669();
			local3.method515();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class42 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!u;")
	private Class44 aClass44_1 = new Class44(1024, 299);

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!qb;")
	private Class34 aClass34_1 = new Class34(false);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt965 = arg1;
			this.anInt966 = arg1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("862, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!x;")
	public Class1_Sub1 method641(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass44_1.method644(arg0);
		if (local5 == null) {
			this.anInt963++;
		} else {
			this.aClass34_1.method531(local5);
			this.anInt964++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZJLclient!x;)V")
	public void method642(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt966 == 0) {
				@Pc(8) Class1_Sub1 local8 = this.aClass34_1.method532();
				local8.method669();
				local8.method515();
				if (local8 == this.aClass1_Sub1_37) {
					local8 = this.aClass34_1.method532();
					local8.method669();
					local8.method515();
				}
			} else {
				this.anInt966--;
			}
			this.aClass44_1.method645(arg0, arg1);
			this.aClass34_1.method531(arg1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("27976, " + true + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method643() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass34_1.method532();
			if (local3 == null) {
				this.anInt966 = this.anInt965;
				return;
			}
			local3.method669();
			local3.method515();
		}
	}
}

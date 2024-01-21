import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class39 {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt925 = 2;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!u;")
	private Class41 aClass41_1 = new Class41(1024, 8);

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!qb;")
	private Class34 aClass34_1 = new Class34(309);

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ZI)V")
	public Class39(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt928 = arg1;
			this.anInt929 = arg1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("24307, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!x;")
	public Class1_Sub1 method608(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass41_1.method611(arg0);
		if (local5 == null) {
			this.anInt926++;
		} else {
			this.aClass34_1.method540(local5);
			this.anInt927++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JZLclient!x;)V")
	public void method609(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt929 == 0) {
				@Pc(8) Class1_Sub1 local8 = this.aClass34_1.method541();
				local8.method630();
				local8.method487();
				if (local8 == this.aClass1_Sub1_37) {
					local8 = this.aClass34_1.method541();
					local8.method630();
					local8.method487();
				}
			} else {
				this.anInt929--;
			}
			this.aClass41_1.method612(arg0, arg1);
			this.aClass34_1.method540(arg1);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("13896, " + arg0 + ", " + true + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method610() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass34_1.method541();
			if (local3 == null) {
				this.anInt929 = this.anInt928;
				return;
			}
			local3.method630();
			local3.method487();
		}
	}
}

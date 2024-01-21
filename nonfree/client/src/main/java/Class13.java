import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GCPOSBWX")
public final class Class13 {

	@OriginalMember(owner = "client!GCPOSBWX", name = "b", descriptor = "I")
	private static int anInt368;

	@OriginalMember(owner = "client!GCPOSBWX", name = "d", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!GCPOSBWX", name = "e", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!GCPOSBWX", name = "a", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!GCPOSBWX", name = "c", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!GCPOSBWX", name = "f", descriptor = "Lclient!PPOHBEGB;")
	private Class1_Sub1 aClass1_Sub1_19 = new Class1_Sub1();

	@OriginalMember(owner = "client!GCPOSBWX", name = "j", descriptor = "Lclient!BISVHPUN;")
	private Class3 aClass3_1 = new Class3(anInt368);

	@OriginalMember(owner = "client!GCPOSBWX", name = "g", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!GCPOSBWX", name = "h", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!GCPOSBWX", name = "i", descriptor = "Lclient!ARZPHHDH;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!GCPOSBWX", name = "<init>", descriptor = "(ZI)V")
	public Class13(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt371 = arg1;
			this.anInt372 = arg1;
			this.aClass2_1 = new Class2(-877, 1024);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("52366, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCPOSBWX", name = "a", descriptor = "(J)Lclient!PPOHBEGB;")
	public Class1_Sub1 method176(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass2_1.method18(arg0);
		if (local5 == null) {
			this.anInt369++;
		} else {
			this.aClass3_1.method20(local5);
			this.anInt370++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!GCPOSBWX", name = "a", descriptor = "(Lclient!PPOHBEGB;JB)V")
	public void method177(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (this.anInt372 == 0) {
				@Pc(19) Class1_Sub1 local19 = this.aClass3_1.method21();
				local19.method526();
				local19.method527();
				if (local19 == this.aClass1_Sub1_19) {
					local19 = this.aClass3_1.method21();
					local19.method526();
					local19.method527();
				}
			} else {
				this.anInt372--;
			}
			this.aClass2_1.method19(arg0, arg1);
			this.aClass3_1.method20(arg0);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("47547, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCPOSBWX", name = "a", descriptor = "()V")
	public void method178() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass3_1.method21();
			if (local3 == null) {
				this.anInt372 = this.anInt371;
				return;
			}
			local3.method526();
			local3.method527();
		}
	}
}

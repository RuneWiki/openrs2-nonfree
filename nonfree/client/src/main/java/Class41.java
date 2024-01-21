import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UNPPHFRC")
public final class Class41 {

	@OriginalMember(owner = "client!UNPPHFRC", name = "a", descriptor = "I")
	private int anInt709;

	@OriginalMember(owner = "client!UNPPHFRC", name = "b", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!UNPPHFRC", name = "c", descriptor = "Lclient!YCAZQYJA;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!UNPPHFRC", name = "g", descriptor = "Lclient!HRSVWDNF;")
	private Class16 aClass16_1 = new Class16((byte) 77);

	@OriginalMember(owner = "client!UNPPHFRC", name = "d", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!UNPPHFRC", name = "e", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!UNPPHFRC", name = "f", descriptor = "Lclient!BEGVKNAP;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!UNPPHFRC", name = "<init>", descriptor = "(ZI)V")
	public Class41(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt711 = arg1;
			this.anInt712 = arg1;
			this.aClass4_1 = new Class4(45840, 1024);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("69090, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNPPHFRC", name = "a", descriptor = "(J)Lclient!YCAZQYJA;")
	public Class1_Sub1 method498(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass4_1.method62(arg0);
		if (local5 == null) {
			this.anInt709++;
		} else {
			this.aClass16_1.method286(local5);
			this.anInt710++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!UNPPHFRC", name = "a", descriptor = "(ZJLclient!YCAZQYJA;)V")
	public void method499(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt712 == 0) {
				@Pc(8) Class1_Sub1 local8 = this.aClass16_1.method287();
				local8.method501();
				local8.method502();
				if (local8 == this.aClass1_Sub1_35) {
					local8 = this.aClass16_1.method287();
					local8.method501();
					local8.method502();
				}
			} else {
				this.anInt712--;
			}
			this.aClass4_1.method63(arg0, arg1);
			this.aClass16_1.method286(arg1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("10372, " + false + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNPPHFRC", name = "a", descriptor = "()V")
	public void method500() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass16_1.method287();
			if (local3 == null) {
				this.anInt712 = this.anInt711;
				return;
			}
			local3.method501();
			local3.method502();
		}
	}
}

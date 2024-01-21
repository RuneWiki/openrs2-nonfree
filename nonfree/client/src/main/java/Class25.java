import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NQQFCAPC")
public final class Class25 {

	@OriginalMember(owner = "client!NQQFCAPC", name = "c", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!NQQFCAPC", name = "d", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!NQQFCAPC", name = "a", descriptor = "I")
	private int anInt389 = 36795;

	@OriginalMember(owner = "client!NQQFCAPC", name = "b", descriptor = "B")
	private byte aByte19 = 5;

	@OriginalMember(owner = "client!NQQFCAPC", name = "e", descriptor = "Lclient!OZZFMONJ;")
	private Class3_Sub3 aClass3_Sub3_17 = new Class3_Sub3();

	@OriginalMember(owner = "client!NQQFCAPC", name = "i", descriptor = "Lclient!EZRJDJYN;")
	private Class10 aClass10_2 = new Class10(5);

	@OriginalMember(owner = "client!NQQFCAPC", name = "f", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!NQQFCAPC", name = "g", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!NQQFCAPC", name = "h", descriptor = "Lclient!BCCRZRYI;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!NQQFCAPC", name = "<init>", descriptor = "(II)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt392 = arg0;
			this.anInt393 = arg0;
			@Pc(28) int local28 = 21 / arg1;
			this.aClass5_1 = new Class5(1024, 40545);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("24158, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQQFCAPC", name = "a", descriptor = "(J)Lclient!OZZFMONJ;")
	public Class3_Sub3 method218(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass5_1.method41(arg0);
		if (local5 == null) {
			this.anInt390++;
		} else {
			this.aClass10_2.method67(local5);
			this.anInt391++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!NQQFCAPC", name = "a", descriptor = "(IJLclient!OZZFMONJ;)V")
	public void method219(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class3_Sub3 arg2) {
		try {
			if (this.anInt393 == 0) {
				@Pc(8) Class3_Sub3 local8 = this.aClass10_2.method68();
				local8.method545();
				local8.method546();
				if (local8 == this.aClass3_Sub3_17) {
					local8 = this.aClass10_2.method68();
					local8.method545();
					local8.method546();
				}
			} else {
				this.anInt393--;
			}
			this.aClass5_1.method42(arg1, this.aByte19, arg2);
			this.aClass10_2.method67(arg2);
			@Pc(47) boolean local47 = false;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("39215, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQQFCAPC", name = "a", descriptor = "()V")
	public void method220() {
		while (true) {
			@Pc(3) Class3_Sub3 local3 = this.aClass10_2.method68();
			if (local3 == null) {
				this.anInt393 = this.anInt392;
				return;
			}
			local3.method545();
			local3.method546();
		}
	}
}

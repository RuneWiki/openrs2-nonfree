import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ULDYKUPK")
public final class Class42 {

	@OriginalMember(owner = "client!ULDYKUPK", name = "a", descriptor = "I")
	private int anInt548;

	@OriginalMember(owner = "client!ULDYKUPK", name = "c", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!ULDYKUPK", name = "d", descriptor = "I")
	private int anInt551;

	@OriginalMember(owner = "client!ULDYKUPK", name = "e", descriptor = "Lclient!UCIRENXU;")
	private Class6_Sub2 aClass6_Sub2_27 = new Class6_Sub2();

	@OriginalMember(owner = "client!ULDYKUPK", name = "i", descriptor = "Lclient!BGTUCWCI;")
	private Class3 aClass3_2 = new Class3(41416);

	@OriginalMember(owner = "client!ULDYKUPK", name = "f", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!ULDYKUPK", name = "b", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "client!ULDYKUPK", name = "g", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!ULDYKUPK", name = "h", descriptor = "Lclient!MPNPHMKJ;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!ULDYKUPK", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt552 = arg0;
			this.anInt553 = arg0;
			this.aClass24_1 = new Class24(0, 1024);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("85005, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULDYKUPK", name = "a", descriptor = "(J)Lclient!UCIRENXU;")
	public Class6_Sub2 method453(@OriginalArg(0) long arg0) {
		@Pc(5) Class6_Sub2 local5 = (Class6_Sub2) this.aClass24_1.method185(arg0);
		if (local5 == null) {
			this.anInt550++;
		} else {
			this.aClass3_2.method13(local5);
			this.anInt551++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ULDYKUPK", name = "a", descriptor = "(JILclient!UCIRENXU;)V")
	public void method454(@OriginalArg(0) long arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		try {
			if (this.anInt553 == 0) {
				@Pc(13) Class6_Sub2 local13 = this.aClass3_2.method14();
				local13.method545();
				local13.method546();
				if (local13 == this.aClass6_Sub2_27) {
					local13 = this.aClass3_2.method14();
					local13.method545();
					local13.method546();
				}
			} else {
				this.anInt553--;
			}
			this.aClass24_1.method186(arg0, arg1);
			this.aClass3_2.method13(arg1);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("5401, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULDYKUPK", name = "a", descriptor = "()V")
	public void method455() {
		while (true) {
			@Pc(3) Class6_Sub2 local3 = this.aClass3_2.method14();
			if (local3 == null) {
				this.anInt553 = this.anInt552;
				return;
			}
			local3.method545();
			local3.method546();
		}
	}
}

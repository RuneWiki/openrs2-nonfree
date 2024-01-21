import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CZWVRQJW")
public final class Class4 {

	@OriginalMember(owner = "client!CZWVRQJW", name = "c", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!CZWVRQJW", name = "d", descriptor = "I")
	private int anInt131;

	@OriginalMember(owner = "client!CZWVRQJW", name = "a", descriptor = "I")
	private int anInt128 = 7129;

	@OriginalMember(owner = "client!CZWVRQJW", name = "b", descriptor = "I")
	private int anInt129 = -25;

	@OriginalMember(owner = "client!CZWVRQJW", name = "e", descriptor = "Lclient!IYPTVTAD;")
	private Class1_Sub1 aClass1_Sub1_9 = new Class1_Sub1();

	@OriginalMember(owner = "client!CZWVRQJW", name = "i", descriptor = "Lclient!DTFBSXNF;")
	private Class6 aClass6_1 = new Class6(false);

	@OriginalMember(owner = "client!CZWVRQJW", name = "f", descriptor = "I")
	private int anInt132;

	@OriginalMember(owner = "client!CZWVRQJW", name = "g", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!CZWVRQJW", name = "h", descriptor = "Lclient!RXQASTJV;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!CZWVRQJW", name = "<init>", descriptor = "(ZI)V")
	public Class4(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt132 = arg1;
			this.anInt133 = arg1;
			this.aClass33_1 = new Class33(1024, 0);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("941, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CZWVRQJW", name = "a", descriptor = "(J)Lclient!IYPTVTAD;")
	public Class1_Sub1 method33(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass33_1.method484(arg0);
		if (local5 == null) {
			this.anInt130++;
		} else {
			this.aClass6_1.method93(local5);
			this.anInt131++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!CZWVRQJW", name = "a", descriptor = "(Lclient!IYPTVTAD;ZJ)V")
	public void method34(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt133 == 0) {
				@Pc(17) Class1_Sub1 local17 = this.aClass6_1.method94();
				local17.method544();
				local17.method545();
				if (local17 == this.aClass1_Sub1_9) {
					local17 = this.aClass6_1.method94();
					local17.method544();
					local17.method545();
				}
			} else {
				this.anInt133--;
			}
			this.aClass33_1.method485(arg0, arg1);
			this.aClass6_1.method93(arg0);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("39074, " + arg0 + ", " + true + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CZWVRQJW", name = "a", descriptor = "()V")
	public void method35() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass6_1.method94();
			if (local3 == null) {
				this.anInt133 = this.anInt132;
				return;
			}
			local3.method544();
			local3.method545();
		}
	}
}

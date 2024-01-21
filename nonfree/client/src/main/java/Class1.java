import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AKUDQPZE")
public final class Class1 {

	@OriginalMember(owner = "client!AKUDQPZE", name = "c", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!AKUDQPZE", name = "d", descriptor = "I")
	private int anInt3;

	@OriginalMember(owner = "client!AKUDQPZE", name = "a", descriptor = "Z")
	private boolean aBoolean1 = true;

	@OriginalMember(owner = "client!AKUDQPZE", name = "b", descriptor = "I")
	private int anInt1 = -5592;

	@OriginalMember(owner = "client!AKUDQPZE", name = "e", descriptor = "Lclient!CYIKEZWP;")
	private Class4_Sub1 aClass4_Sub1_1 = new Class4_Sub1();

	@OriginalMember(owner = "client!AKUDQPZE", name = "i", descriptor = "Lclient!FEBLELGD;")
	private Class13 aClass13_1 = new Class13((byte) 3);

	@OriginalMember(owner = "client!AKUDQPZE", name = "f", descriptor = "I")
	private int anInt4;

	@OriginalMember(owner = "client!AKUDQPZE", name = "g", descriptor = "I")
	private int anInt5;

	@OriginalMember(owner = "client!AKUDQPZE", name = "h", descriptor = "Lclient!HSZHZJQR;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!AKUDQPZE", name = "<init>", descriptor = "(BI)V")
	public Class1(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt4 = arg1;
			this.anInt5 = arg1;
			@Pc(29) boolean local29 = false;
			this.aClass21_1 = new Class21(false, 1024);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("9964, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKUDQPZE", name = "a", descriptor = "(J)Lclient!CYIKEZWP;")
	public Class4_Sub1 method1(@OriginalArg(0) long arg0) {
		@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass21_1.method267(arg0);
		if (local5 == null) {
			this.anInt2++;
		} else {
			this.aClass13_1.method212(local5);
			this.anInt3++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!AKUDQPZE", name = "a", descriptor = "(Lclient!CYIKEZWP;ZJ)V")
	public void method2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt5 == 0) {
				@Pc(6) Class4_Sub1 local6 = this.aClass13_1.method213();
				local6.method528();
				local6.method529();
				if (local6 == this.aClass4_Sub1_1) {
					local6 = this.aClass13_1.method213();
					local6.method528();
					local6.method529();
				}
			} else {
				this.anInt5--;
			}
			this.aClass21_1.method268(arg1, arg0);
			this.aClass13_1.method212(arg0);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("22790, " + arg0 + ", " + false + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKUDQPZE", name = "a", descriptor = "()V")
	public void method3() {
		while (true) {
			@Pc(3) Class4_Sub1 local3 = this.aClass13_1.method213();
			if (local3 == null) {
				this.anInt5 = this.anInt4;
				return;
			}
			local3.method528();
			local3.method529();
		}
	}
}

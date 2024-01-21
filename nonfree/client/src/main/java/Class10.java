import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EOJHVRZF")
public final class Class10 {

	@OriginalMember(owner = "client!EOJHVRZF", name = "d", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!EOJHVRZF", name = "e", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!EOJHVRZF", name = "a", descriptor = "I")
	private int anInt96 = 10369;

	@OriginalMember(owner = "client!EOJHVRZF", name = "b", descriptor = "B")
	private byte aByte6 = -94;

	@OriginalMember(owner = "client!EOJHVRZF", name = "c", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!EOJHVRZF", name = "f", descriptor = "Lclient!EWMBJETC;")
	private Class6_Sub2 aClass6_Sub2_1 = new Class6_Sub2();

	@OriginalMember(owner = "client!EOJHVRZF", name = "j", descriptor = "Lclient!ODYOEFFK;")
	private Class26 aClass26_2 = new Class26(889);

	@OriginalMember(owner = "client!EOJHVRZF", name = "g", descriptor = "I")
	private int anInt99;

	@OriginalMember(owner = "client!EOJHVRZF", name = "h", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!EOJHVRZF", name = "i", descriptor = "Lclient!OAXQGLDV;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!EOJHVRZF", name = "<init>", descriptor = "(II)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != this.anInt96) {
				for (@Pc(27) int local27 = 1; local27 > 0; local27++) {
				}
			}
			this.anInt99 = arg1;
			this.anInt100 = arg1;
			this.aClass24_1 = new Class24(1024, false);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("71561, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOJHVRZF", name = "a", descriptor = "(J)Lclient!EWMBJETC;")
	public Class6_Sub2 method75(@OriginalArg(0) long arg0) {
		@Pc(5) Class6_Sub2 local5 = (Class6_Sub2) this.aClass24_1.method297(arg0);
		if (local5 == null) {
			this.anInt97++;
		} else {
			this.aClass26_2.method351(local5);
			this.anInt98++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!EOJHVRZF", name = "a", descriptor = "(JILclient!EWMBJETC;)V")
	public void method76(@OriginalArg(0) long arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		try {
			if (this.anInt100 == 0) {
				@Pc(6) Class6_Sub2 local6 = this.aClass26_2.method352();
				local6.method512();
				local6.method513();
				if (local6 == this.aClass6_Sub2_1) {
					local6 = this.aClass26_2.method352();
					local6.method512();
					local6.method513();
				}
			} else {
				this.anInt100--;
			}
			this.aClass24_1.method298(arg0, arg1);
			this.aClass26_2.method351(arg1);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("64519, " + arg0 + ", " + 77 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOJHVRZF", name = "a", descriptor = "()V")
	public void method77() {
		while (true) {
			@Pc(3) Class6_Sub2 local3 = this.aClass26_2.method352();
			if (local3 == null) {
				this.anInt100 = this.anInt99;
				return;
			}
			local3.method512();
			local3.method513();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class39 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!u;")
	private Class41 aClass41_1 = new Class41((byte) 81, 1024);

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!qb;")
	private Class34 aClass34_1 = new Class34((byte) 5);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt930 = arg1;
			this.anInt931 = arg1;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("4138, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!x;")
	public Class1_Sub1 method609(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass41_1.method612(arg0);
		if (local5 == null) {
			this.anInt928++;
		} else {
			this.aClass34_1.method541(local5);
			this.anInt929++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!x;JI)V")
	public void method610(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (this.anInt931 == 0) {
				@Pc(10) Class1_Sub1 local10 = this.aClass34_1.method542();
				local10.method635();
				local10.method488();
				if (local10 == this.aClass1_Sub1_37) {
					local10 = this.aClass34_1.method542();
					local10.method635();
					local10.method488();
				}
			} else {
				this.anInt931--;
			}
			this.aClass41_1.method613(arg0, arg1);
			this.aClass34_1.method541(arg0);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("79337, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method611() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass34_1.method542();
			if (local3 == null) {
				this.anInt931 = this.anInt930;
				return;
			}
			local3.method635();
			local3.method488();
		}
	}
}

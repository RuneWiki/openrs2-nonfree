import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RPWOWYDL")
public final class Class37 {

	@OriginalMember(owner = "client!RPWOWYDL", name = "a", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!RPWOWYDL", name = "b", descriptor = "I")
	private int anInt563;

	@OriginalMember(owner = "client!RPWOWYDL", name = "c", descriptor = "Lclient!NFNHZJTP;")
	private Class2_Sub1 aClass2_Sub1_31 = new Class2_Sub1();

	@OriginalMember(owner = "client!RPWOWYDL", name = "g", descriptor = "Lclient!QUHNUHWS;")
	private Class35 aClass35_2 = new Class35(-160);

	@OriginalMember(owner = "client!RPWOWYDL", name = "d", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!RPWOWYDL", name = "e", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!RPWOWYDL", name = "f", descriptor = "Lclient!EKGZTZOT;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!RPWOWYDL", name = "<init>", descriptor = "(II)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt564 = arg1;
			this.anInt565 = arg1;
			this.aClass7_1 = new Class7(-971, 1024);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("68562, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPWOWYDL", name = "a", descriptor = "(J)Lclient!NFNHZJTP;")
	public Class2_Sub1 method363(@OriginalArg(0) long arg0) {
		@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass7_1.method132(arg0);
		if (local5 == null) {
			this.anInt562++;
		} else {
			this.aClass35_2.method355(local5);
			this.anInt563++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!RPWOWYDL", name = "a", descriptor = "(BJLclient!NFNHZJTP;)V")
	public void method364(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub1 arg1) {
		try {
			if (this.anInt565 == 0) {
				@Pc(6) Class2_Sub1 local6 = this.aClass35_2.method356();
				local6.method558();
				local6.method559();
				if (local6 == this.aClass2_Sub1_31) {
					local6 = this.aClass35_2.method356();
					local6.method558();
					local6.method559();
				}
			} else {
				this.anInt565--;
			}
			this.aClass7_1.method133(arg1, arg0);
			this.aClass35_2.method355(arg1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("56126, " + 124 + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPWOWYDL", name = "a", descriptor = "()V")
	public void method365() {
		while (true) {
			@Pc(3) Class2_Sub1 local3 = this.aClass35_2.method356();
			if (local3 == null) {
				this.anInt565 = this.anInt564;
				return;
			}
			local3.method558();
			local3.method559();
		}
	}
}

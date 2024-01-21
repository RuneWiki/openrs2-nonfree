import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BVBRKPZH")
public final class Class4 {

	@OriginalMember(owner = "client!BVBRKPZH", name = "c", descriptor = "B")
	private static byte aByte6 = -98;

	@OriginalMember(owner = "client!BVBRKPZH", name = "e", descriptor = "I")
	private int anInt72;

	@OriginalMember(owner = "client!BVBRKPZH", name = "f", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!BVBRKPZH", name = "a", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!BVBRKPZH", name = "b", descriptor = "I")
	private int anInt70 = 35268;

	@OriginalMember(owner = "client!BVBRKPZH", name = "g", descriptor = "Lclient!YPOWJZIQ;")
	private Class2_Sub1 aClass2_Sub1_9 = new Class2_Sub1();

	@OriginalMember(owner = "client!BVBRKPZH", name = "k", descriptor = "Lclient!OZVXYFRH;")
	private Class28 aClass28_1 = new Class28(aByte6);

	@OriginalMember(owner = "client!BVBRKPZH", name = "h", descriptor = "I")
	private int anInt74;

	@OriginalMember(owner = "client!BVBRKPZH", name = "i", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!BVBRKPZH", name = "d", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!BVBRKPZH", name = "j", descriptor = "Lclient!DIFURFJI;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!BVBRKPZH", name = "<init>", descriptor = "(II)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt74 = arg1;
			this.anInt75 = arg1;
			this.aClass8_1 = new Class8(this.anInt70, 1024);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("70008, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVBRKPZH", name = "a", descriptor = "(J)Lclient!YPOWJZIQ;")
	public Class2_Sub1 method37(@OriginalArg(0) long arg0) {
		@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass8_1.method79(arg0);
		if (local5 == null) {
			this.anInt72++;
		} else {
			this.aClass28_1.method235(local5);
			this.anInt73++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!BVBRKPZH", name = "a", descriptor = "(BJLclient!YPOWJZIQ;)V")
	public void method38(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub1 arg1) {
		try {
			if (this.aByte5 == 0) {
				if (this.anInt75 == 0) {
					@Pc(17) Class2_Sub1 local17 = this.aClass28_1.method236();
					local17.method466();
					local17.method467();
					if (local17 == this.aClass2_Sub1_9) {
						local17 = this.aClass28_1.method236();
						local17.method466();
						local17.method467();
					}
				} else {
					this.anInt75--;
				}
				this.aClass8_1.method80(arg0, arg1);
				this.aClass28_1.method235(arg1);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("72202, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVBRKPZH", name = "a", descriptor = "()V")
	public void method39() {
		while (true) {
			@Pc(3) Class2_Sub1 local3 = this.aClass28_1.method236();
			if (local3 == null) {
				this.anInt75 = this.anInt74;
				return;
			}
			local3.method466();
			local3.method467();
		}
	}
}

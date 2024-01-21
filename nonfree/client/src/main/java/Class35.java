import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class35 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private static int anInt730 = 12;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt729 = -9908;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!t;")
	private Class37 aClass37_1 = new Class37(anInt730, 1024);

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!pb;")
	private Class30 aClass30_1 = new Class30(35274);

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt731;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IB)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt731 = arg0;
			@Pc(25) boolean local25 = false;
			this.anInt732 = arg0;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("5031, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!db;")
	public Class1_Sub3 method519(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass37_1.method522(arg0);
		if (local5 != null) {
			this.aClass30_1.method453(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JILclient!db;)V")
	public void method520(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		try {
			if (this.anInt732 == 0) {
				@Pc(6) Class1_Sub3 local6 = this.aClass30_1.method454();
				local6.method559();
				local6.method369();
			} else {
				this.anInt732--;
			}
			this.aClass37_1.method523(arg0, arg1);
			this.aClass30_1.method453(arg1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("76739, " + arg0 + ", " + 1567 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method521() {
		while (true) {
			@Pc(3) Class1_Sub3 local3 = this.aClass30_1.method454();
			if (local3 == null) {
				this.anInt732 = this.anInt731;
				return;
			}
			local3.method559();
			local3.method369();
		}
	}
}

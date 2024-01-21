import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class35 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt710 = -241;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt711 = 9;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!t;")
	private Class37 aClass37_1 = new Class37(1024, 0);

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!pb;")
	private Class30 aClass30_1 = new Class30(547);

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	private int anInt713;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt712 = arg1;
			this.anInt713 = arg1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("9205, " + arg0 + ", " + arg1 + ", " + local37.toString());
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

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!db;JI)V")
	public void method520(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) long arg1) {
		try {
			if (this.anInt713 == 0) {
				@Pc(8) Class1_Sub3 local8 = this.aClass30_1.method454();
				local8.method559();
				local8.method369();
			} else {
				this.anInt713--;
			}
			this.aClass37_1.method523(arg1, arg0, this.anInt710);
			this.aClass30_1.method453(arg0);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("6739, " + arg0 + ", " + arg1 + ", " + -21658 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method521() {
		while (true) {
			@Pc(3) Class1_Sub3 local3 = this.aClass30_1.method454();
			if (local3 == null) {
				this.anInt713 = this.anInt712;
				return;
			}
			local3.method559();
			local3.method369();
		}
	}
}

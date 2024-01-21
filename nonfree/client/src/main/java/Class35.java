import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class35 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!t;")
	private Class37 aClass37_1 = new Class37(3, 1024);

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!pb;")
	private Class30 aClass30_1 = new Class30(4);

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt720;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt719 = arg1;
			this.anInt720 = arg1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("59664, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!db;")
	public Class1_Sub3 method527(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass37_1.method530(arg0);
		if (local5 != null) {
			this.aClass30_1.method461(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!db;JZ)V")
	public void method528(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) long arg1) {
		try {
			if (this.anInt720 == 0) {
				@Pc(18) Class1_Sub3 local18 = this.aClass30_1.method462();
				local18.method567();
				local18.method377();
			} else {
				this.anInt720--;
			}
			this.aClass37_1.method531((byte) 6, arg1, arg0);
			this.aClass30_1.method461(arg0);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("6229, " + arg0 + ", " + arg1 + ", " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method529() {
		while (true) {
			@Pc(3) Class1_Sub3 local3 = this.aClass30_1.method462();
			if (local3 == null) {
				this.anInt720 = this.anInt719;
				return;
			}
			local3.method567();
			local3.method377();
		}
	}
}

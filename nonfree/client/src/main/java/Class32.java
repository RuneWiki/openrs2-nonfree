import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class32 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt569 = 930;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!t;")
	private Class34 aClass34_1 = new Class34((byte) 1, 1024);

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!pb;")
	private Class27 aClass27_1 = new Class27(0);

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt571;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt570 = arg1;
			this.anInt571 = arg1;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("99862, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!db;")
	public Class1_Sub3 method470(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass34_1.method473(arg0);
		if (local5 != null) {
			this.aClass27_1.method407(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JILclient!db;)V")
	public void method471(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3 arg2) {
		try {
			@Pc(5) boolean local5 = true;
			if (this.anInt571 == 0) {
				@Pc(12) Class1_Sub3 local12 = this.aClass27_1.method408();
				local12.method512();
				local12.method368();
			} else {
				this.anInt571--;
			}
			this.aClass34_1.method474(arg2, arg0);
			this.aClass27_1.method407(arg2);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("76121, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method472() {
		while (true) {
			@Pc(3) Class1_Sub3 local3 = this.aClass27_1.method408();
			if (local3 == null) {
				this.anInt571 = this.anInt570;
				return;
			}
			local3.method512();
			local3.method368();
		}
	}
}

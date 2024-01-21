import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class35 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!t;")
	private Class37 aClass37_1 = new Class37((byte) 84, 1024);

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!pb;")
	private Class30 aClass30_1 = new Class30(463);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt703;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt702 = arg1;
			this.anInt703 = arg1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("77106, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!db;")
	public Class1_Sub3 method507(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass37_1.method510(arg0);
		if (local5 != null) {
			this.aClass30_1.method442(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JLclient!db;B)V")
	public void method508(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt703 == 0) {
				@Pc(16) Class1_Sub3 local16 = this.aClass30_1.method443();
				local16.method547();
				local16.method358();
			} else {
				this.anInt703--;
			}
			this.aClass37_1.method511(arg0, arg1);
			this.aClass30_1.method442(arg1);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("64478, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method509() {
		while (true) {
			@Pc(3) Class1_Sub3 local3 = this.aClass30_1.method443();
			if (local3 == null) {
				this.anInt703 = this.anInt702;
				return;
			}
			local3.method547();
			local3.method358();
		}
	}
}

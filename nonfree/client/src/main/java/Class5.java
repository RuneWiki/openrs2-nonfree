import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CEEJCAVA")
public final class Class5 {

	@OriginalMember(owner = "client!CEEJCAVA", name = "g", descriptor = "Lclient!SSWDZUWQ;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!CEEJCAVA", name = "b", descriptor = "I")
	private int anInt48 = 45492;

	@OriginalMember(owner = "client!CEEJCAVA", name = "c", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!CEEJCAVA", name = "d", descriptor = "B")
	private byte aByte4 = 8;

	@OriginalMember(owner = "client!CEEJCAVA", name = "e", descriptor = "I")
	private int anInt49 = 17532;

	@OriginalMember(owner = "client!CEEJCAVA", name = "f", descriptor = "Lclient!SSWDZUWQ;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!CEEJCAVA", name = "<init>", descriptor = "(I)V")
	public Class5(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_1.aClass6_41 = this.aClass6_1;
			this.aClass6_1.aClass6_42 = this.aClass6_1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("63540, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "(Lclient!SSWDZUWQ;)V")
	public void method30(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_42 != null) {
			arg0.method548();
		}
		arg0.aClass6_42 = this.aClass6_1.aClass6_42;
		arg0.aClass6_41 = this.aClass6_1;
		arg0.aClass6_42.aClass6_41 = arg0;
		arg0.aClass6_41.aClass6_42 = arg0;
	}

	@OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "(Lclient!SSWDZUWQ;B)V")
	public void method31(@OriginalArg(0) Class6 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0.aClass6_42 != null) {
				arg0.method548();
			}
			arg0.aClass6_42 = this.aClass6_1;
			arg0.aClass6_41 = this.aClass6_1.aClass6_41;
			@Pc(20) boolean local20 = false;
			arg0.aClass6_42.aClass6_41 = arg0;
			arg0.aClass6_41.aClass6_42 = arg0;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("69694, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "()Lclient!SSWDZUWQ;")
	public Class6 method32() {
		@Pc(3) Class6 local3 = this.aClass6_1.aClass6_41;
		if (local3 == this.aClass6_1) {
			return null;
		} else {
			local3.method548();
			return local3;
		}
	}

	@OriginalMember(owner = "client!CEEJCAVA", name = "b", descriptor = "()Lclient!SSWDZUWQ;")
	public Class6 method33() {
		@Pc(3) Class6 local3 = this.aClass6_1.aClass6_41;
		if (local3 == this.aClass6_1) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local3.aClass6_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "(I)Lclient!SSWDZUWQ;")
	public Class6 method34() {
		try {
			@Pc(13) Class6 local13 = this.aClass6_1.aClass6_42;
			if (local13 == this.aClass6_1) {
				this.aClass6_2 = null;
				return null;
			} else {
				this.aClass6_2 = local13.aClass6_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("93812, " + 36418 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CEEJCAVA", name = "a", descriptor = "(B)Lclient!SSWDZUWQ;")
	public Class6 method35(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class6 local2 = this.aClass6_2;
			if (local2 == this.aClass6_1) {
				this.aClass6_2 = null;
				return null;
			}
			this.aClass6_2 = local2.aClass6_41;
			if (this.aByte4 != 8) {
				throw new NullPointerException();
			}
			@Pc(21) boolean local21 = false;
			return local2;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("67747, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CEEJCAVA", name = "b", descriptor = "(I)Lclient!SSWDZUWQ;")
	public Class6 method36() {
		try {
			@Pc(7) Class6 local7 = this.aClass6_2;
			if (local7 == this.aClass6_1) {
				this.aClass6_2 = null;
				return null;
			} else {
				this.aClass6_2 = local7.aClass6_42;
				return local7;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("32574, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CEEJCAVA", name = "c", descriptor = "()V")
	public void method37() {
		if (this.aClass6_1.aClass6_41 == this.aClass6_1) {
			return;
		}
		while (true) {
			@Pc(10) Class6 local10 = this.aClass6_1.aClass6_41;
			if (local10 == this.aClass6_1) {
				return;
			}
			local10.method548();
		}
	}
}

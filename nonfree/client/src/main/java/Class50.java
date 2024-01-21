import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZXKMWHPZ")
public final class Class50 {

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "e", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "g", descriptor = "Lclient!JZLLDEPM;")
	private Class2 aClass2_42;

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "I")
	private int anInt805 = 77;

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "b", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "c", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "d", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "f", descriptor = "Lclient!JZLLDEPM;")
	private Class2 aClass2_41 = new Class2();

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "<init>", descriptor = "(B)V")
	public Class50(@OriginalArg(0) byte arg0) {
		try {
			this.aClass2_41.aClass2_39 = this.aClass2_41;
			this.aClass2_41.aClass2_40 = this.aClass2_41;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("62519, " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "(Lclient!JZLLDEPM;)V")
	public void method566(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_40 != null) {
			arg0.method504();
		}
		arg0.aClass2_40 = this.aClass2_41.aClass2_40;
		arg0.aClass2_39 = this.aClass2_41;
		arg0.aClass2_40.aClass2_39 = arg0;
		arg0.aClass2_39.aClass2_40 = arg0;
	}

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "(BLclient!JZLLDEPM;)V")
	public void method567(@OriginalArg(1) Class2 arg0) {
		try {
			if (arg0.aClass2_40 != null) {
				arg0.method504();
			}
			arg0.aClass2_40 = this.aClass2_41;
			arg0.aClass2_39 = this.aClass2_41.aClass2_39;
			arg0.aClass2_40.aClass2_39 = arg0;
			arg0.aClass2_39.aClass2_40 = arg0;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("49711, " + 2 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "()Lclient!JZLLDEPM;")
	public Class2 method568() {
		@Pc(3) Class2 local3 = this.aClass2_41.aClass2_39;
		if (local3 == this.aClass2_41) {
			return null;
		} else {
			local3.method504();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "b", descriptor = "()Lclient!JZLLDEPM;")
	public Class2 method569() {
		@Pc(3) Class2 local3 = this.aClass2_41.aClass2_39;
		if (local3 == this.aClass2_41) {
			this.aClass2_42 = null;
			return null;
		} else {
			this.aClass2_42 = local3.aClass2_39;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "(I)Lclient!JZLLDEPM;")
	public Class2 method570() {
		try {
			@Pc(11) Class2 local11 = this.aClass2_41.aClass2_40;
			if (local11 == this.aClass2_41) {
				this.aClass2_42 = null;
				return null;
			} else {
				this.aClass2_42 = local11.aClass2_40;
				return local11;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("91452, " + -120 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "b", descriptor = "(I)Lclient!JZLLDEPM;")
	public Class2 method571() {
		try {
			@Pc(8) Class2 local8 = this.aClass2_42;
			if (local8 == this.aClass2_41) {
				this.aClass2_42 = null;
				return null;
			} else {
				this.aClass2_42 = local8.aClass2_39;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("78340, " + 4 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "a", descriptor = "(Z)Lclient!JZLLDEPM;")
	public Class2 method572() {
		try {
			@Pc(2) Class2 local2 = this.aClass2_42;
			if (local2 == this.aClass2_41) {
				this.aClass2_42 = null;
				return null;
			} else {
				this.aClass2_42 = local2.aClass2_40;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("79578, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXKMWHPZ", name = "c", descriptor = "()V")
	public void method573() {
		if (this.aClass2_41.aClass2_39 == this.aClass2_41) {
			return;
		}
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_41.aClass2_39;
			if (local10 == this.aClass2_41) {
				return;
			}
			local10.method504();
		}
	}
}

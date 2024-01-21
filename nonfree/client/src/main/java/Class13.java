import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FYVRCFGT")
public final class Class13 {

	@OriginalMember(owner = "client!FYVRCFGT", name = "d", descriptor = "Lclient!NQPZRHXK;")
	private Class6 aClass6_18;

	@OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "I")
	private int anInt238 = 14733;

	@OriginalMember(owner = "client!FYVRCFGT", name = "b", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!FYVRCFGT", name = "c", descriptor = "Lclient!NQPZRHXK;")
	private Class6 aClass6_17 = new Class6();

	@OriginalMember(owner = "client!FYVRCFGT", name = "<init>", descriptor = "(Z)V")
	public Class13(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass6_17.aClass6_41 = this.aClass6_17;
			this.aClass6_17.aClass6_42 = this.aClass6_17;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("15669, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "(Lclient!NQPZRHXK;)V")
	public void method110(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_42 != null) {
			arg0.method545();
		}
		arg0.aClass6_42 = this.aClass6_17.aClass6_42;
		arg0.aClass6_41 = this.aClass6_17;
		arg0.aClass6_42.aClass6_41 = arg0;
		arg0.aClass6_41.aClass6_42 = arg0;
	}

	@OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "(Lclient!NQPZRHXK;I)V")
	public void method111(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.aClass6_42 != null) {
				arg0.method545();
			}
			arg0.aClass6_42 = this.aClass6_17;
			arg0.aClass6_41 = this.aClass6_17.aClass6_41;
			arg0.aClass6_42.aClass6_41 = arg0;
			arg0.aClass6_41.aClass6_42 = arg0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("81403, " + arg0 + ", " + 8919 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "()Lclient!NQPZRHXK;")
	public Class6 method112() {
		@Pc(3) Class6 local3 = this.aClass6_17.aClass6_41;
		if (local3 == this.aClass6_17) {
			return null;
		} else {
			local3.method545();
			return local3;
		}
	}

	@OriginalMember(owner = "client!FYVRCFGT", name = "b", descriptor = "()Lclient!NQPZRHXK;")
	public Class6 method113() {
		@Pc(3) Class6 local3 = this.aClass6_17.aClass6_41;
		if (local3 == this.aClass6_17) {
			this.aClass6_18 = null;
			return null;
		} else {
			this.aClass6_18 = local3.aClass6_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "(B)Lclient!NQPZRHXK;")
	public Class6 method114() {
		try {
			@Pc(3) Class6 local3 = this.aClass6_17.aClass6_42;
			if (local3 == this.aClass6_17) {
				this.aClass6_18 = null;
				return null;
			} else {
				this.aClass6_18 = local3.aClass6_42;
				return local3;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("23053, " + 3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FYVRCFGT", name = "a", descriptor = "(I)Lclient!NQPZRHXK;")
	public Class6 method115() {
		try {
			@Pc(2) Class6 local2 = this.aClass6_18;
			if (local2 == this.aClass6_17) {
				this.aClass6_18 = null;
				return null;
			} else {
				this.aClass6_18 = local2.aClass6_41;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("34531, " + 8 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FYVRCFGT", name = "b", descriptor = "(B)Lclient!NQPZRHXK;")
	public Class6 method116(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class6 local2 = this.aClass6_18;
			if (local2 == this.aClass6_17) {
				this.aClass6_18 = null;
				return null;
			} else {
				this.aClass6_18 = local2.aClass6_42;
				@Pc(20) boolean local20 = false;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("70474, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FYVRCFGT", name = "c", descriptor = "()V")
	public void method117() {
		if (this.aClass6_17.aClass6_41 == this.aClass6_17) {
			return;
		}
		while (true) {
			@Pc(10) Class6 local10 = this.aClass6_17.aClass6_41;
			if (local10 == this.aClass6_17) {
				return;
			}
			local10.method545();
		}
	}
}

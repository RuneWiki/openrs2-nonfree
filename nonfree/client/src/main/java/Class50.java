import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZWZXPJNQ")
public final class Class50 {

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "e", descriptor = "Lclient!OYTUMBCI;")
	private Class3 aClass3_42;

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "a", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "b", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "c", descriptor = "I")
	private int anInt822 = 708;

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "d", descriptor = "Lclient!OYTUMBCI;")
	private Class3 aClass3_41 = new Class3();

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "<init>", descriptor = "(I)V")
	public Class50(@OriginalArg(0) int arg0) {
		try {
			this.aClass3_41.aClass3_39 = this.aClass3_41;
			this.aClass3_41.aClass3_40 = this.aClass3_41;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("54424, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "a", descriptor = "(Lclient!OYTUMBCI;)V")
	public void method568(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_40 != null) {
			arg0.method559();
		}
		arg0.aClass3_40 = this.aClass3_41.aClass3_40;
		arg0.aClass3_39 = this.aClass3_41;
		arg0.aClass3_40.aClass3_39 = arg0;
		arg0.aClass3_39.aClass3_40 = arg0;
	}

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "a", descriptor = "(ILclient!OYTUMBCI;)V")
	public void method569(@OriginalArg(1) Class3 arg0) {
		try {
			if (arg0.aClass3_40 != null) {
				arg0.method559();
			}
			arg0.aClass3_40 = this.aClass3_41;
			arg0.aClass3_39 = this.aClass3_41.aClass3_39;
			arg0.aClass3_40.aClass3_39 = arg0;
			arg0.aClass3_39.aClass3_40 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("98216, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "a", descriptor = "()Lclient!OYTUMBCI;")
	public Class3 method570() {
		@Pc(3) Class3 local3 = this.aClass3_41.aClass3_39;
		if (local3 == this.aClass3_41) {
			return null;
		} else {
			local3.method559();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "b", descriptor = "()Lclient!OYTUMBCI;")
	public Class3 method571() {
		@Pc(3) Class3 local3 = this.aClass3_41.aClass3_39;
		if (local3 == this.aClass3_41) {
			this.aClass3_42 = null;
			return null;
		} else {
			this.aClass3_42 = local3.aClass3_39;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "a", descriptor = "(I)Lclient!OYTUMBCI;")
	public Class3 method572() {
		try {
			@Pc(5) Class3 local5 = this.aClass3_41.aClass3_40;
			if (local5 == this.aClass3_41) {
				this.aClass3_42 = null;
				return null;
			} else {
				this.aClass3_42 = local5.aClass3_40;
				return local5;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("54491, " + -402 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "a", descriptor = "(B)Lclient!OYTUMBCI;")
	public Class3 method573(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) Class3 local18 = this.aClass3_42;
			if (local18 == this.aClass3_41) {
				this.aClass3_42 = null;
				return null;
			} else {
				this.aClass3_42 = local18.aClass3_39;
				return local18;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("15890, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "b", descriptor = "(B)Lclient!OYTUMBCI;")
	public Class3 method574() {
		try {
			@Pc(2) Class3 local2 = this.aClass3_42;
			if (local2 == this.aClass3_41) {
				this.aClass3_42 = null;
				return null;
			} else {
				this.aClass3_42 = local2.aClass3_40;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("96384, " + 18 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWZXPJNQ", name = "c", descriptor = "()V")
	public void method575() {
		if (this.aClass3_41.aClass3_39 == this.aClass3_41) {
			return;
		}
		while (true) {
			@Pc(10) Class3 local10 = this.aClass3_41.aClass3_39;
			if (local10 == this.aClass3_41) {
				return;
			}
			local10.method559();
		}
	}
}

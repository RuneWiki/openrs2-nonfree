import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TOAGRHDF")
public final class Class41 {

	@OriginalMember(owner = "client!TOAGRHDF", name = "e", descriptor = "Lclient!IZSDUVJF;")
	private Class5_Sub1 aClass5_Sub1_29;

	@OriginalMember(owner = "client!TOAGRHDF", name = "a", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!TOAGRHDF", name = "b", descriptor = "I")
	private int anInt591 = 831;

	@OriginalMember(owner = "client!TOAGRHDF", name = "c", descriptor = "I")
	private int anInt592 = -34;

	@OriginalMember(owner = "client!TOAGRHDF", name = "d", descriptor = "Lclient!IZSDUVJF;")
	private Class5_Sub1 aClass5_Sub1_28 = new Class5_Sub1();

	@OriginalMember(owner = "client!TOAGRHDF", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			this.aClass5_Sub1_28.aClass5_Sub1_36 = this.aClass5_Sub1_28;
			this.aClass5_Sub1_28.aClass5_Sub1_37 = this.aClass5_Sub1_28;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("17667, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TOAGRHDF", name = "a", descriptor = "(Lclient!IZSDUVJF;)V")
	public void method291(@OriginalArg(0) Class5_Sub1 arg0) {
		if (arg0.aClass5_Sub1_37 != null) {
			arg0.method424();
		}
		arg0.aClass5_Sub1_37 = this.aClass5_Sub1_28.aClass5_Sub1_37;
		arg0.aClass5_Sub1_36 = this.aClass5_Sub1_28;
		arg0.aClass5_Sub1_37.aClass5_Sub1_36 = arg0;
		arg0.aClass5_Sub1_36.aClass5_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!TOAGRHDF", name = "a", descriptor = "()Lclient!IZSDUVJF;")
	public Class5_Sub1 method292() {
		@Pc(3) Class5_Sub1 local3 = this.aClass5_Sub1_28.aClass5_Sub1_36;
		if (local3 == this.aClass5_Sub1_28) {
			return null;
		} else {
			local3.method424();
			return local3;
		}
	}

	@OriginalMember(owner = "client!TOAGRHDF", name = "b", descriptor = "()Lclient!IZSDUVJF;")
	public Class5_Sub1 method293() {
		@Pc(3) Class5_Sub1 local3 = this.aClass5_Sub1_28.aClass5_Sub1_36;
		if (local3 == this.aClass5_Sub1_28) {
			this.aClass5_Sub1_29 = null;
			return null;
		} else {
			this.aClass5_Sub1_29 = local3.aClass5_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!TOAGRHDF", name = "a", descriptor = "(I)Lclient!IZSDUVJF;")
	public Class5_Sub1 method294(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class5_Sub1 local2 = this.aClass5_Sub1_29;
			if (arg0 <= 0) {
				this.anInt592 = -329;
			}
			if (local2 == this.aClass5_Sub1_28) {
				this.aClass5_Sub1_29 = null;
				return null;
			} else {
				this.aClass5_Sub1_29 = local2.aClass5_Sub1_36;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("77709, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TOAGRHDF", name = "c", descriptor = "()I")
	public int method295() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class5_Sub1 local5 = this.aClass5_Sub1_28.aClass5_Sub1_36; local5 != this.aClass5_Sub1_28; local5 = local5.aClass5_Sub1_36) {
			local1++;
		}
		return local1;
	}
}

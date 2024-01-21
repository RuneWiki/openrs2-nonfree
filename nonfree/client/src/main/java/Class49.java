import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZLISRGEK")
public final class Class49 {

	@OriginalMember(owner = "client!ZLISRGEK", name = "a", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!ZLISRGEK", name = "f", descriptor = "Lclient!DRKSBDQX;")
	private Class3_Sub1 aClass3_Sub1_37;

	@OriginalMember(owner = "client!ZLISRGEK", name = "b", descriptor = "I")
	private int anInt820 = 1;

	@OriginalMember(owner = "client!ZLISRGEK", name = "c", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!ZLISRGEK", name = "d", descriptor = "I")
	private int anInt821 = 36177;

	@OriginalMember(owner = "client!ZLISRGEK", name = "e", descriptor = "Lclient!DRKSBDQX;")
	private Class3_Sub1 aClass3_Sub1_36 = new Class3_Sub1();

	@OriginalMember(owner = "client!ZLISRGEK", name = "<init>", descriptor = "(I)V")
	public Class49(@OriginalArg(0) int arg0) {
		try {
			this.aClass3_Sub1_36.aClass3_Sub1_34 = this.aClass3_Sub1_36;
			this.aClass3_Sub1_36.aClass3_Sub1_35 = this.aClass3_Sub1_36;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("85641, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLISRGEK", name = "a", descriptor = "(Lclient!DRKSBDQX;)V")
	public void method563(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_35 != null) {
			arg0.method560();
		}
		arg0.aClass3_Sub1_35 = this.aClass3_Sub1_36.aClass3_Sub1_35;
		arg0.aClass3_Sub1_34 = this.aClass3_Sub1_36;
		arg0.aClass3_Sub1_35.aClass3_Sub1_34 = arg0;
		arg0.aClass3_Sub1_34.aClass3_Sub1_35 = arg0;
	}

	@OriginalMember(owner = "client!ZLISRGEK", name = "a", descriptor = "()Lclient!DRKSBDQX;")
	public Class3_Sub1 method564() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_36.aClass3_Sub1_34;
		if (local3 == this.aClass3_Sub1_36) {
			return null;
		} else {
			local3.method560();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZLISRGEK", name = "b", descriptor = "()Lclient!DRKSBDQX;")
	public Class3_Sub1 method565() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_36.aClass3_Sub1_34;
		if (local3 == this.aClass3_Sub1_36) {
			this.aClass3_Sub1_37 = null;
			return null;
		} else {
			this.aClass3_Sub1_37 = local3.aClass3_Sub1_34;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZLISRGEK", name = "a", descriptor = "(B)Lclient!DRKSBDQX;")
	public Class3_Sub1 method566(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_37;
			if (local2 == this.aClass3_Sub1_36) {
				this.aClass3_Sub1_37 = null;
				return null;
			} else {
				this.aClass3_Sub1_37 = local2.aClass3_Sub1_34;
				@Pc(20) boolean local20 = false;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("17425, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLISRGEK", name = "c", descriptor = "()I")
	public int method567() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_36.aClass3_Sub1_34; local5 != this.aClass3_Sub1_36; local5 = local5.aClass3_Sub1_34) {
			local1++;
		}
		return local1;
	}
}

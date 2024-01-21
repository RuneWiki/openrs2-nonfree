import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NAZXUZWI")
public final class Class27 {

	@OriginalMember(owner = "client!NAZXUZWI", name = "e", descriptor = "Lclient!RZDMTEAZ;")
	private Class4_Sub1 aClass4_Sub1_22;

	@OriginalMember(owner = "client!NAZXUZWI", name = "a", descriptor = "I")
	private int anInt420 = 35;

	@OriginalMember(owner = "client!NAZXUZWI", name = "b", descriptor = "I")
	private int anInt421 = 41;

	@OriginalMember(owner = "client!NAZXUZWI", name = "c", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!NAZXUZWI", name = "d", descriptor = "Lclient!RZDMTEAZ;")
	private Class4_Sub1 aClass4_Sub1_21 = new Class4_Sub1();

	@OriginalMember(owner = "client!NAZXUZWI", name = "<init>", descriptor = "(I)V")
	public Class27(@OriginalArg(0) int arg0) {
		try {
			this.aClass4_Sub1_21.aClass4_Sub1_35 = this.aClass4_Sub1_21;
			this.aClass4_Sub1_21.aClass4_Sub1_36 = this.aClass4_Sub1_21;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("85548, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NAZXUZWI", name = "a", descriptor = "(Lclient!RZDMTEAZ;)V")
	public void method313(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_36 != null) {
			arg0.method557();
		}
		arg0.aClass4_Sub1_36 = this.aClass4_Sub1_21.aClass4_Sub1_36;
		arg0.aClass4_Sub1_35 = this.aClass4_Sub1_21;
		arg0.aClass4_Sub1_36.aClass4_Sub1_35 = arg0;
		arg0.aClass4_Sub1_35.aClass4_Sub1_36 = arg0;
	}

	@OriginalMember(owner = "client!NAZXUZWI", name = "a", descriptor = "()Lclient!RZDMTEAZ;")
	public Class4_Sub1 method314() {
		@Pc(3) Class4_Sub1 local3 = this.aClass4_Sub1_21.aClass4_Sub1_35;
		if (local3 == this.aClass4_Sub1_21) {
			return null;
		} else {
			local3.method557();
			return local3;
		}
	}

	@OriginalMember(owner = "client!NAZXUZWI", name = "b", descriptor = "()Lclient!RZDMTEAZ;")
	public Class4_Sub1 method315() {
		@Pc(3) Class4_Sub1 local3 = this.aClass4_Sub1_21.aClass4_Sub1_35;
		if (local3 == this.aClass4_Sub1_21) {
			this.aClass4_Sub1_22 = null;
			return null;
		} else {
			this.aClass4_Sub1_22 = local3.aClass4_Sub1_35;
			return local3;
		}
	}

	@OriginalMember(owner = "client!NAZXUZWI", name = "a", descriptor = "(I)Lclient!RZDMTEAZ;")
	public Class4_Sub1 method316() {
		try {
			@Pc(8) Class4_Sub1 local8 = this.aClass4_Sub1_22;
			if (local8 == this.aClass4_Sub1_21) {
				this.aClass4_Sub1_22 = null;
				return null;
			} else {
				this.aClass4_Sub1_22 = local8.aClass4_Sub1_35;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("55519, " + 15175 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NAZXUZWI", name = "c", descriptor = "()I")
	public int method317() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class4_Sub1 local5 = this.aClass4_Sub1_21.aClass4_Sub1_35; local5 != this.aClass4_Sub1_21; local5 = local5.aClass4_Sub1_35) {
			local1++;
		}
		return local1;
	}
}

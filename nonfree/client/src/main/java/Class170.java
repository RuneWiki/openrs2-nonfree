import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class170 {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "[B")
	public static final byte[] aByteArray70 = new byte[32896];

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!bk;")
	private Class1_Sub6 aClass1_Sub6_37;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!bk;")
	private final Class1_Sub6 aClass1_Sub6_36 = new Class1_Sub6();

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray70[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class170() {
		this.aClass1_Sub6_36.aClass1_Sub6_54 = this.aClass1_Sub6_36;
		this.aClass1_Sub6_36.aClass1_Sub6_53 = this.aClass1_Sub6_36;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)Lclient!bk;")
	public Class1_Sub6 method3684() {
		@Pc(12) Class1_Sub6 local12 = this.aClass1_Sub6_36.aClass1_Sub6_54;
		if (local12 == this.aClass1_Sub6_36) {
			return null;
		} else {
			local12.method5580();
			return local12;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Lclient!bk;")
	public Class1_Sub6 method3685() {
		@Pc(7) Class1_Sub6 local7 = this.aClass1_Sub6_36.aClass1_Sub6_54;
		if (this.aClass1_Sub6_36 == local7) {
			this.aClass1_Sub6_37 = null;
			return null;
		} else {
			this.aClass1_Sub6_37 = local7.aClass1_Sub6_54;
			return local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public void method3686() {
		while (true) {
			@Pc(12) Class1_Sub6 local12 = this.aClass1_Sub6_36.aClass1_Sub6_54;
			if (local12 == this.aClass1_Sub6_36) {
				this.aClass1_Sub6_37 = null;
				return;
			}
			local12.method5580();
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)I")
	public int method3687() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub6 local11 = this.aClass1_Sub6_36.aClass1_Sub6_54;
		while (this.aClass1_Sub6_36 != local11) {
			local11 = local11.aClass1_Sub6_54;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!bk;")
	public Class1_Sub6 method3688() {
		@Pc(14) Class1_Sub6 local14 = this.aClass1_Sub6_37;
		if (local14 == this.aClass1_Sub6_36) {
			this.aClass1_Sub6_37 = null;
			return null;
		} else {
			this.aClass1_Sub6_37 = local14.aClass1_Sub6_54;
			return local14;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!bk;)V")
	public void method3690(@OriginalArg(1) Class1_Sub6 arg0) {
		if (arg0.aClass1_Sub6_53 != null) {
			arg0.method5580();
		}
		arg0.aClass1_Sub6_53 = this.aClass1_Sub6_36.aClass1_Sub6_53;
		arg0.aClass1_Sub6_54 = this.aClass1_Sub6_36;
		arg0.aClass1_Sub6_53.aClass1_Sub6_54 = arg0;
		arg0.aClass1_Sub6_54.aClass1_Sub6_53 = arg0;
	}
}

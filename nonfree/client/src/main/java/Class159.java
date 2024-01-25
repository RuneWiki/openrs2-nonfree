import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class159 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "[I")
	public static final int[] anIntArray428 = new int[256];

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!ra;")
	private Class1_Sub4 aClass1_Sub4_46;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!ra;")
	private final Class1_Sub4 aClass1_Sub4_45 = new Class1_Sub4();

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray428[local10] = local13;
		}
		new Class34(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public Class159() {
		this.aClass1_Sub4_45.aClass1_Sub4_61 = this.aClass1_Sub4_45;
		this.aClass1_Sub4_45.aClass1_Sub4_62 = this.aClass1_Sub4_45;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public void method4255() {
		while (true) {
			@Pc(5) Class1_Sub4 local5 = this.aClass1_Sub4_45.aClass1_Sub4_61;
			if (this.aClass1_Sub4_45 == local5) {
				this.aClass1_Sub4_46 = null;
				return;
			}
			local5.method5632();
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)I")
	public int method4256() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class1_Sub4 local11 = this.aClass1_Sub4_45.aClass1_Sub4_61; local11 != this.aClass1_Sub4_45; local11 = local11.aClass1_Sub4_61) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)Lclient!ra;")
	public Class1_Sub4 method4257() {
		@Pc(14) Class1_Sub4 local14 = this.aClass1_Sub4_46;
		if (local14 == this.aClass1_Sub4_45) {
			this.aClass1_Sub4_46 = null;
			return null;
		} else {
			this.aClass1_Sub4_46 = local14.aClass1_Sub4_61;
			return local14;
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Lclient!ra;")
	public Class1_Sub4 method4258() {
		@Pc(7) Class1_Sub4 local7 = this.aClass1_Sub4_45.aClass1_Sub4_61;
		if (this.aClass1_Sub4_45 == local7) {
			return null;
		} else {
			local7.method5632();
			return local7;
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)Lclient!ra;")
	public Class1_Sub4 method4261() {
		@Pc(12) Class1_Sub4 local12 = this.aClass1_Sub4_45.aClass1_Sub4_61;
		if (this.aClass1_Sub4_45 == local12) {
			this.aClass1_Sub4_46 = null;
			return null;
		} else {
			this.aClass1_Sub4_46 = local12.aClass1_Sub4_61;
			return local12;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!ra;)V")
	public void method4262(@OriginalArg(1) Class1_Sub4 arg0) {
		if (arg0.aClass1_Sub4_62 != null) {
			arg0.method5632();
		}
		arg0.aClass1_Sub4_61 = this.aClass1_Sub4_45;
		arg0.aClass1_Sub4_62 = this.aClass1_Sub4_45.aClass1_Sub4_62;
		arg0.aClass1_Sub4_62.aClass1_Sub4_61 = arg0;
		arg0.aClass1_Sub4_61.aClass1_Sub4_62 = arg0;
	}
}

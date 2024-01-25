import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class131 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "J")
	private long aLong126;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!wa;")
	private Class4_Sub4 aClass4_Sub4_30;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	private final int anInt4117;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "[Lclient!wa;")
	private final Class4_Sub4[] aClass4_Sub4Array1;

	static {
		new Class159(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	public Class131(@OriginalArg(0) int arg0) {
		this.anInt4117 = arg0;
		this.aClass4_Sub4Array1 = new Class4_Sub4[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub4 local20 = this.aClass4_Sub4Array1[local10] = new Class4_Sub4();
			local20.aClass4_Sub4_62 = local20;
			local20.aClass4_Sub4_61 = local20;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJLclient!wa;)V")
	public void method3722(@OriginalArg(1) long arg0, @OriginalArg(2) Class4_Sub4 arg1) {
		if (arg1.aClass4_Sub4_62 != null) {
			arg1.method5678();
		}
		@Pc(21) Class4_Sub4 local21 = this.aClass4_Sub4Array1[(int) (arg0 & (long) (this.anInt4117 - 1))];
		arg1.aClass4_Sub4_62 = local21.aClass4_Sub4_62;
		arg1.aClass4_Sub4_61 = local21;
		arg1.aClass4_Sub4_62.aClass4_Sub4_61 = arg1;
		arg1.aLong222 = arg0;
		arg1.aClass4_Sub4_61.aClass4_Sub4_62 = arg1;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lclient!wa;")
	public Class4_Sub4 method3723() {
		if (this.aClass4_Sub4_30 == null) {
			return null;
		}
		@Pc(23) Class4_Sub4 local23 = this.aClass4_Sub4Array1[(int) (this.aLong126 & (long) (this.anInt4117 - 1))];
		while (this.aClass4_Sub4_30 != local23) {
			if (this.aLong126 == this.aClass4_Sub4_30.aLong222) {
				@Pc(39) Class4_Sub4 local39 = this.aClass4_Sub4_30;
				this.aClass4_Sub4_30 = this.aClass4_Sub4_30.aClass4_Sub4_61;
				return local39;
			}
			this.aClass4_Sub4_30 = this.aClass4_Sub4_30.aClass4_Sub4_61;
		}
		this.aClass4_Sub4_30 = null;
		return null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJ)Lclient!wa;")
	public Class4_Sub4 method3724(@OriginalArg(1) long arg0) {
		this.aLong126 = arg0;
		@Pc(25) Class4_Sub4 local25 = this.aClass4_Sub4Array1[(int) ((long) (this.anInt4117 - 1) & arg0)];
		for (this.aClass4_Sub4_30 = local25.aClass4_Sub4_61; this.aClass4_Sub4_30 != local25; this.aClass4_Sub4_30 = this.aClass4_Sub4_30.aClass4_Sub4_61) {
			if (arg0 == this.aClass4_Sub4_30.aLong222) {
				@Pc(44) Class4_Sub4 local44 = this.aClass4_Sub4_30;
				this.aClass4_Sub4_30 = this.aClass4_Sub4_30.aClass4_Sub4_61;
				return local44;
			}
		}
		this.aClass4_Sub4_30 = null;
		return null;
	}
}

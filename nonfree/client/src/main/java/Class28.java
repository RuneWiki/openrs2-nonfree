import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class28 {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!ec;")
	private Class4 aClass4_49;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "Lclient!ec;")
	private Class4 aClass4_50;

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
	private int anInt1139 = 0;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "[Lclient!ec;")
	private final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
	private final int anInt1136;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
	public Class28(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt1136 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_128 = local23;
			local23.aClass4_127 = local23;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BJ)Lclient!ec;")
	public Class4 method770(@OriginalArg(1) long arg0) {
		this.aLong43 = arg0;
		@Pc(14) Class4 local14 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt1136 - 1))];
		for (this.aClass4_49 = local14.aClass4_127; this.aClass4_49 != local14; this.aClass4_49 = this.aClass4_49.aClass4_127) {
			if (arg0 == this.aClass4_49.aLong99) {
				@Pc(44) Class4 local44 = this.aClass4_49;
				this.aClass4_49 = this.aClass4_49.aClass4_127;
				return local44;
			}
		}
		this.aClass4_49 = null;
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lclient!ec;")
	public Class4 method771() {
		@Pc(20) Class4 local20;
		if (this.anInt1139 > 0 && this.aClass4Array1[this.anInt1139 - 1] != this.aClass4_50) {
			local20 = this.aClass4_50;
			this.aClass4_50 = local20.aClass4_127;
			return local20;
		}
		while (this.anInt1136 > this.anInt1139) {
			local20 = this.aClass4Array1[this.anInt1139++].aClass4_127;
			if (local20 != this.aClass4Array1[this.anInt1139 - 1]) {
				this.aClass4_50 = local20.aClass4_127;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Lclient!ec;")
	public Class4 method773() {
		if (this.aClass4_49 == null) {
			return null;
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) (this.aLong43 & (long) (this.anInt1136 - 1))];
		while (local21 != this.aClass4_49) {
			if (this.aClass4_49.aLong99 == this.aLong43) {
				@Pc(39) Class4 local39 = this.aClass4_49;
				this.aClass4_49 = this.aClass4_49.aClass4_127;
				return local39;
			}
			this.aClass4_49 = this.aClass4_49.aClass4_127;
		}
		this.aClass4_49 = null;
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(JLclient!ec;I)V")
	public void method774(@OriginalArg(0) long arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_128 != null) {
			arg1.method2004();
		}
		@Pc(27) Class4 local27 = this.aClass4Array1[(int) ((long) (this.anInt1136 - 1) & arg0)];
		arg1.aClass4_128 = local27.aClass4_128;
		arg1.aLong99 = arg0;
		arg1.aClass4_127 = local27;
		arg1.aClass4_128.aClass4_127 = arg1;
		arg1.aClass4_127.aClass4_128 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Lclient!ec;")
	public Class4 method775() {
		this.anInt1139 = 0;
		return this.method771();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class268 {

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Lclient!tm;")
	private Class6_Sub5 aClass6_Sub5_63;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
	private final int anInt8100;

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "[Lclient!tm;")
	private final Class6_Sub5[] aClass6_Sub5Array1;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(I)V")
	public Class268(@OriginalArg(0) int arg0) {
		this.anInt8100 = arg0;
		this.aClass6_Sub5Array1 = new Class6_Sub5[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub5 local20 = this.aClass6_Sub5Array1[local10] = new Class6_Sub5();
			local20.aClass6_Sub5_66 = local20;
			local20.aClass6_Sub5_67 = local20;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLclient!tm;J)V")
	public void method6816(@OriginalArg(1) Class6_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass6_Sub5_67 != null) {
			arg0.method7748();
		}
		@Pc(21) Class6_Sub5 local21 = this.aClass6_Sub5Array1[(int) ((long) (this.anInt8100 - 1) & arg1)];
		arg0.aClass6_Sub5_66 = local21;
		arg0.aClass6_Sub5_67 = local21.aClass6_Sub5_67;
		arg0.aClass6_Sub5_67.aClass6_Sub5_66 = arg0;
		arg0.aClass6_Sub5_66.aClass6_Sub5_67 = arg0;
		arg0.aLong254 = arg1;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(JB)Lclient!tm;")
	public Class6_Sub5 method6820(@OriginalArg(0) long arg0) {
		this.aLong218 = arg0;
		@Pc(20) Class6_Sub5 local20 = this.aClass6_Sub5Array1[(int) (arg0 & (long) (this.anInt8100 - 1))];
		for (this.aClass6_Sub5_63 = local20.aClass6_Sub5_66; this.aClass6_Sub5_63 != local20; this.aClass6_Sub5_63 = this.aClass6_Sub5_63.aClass6_Sub5_66) {
			if (this.aClass6_Sub5_63.aLong254 == arg0) {
				@Pc(47) Class6_Sub5 local47 = this.aClass6_Sub5_63;
				this.aClass6_Sub5_63 = this.aClass6_Sub5_63.aClass6_Sub5_66;
				return local47;
			}
		}
		this.aClass6_Sub5_63 = null;
		return null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)Lclient!tm;")
	public Class6_Sub5 method6821() {
		if (this.aClass6_Sub5_63 == null) {
			return null;
		}
		@Pc(28) Class6_Sub5 local28 = this.aClass6_Sub5Array1[(int) ((long) (this.anInt8100 - 1) & this.aLong218)];
		while (local28 != this.aClass6_Sub5_63) {
			if (this.aLong218 == this.aClass6_Sub5_63.aLong254) {
				@Pc(40) Class6_Sub5 local40 = this.aClass6_Sub5_63;
				this.aClass6_Sub5_63 = this.aClass6_Sub5_63.aClass6_Sub5_66;
				return local40;
			}
			this.aClass6_Sub5_63 = this.aClass6_Sub5_63.aClass6_Sub5_66;
		}
		this.aClass6_Sub5_63 = null;
		return null;
	}
}

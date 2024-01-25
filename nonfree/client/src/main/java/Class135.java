import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class135 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!bp;")
	private Class6_Sub1 aClass6_Sub1_29;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	private final int anInt3506;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "[Lclient!bp;")
	private final Class6_Sub1[] aClass6_Sub1Array1;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	public Class135(@OriginalArg(0) int arg0) {
		this.anInt3506 = arg0;
		this.aClass6_Sub1Array1 = new Class6_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub1 local20 = this.aClass6_Sub1Array1[local10] = new Class6_Sub1();
			local20.aClass6_Sub1_55 = local20;
			local20.aClass6_Sub1_56 = local20;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)Lclient!bp;")
	public Class6_Sub1 method3144(@OriginalArg(0) long arg0) {
		this.aLong105 = arg0;
		@Pc(25) Class6_Sub1 local25 = this.aClass6_Sub1Array1[(int) ((long) (this.anInt3506 - 1) & arg0)];
		for (this.aClass6_Sub1_29 = local25.aClass6_Sub1_56; this.aClass6_Sub1_29 != local25; this.aClass6_Sub1_29 = this.aClass6_Sub1_29.aClass6_Sub1_56) {
			if (arg0 == this.aClass6_Sub1_29.aLong218) {
				@Pc(44) Class6_Sub1 local44 = this.aClass6_Sub1_29;
				this.aClass6_Sub1_29 = this.aClass6_Sub1_29.aClass6_Sub1_56;
				return local44;
			}
		}
		this.aClass6_Sub1_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Lclient!bp;")
	public Class6_Sub1 method3147() {
		if (this.aClass6_Sub1_29 == null) {
			return null;
		}
		@Pc(23) Class6_Sub1 local23 = this.aClass6_Sub1Array1[(int) ((long) (this.anInt3506 - 1) & this.aLong105)];
		while (this.aClass6_Sub1_29 != local23) {
			if (this.aLong105 == this.aClass6_Sub1_29.aLong218) {
				@Pc(39) Class6_Sub1 local39 = this.aClass6_Sub1_29;
				this.aClass6_Sub1_29 = this.aClass6_Sub1_29.aClass6_Sub1_56;
				return local39;
			}
			this.aClass6_Sub1_29 = this.aClass6_Sub1_29.aClass6_Sub1_56;
		}
		this.aClass6_Sub1_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!bp;J)V")
	public void method3149(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass6_Sub1_55 != null) {
			arg0.method5984();
		}
		@Pc(21) Class6_Sub1 local21 = this.aClass6_Sub1Array1[(int) (arg1 & (long) (this.anInt3506 - 1))];
		arg0.aClass6_Sub1_56 = local21;
		arg0.aClass6_Sub1_55 = local21.aClass6_Sub1_55;
		arg0.aClass6_Sub1_55.aClass6_Sub1_56 = arg0;
		arg0.aLong218 = arg1;
		arg0.aClass6_Sub1_56.aClass6_Sub1_55 = arg0;
	}
}

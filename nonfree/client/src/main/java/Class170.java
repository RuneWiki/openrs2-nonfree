import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class170 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "Lclient!we;")
	private Class6_Sub2 aClass6_Sub2_42;

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "[Lclient!we;")
	private final Class6_Sub2[] aClass6_Sub2Array1;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
	private final int anInt5467;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V")
	public Class170(@OriginalArg(0) int arg0) {
		this.aClass6_Sub2Array1 = new Class6_Sub2[arg0];
		this.anInt5467 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[local10] = new Class6_Sub2();
			local20.aClass6_Sub2_66 = local20;
			local20.aClass6_Sub2_67 = local20;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(JZLclient!we;)V")
	public void method4877(@OriginalArg(0) long arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (arg1.aClass6_Sub2_67 != null) {
			arg1.method8754();
		}
		@Pc(21) Class6_Sub2 local21 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt5467 - 1) & arg0)];
		arg1.aClass6_Sub2_66 = local21;
		arg1.aClass6_Sub2_67 = local21.aClass6_Sub2_67;
		arg1.aClass6_Sub2_67.aClass6_Sub2_66 = arg1;
		arg1.aLong272 = arg0;
		arg1.aClass6_Sub2_66.aClass6_Sub2_67 = arg1;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(JI)Lclient!we;")
	public Class6_Sub2 method4878(@OriginalArg(0) long arg0) {
		this.aLong143 = arg0;
		@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt5467 - 1) & arg0)];
		for (this.aClass6_Sub2_42 = local20.aClass6_Sub2_66; this.aClass6_Sub2_42 != local20; this.aClass6_Sub2_42 = this.aClass6_Sub2_42.aClass6_Sub2_66) {
			if (this.aClass6_Sub2_42.aLong272 == arg0) {
				@Pc(39) Class6_Sub2 local39 = this.aClass6_Sub2_42;
				this.aClass6_Sub2_42 = this.aClass6_Sub2_42.aClass6_Sub2_66;
				return local39;
			}
		}
		this.aClass6_Sub2_42 = null;
		return null;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)Lclient!we;")
	public Class6_Sub2 method4880() {
		if (this.aClass6_Sub2_42 == null) {
			return null;
		}
		@Pc(23) Class6_Sub2 local23 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt5467 - 1) & this.aLong143)];
		while (local23 != this.aClass6_Sub2_42) {
			if (this.aClass6_Sub2_42.aLong272 == this.aLong143) {
				@Pc(39) Class6_Sub2 local39 = this.aClass6_Sub2_42;
				this.aClass6_Sub2_42 = this.aClass6_Sub2_42.aClass6_Sub2_66;
				return local39;
			}
			this.aClass6_Sub2_42 = this.aClass6_Sub2_42.aClass6_Sub2_66;
		}
		this.aClass6_Sub2_42 = null;
		return null;
	}
}

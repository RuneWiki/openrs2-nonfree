import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class40 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!bd;")
	private Class2 aClass2_49;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!bd;")
	private Class2 aClass2_50;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
	private int anInt1217 = 0;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	private final int anInt1208;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[Lclient!bd;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
	public Class40(@OriginalArg(0) int arg0) {
		this.anInt1208 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_128 = local23;
			local23.aClass2_127 = local23;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!bd;J)V")
	public void method849(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_128 != null) {
			arg0.method2053();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt1208 - 1) & arg1)];
		arg0.aClass2_127 = local21;
		arg0.aLong100 = arg1;
		arg0.aClass2_128 = local21.aClass2_128;
		arg0.aClass2_128.aClass2_127 = arg0;
		arg0.aClass2_127.aClass2_128 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Lclient!bd;")
	public Class2 method850() {
		if (this.aClass2_49 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (this.aLong40 & (long) (this.anInt1208 - 1))];
		while (this.aClass2_49 != local21) {
			if (this.aClass2_49.aLong100 == this.aLong40) {
				@Pc(42) Class2 local42 = this.aClass2_49;
				this.aClass2_49 = this.aClass2_49.aClass2_127;
				return local42;
			}
			this.aClass2_49 = this.aClass2_49.aClass2_127;
		}
		this.aClass2_49 = null;
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BJ)Lclient!bd;")
	public Class2 method851(@OriginalArg(1) long arg0) {
		this.aLong40 = arg0;
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt1208 - 1) & arg0)];
		for (this.aClass2_49 = local23.aClass2_127; this.aClass2_49 != local23; this.aClass2_49 = this.aClass2_49.aClass2_127) {
			if (arg0 == this.aClass2_49.aLong100) {
				@Pc(41) Class2 local41 = this.aClass2_49;
				this.aClass2_49 = this.aClass2_49.aClass2_127;
				return local41;
			}
		}
		this.aClass2_49 = null;
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Lclient!bd;")
	public Class2 method852() {
		@Pc(27) Class2 local27;
		if (this.anInt1217 > 0 && this.aClass2_50 != this.aClass2Array1[this.anInt1217 - 1]) {
			local27 = this.aClass2_50;
			this.aClass2_50 = local27.aClass2_127;
			return local27;
		}
		while (this.anInt1217 < this.anInt1208) {
			local27 = this.aClass2Array1[this.anInt1217++].aClass2_127;
			if (this.aClass2Array1[this.anInt1217 - 1] != local27) {
				this.aClass2_50 = local27.aClass2_127;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lclient!bd;")
	public Class2 method854() {
		this.anInt1217 = 0;
		return this.method852();
	}
}
